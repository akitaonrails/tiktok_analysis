package X;

import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinEmojiJsonConfig;
import com.ss.android.ugc.aweme.inbox.bulletin.setting.BulletinEventGameGeckoPreloadConfiguration;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinGeckoResourceModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS286S0000000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OTn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C620010OTn {
    public static final C620010OTn LIZ = new C620010OTn();
    public static volatile boolean LIZIZ;
    public static volatile C0ORH LIZJ;

    public static C0ORH LIZIZ() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        C0ORH c0orh = LIZJ;
        if (c0orh != null && Intrinsics.LJFF(c0orh.LIZ, curUserId)) {
            return c0orh;
        }
        C0ORH c0orh2 = new C0ORH(curUserId, false, null);
        LIZJ = c0orh2;
        return c0orh2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int LIZLLL(String str) {
        switch (str.hashCode()) {
            case -2147479645:
                if (!str.equals("Smileys & Emotion")) {
                    return R.raw.icon_clock;
                }
                return R.raw.icon_emoji;
            case -1859041700:
                if (!str.equals("Food & Drink")) {
                    return R.raw.icon_clock;
                }
                return R.raw.icon_cup;
            case -1488670166:
                if (!str.equals("Animals & Nature")) {
                    return R.raw.icon_clock;
                }
                return R.raw.icon_paw;
            case -975362268:
                if (!str.equals("Team flags")) {
                    return R.raw.icon_clock;
                }
                return R.raw.icon_trophy;
            case -387597364:
                if (!str.equals("Travel & Places")) {
                    return R.raw.icon_clock;
                }
                return R.raw.icon_map;
            case -252897267:
                if (!str.equals("Activities")) {
                    return R.raw.icon_clock;
                }
                return R.raw.icon_basketball;
            case -78785093:
                if (!str.equals("Symbols")) {
                    return R.raw.icon_clock;
                }
                return R.raw.icon_number;
            case 5004532:
                if (!str.equals("Objects")) {
                    return R.raw.icon_clock;
                }
                return R.raw.icon_bulb;
            case 1300126613:
                str.equals("Recently used");
                return R.raw.icon_clock;
            case 1770716173:
                if (!str.equals("People & Body")) {
                    return R.raw.icon_clock;
                }
                return R.raw.icon_thumbs_up;
            default:
                return R.raw.icon_clock;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String LJ(String str) {
        switch (str.hashCode()) {
            case -2147479645:
                if (!str.equals("Smileys & Emotion")) {
                    return "";
                }
                return C1618770sE7.LIZJ(2131828042);
            case -1859041700:
                if (!str.equals("Food & Drink")) {
                    return "";
                }
                return C1618770sE7.LIZJ(2131828044);
            case -1488670166:
                if (!str.equals("Animals & Nature")) {
                    return "";
                }
                return C1618770sE7.LIZJ(2131828043);
            case -975362268:
                if (!str.equals("Team flags")) {
                    return "";
                }
                return C1618770sE7.LIZJ(2131827992);
            case -387597364:
                if (!str.equals("Travel & Places")) {
                    return "";
                }
                return C1618770sE7.LIZJ(2131828046);
            case -252897267:
                if (!str.equals("Activities")) {
                    return "";
                }
                return C1618770sE7.LIZJ(2131828045);
            case -78785093:
                if (!str.equals("Symbols")) {
                    return "";
                }
                return C1618770sE7.LIZJ(2131828048);
            case 5004532:
                if (!str.equals("Objects")) {
                    return "";
                }
                return C1618770sE7.LIZJ(2131828047);
            case 1300126613:
                if (!str.equals("Recently used")) {
                    return "";
                }
                return C1618770sE7.LIZJ(2131828041);
            case 1770716173:
                if (!str.equals("People & Body")) {
                    return "";
                }
                return C1618770sE7.LIZJ(2131828049);
            default:
                return "";
        }
    }

    public static void LJFF(BulletinEmojiJsonConfig bulletinEmojiJsonConfig) {
        C0ORH c0orhLIZIZ = LIZIZ();
        LIZJ = new C0ORH(c0orhLIZIZ.LIZ, c0orhLIZIZ.LIZIZ, bulletinEmojiJsonConfig);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gecko store data: ");
        sbLIZ.append(bulletinEmojiJsonConfig);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZ(C0ORH c0orh, boolean z, boolean z2, LifecycleCoroutineScope lifecycleCoroutineScope, Context context) {
        List<BulletinGeckoResourceModel> list;
        if (z) {
            c0orh.LIZIZ = true;
            C23250099c.LIZLLL(lifecycleCoroutineScope, C0PEM.LIZJ, null, new C438520HHm(null), 2);
            if (context != null) {
                if (!C0C64.LJIILLIIL().LJIIIZ(31744, "enable_bulletin_dynamic_opt", true, true)) {
                    C0OPX.LJIIIZ("tryLoadBulletinGeckoChannels disabled");
                } else {
                    C0OPX.LJIIIZ("tryLoadBulletinGeckoChannels");
                    C364401bG.LIZIZ(C364401bG.LIZ("quick_create_sheet", "bg", C10UZ.LIZLLL(context)), lifecycleCoroutineScope, AFwS286S0000000_3.get$arr$(18));
                    LIZJ(lifecycleCoroutineScope, "tiktok_social_inbox_lynx", "pages/mobpage/template.js", AFwS240S0000000_9.get$arr$(912), AFwS240S0000000_9.get$arr$(913));
                }
            }
            C620030OTp.LIZ.getClass();
            BulletinEventGameGeckoPreloadConfiguration bulletinEventGameGeckoPreloadConfiguration = (BulletinEventGameGeckoPreloadConfiguration) C620030OTp.LIZJ.getValue();
            if (bulletinEventGameGeckoPreloadConfiguration != null && (list = bulletinEventGameGeckoPreloadConfiguration.preloadGeckoResourceModelList) != null) {
                Iterator<BulletinGeckoResourceModel> it2 = list.iterator();
                while (it2.hasNext()) {
                    C363301b5.LIZ(it2.next(), lifecycleCoroutineScope, Collections.singletonList(EnumC368901bz.IMAGE), C0PEM.LIZJ, new C2129808Wa(null));
                }
            }
        }
        if (z2 && C0C64.LJIILLIIL().LJIIIZ(31744, "bulletin_hybrid_predecode_setting", true, true)) {
            LIZIZ = true;
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it3 = ((Map) C0OUB.LIZIZ.getValue()).entrySet().iterator();
                while (it3.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it3.next()).getValue());
                }
                C01GW<C1537720q7O> c01gw = C1540620qC4.LJJJJIZL;
                C1536940q68 c1536940q68 = new C1536940q68();
                c1536940q68.LIZ = "social_inbox_lynx_biz";
                C679810QlX.LIZ(c1536940q68, arrayList, new InterfaceC679820QlY() { // from class: X.0OTo
                    @Override // X.InterfaceC679820QlY
                    public final void LIZ() {
                        C0OPX.LJII("onPreloadResult");
                    }
                }, null, 24);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public static void LIZJ(LifecycleCoroutineScope lifecycleCoroutineScope, String str, String str2, Function1 function1, Function1 function12) {
        C23250099c.LIZLLL(lifecycleCoroutineScope, C0PEM.LIZJ, null, new C438540HHo(str, str2, null, function1, function12), 2);
    }
}

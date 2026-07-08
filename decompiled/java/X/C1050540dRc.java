package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.commerce.BizAccount;
import com.ss.android.ugc.aweme.commerce.BrandedContent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.List;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0dRc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050540dRc {
    public static final C1050540dRc LIZ = new C1050540dRc();

    public static final boolean LIZ(String str) {
        List<String> enterFroms;
        BrandedContent brandedContent;
        BizAccount bizAccountLIZ = C0XEE.LIZ();
        if (bizAccountLIZ != null && (brandedContent = bizAccountLIZ.getBrandedContent()) != null) {
            enterFroms = brandedContent.getEnterFroms();
        } else {
            enterFroms = null;
        }
        if (enterFroms == null || enterFroms.isEmpty()) {
            return false;
        }
        Iterator<String> it2 = enterFroms.iterator();
        while (it2.hasNext()) {
            if (TextUtils.equals(str, it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static final String LIZIZ(long j) {
        if (1000 <= j && j < 10000) {
            BigDecimal bigDecimalDivide = new BigDecimal(j).divide(new BigDecimal(LSPassThroughRecordSizeConfig.DEFAULT), 1, RoundingMode.HALF_UP);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(bigDecimalDivide);
            sbLIZ.append('K');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return C1843500y4a.LIZIZ(j);
    }

    public static void LIZLLL(String str) {
        n nVarLJIILIIL;
        k kVarLJJIIZ;
        Boolean boolValueOf;
        if (str != null && str.length() != 0) {
            k kVar = GsonProtectorUtils.parse(new p(), str);
            if (kVar != null) {
                nVarLJIILIIL = kVar.LJIILIIL();
            } else {
                nVarLJIILIIL = null;
            }
            Gson gson = new Gson();
            if (nVarLJIILIIL != null) {
                kVarLJJIIZ = nVarLJIILIIL.LJJIIZ("gecko_channel");
            } else {
                kVarLJJIIZ = null;
            }
            List list = (List) GsonProtectorUtils.fromJson(gson, kVarLJJIIZ, new TypeToken<List<? extends String>>() { // from class: X.0dRU
            }.getType());
            if (list != null && !list.isEmpty()) {
                String accessKey = ((IMainService) ServiceManager.get().getService(IMainService.class)).getAccessKey();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("gecko_channel", (String) ListProtector.get(list, i));
                    C988570bpf.LIZ.getClass();
                    if (C1041070dCL.LIZIZ() != null) {
                        boolValueOf = Boolean.valueOf(C1552050qUV.LIZIZ(accessKey, (String) ListProtector.get(list, i)));
                    } else {
                        boolValueOf = null;
                    }
                    c2344009Gk.LJ(boolValueOf, "exists");
                    C20684815ws.LJIILLIIL("gecko_resource_exists", c2344009Gk.LIZ);
                }
            }
        }
    }

    public static void LJ(Context context) {
        String string;
        Activity activityLJFF = LJFF(context);
        if (activityLJFF != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLJFF);
            Resources resources = context.getResources();
            if (resources != null) {
                string = resources.getString(R.string.m25);
            } else {
                string = null;
            }
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LJIIJJI();
        }
    }

    public static Activity LJFF(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextThemeWrapper) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() instanceof Activity) {
                return (Activity) contextWrapper.getBaseContext();
            }
        }
        return C2214201BlK.LJFF();
    }

    public static void LIZJ(Aweme aweme, boolean z) {
        String aid;
        String str;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "video_play");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("item_id", aid);
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("remove_success", str);
        C20684815ws.LJIILLIIL("ttelite_BA_bctool_video_remove_tag", c2344009Gk.LIZ);
    }

    public static void LJI(Aweme aweme, String str, String str2, String str3, String str4, String str5) {
        String groupId;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", "tcm_comment");
        c2344009Gk.LJIIIIZZ("enter_from", str5);
        String authorUid = null;
        if (aweme != null) {
            groupId = aweme.getGroupId();
        } else {
            groupId = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", groupId);
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        c2344009Gk.LJIIIIZZ("is_ad_signal", str2);
        c2344009Gk.LJIIIIZZ("anchor_id", str3);
        c2344009Gk.LJIIIIZZ("anchor_type", str4);
        C698670Rar c698670Rar = C698670Rar.LIZ;
        boolean zLJIJI = u.LJIJI("multi_anchor_entrance_show", str, true);
        c698670Rar.getClass();
        C698670Rar.LIZ(c2344009Gk, aweme, str5, zLJIJI);
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }
}

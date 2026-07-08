package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.rank.RankListPageAccuracyCountDownSetting;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.android.livesdk.watch.OrientationChangeEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS130S1100000_16;

/* JADX INFO: renamed from: X.0esu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1105900esu {
    public static long LIZ;
    public static final boolean LIZIZ = RankListPageAccuracyCountDownSetting.INSTANCE.getValue();

    public static String LIZJ(int i) {
        switch (i) {
            case 100:
                return "D5";
            case 200:
                return "D4";
            case DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL /* 300 */:
                return "D3";
            case 400:
                return "D2";
            case 500:
                return "D1";
            case 600:
                return "C5";
            case OppoPermissionPopupMaskDelayExp.DEFAULT /* 700 */:
                return "C4";
            case 800:
                return "C3";
            case 900:
                return "C2";
            case LSPassThroughRecordSizeConfig.DEFAULT /* 1000 */:
                return "C1";
            case 1100:
                return "B5";
            case 1200:
                return "B4";
            case 1300:
                return "B3";
            case 1400:
                return "B2";
            case ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED /* 1500 */:
                return "B1";
            case 1600:
                return "A5";
            case 1700:
                return "A4";
            case 1800:
                return "A3";
            case 1900:
                return "A2";
            case 2000:
                return "A1";
            case 2100:
                return "S";
            default:
                return null;
        }
    }

    public static void LJI(List list) {
        if (list != null && (!list.isEmpty())) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    public static String LIZ(DataChannel dataChannel, String str) {
        long id;
        InterfaceC2262081DgM interfaceC2262081DgM;
        Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
        if (dataChannel != null && (interfaceC2262081DgM = (InterfaceC2262081DgM) dataChannel.gg0(C1132290fZT.class)) != null) {
            id = interfaceC2262081DgM.getId();
        } else {
            id = 0;
        }
        String strValueOf = String.valueOf(id);
        if (!TextUtils.isEmpty(strValueOf)) {
            builderBuildUpon.appendQueryParameter("userId", strValueOf);
        }
        builderBuildUpon.appendQueryParameter("use_simple_user", "true");
        builderBuildUpon.appendQueryParameter("enable_code_cache", "1");
        builderBuildUpon.appendQueryParameter("thread_strategy", "2");
        return builderBuildUpon.toString();
    }

    public static long LIZIZ(int i, long j, boolean z) {
        long jLongValue;
        long j2;
        if (LIZIZ && z) {
            Long l = C1085110eLN.LIZIZ.get(Integer.valueOf(i));
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
            if (jLongValue > 0 && jCurrentTimeMillis > 0) {
                j2 = j - (jCurrentTimeMillis / 1000);
            } else {
                j2 = j;
            }
            if (j2 > 0) {
                return j2;
            }
        }
        return j;
    }

    public static void LIZLLL(Context context, String str, String str2, boolean z, Map map) {
        if (!z) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, str);
        } else {
            ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, str, new AwS130S1100000_16(str2, (String) map, (Map<String, String>) 17));
        }
    }

    public static void LJ(DataChannel dataChannel, final String str, boolean z, final boolean z2, final String str2, final Map map) {
        Boolean bool;
        final Context applicationContext = GlobalContext.getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        if (!z) {
            LIZLLL(applicationContext, str, str2, z2, new LinkedHashMap());
            return;
        }
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.gg0(C0TZM.class);
        } else {
            bool = null;
        }
        if (C500260Jjc.LJJIJIL(bool)) {
            LIZLLL(applicationContext, str, str2, z2, map);
            return;
        }
        if (dataChannel != null) {
            dataChannel.FQ2(OrientationChangeEvent.class);
        }
        C11NZ.LJLJJLL(1000L, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C09JN() { // from class: X.0esv
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("RankViewUtils@faab.openPageUsingSchema$timer$1");
                boolean z3 = C1105900esu.LIZIZ;
                C1105900esu.LIZLLL(applicationContext, str, str2, z2, map);
                C1C7U.LIZIZ("RankViewUtils@faab.openPageUsingSchema$timer$1");
            }
        });
    }
}

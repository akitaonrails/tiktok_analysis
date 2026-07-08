package X;

import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.03Hi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C817603Hi {
    public static String LJFF;
    public boolean LIZ;
    public String LIZJ;
    public String LIZLLL;
    public final Map<String, String> LIZIZ = new LinkedHashMap();
    public final Map<String, Map<String, Object>> LJ = new LinkedHashMap();

    static {
        new C038N();
    }

    public final Map<String, Object> LJIIIZ() {
        if (((LinkedHashMap) this.LJ).get("ITEM_DETAILS") == null) {
            this.LJ.put("ITEM_DETAILS", LIZ("a2270.b93391"));
        }
        return (Map) ((LinkedHashMap) this.LJ).get("ITEM_DETAILS");
    }

    public final Map<String, Object> LJIIJ() {
        if (((LinkedHashMap) this.LJ).get("OSP_PAGE") == null) {
            this.LJ.put("OSP_PAGE", LIZ("a2270.b2768"));
        }
        return (Map) ((LinkedHashMap) this.LJ).get("OSP_PAGE");
    }

    public final Map<String, Object> LJIIJJI() {
        if (((LinkedHashMap) this.LJ).get("OSP_PLACE_ORDER") == null) {
            this.LJ.put("OSP_PLACE_ORDER", LIZ("c7497.d4784"));
        }
        return (Map) ((LinkedHashMap) this.LJ).get("OSP_PLACE_ORDER");
    }

    public static String LJFF(C817803Hk c817803Hk) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(c817803Hk.LIZ);
        Integer num = c817803Hk.LIZIZ;
        if (num != null) {
            int iIntValue = num.intValue();
            stringBuffer.append("_i");
            stringBuffer.append(iIntValue);
        }
        String str = c817803Hk.LIZJ;
        if (str != null) {
            stringBuffer.append("_");
            stringBuffer.append(str);
        }
        return stringBuffer.toString();
    }

    public static String LJI(C817803Hk c817803Hk) {
        int iIntValue;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(c817803Hk.LIZ);
        Integer num = c817803Hk.LIZIZ;
        if (num != null && (iIntValue = num.intValue()) != 0) {
            stringBuffer.append("_i");
            stringBuffer.append(iIntValue / 10000);
            stringBuffer.append("_i");
            stringBuffer.append((iIntValue / 100) % 10);
            stringBuffer.append("_i");
            stringBuffer.append(iIntValue % 10);
        }
        return stringBuffer.toString();
    }

    public final Map<String, Object> LIZ(String str) {
        return BtmSDK.createReportParams$default(BtmSDK.INSTANCE, str, PageFinder.via(this.LIZLLL), null, 4, null);
    }

    public final Map<String, Object> LIZIZ(C817803Hk c817803Hk) {
        return BtmSDK.createReportParams$default(BtmSDK.INSTANCE, LJFF(c817803Hk), PageFinder.via(this.LIZLLL), null, 4, null);
    }

    public final void LJIILIIL(Intent intent) {
        String stringExtra;
        try {
            stringExtra = intent.getStringExtra("source_btm_token");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        this.LIZJ = stringExtra;
    }

    public static String LIZLLL(C817603Hi c817603Hi, C817803Hk c817803Hk) {
        c817603Hi.getClass();
        String strLJFF = LJFF(c817803Hk);
        C21244318Bt c21244318Bt = new C21244318Bt();
        c21244318Bt.LIZ = strLJFF;
        c21244318Bt.LIZIZ = PageFinder.via(c817603Hi.LIZLLL);
        c21244318Bt.LIZJ = null;
        return BtmSDK.INSTANCE.createJumpSourceBtmToken(c21244318Bt);
    }

    public final String LIZJ(String str, BcmParams bcmParams) {
        C21244318Bt c21244318Bt = new C21244318Bt();
        c21244318Bt.LIZ = str;
        c21244318Bt.LIZIZ = PageFinder.via(this.LIZLLL);
        c21244318Bt.LIZJ = bcmParams;
        return BtmSDK.INSTANCE.createJumpSourceBtmToken(c21244318Bt);
    }

    public final String LJII(String str, BcmParams bcmParams) {
        return BtmSDK.INSTANCE.getBcmChainStandardStringByFinder(str, PageFinder.via(this.LIZLLL), bcmParams);
    }

    public final String LJIIIIZZ(String str, BcmParams bcmParams) {
        String str2 = (String) ((LinkedHashMap) this.LIZIZ).get(str);
        if (C770702zh.LIZIZ(str2)) {
            return BtmSDK.INSTANCE.getBcmChainStandardStringByFinder(str2, PageFinder.via(this.LIZLLL), bcmParams);
        }
        return null;
    }

    public final String LJ(String str, String str2, BcmParams bcmParams) {
        if (str2 != null && str2.length() != 0) {
            C21244318Bt c21244318Bt = new C21244318Bt();
            c21244318Bt.LIZ = str;
            c21244318Bt.LIZIZ = PageFinder.via(this.LIZLLL);
            c21244318Bt.LIZJ = bcmParams;
            String strCreateJumpSourceBtmToken = BtmSDK.INSTANCE.createJumpSourceBtmToken(c21244318Bt);
            if (C770702zh.LIZIZ(strCreateJumpSourceBtmToken)) {
                Uri.Builder builderBuildUpon = UriProtector.parse(str2).buildUpon();
                builderBuildUpon.appendQueryParameter("source_btm_token", strCreateJumpSourceBtmToken);
                return builderBuildUpon.build().toString();
            }
            return str2;
        }
        return str2;
    }

    public final void LJIIL(Fragment fragment, String str, String str2) {
        if (str2 != null) {
            this.LIZJ = str2;
        }
        String str3 = this.LIZJ;
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        btmSDK.registerBtmPageOnCreate(fragment, str, str3);
        this.LIZ = true;
        this.LIZLLL = btmSDK.getPageId(PageFinder.via(fragment));
    }
}

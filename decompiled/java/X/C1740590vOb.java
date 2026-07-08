package X;

import android.net.Uri;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0vOb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1740590vOb {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(C1740600vOc c1740600vOc) {
        Map<String, Object> map;
        if (c1740600vOc == null) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            C21244318Bt c21244318Bt = c1740600vOc.LIZ;
            for (Map.Entry entry : BtmSDK.createReportParams$default(btmSDK, c21244318Bt.LIZ, c21244318Bt.LIZIZ, null, 4, null).entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    linkedHashMap.put(entry.getKey(), value);
                }
            }
            BcmParams bcmParams = c1740600vOc.LIZ.LIZJ;
            if (bcmParams != null && (map = bcmParams.toMap()) != null) {
                linkedHashMap.putAll(map);
            }
            return linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return null;
        }
    }

    public static String LIZIZ(C1740600vOc c1740600vOc, String str) {
        boolean z;
        String str2;
        try {
            String strCreateJumpSourceBtmToken = c1740600vOc.LIZIZ;
            if (strCreateJumpSourceBtmToken == null) {
                strCreateJumpSourceBtmToken = BtmSDK.INSTANCE.createJumpSourceBtmToken(c1740600vOc.LIZ);
            }
            if (strCreateJumpSourceBtmToken == null || strCreateJumpSourceBtmToken.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Uri.Builder builderAppendQueryParameter = UriProtector.parse(str).buildUpon().appendQueryParameter("source_btm_token", strCreateJumpSourceBtmToken);
                C21246818Cs btmPageInfoV2 = BtmSDK.INSTANCE.getBtmPageInfoV2(c1740600vOc.LIZ.LIZIZ);
                if (btmPageInfoV2 == null || (str2 = btmPageInfoV2.LIZJ) == null) {
                    str2 = "";
                }
                str = builderAppendQueryParameter.appendQueryParameter("source_btm_page_id", str2).toString();
                return str;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        return str;
    }

    public static String LIZJ(C1740600vOc c1740600vOc, String str) {
        boolean z;
        Uri uriLIZIZ;
        try {
            String strCreateJumpSourceBtmToken = c1740600vOc.LIZIZ;
            if (strCreateJumpSourceBtmToken == null) {
                strCreateJumpSourceBtmToken = BtmSDK.INSTANCE.createJumpSourceBtmToken(c1740600vOc.LIZ);
            }
            if (strCreateJumpSourceBtmToken == null || strCreateJumpSourceBtmToken.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && (uriLIZIZ = AnonymousClass0185.LIZIZ(UriProtector.parse(str), "source_btm_token", strCreateJumpSourceBtmToken)) != null) {
                String string = uriLIZIZ.toString();
                if (string != null) {
                    return string;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        return str;
    }
}

package X;

import android.net.Uri;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Map;

/* JADX INFO: renamed from: X.038N, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C038N {
    public static Map LIZJ(String str) {
        if (C817603Hi.LJFF != null) {
            return BtmSDK.createReportParams$default(BtmSDK.INSTANCE, str, PageFinder.via(C817603Hi.LJFF), null, 4, null);
        }
        return C2097608Jq.LJ();
    }

    public static void LIZ(Map map, Map map2) {
        String string;
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value == null || (string = value.toString()) == null) {
                    string = "";
                }
                map.put(key, string);
            }
        }
    }

    public static String LIZIZ(String str, String str2) {
        if (str2 != null && str2.length() != 0) {
            C21244318Bt c21244318Bt = new C21244318Bt();
            c21244318Bt.LIZ = "c3631.d7883";
            c21244318Bt.LIZIZ = PageFinder.via(str);
            c21244318Bt.LIZJ = null;
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
}

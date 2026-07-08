package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.08xK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2284808xK {
    public static final C2284808xK LIZ = new C2284808xK();

    public static void LIZ(int i, String str, String str2, int i2, String str3, String str4, float f, int i3, String str5) {
        try {
            C1768000w6o c1768000w6o = C1768000w6o.LIZ;
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("result", String.valueOf(i)), new Pair("stage", str), new Pair("error_msg", str2), new Pair("url_type", Integer.valueOf(i2)), new Pair("request_link", str3), new Pair("response_link", str4), new Pair("request_duration", Float.valueOf(f)), new Pair("mall_position", Integer.valueOf(i3)), new Pair("raw_url", str5));
            c1768000w6o.getClass();
            C1768000w6o.LIZIZ("rd_tiktokec_ec_seo_diversion", mapLJIIJ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}

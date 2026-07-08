package X;

import com.bytedance.keva.Keva;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS212S0000000_23;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qRb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1550250qRb {
    public static final C01GW LIZ;
    public static final C01GW LIZIZ;
    public static final C01GW LIZJ;
    public static final AtomicBoolean LIZLLL;

    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.PUBLICATION;
        LIZ = C452501pT.LIZ(enumC452301pR, AFwS212S0000000_23.get$arr$(256));
        LIZIZ = C452501pT.LIZ(enumC452301pR, AFwS212S0000000_23.get$arr$(257));
        LIZJ = C452501pT.LIZ(enumC452301pR, AFwS212S0000000_23.get$arr$(255));
        LIZLLL = new AtomicBoolean(false);
    }

    public static Keva LIZ() {
        return (Keva) LIZ.getValue();
    }

    public static void LIZIZ(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", 0);
        jSONObject.put("err_code", i);
        jSONObject.put("err_msg", str);
        C1520360pfO c1520360pfO = new C1520360pfO("spark_short_links_freeze_config_pv");
        c1520360pfO.LIZLLL = jSONObject;
        c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
        C1520080pew.LIZ(null, c1520360pfO.LIZ());
    }

    public static void LIZJ(long j, long j2, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", 1);
        jSONObject.put("version", str2);
        jSONObject.put("local_version", str);
        jSONObject.put("download_duration", j);
        jSONObject.put("parse_duration", j2);
        C1520360pfO c1520360pfO = new C1520360pfO("spark_short_links_freeze_config_pv");
        c1520360pfO.LIZLLL = jSONObject;
        c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
        C1520080pew.LIZ(null, c1520360pfO.LIZ());
    }
}

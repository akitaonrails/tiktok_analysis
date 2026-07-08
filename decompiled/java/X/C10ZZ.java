package X;

import Y.AObjectS78S0000000_28;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.10ZZ, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10ZZ {
    public static final C10ZZ LIZ = new C10ZZ();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new AObjectS78S0000000_28(2));

    public static void LIZ(C19266910Zf c19266910Zf) {
        Long l = (Long) ((Map) LIZIZ.getValue()).remove(c19266910Zf.LIZ);
        if (l != null) {
            C20684815ws.LJIILLIIL("s2l_duration", C2097608Jq.LJI(new Pair("url", c19266910Zf.LIZ), new Pair("net_duration", String.valueOf(c19266910Zf.LJFF)), new Pair("total_duration", String.valueOf(C19267610Zm.LIZ.now().toEpochMilliseconds() - l.longValue())), new Pair("is_success", String.valueOf(c19266910Zf.LIZJ)), new Pair("is_kmp", String.valueOf(c19266910Zf.LJI)), new Pair("error_code", String.valueOf(c19266910Zf.LIZLLL)), new Pair("error_msg", c19266910Zf.LJ)));
        }
    }
}

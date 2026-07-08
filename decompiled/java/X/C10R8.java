package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.10R8, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public abstract class C10R8 {
    public final C01GW LIZ;

    public C10R8(final C10QU c10qu, final boolean z) {
        this.LIZ = C452501pT.LIZIZ(new Function0() { // from class: X.10S2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new C10S3(c10qu, z);
            }
        });
    }

    public final boolean LIZ(String str, boolean z) {
        try {
            String strLIZ = ((C10S3) this.LIZ.getValue()).LIZ(str);
            if (strLIZ != null) {
                z = Boolean.parseBoolean(strLIZ);
                return z;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return z;
    }

    public final long LIZIZ(String str, long j) {
        try {
            String strLIZ = ((C10S3) this.LIZ.getValue()).LIZ(str);
            if (strLIZ != null) {
                j = CastLongProtector.parseLong(strLIZ);
                return j;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return j;
    }

    public final String LIZJ(String str, String str2) {
        try {
            String strLIZ = ((C10S3) this.LIZ.getValue()).LIZ(str);
            if (strLIZ != null) {
                if (a0.LJJJ(strLIZ, "@starling@", 0, false, 6) != -1) {
                    C1865740yeS c1865740yeS = C1865740yeS.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("NU Strategy getString error, key :");
                    sbLIZ.append(str);
                    sbLIZ.append(", value: ");
                    sbLIZ.append(strLIZ);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c1865740yeS.getClass();
                    if (C1865740yeS.LIZ()) {
                        throw new RuntimeException(strLIZIZ);
                    }
                }
                return strLIZ;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return str2;
    }

    public final List LIZLLL(String str, C13BV c13bv) {
        boolean z;
        try {
            String strLIZ = ((C10S3) this.LIZ.getValue()).LIZ(str);
            if (strLIZ == null || a0.LJJJIL(strLIZ)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLIZ, new String[]{"@!^!@"}, 0, 6);
                if (listLJJLIIIJILLIZJL != null) {
                    return listLJJLIIIJILLIZJL;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return c13bv;
    }
}

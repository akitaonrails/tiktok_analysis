package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.configuration.models.NUJConfig;
import defpackage.g9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.10QI, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public abstract class C10QI {
    public final C01GW LIZ;

    public final String LIZJ() {
        return LIZLLL("should_run", "");
    }

    public final boolean LJ() {
        NUJConfig nUJConfig = ((C10QJ) this.LIZ.getValue()).LIZIZ;
        return nUJConfig != null && nUJConfig.LIZ;
    }

    public C10QI(g9 g9Var, boolean z) {
        this.LIZ = C452501pT.LIZIZ(new C10QN(g9Var, z));
    }

    public final boolean LIZ(String str, boolean z) {
        try {
            String strLIZ = ((C10QJ) this.LIZ.getValue()).LIZ(str);
            if (strLIZ != null) {
                z = Boolean.parseBoolean(strLIZ);
                return z;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return z;
    }

    public final int LIZIZ(String str, int i) {
        try {
            String strLIZ = ((C10QJ) this.LIZ.getValue()).LIZ(str);
            if (strLIZ != null) {
                i = CastIntegerProtector.parseInt(strLIZ);
                return i;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return i;
    }

    public final String LIZLLL(String str, String str2) {
        try {
            String strLIZ = ((C10QJ) this.LIZ.getValue()).LIZ(str);
            if (strLIZ != null) {
                if (a0.LJJJ(strLIZ, "@starling@", 0, false, 6) != -1) {
                    C1955907lN c1955907lN = C1955907lN.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("NU Strategy getString error, key :");
                    sbLIZ.append(str);
                    sbLIZ.append(", value: ");
                    sbLIZ.append(strLIZ);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c1955907lN.getClass();
                    C844470XAv.LIZ.getClass();
                    if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
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
}

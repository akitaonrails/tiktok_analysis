package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;

/* JADX INFO: renamed from: X.08Sg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2120008Sg {
    public static C0VSJ LIZLLL;
    public boolean LIZ;
    public boolean LIZIZ;
    public C2119708Sd LIZJ;

    public static File LIZ() {
        try {
            C0VSJ c0vsj = LIZLLL;
            if (c0vsj == null) {
                c0vsj = new C0VSJ(C1BWL.LIZ().getFilesDir(), "ClassPreloader/BootFinish");
                LIZLLL = c0vsj;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            C844470XAv.LIZ.getClass();
            sbLIZ.append(C844470XAv.LJ());
            return C2114508Qd.LIZJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}

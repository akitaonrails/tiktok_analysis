package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0vop, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1756850vop implements C040B {
    public String LIZ = "";
    public String LIZIZ = "";
    public String LIZJ = "";
    public Integer LIZLLL = -100;
    public String LJ;
    public Integer LJFF;
    public String LJI;
    public Integer LJII;
    public String LJIIIIZZ;
    public Integer LJIIIZ;

    public final void LIZJ() {
        try {
            AnonymousClass0408.LIZ.getClass();
            Pair pairLJI = AnonymousClass0408.LJI();
            this.LJ = pairLJI != null ? (String) pairLJI.getFirst() : null;
            this.LJFF = pairLJI != null ? (Integer) pairLJI.getSecond() : null;
            Pair pairLJIIIZ = AnonymousClass0408.LJIIIZ();
            this.LJI = pairLJIIIZ != null ? (String) pairLJIIIZ.getFirst() : null;
            this.LJII = pairLJIIIZ != null ? (Integer) pairLJIIIZ.getSecond() : null;
            Pair pairLJIIJ = AnonymousClass0408.LJIIJ();
            this.LJIIIIZZ = pairLJIIJ != null ? (String) pairLJIIJ.getFirst() : null;
            this.LJIIIZ = pairLJIIJ != null ? (Integer) pairLJIIJ.getSecond() : null;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.C040B
    public final void LIZ(String str) {
        this.LIZIZ = str;
    }

    @Override // X.C040B
    public final void LIZIZ(String str) {
        this.LIZ = str;
    }
}

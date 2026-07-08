package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlinx.coroutines.flow.b;

/* JADX INFO: renamed from: X.095n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23157095n {
    public static final C23157095n LIZ = new C23157095n();
    public static AnonymousClass0960 LIZIZ;

    public static InterfaceC346201Wa LIZIZ(C23186096q c23186096q) {
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        C201955140j.LIZLLL(c1398350mUb, "SmartMovieApiExt", "requestNLEModelAsFlow");
        AnonymousClass0960 anonymousClass0960 = LIZIZ;
        if (anonymousClass0960 == null) {
            C201955140j.LJIIIIZZ(c1398350mUb, "SmartMovieApiExt", "requestNLEModelAsFlow failed: not initialized");
            return new C516501zn(new C096G("SmartMovieApiExt not initialized", -1), 1);
        }
        C201955140j.LIZLLL(c1398350mUb, "SmartMovieExt", "getNLEModelAsFlow");
        C095X c095x = anonymousClass0960.LIZLLL;
        c095x.getClass();
        return new C2501109r7(new C095O(null), C09IC.LJIL(new C095D(new C095Q(c23186096q, c095x, null)), C0PEM.LIZJ), 0);
    }

    public static InterfaceC346201Wa LIZJ(NLEModel nLEModel) {
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        C201955140j.LIZLLL(c1398350mUb, "SmartMovieApiExt", "restore");
        AnonymousClass0960 anonymousClass0960 = LIZIZ;
        if (anonymousClass0960 == null) {
            C201955140j.LJIIIIZZ(c1398350mUb, "SmartMovieApiExt", "restore failed: not initialized");
            return new C516501zn(new C096G("SmartMovieApiExt not initialized", -1), 1);
        }
        b bVarLJ = C09IC.LJ(new C23148095e(anonymousClass0960, nLEModel, null));
        C1DFH c1dfh = C0PEM.LIZ;
        return C09IC.LJIL(bVarLJ, C2107308Nj.LIZ);
    }

    public final void LIZ(AFwS210S0000000_22 aFwS210S0000000_22) {
        if (LIZIZ != null) {
            C201955140j.LIZLLL(C1398350mUb.LIZIZ, "SmartMovieApiExt", "init skip, already initialized");
            return;
        }
        synchronized (this) {
            try {
                if (LIZIZ != null) {
                    C201955140j.LIZLLL(C1398350mUb.LIZIZ, "SmartMovieApiExt", "init skip, already initialized in synchronized");
                    return;
                }
                C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                C201955140j.LIZLLL(c1398350mUb, "SmartMovieApiExt", "init start");
                C2261508tZ.LIZ.LIZ();
                LIZIZ = new AnonymousClass0960((C23154095k) aFwS210S0000000_22.invoke());
                C201955140j.LIZLLL(c1398350mUb, "SmartMovieApiExt", "init done");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}

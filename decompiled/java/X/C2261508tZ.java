package X;

import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.08tZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2261508tZ {
    public static final C2261508tZ LIZ = new C2261508tZ();
    public static boolean LIZIZ;

    public final synchronized void LIZ() {
        Object c098200Yq;
        if (!LIZIZ) {
            LIZIZ = true;
            try {
                Librarian.LJFF("NLEEditorJni");
                Librarian.LJFF("DavinciResourceJni");
                Librarian.LJFF("NLEResourcesDAVJni");
                Librarian.LJFF("SmartMovieJni");
                Librarian.LJFF("CutSameJni");
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("load so failure: ");
                sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                C201955140j.LJIIIIZZ(c1398350mUb, "SmartMovieNativeLibs", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }
}

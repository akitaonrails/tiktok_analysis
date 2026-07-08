package X;

import com.bytedance.ies.smartmovie.jni.NLEModelRequestParams;
import com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback;
import com.bytedance.ies.smartmovie.jni.SmartMovie;
import com.bytedance.ies.smartmovie.jni.SmartMovieConfig;
import com.bytedance.ies.smartmovie.jni.SmartMovieJniJNI;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0n1A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1418540n1A {
    public static final C1418540n1A LIZ = new C1418540n1A();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(468));

    public static C1418550n1B LIZ() {
        return (C1418550n1B) LIZIZ.getValue();
    }

    public static void LIZIZ(AFwS210S0000000_22 aFwS210S0000000_22) {
        Object c098200Yq;
        C1418550n1B c1418550n1BLIZ = LIZ();
        if (c1418550n1BLIZ.LIZ == null) {
            synchronized (C1418560n1C.LIZ) {
                if (!C1418560n1C.LIZIZ) {
                    C1418560n1C.LIZIZ = true;
                    try {
                        Librarian.LJFF("NLEEditorJni");
                        Librarian.LJFF("DavinciResourceJni");
                        Librarian.LJFF("NLEResourcesDAVJni");
                        Librarian.LJFF("SmartMovieJni");
                        c098200Yq = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    C189200o6.m5exceptionOrNullimpl(c098200Yq);
                }
            }
            SmartMovieConfig smartMovieConfig = (SmartMovieConfig) aFwS210S0000000_22.invoke();
            c1418550n1BLIZ.LIZIZ = smartMovieConfig;
            c1418550n1BLIZ.LIZ = new SmartMovie(smartMovieConfig);
        }
    }

    public static String LIZJ(NLEModelRequestParams nLEModelRequestParams, NLEModelRequestProgressCallback nLEModelRequestProgressCallback) {
        C1418550n1B c1418550n1BLIZ = LIZ();
        c1418550n1BLIZ.getClass();
        C1418350n0r c1418350n0r = new C1418350n0r(nLEModelRequestProgressCallback, nLEModelRequestParams);
        SmartMovie smartMovie = c1418550n1BLIZ.LIZ;
        if (smartMovie == null) {
            smartMovie = null;
        }
        String strSmartMovie_getNLEModel = SmartMovieJniJNI.SmartMovie_getNLEModel(smartMovie.LIZ, smartMovie, nLEModelRequestParams.LIZ, nLEModelRequestParams, NLEModelRequestProgressCallback.getCPtr(c1418350n0r), c1418350n0r);
        ((HashMap) c1418550n1BLIZ.LIZLLL.getValue()).put(strSmartMovie_getNLEModel, Long.valueOf(c1418350n0r.LIZJ));
        return strSmartMovie_getNLEModel;
    }
}

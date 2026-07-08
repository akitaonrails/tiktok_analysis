package X;

import Y.ARunnableS109S0100000_9;
import com.bytedance.pipo.verify.base.tracking.VerifyAnalysisSession;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0uWW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1707060uWW {
    public static final C1707060uWW LIZ = new C1707060uWW();
    public static final ConcurrentHashMap<String, VerifyAnalysisSession> LIZIZ = new ConcurrentHashMap<>();

    public static VerifyAnalysisSession LIZ(String str) {
        if (str != null && str.length() != 0) {
            return LIZIZ.get(str);
        }
        return null;
    }

    public static void LIZIZ(String str) {
        VerifyAnalysisSession verifyAnalysisSessionRemove;
        if (str != null && str.length() != 0 && (verifyAnalysisSessionRemove = LIZIZ.remove(str)) != null) {
            if (verifyAnalysisSessionRemove.LJJII.compareAndSet(true, false)) {
                C1707070uWX.LIZ.remove(verifyAnalysisSessionRemove);
            }
            if (verifyAnalysisSessionRemove.LJJIJ.compareAndSet(true, false)) {
                C786410Ut5.LJJZZIII(verifyAnalysisSessionRemove.LIZLLL, new ARunnableS109S0100000_9(verifyAnalysisSessionRemove, 23));
            }
        }
    }
}

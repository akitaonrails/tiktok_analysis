package X;

import com.bytedance.ies.effecteditor.swig.UIAnnotationCompletion;
import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1DP9, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DP9 extends UIAnnotationCompletion {
    public static final List<C1DP9> LIZIZ = new ArrayList();
    public final C1DO8 LIZ;

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationCompletion
    public final void onSuccess() {
        C1DO6.LIZIZ(this.LIZ);
        List<C1DP9> list = LIZIZ;
        synchronized (list) {
            try {
                ((ArrayList) list).remove(this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C1DP9(C1DO8 c1do8) {
        this.LIZ = c1do8;
        List<C1DP9> list = LIZIZ;
        synchronized (list) {
            try {
                ((ArrayList) list).add(this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationCompletion
    public final void onError(UIAnnotationErrorCode uIAnnotationErrorCode) {
        C1DO6.LIZ(this.LIZ, uIAnnotationErrorCode);
        List<C1DP9> list = LIZIZ;
        synchronized (list) {
            try {
                ((ArrayList) list).remove(this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}

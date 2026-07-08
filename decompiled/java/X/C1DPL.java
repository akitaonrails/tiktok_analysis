package X;

import com.bytedance.ies.effecteditor.swig.UIAnnotationUIType;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1DPL, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DPL {
    public static volatile C1DPL LIZIZ;
    public final Map<UIAnnotationUIType, C1DPJ> LIZ = new HashMap(0);

    public static C1DPL LIZ() {
        if (LIZIZ != null) {
            return LIZIZ;
        }
        synchronized (C1DPL.class) {
            try {
                if (LIZIZ != null) {
                    return LIZIZ;
                }
                LIZIZ = new C1DPL();
                return LIZIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZIZ(UIAnnotationUIType uIAnnotationUIType, C1DPJ c1dpj) {
        ((HashMap) LIZ().LIZ).put(uIAnnotationUIType, c1dpj);
    }
}

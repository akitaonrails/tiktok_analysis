package X;

import com.ss.android.ugc.aweme.base.component.AnalysisActivityComponent;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1D6z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2250591D6z {
    public final Function0<AnalysisActivityComponent> LIZ;
    public final C1D70 LIZIZ = new InterfaceC2250581D6y() { // from class: X.1D70
        @Override // X.InterfaceC2250581D6y
        public final void LIZ(boolean z) {
            if (z) {
                AnalysisActivityComponent analysisActivityComponentInvoke = this.LIZ.LIZ.invoke();
                if (analysisActivityComponentInvoke != null) {
                    analysisActivityComponentInvoke.LIZIZ(null);
                    return;
                }
                return;
            }
            AnalysisActivityComponent analysisActivityComponentInvoke2 = this.LIZ.LIZ.invoke();
            if (analysisActivityComponentInvoke2 == null) {
                return;
            }
            analysisActivityComponentInvoke2.LL = System.currentTimeMillis();
        }
    };

    public final void LIZ() {
        CopyOnWriteArrayList<InterfaceC2250581D6y> copyOnWriteArrayList = C2250571D6x.LIZ;
        C2250571D6x.LIZ.remove(this.LIZIZ);
        AnalysisActivityComponent analysisActivityComponentInvoke = this.LIZ.invoke();
        if (analysisActivityComponentInvoke != null) {
            analysisActivityComponentInvoke.LIZIZ(null);
        }
    }

    public final void LIZIZ() {
        AnalysisActivityComponent analysisActivityComponentInvoke;
        CopyOnWriteArrayList<InterfaceC2250581D6y> copyOnWriteArrayList = C2250571D6x.LIZ;
        C2250571D6x.LIZ.addIfAbsent(this.LIZIZ);
        if (C2250571D6x.LIZIZ || (analysisActivityComponentInvoke = this.LIZ.invoke()) == null) {
            return;
        }
        analysisActivityComponentInvoke.LL = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.1D70] */
    public C2250591D6z(Function0<? extends AnalysisActivityComponent> function0) {
        this.LIZ = function0;
    }
}

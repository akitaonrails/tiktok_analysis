package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CJW, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CJW extends C0CJE {
    public static final C0CJW LIZLLL = new C0CJW();

    @Override // X.C0CJE
    public final String LIZIZ() {
        return "ab_split_perf_monitor";
    }

    @Override // X.C0CJE
    public final boolean LIZJ() {
        return ((Boolean) C1211904of.LIZIZ.getValue()).booleanValue();
    }

    @Override // X.C0CJE
    public final void LIZ(Function0<Unit> function0) {
        if (LIZJ()) {
            function0.invoke();
        }
    }

    public final void LJI(long j, String str) {
        LIZ(new C0CJX(str, j));
    }

    public static final void LJFF(C0CJW c0cjw, String str, long j) {
        c0cjw.getClass();
        c0cjw.LIZ(new C0CJF(c0cjw, str, j));
    }
}

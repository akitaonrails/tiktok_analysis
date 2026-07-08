package X;

import X.InterfaceC655050Pmh;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0PpX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C656810PpX<T extends InterfaceC655050Pmh> {
    public C656840Ppa<T> LIZ;
    public C656800PpW<T> LIZIZ;

    public final void LIZ(Function1<? super C656800PpW<T>, Unit> function1) {
        C656800PpW<T> c656800PpW = new C656800PpW<>();
        function1.invoke(c656800PpW);
        this.LIZIZ = c656800PpW;
    }

    public final void LIZIZ(Function1<? super C656840Ppa<T>, Unit> function1) {
        C656840Ppa<T> c656840Ppa = new C656840Ppa<>();
        function1.invoke(c656840Ppa);
        this.LIZ = c656840Ppa;
    }
}

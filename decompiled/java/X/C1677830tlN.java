package X;

import X.AbstractC1677260tkS;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0tlN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677830tlN<T, V extends AbstractC1677260tkS> {
    public final InterfaceC1677290tkV<T, V> LIZ;
    public final T LIZIZ;
    public final long LIZJ;
    public final Function0<Unit> LIZLLL;
    public final C05P0 LJ;
    public V LJFF;
    public long LJI;
    public long LJII = Long.MIN_VALUE;
    public final C05P0 LJIIIIZZ = C20028913Yh.LJI(Boolean.TRUE);

    public final void LIZ() {
        ((C13FE) this.LJIIIIZZ).setValue(Boolean.FALSE);
        this.LIZLLL.invoke();
    }

    public final T LIZIZ() {
        return (T) this.LJ.getValue();
    }

    public final T LIZJ() {
        return this.LIZ.LIZIZ().invoke(this.LJFF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1677830tlN(Object obj, InterfaceC1677290tkV interfaceC1677290tkV, AbstractC1677260tkS abstractC1677260tkS, long j, Object obj2, long j2, Function0 function0) {
        this.LIZ = interfaceC1677290tkV;
        this.LIZIZ = obj2;
        this.LIZJ = j2;
        this.LIZLLL = function0;
        this.LJ = C20028913Yh.LJI(obj);
        this.LJFF = (V) C1677250tkR.LIZ(abstractC1677260tkS);
        this.LJI = j;
    }
}

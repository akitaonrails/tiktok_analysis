package X;

import X.AbstractC1677260tkS;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tlD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677730tlD<T, V extends AbstractC1677260tkS> implements C05P1<T> {
    public T LL;
    public T LLILLJJLI;
    public final InterfaceC1677290tkV<T, V> LLILLL;
    public final Function1<T, Unit> LLILZ;
    public final Function1<T, Unit> LLILZIL;
    public final C05P0 LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public long LLJ;
    public InterfaceC1675680thu LLJI;
    public C1677210tkN<T, V> LLJIJIL;
    public final /* synthetic */ C1677750tlF LLJILJIL;

    public final void LJIIL() {
        this.LLJIJIL = new C1677210tkN<>(this.LLJI, this.LLILLL, this.LL, this.LLILLJJLI);
        ((C13FE) this.LLJILJIL.LIZJ).setValue(Boolean.TRUE);
        this.LLIZ = false;
        this.LLIZLLLIL = true;
    }

    @Override // X.C05P1
    public final T getValue() {
        return (T) this.LLILZLL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1677730tlD(C1677750tlF c1677750tlF, Object obj, Object obj2, C1677610tl1 c1677610tl1, Function1 function1, Function1 function12) {
        this.LLJILJIL = c1677750tlF;
        this.LL = obj;
        this.LLILLJJLI = obj2;
        this.LLILLL = c1677610tl1;
        this.LLILZ = function1;
        this.LLILZIL = function12;
        this.LLILZLL = C20028913Yh.LJI(obj);
        InterfaceC1675680thu interfaceC1675680thuLIZIZ = c1677750tlF.LIZIZ();
        this.LLJI = interfaceC1675680thuLIZIZ;
        this.LLJIJIL = new C1677210tkN<>(interfaceC1675680thuLIZIZ, c1677610tl1, this.LL, this.LLILLJJLI);
    }
}

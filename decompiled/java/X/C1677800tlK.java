package X;

import X.AbstractC1677260tkS;

/* JADX INFO: renamed from: X.0tlK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677800tlK<T, V extends AbstractC1677260tkS> implements C05P1<T> {
    public T LL;
    public T LLILLJJLI;
    public final InterfaceC1677290tkV<T, V> LLILLL;
    public final C05P0 LLILZ;
    public InterfaceC1677030tk5<T> LLILZIL;
    public C1677210tkN<T, V> LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public long LLJ;
    public final /* synthetic */ C1677780tlI LLJI;

    @Override // X.C05P1
    public final T getValue() {
        return (T) this.LLILZ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1677800tlK(C1677780tlI c1677780tlI, Object obj, Object obj2, InterfaceC1677290tkV interfaceC1677290tkV, InterfaceC1677030tk5 interfaceC1677030tk5) {
        this.LLJI = c1677780tlI;
        this.LL = obj;
        this.LLILLJJLI = obj2;
        this.LLILLL = interfaceC1677290tkV;
        this.LLILZ = C20028913Yh.LJI(obj);
        this.LLILZIL = interfaceC1677030tk5;
        this.LLILZLL = new C1677210tkN<>(interfaceC1677030tk5, interfaceC1677290tkV, this.LL, this.LLILLJJLI);
    }
}

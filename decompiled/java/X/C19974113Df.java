package X;

/* JADX INFO: renamed from: X.13Df, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19974113Df<E> extends AbstractC19974313Dh<E> implements InterfaceC1665500tRU<E> {
    public final InterfaceC1665500tRU<E> LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;

    @Override // X.AbstractC2253808sK
    public final int LIZJ() {
        return this.LLILZ;
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final E get(int i) {
        C19973913Dd.LIZ(i, this.LLILZ);
        return this.LLILLJJLI.get(this.LLILLL + i);
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final C19974113Df subList(int i, int i2) {
        C19973913Dd.LIZJ(i, i2, this.LLILZ);
        InterfaceC1665500tRU<E> interfaceC1665500tRU = this.LLILLJJLI;
        int i3 = this.LLILLL;
        return new C19974113Df(interfaceC1665500tRU, i + i3, i3 + i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19974113Df(InterfaceC1665500tRU<? extends E> interfaceC1665500tRU, int i, int i2) {
        this.LLILLJJLI = interfaceC1665500tRU;
        this.LLILLL = i;
        C19973913Dd.LIZJ(i, i2, interfaceC1665500tRU.size());
        this.LLILZ = i2 - i;
    }
}

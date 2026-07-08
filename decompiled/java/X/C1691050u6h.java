package X;

/* JADX INFO: renamed from: X.0u6h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1691050u6h<T> {
    public final int LIZ;
    public final int LIZIZ;
    public final T LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1691050u6h(int i, int i2, InterfaceC1691090u6l interfaceC1691090u6l) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = interfaceC1691090u6l;
        if (i < 0) {
            C1691080u6k.LIZ("startIndex should be >= 0");
        }
        if (i2 <= 0) {
            C1691080u6k.LIZ("size should be > 0");
        }
    }
}

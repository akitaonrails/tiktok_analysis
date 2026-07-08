package X;

/* JADX INFO: renamed from: X.0XZT, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0XZT extends AbstractC846040XGw<C0XZV> {
    public abstract void LIZIZ(C0XZV c0xzv);

    public abstract void LIZJ(C0XZV c0xzv, String str, String str2);

    public abstract void LIZLLL(C0XZV c0xzv);

    @Override // X.AbstractC846040XGw
    public final void LIZ(C0XGA c0xga) {
        C0XZV c0xzv = (C0XZV) c0xga;
        if (c0xzv.LIZIZ) {
            LIZLLL(c0xzv);
            return;
        }
        int i = c0xzv.LIZLLL;
        if (i != 1030 && i != 1041) {
            LIZIZ(c0xzv);
        } else if (c0xzv.LJIIL != null) {
            LIZJ(c0xzv, c0xzv.LJIIJ, c0xzv.LJIIJJI);
        } else {
            LIZIZ(c0xzv);
        }
    }
}

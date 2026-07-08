package X;

/* JADX INFO: renamed from: X.0tvw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1684380tvw implements InterfaceC1679160tnW {
    public final int LIZIZ;

    public C1684380tvw(int i) {
        this.LIZIZ = i;
    }

    @Override // X.InterfaceC1679160tnW
    public final C1684310tvp LIZ(C1692220u8a c1692220u8a) {
        return new C1684310tvp(new C1692220u8a(c1692220u8a.LLILLJJLI.substring(0, this.LIZIZ)), new InterfaceC1692600u9C() { // from class: X.0tvx
            @Override // X.InterfaceC1692600u9C
            public final int LIZIZ(int i) {
                return i;
            }

            @Override // X.InterfaceC1692600u9C
            public final int LIZ(int i) {
                int i2 = this.LIZIZ.LIZIZ;
                if (i > i2) {
                    return i2;
                }
                return i;
            }
        });
    }
}

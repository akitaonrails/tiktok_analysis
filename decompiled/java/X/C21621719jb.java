package X;

/* JADX INFO: renamed from: X.19jb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21621719jb extends AbstractC21621519jZ {
    public final short LIZJ;
    public final short LIZLLL;

    public final String toString() {
        short s = this.LIZJ;
        short s2 = this.LIZLLL;
        return "<" + Integer.toBinaryString((s & ((1 << s2) - 1)) | (1 << s2) | (1 << this.LIZLLL)).substring(1) + '>';
    }

    @Override // X.AbstractC21621519jZ
    public final void LIZ(C21622019je c21622019je, byte[] bArr) {
        c21622019je.LIZIZ(this.LIZJ, this.LIZLLL);
    }

    public C21621719jb(AbstractC21621519jZ abstractC21621519jZ, int i, int i2) {
        super(abstractC21621519jZ);
        this.LIZJ = (short) i;
        this.LIZLLL = (short) i2;
    }
}

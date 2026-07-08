package X;

/* JADX INFO: renamed from: X.13Qn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20008713Qn extends C20008813Qo {
    public final InterfaceC20008913Qp LIZIZ;

    @Override // X.C20008813Qo, X.C13SE
    public final void close() {
        this.LIZIZ.close();
    }

    public C20008713Qn(InterfaceC20008913Qp interfaceC20008913Qp) {
        this.LIZIZ = interfaceC20008913Qp;
    }

    @Override // X.C20008813Qo
    public final int LIZIZ(byte[] bArr, int i) {
        return this.LIZIZ.read(bArr, 0, i);
    }
}

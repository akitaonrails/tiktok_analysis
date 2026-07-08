package X;

/* JADX INFO: renamed from: X.0pen, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1519990pen extends AbstractC1532350pyj<byte[]> {
    @Override // X.AbstractC1532350pyj
    public final AbstractC1532350pyj<byte[]> LIZ(C1532710pzJ c1532710pzJ) {
        return this;
    }

    @Override // X.AbstractC1532350pyj
    public final void LIZLLL() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1532350pyj
    public final Integer LIZJ() {
        return Integer.valueOf(((byte[]) this.LIZ).length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ByteArray, length ");
        sbLIZ.append(((byte[]) this.LIZ).length);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1519990pen(byte[] bArr) {
        super(bArr, byte[].class);
    }
}

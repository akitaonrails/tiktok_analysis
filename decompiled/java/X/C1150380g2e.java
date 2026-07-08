package X;

/* JADX INFO: renamed from: X.0g2e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1150380g2e implements InterfaceC1150410g2h {
    public final String LIZ;
    public final int LIZIZ;

    @Override // X.InterfaceC1150410g2h
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1150410g2h
    public final boolean LIZIZ() {
        return true;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Reject(errorMsg='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("', errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1150410g2h
    public final int getErrorCode() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1150410g2h
    public final String getErrorMsg() {
        return this.LIZ;
    }

    public C1150380g2e(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}

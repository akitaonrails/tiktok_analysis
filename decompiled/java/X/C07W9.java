package X;

/* JADX INFO: renamed from: X.07W9, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07W9 implements InterfaceC21451318xD {
    public final String LIZ;

    @Override // X.InterfaceC21451418xE
    public final boolean LJFF() {
        return false;
    }

    @Override // X.InterfaceC21451418xE
    public final int LJ() {
        return this.LIZ.length();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextImpl{literal='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC21451318xD
    public final String LIZLLL() {
        return this.LIZ;
    }

    public C07W9(String str) {
        this.LIZ = str;
    }
}

package X;

/* JADX INFO: renamed from: X.0u8n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692350u8n implements InterfaceC1692660u9I {
    public final boolean LIZ;
    public final int LIZIZ = 1;
    public final int LIZJ = 1;
    public final C1692450u8x LIZLLL;
    public final C1692300u8i LJ;

    @Override // X.InterfaceC1692660u9I
    public final EnumC1692390u8r LIZIZ() {
        int i = this.LIZIZ;
        int i2 = this.LIZJ;
        if (i < i2) {
            return EnumC1692390u8r.NOT_CROSSED;
        }
        if (i > i2) {
            return EnumC1692390u8r.CROSSED;
        }
        C1692300u8i c1692300u8i = this.LJ;
        int i3 = c1692300u8i.LIZJ;
        int i4 = c1692300u8i.LIZLLL;
        return i3 < i4 ? EnumC1692390u8r.NOT_CROSSED : i3 > i4 ? EnumC1692390u8r.CROSSED : EnumC1692390u8r.COLLAPSED;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SingleSelectionLayout(isStartHandle=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", crossed=");
        sbLIZ.append(LIZIZ());
        sbLIZ.append(", info=\n\t");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1692660u9I
    public final boolean LIZ() {
        return this.LIZ;
    }

    public C1692350u8n(boolean z, C1692450u8x c1692450u8x, C1692300u8i c1692300u8i) {
        this.LIZ = z;
        this.LIZLLL = c1692450u8x;
        this.LJ = c1692300u8i;
    }
}

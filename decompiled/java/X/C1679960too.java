package X;

/* JADX INFO: renamed from: X.0too, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1679960too implements InterfaceC1672520tco, InterfaceC1688160u22 {
    public final float LIZ = 0;

    public final String toString() {
        return "Arrangement#SpaceBetween";
    }

    @Override // X.InterfaceC1672520tco, X.InterfaceC1688160u22
    public final float LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1688160u22
    public final void LIZJ(InterfaceC1690500u5o interfaceC1690500u5o, int i, int[] iArr, int[] iArr2) {
        C1679930tol.LJ(i, iArr, iArr2, false);
    }

    @Override // X.InterfaceC1672520tco
    public final void LIZIZ(InterfaceC1690500u5o interfaceC1690500u5o, int i, int[] iArr, EnumC1671200tag enumC1671200tag, int[] iArr2) {
        if (enumC1671200tag == EnumC1671200tag.Ltr) {
            C1679930tol.LJ(i, iArr, iArr2, false);
        } else {
            C1679930tol.LJ(i, iArr, iArr2, true);
        }
    }
}

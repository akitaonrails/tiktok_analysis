package X;

/* JADX INFO: renamed from: X.16D9, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16D9 implements C16DC {
    @Override // X.C16DC
    public final void LIZIZ() {
    }

    @Override // X.C16DC
    public final void LIZJ() {
    }

    @Override // X.C16DC
    public final void LJ() {
    }

    @Override // X.C16DC
    public final void LJFF() {
    }

    @Override // X.C16DC
    public final void LJI() {
    }

    @Override // X.C16DC
    public final void LJII() {
    }

    @Override // X.C16DC
    public final void reset() {
    }

    @Override // X.C16DC
    public final C16D9 LIZ() {
        return new C16D9();
    }

    public final int hashCode() {
        return C16D9.class.hashCode();
    }

    @Override // X.C16DC
    public final String toString() {
        return C16D9.class.getSimpleName();
    }

    @Override // X.C16DC
    public final void LIZLLL(C16D8 c16d8) throws C16DK {
        if (!c16d8.LJ && !c16d8.LJFF && !c16d8.LJI) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bad rsv RSV1: ");
        sbLIZ.append(c16d8.LJ);
        sbLIZ.append(" RSV2: ");
        sbLIZ.append(c16d8.LJFF);
        sbLIZ.append(" RSV3: ");
        sbLIZ.append(c16d8.LJI);
        throw new C16DK(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && C16D9.class == obj.getClass()) {
                return true;
            }
            return false;
        }
        return true;
    }
}

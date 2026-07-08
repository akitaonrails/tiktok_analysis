package X;

/* JADX INFO: renamed from: X.0LgW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C549300LgW implements InterfaceC549270LgT {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C549300LgW) && this.LIZ == ((C549300LgW) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Generating(percentage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC549270LgT
    public final int LIZ() {
        return C549310LgX.LIZ(this);
    }

    public C549300LgW(int i) {
        this.LIZ = i;
    }
}

package X;

/* JADX INFO: renamed from: X.0Uwo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C788720Uwo implements InterfaceC788740Uwq {
    public final int LIZ;

    public C788720Uwo() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C788720Uwo) && this.LIZ == ((C788720Uwo) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NormalPicLoadConfig(count=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC788740Uwq
    public final int LIZ() {
        return this.LIZ;
    }

    public C788720Uwo(int i) {
        this.LIZ = 50;
    }
}

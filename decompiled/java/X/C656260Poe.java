package X;

/* JADX INFO: renamed from: X.0Poe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C656260Poe implements InterfaceC655790Pnt {
    public final EnumC656280Pog LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C656260Poe) && this.LIZ == ((C656260Poe) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Icon(icon=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C656260Poe(EnumC656280Pog enumC656280Pog) {
        this.LIZ = enumC656280Pog;
    }
}

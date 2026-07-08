package X;

/* JADX INFO: renamed from: X.0StM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735620StM implements InterfaceC426680GoE {
    public final EnumC1606080rte LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C735620StM) && this.LIZ == ((C735620StM) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvatarStoryRelationVariant(scene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C735620StM(EnumC1606080rte enumC1606080rte) {
        this.LIZ = enumC1606080rte;
    }
}

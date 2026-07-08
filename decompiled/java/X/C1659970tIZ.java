package X;

/* JADX INFO: renamed from: X.0tIZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1659970tIZ implements InterfaceC1461640o8g<C1659920tIU> {
    public final boolean LIZ;

    public C1659970tIZ() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1659970tIZ) && this.LIZ == ((C1659970tIZ) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ToolbarMicState(hasPermission=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1659970tIZ(boolean z) {
        this.LIZ = z;
    }
}

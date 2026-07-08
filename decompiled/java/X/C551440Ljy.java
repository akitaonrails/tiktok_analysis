package X;

/* JADX INFO: renamed from: X.0Ljy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C551440Ljy extends AbstractC551420Ljw {
    public final EnumC240900wR LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C551440Ljy) && this.LIZ == ((C551440Ljy) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BottomBarMicClickEvent(mode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C551440Ljy(EnumC240900wR enumC240900wR) {
        this.LIZ = enumC240900wR;
    }
}

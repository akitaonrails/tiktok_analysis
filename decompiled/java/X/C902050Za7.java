package X;

/* JADX INFO: renamed from: X.0Za7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C902050Za7 implements InterfaceC902100ZaC {
    public final C0ZSW LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C902050Za7) && this.LIZ == ((C902050Za7) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TikTokLogoPlaceholderState(safetyMaskType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C902050Za7(C0ZSW c0zsw) {
        this.LIZ = c0zsw;
    }
}

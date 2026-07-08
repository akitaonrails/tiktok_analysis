package X;

/* JADX INFO: renamed from: X.0tLC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1661600tLC implements InterfaceC1461640o8g<C1678280tm6> {
    public final boolean LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1661600tLC) && this.LIZ == ((C1661600tLC) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ToolbarEditMusicState(musicOn=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1661600tLC(boolean z) {
        this.LIZ = z;
    }
}

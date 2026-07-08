package X;

/* JADX INFO: renamed from: X.0tLI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1661660tLI implements InterfaceC1461640o8g<C1660350tJB> {
    public final int LIZ;
    public final boolean LIZIZ;

    public C1661660tLI() {
        this(0, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1661660tLI)) {
            return false;
        }
        C1661660tLI c1661660tLI = (C1661660tLI) obj;
        return this.LIZ == c1661660tLI.LIZ && this.LIZIZ == c1661660tLI.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ToolbarSaveLocalState(progress=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", showProgress=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1661660tLI(int i, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
    }
}

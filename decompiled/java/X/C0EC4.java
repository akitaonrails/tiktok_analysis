package X;

/* JADX INFO: renamed from: X.0EC4, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EC4 {
    public final int LIZ;
    public final boolean LIZIZ;

    public C0EC4() {
        this(0, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0EC4)) {
            return false;
        }
        C0EC4 c0ec4 = (C0EC4) obj;
        return this.LIZ == c0ec4.LIZ && this.LIZIZ == c0ec4.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudioFadePanelConfig(panelHeight=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", autoResizeCanvasOnPanelToggle=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0EC4(int i, int i2) {
        boolean z;
        i = (i2 & 1) != 0 ? ((int) (C1415610mwR.LIZ() * 0.4f)) + C0ES4.LIZJ : i;
        if ((i2 & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LIZ = i;
        this.LIZIZ = z;
    }
}

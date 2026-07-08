package X;

/* JADX INFO: renamed from: X.0EGq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C361860EGq {
    public final boolean LIZ;
    public final int LIZIZ;

    public C361860EGq() {
        this(0, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C361860EGq)) {
            return false;
        }
        C361860EGq c361860EGq = (C361860EGq) obj;
        return this.LIZ == c361860EGq.LIZ && this.LIZIZ == c361860EGq.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionTemplatePanelConfig(autoResizeCanvasOnPanelToggle=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", panelHeight=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C361860EGq(int i, int i2) {
        boolean z;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        this(z, (i2 & 2) != 0 ? ((int) (C1415610mwR.LIZ() * 0.4f)) + C0ES4.LIZJ : i);
    }

    public C361860EGq(boolean z, int i) {
        this.LIZ = z;
        this.LIZIZ = i;
    }
}

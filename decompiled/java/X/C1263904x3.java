package X;

/* JADX INFO: renamed from: X.04x3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1263904x3 {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1263904x3)) {
            return false;
        }
        C1263904x3 c1263904x3 = (C1263904x3) obj;
        return this.LIZ == c1263904x3.LIZ && this.LIZIZ == c1263904x3.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionPanelEvent(cancel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", exist=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1263904x3(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}

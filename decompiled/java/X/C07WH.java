package X;

/* JADX INFO: renamed from: X.07WH, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07WH {
    public final boolean LIZ;

    public C07WH() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07WH) && this.LIZ == ((C07WH) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionTemplateNavBarStates(clearBtnSelected=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07WH(boolean z) {
        this.LIZ = z;
    }
}

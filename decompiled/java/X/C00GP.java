package X;

/* JADX INFO: renamed from: X.00GP, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00GP implements InterfaceC0148002o {
    public final float LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C00GP) && Float.compare(this.LL, ((C00GP) obj).LL) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LandscapeCellSeekBarState(playerSpeed=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LL);
    }

    public C00GP(float f) {
        this.LL = f;
    }
}

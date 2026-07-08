package X;

/* JADX INFO: renamed from: X.00GQ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00GQ implements InterfaceC0148002o {
    public final float LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C00GQ) && Float.compare(this.LL, ((C00GQ) obj).LL) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TopAreaState(playerSpeed=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LL);
    }

    public C00GQ(float f) {
        this.LL = f;
    }
}

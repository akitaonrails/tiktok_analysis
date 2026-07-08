package X;

/* JADX INFO: renamed from: X.0FFF, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FFF implements C13LY<Double> {
    public final double LL;
    public final double LLILLJJLI;

    @Override // X.C13LX
    public final Comparable LJFF() {
        return Double.valueOf(this.LLILLJJLI);
    }

    @Override // X.C13LX
    public final Comparable getStart() {
        return Double.valueOf(this.LL);
    }

    @Override // X.C13LY
    public final boolean isEmpty() {
        return this.LL > this.LLILLJJLI;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (C786410Ut5.X2(this.LL) * 31) + C786410Ut5.X2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append("..");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C13LY, X.C13LX
    public final boolean LIZJ(Comparable comparable) {
        double dDoubleValue = ((Number) comparable).doubleValue();
        if (dDoubleValue >= this.LL && dDoubleValue <= this.LLILLJJLI) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0FFF)) {
            return false;
        }
        if (!isEmpty() || !((C0FFF) obj).isEmpty()) {
            C0FFF c0fff = (C0FFF) obj;
            if (this.LL != c0fff.LL || this.LLILLJJLI != c0fff.LLILLJJLI) {
                return false;
            }
        }
        return true;
    }

    public C0FFF(double d, double d2) {
        this.LL = d;
        this.LLILLJJLI = d2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C13LY
    public final boolean LJ(Comparable comparable, Comparable comparable2) {
        if (((Number) comparable).doubleValue() <= ((Number) comparable2).doubleValue()) {
            return true;
        }
        return false;
    }
}

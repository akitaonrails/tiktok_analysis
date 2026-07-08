package X;

/* JADX INFO: renamed from: X.0F28, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F28 implements C13LY<Float> {
    public final float LL;
    public final float LLILLJJLI;

    @Override // X.C13LX
    public final Comparable LJFF() {
        return Float.valueOf(this.LLILLJJLI);
    }

    @Override // X.C13LX
    public final Comparable getStart() {
        return Float.valueOf(this.LL);
    }

    @Override // X.C13LY
    public final boolean isEmpty() {
        return this.LL > this.LLILLJJLI;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.floatToIntBits(this.LL) * 31) + Float.floatToIntBits(this.LLILLJJLI);
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
        float fFloatValue = ((Number) comparable).floatValue();
        if (fFloatValue >= this.LL && fFloatValue <= this.LLILLJJLI) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0F28)) {
            return false;
        }
        if (!isEmpty() || !((C0F28) obj).isEmpty()) {
            C0F28 c0f28 = (C0F28) obj;
            if (this.LL != c0f28.LL || this.LLILLJJLI != c0f28.LLILLJJLI) {
                return false;
            }
        }
        return true;
    }

    public C0F28(float f, float f2) {
        this.LL = f;
        this.LLILLJJLI = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C13LY
    public final boolean LJ(Comparable comparable, Comparable comparable2) {
        if (((Number) comparable).floatValue() <= ((Number) comparable2).floatValue()) {
            return true;
        }
        return false;
    }
}

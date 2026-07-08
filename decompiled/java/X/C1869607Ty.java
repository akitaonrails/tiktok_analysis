package X;

/* JADX INFO: renamed from: X.07Ty, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1869607Ty implements InterfaceC1869707Tz {
    public static final int $stable = 0;
    public final float LL;
    public final boolean LLILLJJLI;

    public final C1869607Ty copy(float f, boolean z) {
        return new C1869607Ty(f, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1869607Ty)) {
            return false;
        }
        C1869607Ty c1869607Ty = (C1869607Ty) obj;
        return Float.compare(this.LL, c1869607Ty.LL) == 0 && this.LLILLJJLI == c1869607Ty.LLILLJJLI;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TabletAdaptionResultOperator(cropRatio=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", cropped=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final float getCropRatio() {
        return this.LL;
    }

    public final boolean getCropped() {
        return this.LLILLJJLI;
    }

    public C1869607Ty(float f, boolean z) {
        this.LL = f;
        this.LLILLJJLI = z;
    }
}

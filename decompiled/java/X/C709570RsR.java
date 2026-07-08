package X;

/* JADX INFO: renamed from: X.0RsR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C709570RsR implements InterfaceC0148002o {
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final float LLILLL;
    public final int LLILZ;
    public final int LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C709570RsR)) {
            return false;
        }
        C709570RsR c709570RsR = (C709570RsR) obj;
        return this.LL == c709570RsR.LL && this.LLILLJJLI == c709570RsR.LLILLJJLI && Float.compare(this.LLILLL, c709570RsR.LLILLL) == 0 && this.LLILZ == c709570RsR.LLILZ && this.LLILZIL == c709570RsR.LLILZIL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoFeedRightBottomEntranceState(visible=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", containerVisible=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", containerAlpha=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", slotViewMarginBottom=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", remoteViewMarginBottom=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + Float.floatToIntBits(this.LLILLL)) * 31) + this.LLILZ) * 31) + this.LLILZIL;
    }

    public C709570RsR(float f, int i, int i2, boolean z, boolean z2) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = f;
        this.LLILZ = i;
        this.LLILZIL = i2;
    }

    public static C709570RsR LIZ(C709570RsR c709570RsR, boolean z, boolean z2, float f, int i, int i2, int i3) {
        int i4 = i2;
        int i5 = i;
        float f2 = f;
        boolean z3 = z2;
        boolean z4 = z;
        if ((i3 & 1) != 0) {
            z4 = c709570RsR.LL;
        }
        if ((i3 & 2) != 0) {
            z3 = c709570RsR.LLILLJJLI;
        }
        if ((i3 & 4) != 0) {
            f2 = c709570RsR.LLILLL;
        }
        if ((i3 & 8) != 0) {
            i5 = c709570RsR.LLILZ;
        }
        if ((i3 & 16) != 0) {
            i4 = c709570RsR.LLILZIL;
        }
        c709570RsR.getClass();
        return new C709570RsR(f2, i5, i4, z4, z3);
    }
}

package X;

/* JADX INFO: renamed from: X.16EB, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16EB implements InterfaceC0148002o {
    public final int LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final int LLILZ;
    public final int LLILZIL;

    public C16EB() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16EB)) {
            return false;
        }
        C16EB c16eb = (C16EB) obj;
        return this.LL == c16eb.LL && this.LLILLJJLI == c16eb.LLILLJJLI && this.LLILLL == c16eb.LLILLL && this.LLILZ == c16eb.LLILZ && this.LLILZIL == c16eb.LLILZIL;
    }

    public final int hashCode() {
        return (((((((this.LL * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ) * 31) + this.LLILZIL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoProgressBarState(volume=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isCurrentShowing=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", awesomeSplashing=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", maxProgress=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C16EB(int i) {
        this(-1, 0, 0, false, false);
    }

    public C16EB(int i, int i2, int i3, boolean z, boolean z2) {
        this.LL = i;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = i2;
        this.LLILZIL = i3;
    }

    public static C16EB LIZ(C16EB c16eb, boolean z, boolean z2, int i, int i2, int i3) {
        int i4;
        int i5 = i2;
        int i6 = i;
        boolean z3 = z2;
        boolean z4 = z;
        if ((i3 & 1) != 0) {
            i4 = c16eb.LL;
        } else {
            i4 = 0;
        }
        if ((i3 & 2) != 0) {
            z4 = c16eb.LLILLJJLI;
        }
        if ((i3 & 4) != 0) {
            z3 = c16eb.LLILLL;
        }
        if ((i3 & 8) != 0) {
            i6 = c16eb.LLILZ;
        }
        if ((i3 & 16) != 0) {
            i5 = c16eb.LLILZIL;
        }
        c16eb.getClass();
        return new C16EB(i4, i6, i5, z4, z3);
    }
}

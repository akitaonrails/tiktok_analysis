package X;

/* JADX INFO: renamed from: X.0Qnt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C681270Qnt implements InterfaceC0148002o {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final long LLILZ;
    public final boolean LLILZIL;

    public C681270Qnt() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C681270Qnt)) {
            return false;
        }
        C681270Qnt c681270Qnt = (C681270Qnt) obj;
        return this.LL == c681270Qnt.LL && this.LLILLJJLI == c681270Qnt.LLILLJJLI && this.LLILLL == c681270Qnt.LLILLL && this.LLILZ == c681270Qnt.LLILZ && this.LLILZIL == c681270Qnt.LLILZIL;
    }

    public final int hashCode() {
        return (((((((this.LL * 31) + this.LLILLJJLI) * 31) + this.LLILLL) * 31) + C786410Ut5.Y2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChooseSearchMusicStateParams(currentState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", previousState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", secondPreviousState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", searchTime=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", enteredResultPage=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C681270Qnt(int i) {
        this(1, -1, -1, 0L, false);
    }

    public C681270Qnt(int i, int i2, int i3, long j, boolean z) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = j;
        this.LLILZIL = z;
    }

    public static C681270Qnt LIZ(C681270Qnt c681270Qnt, int i, int i2, int i3, long j, boolean z, int i4) {
        long j2 = j;
        int i5 = i3;
        int i6 = i2;
        boolean z2 = z;
        int i7 = i;
        if ((i4 & 1) != 0) {
            i7 = c681270Qnt.LL;
        }
        if ((i4 & 2) != 0) {
            i6 = c681270Qnt.LLILLJJLI;
        }
        if ((i4 & 4) != 0) {
            i5 = c681270Qnt.LLILLL;
        }
        if ((i4 & 8) != 0) {
            j2 = c681270Qnt.LLILZ;
        }
        if ((i4 & 16) != 0) {
            z2 = c681270Qnt.LLILZIL;
        }
        c681270Qnt.getClass();
        return new C681270Qnt(i7, i6, i5, j2, z2);
    }
}

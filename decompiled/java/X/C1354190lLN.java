package X;

/* JADX INFO: renamed from: X.0lLN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1354190lLN implements InterfaceC0148002o {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1354190lLN)) {
            return false;
        }
        C1354190lLN c1354190lLN = (C1354190lLN) obj;
        return this.LL == c1354190lLN.LL && this.LLILLJJLI == c1354190lLN.LLILLJJLI && this.LLILLL == c1354190lLN.LLILLL;
    }

    public final int hashCode() {
        return (((this.LL * 31) + this.LLILLJJLI) * 31) + this.LLILLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TitlePanelRootState(rootHeight=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", sheetHeight=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", bottomHeight=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1354190lLN(int i, int i2, int i3) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
    }

    public static C1354190lLN LIZ(C1354190lLN c1354190lLN, int i, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = c1354190lLN.LL;
        }
        if ((i4 & 2) != 0) {
            i2 = c1354190lLN.LLILLJJLI;
        }
        if ((i4 & 4) != 0) {
            i3 = c1354190lLN.LLILLL;
        }
        c1354190lLN.getClass();
        return new C1354190lLN(i, i2, i3);
    }
}

package X;

/* JADX INFO: renamed from: X.0Iqt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C479290Iqt implements InterfaceC0148002o {
    public final long LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;

    public C479290Iqt() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C479290Iqt)) {
            return false;
        }
        C479290Iqt c479290Iqt = (C479290Iqt) obj;
        return this.LL == c479290Iqt.LL && this.LLILLJJLI == c479290Iqt.LLILLJJLI && this.LLILLL == c479290Iqt.LLILLL && this.LLILZ == c479290Iqt.LLILZ;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Y2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveHangoutV2SelectionState(eventId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selected=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isFirstEnterHangout=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", hasInitTopTab=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C479290Iqt(int i) {
        this(0L, false, true, false);
    }

    public C479290Iqt(long j, boolean z, boolean z2, boolean z3) {
        this.LL = j;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
    }
}

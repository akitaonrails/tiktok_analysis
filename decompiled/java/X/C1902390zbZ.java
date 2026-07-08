package X;

/* JADX INFO: renamed from: X.0zbZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1902390zbZ implements InterfaceC0148002o {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;

    public C1902390zbZ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1902390zbZ)) {
            return false;
        }
        C1902390zbZ c1902390zbZ = (C1902390zbZ) obj;
        return this.LL == c1902390zbZ.LL && this.LLILLJJLI == c1902390zbZ.LLILLJJLI && this.LLILLL == c1902390zbZ.LLILLL && this.LLILZ == c1902390zbZ.LLILZ;
    }

    public final int hashCode() {
        return (((((this.LL * 31) + this.LLILLJJLI) * 31) + this.LLILLL) * 31) + this.LLILZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MergedNotificationState(activityFilterType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", activityGroup=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", followerFilterType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", followerGroup=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1902390zbZ(int i) {
        this(13, 602, 9, 533);
    }

    public C1902390zbZ(int i, int i2, int i3, int i4) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = i4;
    }
}

package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uOJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1701970uOJ implements Comparable<C1701970uOJ> {
    public final String LL;
    public int LLILLJJLI = Integer.MAX_VALUE;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1701970uOJ)) {
            return false;
        }
        C1701970uOJ c1701970uOJ = (C1701970uOJ) obj;
        return Intrinsics.LJFF(this.LL, c1701970uOJ.LL) && this.LLILLJJLI == c1701970uOJ.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AidPosInfo(aid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", minPosition=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1701970uOJ(String str) {
        this.LL = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C1701970uOJ c1701970uOJ) {
        return this.LLILLJJLI - c1701970uOJ.LLILLJJLI;
    }
}

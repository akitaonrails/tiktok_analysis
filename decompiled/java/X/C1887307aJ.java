package X;

/* JADX INFO: renamed from: X.07aJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1887307aJ implements Comparable<C1887307aJ> {
    public final String LL;
    public final long LLILLJJLI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnrEntry{stack='");
        sbLIZ.append(this.LL);
        sbLIZ.append('\'');
        sbLIZ.append(" stackCost=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C1887307aJ c1887307aJ) {
        long j = this.LLILLJJLI;
        long j2 = c1887307aJ.LLILLJJLI;
        if (j > j2) {
            return -1;
        }
        if (j < j2) {
            return 1;
        }
        return 0;
    }

    public C1887307aJ(String str, long j) {
        this.LL = str;
        this.LLILLJJLI = j;
    }
}

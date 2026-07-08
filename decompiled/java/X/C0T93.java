package X;

/* JADX INFO: renamed from: X.0T93, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T93 implements Comparable<C0T93> {
    public final int LL;
    public final int LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0T93)) {
            return false;
        }
        C0T93 c0t93 = (C0T93) obj;
        return this.LL == c0t93.LL && this.LLILLJJLI == c0t93.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL * 31) + this.LLILLJJLI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CardPriorityData(type=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C0T93 c0t93) {
        return this.LLILLJJLI - c0t93.LLILLJJLI;
    }

    public C0T93(int i, int i2) {
        this.LL = i;
        this.LLILLJJLI = i2;
    }
}

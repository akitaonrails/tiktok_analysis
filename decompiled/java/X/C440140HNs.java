package X;

/* JADX INFO: renamed from: X.0HNs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C440140HNs implements InterfaceC0148002o {
    public final boolean LL;
    public final boolean LLILLJJLI;

    public C440140HNs() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C440140HNs)) {
            return false;
        }
        C440140HNs c440140HNs = (C440140HNs) obj;
        return this.LL == c440140HNs.LL && this.LLILLJJLI == c440140HNs.LLILLJJLI;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EasterEggForShareState(enableSamePost=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enableVideoOverflow=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C440140HNs(boolean z, boolean z2) {
        this.LL = z;
        this.LLILLJJLI = z2;
    }
}

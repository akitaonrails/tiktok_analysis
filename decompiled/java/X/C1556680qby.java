package X;

/* JADX INFO: renamed from: X.0qby, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556680qby implements InterfaceC0148002o {
    public final int LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1556680qby)) {
            return false;
        }
        C1556680qby c1556680qby = (C1556680qby) obj;
        return this.LL == c1556680qby.LL && this.LLILLJJLI == c1556680qby.LLILLJJLI && this.LLILLL == c1556680qby.LLILLL;
    }

    public final int hashCode() {
        return (((this.LL * 31) + this.LLILLJJLI) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FootNoteRatingCardAnimationState(fullTextHeight=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", truncatedTextHeight=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", expand=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1556680qby(int i, int i2, boolean z) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = z;
    }
}

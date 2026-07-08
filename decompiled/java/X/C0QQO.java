package X;

/* JADX INFO: renamed from: X.0QQO, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QQO implements InterfaceC0148002o {
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0QQO)) {
            return false;
        }
        C0QQO c0qqo = (C0QQO) obj;
        return this.LL == c0qqo.LL && this.LLILLJJLI == c0qqo.LLILLJJLI && this.LLILLL == c0qqo.LLILLL;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchRelatedSuggestionState(canLongPress=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", inBlackList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", viewActivated=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0QQO(boolean z, boolean z2, boolean z3) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = z3;
    }
}

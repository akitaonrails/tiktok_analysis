package X;

/* JADX INFO: renamed from: X.0gZs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1170980gZs implements InterfaceC111300bX {
    public final int LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1170980gZs() {
        int i = 0;
        this(i, i, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1170980gZs)) {
            return false;
        }
        C1170980gZs c1170980gZs = (C1170980gZs) obj;
        return this.LL == c1170980gZs.LL && this.LLILLJJLI == c1170980gZs.LLILLJJLI && this.LLILLL == c1170980gZs.LLILLL;
    }

    public final int hashCode() {
        return (((this.LL * 31) + this.LLILLJJLI) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Config(type=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", maxEnableSelectCount=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isOwnerOfCollection=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1170980gZs(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? Integer.MAX_VALUE : i2, false);
    }

    public C1170980gZs(int i, int i2, boolean z) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = z;
    }
}

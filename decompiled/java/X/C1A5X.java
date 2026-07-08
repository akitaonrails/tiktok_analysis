package X;

/* JADX INFO: renamed from: X.1A5X, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A5X implements InterfaceC0148002o {
    public final C1A5S LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;

    public C1A5X() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1A5X)) {
            return false;
        }
        C1A5X c1a5x = (C1A5X) obj;
        return this.LL == c1a5x.LL && this.LLILLJJLI == c1a5x.LLILLJJLI && this.LLILLL == c1a5x.LLILLL;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchInteractionState(likeState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", shareEnable=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", likeEnable=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1A5X(int i) {
        this(C1A5S.DEFAULT, false, false);
    }

    public C1A5X(C1A5S c1a5s, boolean z, boolean z2) {
        this.LL = c1a5s;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
    }

    public static C1A5X LIZ(C1A5X c1a5x, C1A5S c1a5s, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            c1a5s = c1a5x.LL;
        }
        if ((i & 2) != 0) {
            z = c1a5x.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z2 = c1a5x.LLILLL;
        }
        c1a5x.getClass();
        return new C1A5X(c1a5s, z, z2);
    }
}

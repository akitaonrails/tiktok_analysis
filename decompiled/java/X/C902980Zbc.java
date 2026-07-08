package X;

/* JADX INFO: renamed from: X.0Zbc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C902980Zbc implements InterfaceC0148002o {
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;

    public C902980Zbc() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C902980Zbc)) {
            return false;
        }
        C902980Zbc c902980Zbc = (C902980Zbc) obj;
        return this.LL == c902980Zbc.LL && this.LLILLJJLI == c902980Zbc.LLILLJJLI && this.LLILLL == c902980Zbc.LLILLL;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NetworkUIState(hasNetwork=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hasOwnSendingMsg=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", hasShownNoNetworkUI=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C902980Zbc(int i) {
        this(true, false, false);
    }

    public C902980Zbc(boolean z, boolean z2, boolean z3) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = z3;
    }

    public static C902980Zbc LIZ(C902980Zbc c902980Zbc, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = c902980Zbc.LL;
        }
        if ((i & 2) != 0) {
            z2 = c902980Zbc.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z3 = c902980Zbc.LLILLL;
        }
        c902980Zbc.getClass();
        return new C902980Zbc(z, z2, z3);
    }
}

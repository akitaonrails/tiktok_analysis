package X;

/* JADX INFO: renamed from: X.0rxA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1608260rxA implements InterfaceC0148002o {
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;

    public C1608260rxA() {
        this(false, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1608260rxA)) {
            return false;
        }
        C1608260rxA c1608260rxA = (C1608260rxA) obj;
        return this.LL == c1608260rxA.LL && this.LLILLJJLI == c1608260rxA.LLILLJJLI;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendsV3AudioMuteState(isMute=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", navToDetail=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1608260rxA(boolean z, boolean z2) {
        boolean z3;
        this.LL = z;
        this.LLILLJJLI = z2;
        if (z && !z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LLILLL = z3;
    }

    public /* synthetic */ C1608260rxA(boolean z, int i) {
        this((i & 1) != 0 ? true : z, false);
    }

    public static C1608260rxA LIZ(C1608260rxA c1608260rxA, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = c1608260rxA.LL;
        }
        if ((i & 2) != 0) {
            z2 = c1608260rxA.LLILLJJLI;
        }
        c1608260rxA.getClass();
        return new C1608260rxA(z, z2);
    }
}

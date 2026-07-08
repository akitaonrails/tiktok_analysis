package X;

/* JADX INFO: renamed from: X.0ic3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1249210ic3 implements InterfaceC0148002o {
    public final int LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1249210ic3)) {
            return false;
        }
        C1249210ic3 c1249210ic3 = (C1249210ic3) obj;
        return this.LL == c1249210ic3.LL && this.LLILLJJLI == c1249210ic3.LLILLJJLI && this.LLILLL == c1249210ic3.LLILLL;
    }

    public final int hashCode() {
        return (((this.LL * 31) + this.LLILLJJLI) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddFriendsRedPointShowState(alertType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", showNumber=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", shouldShow=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1249210ic3(int i, int i2, boolean z) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = z;
    }
}

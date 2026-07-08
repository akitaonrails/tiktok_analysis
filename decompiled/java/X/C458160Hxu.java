package X;

/* JADX INFO: renamed from: X.0Hxu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C458160Hxu implements InterfaceC0148002o {
    public final int LL;
    public final int LLILLJJLI;

    public C458160Hxu() {
        this(0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C458160Hxu)) {
            return false;
        }
        C458160Hxu c458160Hxu = (C458160Hxu) obj;
        return this.LL == c458160Hxu.LL && this.LLILLJJLI == c458160Hxu.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL * 31) + this.LLILLJJLI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChatroomHeightVMState(height=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", titleBarHeight=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C458160Hxu(int i, int i2) {
        this.LL = i;
        this.LLILLJJLI = i2;
    }
}

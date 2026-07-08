package X;

/* JADX INFO: renamed from: X.0Hx4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C457640Hx4 implements InterfaceC0148002o {
    public final int LL;
    public final int LLILLJJLI;

    public C457640Hx4() {
        this(0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C457640Hx4)) {
            return false;
        }
        C457640Hx4 c457640Hx4 = (C457640Hx4) obj;
        return this.LL == c457640Hx4.LL && this.LLILLJJLI == c457640Hx4.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL * 31) + this.LLILLJJLI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InputSizeState(heightWithPanel=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", heightWithoutPanel=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C457640Hx4(int i, int i2) {
        this.LL = i;
        this.LLILLJJLI = i2;
    }
}

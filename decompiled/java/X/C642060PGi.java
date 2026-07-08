package X;

/* JADX INFO: renamed from: X.0PGi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C642060PGi implements InterfaceC0148002o {
    public final int LL;
    public final int LLILLJJLI;

    public C642060PGi() {
        this(0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C642060PGi)) {
            return false;
        }
        C642060PGi c642060PGi = (C642060PGi) obj;
        return this.LL == c642060PGi.LL && this.LLILLJJLI == c642060PGi.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL * 31) + this.LLILLJJLI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchTop1BgState(fixedAreaBgHeight=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", scrolledAreaHeight=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C642060PGi(int i, int i2) {
        this.LL = i;
        this.LLILLJJLI = i2;
    }
}

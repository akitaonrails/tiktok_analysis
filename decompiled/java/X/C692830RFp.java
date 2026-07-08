package X;

/* JADX INFO: renamed from: X.0RFp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C692830RFp implements InterfaceC0148002o {
    public final C0RQD LL;

    public C692830RFp() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C692830RFp) && this.LL == ((C692830RFp) obj).LL;
    }

    public final int hashCode() {
        C0RQD c0rqd = this.LL;
        if (c0rqd == null) {
            return 0;
        }
        return c0rqd.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClearScreenState(cleanMode=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C692830RFp(C0RQD c0rqd) {
        this.LL = c0rqd;
    }
}

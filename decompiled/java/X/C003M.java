package X;

/* JADX INFO: renamed from: X.003M, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C003M implements InterfaceC0148002o {
    public final boolean LL;

    public C003M() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C003M) && this.LL == ((C003M) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GeneralPostPaymentGuideState(loadingStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C003M(int i) {
        this.LL = false;
    }
}

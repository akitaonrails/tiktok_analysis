package X;

/* JADX INFO: renamed from: X.07t6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2003807t6 implements InterfaceC0148002o {
    public final boolean LL;

    public C2003807t6() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2003807t6) && this.LL == ((C2003807t6) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchLoadingState(isShowLoading=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2003807t6(boolean z) {
        this.LL = z;
    }
}

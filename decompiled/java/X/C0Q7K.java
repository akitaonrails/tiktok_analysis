package X;

/* JADX INFO: renamed from: X.0Q7K, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q7K implements InterfaceC0148002o {
    public final int LL;

    public C0Q7K() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0Q7K) && this.LL == ((C0Q7K) obj).LL;
    }

    public final int hashCode() {
        return this.LL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchTakoCardUIState(visibleThresholdStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0Q7K(int i) {
        this.LL = i;
    }
}

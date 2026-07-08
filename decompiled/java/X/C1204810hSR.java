package X;

/* JADX INFO: renamed from: X.0hSR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1204810hSR implements InterfaceC1204490hRv {
    public final long LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1204810hSR) && this.LL == ((C1204810hSR) obj).LL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NearbyAskLocationChangenModel(insertTime=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1204810hSR() {
        this(0L);
    }

    public C1204810hSR(long j) {
        this.LL = j;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1204810hSR c1204810hSR;
        if (interfaceC1891350zJl instanceof C1204810hSR) {
            c1204810hSR = (C1204810hSR) interfaceC1891350zJl;
        } else {
            c1204810hSR = null;
        }
        if (c1204810hSR == null || c1204810hSR.LL != this.LL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1204810hSR c1204810hSR;
        if (interfaceC1891350zJl instanceof C1204810hSR) {
            c1204810hSR = (C1204810hSR) interfaceC1891350zJl;
        } else {
            c1204810hSR = null;
        }
        if (c1204810hSR == null || c1204810hSR.LL != this.LL) {
            return false;
        }
        return true;
    }
}

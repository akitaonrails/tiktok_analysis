package X;

/* JADX INFO: renamed from: X.06Ju, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1588406Ju implements InterfaceC0148002o {
    public final boolean LL;

    public C1588406Ju() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1588406Ju) && this.LL == ((C1588406Ju) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChatRoomLoadingSpinnerState(showSpinner=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1588406Ju(boolean z) {
        this.LL = z;
    }
}

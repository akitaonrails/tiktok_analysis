package X;

/* JADX INFO: renamed from: X.0Ckb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C322510Ckb implements InterfaceC0148002o {
    public final boolean LL;
    public final int LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C322510Ckb)) {
            return false;
        }
        C322510Ckb c322510Ckb = (C322510Ckb) obj;
        return this.LL == c322510Ckb.LL && this.LLILLJJLI == c322510Ckb.LLILLJJLI;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoFeedRightBottomEntranceFixedState(visible=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", remoteViewMarginBottom=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C322510Ckb(boolean z, int i) {
        this.LL = z;
        this.LLILLJJLI = i;
    }
}

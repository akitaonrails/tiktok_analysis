package X;

/* JADX INFO: renamed from: X.0HnD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C451530HnD implements InterfaceC0148002o {
    public final boolean LL;

    public C451530HnD() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C451530HnD) && this.LL == ((C451530HnD) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EmojiPanelShowingState(isPanelShowing=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C451530HnD(boolean z) {
        this.LL = z;
    }
}

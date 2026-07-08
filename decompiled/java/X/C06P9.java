package X;

/* JADX INFO: renamed from: X.06P9, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06P9 implements InterfaceC0148002o {
    public final int LL;

    public C06P9() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C06P9) && this.LL == ((C06P9) obj).LL;
    }

    public final int hashCode() {
        return this.LL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddStickerToFavVMState(favAddedCount=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C06P9(int i) {
        this.LL = i;
    }
}

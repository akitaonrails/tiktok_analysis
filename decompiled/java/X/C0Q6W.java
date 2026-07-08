package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q6W, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q6W implements InterfaceC0148002o {
    public final C657890PrH LL;
    public final Integer LLILLJJLI;

    public C0Q6W() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Q6W)) {
            return false;
        }
        C0Q6W c0q6w = (C0Q6W) obj;
        return Intrinsics.LJFF(this.LL, c0q6w.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0q6w.LLILLJJLI);
    }

    public final int hashCode() {
        C657890PrH c657890PrH = this.LL;
        int iHashCode = (c657890PrH == null ? 0 : c657890PrH.hashCode()) * 31;
        Integer num = this.LLILLJJLI;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchHelpPostCardState(itemData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", itemPosition=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0Q6W(C657890PrH c657890PrH, Integer num) {
        this.LL = c657890PrH;
        this.LLILLJJLI = num;
    }
}

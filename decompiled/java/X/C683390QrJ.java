package X;

import android.view.View;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QrJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C683390QrJ implements InterfaceC0148002o {
    public final AbstractC683420QrM LL;
    public final View LLILLJJLI;
    public final View LLILLL;
    public final int LLILZ;
    public final Pair<Boolean, EnumC668970QLv> LLILZIL;

    public C683390QrJ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C683390QrJ)) {
            return false;
        }
        C683390QrJ c683390QrJ = (C683390QrJ) obj;
        return Intrinsics.LJFF(this.LL, c683390QrJ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c683390QrJ.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c683390QrJ.LLILLL) && this.LLILZ == c683390QrJ.LLILZ && Intrinsics.LJFF(this.LLILZIL, c683390QrJ.LLILZIL);
    }

    public final int hashCode() {
        AbstractC683420QrM abstractC683420QrM = this.LL;
        int iHashCode = (abstractC683420QrM == null ? 0 : abstractC683420QrM.hashCode()) * 31;
        View view = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (view == null ? 0 : view.hashCode())) * 31;
        View view2 = this.LLILLL;
        return ((((iHashCode2 + (view2 != null ? view2.hashCode() : 0)) * 31) + this.LLILZ) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchCartState(dataState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", canvasView=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", lynxContainerView=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", cartItemCount=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", enableEntranceShow=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C683390QrJ(int i) {
        this(null, null, null, -1, new Pair(Boolean.FALSE, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C683390QrJ(AbstractC683420QrM abstractC683420QrM, View view, View view2, int i, Pair<Boolean, ? extends EnumC668970QLv> pair) {
        this.LL = abstractC683420QrM;
        this.LLILLJJLI = view;
        this.LLILLL = view2;
        this.LLILZ = i;
        this.LLILZIL = pair;
    }

    public static C683390QrJ LIZ(C683390QrJ c683390QrJ, AbstractC683420QrM abstractC683420QrM, View view, View view2, int i, Pair pair, int i2) {
        Pair pair2 = pair;
        int i3 = i;
        View view3 = view2;
        View view4 = view;
        AbstractC683420QrM abstractC683420QrM2 = abstractC683420QrM;
        if ((i2 & 1) != 0) {
            abstractC683420QrM2 = c683390QrJ.LL;
        }
        if ((i2 & 2) != 0) {
            view4 = c683390QrJ.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            view3 = c683390QrJ.LLILLL;
        }
        if ((i2 & 8) != 0) {
            i3 = c683390QrJ.LLILZ;
        }
        if ((i2 & 16) != 0) {
            pair2 = c683390QrJ.LLILZIL;
        }
        c683390QrJ.getClass();
        return new C683390QrJ(abstractC683420QrM2, view4, view3, i3, pair2);
    }
}

package X;

import com.ss.android.ugc.aweme.tako.otherpage.share.api.ShareMessageResponse;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gIU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1160200gIU implements InterfaceC0148002o {
    public final C291001Au<Boolean> LL;
    public final C291001Au<Unit> LLILLJJLI;
    public final C291001Au<Unit> LLILLL;
    public final C291001Au<Boolean> LLILZ;
    public final AbstractC1623806Xk<ShareMessageResponse> LLILZIL;

    public C1160200gIU() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1160200gIU)) {
            return false;
        }
        C1160200gIU c1160200gIU = (C1160200gIU) obj;
        return Intrinsics.LJFF(this.LL, c1160200gIU.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1160200gIU.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1160200gIU.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1160200gIU.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1160200gIU.LLILZIL);
    }

    public final int hashCode() {
        return (((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoMultipleSelectState(multipleSelectEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", cancelMultipleEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", dismissMultipleEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", actionState=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", shareMessage=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1160200gIU(int i) {
        Boolean bool = Boolean.FALSE;
        this(new C291001Au(bool), new C291001Au(null), new C291001Au(null), new C291001Au(bool), C491101vh.LIZ);
    }

    public C1160200gIU(C291001Au<Boolean> c291001Au, C291001Au<Unit> c291001Au2, C291001Au<Unit> c291001Au3, C291001Au<Boolean> c291001Au4, AbstractC1623806Xk<ShareMessageResponse> abstractC1623806Xk) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = c291001Au3;
        this.LLILZ = c291001Au4;
        this.LLILZIL = abstractC1623806Xk;
    }

    public static C1160200gIU LIZ(C1160200gIU c1160200gIU, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, AbstractC1623806Xk abstractC1623806Xk, int i) {
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        C291001Au c291001Au5 = c291001Au4;
        C291001Au c291001Au6 = c291001Au3;
        C291001Au c291001Au7 = c291001Au2;
        C291001Au c291001Au8 = c291001Au;
        if ((i & 1) != 0) {
            c291001Au8 = c1160200gIU.LL;
        }
        if ((i & 2) != 0) {
            c291001Au7 = c1160200gIU.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au6 = c1160200gIU.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au5 = c1160200gIU.LLILZ;
        }
        if ((i & 16) != 0) {
            abstractC1623806Xk2 = c1160200gIU.LLILZIL;
        }
        c1160200gIU.getClass();
        return new C1160200gIU(c291001Au8, c291001Au7, c291001Au6, c291001Au5, abstractC1623806Xk2);
    }
}

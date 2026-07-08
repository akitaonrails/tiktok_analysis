package X;

import com.ss.android.ugc.tiktok.tns.userrelation.hideaccount.HiddenItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gT1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1166730gT1 implements InterfaceC0148002o {
    public final List<HiddenItem> LL;
    public final AbstractC1623806Xk<Boolean> LLILLJJLI;
    public final AbstractC1623806Xk<Boolean> LLILLL;
    public final C291001Au<String> LLILZ;

    public C1166730gT1() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1166730gT1)) {
            return false;
        }
        C1166730gT1 c1166730gT1 = (C1166730gT1) obj;
        return Intrinsics.LJFF(this.LL, c1166730gT1.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1166730gT1.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1166730gT1.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1166730gT1.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        C291001Au<String> c291001Au = this.LLILZ;
        return iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HideAccountUIState(hideAccountList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", refreshState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", loadMoreState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", showToastEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1166730gT1(int i) {
        ArrayList arrayList = new ArrayList();
        C491101vh c491101vh = C491101vh.LIZ;
        this(arrayList, c491101vh, c491101vh, null);
    }

    public C1166730gT1(List<HiddenItem> list, AbstractC1623806Xk<Boolean> abstractC1623806Xk, AbstractC1623806Xk<Boolean> abstractC1623806Xk2, C291001Au<String> c291001Au) {
        this.LL = list;
        this.LLILLJJLI = abstractC1623806Xk;
        this.LLILLL = abstractC1623806Xk2;
        this.LLILZ = c291001Au;
    }

    public static C1166730gT1 LIZ(C1166730gT1 c1166730gT1, List list, AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk abstractC1623806Xk2, C291001Au c291001Au, int i) {
        if ((i & 1) != 0) {
            list = c1166730gT1.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk = c1166730gT1.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            abstractC1623806Xk2 = c1166730gT1.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au = c1166730gT1.LLILZ;
        }
        c1166730gT1.getClass();
        return new C1166730gT1(list, abstractC1623806Xk, abstractC1623806Xk2, c291001Au);
    }
}

package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hvk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1222980hvk implements InterfaceC0148002o {
    public final EnumC1223000hvm LL;
    public final List<C1164490gPP> LLILLJJLI;
    public final C1075800e6M LLILLL;
    public final EnumC1223020hvo LLILZ;
    public final ArrayList<String> LLILZIL;
    public final ArrayList<String> LLILZLL;
    public final C291001Au<Boolean> LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1222980hvk)) {
            return false;
        }
        C1222980hvk c1222980hvk = (C1222980hvk) obj;
        return this.LL == c1222980hvk.LL && Intrinsics.LJFF(this.LLILLJJLI, c1222980hvk.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1222980hvk.LLILLL) && this.LLILZ == c1222980hvk.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1222980hvk.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1222980hvk.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1222980hvk.LLIZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31;
        C291001Au<Boolean> c291001Au = this.LLIZ;
        return iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MutualRelationListPageVMState(mutualRelationSourceState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", mutualRelationList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", mafSourceState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", pageState=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", toUidList=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", toSecUidList=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", blockEvent=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1222980hvk(EnumC1223000hvm enumC1223000hvm, List<C1164490gPP> list, C1075800e6M c1075800e6M, EnumC1223020hvo enumC1223020hvo, ArrayList<String> arrayList, ArrayList<String> arrayList2, C291001Au<Boolean> c291001Au) {
        this.LL = enumC1223000hvm;
        this.LLILLJJLI = list;
        this.LLILLL = c1075800e6M;
        this.LLILZ = enumC1223020hvo;
        this.LLILZIL = arrayList;
        this.LLILZLL = arrayList2;
        this.LLIZ = c291001Au;
    }

    public static C1222980hvk LIZ(C1222980hvk c1222980hvk, EnumC1223000hvm enumC1223000hvm, List list, C1075800e6M c1075800e6M, EnumC1223020hvo enumC1223020hvo, ArrayList arrayList, ArrayList arrayList2, C291001Au c291001Au, int i) {
        C291001Au c291001Au2 = c291001Au;
        ArrayList arrayList3 = arrayList2;
        ArrayList arrayList4 = arrayList;
        EnumC1223020hvo enumC1223020hvo2 = enumC1223020hvo;
        C1075800e6M c1075800e6M2 = c1075800e6M;
        List list2 = list;
        EnumC1223000hvm enumC1223000hvm2 = enumC1223000hvm;
        if ((i & 1) != 0) {
            enumC1223000hvm2 = c1222980hvk.LL;
        }
        if ((i & 2) != 0) {
            list2 = c1222980hvk.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c1075800e6M2 = c1222980hvk.LLILLL;
        }
        if ((i & 8) != 0) {
            enumC1223020hvo2 = c1222980hvk.LLILZ;
        }
        if ((i & 16) != 0) {
            arrayList4 = c1222980hvk.LLILZIL;
        }
        if ((i & 32) != 0) {
            arrayList3 = c1222980hvk.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au2 = c1222980hvk.LLIZ;
        }
        c1222980hvk.getClass();
        return new C1222980hvk(enumC1223000hvm2, list2, c1075800e6M2, enumC1223020hvo2, arrayList4, arrayList3, c291001Au2);
    }
}

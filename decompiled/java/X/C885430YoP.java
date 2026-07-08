package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YoP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C885430YoP implements InterfaceC0148002o {
    public final EnumC880850Yh1 LL;
    public final List<AbstractC885540Yoa<?>> LLILLJJLI;
    public final C878960Ydy LLILLL;
    public final C878960Ydy LLILZ;
    public final List<AbstractC885540Yoa<?>> LLILZIL;
    public final boolean LLILZLL;
    public final C291001Au<Boolean> LLIZ;

    public C885430YoP() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C885430YoP)) {
            return false;
        }
        C885430YoP c885430YoP = (C885430YoP) obj;
        return this.LL == c885430YoP.LL && Intrinsics.LJFF(this.LLILLJJLI, c885430YoP.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c885430YoP.LLILLL) && Intrinsics.LJFF(this.LLILZ, c885430YoP.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c885430YoP.LLILZIL) && this.LLILZLL == c885430YoP.LLILZLL && Intrinsics.LJFF(this.LLIZ, c885430YoP.LLIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        List<AbstractC885540Yoa<?>> list = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        C878960Ydy c878960Ydy = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c878960Ydy == null ? 0 : c878960Ydy.hashCode())) * 31;
        C878960Ydy c878960Ydy2 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (c878960Ydy2 == null ? 0 : c878960Ydy2.hashCode())) * 31;
        List<AbstractC885540Yoa<?>> list2 = this.LLILZIL;
        int iHashCode5 = (((iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31;
        C291001Au<Boolean> c291001Au = this.LLIZ;
        return iHashCode5 + (c291001Au != null ? c291001Au.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageRequestListStateV2(listMode=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", chatItemList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", selectedPage=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", priorityPage=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", priorityItemList=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", finishActivity=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", scrollToTopEvent=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C885430YoP(int i) {
        this(EnumC880850Yh1.NORMAL, null, null, null, C13BV.INSTANCE, false, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C885430YoP(EnumC880850Yh1 enumC880850Yh1, List<? extends AbstractC885540Yoa<?>> list, C878960Ydy c878960Ydy, C878960Ydy c878960Ydy2, List<? extends AbstractC885540Yoa<?>> list2, boolean z, C291001Au<Boolean> c291001Au) {
        this.LL = enumC880850Yh1;
        this.LLILLJJLI = list;
        this.LLILLL = c878960Ydy;
        this.LLILZ = c878960Ydy2;
        this.LLILZIL = list2;
        this.LLILZLL = z;
        this.LLIZ = c291001Au;
    }

    public static C885430YoP LIZ(C885430YoP c885430YoP, EnumC880850Yh1 enumC880850Yh1, List list, C878960Ydy c878960Ydy, C878960Ydy c878960Ydy2, List list2, boolean z, C291001Au c291001Au, int i) {
        C291001Au c291001Au2 = c291001Au;
        boolean z2 = z;
        List list3 = list2;
        C878960Ydy c878960Ydy3 = c878960Ydy2;
        C878960Ydy c878960Ydy4 = c878960Ydy;
        List list4 = list;
        EnumC880850Yh1 enumC880850Yh12 = enumC880850Yh1;
        if ((i & 1) != 0) {
            enumC880850Yh12 = c885430YoP.LL;
        }
        if ((i & 2) != 0) {
            list4 = c885430YoP.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c878960Ydy4 = c885430YoP.LLILLL;
        }
        if ((i & 8) != 0) {
            c878960Ydy3 = c885430YoP.LLILZ;
        }
        if ((i & 16) != 0) {
            list3 = c885430YoP.LLILZIL;
        }
        if ((i & 32) != 0) {
            z2 = c885430YoP.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au2 = c885430YoP.LLIZ;
        }
        c885430YoP.getClass();
        return new C885430YoP(enumC880850Yh12, list4, c878960Ydy4, c878960Ydy3, list3, z2, c291001Au2);
    }
}

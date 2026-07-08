package X;

import java.util.List;
import java.util.concurrent.ConcurrentMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0u1B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1687630u1B implements InterfaceC0148002o {
    public final List<C1687730u1L> LL;
    public final List<C1687730u1L> LLILLJJLI;
    public final EnumC1687770u1P LLILLL;
    public final EnumC1687600u18 LLILZ;
    public final ConcurrentMap<String, Boolean> LLILZIL;
    public final Function1<AbstractC1152880g6g, Unit> LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1687630u1B)) {
            return false;
        }
        C1687630u1B c1687630u1B = (C1687630u1B) obj;
        return Intrinsics.LJFF(this.LL, c1687630u1B.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1687630u1B.LLILLJJLI) && this.LLILLL == c1687630u1B.LLILLL && this.LLILZ == c1687630u1B.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1687630u1B.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1687630u1B.LLILZLL);
    }

    public final int hashCode() {
        return (((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NearByUsersVMState(userList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", newFollowerList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", bluetoothPermission=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", pageState=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", userShowReportedMap=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", userEventSink=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1687630u1B(List<C1687730u1L> list, List<C1687730u1L> list2, EnumC1687770u1P enumC1687770u1P, EnumC1687600u18 enumC1687600u18, ConcurrentMap<String, Boolean> concurrentMap, Function1<? super AbstractC1152880g6g, Unit> function1) {
        this.LL = list;
        this.LLILLJJLI = list2;
        this.LLILLL = enumC1687770u1P;
        this.LLILZ = enumC1687600u18;
        this.LLILZIL = concurrentMap;
        this.LLILZLL = function1;
    }

    public static C1687630u1B LIZ(C1687630u1B c1687630u1B, List list, List list2, EnumC1687770u1P enumC1687770u1P, EnumC1687600u18 enumC1687600u18, ConcurrentMap concurrentMap, int i) {
        Function1<AbstractC1152880g6g, Unit> function1;
        ConcurrentMap concurrentMap2 = concurrentMap;
        EnumC1687600u18 enumC1687600u182 = enumC1687600u18;
        EnumC1687770u1P enumC1687770u1P2 = enumC1687770u1P;
        List list3 = list2;
        List list4 = list;
        if ((i & 1) != 0) {
            list4 = c1687630u1B.LL;
        }
        if ((i & 2) != 0) {
            list3 = c1687630u1B.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            enumC1687770u1P2 = c1687630u1B.LLILLL;
        }
        if ((i & 8) != 0) {
            enumC1687600u182 = c1687630u1B.LLILZ;
        }
        if ((i & 16) != 0) {
            concurrentMap2 = c1687630u1B.LLILZIL;
        }
        if ((i & 32) != 0) {
            function1 = c1687630u1B.LLILZLL;
        } else {
            function1 = null;
        }
        c1687630u1B.getClass();
        return new C1687630u1B(list4, list3, enumC1687770u1P2, enumC1687600u182, concurrentMap2, function1);
    }
}

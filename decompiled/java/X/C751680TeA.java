package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TeA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C751680TeA implements InterfaceC1891350zJl {
    public final C750740Tce LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C751680TeA) && Intrinsics.LJFF(this.LL, ((C751680TeA) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveModeratorItem(adminUser=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C751680TeA(C750740Tce c750740Tce) {
        this.LL = c750740Tce;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        Integer num;
        C751680TeA c751680TeA;
        C750740Tce c750740Tce;
        Map<Integer, Integer> map;
        Map<Integer, Integer> map2 = this.LL.LJIIIZ;
        Integer num2 = null;
        if (map2 != null && (num = map2.get(17)) != null) {
            if ((interfaceC1891350zJl instanceof C751680TeA) && (c751680TeA = (C751680TeA) interfaceC1891350zJl) != null && (c750740Tce = c751680TeA.LL) != null && (map = c750740Tce.LJIIIZ) != null) {
                num2 = map.get(17);
            }
            if (Intrinsics.LJFF(num, num2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C751680TeA c751680TeA;
        C750740Tce c750740Tce;
        if (interfaceC1891350zJl instanceof C751680TeA) {
            c751680TeA = (C751680TeA) interfaceC1891350zJl;
        } else {
            c751680TeA = null;
        }
        if (c751680TeA == null || (c750740Tce = c751680TeA.LL) == null || this.LL.LIZ != c750740Tce.LIZ) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        Integer num;
        if (interfaceC1891350zJl instanceof C751680TeA) {
            Map<Integer, Integer> map = this.LL.LJIIIZ;
            Integer num2 = null;
            if (map != null) {
                num = map.get(17);
            } else {
                num = null;
            }
            Map<Integer, Integer> map2 = ((C751680TeA) interfaceC1891350zJl).LL.LJIIIZ;
            if (map2 != null) {
                num2 = map2.get(17);
            }
            if (num != null && num2 != null && !Intrinsics.LJFF(num, num2)) {
                return 1;
            }
        }
        return 0;
    }
}

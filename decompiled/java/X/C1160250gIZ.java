package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gIZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1160250gIZ implements InterfaceC0148002o {
    public final AbstractC1623806Xk<List<C1170820gZc>> LL;
    public final boolean LLILLJJLI;
    public final long LLILLL;
    public final boolean LLILZ;
    public final C291001Au<Integer> LLILZIL;

    public C1160250gIZ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1160250gIZ)) {
            return false;
        }
        C1160250gIZ c1160250gIZ = (C1160250gIZ) obj;
        return Intrinsics.LJFF(this.LL, c1160250gIZ.LL) && this.LLILLJJLI == c1160250gIZ.LLILLJJLI && this.LLILLL == c1160250gIZ.LLILLL && this.LLILZ == c1160250gIZ.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1160250gIZ.LLILZIL);
    }

    public final int hashCode() {
        return (((((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Y2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoCollectionListState(data=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hasCollectVideos=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", scrollToPosition=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1160250gIZ(int i) {
        this(C491101vh.LIZ, true, 0L, true, new C291001Au(0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1160250gIZ(AbstractC1623806Xk<? extends List<C1170820gZc>> abstractC1623806Xk, boolean z, long j, boolean z2, C291001Au<Integer> c291001Au) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = z;
        this.LLILLL = j;
        this.LLILZ = z2;
        this.LLILZIL = c291001Au;
    }

    public static C1160250gIZ LIZ(C1160250gIZ c1160250gIZ, AbstractC1623806Xk abstractC1623806Xk, boolean z, long j, boolean z2, C291001Au c291001Au, int i) {
        boolean z3 = z2;
        long j2 = j;
        boolean z4 = z;
        C291001Au c291001Au2 = c291001Au;
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        if ((i & 1) != 0) {
            abstractC1623806Xk2 = c1160250gIZ.LL;
        }
        if ((i & 2) != 0) {
            z4 = c1160250gIZ.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            j2 = c1160250gIZ.LLILLL;
        }
        if ((i & 8) != 0) {
            z3 = c1160250gIZ.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au2 = c1160250gIZ.LLILZIL;
        }
        c1160250gIZ.getClass();
        return new C1160250gIZ(abstractC1623806Xk2, z4, j2, z3, c291001Au2);
    }
}

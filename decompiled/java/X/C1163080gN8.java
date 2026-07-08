package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gN8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1163080gN8<T> implements InterfaceC111300bX {
    public final InterfaceC332260D0u<T> LL;
    public final InterfaceC332260D0u<String> LLILLJJLI;
    public final InterfaceC332260D0u<String> LLILLL;
    public Integer LLILZ;

    public C1163080gN8() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1163080gN8)) {
            return false;
        }
        C1163080gN8 c1163080gN8 = (C1163080gN8) obj;
        return Intrinsics.LJFF(this.LL, c1163080gN8.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1163080gN8.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1163080gN8.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1163080gN8.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        Integer num = this.LLILZ;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GlueHierarchyData(glueSubscriber=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", exposureSubscriber=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", unbindSubscriber=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1163080gN8(Object obj) {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(null);
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(null);
        C2252321DDq c2252321DDqLIZ3 = C1BNE.LIZ(null);
        this.LL = c2252321DDqLIZ;
        this.LLILLJJLI = c2252321DDqLIZ2;
        this.LLILLL = c2252321DDqLIZ3;
        this.LLILZ = -1;
    }
}

package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gN9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1163090gN9<T> implements InterfaceC111300bX {
    public final InterfaceC332260D0u<T> LL;
    public final InterfaceC332260D0u<String> LLILLJJLI;

    public C1163090gN9() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1163090gN9)) {
            return false;
        }
        C1163090gN9 c1163090gN9 = (C1163090gN9) obj;
        return Intrinsics.LJFF(this.LL, c1163090gN9.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1163090gN9.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GlueHierarchyData(glueSubscriber=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", exposureSubscriber=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1163090gN9(Object obj) {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(null);
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(null);
        this.LL = c2252321DDqLIZ;
        this.LLILLJJLI = c2252321DDqLIZ2;
    }
}

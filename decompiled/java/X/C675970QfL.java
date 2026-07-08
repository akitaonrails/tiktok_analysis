package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QfL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C675970QfL implements InterfaceC111300bX {
    public final int LL;
    public final InterfaceC679310Qkj LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C675970QfL)) {
            return false;
        }
        C675970QfL c675970QfL = (C675970QfL) obj;
        return this.LL == c675970QfL.LL && Intrinsics.LJFF(this.LLILLJJLI, c675970QfL.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixShopAssemHData(loadingStyle=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", contextProvider=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C675970QfL(int i, InterfaceC679310Qkj interfaceC679310Qkj) {
        this.LL = i;
        this.LLILLJJLI = interfaceC679310Qkj;
    }
}

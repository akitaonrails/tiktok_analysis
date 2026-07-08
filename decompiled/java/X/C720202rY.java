package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02rY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C720202rY extends AbstractC756202xM {
    public final C720002rW LLILZLL;
    public final String LLIZ = "platform_promotion";
    public final String LLIZLLLIL = "platform_promotion_item";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C720202rY) && Intrinsics.LJFF(this.LLILZLL, ((C720202rY) obj).LLILZLL);
    }

    public final int hashCode() {
        return this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("USPlatformDiscountsVO(platformDiscountsVO=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getGroupId() {
        return this.LLIZ;
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getItemId() {
        return this.LLIZLLLIL;
    }

    public C720202rY(C720002rW c720002rW) {
        this.LLILZLL = c720002rW;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(C720202rY.class, interfaceC1891350zJl.getClass());
    }
}

package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lVM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1360380lVM implements InterfaceC0148002o {
    public final AbstractC1360390lVN LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1360380lVM) && Intrinsics.LJFF(this.LL, ((C1360380lVM) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialAvatarStickerBannerState(selectState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1360380lVM(AbstractC1360390lVN abstractC1360390lVN) {
        this.LL = abstractC1360390lVN;
    }
}

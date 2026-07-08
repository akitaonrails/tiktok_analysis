package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04yx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1275704yx implements InterfaceC1891350zJl {
    public final String LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1275704yx) && Intrinsics.LJFF(this.LL, ((C1275704yx) obj).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryRevealPromotionBannerData(messageUuid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1275704yx() {
        this("story_reveal_promotion_banner_uuid");
    }

    public C1275704yx(String str) {
        this.LL = str;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C1275704yx) && Intrinsics.LJFF(((C1275704yx) interfaceC1891350zJl).LL, this.LL)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C1275704yx) && Intrinsics.LJFF(((C1275704yx) interfaceC1891350zJl).LL, this.LL)) {
            return true;
        }
        return false;
    }
}

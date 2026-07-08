package X;

import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HSS, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HSS implements InterfaceC111300bX {
    public final EnumC441640HTm LL;
    public final StickerItem LLILLJJLI;
    public final C0HSR LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HSS)) {
            return false;
        }
        C0HSS c0hss = (C0HSS) obj;
        return this.LL == c0hss.LL && Intrinsics.LJFF(this.LLILLJJLI, c0hss.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0hss.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixStudioShareData(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", sticker=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", mobInfo=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0HSS(EnumC441640HTm enumC441640HTm, StickerItem stickerItem, C0HSR c0hsr) {
        this.LL = enumC441640HTm;
        this.LLILLJJLI = stickerItem;
        this.LLILLL = c0hsr;
    }
}

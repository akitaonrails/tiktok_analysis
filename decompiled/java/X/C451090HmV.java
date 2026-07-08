package X;

import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HmV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C451090HmV extends AbstractC451120HmY {
    public final EnumC451100HmW LL;
    public final StickerItem LLILLJJLI;
    public final String LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C451090HmV)) {
            return false;
        }
        C451090HmV c451090HmV = (C451090HmV) obj;
        return this.LL == c451090HmV.LL && Intrinsics.LJFF(this.LLILLJJLI, c451090HmV.LLILLJJLI);
    }

    public final int hashCode() {
        EnumC451100HmW enumC451100HmW = this.LL;
        return ((enumC451100HmW == null ? 0 : enumC451100HmW.hashCode()) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GeneralStickerItem(sectionType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", item=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC451120HmY
    public final EnumC451100HmW LIZ() {
        return this.LL;
    }

    @Override // X.AbstractC451120HmY
    public final String getId() {
        return this.LLILLL;
    }

    @Override // X.AbstractC451120HmY, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C451090HmV) && Intrinsics.LJFF(((C451090HmV) interfaceC1891350zJl).LLILLJJLI, this.LLILLJJLI)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC451120HmY, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C451090HmV) {
            C451090HmV c451090HmV = (C451090HmV) interfaceC1891350zJl;
            if (c451090HmV.LL == this.LL && Intrinsics.LJFF(C453560HqU.LIZIZ(c451090HmV.LLILLJJLI), C453560HqU.LIZIZ(this.LLILLJJLI))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C451090HmV(EnumC451100HmW enumC451100HmW, StickerItem stickerItem) {
        this.LL = enumC451100HmW;
        this.LLILLJJLI = stickerItem;
        this.LLILLL = C453560HqU.LIZIZ(stickerItem);
    }
}

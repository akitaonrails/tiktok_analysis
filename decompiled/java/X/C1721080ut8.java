package X;

import com.bytedance.pipo.stellar.base.model.CardDO;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ut8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1721080ut8 implements InterfaceC1891350zJl {
    public final CardDO LL;
    public final C1720760usc LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1721080ut8)) {
            return false;
        }
        C1721080ut8 c1721080ut8 = (C1721080ut8) obj;
        return Intrinsics.LJFF(this.LL, c1721080ut8.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1721080ut8.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C1720760usc c1720760usc = this.LLILLJJLI;
        return iHashCode + (c1720760usc == null ? 0 : c1720760usc.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CarouselBannerItemData(itemData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", cardContext=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1721080ut8(CardDO cardDO, C1720760usc c1720760usc) {
        this.LL = cardDO;
        this.LLILLJJLI = c1720760usc;
    }
}

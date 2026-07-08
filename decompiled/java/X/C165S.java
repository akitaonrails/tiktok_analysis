package X;

import com.ss.android.ugc.aweme.commercialize.model.AdNativeProduct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.165S, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C165S implements InterfaceC1891350zJl {
    public final AdNativeProduct LL;
    public final Aweme LLILLJJLI;
    public final boolean LLILLL;
    public final int LLILZ;
    public final C165X LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C165S)) {
            return false;
        }
        C165S c165s = (C165S) obj;
        return Intrinsics.LJFF(this.LL, c165s.LL) && Intrinsics.LJFF(this.LLILLJJLI, c165s.LLILLJJLI) && this.LLILLL == c165s.LLILLL && this.LLILZ == c165s.LLILZ && Intrinsics.LJFF(this.LLILZIL, c165s.LLILZIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Aweme aweme = this.LLILLJJLI;
        return ((((((iHashCode + (aweme == null ? 0 : aweme.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdProductTileItem(model=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isLastItem=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", callback=");
        sbLIZ.append(this.LLILZIL);
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

    public C165S(AdNativeProduct adNativeProduct, Aweme aweme, boolean z, int i, C165X c165x) {
        this.LL = adNativeProduct;
        this.LLILLJJLI = aweme;
        this.LLILLL = z;
        this.LLILZ = i;
        this.LLILZIL = c165x;
    }
}

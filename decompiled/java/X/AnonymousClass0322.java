package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.bannerlayout.SeaSkuPanelWaistBanner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0322, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0322 extends AbstractC756202xM {
    public final SeaSkuPanelWaistBanner LLILZLL;
    public final C950203nY LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnonymousClass0322) && Intrinsics.LJFF(this.LLILZLL, ((AnonymousClass0322) obj).LLILZLL);
    }

    public final int hashCode() {
        return this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaSkuWaistBannerVO(waistBanner=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnonymousClass0322(SeaSkuPanelWaistBanner seaSkuPanelWaistBanner) {
        this.LLILZLL = seaSkuPanelWaistBanner;
        this.LLIZ = AnonymousClass0323.LIZ(seaSkuPanelWaistBanner);
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof AnonymousClass0322;
    }
}

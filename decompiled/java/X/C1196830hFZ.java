package X;

import androidx.lifecycle.Lifecycle;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.favorites.base.FavoriteTabItemV2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hFZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1196830hFZ extends C0OFL implements InterfaceC1141530foN {
    public final FavoriteTabItemV2 LLILLJJLI;

    @Override // X.C0OFL
    public final FavoriteTabItemV2 LIZ() {
        return this.LLILLJJLI;
    }

    @Override // X.C0OFL
    public final void LIZJ(Lifecycle.Event event) {
        int i = C2020207vk.LIZ[event.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C1548820qPI.LJIIIIZZ("pdp_save_product", this);
                return;
            }
            return;
        }
        C1548820qPI.LIZLLL("pdp_save_product", this);
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        boolean z;
        if (Intrinsics.LJFF(c262100zr.LIZ, "pdp_save_product")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            boolean z2 = false;
            if (interfaceC1107590evd != null && C1871910yoP.LIZLLL(interfaceC1107590evd, "saved", 0) == 1) {
                z = true;
            } else {
                z = false;
            }
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 != null && C1871910yoP.LIZIZ(interfaceC1107590evd2, "saved", false)) {
                z2 = true;
            }
            if (!z && !z2) {
                C0OFL.LIZIZ(this.LL);
            } else {
                C0OFL.LIZLLL(this.LL, 1);
            }
        }
    }

    public C1196830hFZ(PowerViewPagerFragmentItem<?> powerViewPagerFragmentItem, C1206210hUh c1206210hUh) {
        this.LLILLJJLI = new FavoriteTabItemV2(powerViewPagerFragmentItem, c1206210hUh.LIZIZ(2131858547, "wishlist_products_tab_name"), "product", "products", c1206210hUh.LIZ.getString(2131858546));
    }
}

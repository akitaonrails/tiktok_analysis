package X;

import Y.ARunnableS126S0100000_26;
import android.content.Context;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.ICartService;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.EnterCartParams;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitBehave;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitContentInfo;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitInfo;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitItem;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vjz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1753850vjz implements InterfaceC1754210vkZ {
    public final /* synthetic */ C1754020vkG LIZ;

    public C1753850vjz(C1754020vkG c1754020vkG) {
        this.LIZ = c1754020vkG;
    }

    @Override // X.InterfaceC1754210vkZ
    public final void LIZ(CartBenefitInfo cartBenefitInfo) {
        C1754020vkG c1754020vkG = this.LIZ;
        c1754020vkG.LJIILIIL = true;
        if (cartBenefitInfo != null) {
            c1754020vkG.LJIIJJI(CartBenefitBehave.BUBBLE_SHOW, cartBenefitInfo);
        }
    }

    @Override // X.InterfaceC1754210vkZ
    public final void LIZIZ(CartBenefitInfo cartBenefitInfo) {
        C1754020vkG c1754020vkG;
        C7937038d c7937038d;
        CartBenefitContentInfo cartBenefitContentInfo;
        String string;
        EnterCartParams enterCartParamsLIZ;
        Map<String, Object> map;
        String str;
        String str2;
        if (cartBenefitInfo != null) {
            CartBenefitItem cartBenefitItem = cartBenefitInfo.dynamicItem;
            if (cartBenefitItem != null && (cartBenefitContentInfo = cartBenefitItem.contentInfo) != null && (string = cartBenefitContentInfo.schema) != null) {
                C1754020vkG c1754020vkG2 = this.LIZ;
                InterfaceC1753920vk6 interfaceC1753920vk6 = c1754020vkG2.LJIILLIIL;
                String str3 = null;
                if (interfaceC1753920vk6 != null) {
                    enterCartParamsLIZ = interfaceC1753920vk6.LIZ();
                    if (enterCartParamsLIZ != null && (str2 = enterCartParamsLIZ.buyerAddrId) != null) {
                        string = UriProtector.parse(string).buildUpon().appendQueryParameter("buyer_addr_id", str2).toString();
                    }
                } else {
                    enterCartParamsLIZ = null;
                }
                ICartService.LJJI.getClass();
                ICartService iCartServiceLIZ = C1753910vk5.LIZ();
                Context context = c1754020vkG2.LIZ;
                if (enterCartParamsLIZ != null) {
                    map = enterCartParamsLIZ.trackParams;
                    str = enterCartParamsLIZ.previousPage;
                    str3 = enterCartParamsLIZ.sourceBtmToken;
                } else {
                    map = null;
                    str = null;
                }
                iCartServiceLIZ.LIZ(context, string, str, map, str3);
            }
            this.LIZ.LJIIJJI(CartBenefitBehave.BUBBLE_CLICK, cartBenefitInfo);
            if (Intrinsics.LJFF(cartBenefitInfo.isDisappearAfterClick, Boolean.TRUE) && (c7937038d = (c1754020vkG = this.LIZ).LJIIIIZZ) != null) {
                HandlerHook.viewPostDelay(c7937038d, new ARunnableS126S0100000_26(c1754020vkG, 109), 300L);
            }
        }
    }
}

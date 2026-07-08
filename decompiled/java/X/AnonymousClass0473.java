package X;

import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLabelVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.libra.EcSeaPdpPromotionLabelsTypeBanDictSettings;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBaseWidget;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS16S0001000_1;
import kotlin.jvm.internal.AwS402S0200000_1;

/* JADX INFO: renamed from: X.0473, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0473 {
    public static void LIZIZ(PromotionLabelVO promotionLabelVO, C430120Gtm c430120Gtm, C426350Gnh c426350Gnh) {
        List<PromotionLabel> list;
        if (promotionLabelVO != null && (list = promotionLabelVO.promotionLabels) != null) {
            ArrayList arrayList = new ArrayList();
            for (PromotionLabel promotionLabel : list) {
                if (!EcSeaPdpPromotionLabelsTypeBanDictSettings.LIZ().skuBanList.contains(Integer.valueOf(promotionLabel.type))) {
                    arrayList.add(promotionLabel);
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                int i = C21375518kz.LIZ;
                C426370Gnj c426370GnjLIZ = C21375518kz.LIZ(arrayList, EnumC21376018l4.MIDDLE);
                if (!((Boolean) C047K.LIZ.getValue()).booleanValue()) {
                    if (c426350Gnh != null) {
                        C0H1U.LIZIZ(c426350Gnh);
                    }
                    if (c430120Gtm != null) {
                        C12ES.LJIILL(0, c430120Gtm);
                        c430120Gtm.LIZ(c426370GnjLIZ);
                        return;
                    }
                    return;
                }
                if (c430120Gtm != null) {
                    C0H1U.LIZIZ(c430120Gtm);
                }
                if (c426350Gnh == null) {
                    return;
                }
                C12ES.LJIILL(0, c426350Gnh);
                c426350Gnh.LIZJ(c426370GnjLIZ);
                return;
            }
        }
        if (c430120Gtm != null) {
            C0H1U.LIZIZ(c430120Gtm);
        }
        if (c426350Gnh != null) {
            C0H1U.LIZIZ(c426350Gnh);
        }
    }

    public static void LIZ(final SkuPanelBaseWidget skuPanelBaseWidget, C430120Gtm c430120Gtm, C426350Gnh c426350Gnh, List list) {
        final C1077604Ji c1077604Ji = new C1077604Ji(skuPanelBaseWidget, (SkuPanelBaseWidget) list, (List<String>) 1);
        if (!((Boolean) C047K.LIZ.getValue()).booleanValue()) {
            final PageFinder pageFinderVia = PageFinder.via((View) c430120Gtm);
            if (c430120Gtm != null) {
                c430120Gtm.setListener(new InterfaceC430130Gtn() { // from class: X.0474
                    @Override // X.InterfaceC430130Gtn
                    public final void LIZJ(View view, int i) {
                    }

                    @Override // X.InterfaceC430130Gtn
                    public final void LIZIZ(int i) {
                        SkuPanelBaseWidget skuPanelBaseWidget2 = skuPanelBaseWidget;
                        skuPanelBaseWidget2.withState(skuPanelBaseWidget2.LJII(), new AwS16S0001000_1(i, 12));
                    }

                    @Override // X.InterfaceC430130Gtn
                    public final void LIZ(View view, int i, C21376318l7 c21376318l7) {
                        c1077604Ji.invoke(view, Integer.valueOf(i), c21376318l7, pageFinderVia);
                    }
                });
                return;
            }
            return;
        }
        final PageFinder pageFinderVia2 = PageFinder.via((View) c426350Gnh);
        if (c426350Gnh != null) {
            c426350Gnh.setListener(new InterfaceC430130Gtn() { // from class: X.0475
                @Override // X.InterfaceC430130Gtn
                public final void LIZIZ(int i) {
                }

                @Override // X.InterfaceC430130Gtn
                public final void LIZJ(View view, int i) {
                }

                @Override // X.InterfaceC430130Gtn
                public final void LIZ(View view, int i, C21376318l7 c21376318l7) {
                    c1077604Ji.invoke(view, Integer.valueOf(i), c21376318l7, pageFinderVia2);
                }
            });
        }
        C430110Gtl.LIZ(c426350Gnh, new AwS402S0200000_1(skuPanelBaseWidget, c426350Gnh, 39));
    }
}

package X;

import android.view.View;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.PdpReviewClickEvent;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS16S0001000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04Hq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1073204Hq {
    public final SeaPdpViewModel LIZ;
    public PdpReviewClickEvent LIZIZ;
    public InterfaceC1074004Hy LIZJ;
    public ProductDetailReview LIZLLL;

    public final boolean LIZ() {
        ProductDetailReview productDetailReview;
        Integer num;
        ProductPackStruct productPackStruct = this.LIZ.LLJIJIL;
        return productPackStruct == null || (productDetailReview = productPackStruct.review) == null || (num = productDetailReview.reviewCount) == null || num.intValue() == 0;
    }

    public C1073204Hq(SeaPdpViewModel seaPdpViewModel) {
        this.LIZ = seaPdpViewModel;
    }

    public final void LIZLLL(String str, boolean z) {
        ArrayList arrayList;
        List<ReviewItemStruct> list;
        String str2;
        int iIntValue;
        int iMax;
        ProductDetailReview productDetailReview = this.LIZLLL;
        ProductDetailReview productDetailReviewLIZ = null;
        if (productDetailReview != null && (list = productDetailReview.reviewItems) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (ReviewItemStruct reviewItemStructLIZ : list) {
                ReviewItemStruct.MainReview mainReview = reviewItemStructLIZ.review;
                if (mainReview != null) {
                    str2 = mainReview.reviewId;
                } else {
                    str2 = null;
                }
                if (Intrinsics.LJFF(str2, str)) {
                    int iIntValue2 = 0;
                    if (z) {
                        Integer num = reviewItemStructLIZ.diggCount;
                        if (num != null) {
                            iIntValue2 = num.intValue();
                        }
                        iMax = iIntValue2 + 1;
                    } else {
                        Integer num2 = reviewItemStructLIZ.diggCount;
                        if (num2 != null) {
                            iIntValue = num2.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        iMax = Math.max(iIntValue - 1, 0);
                    }
                    reviewItemStructLIZ = ReviewItemStruct.LIZ(reviewItemStructLIZ, Integer.valueOf(iMax), Boolean.valueOf(z));
                }
                arrayList.add(reviewItemStructLIZ);
            }
        } else {
            arrayList = null;
        }
        ProductDetailReview productDetailReview2 = this.LIZLLL;
        if (productDetailReview2 != null) {
            productDetailReviewLIZ = ProductDetailReview.LIZ(productDetailReview2, arrayList);
        }
        this.LIZLLL = productDetailReviewLIZ;
        this.LIZ.setState(new AwS580S0100000_1(this, 1101));
    }

    public static void LIZIZ(C1073204Hq c1073204Hq, View view, String str, String str2, int i, String str3, String str4, String str5, int i2) {
        String str6;
        String str7 = str3;
        String str8 = null;
        if ((i2 & 16) != 0) {
            str7 = null;
        }
        if ((i2 & 32) == 0) {
            str8 = str4;
        }
        c1073204Hq.getClass();
        IPageNodeMonitorService iPageNodeMonitorService = (IPageNodeMonitorService) PluggableExtentionKt.pluggableSpi$default(IPageNodeMonitorService.class, false, false, false, 14, null);
        if (iPageNodeMonitorService != null) {
            if (i == 2) {
                str6 = "shop_review";
            } else {
                str6 = "product_review";
            }
            iPageNodeMonitorService.LJIIIZ(str6);
        }
        LIZJ(c1073204Hq, view, str, str2, str7, null, null, null, null, i, str8, null, SpeechEngineDefines.TTS_WORK_MODE_BOTH);
    }

    public static void LIZJ(C1073204Hq c1073204Hq, View view, String str, String str2, String str3, String str4, String str5, String str6, Integer num, int i, String str7, InterfaceC1074004Hy interfaceC1074004Hy, int i2) {
        boolean z;
        String str8;
        Map<String, Object> map;
        SeaPdpViewModel seaPdpViewModel;
        C1054104Ah c1054104Ah;
        ProductDetailReview productDetailReview;
        Integer num2;
        String str9 = str7;
        String str10 = str3;
        InterfaceC1074004Hy interfaceC1074004Hy2 = null;
        if ((i2 & 8) != 0) {
            str10 = null;
        }
        if ((i2 & 512) != 0) {
            str9 = null;
        }
        if ((i2 & 1024) == 0) {
            interfaceC1074004Hy2 = interfaceC1074004Hy;
        }
        boolean z2 = false;
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z = true;
        } else {
            z = false;
        }
        c1073204Hq.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strVR2 = c1073204Hq.LIZ.VR2();
        if (interfaceC1074004Hy2 == null && z && (c1054104Ah = (seaPdpViewModel = c1073204Hq.LIZ).LLJLIL) != null) {
            ProductPackStruct productPackStruct = seaPdpViewModel.LLJIJIL;
            if (productPackStruct != null && (productDetailReview = productPackStruct.review) != null && (num2 = productDetailReview.reviewCount) != null && num2.intValue() > 0) {
                z2 = true;
            }
            C1054104Ah.LJJII(c1054104Ah, str, null, null, str2, C2097908Jt.LIZJ(new Pair("rd_has_valid_data", C893803eS.LIZ(z2))), null, null, null, c1073204Hq.LIZ.XR2().LIZ(), 230);
        }
        if (strVR2 != null) {
            c1073204Hq.LIZJ = interfaceC1074004Hy2;
            c1073204Hq.LIZIZ = new PdpReviewClickEvent(str10, str4, str5, str6, num, str9);
            HashMap<String, Object> map2 = new HashMap<>();
            IPdpStarter.PdpEnterParam pdpEnterParam = c1073204Hq.LIZ.LLIZ;
            if (pdpEnterParam != null && (map = pdpEnterParam.trackParams) != null) {
                map2.putAll(map);
                map2.put("previous_page", "product_detail");
            }
            if (i == 2) {
                str8 = "shop_review";
            } else {
                str8 = "product_review";
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
            linkedHashMap.put("page_name", str8);
            linkedHashMap.put("product_id", strVR2);
            linkedHashMap.putAll(map2);
            linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            C740050T1f.LIZ(view.getContext(), new C1073404Hs(linkedHashMap));
            ((IPageNodeMonitorService) ServiceManager.get().getService(IPageNodeMonitorService.class)).LJIIIIZZ("product_review", map2, null, null, null);
            C1017503yP c1017503yP = C1017503yP.LIZ;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.putAll(linkedHashMap);
            linkedHashMap2.put("click_to_now", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            c1017503yP.getClass();
            C1017503yP.LIZLLL(str8, linkedHashMap2);
            SeaPdpViewModel seaPdpViewModel2 = c1073204Hq.LIZ;
            seaPdpViewModel2.getClass();
            seaPdpViewModel2.setStateImmediate(new AwS16S0001000_1(i, 23));
        }
    }
}

package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopReviewEntry;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
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
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS16S0001000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04Hr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1073304Hr {
    public final PdpViewModel LIZ;
    public PdpReviewClickEvent LIZIZ;
    public InterfaceC1074004Hy LIZJ;
    public ProductDetailReview LIZLLL;
    public ShopReviewEntry LJ;
    public boolean LJFF;
    public C1060104Cp LJI;
    public volatile String LJII = "loading";
    public final ConcurrentHashMap<String, C04G7> LJIIIIZZ = new ConcurrentHashMap<>();

    public final void LIZ() {
        if (this.LIZLLL != null || this.LJFF) {
            return;
        }
        this.LJFF = true;
        C948503nH.LJFF(this.LIZ, C0PEM.LIZJ, new C04I4(this, null));
    }

    public C1073304Hr(PdpViewModel pdpViewModel) {
        this.LIZ = pdpViewModel;
    }

    public final void LIZJ(String str, boolean z) {
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
        this.LIZ.setState(new AwS580S0100000_1(this, 624));
    }

    public final void LIZIZ(View view, String str, String str2, String str3, InterfaceC1074004Hy interfaceC1074004Hy) {
        Integer numValueOf;
        String reviewEnterFrom;
        Map<String, Object> map;
        C1054004Ag c1054004Ag;
        Number reviewFilterType;
        String reviewFilterId = null;
        IPageNodeMonitorService iPageNodeMonitorService = (IPageNodeMonitorService) PluggableExtentionKt.pluggableSpi$default(IPageNodeMonitorService.class, false, false, false, 14, null);
        if (iPageNodeMonitorService != null) {
            iPageNodeMonitorService.LJIIIZ("product_review");
        }
        if (interfaceC1074004Hy != null) {
            reviewFilterId = interfaceC1074004Hy.getReviewFilterId();
        }
        if (interfaceC1074004Hy != null && (reviewFilterType = interfaceC1074004Hy.getReviewFilterType()) != null) {
            numValueOf = Integer.valueOf(reviewFilterType.intValue());
        } else {
            numValueOf = null;
        }
        String strValueOf = String.valueOf(numValueOf);
        String strRR2 = this.LIZ.RR2();
        if (interfaceC1074004Hy == null && (c1054004Ag = this.LIZ.LLJLILLLLZIIL) != null) {
            C1054004Ag.LJJ(c1054004Ag, "review_entrance", str, null, 4);
        }
        if (strRR2 != null) {
            this.LIZJ = interfaceC1074004Hy;
            this.LIZIZ = new PdpReviewClickEvent(str2, reviewFilterId, null, strValueOf, null, str3);
            HashMap<String, Object> map2 = new HashMap<>();
            IPdpStarter.PdpEnterParam pdpEnterParam = this.LIZ.LLJI;
            if (pdpEnterParam != null && (map = pdpEnterParam.trackParams) != null) {
                map2.putAll(map);
                map2.put("previous_page", "product_detail");
            }
            Context context = view.getContext();
            LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
            linkedHashMap.put("page_name", "product_review");
            linkedHashMap.put("product_id", strRR2);
            linkedHashMap.putAll(map2);
            linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            if (interfaceC1074004Hy != null && (reviewEnterFrom = interfaceC1074004Hy.getReviewEnterFrom()) != null) {
                linkedHashMap.put("enter_from", reviewEnterFrom);
            }
            C740050T1f.LIZ(context, new C1073404Hs(linkedHashMap));
            ((IPageNodeMonitorService) ServiceManager.get().getService(IPageNodeMonitorService.class)).LJIIIIZZ("product_review", map2, null, null, null);
            PdpViewModel pdpViewModel = this.LIZ;
            pdpViewModel.getClass();
            pdpViewModel.setStateImmediate(new AwS16S0001000_1(1, 26));
        }
    }
}

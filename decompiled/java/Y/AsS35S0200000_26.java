package Y;

import X.AbstractC1585810rMx;
import X.C013C;
import X.C10523049p;
import X.C128Y;
import X.C1338430kvx;
import X.C1338500kw4;
import X.C13LP;
import X.C1507790pL7;
import X.C1742820vSC;
import X.C1744410vUl;
import X.C1747760vaA;
import X.C1748720vbi;
import X.C1755360vmQ;
import X.C1755630vmr;
import X.C2327809Ae;
import X.EnumC1751780vge;
import X.InterfaceC1742900vSK;
import X.InterfaceC1748810vbr;
import X.InterfaceC1755350vmP;
import X.InterfaceC1755640vms;
import android.content.Context;
import android.os.SystemClock;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CommonFeedData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopRecommendResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shoprecommend.PdpShopPhaseTwoRecommendVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.page.ECTrendingListAssem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public class AsS35S0200000_26 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 0:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 1:
                LJJIIJ$1(this, recyclerView, i);
                break;
            case 2:
                LJJIIJ$2(this, recyclerView, i);
                break;
            case 3:
                LJJIIJ$3(this, recyclerView, i);
                break;
            case 4:
                LJJIIJ$4(this, recyclerView, i);
                break;
            default:
                super.LJJIIJ(recyclerView, i);
                break;
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJJIIZI$0(this, recyclerView, i, i2);
                break;
            case 1:
                LJJIIZI$1(this, recyclerView, i, i2);
                break;
            case 2:
                LJJIIZI$2(this, recyclerView, i, i2);
                break;
            case 3:
                LJJIIZI$3(this, recyclerView, i, i2);
                break;
            case 4:
                LJJIIZI$4(this, recyclerView, i, i2);
                break;
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
        }
    }

    public AsS35S0200000_26(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void LJJIIJ$0(AsS35S0200000_26 asS35S0200000_26, RecyclerView recyclerView, int i) {
        ShopRecommendResponse shopRecommendResponse;
        CommonFeedData commonFeedData;
        String str;
        String str2;
        SellerInfo sellerInfo;
        String str3;
        SellerInfo sellerInfo2;
        PdpShopPhaseTwoRecommendVH pdpShopPhaseTwoRecommendVH = (PdpShopPhaseTwoRecommendVH) asS35S0200000_26.l0;
        if (pdpShopPhaseTwoRecommendVH.LLJJJJLIIL != 0 && i == 0 && pdpShopPhaseTwoRecommendVH.LLJJJJJIL > 8) {
            C1748720vbi.LIZLLL(pdpShopPhaseTwoRecommendVH.itemView, new C10523049p(), new AwS605S0100000_26((PdpShopPhaseTwoRecommendVH) asS35S0200000_26.l0, 235));
        }
        if (((C013C) asS35S0200000_26.l1).element) {
            if (i == 0) {
                if (Intrinsics.LJFF(((PdpShopPhaseTwoRecommendVH) asS35S0200000_26.l0).LLJJJJ, "show_right") && (shopRecommendResponse = ((PdpShopPhaseTwoRecommendVH) asS35S0200000_26.l0).c6().t) != null && (commonFeedData = shopRecommendResponse.data) != null && (str = commonFeedData.jumpSchema) != null) {
                    PdpShopPhaseTwoRecommendVH pdpShopPhaseTwoRecommendVH2 = (PdpShopPhaseTwoRecommendVH) asS35S0200000_26.l0;
                    PdpViewModel pdpViewModelC6 = pdpShopPhaseTwoRecommendVH2.c6();
                    Context context = pdpShopPhaseTwoRecommendVH2.itemView.getContext();
                    ProductPackStruct productPackStruct = pdpShopPhaseTwoRecommendVH2.c6().LLJILLL;
                    Float fLJIIIIZZ = null;
                    if (productPackStruct != null && (sellerInfo2 = productPackStruct.sellerInfo) != null) {
                        str2 = sellerInfo2.sellerId;
                    } else {
                        str2 = null;
                    }
                    ProductPackStruct productPackStruct2 = pdpShopPhaseTwoRecommendVH2.c6().LLJILLL;
                    if (productPackStruct2 != null && (sellerInfo = productPackStruct2.sellerInfo) != null && (str3 = sellerInfo.rating) != null) {
                        fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str3);
                    }
                    PdpViewModel.VR2(pdpViewModelC6, context, str, str2, fLJIIIIZZ, "pdp_shop_view_more_left_swipe", null, pdpShopPhaseTwoRecommendVH2.c6().Tg2(), null, null, null, null, null, null, null, EnumC1751780vge.SHOP_RECOMMEND, "c2791.d9360", null, "product_detail", null, 688000);
                }
                ((PdpShopPhaseTwoRecommendVH) asS35S0200000_26.l0).LLJJJJJIL = 0;
            }
        } else if (i == 0) {
            ((PdpShopPhaseTwoRecommendVH) asS35S0200000_26.l0).LLJJJJJIL = 0;
        }
        ((PdpShopPhaseTwoRecommendVH) asS35S0200000_26.l0).LLJJJJLIIL = i;
    }

    public static final void LJJIIJ$1(AsS35S0200000_26 asS35S0200000_26, RecyclerView recyclerView, int i) {
        InterfaceC1748810vbr interfaceC1748810vbr;
        if (i == 0) {
            DistrictPage districtPage = (DistrictPage) asS35S0200000_26.l0;
            districtPage.LLJ = false;
            C128Y parentFragment = districtPage.getParentFragment();
            if ((parentFragment instanceof InterfaceC1748810vbr) && (interfaceC1748810vbr = (InterfaceC1748810vbr) parentFragment) != null) {
                C1748720vbi.LIZIZ(interfaceC1748810vbr, new C1747760vaA(), new AwS605S0100000_26((DistrictPage) asS35S0200000_26.l0, 260));
            }
        }
    }

    public static final void LJJIIJ$2(AsS35S0200000_26 asS35S0200000_26, RecyclerView recyclerView, int i) {
        String str;
        String str2;
        String str3;
        if (i == 0) {
            ((InterfaceC1742900vSK) ((ECTrendingListAssem) asS35S0200000_26.l0).Ho().LLILLL.getValue().getOperator()).LJJIII(false);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ECTrendingListAssem eCTrendingListAssem = (ECTrendingListAssem) asS35S0200000_26.l0;
            C1742820vSC c1742820vSC = eCTrendingListAssem.Ho().LL;
            String str4 = "";
            if (c1742820vSC == null || (str = c1742820vSC.LJIIIIZZ) == null) {
                str = "";
            }
            linkedHashMap.put("page_name", str);
            C1742820vSC c1742820vSC2 = eCTrendingListAssem.Ho().LL;
            if (c1742820vSC2 != null && (str3 = c1742820vSC2.LJFF) != null) {
                str4 = str3;
            }
            linkedHashMap.put("enter_method", str4);
            IECommerceMallService iECommerceMallService = (IECommerceMallService) PluggableExtentionKt.pluggableSpi$default(IECommerceMallService.class, false, false, false, 14, null);
            if (iECommerceMallService != null && iECommerceMallService.hitTopTabExpExperiment()) {
                str2 = "homepage_mall";
            } else {
                str2 = "mall";
            }
            linkedHashMap.put("enter_from", str2);
            linkedHashMap.put("entrance_type", "list");
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LIZJ("tiktokec_module_slide", linkedHashMap);
        }
    }

    public static final void LJJIIJ$3(AsS35S0200000_26 asS35S0200000_26, RecyclerView recyclerView, int i) {
        if (i == 1) {
            C1755630vmr c1755630vmr = (C1755630vmr) asS35S0200000_26.l0;
            if (c1755630vmr.LIZLLL) {
                InterfaceC1755640vms interfaceC1755640vms = c1755630vmr.LIZJ;
                if (interfaceC1755640vms != null) {
                    interfaceC1755640vms.LIZLLL();
                }
                ((C1755630vmr) asS35S0200000_26.l0).LIZLLL = false;
            }
            InterfaceC1755640vms interfaceC1755640vms2 = ((C1755630vmr) asS35S0200000_26.l0).LIZJ;
            if (interfaceC1755640vms2 != null) {
                interfaceC1755640vms2.LIZ();
            }
            HandlerHook.viewRemoveCallbacks((C1338500kw4) asS35S0200000_26.l1, ((C1755630vmr) asS35S0200000_26.l0).LJFF);
            HandlerHook.viewPostDelay((C1338500kw4) asS35S0200000_26.l1, ((C1755630vmr) asS35S0200000_26.l0).LJFF, 500L);
            RecyclerView currentSubRecyclerView = ((C1338500kw4) asS35S0200000_26.l1).getCurrentSubRecyclerView();
            if (currentSubRecyclerView != null) {
                currentSubRecyclerView.removeOnScrollListener(((C1755630vmr) asS35S0200000_26.l0).LJ);
            }
            RecyclerView currentSubRecyclerView2 = ((C1338500kw4) asS35S0200000_26.l1).getCurrentSubRecyclerView();
            if (currentSubRecyclerView2 != null) {
                currentSubRecyclerView2.addOnScrollListener(((C1755630vmr) asS35S0200000_26.l0).LJ);
            }
        }
    }

    public static final void LJJIIJ$4(AsS35S0200000_26 asS35S0200000_26, RecyclerView recyclerView, int i) {
        if (i == 1) {
            InterfaceC1755350vmP interfaceC1755350vmP = ((C1755360vmQ) asS35S0200000_26.l0).LIZJ;
            if (interfaceC1755350vmP != null) {
                interfaceC1755350vmP.LIZ();
            }
            HandlerHook.viewRemoveCallbacks((C1338430kvx) asS35S0200000_26.l1, ((C1755360vmQ) asS35S0200000_26.l0).LJ);
            HandlerHook.viewPostDelay((C1338430kvx) asS35S0200000_26.l1, ((C1755360vmQ) asS35S0200000_26.l0).LJ, 500L);
            RecyclerView currentSubRecyclerView = ((C1338430kvx) asS35S0200000_26.l1).getCurrentSubRecyclerView();
            if (currentSubRecyclerView != null) {
                currentSubRecyclerView.removeOnScrollListener(((C1755360vmQ) asS35S0200000_26.l0).LIZLLL);
            }
            RecyclerView currentSubRecyclerView2 = ((C1338430kvx) asS35S0200000_26.l1).getCurrentSubRecyclerView();
            if (currentSubRecyclerView2 != null) {
                currentSubRecyclerView2.addOnScrollListener(((C1755360vmQ) asS35S0200000_26.l0).LIZLLL);
            }
        }
    }

    public static final void LJJIIZI$0(AsS35S0200000_26 asS35S0200000_26, RecyclerView recyclerView, int i, int i2) {
        String str;
        PdpShopPhaseTwoRecommendVH pdpShopPhaseTwoRecommendVH = (PdpShopPhaseTwoRecommendVH) asS35S0200000_26.l0;
        if (i < 0) {
            str = "show_left";
        } else {
            str = "show_right";
        }
        pdpShopPhaseTwoRecommendVH.LLJJJJ = str;
        pdpShopPhaseTwoRecommendVH.LLJJJJJIL += Math.abs(i);
        ((C013C) asS35S0200000_26.l1).element = !recyclerView.canScrollHorizontally(1);
    }

    public static final void LJJIIZI$1(AsS35S0200000_26 asS35S0200000_26, RecyclerView recyclerView, int i, int i2) {
        boolean z;
        int iFindFirstVisibleItemPosition;
        String str;
        DistrictPage districtPage = (DistrictPage) asS35S0200000_26.l0;
        if (i2 < 0) {
            z = true;
        } else {
            z = false;
        }
        districtPage.LLJI = z;
        if (districtPage.LLJ) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (iFindFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition()) >= 0) {
            District district = (District) C13LP.LJJJLZIJ(iFindFirstVisibleItemPosition, ((C1744410vUl) asS35S0200000_26.l1).LL.LJFF);
            if (district != null && (str = district.index) != null && (true ^ Intrinsics.LJFF(str, ((DistrictPage) asS35S0200000_26.l0).LLIZLLLIL))) {
                ((DistrictPage) asS35S0200000_26.l0).LLIZ.LLLIL(str);
            }
            if (((DistrictPage) asS35S0200000_26.l0).SR().LLJLIL) {
                HandlerHook.viewPostDelay(recyclerView, new ARunnableS15S0301000_26(iFindFirstVisibleItemPosition, (DistrictPage) asS35S0200000_26.l0, (C1744410vUl) asS35S0200000_26.l1, layoutManager, 1), 500L);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJIIZI$2(Y.AsS35S0200000_26 r18, androidx.recyclerview.widget.RecyclerView r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AsS35S0200000_26.LJJIIZI$2(Y.AsS35S0200000_26, androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public static final void LJJIIZI$3(AsS35S0200000_26 asS35S0200000_26, RecyclerView recyclerView, int i, int i2) {
        ((C1755630vmr) asS35S0200000_26.l0).LIZ = SystemClock.elapsedRealtime();
    }

    public static final void LJJIIZI$4(AsS35S0200000_26 asS35S0200000_26, RecyclerView recyclerView, int i, int i2) {
        ((C1755360vmQ) asS35S0200000_26.l0).LIZ = SystemClock.elapsedRealtime();
    }
}

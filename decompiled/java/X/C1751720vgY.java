package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerDetailInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopPerformance;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.jedi.ECJediViewModel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreLabel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vgY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1751720vgY extends AbstractC1751730vgZ {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        ECJediViewModel eCJediViewModel;
        ECJediViewModel eCJediViewModel2;
        Activity activityLIZLLL;
        ProductPackStruct productPackStruct;
        SellerInfo sellerInfo;
        Float fLJIIIIZZ;
        String entranceType;
        String enterMethod;
        String clickArea;
        String sellingPoints;
        String str;
        String btm;
        StoreOfficialLabel storeOfficialLabel;
        ProductPackStruct productPackStruct2;
        SellerInfo sellerInfo2;
        Float fLJIIIIZZ2;
        String entranceType2;
        String enterMethod2;
        String clickArea2;
        String sellingPoints2;
        String str2;
        String btm2;
        StoreOfficialLabel storeOfficialLabel2;
        InterfaceC1751750vgb interfaceC1751750vgb = (InterfaceC1751750vgb) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            eCJediViewModel = (PdpViewModel) interfaceC634840OvC.LIZIZ(PdpViewModel.class);
        } else {
            eCJediViewModel = null;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            eCJediViewModel2 = (SeaPdpViewModel) interfaceC634840OvC2.LIZIZ(SeaPdpViewModel.class);
        } else {
            eCJediViewModel2 = null;
        }
        if (eCJediViewModel == null) {
            eCJediViewModel = eCJediViewModel2;
        }
        InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
        if (interfaceC634840OvC3 != null) {
            activityLIZLLL = interfaceC634840OvC3.LIZLLL();
        } else {
            activityLIZLLL = null;
        }
        if (!(activityLIZLLL instanceof C19EG)) {
            activityLIZLLL = null;
        }
        if (activityLIZLLL != null && eCJediViewModel != null) {
            if (eCJediViewModel instanceof PdpViewModel) {
                PdpViewModel pdpViewModel = (PdpViewModel) eCJediViewModel;
                if (Intrinsics.LJFF(interfaceC1751750vgb.getType(), "shop") && (productPackStruct2 = pdpViewModel.LLJILLL) != null && (sellerInfo2 = productPackStruct2.sellerInfo) != null) {
                    String str3 = sellerInfo2.shopLink;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = sellerInfo2.name;
                    String str5 = sellerInfo2.rating;
                    if (str5 != null) {
                        fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ(str5);
                    } else {
                        fLJIIIIZZ2 = null;
                    }
                    InterfaceC1751740vga shoRequest = interfaceC1751750vgb.getShoRequest();
                    if (shoRequest != null) {
                        entranceType2 = shoRequest.getEntranceType();
                    } else {
                        entranceType2 = null;
                    }
                    int iTg2 = pdpViewModel.Tg2();
                    List<SellerDetailInfo> list = sellerInfo2.sellerDetailInfos;
                    InterfaceC1751740vga shoRequest2 = interfaceC1751750vgb.getShoRequest();
                    if (shoRequest2 != null) {
                        enterMethod2 = shoRequest2.getEnterMethod();
                    } else {
                        enterMethod2 = null;
                    }
                    InterfaceC1751740vga shoRequest3 = interfaceC1751750vgb.getShoRequest();
                    if (shoRequest3 != null) {
                        clickArea2 = shoRequest3.getClickArea();
                    } else {
                        clickArea2 = null;
                    }
                    InterfaceC1751740vga shoRequest4 = interfaceC1751750vgb.getShoRequest();
                    if (shoRequest4 != null) {
                        sellingPoints2 = shoRequest4.getSellingPoints();
                    } else {
                        sellingPoints2 = null;
                    }
                    ShopPerformance shopPerformance = sellerInfo2.shopPerformance;
                    StoreLabel storeLabel = sellerInfo2.storeLabel;
                    if (storeLabel != null && (storeOfficialLabel2 = storeLabel.officialLabel) != null) {
                        str2 = storeOfficialLabel2.labelTypeStr;
                    } else {
                        str2 = null;
                    }
                    InterfaceC1751740vga shoRequest5 = interfaceC1751750vgb.getShoRequest();
                    if (shoRequest5 != null) {
                        btm2 = shoRequest5.getBtm();
                    } else {
                        btm2 = null;
                    }
                    PdpViewModel.VR2(pdpViewModel, activityLIZLLL, str3, str4, fLJIIIIZZ2, entranceType2, str2, iTg2, null, null, enterMethod2, list, clickArea2, sellingPoints2, shopPerformance, null, btm2, null, null, null, 958848);
                    XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1751760vgc.class, null);
                    ((InterfaceC1751760vgc) xBaseModelLIZJ).setSchema("");
                    completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                    return;
                }
            } else if (eCJediViewModel instanceof SeaPdpViewModel) {
                SeaPdpViewModel seaPdpViewModel = (SeaPdpViewModel) eCJediViewModel;
                if (Intrinsics.LJFF(interfaceC1751750vgb.getType(), "shop") && (productPackStruct = seaPdpViewModel.LLJIJIL) != null && (sellerInfo = productPackStruct.sellerInfo) != null) {
                    String str6 = sellerInfo.shopLink;
                    if (str6 == null) {
                        str6 = "";
                    }
                    String str7 = sellerInfo.name;
                    String str8 = sellerInfo.rating;
                    if (str8 != null) {
                        fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str8);
                    } else {
                        fLJIIIIZZ = null;
                    }
                    InterfaceC1751740vga shoRequest6 = interfaceC1751750vgb.getShoRequest();
                    if (shoRequest6 != null) {
                        entranceType = shoRequest6.getEntranceType();
                    } else {
                        entranceType = null;
                    }
                    int iTg22 = seaPdpViewModel.Tg2();
                    List<SellerDetailInfo> list2 = sellerInfo.sellerDetailInfos;
                    InterfaceC1751740vga shoRequest7 = interfaceC1751750vgb.getShoRequest();
                    if (shoRequest7 != null) {
                        enterMethod = shoRequest7.getEnterMethod();
                    } else {
                        enterMethod = null;
                    }
                    InterfaceC1751740vga shoRequest8 = interfaceC1751750vgb.getShoRequest();
                    if (shoRequest8 != null) {
                        clickArea = shoRequest8.getClickArea();
                    } else {
                        clickArea = null;
                    }
                    InterfaceC1751740vga shoRequest9 = interfaceC1751750vgb.getShoRequest();
                    if (shoRequest9 != null) {
                        sellingPoints = shoRequest9.getSellingPoints();
                    } else {
                        sellingPoints = null;
                    }
                    ShopPerformance shopPerformance2 = sellerInfo.shopPerformance;
                    StoreLabel storeLabel2 = sellerInfo.storeLabel;
                    if (storeLabel2 != null && (storeOfficialLabel = storeLabel2.officialLabel) != null) {
                        str = storeOfficialLabel.labelTypeStr;
                    } else {
                        str = null;
                    }
                    InterfaceC1751740vga shoRequest10 = interfaceC1751750vgb.getShoRequest();
                    if (shoRequest10 != null) {
                        btm = shoRequest10.getBtm();
                    } else {
                        btm = null;
                    }
                    SeaPdpViewModel.ZR2(seaPdpViewModel, activityLIZLLL, str6, str7, fLJIIIIZZ, entranceType, str, iTg22, null, null, enterMethod, list2, clickArea, sellingPoints, shopPerformance2, null, btm, null, 958848);
                    XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(InterfaceC1751760vgc.class, null);
                    ((InterfaceC1751760vgc) xBaseModelLIZJ2).setSchema("");
                    completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ2, "");
                    return;
                }
            }
            C2382909Vj.LIZ(completionBlock, 0, "jsb state error", null, 4);
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "jsb state error", null, 4);
    }
}

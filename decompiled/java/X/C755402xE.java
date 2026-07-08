package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PlatformPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionBanner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuSelection;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.module.ModuleManager;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS16S0010000_1;
import kotlin.jvm.internal.AwS26S0310000_1;

/* JADX INFO: renamed from: X.02xE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C755402xE {
    public static final C755402xE LIZ = new C755402xE();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfo] */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRightPanel] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuSelection, java.lang.Boolean, java.lang.Long, java.util.List, java.util.concurrent.CopyOnWriteArrayList] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r20v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v2, types: [com.ss.android.ugc.aweme.ecommerce.service.vo.Image] */
    /* JADX WARN: Type inference failed for: r22v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r23v2, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r24v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r26v2, types: [com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel] */
    /* JADX WARN: Type inference failed for: r28v2, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderSetting] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Boolean] */
    public static void LIZIZ(BillInfoData billInfoData, OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        PlatformPromotion platformPromotionLIZ;
        RandomAccess arrayList;
        List listLJ;
        boolean zAdd;
        C722902rz c722902rz;
        List<PaymentMethod> listLJIJI;
        PromotionBanner promotionBannerLIZ;
        if (billInfoData != null) {
            ModuleManager moduleManager = orderSubmitAssemViewModel.LLZIL;
            ?? r1 = 0;
            if (moduleManager != null) {
                ModuleManager.LJI(moduleManager, "t_preload_module_data_start", null, false, 6);
            }
            C722302rt c722302rtLIZIZ = null;
            PlatformPromotion platformPromotion = billInfoData.platformPromotion;
            if (platformPromotion != null) {
                PromotionBanner promotionBanner = platformPromotion.promotionBanner;
                if (promotionBanner != null) {
                    promotionBannerLIZ = PromotionBanner.LIZ(promotionBanner);
                } else {
                    promotionBannerLIZ = null;
                }
                platformPromotionLIZ = PlatformPromotion.LIZ(platformPromotion, null, null, promotionBannerLIZ, 134201343);
            } else {
                platformPromotionLIZ = null;
            }
            BillInfoData billInfoDataLIZ = BillInfoData.LIZ(billInfoData, null, null, null, platformPromotionLIZ, null, null, null, null, -65537, -1, 65535);
            orderSubmitAssemViewModel.setState(new AwS16S0010000_1(27));
            orderSubmitAssemViewModel.fT2(-1);
            boolean zLJIIJJI = billInfoDataLIZ.LJIIJJI();
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            PaymentMethodsData paymentMethodsData = billInfoDataLIZ.paymentMethods;
            if (paymentMethodsData != null && (listLJIJI = paymentMethodsData.LJIJI()) != null) {
                arrayList = new ArrayList(listLJIJI);
            } else {
                arrayList = C13BV.INSTANCE;
            }
            copyOnWriteArrayList.addAll(arrayList);
            ArrayList arrayList2 = new ArrayList();
            List<InterfaceC1891350zJl> listNR2 = OrderSubmitAssemViewModel.nR2(orderSubmitAssemViewModel, billInfoDataLIZ, zLJIIJJI, null, copyOnWriteArrayList, false, false, false, null, null, 992);
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listNR2, 10));
            boolean z = false;
            for (InterfaceC1891350zJl interfaceC1891350zJl : listNR2) {
                if (interfaceC1891350zJl instanceof C719202rO) {
                    C719202rO c719202rO = (C719202rO) interfaceC1891350zJl;
                    C719202rO c719202rOLIZIZ = C719202rO.LIZIZ(c719202rO, r1, r1, r1, r1, r1, r1, r1, Boolean.TRUE, r1, 917503);
                    c719202rOLIZIZ.LLILZ = c719202rO.LLILZ;
                    zAdd = arrayList2.add(c719202rOLIZIZ);
                } else if (interfaceC1891350zJl instanceof C755702xH) {
                    C755702xH c755702xH = (C755702xH) interfaceC1891350zJl;
                    C755702xH c755702xHLIZIZ = C755702xH.LIZIZ(c755702xH, r1, r1, Boolean.TRUE, 7);
                    c755702xHLIZIZ.LLILZ = c755702xH.LLILZ;
                    zAdd = arrayList2.add(c755702xHLIZIZ);
                } else if (interfaceC1891350zJl instanceof C720402ra) {
                    C720402ra c720402ra = (C720402ra) interfaceC1891350zJl;
                    C720402ra c720402ra2 = new C720402ra(c720402ra.LLILZLL, Boolean.TRUE, c720402ra.LLIZLLLIL, c720402ra.LLJ, c720402ra.LLJI, c720402ra.LLJIJIL, c720402ra.LLJILJIL, c720402ra.LLJILJILJ, c720402ra.LLJILLL, c720402ra.LLJJ);
                    c720402ra2.LLILZ = c720402ra.LLILZ;
                    zAdd = arrayList2.add(c720402ra2);
                } else if (interfaceC1891350zJl instanceof C719102rN) {
                    C719102rN c719102rN = (C719102rN) interfaceC1891350zJl;
                    C719102rN c719102rNLIZIZ = C719102rN.LIZIZ(c719102rN, 0, Boolean.TRUE, -131073);
                    c719102rNLIZIZ.LLILZ = c719102rN.LLILZ;
                    zAdd = arrayList2.add(c719102rNLIZIZ);
                } else if (interfaceC1891350zJl instanceof AnonymousClass0376) {
                    AnonymousClass0376 anonymousClass0376 = (AnonymousClass0376) interfaceC1891350zJl;
                    AnonymousClass0376 anonymousClass0376LIZIZ = AnonymousClass0376.LIZIZ(anonymousClass0376, r1, Boolean.TRUE, r1, -262145, 63);
                    anonymousClass0376LIZIZ.LLILZ = anonymousClass0376.LLILZ;
                    zAdd = arrayList2.add(anonymousClass0376LIZIZ);
                } else if (interfaceC1891350zJl instanceof C755502xF) {
                    C755502xF c755502xF = (C755502xF) interfaceC1891350zJl;
                    C722302rt c722302rtLIZIZ2 = C722302rt.LIZIZ(c755502xF.LLILZLL, Boolean.TRUE, false, false, 4194287);
                    c722302rtLIZIZ = C722302rt.LIZIZ(c722302rtLIZIZ2, r1, false, false, 4194303);
                    C755502xF c755502xFLIZIZ = C755502xF.LIZIZ(c755502xF, c722302rtLIZIZ2, true, 54);
                    c755502xFLIZIZ.LLILZ = c755502xF.LLILZ;
                    zAdd = arrayList2.add(c755502xFLIZIZ);
                } else if (interfaceC1891350zJl instanceof C755202xC) {
                    C755202xC c755202xC = (C755202xC) interfaceC1891350zJl;
                    C755202xC c755202xCLIZIZ = C755202xC.LIZIZ(c755202xC, Boolean.TRUE, r1, 509);
                    c755202xCLIZIZ.LLILZ = c755202xC.LLILZ;
                    zAdd = arrayList2.add(c755202xCLIZIZ);
                    z = true;
                } else if (interfaceC1891350zJl instanceof C7768031q) {
                    zAdd = arrayList2.add(C7768031q.LIZIZ((C7768031q) interfaceC1891350zJl, r1, r1, Boolean.TRUE, 523263));
                } else if (interfaceC1891350zJl instanceof C738302uT) {
                    C738302uT c738302uT = (C738302uT) interfaceC1891350zJl;
                    C722902rz c722902rz2 = c738302uT.LLILZLL;
                    if (c722902rz2 != null) {
                        c722902rz = new C722902rz(c722902rz2.LLILZLL, c722902rz2.LLIZ, c722902rz2.LLIZLLLIL, c722902rz2.LLJ, c722902rz2.LLJI, c722902rz2.LLJIJIL, c722902rz2.LLJILJIL, Boolean.TRUE, c722902rz2.LLJILLL, c722902rz2.LLJJ, c722902rz2.LLJJI, c722902rz2.LLJJIII, c722902rz2.LLJJIJI, c722902rz2.LLJJIJIIJIL);
                    } else {
                        c722902rz = null;
                    }
                    C738302uT c738302uT2 = new C738302uT(c722902rz, c738302uT.LLIZ, c738302uT.LLIZLLLIL, c738302uT.LLJ);
                    c738302uT2.LLILZ = c738302uT.LLILZ;
                    zAdd = arrayList2.add(c738302uT2);
                } else {
                    zAdd = arrayList2.add(interfaceC1891350zJl);
                }
                arrayList3.add(Boolean.valueOf(zAdd));
                r1 = 0;
            }
            if (!z) {
                LIZ.getClass();
                arrayList2.add(new C755202xC(C13BV.INSTANCE, Boolean.TRUE, r1, r1, r1, 60));
            }
            SkuSelection skuSelection = billInfoData.skuSelection;
            if (skuSelection != null) {
                C7878035w.LIZ.getClass();
                listLJ = C7878035w.LJ(C7878035w.LJFF(skuSelection), orderSubmitAssemViewModel.N);
            } else {
                listLJ = null;
            }
            boolean zLJIIZILJ = billInfoDataLIZ.LJIIZILJ();
            ModuleManager moduleManager2 = orderSubmitAssemViewModel.LLZIL;
            if (moduleManager2 != null) {
                ModuleManager.LJI(moduleManager2, "t_preload_module_data_end", r1, false, 6);
            }
            ModuleManager moduleManager3 = orderSubmitAssemViewModel.LLZIL;
            if (moduleManager3 != null) {
                moduleManager3.LJII = 1;
            }
            orderSubmitAssemViewModel.setState(new AwS26S0310000_1(c722302rtLIZIZ, arrayList2, listLJ, zLJIIZILJ, 4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r23, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r24, X.ViewOnAttachStateChangeListenerC20604515jv r25) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C755402xE.LIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel, X.15jv):void");
    }
}

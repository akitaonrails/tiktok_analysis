package X;

import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.oneclickpay.OneClickPayContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CheckPopUpEntry;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.NextRequestScene;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vvh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1761110vvh {
    public final PdpViewModel LIZ;
    public final List<C0NLD> LIZIZ = C1697810uHb.LJIIJJI(new C0NLD() { // from class: X.0vvZ
        public static final /* synthetic */ int LIZIZ = 0;
        public final C0NLF LIZ = C0NLF.ALGORITHMIC_COUPON;

        @Override // X.C0NLD
        public final C0NLF getId() {
            return this.LIZ;
        }

        public static final CheckPopUpEntry LJFF(PdpViewModel pdpViewModel, C0NL6 c0nl6) {
            String strLIZ;
            List<NextRequestScene> list;
            C1056604Bg c1056604Bg = C1054504Al.LIZ;
            Map mapLIZ = C1054504Al.LIZ(pdpViewModel.getProductId());
            ProductPackStruct productPackStruct = pdpViewModel.LLJILLL;
            String strLJIIIIZZ = null;
            if (productPackStruct != null && (list = productPackStruct.nextRequestScenes) != null) {
                strLIZ = C043O.LIZ(list, c0nl6);
            } else {
                strLIZ = null;
            }
            String productId = pdpViewModel.getProductId();
            Integer numValueOf = Integer.valueOf(C0NLF.ALGORITHMIC_COUPON.getValue());
            String strLJIIIIZZ2 = C1741890vQh.LJIIIIZZ(mapLIZ);
            PageSourceInfo pageSourceInfoLJ = C1766860w4y.LJ(C1766860w4y.LIZ, null, 3);
            if (pageSourceInfoLJ != null) {
                strLJIIIIZZ = C1741890vQh.LJIIIIZZ(pageSourceInfoLJ);
            }
            return new CheckPopUpEntry(productId, numValueOf, strLJIIIIZZ2, null, null, strLIZ, strLJIIIIZZ, null);
        }

        @Override // X.C0NLD
        public final CheckPopUpEntry LIZLLL(PdpViewModel pdpViewModel, C0NL6 c0nl6) {
            return LJFF(pdpViewModel, c0nl6);
        }

        @Override // X.C0NLD
        public final void LJ(PdpViewModel pdpViewModel, String str) {
            C1759390vsv.LIZIZ(this, pdpViewModel, str);
        }

        @Override // X.C0NLD
        public final void LIZ(PopUpResponseData popUpResponseData, PdpViewModel pdpViewModel, String str) {
            C1759390vsv.LIZ(popUpResponseData, pdpViewModel, str);
        }

        @Override // X.C0NLD
        public final void LIZIZ(PdpViewModel pdpViewModel, C0NL6 c0nl6, String str) {
            CheckPopUpEntry checkPopUpEntryLJFF = LJFF(pdpViewModel, c0nl6);
            LIZJ(pdpViewModel, checkPopUpEntryLJFF.couponContext, checkPopUpEntryLJFF.triggerType, checkPopUpEntryLJFF.selectedAddressId, checkPopUpEntryLJFF.shipToAddr, checkPopUpEntryLJFF.passThroughParams, str, null);
        }

        @Override // X.C0NLD
        public final void LIZJ(PdpViewModel pdpViewModel, String str, Integer num, String str2, List<Region> list, String str3, String str4, String str5) {
            C1759390vsv.LIZJ(this, pdpViewModel, str, num, str2, list, str3, str4, str5);
        }
    }, new C0NLD() { // from class: X.0vvX
        public static final /* synthetic */ int LIZIZ = 0;
        public final C0NLF LIZ = C0NLF.FREE_SHIPPING_ADDON_REMINDER;

        @Override // X.C0NLD
        public final C0NLF getId() {
            return this.LIZ;
        }

        public static final CheckPopUpEntry LJFF(PdpViewModel pdpViewModel, C0NL6 c0nl6) {
            AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
            String str;
            List<Region> list;
            String strLIZ;
            List<NextRequestScene> list2;
            OneClickPayContext oneClickPayContext;
            boolean z;
            String name;
            C1750440veU.LIZ.getClass();
            Keva keva = C1750440veU.LIZIZ;
            String strLJIIIIZZ = null;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IAccountDependencyService.class.getName();
                if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
            }
            String string = keva.getString(((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getUserId(), "");
            if (!Intrinsics.LJFF(string, "")) {
                if ((new Date().getTime() - new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).parse(string).getTime()) / ((long) 86400000) < 3) {
                    return null;
                }
            }
            IPdpStarter.PdpEnterParam pdpEnterParam = pdpViewModel.LLJI;
            if (pdpEnterParam == null || (((oneClickPayContext = pdpEnterParam.ocpContext) == null || (str = oneClickPayContext.buyerAddressId) == null) && (str = pdpEnterParam.selectedAddressId) == null)) {
                C973303rH.LL.getClass();
                str = C973303rH.LLILLJJLI;
            }
            if (str != null && str.length() != 0) {
                list = null;
            } else {
                C973303rH.LL.getClass();
                list = C973303rH.LLILLL;
            }
            ProductPackStruct productPackStruct = pdpViewModel.LLJILLL;
            if (productPackStruct != null && (list2 = productPackStruct.nextRequestScenes) != null) {
                strLIZ = C043O.LIZ(list2, c0nl6);
            } else {
                strLIZ = null;
            }
            String productId = pdpViewModel.getProductId();
            Integer numValueOf = Integer.valueOf(C0NLF.FREE_SHIPPING_ADDON_REMINDER.getValue());
            PageSourceInfo pageSourceInfoLJ = C1766860w4y.LJ(C1766860w4y.LIZ, null, 3);
            if (pageSourceInfoLJ != null) {
                strLJIIIIZZ = C1741890vQh.LJIIIIZZ(pageSourceInfoLJ);
            }
            return new CheckPopUpEntry(productId, numValueOf, null, str, list, strLIZ, strLJIIIIZZ, null);
        }

        @Override // X.C0NLD
        public final CheckPopUpEntry LIZLLL(PdpViewModel pdpViewModel, C0NL6 c0nl6) {
            return LJFF(pdpViewModel, c0nl6);
        }

        @Override // X.C0NLD
        public final void LJ(PdpViewModel pdpViewModel, String str) {
            C1759390vsv.LIZIZ(this, pdpViewModel, str);
        }

        @Override // X.C0NLD
        public final void LIZ(PopUpResponseData popUpResponseData, PdpViewModel pdpViewModel, String str) {
            C1759390vsv.LIZ(popUpResponseData, pdpViewModel, str);
        }

        @Override // X.C0NLD
        public final void LIZIZ(PdpViewModel pdpViewModel, C0NL6 c0nl6, String str) {
            CheckPopUpEntry checkPopUpEntryLJFF = LJFF(pdpViewModel, c0nl6);
            if (checkPopUpEntryLJFF == null) {
                return;
            }
            LIZJ(pdpViewModel, checkPopUpEntryLJFF.couponContext, checkPopUpEntryLJFF.triggerType, checkPopUpEntryLJFF.selectedAddressId, checkPopUpEntryLJFF.shipToAddr, checkPopUpEntryLJFF.passThroughParams, null, null);
        }

        @Override // X.C0NLD
        public final void LIZJ(PdpViewModel pdpViewModel, String str, Integer num, String str2, List<Region> list, String str3, String str4, String str5) {
            C1759390vsv.LIZJ(this, pdpViewModel, str, num, str2, list, str3, str4, str5);
        }
    }, new C0NLD() { // from class: X.0vvb
        public static final /* synthetic */ int LIZIZ = 0;
        public final C0NLF LIZ = C0NLF.REWARDS_PROGRAM;

        @Override // X.C0NLD
        public final C0NLF getId() {
            return this.LIZ;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CheckPopUpEntry LJFF(com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r13, X.C0NL6 r14) {
            /*
                X.04Bg r0 = X.C1054504Al.LIZ
                java.lang.String r0 = r13.getProductId()
                java.util.Map r4 = X.C1054504Al.LIZ(r0)
                com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r0 = r13.LLJILLL
                r12 = 0
                if (r0 == 0) goto L19
                java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.NextRequestScene> r0 = r0.nextRequestScenes
                if (r0 == 0) goto L19
                java.lang.String r11 = X.C043O.LIZ(r0, r14)
                if (r11 != 0) goto L4d
            L19:
                com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r0 = r13.LLJILLL
                if (r0 == 0) goto L77
                com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CouponPromotion r0 = r0.couponPromotion
                if (r0 == 0) goto L77
                java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionItem> r0 = r0.promotionItemList
                if (r0 == 0) goto L77
                java.util.Iterator r3 = r0.iterator()
            L29:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L75
                java.lang.Object r2 = r3.next()
                r0 = r2
                com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionItem r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionItem) r0
                java.lang.Integer r0 = r0.promotionType
                if (r0 == 0) goto L29
                int r1 = r0.intValue()
                r0 = 5
                if (r1 != r0) goto L29
            L41:
                com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionItem r2 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionItem) r2
                if (r2 == 0) goto L77
                java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.NextRequestScene> r0 = r2.nextRequestScenes
                if (r0 == 0) goto L77
                java.lang.String r11 = X.C043O.LIZ(r0, r14)
            L4d:
                com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CheckPopUpEntry r5 = new com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CheckPopUpEntry
                java.lang.String r6 = r13.getProductId()
                X.0NLF r0 = X.C0NLF.REWARDS_PROGRAM
                int r0 = r0.getValue()
                java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
                java.lang.String r8 = X.C1741890vQh.LJIIIIZZ(r4)
                r9 = 0
                X.0w4y r1 = X.C1766860w4y.LIZ
                r0 = 3
                com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo r0 = X.C1766860w4y.LJ(r1, r12, r0)
                if (r0 == 0) goto L6f
                java.lang.String r12 = X.C1741890vQh.LJIIIIZZ(r0)
            L6f:
                r10 = r9
                r13 = r9
                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
                return r5
            L75:
                r2 = r12
                goto L41
            L77:
                r11 = r12
                goto L4d
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1761050vvb.LJFF(com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel, X.0NL6):com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CheckPopUpEntry");
        }

        @Override // X.C0NLD
        public final CheckPopUpEntry LIZLLL(PdpViewModel pdpViewModel, C0NL6 c0nl6) {
            return LJFF(pdpViewModel, c0nl6);
        }

        @Override // X.C0NLD
        public final void LJ(PdpViewModel pdpViewModel, String str) {
            C1759390vsv.LIZIZ(this, pdpViewModel, str);
        }

        @Override // X.C0NLD
        public final void LIZ(PopUpResponseData popUpResponseData, PdpViewModel pdpViewModel, String str) {
            C1759390vsv.LIZ(popUpResponseData, pdpViewModel, str);
        }

        @Override // X.C0NLD
        public final void LIZIZ(PdpViewModel pdpViewModel, C0NL6 c0nl6, String str) {
            CheckPopUpEntry checkPopUpEntryLJFF = LJFF(pdpViewModel, c0nl6);
            LIZJ(pdpViewModel, checkPopUpEntryLJFF.couponContext, checkPopUpEntryLJFF.triggerType, checkPopUpEntryLJFF.selectedAddressId, checkPopUpEntryLJFF.shipToAddr, checkPopUpEntryLJFF.passThroughParams, str, null);
        }

        @Override // X.C0NLD
        public final void LIZJ(PdpViewModel pdpViewModel, String str, Integer num, String str2, List<Region> list, String str3, String str4, String str5) {
            C1759390vsv.LIZJ(this, pdpViewModel, str, num, str2, list, str3, str4, str5);
        }
    }, new C0NLD() { // from class: X.0vvY
        public static final /* synthetic */ int LIZIZ = 0;
        public final C0NLF LIZ = C0NLF.EXISTING_COUPON_REMINDER;

        @Override // X.C0NLD
        public final C0NLF getId() {
            return this.LIZ;
        }

        public static final CheckPopUpEntry LJFF(PdpViewModel pdpViewModel, C0NL6 c0nl6) {
            AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
            String strLIZ;
            List<NextRequestScene> list;
            boolean z;
            String name;
            C1759680vtO.LIZ.getClass();
            Keva keva = C1759680vtO.LIZIZ;
            String strLJIIIIZZ = null;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IAccountDependencyService.class.getName();
                if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
            }
            String string = keva.getString(((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getUserId(), "");
            if (!Intrinsics.LJFF(string, "")) {
                if (new Date().getTime() - new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).parse(string).getTime() < 259200000) {
                    return null;
                }
            }
            C1056604Bg c1056604Bg = C1054504Al.LIZ;
            Map mapLIZ = C1054504Al.LIZ(pdpViewModel.getProductId());
            ProductPackStruct productPackStruct = pdpViewModel.LLJILLL;
            if (productPackStruct != null && (list = productPackStruct.nextRequestScenes) != null) {
                strLIZ = C043O.LIZ(list, c0nl6);
            } else {
                strLIZ = null;
            }
            String productId = pdpViewModel.getProductId();
            Integer numValueOf = Integer.valueOf(C0NLF.EXISTING_COUPON_REMINDER.getValue());
            String strLJIIIIZZ2 = C1741890vQh.LJIIIIZZ(mapLIZ);
            PageSourceInfo pageSourceInfoLJ = C1766860w4y.LJ(C1766860w4y.LIZ, null, 3);
            if (pageSourceInfoLJ != null) {
                strLJIIIIZZ = C1741890vQh.LJIIIIZZ(pageSourceInfoLJ);
            }
            return new CheckPopUpEntry(productId, numValueOf, strLJIIIIZZ2, null, null, strLIZ, strLJIIIIZZ, null);
        }

        @Override // X.C0NLD
        public final CheckPopUpEntry LIZLLL(PdpViewModel pdpViewModel, C0NL6 c0nl6) {
            return LJFF(pdpViewModel, c0nl6);
        }

        @Override // X.C0NLD
        public final void LJ(PdpViewModel pdpViewModel, String str) {
            C1759390vsv.LIZIZ(this, pdpViewModel, str);
        }

        @Override // X.C0NLD
        public final void LIZ(PopUpResponseData popUpResponseData, PdpViewModel pdpViewModel, String str) {
            C1759390vsv.LIZ(popUpResponseData, pdpViewModel, str);
        }

        @Override // X.C0NLD
        public final void LIZIZ(PdpViewModel pdpViewModel, C0NL6 c0nl6, String str) {
            CheckPopUpEntry checkPopUpEntryLJFF = LJFF(pdpViewModel, c0nl6);
            if (checkPopUpEntryLJFF == null) {
                return;
            }
            LIZJ(pdpViewModel, checkPopUpEntryLJFF.couponContext, checkPopUpEntryLJFF.triggerType, checkPopUpEntryLJFF.selectedAddressId, checkPopUpEntryLJFF.shipToAddr, checkPopUpEntryLJFF.passThroughParams, null, null);
        }

        @Override // X.C0NLD
        public final void LIZJ(PdpViewModel pdpViewModel, String str, Integer num, String str2, List<Region> list, String str3, String str4, String str5) {
            C1759390vsv.LIZJ(this, pdpViewModel, str, num, str2, list, str3, str4, str5);
        }
    }, new C0NLD() { // from class: X.0vvc
        public static final /* synthetic */ int LIZIZ = 0;
        public final C0NLF LIZ = C0NLF.MANUAL_CLAIM_QCPX_COUPON_REMINDER;

        @Override // X.C0NLD
        public final C0NLF getId() {
            return this.LIZ;
        }

        public static final CheckPopUpEntry LJFF(PdpViewModel pdpViewModel, C0NL6 c0nl6) {
            String strLIZ;
            List<NextRequestScene> list;
            C1056604Bg c1056604Bg = C1054504Al.LIZ;
            Map mapLIZ = C1054504Al.LIZ(pdpViewModel.getProductId());
            ProductPackStruct productPackStruct = pdpViewModel.LLJILLL;
            String strLJIIIIZZ = null;
            if (productPackStruct != null && (list = productPackStruct.nextRequestScenes) != null) {
                strLIZ = C043O.LIZ(list, c0nl6);
            } else {
                strLIZ = null;
            }
            String productId = pdpViewModel.getProductId();
            Integer numValueOf = Integer.valueOf(C0NLF.MANUAL_CLAIM_QCPX_COUPON_REMINDER.getValue());
            String strLJIIIIZZ2 = C1741890vQh.LJIIIIZZ(mapLIZ);
            PageSourceInfo pageSourceInfoLJ = C1766860w4y.LJ(C1766860w4y.LIZ, null, 3);
            if (pageSourceInfoLJ != null) {
                strLJIIIIZZ = C1741890vQh.LJIIIIZZ(pageSourceInfoLJ);
            }
            return new CheckPopUpEntry(productId, numValueOf, strLJIIIIZZ2, null, null, strLIZ, strLJIIIIZZ, null);
        }

        @Override // X.C0NLD
        public final CheckPopUpEntry LIZLLL(PdpViewModel pdpViewModel, C0NL6 c0nl6) {
            return LJFF(pdpViewModel, c0nl6);
        }

        @Override // X.C0NLD
        public final void LJ(PdpViewModel pdpViewModel, String str) {
            C1759390vsv.LIZIZ(this, pdpViewModel, str);
        }

        @Override // X.C0NLD
        public final void LIZ(PopUpResponseData popUpResponseData, PdpViewModel pdpViewModel, String str) {
            C1759390vsv.LIZ(popUpResponseData, pdpViewModel, str);
        }

        @Override // X.C0NLD
        public final void LIZIZ(PdpViewModel pdpViewModel, C0NL6 c0nl6, String str) {
            CheckPopUpEntry checkPopUpEntryLJFF = LJFF(pdpViewModel, c0nl6);
            LIZJ(pdpViewModel, checkPopUpEntryLJFF.couponContext, checkPopUpEntryLJFF.triggerType, checkPopUpEntryLJFF.selectedAddressId, checkPopUpEntryLJFF.shipToAddr, checkPopUpEntryLJFF.passThroughParams, null, null);
        }

        @Override // X.C0NLD
        public final void LIZJ(PdpViewModel pdpViewModel, String str, Integer num, String str2, List<Region> list, String str3, String str4, String str5) {
            C1759390vsv.LIZJ(this, pdpViewModel, str, num, str2, list, str3, str4, str5);
        }
    }, new C0NLD() { // from class: X.0vvd
        public static final /* synthetic */ int LIZIZ = 0;
        public final C0NLF LIZ = C0NLF.POPUPTYPE_NEW_CUSTOMER_OFFER;

        @Override // X.C0NLD
        public final C0NLF getId() {
            return this.LIZ;
        }

        public static final CheckPopUpEntry LJFF(PdpViewModel pdpViewModel, C0NL6 c0nl6) {
            String strLIZ;
            List<NextRequestScene> list;
            ProductPackStruct productPackStruct = pdpViewModel.LLJILLL;
            String strLJIIIIZZ = null;
            if (productPackStruct != null && (list = productPackStruct.nextRequestScenes) != null) {
                strLIZ = C043O.LIZ(list, c0nl6);
            } else {
                strLIZ = null;
            }
            C1056604Bg c1056604Bg = C1054504Al.LIZ;
            Map mapLIZ = C1054504Al.LIZ(pdpViewModel.getProductId());
            String productId = pdpViewModel.getProductId();
            Integer numValueOf = Integer.valueOf(C0NLF.POPUPTYPE_NEW_CUSTOMER_OFFER.getValue());
            String strLJIIIIZZ2 = C1741890vQh.LJIIIIZZ(mapLIZ);
            PageSourceInfo pageSourceInfoLJ = C1766860w4y.LJ(C1766860w4y.LIZ, null, 3);
            if (pageSourceInfoLJ != null) {
                strLJIIIIZZ = C1741890vQh.LJIIIIZZ(pageSourceInfoLJ);
            }
            return new CheckPopUpEntry(productId, numValueOf, strLJIIIIZZ2, null, null, strLIZ, strLJIIIIZZ, null);
        }

        @Override // X.C0NLD
        public final CheckPopUpEntry LIZLLL(PdpViewModel pdpViewModel, C0NL6 c0nl6) {
            return LJFF(pdpViewModel, c0nl6);
        }

        @Override // X.C0NLD
        public final void LJ(PdpViewModel pdpViewModel, String str) {
            C1759390vsv.LIZIZ(this, pdpViewModel, str);
        }

        @Override // X.C0NLD
        public final void LIZ(PopUpResponseData popUpResponseData, PdpViewModel pdpViewModel, String str) {
            C1759390vsv.LIZ(popUpResponseData, pdpViewModel, str);
        }

        @Override // X.C0NLD
        public final void LIZIZ(PdpViewModel pdpViewModel, C0NL6 c0nl6, String str) {
            CheckPopUpEntry checkPopUpEntryLJFF = LJFF(pdpViewModel, c0nl6);
            LIZJ(pdpViewModel, checkPopUpEntryLJFF.couponContext, checkPopUpEntryLJFF.triggerType, checkPopUpEntryLJFF.selectedAddressId, checkPopUpEntryLJFF.shipToAddr, checkPopUpEntryLJFF.passThroughParams, null, null);
        }

        @Override // X.C0NLD
        public final void LIZJ(PdpViewModel pdpViewModel, String str, Integer num, String str2, List<Region> list, String str3, String str4, String str5) {
            C1759390vsv.LIZJ(this, pdpViewModel, str, num, str2, list, str3, str4, str5);
        }
    }, new C0NLD() { // from class: X.0vvg
        public static final /* synthetic */ int LIZIZ = 0;
        public final C0NLF LIZ = C0NLF.OVERSEAS_SHIPPING_REMINDER;

        @Override // X.C0NLD
        public final C0NLF getId() {
            return this.LIZ;
        }

        public static final CheckPopUpEntry LJFF(PdpViewModel pdpViewModel, C0NL6 c0nl6) {
            String strLIZ;
            List<NextRequestScene> list;
            ProductPackStruct productPackStruct = pdpViewModel.LLJILLL;
            String strLJIIIIZZ = null;
            if (productPackStruct != null && (list = productPackStruct.nextRequestScenes) != null) {
                strLIZ = C043O.LIZ(list, c0nl6);
            } else {
                strLIZ = null;
            }
            String productId = pdpViewModel.getProductId();
            Integer numValueOf = Integer.valueOf(C0NLF.OVERSEAS_SHIPPING_REMINDER.getValue());
            PageSourceInfo pageSourceInfoLJ = C1766860w4y.LJ(C1766860w4y.LIZ, null, 3);
            if (pageSourceInfoLJ != null) {
                strLJIIIIZZ = C1741890vQh.LJIIIIZZ(pageSourceInfoLJ);
            }
            return new CheckPopUpEntry(productId, numValueOf, null, null, null, strLIZ, strLJIIIIZZ, null);
        }

        @Override // X.C0NLD
        public final CheckPopUpEntry LIZLLL(PdpViewModel pdpViewModel, C0NL6 c0nl6) {
            return LJFF(pdpViewModel, c0nl6);
        }

        @Override // X.C0NLD
        public final void LJ(PdpViewModel pdpViewModel, String str) {
            C1759390vsv.LIZIZ(this, pdpViewModel, str);
        }

        @Override // X.C0NLD
        public final void LIZ(PopUpResponseData popUpResponseData, PdpViewModel pdpViewModel, String str) {
            C1759390vsv.LIZ(popUpResponseData, pdpViewModel, str);
        }

        @Override // X.C0NLD
        public final void LIZIZ(PdpViewModel pdpViewModel, C0NL6 c0nl6, String str) {
            CheckPopUpEntry checkPopUpEntryLJFF = LJFF(pdpViewModel, c0nl6);
            LIZJ(pdpViewModel, checkPopUpEntryLJFF.couponContext, checkPopUpEntryLJFF.triggerType, checkPopUpEntryLJFF.selectedAddressId, checkPopUpEntryLJFF.shipToAddr, checkPopUpEntryLJFF.passThroughParams, str, null);
        }

        @Override // X.C0NLD
        public final void LIZJ(PdpViewModel pdpViewModel, String str, Integer num, String str2, List<Region> list, String str3, String str4, String str5) {
            C1759390vsv.LIZJ(this, pdpViewModel, str, num, str2, list, str3, str4, str5);
        }
    }, new C0NLD() { // from class: X.0vve
        public static final /* synthetic */ int LIZIZ = 0;
        public final C0NLF LIZ = C0NLF.USER_SURVEY;

        @Override // X.C0NLD
        public final C0NLF getId() {
            return this.LIZ;
        }

        public static final CheckPopUpEntry LJFF(PdpViewModel pdpViewModel, C0NL6 c0nl6) {
            String strLIZ;
            List<NextRequestScene> list;
            ProductPackStruct productPackStruct = pdpViewModel.LLJILLL;
            String strLJIIIIZZ = null;
            if (productPackStruct != null && (list = productPackStruct.nextRequestScenes) != null) {
                strLIZ = C043O.LIZ(list, c0nl6);
            } else {
                strLIZ = null;
            }
            C1056604Bg c1056604Bg = C1054504Al.LIZ;
            Map mapLIZ = C1054504Al.LIZ(pdpViewModel.getProductId());
            String productId = pdpViewModel.getProductId();
            Integer numValueOf = Integer.valueOf(C0NLF.USER_SURVEY.getValue());
            String strLJIIIIZZ2 = C1741890vQh.LJIIIIZZ(mapLIZ);
            PageSourceInfo pageSourceInfoLJ = C1766860w4y.LJ(C1766860w4y.LIZ, null, 3);
            if (pageSourceInfoLJ != null) {
                strLJIIIIZZ = C1741890vQh.LJIIIIZZ(pageSourceInfoLJ);
            }
            return new CheckPopUpEntry(productId, numValueOf, strLJIIIIZZ2, null, null, strLIZ, strLJIIIIZZ, null);
        }

        @Override // X.C0NLD
        public final CheckPopUpEntry LIZLLL(PdpViewModel pdpViewModel, C0NL6 c0nl6) {
            return LJFF(pdpViewModel, c0nl6);
        }

        @Override // X.C0NLD
        public final void LJ(PdpViewModel pdpViewModel, String str) {
            C1759390vsv.LIZIZ(this, pdpViewModel, str);
        }

        @Override // X.C0NLD
        public final void LIZ(PopUpResponseData popUpResponseData, PdpViewModel pdpViewModel, String str) {
            C1759390vsv.LIZ(popUpResponseData, pdpViewModel, str);
        }

        @Override // X.C0NLD
        public final void LIZIZ(PdpViewModel pdpViewModel, C0NL6 c0nl6, String str) {
            CheckPopUpEntry checkPopUpEntryLJFF = LJFF(pdpViewModel, c0nl6);
            LIZJ(pdpViewModel, checkPopUpEntryLJFF.couponContext, checkPopUpEntryLJFF.triggerType, checkPopUpEntryLJFF.selectedAddressId, checkPopUpEntryLJFF.shipToAddr, checkPopUpEntryLJFF.passThroughParams, null, null);
        }

        @Override // X.C0NLD
        public final void LIZJ(PdpViewModel pdpViewModel, String str, Integer num, String str2, List<Region> list, String str3, String str4, String str5) {
            C1759390vsv.LIZJ(this, pdpViewModel, str, num, str2, list, str3, str4, str5);
        }
    }, new C0NLD() { // from class: X.0vva
        public static final /* synthetic */ int LIZIZ = 0;
        public final C0NLF LIZ = C0NLF.SURPRISE_COUPON;

        @Override // X.C0NLD
        public final CheckPopUpEntry LIZLLL(PdpViewModel pdpViewModel, C0NL6 c0nl6) {
            return null;
        }

        @Override // X.C0NLD
        public final C0NLF getId() {
            return this.LIZ;
        }

        @Override // X.C0NLD
        public final void LJ(PdpViewModel pdpViewModel, String str) {
            C1759390vsv.LIZIZ(this, pdpViewModel, str);
        }

        @Override // X.C0NLD
        public final void LIZ(PopUpResponseData popUpResponseData, PdpViewModel pdpViewModel, String str) {
            C1759390vsv.LIZ(popUpResponseData, pdpViewModel, str);
        }

        @Override // X.C0NLD
        public final void LIZIZ(PdpViewModel pdpViewModel, C0NL6 c0nl6, String str) {
            String strLIZ;
            List<NextRequestScene> list;
            C1056604Bg c1056604Bg = C1054504Al.LIZ;
            Map mapLIZ = C1054504Al.LIZ(pdpViewModel.getProductId());
            ProductPackStruct productPackStruct = pdpViewModel.LLJILLL;
            if (productPackStruct != null && (list = productPackStruct.nextRequestScenes) != null) {
                strLIZ = C043O.LIZ(list, c0nl6);
            } else {
                strLIZ = null;
            }
            LIZJ(pdpViewModel, C1741890vQh.LJIIIIZZ(mapLIZ), Integer.valueOf(C0NLF.SURPRISE_COUPON.getValue()), null, null, strLIZ, null, null);
        }

        @Override // X.C0NLD
        public final void LIZJ(PdpViewModel pdpViewModel, String str, Integer num, String str2, List<Region> list, String str3, String str4, String str5) {
            C1759390vsv.LIZJ(this, pdpViewModel, str, num, str2, list, str3, str4, str5);
        }
    }, new C0NLD() { // from class: X.0vvf
        public static final /* synthetic */ int LIZIZ = 0;
        public final C0NLF LIZ = C0NLF.US_MEMBERSHIP;

        @Override // X.C0NLD
        public final C0NLF getId() {
            return this.LIZ;
        }

        public static final CheckPopUpEntry LJFF(PdpViewModel pdpViewModel, C0NL6 c0nl6) {
            String strLIZ;
            List<NextRequestScene> list;
            ProductPackStruct productPackStruct = pdpViewModel.LLJILLL;
            String strLJIIIIZZ = null;
            if (productPackStruct != null && (list = productPackStruct.nextRequestScenes) != null) {
                strLIZ = C043O.LIZ(list, c0nl6);
            } else {
                strLIZ = null;
            }
            C1056604Bg c1056604Bg = C1054504Al.LIZ;
            Map mapLIZ = C1054504Al.LIZ(pdpViewModel.getProductId());
            String productId = pdpViewModel.getProductId();
            Integer numValueOf = Integer.valueOf(C0NLF.US_MEMBERSHIP.getValue());
            String strLJIIIIZZ2 = C1741890vQh.LJIIIIZZ(mapLIZ);
            PageSourceInfo pageSourceInfoLJ = C1766860w4y.LJ(C1766860w4y.LIZ, null, 3);
            if (pageSourceInfoLJ != null) {
                strLJIIIIZZ = C1741890vQh.LJIIIIZZ(pageSourceInfoLJ);
            }
            return new CheckPopUpEntry(productId, numValueOf, strLJIIIIZZ2, null, null, strLIZ, strLJIIIIZZ, null);
        }

        @Override // X.C0NLD
        public final CheckPopUpEntry LIZLLL(PdpViewModel pdpViewModel, C0NL6 c0nl6) {
            return LJFF(pdpViewModel, c0nl6);
        }

        @Override // X.C0NLD
        public final void LJ(PdpViewModel pdpViewModel, String str) {
            C1759390vsv.LIZIZ(this, pdpViewModel, str);
        }

        @Override // X.C0NLD
        public final void LIZ(PopUpResponseData popUpResponseData, PdpViewModel pdpViewModel, String str) {
            C1759390vsv.LIZ(popUpResponseData, pdpViewModel, str);
        }

        @Override // X.C0NLD
        public final void LIZIZ(PdpViewModel pdpViewModel, C0NL6 c0nl6, String str) {
            CheckPopUpEntry checkPopUpEntryLJFF = LJFF(pdpViewModel, c0nl6);
            LIZJ(pdpViewModel, checkPopUpEntryLJFF.couponContext, checkPopUpEntryLJFF.triggerType, checkPopUpEntryLJFF.selectedAddressId, checkPopUpEntryLJFF.shipToAddr, checkPopUpEntryLJFF.passThroughParams, null, null);
        }

        @Override // X.C0NLD
        public final void LIZJ(PdpViewModel pdpViewModel, String str, Integer num, String str2, List<Region> list, String str3, String str4, String str5) {
            C1759390vsv.LIZJ(this, pdpViewModel, str, num, str2, list, str3, str4, str5);
        }
    });
    public boolean LIZJ;

    public C1761110vvh(PdpViewModel pdpViewModel) {
        this.LIZ = pdpViewModel;
    }

    public final C0NLD LIZ(C0NLF c0nlf) {
        C0NLD next;
        Iterator<C0NLD> it2 = this.LIZIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getId() == c0nlf) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }
}

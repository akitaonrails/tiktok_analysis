package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BaseTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BigSaleTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardActivityInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardGiveawayInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardTrackParams;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.DiscountTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.FlashDealTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.LiveGiveawayTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.MultiTextTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ProductTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ShopBagTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.SingleTextTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.SizeChartTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateDecoration;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateDecorationTitle;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldProduct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldPromotionInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldText;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.settings.TtecLiveBannerResourceIdSettings;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.settings.TtecLiveMultiBillboardResourceIdSettings;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0v7z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1730290v7z {
    public static final C1730290v7z LIZ = new C1730290v7z();

    public static String LJIIIZ() {
        return TtecLiveMultiBillboardResourceIdSettings.LIZ().templateResourceId;
    }

    public static String LJIIJ() {
        return ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
    }

    public static boolean LJIILIIL() {
        InterfaceC1728700v5Q interfaceC1728700v5QLLI;
        InterfaceC20673515v3 interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
        if (interfaceC20673515v3K4 == null || (interfaceC1728700v5QLLI = interfaceC20673515v3K4.LLI()) == null) {
            return false;
        }
        LiveEffect liveEffectLJI = interfaceC1728700v5QLLI.LJI(interfaceC1728700v5QLLI.LIZ());
        return LJIIJJI(liveEffectLJI != null ? liveEffectLJI.getResourceId() : null);
    }

    public static Object LIZJ(AbstractC23140094w abstractC23140094w) {
        InterfaceC1728700v5Q interfaceC1728700v5QLLI;
        String str;
        InterfaceC20673515v3 interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
        if (interfaceC20673515v3K4 == null || (interfaceC1728700v5QLLI = interfaceC20673515v3K4.LLI()) == null || (str = TtecLiveBannerResourceIdSettings.LIZ().resourceId) == null) {
            return null;
        }
        String str2 = TtecLiveBannerResourceIdSettings.LIZ().panel;
        if (str2 == null) {
            str2 = "live_ec_top_atmosphere";
        }
        String str3 = TtecLiveBannerResourceIdSettings.LIZ().categoryId;
        if (str3 == null) {
            str3 = "top_atmosphere";
        }
        return C23250099c.LJI(abstractC23140094w, C2126308Ur.LIZ, new C324370Cnb(interfaceC1728700v5QLLI, str2, str, str3, null));
    }

    public static int LJ(List list) {
        Object next;
        TemplateFieldData templateFieldData;
        TemplateFieldPromotionInfo templateFieldPromotionInfo;
        Integer num;
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((TemplateField) next).fieldData.fieldPromotionInfo != null) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        TemplateField templateField = (TemplateField) next;
        if (templateField != null && (templateFieldData = templateField.fieldData) != null && (templateFieldPromotionInfo = templateFieldData.fieldPromotionInfo) != null && (num = templateFieldPromotionInfo.maxCount) != null) {
            return num.intValue();
        }
        return 2;
    }

    public static String LJFF(TemplateItem templateItem) {
        TemplateField templateField;
        TemplateFieldData templateFieldData;
        TemplateFieldProduct templateFieldProduct;
        if (templateItem.getType() == 8 && (templateField = (TemplateField) C13LP.LJJJLZIJ(0, templateItem.T5())) != null && (templateFieldData = templateField.fieldData) != null && (templateFieldProduct = templateFieldData.fieldProduct) != null) {
            return templateFieldProduct.productId;
        }
        return null;
    }

    public static String LJI(int i) {
        if (i == 0) {
            return LJIIIZ();
        }
        return TtecLiveMultiBillboardResourceIdSettings.LIZ().photoResourceId;
    }

    public static boolean LJIIJJI(String str) {
        TtecLiveMultiBillboardResourceIdSettings.MultiBillboardResourceIdConfig multiBillboardResourceIdConfigLIZ = TtecLiveMultiBillboardResourceIdSettings.LIZ();
        if (C123100dR.LIZ(str)) {
            if (Intrinsics.LJFF(str, multiBillboardResourceIdConfigLIZ.templateResourceId) || Intrinsics.LJFF(str, multiBillboardResourceIdConfigLIZ.photoResourceId)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LJIIL(Integer num) {
        if (num != null && num.intValue() != 0 && num.intValue() != 3) {
            return false;
        }
        return true;
    }

    public static boolean LJIILJJIL(TemplateItem templateItem) {
        String str;
        List<TemplateDecoration> listTc;
        TemplateDecoration templateDecoration;
        Integer num;
        List<TemplateDecoration> listTc2;
        TemplateDecoration templateDecoration2;
        TemplateDecorationTitle templateDecorationTitle;
        if (templateItem != null && (listTc2 = templateItem.tc()) != null && (templateDecoration2 = (TemplateDecoration) C13LP.LJJJLZIJ(0, listTc2)) != null && (templateDecorationTitle = templateDecoration2.decorationTitle) != null) {
            str = templateDecorationTitle.text;
        } else {
            str = null;
        }
        if (!C123100dR.LIZ(str) || templateItem == null || (listTc = templateItem.tc()) == null || (templateDecoration = (TemplateDecoration) C13LP.LJJJLZIJ(0, listTc)) == null || (num = templateDecoration.decorationType) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public static boolean LJIILL(TemplateItem templateItem) {
        String str;
        List<TemplateDecoration> listTc;
        TemplateDecoration templateDecoration;
        TemplateDecorationTitle templateDecorationTitle;
        if (templateItem != null && (listTc = templateItem.tc()) != null && (templateDecoration = (TemplateDecoration) C13LP.LJJJLZIJ(0, listTc)) != null && (templateDecorationTitle = templateDecoration.decorationTitle) != null) {
            str = templateDecorationTitle.text;
        } else {
            str = null;
        }
        if (!C123100dR.LIZ(str) && (templateItem == null || templateItem.getType() != 4)) {
            return false;
        }
        return true;
    }

    public static String LIZIZ(TemplateItem templateItem, Integer num) {
        int iIntValue;
        TemplateField next;
        TemplateFieldData templateFieldData;
        TemplateFieldText templateFieldText;
        TemplateField next2;
        TemplateFieldData templateFieldData2;
        TemplateFieldText templateFieldText2;
        TemplateField next3;
        TemplateFieldData templateFieldData3;
        TemplateFieldText templateFieldText3;
        BillboardActivityInfo activityInfo;
        int iIntValue2;
        TemplateField next4;
        TemplateFieldData templateFieldData4;
        TemplateFieldText templateFieldText4;
        TemplateField next5;
        TemplateFieldData templateFieldData5;
        TemplateFieldText templateFieldText5;
        TemplateField next6;
        TemplateFieldData templateFieldData6;
        TemplateFieldText templateFieldText6;
        BillboardGiveawayInfo billboardGiveawayInfoVI;
        int type = templateItem.getType();
        if (type != 8) {
            if (type != 9) {
                return null;
            }
            if ((num != null || ((billboardGiveawayInfoVI = templateItem.vI()) != null && (num = Integer.valueOf(billboardGiveawayInfoVI.activityStatus)) != null)) && (iIntValue2 = num.intValue()) != 0 && iIntValue2 != 1) {
                if (iIntValue2 != 2) {
                    if (iIntValue2 != 3) {
                        return null;
                    }
                    Iterator<TemplateField> it2 = templateItem.T5().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next5 = it2.next();
                            if (Intrinsics.LJFF(next5.fieldName, "status_expire")) {
                                break;
                            }
                        } else {
                            next5 = null;
                            break;
                        }
                    }
                    TemplateField templateField = next5;
                    if (templateField == null || (templateFieldData5 = templateField.fieldData) == null || (templateFieldText5 = templateFieldData5.fieldText) == null) {
                        return null;
                    }
                    return templateFieldText5.content;
                }
                Iterator<TemplateField> it3 = templateItem.T5().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next4 = it3.next();
                        if (Intrinsics.LJFF(next4.fieldName, "status_launch")) {
                            break;
                        }
                    } else {
                        next4 = null;
                        break;
                    }
                }
                TemplateField templateField2 = next4;
                if (templateField2 == null || (templateFieldData4 = templateField2.fieldData) == null || (templateFieldText4 = templateFieldData4.fieldText) == null) {
                    return null;
                }
                return templateFieldText4.content;
            }
            Iterator<TemplateField> it4 = templateItem.T5().iterator();
            while (true) {
                if (it4.hasNext()) {
                    next6 = it4.next();
                    if (Intrinsics.LJFF(next6.fieldName, "status_prelaunch")) {
                        break;
                    }
                } else {
                    next6 = null;
                    break;
                }
            }
            TemplateField templateField3 = next6;
            if (templateField3 == null || (templateFieldData6 = templateField3.fieldData) == null || (templateFieldText6 = templateFieldData6.fieldText) == null) {
                return null;
            }
            return templateFieldText6.content;
        }
        if ((num != null || ((activityInfo = templateItem.getActivityInfo()) != null && (num = Integer.valueOf(activityInfo.activityStatus)) != null)) && (iIntValue = num.intValue()) != 0 && iIntValue != 1) {
            if (iIntValue != 2) {
                if (iIntValue != 3) {
                    return null;
                }
                Iterator<TemplateField> it5 = templateItem.T5().iterator();
                while (true) {
                    if (it5.hasNext()) {
                        next2 = it5.next();
                        if (Intrinsics.LJFF(next2.fieldName, "status_expire")) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                TemplateField templateField4 = next2;
                if (templateField4 == null || (templateFieldData2 = templateField4.fieldData) == null || (templateFieldText2 = templateFieldData2.fieldText) == null) {
                    return null;
                }
                return templateFieldText2.content;
            }
            Iterator<TemplateField> it6 = templateItem.T5().iterator();
            while (true) {
                if (it6.hasNext()) {
                    next = it6.next();
                    if (Intrinsics.LJFF(next.fieldName, "status_launch")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            TemplateField templateField5 = next;
            if (templateField5 == null || (templateFieldData = templateField5.fieldData) == null || (templateFieldText = templateFieldData.fieldText) == null) {
                return null;
            }
            return templateFieldText.content;
        }
        Iterator<TemplateField> it7 = templateItem.T5().iterator();
        while (true) {
            if (it7.hasNext()) {
                next3 = it7.next();
                if (Intrinsics.LJFF(next3.fieldName, "status_prelaunch")) {
                    break;
                }
            } else {
                next3 = null;
                break;
            }
        }
        TemplateField templateField6 = next3;
        if (templateField6 == null || (templateFieldData3 = templateField6.fieldData) == null || (templateFieldText3 = templateFieldData3.fieldText) == null) {
            return null;
        }
        return templateFieldText3.content;
    }

    public static Object LIZLLL(boolean z, AbstractC23140094w abstractC23140094w) {
        InterfaceC1728700v5Q interfaceC1728700v5QLLI;
        String strLJIIIZ;
        InterfaceC20673515v3 interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
        if (interfaceC20673515v3K4 == null || (interfaceC1728700v5QLLI = interfaceC20673515v3K4.LLI()) == null) {
            return null;
        }
        if (z) {
            strLJIIIZ = LJIIIZ();
        } else {
            strLJIIIZ = TtecLiveMultiBillboardResourceIdSettings.LIZ().photoResourceId;
        }
        if (strLJIIIZ == null) {
            return null;
        }
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(abstractC23140094w));
        c2252611DEt.LJIJJ();
        interfaceC1728700v5QLLI.LIZ();
        interfaceC1728700v5QLLI.LIZJ(strLJIIIZ, "greenscreen", new AwS583S0100000_4(c2252611DEt, 261));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(abstractC23140094w);
        }
        return objLJIJ;
    }

    public static TemplateItem LJIIZILJ(TemplateItem templateItem, int i) {
        String str;
        String str2;
        Integer numValueOf;
        Integer numValueOf2;
        Long l;
        Long l2;
        boolean z = templateItem instanceof FlashDealTemplateItem;
        String str3 = null;
        Long l3 = null;
        if (z) {
            FlashDealTemplateItem flashDealTemplateItem = (FlashDealTemplateItem) templateItem;
            BillboardActivityInfo billboardActivityInfo = flashDealTemplateItem.activityInfo;
            if (billboardActivityInfo != null) {
                numValueOf = Integer.valueOf(billboardActivityInfo.activityStatus);
            } else {
                numValueOf = null;
            }
            Integer numValueOf3 = Integer.valueOf(i);
            BillboardActivityInfo billboardActivityInfo2 = flashDealTemplateItem.activityInfo;
            if (billboardActivityInfo2 != null) {
                numValueOf2 = billboardActivityInfo2.activityNum;
            } else {
                numValueOf2 = null;
            }
            if (numValueOf != null && numValueOf3 != null && numValueOf2 != null) {
                if (numValueOf.intValue() != 3 && numValueOf3.intValue() == 3) {
                    numValueOf2 = Integer.valueOf(numValueOf2.intValue() - 1);
                }
            } else {
                numValueOf2 = null;
            }
            BillboardActivityInfo billboardActivityInfo3 = flashDealTemplateItem.activityInfo;
            if (billboardActivityInfo3 != null) {
                l = billboardActivityInfo3.activityId;
                l2 = billboardActivityInfo3.beginTime;
                l3 = billboardActivityInfo3.endTime;
            } else {
                l = null;
                l2 = null;
            }
            return FlashDealTemplateItem.LIZ(flashDealTemplateItem, null, null, false, false, new BillboardActivityInfo(i, numValueOf2, l, l2, l3), false, null, 258047);
        }
        if (!(templateItem instanceof LiveGiveawayTemplateItem)) {
            return null;
        }
        LiveGiveawayTemplateItem liveGiveawayTemplateItem = (LiveGiveawayTemplateItem) templateItem;
        BillboardGiveawayInfo billboardGiveawayInfo = liveGiveawayTemplateItem.giveawayInfo;
        if (billboardGiveawayInfo != null) {
            str = billboardGiveawayInfo.activityId;
            str2 = billboardGiveawayInfo.startTime;
            str3 = billboardGiveawayInfo.openTime;
        } else {
            str = null;
            str2 = null;
        }
        return LiveGiveawayTemplateItem.LIZ(liveGiveawayTemplateItem, null, null, false, false, new BillboardGiveawayInfo(i, str, str2, str3), false, null, 253951);
    }

    public static BaseTemplateItem LJIILLIIL(TemplateItem templateItem, boolean z, long j, boolean z2, BillboardTrackParams billboardTrackParams) {
        return new BaseTemplateItem(templateItem.getType(), templateItem.getSubType(), templateItem.getTemplateId(), templateItem.gy(), templateItem.kv(), templateItem.S3(), templateItem.Cc(), templateItem.T5(), templateItem.b0(), templateItem.Sm(), z, templateItem.PK(), templateItem.getActivityInfo(), templateItem.vI(), templateItem.tc(), Long.valueOf(j), z2, billboardTrackParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(java.lang.String r14, java.lang.String r15, java.lang.Integer r16, java.lang.String r17, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RespTemplateItem> r18) {
        /*
            r13 = this;
            r3 = r18
            r11 = r17
            boolean r0 = r3 instanceof X.C1730310v81
            if (r0 == 0) goto L25
            r12 = r3
            X.0v81 r12 = (X.C1730310v81) r12
            int r2 = r12.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r12.LLILLL = r2
        L16:
            java.lang.Object r1 = r12.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r12.LLILLL
            r3 = 1
            r9 = 0
            if (r0 == 0) goto L33
            if (r0 != r3) goto L2b
            goto L5d
        L25:
            X.0v81 r12 = new X.0v81
            r12.<init>(r13, r3)
            goto L16
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            X.C155000ia.LIZIZ(r1)
            if (r16 != 0) goto L39
            return r9
        L39:
            X.0v4f r0 = new X.0v4f
            r0.<init>()
            X.0v4e r2 = r0.LLILLJJLI     // Catch: java.lang.Throwable -> L63
            int r8 = r16.intValue()     // Catch: java.lang.Throwable -> L63
            r10 = 0
            int r1 = r16.intValue()     // Catch: java.lang.Throwable -> L63
            r0 = 9
            if (r1 == r0) goto L4e
            r11 = r9
        L4e:
            r12.LLILLL = r3     // Catch: java.lang.Throwable -> L63
            X.0v4f r0 = r2.LL     // Catch: java.lang.Throwable -> L63
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.repo.BillboardNetApi r5 = r0.LL     // Catch: java.lang.Throwable -> L63
            r7 = r15
            r6 = r14
            java.lang.Object r1 = r5.getTemplateByType(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L63
            if (r1 != r4) goto L60
            return r4
        L5d:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L63
        L60:
            X.0X52 r1 = (X.C0X52) r1     // Catch: java.lang.Throwable -> L63
            goto L68
        L63:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r1 = r9
        L68:
            if (r1 == 0) goto L78
            T r0 = r1.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0
            if (r0 == 0) goto L78
            T r0 = r0.data
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateByTypeData r0 = (com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateByTypeData) r0
            if (r0 == 0) goto L78
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RespTemplateItem r9 = r0.template
        L78:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1730290v7z.LJIIIIZZ(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0103 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.Integer r36, boolean r37, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem> r38) {
        /*
            Method dump skipped, instruction units count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1730290v7z.LJII(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, boolean, X.05Vn):java.lang.Object");
    }

    public static TemplateItem LIZ(C1730290v7z c1730290v7z, TemplateItem templateItem, Boolean bool, Boolean bool2, Boolean bool3, String str, BillboardTrackParams billboardTrackParams, int i) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        boolean zBooleanValue3;
        boolean zBooleanValue4;
        boolean zBooleanValue5;
        boolean zBooleanValue6;
        boolean zBooleanValue7;
        boolean zBooleanValue8;
        boolean zBooleanValue9;
        boolean zBooleanValue10;
        boolean zBooleanValue11;
        boolean zBooleanValue12;
        boolean zBooleanValue13;
        boolean zBooleanValue14;
        boolean zBooleanValue15;
        boolean zBooleanValue16;
        boolean zBooleanValue17;
        boolean zBooleanValue18;
        boolean zBooleanValue19;
        boolean zBooleanValue20;
        boolean zBooleanValue21;
        boolean zBooleanValue22;
        boolean zBooleanValue23;
        boolean zBooleanValue24;
        boolean zBooleanValue25;
        boolean zBooleanValue26;
        boolean zBooleanValue27;
        BillboardTrackParams billboardTrackParams2 = billboardTrackParams;
        String str2 = str;
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            bool2 = null;
        }
        if ((i & 8) != 0) {
            bool3 = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            billboardTrackParams2 = null;
        }
        c1730290v7z.getClass();
        if (templateItem instanceof MultiTextTemplateItem) {
            MultiTextTemplateItem multiTextTemplateItem = (MultiTextTemplateItem) templateItem;
            if (bool != null) {
                zBooleanValue25 = bool.booleanValue();
            } else {
                zBooleanValue25 = multiTextTemplateItem.isUsing;
            }
            if (bool2 != null) {
                zBooleanValue26 = bool2.booleanValue();
            } else {
                zBooleanValue26 = multiTextTemplateItem.isDisplayEnable;
            }
            if (bool3 != null) {
                zBooleanValue27 = bool3.booleanValue();
            } else {
                zBooleanValue27 = multiTextTemplateItem.isLiveTakeDefault;
            }
            if (str2 == null) {
                str2 = multiTextTemplateItem.templateId;
            }
            if (billboardTrackParams2 == null) {
                billboardTrackParams2 = multiTextTemplateItem.trackParams;
            }
            return MultiTextTemplateItem.LIZ(multiTextTemplateItem, str2, null, zBooleanValue25, zBooleanValue26, zBooleanValue27, billboardTrackParams2, 64763);
        }
        if (templateItem instanceof SingleTextTemplateItem) {
            SingleTextTemplateItem singleTextTemplateItem = (SingleTextTemplateItem) templateItem;
            if (bool != null) {
                zBooleanValue22 = bool.booleanValue();
            } else {
                zBooleanValue22 = singleTextTemplateItem.isUsing;
            }
            if (bool2 != null) {
                zBooleanValue23 = bool2.booleanValue();
            } else {
                zBooleanValue23 = singleTextTemplateItem.isDisplayEnable;
            }
            if (bool3 != null) {
                zBooleanValue24 = bool3.booleanValue();
            } else {
                zBooleanValue24 = singleTextTemplateItem.isLiveTakeDefault;
            }
            if (str2 == null) {
                str2 = singleTextTemplateItem.templateId;
            }
            if (billboardTrackParams2 == null) {
                billboardTrackParams2 = singleTextTemplateItem.trackParams;
            }
            return SingleTextTemplateItem.LIZ(singleTextTemplateItem, str2, null, zBooleanValue22, zBooleanValue23, zBooleanValue24, billboardTrackParams2, 64763);
        }
        if (templateItem instanceof ProductTemplateItem) {
            ProductTemplateItem productTemplateItem = (ProductTemplateItem) templateItem;
            if (bool != null) {
                zBooleanValue19 = bool.booleanValue();
            } else {
                zBooleanValue19 = productTemplateItem.isUsing;
            }
            if (bool2 != null) {
                zBooleanValue20 = bool2.booleanValue();
            } else {
                zBooleanValue20 = productTemplateItem.isDisplayEnable;
            }
            if (bool3 != null) {
                zBooleanValue21 = bool3.booleanValue();
            } else {
                zBooleanValue21 = productTemplateItem.isLiveTakeDefault;
            }
            if (str2 == null) {
                str2 = productTemplateItem.templateId;
            }
            if (billboardTrackParams2 == null) {
                billboardTrackParams2 = productTemplateItem.trackParams;
            }
            return ProductTemplateItem.LIZ(productTemplateItem, str2, null, zBooleanValue19, zBooleanValue20, zBooleanValue21, billboardTrackParams2, 64763);
        }
        if (templateItem instanceof DiscountTemplateItem) {
            DiscountTemplateItem discountTemplateItem = (DiscountTemplateItem) templateItem;
            if (bool != null) {
                zBooleanValue16 = bool.booleanValue();
            } else {
                zBooleanValue16 = discountTemplateItem.isUsing;
            }
            if (bool2 != null) {
                zBooleanValue17 = bool2.booleanValue();
            } else {
                zBooleanValue17 = discountTemplateItem.isDisplayEnable;
            }
            if (bool3 != null) {
                zBooleanValue18 = bool3.booleanValue();
            } else {
                zBooleanValue18 = discountTemplateItem.isLiveTakeDefault;
            }
            if (str2 == null) {
                str2 = discountTemplateItem.templateId;
            }
            if (billboardTrackParams2 == null) {
                billboardTrackParams2 = discountTemplateItem.trackParams;
            }
            return DiscountTemplateItem.LIZ(discountTemplateItem, str2, null, zBooleanValue16, zBooleanValue17, zBooleanValue18, billboardTrackParams2, 64763);
        }
        if (templateItem instanceof SizeChartTemplateItem) {
            SizeChartTemplateItem sizeChartTemplateItem = (SizeChartTemplateItem) templateItem;
            if (bool != null) {
                zBooleanValue13 = bool.booleanValue();
            } else {
                zBooleanValue13 = sizeChartTemplateItem.isUsing;
            }
            if (bool2 != null) {
                zBooleanValue14 = bool2.booleanValue();
            } else {
                zBooleanValue14 = sizeChartTemplateItem.isDisplayEnable;
            }
            if (bool3 != null) {
                zBooleanValue15 = bool3.booleanValue();
            } else {
                zBooleanValue15 = sizeChartTemplateItem.isLiveTakeDefault;
            }
            if (str2 == null) {
                str2 = sizeChartTemplateItem.templateId;
            }
            if (billboardTrackParams2 == null) {
                billboardTrackParams2 = sizeChartTemplateItem.trackParams;
            }
            return SizeChartTemplateItem.LIZ(sizeChartTemplateItem, str2, null, zBooleanValue13, zBooleanValue14, zBooleanValue15, billboardTrackParams2, 64763);
        }
        if (templateItem instanceof ShopBagTemplateItem) {
            ShopBagTemplateItem shopBagTemplateItem = (ShopBagTemplateItem) templateItem;
            if (bool != null) {
                zBooleanValue10 = bool.booleanValue();
            } else {
                zBooleanValue10 = shopBagTemplateItem.isUsing;
            }
            if (bool2 != null) {
                zBooleanValue11 = bool2.booleanValue();
            } else {
                zBooleanValue11 = shopBagTemplateItem.isDisplayEnable;
            }
            if (bool3 != null) {
                zBooleanValue12 = bool3.booleanValue();
            } else {
                zBooleanValue12 = shopBagTemplateItem.isLiveTakeDefault;
            }
            if (str2 == null) {
                str2 = shopBagTemplateItem.templateId;
            }
            if (billboardTrackParams2 == null) {
                billboardTrackParams2 = shopBagTemplateItem.trackParams;
            }
            return ShopBagTemplateItem.LIZ(shopBagTemplateItem, str2, null, zBooleanValue10, zBooleanValue11, zBooleanValue12, billboardTrackParams2, 64763);
        }
        if (templateItem instanceof BigSaleTemplateItem) {
            BigSaleTemplateItem bigSaleTemplateItem = (BigSaleTemplateItem) templateItem;
            if (bool != null) {
                zBooleanValue7 = bool.booleanValue();
            } else {
                zBooleanValue7 = bigSaleTemplateItem.isUsing;
            }
            if (bool2 != null) {
                zBooleanValue8 = bool2.booleanValue();
            } else {
                zBooleanValue8 = bigSaleTemplateItem.isDisplayEnable;
            }
            if (bool3 != null) {
                zBooleanValue9 = bool3.booleanValue();
            } else {
                zBooleanValue9 = bigSaleTemplateItem.isLiveTakeDefault;
            }
            if (str2 == null) {
                str2 = bigSaleTemplateItem.templateId;
            }
            if (billboardTrackParams2 == null) {
                billboardTrackParams2 = bigSaleTemplateItem.trackParams;
            }
            return BigSaleTemplateItem.LIZ(bigSaleTemplateItem, str2, null, zBooleanValue7, zBooleanValue8, zBooleanValue9, billboardTrackParams2, 64763);
        }
        if (templateItem instanceof FlashDealTemplateItem) {
            FlashDealTemplateItem flashDealTemplateItem = (FlashDealTemplateItem) templateItem;
            if (bool != null) {
                zBooleanValue4 = bool.booleanValue();
            } else {
                zBooleanValue4 = flashDealTemplateItem.isUsing;
            }
            if (bool2 != null) {
                zBooleanValue5 = bool2.booleanValue();
            } else {
                zBooleanValue5 = flashDealTemplateItem.isDisplayEnable;
            }
            if (bool3 != null) {
                zBooleanValue6 = bool3.booleanValue();
            } else {
                zBooleanValue6 = flashDealTemplateItem.isLiveTakeDefault;
            }
            if (str2 == null) {
                str2 = flashDealTemplateItem.templateId;
            }
            if (billboardTrackParams2 == null) {
                billboardTrackParams2 = flashDealTemplateItem.trackParams;
            }
            return FlashDealTemplateItem.LIZ(flashDealTemplateItem, str2, null, zBooleanValue4, zBooleanValue5, null, zBooleanValue6, billboardTrackParams2, 64763);
        }
        if (!(templateItem instanceof LiveGiveawayTemplateItem)) {
            return null;
        }
        LiveGiveawayTemplateItem liveGiveawayTemplateItem = (LiveGiveawayTemplateItem) templateItem;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = liveGiveawayTemplateItem.isUsing;
        }
        if (bool2 != null) {
            zBooleanValue2 = bool2.booleanValue();
        } else {
            zBooleanValue2 = liveGiveawayTemplateItem.isDisplayEnable;
        }
        if (bool3 != null) {
            zBooleanValue3 = bool3.booleanValue();
        } else {
            zBooleanValue3 = liveGiveawayTemplateItem.isLiveTakeDefault;
        }
        if (str2 == null) {
            str2 = liveGiveawayTemplateItem.templateId;
        }
        if (billboardTrackParams2 == null) {
            billboardTrackParams2 = liveGiveawayTemplateItem.trackParams;
        }
        return LiveGiveawayTemplateItem.LIZ(liveGiveawayTemplateItem, str2, null, zBooleanValue, zBooleanValue2, null, zBooleanValue3, billboardTrackParams2, 64763);
    }
}

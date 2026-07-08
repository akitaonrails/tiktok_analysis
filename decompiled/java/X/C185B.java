package X;

import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.FlashSaleEnhancementConfig;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.FlashSaleEnhancementTagProgressUiConfig;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PriceTextConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphere;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereResource;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereStock;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleBuyerInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleEnhancementInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleEnhancementPriceCurveInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleEnhancementText;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleEnhancementTextInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PlaceholderInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.text.u;

/* JADX INFO: renamed from: X.185B, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C185B {
    public static final /* synthetic */ int LIZ = 0;

    public static C185G LIZ(FlashSaleAtmosphereInfo flashSaleAtmosphereInfo) {
        FlashSaleEnhancementInfo flashSaleEnhancementInfo;
        FlashSaleEnhancementTextInfo flashSaleEnhancementTextInfo;
        boolean z;
        boolean z2;
        long j;
        String str;
        double d;
        Map<Long, String> map;
        FlashSaleAtmosphere flashSaleAtmosphere = flashSaleAtmosphereInfo.flashSaleAtmosphere;
        String strLJJIFFI = null;
        if (flashSaleAtmosphere == null || (flashSaleEnhancementInfo = flashSaleAtmosphere.enhancementInfo) == null || (flashSaleEnhancementTextInfo = flashSaleEnhancementInfo.enhancementTextInfo) == null) {
            return null;
        }
        FlashSaleEnhancementText flashSaleEnhancementText = (FlashSaleEnhancementText) C13LP.LJJJLL(flashSaleEnhancementTextInfo.enhancementTexts);
        if (flashSaleEnhancementText == null) {
            flashSaleEnhancementText = new FlashSaleEnhancementText(0, null, 2, null);
        }
        C212287185t c212287185t = InterfaceC212283185p.LJIIZILJ;
        int i = flashSaleAtmosphere.status;
        c212287185t.getClass();
        if (2 != i && 3 != i) {
            z = false;
        } else {
            z = true;
        }
        if (flashSaleAtmosphereInfo.hotTagActivityType == 5) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i2 = flashSaleEnhancementInfo.enhancementStyle;
        int i3 = flashSaleEnhancementText.type;
        FlashSaleEnhancementTextInfo flashSaleEnhancementTextInfo2 = flashSaleEnhancementInfo.enhancementTextInfo;
        if (flashSaleEnhancementTextInfo2 != null) {
            j = flashSaleEnhancementTextInfo2.showCountdownThreshold * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        } else {
            j = 0;
        }
        FlashSaleAtmosphereResource flashSaleAtmosphereResource = flashSaleAtmosphereInfo.flashSaleAtmosphereResource;
        if (flashSaleAtmosphereResource != null) {
            str = flashSaleAtmosphereResource.preheatHighlightTextColor;
        } else {
            str = null;
        }
        List<FlashSaleBuyerInfo> list = flashSaleEnhancementInfo.buyerInfos;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<FlashSaleBuyerInfo> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C1555800qaY(it2.next().avatar));
        }
        FlashSaleEnhancementTextInfo flashSaleEnhancementTextInfo3 = flashSaleEnhancementInfo.enhancementTextInfo;
        if (flashSaleEnhancementTextInfo3 != null && (map = flashSaleEnhancementTextInfo3.allTexts) != null) {
            strLJJIFFI = map.get(Long.valueOf(flashSaleEnhancementText.type));
        }
        String str2 = "";
        if (strLJJIFFI == null) {
            strLJJIFFI = "";
        }
        if (strLJJIFFI.length() != 0) {
            for (PlaceholderInfo placeholderInfo : flashSaleEnhancementText.placeholderInfo) {
                strLJJIFFI = u.LJJIFFI(strLJJIFFI, placeholderInfo.placeholder, placeholderInfo.value, false);
            }
            str2 = strLJJIFFI;
        }
        FlashSaleEnhancementPriceCurveInfo flashSaleEnhancementPriceCurveInfo = flashSaleEnhancementInfo.enhancementPriceCurveInfo;
        if (flashSaleEnhancementPriceCurveInfo != null) {
            d = flashSaleEnhancementPriceCurveInfo.changeRate;
        } else {
            d = 0.0d;
        }
        return new C185G(z, z2, i2, i3, j, str, arrayList, str2, d);
    }

    public static float LIZIZ(FlashSaleAtmosphereInfo flashSaleAtmosphereInfo) {
        double d;
        FlashSaleEnhancementInfo flashSaleEnhancementInfo;
        FlashSaleEnhancementPriceCurveInfo flashSaleEnhancementPriceCurveInfo;
        FlashSaleAtmosphereStock flashSaleAtmosphereStock = flashSaleAtmosphereInfo.flashSaleAtmosphereStock;
        float fLIZLLL = 0.0f;
        if (flashSaleAtmosphereStock == null) {
            return 0.0f;
        }
        int i = flashSaleAtmosphereStock.totalActivityStock;
        if (i > 0) {
            fLIZLLL = C13LZ.LIZLLL(flashSaleAtmosphereStock.activityStock / i, 0.0f, 1.0f);
        }
        FlashSaleAtmosphere flashSaleAtmosphere = flashSaleAtmosphereInfo.flashSaleAtmosphere;
        if (flashSaleAtmosphere != null && (flashSaleEnhancementInfo = flashSaleAtmosphere.enhancementInfo) != null && (flashSaleEnhancementPriceCurveInfo = flashSaleEnhancementInfo.enhancementPriceCurveInfo) != null) {
            d = flashSaleEnhancementPriceCurveInfo.changeRate;
        } else {
            d = 0.0d;
        }
        return C415470GQv.LIZ(d, fLIZLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.util.List] */
    public static C185F LIZJ(FlashSaleAtmosphereInfo flashSaleAtmosphereInfo, List list, long j) {
        FlashSaleAtmosphere flashSaleAtmosphere;
        PromotionLabel promotionLabel;
        ?? arrayList;
        Map<Long, String> mapLJ;
        PriceTextConfig priceTextConfig;
        FlashSaleEnhancementTagProgressUiConfig flashSaleEnhancementTagProgressUiConfig;
        FlashSaleEnhancementTextInfo flashSaleEnhancementTextInfo;
        Object objPrevious;
        C185G c185gLIZ = LIZ(flashSaleAtmosphereInfo);
        if (c185gLIZ == null || (flashSaleAtmosphere = flashSaleAtmosphereInfo.flashSaleAtmosphere) == null) {
            return null;
        }
        long j2 = flashSaleAtmosphere.endTime - j;
        if (list != null) {
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    objPrevious = listIterator.previous();
                    if (((PromotionLabel) objPrevious).type == 4) {
                        break;
                    }
                } else {
                    objPrevious = null;
                    break;
                }
            }
            promotionLabel = (PromotionLabel) objPrevious;
            arrayList = new ArrayList();
            for (Object obj : list) {
                PromotionLabel promotionLabel2 = (PromotionLabel) obj;
                if (!C19676311yb.LIZLLL(promotionLabel2) && promotionLabel2.type != 4) {
                    arrayList.add(obj);
                }
            }
        } else {
            promotionLabel = null;
            arrayList = C13BV.INSTANCE;
        }
        FlashSaleEnhancementConfig flashSaleEnhancementConfig = flashSaleAtmosphereInfo.LIZ;
        int i = c185gLIZ.LIZLLL;
        String str = c185gLIZ.LJII;
        String str2 = flashSaleAtmosphere.preheatText;
        if (str2 == null) {
            str2 = "";
        }
        FlashSaleEnhancementInfo flashSaleEnhancementInfo = flashSaleAtmosphere.enhancementInfo;
        if (flashSaleEnhancementInfo == null || (flashSaleEnhancementTextInfo = flashSaleEnhancementInfo.enhancementTextInfo) == null || (mapLJ = flashSaleEnhancementTextInfo.allTexts) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        List<C1555800qaY> list2 = c185gLIZ.LJI;
        long j3 = c185gLIZ.LJ;
        float fLIZIZ = LIZIZ(flashSaleAtmosphereInfo);
        String str3 = c185gLIZ.LJFF;
        boolean z = c185gLIZ.LIZIZ;
        boolean z2 = !arrayList.isEmpty();
        if (flashSaleEnhancementConfig != null) {
            priceTextConfig = flashSaleEnhancementConfig.tagTextUiConfig;
            flashSaleEnhancementTagProgressUiConfig = flashSaleEnhancementConfig.tagProgressUiConfig;
        } else {
            priceTextConfig = null;
            flashSaleEnhancementTagProgressUiConfig = null;
        }
        return new C185F(i, str, str2, mapLJ, list2, j2, j3, fLIZIZ, str3, z, promotionLabel, z2, arrayList, priceTextConfig, flashSaleEnhancementTagProgressUiConfig);
    }
}

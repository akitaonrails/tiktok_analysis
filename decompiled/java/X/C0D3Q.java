package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0D3Q, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D3Q {
    public static final C0D3Q LIZ = new C0D3Q();

    public static Map LIZ(C0D3V c0d3v, C332820D2y c332820D2y) {
        Object next;
        Object value;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C332830D2z c332830D2z : c0d3v.skuOptions) {
            Iterator<T> it2 = c332820D2y.options.entrySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (u.LJIJI((String) ((Map.Entry) next).getKey(), c332830D2z.type, true)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry != null && (value = entry.getValue()) != null) {
                linkedHashMap.put(c332830D2z.type, value);
            }
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap.putAll(c332820D2y.options);
        }
        return linkedHashMap;
    }

    public static Map LIZIZ(C0D3V c0d3v, LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        for (C332830D2z c332830D2z : c0d3v.skuOptions) {
            if (!linkedHashMap2.containsKey(c332830D2z.type) && (!c332830D2z.options.isEmpty())) {
                linkedHashMap2.put(c332830D2z.type, ((C332800D2w) C13LP.LJJJJZI(c332830D2z.options)).value);
            }
        }
        return linkedHashMap2;
    }

    public static boolean LIZJ(C332820D2y c332820D2y, Map map, int i) {
        if (c332820D2y.options.size() != i) {
            return false;
        }
        if (!map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Map<String, String> map2 = c332820D2y.options;
                if (map2.isEmpty()) {
                    return false;
                }
                for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                    String key = entry2.getKey();
                    String value = entry2.getValue();
                    if (!u.LJIJI(key, str, true) || !u.LJIJI(value, str2, true)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static C0D21 LIZLLL(C0D21 c0d21, UniversalProductDto universalProductDto, Map map) {
        List list;
        String strLIZJ = C332850D3b.LIZJ(map);
        C0D3I c0d3i = c0d21.getPageData().productMedia;
        if (c0d3i == null || !c0d3i.canAcceptCatalogEnrichment(strLIZJ)) {
            return c0d21;
        }
        C0D3V c0d3v = c0d21.getPageData().skuSelection;
        if (c0d3v == null || (list = c0d3v.variants) == null) {
            list = C13BV.INSTANCE;
        }
        Pair pairLIZIZ = C332790D2v.LIZIZ(C332790D2v.LJ(list, map), C332790D2v.LIZJ(universalProductDto), c0d21.getPageData().entrySpuImageUrls);
        List list2 = (List) pairLIZIZ.getFirst();
        EnumC332810D2x enumC332810D2x = (EnumC332810D2x) pairLIZIZ.getSecond();
        if (list2.isEmpty()) {
            return c0d21;
        }
        C0D3I c0d3iLIZ = C0D3F.LIZ(C0D3I.Companion, list2, c0d3i.selectionFingerprint, enumC332810D2x, C0D3G.LOCKED, 8);
        if (Intrinsics.LJFF(list2, c0d3i.imageUrls) && c0d3i.isLocked() && c0d3i.source == enumC332810D2x) {
            return c0d21;
        }
        C0D3K pageData = c0d21.getPageData();
        return new C0D21(pageData.copy(pageData.productId, pageData.entrySpuImageUrls, pageData.shopHeader, c0d3iLIZ, pageData.priceInfo, pageData.titleRating, pageData.skuSelection, pageData.descriptionInfo, pageData.logisticsInfo, pageData.dealsInfo, pageData.reviewInfo, pageData.moreFromShop, pageData.bottomBar));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static C0D21 LJ(C0D21 c0d21, String str, String str2) {
        C0D3V c0d3v = c0d21.getPageData().skuSelection;
        if (c0d3v == null) {
            return c0d21;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c0d3v.optionImageUrls);
        linkedHashMap.put(str, str2);
        C0D3K pageData = c0d21.getPageData();
        return new C0D21(pageData.copy(pageData.productId, pageData.entrySpuImageUrls, pageData.shopHeader, pageData.productMedia, pageData.priceInfo, pageData.titleRating, c0d3v.copy(c0d3v.skuOptions, c0d3v.variants, c0d3v.selectedSkuOptions, c0d3v.defaultSkuOptions, c0d3v.showSkuDialog, linkedHashMap, c0d3v.variantCompareAtPrices, c0d3v.selectedVariantId, c0d3v.isVariantLoading, c0d3v.availableForSale, c0d3v.variantPrices, c0d3v.isAcpScene, c0d3v.renderVisualColor), pageData.descriptionInfo, pageData.logisticsInfo, pageData.dealsInfo, pageData.reviewInfo, pageData.moreFromShop, pageData.bottomBar));
    }

    public static C0D21 LJFF(C0D21 c0d21, Map map, AbstractC332990D3p abstractC332990D3p) {
        C0D3V c0d3vCopy;
        List list;
        C0D3I c0d3iLIZ;
        C332840D3a c332840D3a;
        AbstractC332990D3p abstractC332990D3p2 = abstractC332990D3p;
        C0D3V c0d3v = c0d21.getPageData().skuSelection;
        C332840D3a c332840D3aCopy = null;
        if (c0d3v != null) {
            c0d3vCopy = c0d3v.copy(c0d3v.skuOptions, c0d3v.variants, c0d3v.selectedSkuOptions, c0d3v.defaultSkuOptions, c0d3v.showSkuDialog, c0d3v.optionImageUrls, c0d3v.variantCompareAtPrices, c0d3v.selectedVariantId, false, c0d3v.availableForSale, c0d3v.variantPrices, c0d3v.isAcpScene, c0d3v.renderVisualColor);
        } else {
            c0d3vCopy = null;
        }
        if (c0d3v == null || (list = c0d3v.variants) == null) {
            list = C13BV.INSTANCE;
        }
        List listLJ = C332790D2v.LJ(list, map);
        C13BV c13bv = C13BV.INSTANCE;
        Pair pairLIZIZ = C332790D2v.LIZIZ(listLJ, c13bv, c0d21.getPageData().entrySpuImageUrls);
        List list2 = (List) pairLIZIZ.getFirst();
        EnumC332810D2x enumC332810D2x = (EnumC332810D2x) pairLIZIZ.getSecond();
        if (list2.isEmpty()) {
            C0D3F c0d3f = C0D3I.Companion;
            String strLIZJ = C332850D3b.LIZJ(map);
            C0D3G c0d3g = C0D3G.LOCKED;
            c0d3f.getClass();
            c0d3iLIZ = new C0D3I(c13bv, EnumC332810D2x.PLACEHOLDER_BAG, C0D3J.FINAL_NO_IMAGE, C0D3H.PLACEHOLDER, c0d3g, strLIZJ);
        } else {
            c0d3iLIZ = C0D3F.LIZ(C0D3I.Companion, list2, C332850D3b.LIZJ(map), enumC332810D2x, C0D3G.LOCKED, 8);
        }
        C0D3K pageData = c0d21.getPageData();
        C332840D3a c332840D3a2 = c0d21.getPageData().bottomBar;
        if (c332840D3a2 != null) {
            if (abstractC332990D3p2 == null && ((c332840D3a = c0d21.getPageData().bottomBar) == null || (abstractC332990D3p2 = c332840D3a.buyNowUiState) == null)) {
                abstractC332990D3p2 = C333010D3r.INSTANCE;
            }
            c332840D3aCopy = c332840D3a2.copy(c332840D3a2.visible, c332840D3a2.showVisitWebsiteButton, c332840D3a2.buyNowButtonLabel, c332840D3a2.buyNowButtonTextType, c332840D3a2.buyNowButtonBgColor, c332840D3a2.buyNowButtonTextColor, c332840D3a2.disclaimerText, c332840D3a2.showDisclaimerInfoIcon, abstractC332990D3p2);
        }
        return new C0D21(pageData.copy(pageData.productId, pageData.entrySpuImageUrls, pageData.shopHeader, c0d3iLIZ, pageData.priceInfo, pageData.titleRating, c0d3vCopy, pageData.descriptionInfo, pageData.logisticsInfo, pageData.dealsInfo, pageData.reviewInfo, pageData.moreFromShop, c332840D3aCopy));
    }

    public static C332820D2y LJI(C0D3V c0d3v, int i, int i2, List list, LinkedHashMap linkedHashMap) {
        C332820D2y c332820D2y = null;
        if (i == i2) {
            Iterator<C332820D2y> it2 = c0d3v.variants.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C332820D2y next = it2.next();
                C332820D2y c332820D2y2 = next;
                if (c332820D2y2.availableForSale) {
                    LIZ.getClass();
                    if (LIZJ(c332820D2y2, linkedHashMap, i2)) {
                        c332820D2y = next;
                        break;
                    }
                }
            }
            return c332820D2y;
        }
        String str = ((C332830D2z) ListProtector.get(c0d3v.skuOptions, i)).type;
        Iterator it3 = ((List) ListProtector.get(list, i)).iterator();
        while (it3.hasNext()) {
            linkedHashMap.put(str, it3.next());
            C332820D2y c332820D2yLJI = LJI(c0d3v, i + 1, i2, list, linkedHashMap);
            if (c332820D2yLJI != null) {
                return c332820D2yLJI;
            }
        }
        linkedHashMap.remove(str);
        return null;
    }
}

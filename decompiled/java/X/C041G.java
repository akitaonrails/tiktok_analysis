package X;

import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRightPanel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PdpPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonConfig;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuQuantityProperty;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSaleProp;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import r4b.f;

/* JADX INFO: renamed from: X.041G, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C041G {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Image image) {
        C1334210kp9.LIZ(image, EnumC1769850w9n.SKU_SHOP_HEAD, EnumC1769850w9n.SKU_SHOP, null, null, null, 248);
    }

    public static void LIZIZ(List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            List<SalePropValue> list2 = ((SaleProp) it2.next()).salePropValueList;
            if (list2 != null) {
                Iterator<SalePropValue> it3 = list2.iterator();
                while (it3.hasNext()) {
                    Image image = it3.next().image;
                    if (image != null) {
                        C1334210kp9.LIZ(image, EnumC1769850w9n.SKU_SHOP_HEAD, EnumC1769850w9n.SKU_SHOP, null, null, null, 248);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Map LJII(List list) {
        HashMap map = new HashMap();
        if (list != null) {
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(((PromotionItem) it2.next()).getLog_extra());
                if (mapLJIIJ != null) {
                    for (Map.Entry<String, Object> entry : mapLJIIJ.entrySet()) {
                        if (map2.get(entry.getKey()) == null) {
                            String key = entry.getKey();
                            String[] strArr = new String[1];
                            Object value = entry.getValue();
                            if (!(value instanceof String) || value == null) {
                                value = C1741890vQh.LJIIIIZZ(entry.getValue());
                            }
                            strArr[0] = value;
                            map2.put(key, C1697810uHb.LJIILJJIL(strArr));
                        } else {
                            List list2 = (List) map2.get(entry.getKey());
                            if (list2 != null) {
                                Object value2 = entry.getValue();
                                if (!(value2 instanceof String) || value2 == null) {
                                    value2 = C1741890vQh.LJIIIIZZ(entry.getValue());
                                }
                                list2.add(value2);
                            }
                        }
                    }
                }
            }
            for (Map.Entry entry2 : map2.entrySet()) {
                map3.put(entry2.getKey(), C13LP.LJJLIIIJ((Iterable) entry2.getValue(), ",", null, null, 0, null, null, 62));
            }
            map.putAll(map3);
        }
        return map;
    }

    public static Map LJIIJJI(UserRight userRight) {
        ExposeUserRightPanel exposeUserRightPanel;
        List<ExposeUserRight> list;
        if (userRight != null && (exposeUserRightPanel = userRight.exposeUserRightPanel) != null && (list = exposeUserRightPanel.exposeUserRights) != null) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (ExposeUserRight exposeUserRight : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    ExposeUserRight exposeUserRight2 = exposeUserRight;
                    if (i < list.size()) {
                        sb.append(exposeUserRight2.nameEn);
                        if (i != list.size() - 1) {
                            sb.append(",");
                        }
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("rights_cnt", Integer.valueOf(list.size()));
            linkedHashMap.put("rights_content", sb.toString());
            return linkedHashMap;
        }
        return C2097608Jq.LJ();
    }

    public static boolean LJIILIIL(List list) {
        ArrayList arrayList;
        C013C c013c = new C013C();
        boolean z = false;
        if (list != null) {
            try {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    List<SalePropValue> list2 = ((SaleProp) it2.next()).salePropValueList;
                    if (list2 != null) {
                        arrayList = new ArrayList();
                        for (SalePropValue salePropValue : list2) {
                            if (salePropValue.salePropTag != null) {
                                arrayList.add(salePropValue);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    arrayList2.add(Boolean.valueOf(C756302xN.LIZ(arrayList)));
                }
                if (arrayList2.contains(Boolean.TRUE)) {
                    z = true;
                }
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        c013c.element = z;
        return c013c.element;
    }

    public static boolean LJIILL(String[] strArr) {
        if (strArr.length == 0) {
            return true;
        }
        for (String str : strArr) {
            if (!Intrinsics.LJFF(str, "")) {
                return false;
            }
        }
        return true;
    }

    public static boolean LJIILLIIL(ProductPackStruct productPackStruct) {
        if (productPackStruct == null) {
            return false;
        }
        return Intrinsics.LJFF(productPackStruct.isPlatformProductLink, Boolean.TRUE);
    }

    public static boolean LJIIZILJ(ProductPackStruct productPackStruct) {
        String str;
        Integer numLJIIJJI;
        Map<String, String> map = productPackStruct.extra;
        if (map != null && (str = map.get("tokopedia_style_enabled")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null && numLJIIJJI.intValue() == 1) {
            return true;
        }
        return false;
    }

    public static Skc LIZJ(ProductPackStruct productPackStruct, String[] strArr) {
        List<Skc> list;
        Skc next;
        if (strArr != null) {
            for (String str : strArr) {
                SkcInfo skcInfo = productPackStruct.skcInfo;
                if (skcInfo != null && (list = skcInfo.skcList) != null) {
                    Iterator<Skc> it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (Intrinsics.LJFF(next.skcId, str)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    Skc skc = next;
                    if (skc != null) {
                        return skc;
                    }
                }
            }
        }
        return null;
    }

    public static SkuItem LIZLLL(ProductPackStruct productPackStruct, String str) {
        List<SkuItem> list = productPackStruct.skus;
        SkuItem skuItem = null;
        if (list == null) {
            return null;
        }
        Iterator<SkuItem> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            SkuItem next = it2.next();
            if (Intrinsics.LJFF(next.skuId, str)) {
                skuItem = next;
                break;
            }
        }
        return skuItem;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannableStringBuilder LJFF(android.content.Context r9, java.util.List r10) {
        /*
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>()
            java.util.Iterator r8 = r10.iterator()
            r2 = 0
            r5 = 0
        Lb:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lbb
            java.lang.Object r6 = r8.next()
            int r7 = r5 + 1
            if (r5 < 0) goto Lb6
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp r6 = (com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp) r6
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue> r0 = r6.salePropValueList
            java.lang.String r4 = ""
            if (r0 == 0) goto L2d
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r2, r0)
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue r0 = (com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue) r0
            if (r0 == 0) goto L2d
            java.lang.String r1 = r0.propValue
            if (r1 != 0) goto L2e
        L2d:
            r1 = r4
        L2e:
            int r0 = r1.length()
            if (r0 != 0) goto Lb4
            r0 = 1
        L35:
            if (r0 != 0) goto L93
            java.lang.String r0 = r6.propName
            if (r0 == 0) goto L91
            int r0 = r0.length()
            if (r0 == 0) goto L91
            r0 = 0
        L42:
            if (r0 != 0) goto L93
            java.lang.String r0 = r6.propName
            r3.append(r0)
            java.lang.String r0 = ": "
            r3.append(r0)
            android.text.SpannableString r6 = new android.text.SpannableString
            r6.<init>(r1)
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r0 = 2131100625(0x7f0603d1, float:1.7813637E38)
            int r0 = X.C960203pA.LIZ(r0, r9)
            r1.<init>(r0)
            int r0 = r6.length()
            r4 = 33
            X.C786410Ut5.p2(r6, r1, r2, r0, r4)
            X.0HcY r1 = new X.0HcY
            r0 = 41
            r1.<init>(r0, r2)
            int r0 = r6.length()
            X.C786410Ut5.p2(r6, r1, r2, r0, r4)
            r3.append(r6)
            boolean r0 = r10.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L8e
            int r0 = r10.size()
            int r0 = r0 + (-1)
            if (r5 >= r0) goto L8e
            java.lang.String r0 = ", "
            r3.append(r0)
        L8e:
            r5 = r7
            goto Lb
        L91:
            r0 = 1
            goto L42
        L93:
            int r0 = r10.size()     // Catch: java.lang.Exception -> Laf
            int r0 = r0 + (-1)
            if (r5 != r0) goto L8e
            int r1 = r3.length()     // Catch: java.lang.Exception -> Laf
            r0 = 2
            if (r1 <= r0) goto L8e
            int r1 = r3.length()     // Catch: java.lang.Exception -> Laf
            int r1 = r1 - r0
            int r0 = r3.length()     // Catch: java.lang.Exception -> Laf
            r3.replace(r1, r0, r4)     // Catch: java.lang.Exception -> Laf
            goto L8e
        Laf:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L8e
        Lb4:
            r0 = 0
            goto L35
        Lb6:
            X.C1697810uHb.LJIJI()
            r0 = 0
            throw r0
        Lbb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C041G.LJFF(android.content.Context, java.util.List):android.text.SpannableStringBuilder");
    }

    public static List LJIIIIZZ(ProductPackStruct productPackStruct, SkuItem skuItem) {
        boolean zLJFF;
        Map<String, PdpPromotion> map;
        List<String> list;
        PdpPromotion pdpPromotion;
        List<PromotionItem> list2;
        PromotionView promotionView;
        if (productPackStruct != null) {
            zLJFF = Intrinsics.LJFF(productPackStruct.promotionReform, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        if (!zLJFF) {
            if (skuItem == null || (promotionView = skuItem.promotionView) == null) {
                return null;
            }
            return promotionView.getPromotion_items();
        }
        SkuCommonConfig skuCommonConfig = productPackStruct.skuCommonConfig;
        if (skuCommonConfig == null || (map = skuCommonConfig.pdpPromotionItems) == null || map.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (skuItem != null && (list = skuItem.promotionKeyList) != null) {
            for (String str : list) {
                if (map != null && (pdpPromotion = map.get(str)) != null && (list2 = pdpPromotion.promotionItems) != null) {
                    arrayList.addAll(list2);
                }
            }
        }
        return arrayList;
    }

    public static SkuItem LJIIIZ(ProductPackStruct productPackStruct, String[] strArr) {
        if (strArr == null) {
            return null;
        }
        String strLIZ = C968903qZ.LIZ(strArr);
        List<SkuItem> list = productPackStruct.skus;
        if (list == null) {
            return null;
        }
        return (SkuItem) C04AW.LJ(strLIZ, list);
    }

    public static int LJIIJ(SkuPanelState skuPanelState, SkuItem skuItem) {
        int iIntValue;
        Integer num;
        Integer num2;
        int iIntValue2;
        Integer num3;
        if (skuPanelState != null && (num3 = skuPanelState.productQuantity) != null) {
            iIntValue = num3.intValue();
            if (iIntValue != 1) {
                if (skuItem != null) {
                    num2 = skuItem.minBuyQuantity;
                    if (num2 == null && (iIntValue2 = num2.intValue()) > 1 && iIntValue2 > iIntValue) {
                        return iIntValue2;
                    }
                }
            }
            return iIntValue;
        }
        iIntValue = 1;
        if (skuItem != null) {
            SkuQuantityProperty skuQuantityProperty = skuItem.skuQuantityProperty;
            if (skuQuantityProperty != null && (num = skuQuantityProperty.defaultAddCartQuantity) != null) {
                iIntValue = num.intValue();
            }
            num2 = skuItem.minBuyQuantity;
            if (num2 == null) {
            }
        }
        return iIntValue;
    }

    public static boolean LJIIL(List list, String[] strArr) {
        if (strArr != null && strArr.length != 0 && list != null && !list.isEmpty() && strArr != null) {
            for (String str : strArr) {
                if (!a0.LJJJIL(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean LJIILJJIL(List list, String[] strArr) {
        if (strArr == null) {
            return false;
        }
        if (C04AW.LIZJ(list, strArr) <= 0 && (strArr == null || !LJIILL(strArr))) {
            return false;
        }
        return true;
    }

    public static int LJI(SaleProp saleProp, f fVar, List list) {
        if (list == null) {
            return 0;
        }
        if (saleProp.showType != 1 && !fVar.LJJLJLI()) {
            int iLIZLLL = C958103op.LIZLLL() / fVar.LJJIL().LLJJJIL();
            if (iLIZLLL < 1) {
                return 1;
            }
            return iLIZLLL;
        }
        return list.size();
    }

    public static Image LJ(List list, boolean z, List list2, List list3) {
        Object next;
        Image image;
        if (!z) {
            if (list2 == null || list2.isEmpty() || list3 == null || list3.isEmpty()) {
                return null;
            }
            if (list.size() == list2.size()) {
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (((String) it2.next()).length() == 0) {
                        }
                    }
                }
                SkuItem skuItem = (SkuItem) C04AW.LJ(C968903qZ.LIZ((String[]) list.toArray(new String[0])), list3);
                if (skuItem == null) {
                    return null;
                }
                return skuItem.originalImage;
            }
        } else {
            if (list3 == null || list3.isEmpty()) {
                return null;
            }
            SkuItem skuItem2 = (SkuItem) C04AW.LJ(C968903qZ.LIZ((String[]) list.toArray(new String[0])), list3);
            if (skuItem2 != null) {
                return skuItem2.originalImage;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list3) {
            List<SkuSaleProp> list4 = ((SkuItem) obj).skuSalePropList;
            if (list4 != null) {
                Iterator<SkuSaleProp> it3 = list4.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        SkuSaleProp next2 = it3.next();
                        Iterator it4 = list.iterator();
                        while (it4.hasNext()) {
                            if (Intrinsics.LJFF(next2.propValueId, it4.next())) {
                                arrayList.add(obj);
                                break;
                            }
                        }
                    }
                }
            }
        }
        Iterator it5 = arrayList.iterator();
        while (true) {
            if (it5.hasNext()) {
                next = it5.next();
                Integer num = ((SkuItem) next).stockNum;
                if (num != null && num.intValue() > 0) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        SkuItem skuItem3 = (SkuItem) next;
        if (skuItem3 != null && (image = skuItem3.originalImage) != null) {
            return image;
        }
        SkuItem skuItem4 = (SkuItem) C13LP.LJJJLL(arrayList);
        if (skuItem4 == null) {
            return null;
        }
        return skuItem4.originalImage;
    }
}

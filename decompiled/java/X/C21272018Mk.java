package X;

import android.os.SystemClock;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commerce.model.ShopAdStruct;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.anchor.AnchorDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorPrefixInfo;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorPrivilegeItem;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorSuffixInfo;
import com.ss.android.ugc.aweme.ecommerce.model.AwemePruningModel;
import com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.model.DaInfo;
import com.ss.android.ugc.aweme.ecommerce.model.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.model.SkuSupply;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercebase.view.PromotionLogo;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.18Mk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21272018Mk {
    public static final C21272018Mk LIZ = new C21272018Mk();

    public static String LIZLLL(List list) {
        Object obj;
        boolean z;
        if (list == null || list.isEmpty() || (((z = list instanceof Collection)) && list.isEmpty())) {
            obj = "";
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((AnchorProductInfoModel) it2.next()).extraData.bizType != null) {
                    if (z && list.isEmpty()) {
                        obj = 0;
                    } else {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            Integer num = ((AnchorProductInfoModel) it3.next()).extraData.bizType;
                            if (num == null || num.intValue() != 0) {
                                if (z && list.isEmpty()) {
                                    obj = 2;
                                } else {
                                    Iterator it4 = list.iterator();
                                    while (it4.hasNext()) {
                                        Integer num2 = ((AnchorProductInfoModel) it4.next()).extraData.bizType;
                                        if (num2 == null || num2.intValue() != 2) {
                                            obj = 99;
                                            break;
                                        }
                                    }
                                    obj = 2;
                                }
                            }
                        }
                        obj = 0;
                    }
                }
            }
            obj = "";
        }
        return obj.toString();
    }

    public static Map LJFF(List list) {
        Map<String, String> mapLJ;
        if (list == null) {
            return C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AnchorBizUtils.LIZ.getClass();
        linkedHashMap.put("product_id", AnchorBizUtils.LJIL(list));
        C1735020vFc c1735020vFc = C1735020vFc.LIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            BcmStandardTrack bcmStandardTrack = ((AnchorProductInfoModel) it2.next()).extraData.bcmStandardTrack;
            if (bcmStandardTrack == null || (mapLJ = bcmStandardTrack.trackParam) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            arrayList.add(mapLJ);
        }
        c1735020vFc.getClass();
        linkedHashMap.putAll(C1735020vFc.LIZJ(arrayList));
        return linkedHashMap;
    }

    public static String LJI(Aweme aweme) {
        AnchorPrefixInfo anchorPrefixInfo;
        String str;
        AnchorBizUtils.LIZ.getClass();
        AnchorProductInfo anchorProductInfo = (AnchorProductInfo) C13LP.LJJJLL(AnchorBizUtils.LJJZZI(aweme));
        if (anchorProductInfo == null || (anchorPrefixInfo = anchorProductInfo.anchorPrefixInfo) == null || (str = anchorPrefixInfo.anchorPrefixDaInfo) == null) {
            return "";
        }
        return str;
    }

    public static String LJII(Aweme aweme) {
        AnchorSuffixInfo anchorSuffixInfo;
        String str;
        AnchorBizUtils.LIZ.getClass();
        AnchorProductInfo anchorProductInfo = (AnchorProductInfo) C13LP.LJJJLL(AnchorBizUtils.LJJZZI(aweme));
        if (anchorProductInfo == null || (anchorSuffixInfo = anchorProductInfo.anchorSuffixInfo) == null || (str = anchorSuffixInfo.anchorSuffixDaInfo) == null) {
            return "";
        }
        return str;
    }

    public static int LJIIIIZZ(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        if (aweme != null) {
            anchors = aweme.getAnchors();
        } else {
            anchors = null;
        }
        return LJIIIZ(anchors);
    }

    public static int LJIIIZ(List list) {
        if (list != null) {
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (hashSet.add(Integer.valueOf(((AnchorCommonStruct) obj).getType()))) {
                    arrayList.add(obj);
                }
            }
            return arrayList.size();
        }
        return 0;
    }

    public static Map LJIIJ(List list) {
        String str;
        DaInfo daInfo;
        DaInfo daInfo2;
        if (list == null) {
            return new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AnchorPrivilegeItem anchorPrivilegeItem = (AnchorPrivilegeItem) C13LP.LJJJLZIJ(0, list);
        String str2 = null;
        if (anchorPrivilegeItem != null && (daInfo2 = anchorPrivilegeItem.getDaInfo()) != null) {
            str = daInfo2.extra;
        } else {
            str = null;
        }
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(str);
        if (mapLJIIJ != null) {
            linkedHashMap.putAll(mapLJIIJ);
        }
        AnchorPrivilegeItem anchorPrivilegeItem2 = (AnchorPrivilegeItem) C13LP.LJJJLZIJ(1, list);
        if (anchorPrivilegeItem2 != null && (daInfo = anchorPrivilegeItem2.getDaInfo()) != null) {
            str2 = daInfo.extra;
        }
        HashMap<String, Object> mapLJIIJ2 = C1741890vQh.LJIIJ(str2);
        if (mapLJIIJ2 != null) {
            linkedHashMap.putAll(mapLJIIJ2);
        }
        return linkedHashMap;
    }

    public static String LJIIJJI(AnchorProductInfoModel anchorProductInfoModel) {
        AnchorProductInfo anchorProductInfo;
        Integer num;
        String string;
        if (anchorProductInfoModel == null || (anchorProductInfo = anchorProductInfoModel.extraData) == null || (num = anchorProductInfo.bizType) == null || (string = num.toString()) == null) {
            return "";
        }
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIILIIL(com.ss.android.ugc.aweme.feed.model.Aweme r4) {
        /*
            if (r4 == 0) goto L53
            java.lang.String r4 = r4.getAnchorsExtras()
            if (r4 == 0) goto L53
            r3 = 0
            com.google.gson.Gson r2 = X.C1741890vQh.LJFF()     // Catch: com.google.gson.s -> L43
            X.04Zw r0 = X.C1120604Zw.LIZ     // Catch: com.google.gson.s -> L43
            r0.getClass()     // Catch: com.google.gson.s -> L43
            X.04a9 r0 = X.C1120604Zw.LIZIZ()     // Catch: com.google.gson.s -> L43
            if (r0 == 0) goto L1e
            boolean r1 = r0.LJII     // Catch: com.google.gson.s -> L43
            r0 = 1
            if (r1 != r0) goto L1e
            goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r0 == 0) goto L22
            goto L2c
        L22:
            X.18OL r0 = new X.18OL     // Catch: com.google.gson.s -> L43
            r0.<init>()     // Catch: com.google.gson.s -> L43
            java.lang.reflect.Type r0 = r0.getType()     // Catch: com.google.gson.s -> L43
            goto L36
        L2c:
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.AnchorsExtras> r0 = com.ss.android.ugc.aweme.feed.model.AnchorsExtras.class
            X.13JW r0 = X.C13LE.LJII(r0)     // Catch: com.google.gson.s -> L43
            java.lang.reflect.Type r0 = X.C2371409Qy.LIZJ(r0)     // Catch: com.google.gson.s -> L43
        L36:
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r2, r4, r0)     // Catch: com.google.gson.s -> L43
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.feed.model.AnchorsExtras     // Catch: com.google.gson.s -> L43
            if (r0 != 0) goto L3f
            r1 = r3
        L3f:
            com.ss.android.ugc.aweme.feed.model.AnchorsExtras r1 = (com.ss.android.ugc.aweme.feed.model.AnchorsExtras) r1     // Catch: com.google.gson.s -> L43
            r3 = r1
            goto L47
        L43:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L47:
            if (r3 == 0) goto L53
            com.ss.android.ugc.aweme.feed.model.ECAnchorInfo r0 = r3.getEcAnchorInfo()
            if (r0 == 0) goto L53
            java.lang.String r0 = r0.daInfo
            if (r0 != 0) goto L55
        L53:
            java.lang.String r0 = ""
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21272018Mk.LJIILIIL(com.ss.android.ugc.aweme.feed.model.Aweme):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LJIILJJIL(com.ss.android.ugc.aweme.feed.model.Aweme r6) {
        /*
            java.lang.String r0 = "product_cnt"
            java.lang.String r5 = "is_ec_video"
            java.lang.String[] r0 = new java.lang.String[]{r0, r5}
            java.util.List r2 = X.C1697810uHb.LJIILJJIL(r0)
            java.lang.String r0 = "ec_relink_info"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r1 = X.C1697810uHb.LJIILJJIL(r0)
            r0 = 0
            if (r6 == 0) goto L1d
            java.lang.String r0 = r6.getAnchorsExtras()
        L1d:
            java.util.Map r4 = LJJII(r0, r2, r1)
            X.18Mk r0 = X.C21272018Mk.LIZ
            r0.getClass()
            r0 = r4
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r1 = r0.get(r5)
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L83
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L83
            boolean r0 = r1.booleanValue()
        L39:
            java.lang.String r3 = "0"
            java.lang.String r2 = ""
            if (r0 != 0) goto L5f
            com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils r0 = com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LIZ
            r0.getClass()
            boolean r0 = com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LJJJJLI(r6)
            if (r0 != 0) goto L5f
            r0 = r3
        L4b:
            r4.put(r5, r0)
            java.lang.String r1 = "is_ec_relink"
            boolean r0 = r4.containsKey(r1)
            if (r0 != 0) goto L5e
            r4.put(r1, r3)
            java.lang.String r0 = "ec_relink_reason"
            r4.put(r0, r2)
        L5e:
            return r4
        L5f:
            int r0 = X.C21276418Oc.LIZ()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "ec_bc_toggle_style"
            r4.put(r0, r1)
            if (r6 == 0) goto L7a
            com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct r0 = r6.getCommerceVideoAuthInfo()
            if (r0 == 0) goto L7a
            java.lang.String r1 = r0.getBCHashtag()
            if (r1 != 0) goto L7b
        L7a:
            r1 = r2
        L7b:
            java.lang.String r0 = "ec_bc_toggle_content"
            r4.put(r0, r1)
            java.lang.String r0 = "1"
            goto L4b
        L83:
            r0 = 0
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21272018Mk.LJIILJJIL(com.ss.android.ugc.aweme.feed.model.Aweme):java.util.Map");
    }

    public static Map LJIILL(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJII(str, null, C1697810uHb.LJIILJJIL("ec_relink_info")));
        LIZ.getClass();
        if (!linkedHashMap.containsKey("is_ec_relink")) {
            linkedHashMap.put("is_ec_relink", CardStruct.IStatusCode.DEFAULT);
            linkedHashMap.put("ec_relink_reason", "");
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), entry.getValue().toString());
        }
        return linkedHashMap2;
    }

    public static int LJIILLIIL(List list) {
        AnchorProductInfoModel anchorProductInfoModel;
        AnchorProductInfo anchorProductInfo;
        Integer num;
        if (list != null && (anchorProductInfoModel = (AnchorProductInfoModel) C13LP.LJJJLL(list)) != null && (anchorProductInfo = anchorProductInfoModel.extraData) != null && (num = anchorProductInfo.platform) != null) {
            return num.intValue();
        }
        return 0;
    }

    public static Map LJIL(List list) {
        AnchorPrivilegeItem anchorPrivilegeItem;
        AnchorPrivilegeItem anchorPrivilegeItem2;
        String strLIZIZ;
        int i;
        Integer itemType;
        Integer itemType2;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = null;
        if (list != null) {
            anchorPrivilegeItem = (AnchorPrivilegeItem) C13LP.LJJJLL(list);
        } else {
            anchorPrivilegeItem = null;
        }
        int i2 = 1;
        if (list != null) {
            anchorPrivilegeItem2 = (AnchorPrivilegeItem) C13LP.LJJJLZIJ(1, list);
        } else {
            anchorPrivilegeItem2 = null;
        }
        if (anchorPrivilegeItem != null && (itemType2 = anchorPrivilegeItem.getItemType()) != null && itemType2.intValue() == 2) {
            DaInfo daInfo = anchorPrivilegeItem.getDaInfo();
            if (daInfo != null) {
                str = daInfo.name;
            } else {
                str = null;
            }
            strLIZIZ = String.valueOf(str);
            i = 1;
        } else {
            strLIZIZ = "";
            i = 0;
        }
        if (anchorPrivilegeItem2 != null && (itemType = anchorPrivilegeItem2.getItemType()) != null && itemType.intValue() == 2) {
            i++;
            if (strLIZIZ.length() == 0) {
                DaInfo daInfo2 = anchorPrivilegeItem2.getDaInfo();
                if (daInfo2 != null) {
                    str2 = daInfo2.name;
                }
                strLIZIZ = String.valueOf(str2);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(',');
                DaInfo daInfo3 = anchorPrivilegeItem2.getDaInfo();
                if (daInfo3 != null) {
                    str2 = daInfo3.name;
                }
                sbLIZ.append(str2);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
        } else {
            i2 = i;
        }
        linkedHashMap.put("has_sellingpoint", Integer.valueOf(i2));
        linkedHashMap.put("sellingpoint_cnt", Integer.valueOf(i));
        linkedHashMap.put("pos_selling_point", strLIZIZ);
        return linkedHashMap;
    }

    public static int LJJI(List list) {
        if (list == null) {
            return 0;
        }
        int size = list.size();
        AnchorBizUtils.LIZ.getClass();
        return (size + AnchorBizUtils.LJJZZIII(AnchorBizUtils.LJJIIZ(list), false).size()) - 1;
    }

    public static void LIZ(C18N0 c18n0, Aweme aweme) {
        String strIsAd;
        String str;
        int i = 1;
        if (AwemeBizExtKt.getShopAdStruct(aweme) != null) {
            ShopAdStruct shopAdStruct = AwemeBizExtKt.getShopAdStruct(aweme);
            String str2 = null;
            if (shopAdStruct != null) {
                strIsAd = shopAdStruct.isAd();
            } else {
                strIsAd = null;
            }
            if (Intrinsics.LJFF(strIsAd, "1")) {
                c18n0.LJIJJLI = 1;
                ShopAdStruct shopAdStruct2 = AwemeBizExtKt.getShopAdStruct(aweme);
                if (shopAdStruct2 != null) {
                    str = shopAdStruct2.adId;
                } else {
                    str = null;
                }
                c18n0.LJIL = str;
                ShopAdStruct shopAdStruct3 = AwemeBizExtKt.getShopAdStruct(aweme);
                if (shopAdStruct3 != null) {
                    str2 = shopAdStruct3.creativeId;
                }
                c18n0.LJJ = str2;
                return;
            }
        }
        if (!aweme.isAd()) {
            i = 0;
        }
        c18n0.LJIJJLI = i;
    }

    public static void LIZIZ(String str, C18N0 c18n0) {
        C21272518Mp.LIZ.getClass();
        Map mapLJIIIZ = C21272518Mp.LJIIIZ(str);
        if (mapLJIIIZ != null) {
            Object obj = mapLJIIIZ.get("volume");
            if (obj != null) {
                c18n0.LJJJLZIJ = obj.toString();
            }
            Object obj2 = mapLJIIIZ.get("volume_type");
            if (obj2 != null) {
                c18n0.LJJL = obj2.toString();
            }
            Object obj3 = mapLJIIIZ.get("inherited_volume");
            if (obj3 != null) {
                c18n0.LJJJZ = obj3.toString();
            }
        }
    }

    public static void LIZJ(String str, Map map) {
        C21272518Mp.LIZ.getClass();
        Map mapLJIIIZ = C21272518Mp.LJIIIZ(str);
        if (mapLJIIIZ != null) {
            Object obj = mapLJIIIZ.get("volume");
            if (obj != null) {
                map.put("volume", obj.toString());
            }
            Object obj2 = mapLJIIIZ.get("volume_type");
            if (obj2 != null) {
                map.put("volume_type", obj2.toString());
            }
            Object obj3 = mapLJIIIZ.get("inherited_volume");
            if (obj3 != null) {
                map.put("inherited_volume", obj3.toString());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIIL(com.ss.android.ugc.aweme.feed.model.Aweme r6, boolean r7) {
        /*
            java.lang.String r5 = ""
            if (r7 != 0) goto L5
            return r5
        L5:
            if (r6 == 0) goto L63
            java.lang.String r4 = r6.getAnchorsExtras()
            if (r4 == 0) goto L63
            r3 = 0
            com.google.gson.Gson r2 = X.C1741890vQh.LJFF()     // Catch: com.google.gson.s -> L48
            X.04Zw r0 = X.C1120604Zw.LIZ     // Catch: com.google.gson.s -> L48
            r0.getClass()     // Catch: com.google.gson.s -> L48
            X.04a9 r0 = X.C1120604Zw.LIZIZ()     // Catch: com.google.gson.s -> L48
            if (r0 == 0) goto L23
            boolean r1 = r0.LJII     // Catch: com.google.gson.s -> L48
            r0 = 1
            if (r1 != r0) goto L23
            goto L24
        L23:
            r0 = 0
        L24:
            if (r0 == 0) goto L27
            goto L31
        L27:
            X.18OK r0 = new X.18OK     // Catch: com.google.gson.s -> L48
            r0.<init>()     // Catch: com.google.gson.s -> L48
            java.lang.reflect.Type r0 = r0.getType()     // Catch: com.google.gson.s -> L48
            goto L3b
        L31:
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.AnchorsExtras> r0 = com.ss.android.ugc.aweme.feed.model.AnchorsExtras.class
            X.13JW r0 = X.C13LE.LJII(r0)     // Catch: com.google.gson.s -> L48
            java.lang.reflect.Type r0 = X.C2371409Qy.LIZJ(r0)     // Catch: com.google.gson.s -> L48
        L3b:
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r2, r4, r0)     // Catch: com.google.gson.s -> L48
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.feed.model.AnchorsExtras     // Catch: com.google.gson.s -> L48
            if (r0 != 0) goto L44
            r1 = r3
        L44:
            com.ss.android.ugc.aweme.feed.model.AnchorsExtras r1 = (com.ss.android.ugc.aweme.feed.model.AnchorsExtras) r1     // Catch: com.google.gson.s -> L48
            r3 = r1
            goto L4c
        L48:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4c:
            if (r3 == 0) goto L63
            com.ss.android.ugc.aweme.feed.model.ECAnchorInfo r1 = r3.getEcAnchorInfo()
            if (r1 == 0) goto L63
            com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils r0 = com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LIZ
            r0.getClass()
            boolean r0 = com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LJJJLL(r6)
            if (r0 == 0) goto L64
            java.lang.String r0 = r1.daAdsAnchorTag
            if (r0 != 0) goto L69
        L63:
            return r5
        L64:
            java.lang.String r0 = r1.daAnchorTag
            if (r0 != 0) goto L69
            return r5
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21272018Mk.LJIIL(com.ss.android.ugc.aweme.feed.model.Aweme, boolean):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LJIJ(int r5, com.ss.android.ugc.aweme.feed.model.Aweme r6) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21272018Mk.LJIJ(int, com.ss.android.ugc.aweme.feed.model.Aweme):java.util.Map");
    }

    public static Map LJIJI(AnchorProductInfoModel anchorProductInfoModel, List list) {
        String strLJJLIIIJ;
        boolean zLJFF;
        String string;
        String str;
        Long l;
        String str2;
        String string2;
        String str3;
        SkuItem skuItem;
        SkuSupply skuSupply;
        SkuItem skuItem2;
        SkuSupply skuSupply2;
        List<Integer> list2;
        AnchorProductInfo anchorProductInfo = anchorProductInfoModel.extraData;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZ.getClass();
        Boolean boolIsPlatformProduct = anchorProductInfoModel.extraData.isPlatformProduct();
        Boolean bool = Boolean.TRUE;
        linkedHashMap.put("is_platform_product", String.valueOf(Intrinsics.LJFF(boolIsPlatformProduct, bool) ? 1 : 0));
        String str4 = "";
        if (anchorProductInfo == null || (list2 = anchorProductInfo.saleModes) == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, null, 62)) == null) {
            strLJJLIIIJ = "";
        }
        linkedHashMap.put("sale_modes", strLJJLIIIJ);
        if (anchorProductInfo != null) {
            zLJFF = Intrinsics.LJFF(anchorProductInfo.isPlatformProduct(), bool);
        } else {
            zLJFF = false;
        }
        if (zLJFF) {
            AnchorBizUtils.LIZ.getClass();
            List listLJJJJIZL = AnchorBizUtils.LJJJJIZL(anchorProductInfo, list);
            if (listLJJJJIZL == null || (skuItem2 = (SkuItem) ListProtector.get(listLJJJJIZL, 0)) == null || (skuSupply2 = skuItem2.skuSupply) == null || (str2 = skuSupply2.productId) == null) {
                str2 = "";
            }
            linkedHashMap.put("seller_product_id", str2);
            Long l2 = anchorProductInfo.productId;
            if (l2 == null || (string2 = l2.toString()) == null) {
                string2 = "";
            }
            linkedHashMap.put("platform_product_id", string2);
            if (listLJJJJIZL == null || (skuItem = (SkuItem) ListProtector.get(listLJJJJIZL, 0)) == null || (skuSupply = skuItem.skuSupply) == null || (str3 = skuSupply.sellerId) == null) {
                str3 = "";
            }
            linkedHashMap.put("seller_seller_id", str3);
            String str5 = anchorProductInfo.sellerId;
            if (str5 != null) {
                str4 = str5;
            }
            linkedHashMap.put("platform_seller_id", str4);
            return linkedHashMap;
        }
        if (anchorProductInfo == null || (l = anchorProductInfo.productId) == null || (string = l.toString()) == null) {
            string = "";
        }
        linkedHashMap.put("seller_product_id", string);
        linkedHashMap.put("platform_product_id", "");
        if (anchorProductInfo == null || (str = anchorProductInfo.sellerId) == null) {
            str = "";
        }
        linkedHashMap.put("seller_seller_id", str);
        linkedHashMap.put("platform_seller_id", "");
        return linkedHashMap;
    }

    public static Map LJIJJ(AnchorProductInfo anchorProductInfo, List list) {
        String strLJJLIIIJ;
        String string;
        String str;
        String string2;
        String str2;
        SkuItem skuItem;
        SkuSupply skuSupply;
        SkuItem skuItem2;
        SkuSupply skuSupply2;
        Map<String, String> map;
        if (anchorProductInfo == null) {
            return new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str3 = anchorProductInfo.sellerId;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("seller_id", str3);
        Boolean boolIsPlatformProduct = anchorProductInfo.isPlatformProduct();
        Boolean bool = Boolean.TRUE;
        linkedHashMap.put("is_platform_product", Integer.valueOf(Intrinsics.LJFF(boolIsPlatformProduct, bool) ? 1 : 0));
        List<Integer> list2 = anchorProductInfo.saleModes;
        if (list2 == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(list2, ",", e3.e, e3.f, 0, null, null, 56)) == null) {
            strLJJLIIIJ = "";
        }
        linkedHashMap.put("sale_modes", strLJJLIIIJ);
        BcmStandardTrack bcmStandardTrack = anchorProductInfo.bcmStandardTrack;
        if (bcmStandardTrack != null && (map = bcmStandardTrack.trackParam) != null) {
            linkedHashMap.putAll(map);
        }
        if (Intrinsics.LJFF(anchorProductInfo.isPlatformProduct(), bool)) {
            AnchorBizUtils.LIZ.getClass();
            List listLJJJJIZL = AnchorBizUtils.LJJJJIZL(anchorProductInfo, list);
            if (listLJJJJIZL == null || (skuItem2 = (SkuItem) ListProtector.get(listLJJJJIZL, 0)) == null || (skuSupply2 = skuItem2.skuSupply) == null || (str = skuSupply2.productId) == null) {
                str = "";
            }
            linkedHashMap.put("seller_product_id", str);
            Long l = anchorProductInfo.productId;
            if (l == null || (string2 = l.toString()) == null) {
                string2 = "";
            }
            linkedHashMap.put("platform_product_id", string2);
            if (listLJJJJIZL == null || (skuItem = (SkuItem) ListProtector.get(listLJJJJIZL, 0)) == null || (skuSupply = skuItem.skuSupply) == null || (str2 = skuSupply.sellerId) == null) {
                str2 = "";
            }
            linkedHashMap.put("seller_seller_id", str2);
            String str5 = anchorProductInfo.sellerId;
            if (str5 != null) {
                str4 = str5;
            }
            linkedHashMap.put("platform_seller_id", str4);
            return linkedHashMap;
        }
        Long l2 = anchorProductInfo.productId;
        if (l2 == null || (string = l2.toString()) == null) {
            string = "";
        }
        linkedHashMap.put("seller_product_id", string);
        linkedHashMap.put("platform_product_id", "");
        String str6 = anchorProductInfo.sellerId;
        if (str6 == null) {
            str6 = "";
        }
        linkedHashMap.put("seller_seller_id", str6);
        linkedHashMap.put("platform_seller_id", "");
        return linkedHashMap;
    }

    public static String LJIJJLI(String str, Map map) {
        List<PromotionLabel> list;
        Map<String, Object> map2;
        if (map != null && (list = (List) map.get(str)) != null) {
            ArrayList arrayList = new ArrayList();
            for (PromotionLabel promotionLabel : list) {
                if (promotionLabel != null && (map2 = promotionLabel.daInfo) != null) {
                    arrayList.add(map2);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(C786410Ut5.J3(new JSONObject((Map) it2.next())));
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList2, "|||", null, null, 0, null, null, 62);
            if (strLJJLIIIJ != null) {
                return strLJJLIIIJ;
            }
            return "";
        }
        return "";
    }

    public static String LJJ(String str, Map map) {
        List<PromotionLogo> list;
        Map<String, Object> map2;
        if (map != null && (list = (List) map.get(str)) != null) {
            ArrayList arrayList = new ArrayList();
            for (PromotionLogo promotionLogo : list) {
                if (promotionLogo != null && (map2 = promotionLogo.daInfo) != null) {
                    arrayList.add(map2);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(C786410Ut5.J3(new JSONObject((Map) it2.next())));
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList2, "|||", null, null, 0, null, null, 62);
            if (strLJJLIIIJ != null) {
                return strLJJLIIIJ;
            }
            return "";
        }
        return "";
    }

    public static int LJIIZILJ(Aweme aweme, C2344009Gk c2344009Gk, List list) {
        Map<String, String> map;
        String str;
        Integer numLJIIJJI;
        C21272618Mq.LIZ.getClass();
        if (C21272618Mq.LJIJ(aweme)) {
            if (!C21272618Mq.LJFF(aweme, list)) {
                return 0;
            }
            return 1;
        }
        if (c2344009Gk != null && (map = c2344009Gk.LIZ) != null && (str = (String) ((HashMap) map).get("multi_anchor_display")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null) {
            return numLJIIJJI.intValue();
        }
        return 1;
    }

    public static Map LJJII(String str, List list, List list2) {
        HashMap<String, Object> mapLJIIJ;
        List arrayList;
        List arrayList2;
        HashMap map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null && str.length() != 0 && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null) {
            for (Map.Entry<String, Object> entry : mapLJIIJ.entrySet()) {
                if (list == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = list;
                }
                if (arrayList.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                } else {
                    if (list2 == null) {
                        arrayList2 = new ArrayList();
                    } else {
                        arrayList2 = list2;
                    }
                    if (arrayList2.contains(entry.getKey())) {
                        if (entry.getValue() instanceof HashMap) {
                            Object value = entry.getValue();
                            if ((value instanceof HashMap) && (map = (HashMap) value) != null) {
                                linkedHashMap.putAll(map);
                            }
                        } else {
                            HashMap<String, Object> mapLJIIJ2 = C1741890vQh.LJIIJ(entry.getValue().toString());
                            if (mapLJIIJ2 != null) {
                                linkedHashMap.putAll(mapLJIIJ2);
                            }
                        }
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static Map LJJIFFI(C21272018Mk c21272018Mk, Aweme aweme, AwemePruningModel awemePruningModel, int i) {
        String string;
        IECommerceHostService iECommerceHostService;
        IECommerceHostService iECommerceHostService2;
        int followStatus;
        boolean z;
        String name;
        boolean z2;
        String name2;
        AwemeRawAd awemeRawAd;
        Long adId;
        String string2;
        IECommerceHostService iECommerceHostService3;
        int iIntValue;
        List<PhotoModeImageUrlModel> imageList;
        boolean z3;
        String name3;
        AwemeRawAd awemeRawAd2;
        Long adId2;
        AwemePruningModel awemePruningModel2 = awemePruningModel;
        Aweme aweme2 = aweme;
        if ((i & 1) != 0) {
            aweme2 = null;
        }
        if ((i & 2) != 0) {
            awemePruningModel2 = null;
        }
        c21272018Mk.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = "";
        if (aweme2 != null) {
            C21272018Mk c21272018Mk2 = LIZ;
            String anchorsExtras = aweme2.getAnchorsExtras();
            c21272018Mk2.getClass();
            linkedHashMap.putAll(LJIILL(anchorsExtras));
            String aid = aweme2.getAid();
            if (aid == null) {
                aid = "";
            }
            linkedHashMap.put("group_id", aid);
            String authorUid = AwemeExtKt.getAuthorUid(aweme2);
            if (authorUid == null) {
                authorUid = "";
            }
            linkedHashMap.put("author_id", authorUid);
            AnchorBizUtils.LIZ.getClass();
            linkedHashMap.put("is_ad", Integer.valueOf(AnchorBizUtils.LJJJLL(aweme2) ? 1 : 0));
            if (!AnchorBizUtils.LJJJLL(aweme2) || (awemeRawAd2 = aweme2.getAwemeRawAd()) == null || (adId2 = awemeRawAd2.getAdId()) == null || (string2 = adId2.toString()) == null) {
                string2 = "";
            }
            linkedHashMap.put("ad_id", string2);
            String requestId = aweme2.getRequestId();
            if (requestId == null) {
                requestId = "";
            }
            linkedHashMap.put("request_id", requestId);
            C21272518Mp c21272518Mp = C21272518Mp.LIZ;
            String aid2 = aweme2.getAid();
            if (aid2 == null) {
                aid2 = "";
            }
            c21272518Mp.getClass();
            Map mapLJIIIZ = C21272518Mp.LJIIIZ(aid2);
            if (mapLJIIIZ != null) {
                linkedHashMap.putAll(mapLJIIIZ);
            }
            linkedHashMap.put("page_name", "video");
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                IAnchorDependencyService iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin = AnchorDependencyService.createIAnchorDependencyServicebyMonsterPlugin(false);
                if (iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String name4 = IAnchorDependencyService.class.getName();
                if (iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin != null) {
                    name3 = iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name3 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name4, name3, z3);
                iECommerceHostService3 = iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin;
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService3 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAnchorDependencyService.class);
            }
            Integer followStatus2 = ((IAnchorDependencyService) iECommerceHostService3).getFollowStatus(aweme2);
            if (followStatus2 != null) {
                iIntValue = followStatus2.intValue();
            } else {
                iIntValue = -1;
            }
            linkedHashMap.put("follow_status", Integer.valueOf(iIntValue));
            linkedHashMap.put("source_page_type", "video");
            if (AwemeExtKt.isPhotoMode(aweme2)) {
                linkedHashMap.put("aweme_type", 150);
                PhotoModeImageInfo photoModeImageInfo = aweme2.getPhotoModeImageInfo();
                if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                    linkedHashMap.put("pic_cnt", Integer.valueOf(imageList.size()));
                }
            }
        }
        if (awemePruningModel2 != null) {
            C21272018Mk c21272018Mk3 = LIZ;
            String str2 = awemePruningModel2.anchorsExtras;
            c21272018Mk3.getClass();
            linkedHashMap.putAll(LJIILL(str2));
            String str3 = awemePruningModel2.aid;
            if (str3 == null) {
                str3 = "";
            }
            linkedHashMap.put("group_id", str3);
            String str4 = awemePruningModel2.authorUid;
            if (str4 == null) {
                str4 = "";
            }
            linkedHashMap.put("author_id", str4);
            String str5 = awemePruningModel2.eventType;
            if (str5 == null) {
                str5 = "";
            }
            linkedHashMap.put("enter_from", str5);
            AnchorBizUtils.LIZ.getClass();
            linkedHashMap.put("is_ad", Integer.valueOf(AnchorBizUtils.LJJJJZI(awemePruningModel2) ? 1 : 0));
            if (!AnchorBizUtils.LJJJJZI(awemePruningModel2) || (awemeRawAd = awemePruningModel2.awemeRawAd) == null || (adId = awemeRawAd.getAdId()) == null || (string = adId.toString()) == null) {
                string = "";
            }
            linkedHashMap.put("ad_id", string);
            String str6 = awemePruningModel2.requestId;
            if (str6 == null) {
                str6 = "";
            }
            linkedHashMap.put("request_id", str6);
            C21272518Mp c21272518Mp2 = C21272518Mp.LIZ;
            String str7 = awemePruningModel2.aid;
            if (str7 != null) {
                str = str7;
            }
            c21272518Mp2.getClass();
            Map mapLJIIIZ2 = C21272518Mp.LJIIIZ(str);
            if (mapLJIIIZ2 != null) {
                linkedHashMap.putAll(mapLJIIIZ2);
            }
            C1735020vFc.LIZ.getClass();
            String str8 = awemePruningModel2.authorUid;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                IAccountDependencyService iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                if (iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name5 = IAccountDependencyService.class.getName();
                if (iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin != null) {
                    name2 = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name2 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name5, name2, z2);
                iECommerceHostService = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin;
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
            }
            linkedHashMap.put("is_self", Integer.valueOf(Intrinsics.LJFF(str8, ((IAccountDependencyService) iECommerceHostService).getUserId()) ? 1 : 0));
            linkedHashMap.put("page_name", "video");
            String str9 = awemePruningModel2.authorUid;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                IAccountDependencyService iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin2 = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                if (iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name6 = IAccountDependencyService.class.getName();
                if (iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin2 != null) {
                    name = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin2.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime3, 1, name6, name, z);
                iECommerceHostService2 = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin2;
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
            }
            if (!Intrinsics.LJFF(str9, ((IAccountDependencyService) iECommerceHostService2).getUserId())) {
                User user = awemePruningModel2.author;
                if (user != null) {
                    followStatus = user.getFollowStatus();
                } else {
                    followStatus = -1;
                }
                Integer numValueOf = Integer.valueOf(followStatus);
                if (numValueOf != null) {
                    linkedHashMap.put("follow_status", Integer.valueOf(numValueOf.intValue()));
                }
            }
            linkedHashMap.put("source_page_type", "video");
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LJ(com.ss.android.ugc.aweme.feed.model.Aweme r13, com.ss.android.ugc.aweme.ecommerce.model.RelatedProductInfo r14, java.lang.String r15, java.lang.Integer r16, java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21272018Mk.LJ(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.ecommerce.model.RelatedProductInfo, java.lang.String, java.lang.Integer, java.lang.String):java.util.Map");
    }
}

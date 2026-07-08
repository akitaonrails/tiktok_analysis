package X;

import android.os.SystemClock;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.cart.cache.CartCache;
import com.ss.android.ugc.aweme.ecommerce.base.cart.cache.DiffCartParams;
import com.ss.android.ugc.aweme.ecommerce.base.cart.cache.Item;
import com.ss.android.ugc.aweme.ecommerce.base.cart.cache.ShopCard;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vRB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1742190vRB {
    public static final C1742190vRB LIZ = new C1742190vRB();
    public static final CopyOnWriteArrayList<String> LIZIZ = new CopyOnWriteArrayList<>();
    public static final CopyOnWriteArrayList<String> LIZJ = new CopyOnWriteArrayList<>();
    public static AnonymousClass0956 LIZLLL;

    public static String LIZIZ() {
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IAccountDependencyService.class.getName(), anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        C212391189t c212391189t = C212391189t.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cart_cache_");
        sbLIZ.append(((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getUserId());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c212391189t.getClass();
        return C212391189t.LIZ("cart_cache", strLIZIZ);
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static boolean LIZJ(JSONObject jSONObject) {
        Integer num;
        try {
            DiffCartParams diffCartParamsLIZJ = C1742130vR5.LIZJ();
            if (diffCartParamsLIZJ != null && (num = diffCartParamsLIZJ.diffShopCount) != null) {
                int iIntValue = num.intValue();
                LIZ.getClass();
                JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(new JSONObject(LIZIZ()), "shop_cards");
                JSONArray jSONArray2 = JSONObjectProtectorUtils.getJSONArray(jSONObject, "shop_cards");
                ?? r4 = 1;
                if (Math.min(jSONArray.length(), iIntValue) != Math.min(jSONArray2.length(), iIntValue)) {
                    return true;
                }
                int i = 0;
                while (i < iIntValue) {
                    if (i <= jSONArray.length() - r4 && i <= jSONArray2.length() - r4) {
                        JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                        JSONObject jSONObject3 = JSONArrayProtectorUtils.getJSONObject(jSONArray2, i);
                        if (!jSONObject2.has("seller_id") || !jSONObject3.has("seller_id") || Intrinsics.LJFF(jSONObject2.get("seller_id"), jSONObject3.get("seller_id"))) {
                            if (jSONObject2.has("items") && jSONObject3.has("items")) {
                                JSONArray jSONArray3 = JSONObjectProtectorUtils.getJSONArray(jSONObject2, "items");
                                JSONArray jSONArray4 = JSONObjectProtectorUtils.getJSONArray(jSONObject3, "items");
                                if (jSONArray3.length() == jSONArray4.length()) {
                                    int length = jSONArray3.length();
                                    for (int i2 = 0; i2 < length; i2++) {
                                        JSONObject jSONObject4 = JSONArrayProtectorUtils.getJSONObject(jSONArray3, i2);
                                        JSONObject jSONObject5 = JSONArrayProtectorUtils.getJSONObject(jSONArray4, i2);
                                        List<String> list = diffCartParamsLIZJ.diffParams;
                                        if (list != null) {
                                            for (String str : list) {
                                                if (jSONObject4.has(str) == jSONObject5.has(str)) {
                                                    if (jSONObject4.has(str) && jSONObject5.has(str) && !Intrinsics.LJFF(jSONObject4.get(str), jSONObject5.get(str))) {
                                                        return true;
                                                    }
                                                } else {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    return r4;
                                }
                            }
                            i++;
                            r4 = 1;
                        } else {
                            return r4;
                        }
                    } else {
                        return false;
                    }
                }
                return false;
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "Cart hasDiffWithCache Error");
            return false;
        }
    }

    public static void LIZLLL(String str) {
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                z = true;
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
        C212391189t c212391189t = C212391189t.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cart_cache_");
        sbLIZ.append(((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getUserId());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c212391189t.getClass();
        C212391189t.LIZIZ("cart_cache", strLIZIZ, str);
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C1408790mlR(str, null), 3);
    }

    public static void LJFF(String str) {
        Type type;
        List<ShopCard> list;
        Image image;
        List<String> urls;
        Object objLJJJLL;
        List<String> urls2;
        Object objLJJJLL2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (str != null) {
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(CartCache.class));
                } else {
                    type = new TypeToken<CartCache>() { // from class: X.0vRD
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str, type);
                if (!(objFromJson instanceof CartCache)) {
                    objFromJson = null;
                }
                CartCache cartCache = (CartCache) objFromJson;
                if (cartCache != null && (list = cartCache.shopCards) != null) {
                    for (ShopCard shopCard : list) {
                        List<Item> list2 = shopCard.items;
                        if (list2 != null) {
                            Iterator<Item> it2 = list2.iterator();
                            while (it2.hasNext()) {
                                Image image2 = it2.next().image;
                                if (image2 != null && (urls2 = image2.getUrls()) != null && (objLJJJLL2 = C13LP.LJJJLL(urls2)) != null) {
                                    arrayList.add(objLJJJLL2);
                                }
                            }
                        }
                        SellerInfo sellerInfo = shopCard.seller;
                        if (sellerInfo != null && (image = sellerInfo.avatar) != null && (urls = image.getUrls()) != null && (objLJJJLL = C13LP.LJJJLL(urls)) != null) {
                            arrayList2.add(objLJJJLL);
                        }
                    }
                }
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (C1742220vRE.LIZ) {
            if (!arrayList.isEmpty()) {
                CopyOnWriteArrayList<String> copyOnWriteArrayList = LIZIZ;
                copyOnWriteArrayList.clear();
                C19719612Di.LJJI(arrayList.subList(0, Math.min(arrayList.size(), C1742220vRE.LIZIZ)), copyOnWriteArrayList);
            }
            if (!arrayList2.isEmpty()) {
                CopyOnWriteArrayList<String> copyOnWriteArrayList2 = LIZJ;
                copyOnWriteArrayList2.clear();
                C19719612Di.LJJI(arrayList2.subList(0, Math.min(arrayList2.size(), C1742220vRE.LIZJ)), copyOnWriteArrayList2);
            }
        }
    }

    public static void LIZ(Long l, String str, Map map) {
        AnonymousClass0956 anonymousClass0956;
        AnonymousClass0956 anonymousClass09562 = LIZLLL;
        if (anonymousClass09562 != null && anonymousClass09562.isActive() && (anonymousClass0956 = LIZLLL) != null) {
            anonymousClass0956.LIZIZ(null);
        }
        LIZLLL = C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1742120vR4(map, str, l, null), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.util.List<java.lang.Integer> r14, com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartEntryFrom r15, X.EnumC1742180vRA r16, java.lang.String r17, X.InterfaceC1364105Vn<? super kotlin.Unit> r18) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1742190vRB.LJ(java.util.List, com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartEntryFrom, X.0vRA, java.lang.String, X.05Vn):java.lang.Object");
    }
}

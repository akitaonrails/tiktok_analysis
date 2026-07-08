package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.Default;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.ShopConfigData;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.EcMallConfigSettings;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0w7K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1768320w7K {
    public static final C1768320w7K LIZ = new C1768320w7K();
    public static volatile Map<String, String> LIZIZ;

    public static String LIZIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String strLJIJ = ((ICommonFeedApiService) ServiceManager.get().getService(ICommonFeedApiService.class)).LJIJ();
        if (strLJIJ.length() == 0) {
            strLJIJ = "";
        }
        jSONObject.put("fromGroupId", strLJIJ);
        jSONObject.put("historyList", ((ISearchService) ServiceManager.get().getService(ISearchService.class)).q0());
        return C786410Ut5.J3(jSONObject);
    }

    public static void LIZ() {
        if (C7879035x.LIZLLL()) {
            String str = EcMallConfigSettings.getValue().fullPageCardSchema;
            if (str != null && !a0.LJJJIL(str) && Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "enable_inject"), "1")) {
                if (LIZIZ != null) {
                    return;
                }
                synchronized (LIZ) {
                    try {
                        if (LIZIZ != null) {
                            return;
                        }
                        C1716906nv.LIZ.getClass();
                        LIZIZ = LIZJ(C1716906nv.LIZ());
                    } finally {
                    }
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return;
        }
        try {
            String str2 = EcMallConfigSettings.getValue().fullPageCardSchema;
            if (str2 != null && !a0.LJJJIL(str2) && Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str2), "enable_inject"), "1")) {
                if (LIZIZ != null) {
                    return;
                }
                synchronized (LIZ) {
                    try {
                        if (LIZIZ != null) {
                            return;
                        }
                        C1716906nv.LIZ.getClass();
                        LIZIZ = LIZJ(C1716906nv.LIZ());
                    } finally {
                    }
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (CancellationException th) {
            throw th;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C1AF0.LJ(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }

    public static Map LIZJ(String str) {
        ShopConfigData shopConfigData;
        Default r8;
        String string;
        boolean z;
        Type type;
        ShopConfigData shopConfigData2;
        Default r6;
        boolean z2;
        Type type2;
        if (str == null) {
            return null;
        }
        C1120604Zw c1120604Zw = C1120604Zw.LIZ;
        boolean z3 = false;
        if (C7879035x.LIZLLL()) {
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                c1120604Zw.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    type = new TypeToken<ShopConfigData>() { // from class: X.0w7L
                    }.getType();
                } else {
                    type = C2371409Qy.LIZJ(C13LE.LJII(ShopConfigData.class));
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str, type);
                if (!(objFromJson instanceof ShopConfigData)) {
                    objFromJson = null;
                }
                shopConfigData = (ShopConfigData) objFromJson;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                shopConfigData = null;
            }
            if (shopConfigData != null) {
                r8 = shopConfigData.f57default;
            } else {
                r8 = null;
            }
            if (r8 != null && r8.enableStorageInject == 1) {
                z3 = true;
            }
            if (z3 && (!r8.localStorageKey.isEmpty())) {
                HashMap map = new HashMap();
                for (String str2 : r8.localStorageKey) {
                    synchronized (C1570730qyd.LIZ) {
                        string = ((Keva) C1570730qyd.LIZIZ.getValue()).getString(str2, "");
                    }
                    map.put(str2, string);
                }
                for (String str3 : r8.customInjectKey) {
                    if (Intrinsics.LJFF(str3, "ttmall_search_params")) {
                        LIZ.getClass();
                        map.put(str3, LIZIZ());
                    }
                    if (Intrinsics.LJFF(str3, "ttmall_search_user_action")) {
                        C2232408os c2232408os = C341050DYp.LIZ;
                        String strLIZ = C341050DYp.LIZ(Integer.valueOf(C0QCT.LIZ()));
                        if (strLIZ == null) {
                            strLIZ = "";
                        }
                        map.put(str3, strLIZ);
                    }
                }
                return map;
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return null;
        }
        try {
            try {
                Gson gsonLJFF2 = C1741890vQh.LJFF();
                c1120604Zw.getClass();
                C1121904a9 c1121904a9LIZIZ2 = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ2 == null || !c1121904a9LIZIZ2.LJII) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    type2 = new TypeToken<ShopConfigData>() { // from class: X.0w7L
                    }.getType();
                } else {
                    type2 = C2371409Qy.LIZJ(C13LE.LJII(ShopConfigData.class));
                }
                Object objLJIIIIZZ = gsonLJFF2.LJIIIIZZ(str, type2);
                if (!(objLJIIIIZZ instanceof ShopConfigData)) {
                    objLJIIIIZZ = null;
                }
                shopConfigData2 = (ShopConfigData) objLJIIIIZZ;
            } catch (s e2) {
                TryCatchGuardChecker.doCheck(e2);
                shopConfigData2 = null;
            }
            if (shopConfigData2 != null) {
                r6 = shopConfigData2.f57default;
            } else {
                r6 = null;
            }
            if (r6 != null && r6.enableStorageInject == 1) {
                z3 = true;
            }
            if (z3 && (!r6.localStorageKey.isEmpty())) {
                HashMap map2 = new HashMap();
                for (String str4 : r6.localStorageKey) {
                    map2.put(str4, C1570730qyd.LIZ.LIZ(str4));
                }
                for (String str5 : r6.customInjectKey) {
                    if (Intrinsics.LJFF(str5, "ttmall_search_params")) {
                        LIZ.getClass();
                        map2.put(str5, LIZIZ());
                    }
                    if (Intrinsics.LJFF(str5, "ttmall_search_user_action")) {
                        C2232408os c2232408os2 = C341050DYp.LIZ;
                        String strLIZ2 = C341050DYp.LIZ(Integer.valueOf(C0QCT.LIZ()));
                        if (strLIZ2 == null) {
                            strLIZ2 = "";
                        }
                        map2.put(str5, strLIZ2);
                    }
                }
                return map2;
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return null;
        } catch (CancellationException e3) {
            TryCatchGuardChecker.doCheck(e3);
            throw e3;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }
}

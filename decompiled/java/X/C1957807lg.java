package X;

import android.net.Uri;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.mix.base.PrefetchParamsRuleItem;
import com.ss.android.ugc.aweme.ecommerce.showcase.ab.ShopNativePrefetchParamsSettingModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07lg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1957807lg {
    public static final C1553800qXK LIZ = new C1553800qXK();

    public static void LIZ(String str, n nVar, RouteIntent routeIntent) {
        Set<String> queryParameterNames;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Uri uri = routeIntent.getUri();
        if (uri != null && (queryParameterNames = UriProtector.getQueryParameterNames(uri)) != null) {
            for (String str2 : queryParameterNames) {
                linkedHashMap.put(str2, C0WWO.LIZLLL(routeIntent, str2));
            }
        }
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ShopNativePrefetchParamsSettingModel[] shopNativePrefetchParamsSettingModelArr = C1957907lh.LIZ;
        ShopNativePrefetchParamsSettingModel[] shopNativePrefetchParamsSettingModelArr2 = (ShopNativePrefetchParamsSettingModel[]) settingsManagerLIZLLL.LJIIIIZZ("shop_native_prefetch_params_setting", ShopNativePrefetchParamsSettingModel[].class, shopNativePrefetchParamsSettingModelArr);
        if (shopNativePrefetchParamsSettingModelArr2 != null) {
            shopNativePrefetchParamsSettingModelArr = shopNativePrefetchParamsSettingModelArr2;
        }
        for (ShopNativePrefetchParamsSettingModel shopNativePrefetchParamsSettingModel : shopNativePrefetchParamsSettingModelArr) {
            if (Intrinsics.LJFF(shopNativePrefetchParamsSettingModel.getScene(), str)) {
                C1553800qXK c1553800qXK = LIZ;
                List<PrefetchParamsRuleItem> rules = shopNativePrefetchParamsSettingModel.getRules();
                c1553800qXK.getClass();
                C1553800qXK.LIZ(nVar, rules, linkedHashMap);
            }
        }
    }
}

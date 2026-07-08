package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.biz.wallet.network.CommonBizContentRequestWrapper;
import com.ss.android.ugc.aweme.foundation.network.DynamicApiService;
import com.ss.android.ugc.aweme.foundation.network.interceptor.NetworkMonitorHandler;
import java.lang.reflect.Type;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uno, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.stellar.base.interceptor.StellarInterceptor$handleCommonRequest$1", f = "StellarInterceptor.kt", l = {91}, m = "invokeSuspend")
public final class C1717780uno extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1717780uno(String str, InterfaceC1364105Vn<? super C1717780uno> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1717780uno c1717780uno = new C1717780uno(this.LLILLL, interfaceC1364105Vn);
        c1717780uno.LLILLJJLI = obj;
        return c1717780uno;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Object c098200Yq2;
        C1C7U.LIZ("StellarInterceptor@a64c.handleCommonRequest$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Uri uri = UriProtector.parse(this.LLILLL);
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "path");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("StellarInterceptor@a64c.handleCommonRequest$1");
                return unit;
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "host");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("StellarInterceptor@a64c.handleCommonRequest$1");
                return unit2;
            }
            C1948407kA.LIZ.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                if (uri.isHierarchical()) {
                    for (String str : UriProtector.getQueryParameterNames(uri)) {
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null) {
                            linkedHashMap.put(str, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
                        }
                    }
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.putAll(linkedHashMap);
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "pre_set_params");
            linkedHashMap2.remove("pre_set_params");
            Type type = new TypeToken<Map<String, ? extends String>>() { // from class: X.0unp
            }.getType();
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 != null) {
                try {
                    c098200Yq = URLDecoder.decode(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4, "UTF-8");
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                String str2 = (String) c098200Yq;
                if (str2 != null) {
                    try {
                        c098200Yq2 = (Map) C7740030o.LIZ().getGson().LJIIIIZZ(str2, type);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        c098200Yq2 = new C098200Yq(th3);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                        c098200Yq2 = null;
                    }
                    if (c098200Yq2 != null) {
                        linkedHashMap2.put("pre_set_params", c098200Yq2);
                    }
                }
            }
            linkedHashMap2.put("client_info", C2097608Jq.LJIIIIZZ(new Pair("app_id", String.valueOf(C1717770unn.LIZJ().getAppId())), new Pair("app_version", C1717770unn.LIZJ().getVersionInfo().LIZ), new Pair("device_platform", "android"), new Pair("did", C1717770unn.LIZJ().getDeviceId()), new Pair("locale", C1717770unn.LIZLLL().getCurrentLocaleStr(C1717770unn.LIZJ().getApplicationContext()))));
            DynamicApiService.LIZ.getClass();
            InterfaceC1717730unj interfaceC1717730unjCreateBuilder = C1717770unn.LJIIJ().createBuilder(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
            interfaceC1717730unjCreateBuilder.LIZIZ(new NetworkMonitorHandler());
            DynamicApiService dynamicApiService = (DynamicApiService) interfaceC1717730unjCreateBuilder.build().create(DynamicApiService.class);
            if (dynamicApiService != null) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "session_id");
                CommonBizContentRequestWrapper commonBizContentRequestWrapper = new CommonBizContentRequestWrapper(null, GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), linkedHashMap2));
                this.LL = 1;
                if (dynamicApiService.sendData(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, commonBizContentRequestWrapper, this) == objLJFF) {
                    C1C7U.LIZIZ("StellarInterceptor@a64c.handleCommonRequest$1");
                    return objLJFF;
                }
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("StellarInterceptor@a64c.handleCommonRequest$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

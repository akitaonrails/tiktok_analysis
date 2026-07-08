package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0QFc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.lynx.spark.core.communicate.jsb.EcSearchPrefetchResultDataMethod$handle$4$1", f = "EcSearchPrefetchResultDataMethod.kt", l = {}, m = "invokeSuspend")
public final class C667220QFc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C667220QFc(String str, InterfaceC1364105Vn<? super C667220QFc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C667220QFc(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        Object c098200Yq;
        String strLJJIFFI;
        C1C7U.LIZ("EcSearchPrefetchResultDataMethod@e5fa.handle$4$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            String strLIZIZ = C1942307jB.LIZIZ(UriProtector.parse(this.LL), "landing_deeplink");
            if (strLIZIZ != null) {
                Uri uriLIZ = UriProtector.parse(strLIZIZ);
                IECommerceMallService iECommerceMallService = (IECommerceMallService) PluggableExtentionKt.pluggableSpi$default(IECommerceMallService.class, false, false, false, 14, null);
                if (iECommerceMallService != null && (strLJJIFFI = iECommerceMallService.LJJIFFI()) != null) {
                    uriLIZ = C011I.LIZ(uriLIZ, strLJJIFFI);
                }
                IEcomSearchService iEcomSearchService = (IEcomSearchService) PluggableExtentionKt.pluggableSpi$default(IEcomSearchService.class, false, false, false, 14, null);
                if (iEcomSearchService != null && iEcomSearchService.LJIL(uriLIZ)) {
                    IEcomSearchService iEcomSearchService2 = (IEcomSearchService) PluggableExtentionKt.pluggableSpi$default(IEcomSearchService.class, false, false, false, 14, null);
                    if (iEcomSearchService2 != null) {
                        iEcomSearchService2.LJL(uriLIZ, EnumC667200QFa.POWER_PRELOAD.getValue(), false);
                    }
                    C671610QVz.LJFF = System.currentTimeMillis();
                } else {
                    C671610QVz.LIZIZ();
                }
                c098200Yq = Unit.LIZ;
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            C671610QVz.LIZIZ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcSearchPrefetchResultDataMethod@e5fa.handle$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

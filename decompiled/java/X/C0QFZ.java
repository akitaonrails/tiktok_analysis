package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0QFZ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.lynx.spark.core.communicate.jsb.EcSearchPrefetchResultDataMethod$handle$2$1", f = "EcSearchPrefetchResultDataMethod.kt", l = {}, m = "invokeSuspend")
public final class C0QFZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ InterfaceC603180NlE LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0QFZ(String str, InterfaceC603180NlE interfaceC603180NlE, InterfaceC1364105Vn<? super C0QFZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = interfaceC603180NlE;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0QFZ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Uri uriBuild;
        boolean z;
        C667170QEx c667170QExLIZ;
        Unit unit;
        C1C7U.LIZ("EcSearchPrefetchResultDataMethod@e5fa.handle$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LL;
        InterfaceC603180NlE interfaceC603180NlE = this.LLILLJJLI;
        try {
            Uri uri = UriProtector.parse(str);
            Uri.Builder builderBuildUpon = uri.buildUpon();
            builderBuildUpon.appendQueryParameter("do_shop_result_preload", "1");
            if (C13LP.LJJJJ(C1942307jB.LIZIZ(uri, "enter_from"), C1697810uHb.LJIIJJI("mall", "homepage_mall"))) {
                builderBuildUpon.appendQueryParameter("search_auto_mall_enter_from", "1");
            }
            if (Intrinsics.LJFF(interfaceC603180NlE.getScene(), C2286608xc.LJ(2))) {
                builderBuildUpon.appendQueryParameter("do_preload_when_show", "1");
            }
            uriBuild = builderBuildUpon.build();
            C0QEP.LIZ.getClass();
            z = true;
            c667170QExLIZ = C0QEP.LIZ(true, uriBuild);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (c667170QExLIZ != null && c667170QExLIZ.searchResultParam != null) {
            IEcomSearchService iEcomSearchService = (IEcomSearchService) PluggableExtentionKt.pluggableSpi$default(IEcomSearchService.class, false, false, false, 14, null);
            if (iEcomSearchService != null) {
                String string = uriBuild.toString();
                String value = EnumC667200QFa.TASK.getValue();
                if (!Intrinsics.LJFF(interfaceC603180NlE.getScene(), C2286608xc.LJ(2))) {
                    z = false;
                }
                iEcomSearchService.LJJJJI(string, value, z);
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("EcSearchPrefetchResultDataMethod@e5fa.handle$2$1");
            return unit2;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("EcSearchPrefetchResultDataMethod@e5fa.handle$2$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.ISearchAdPreloadModule;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.performance.chunk.core.model.PreRenderCard;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Cve, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.preload.CommerceSearchPreloadHelper$tryPreloadWhenRecallAds$1", f = "CommerceSearchPreloadHelper.kt", l = {}, m = "invokeSuspend")
public final class C329360Cve extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ List<PreRenderCard> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C329360Cve(List<PreRenderCard> list, InterfaceC1364105Vn<? super C329360Cve> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C329360Cve c329360Cve = new C329360Cve(this.LLILLJJLI, interfaceC1364105Vn);
        c329360Cve.LL = obj;
        return c329360Cve;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ISearchAdPreloadModule iSearchAdPreloadModule;
        Object obj2;
        Map map;
        Object obj3;
        C1C7U.LIZ("CommerceSearchPreloadHelper@99e6.tryPreloadWhenRecallAds$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<PreRenderCard> list = this.LLILLJJLI;
        try {
            iSearchAdPreloadModule = (ISearchAdPreloadModule) PluggableExtentionKt.pluggableSpi$default(ISearchAdPreloadModule.class, false, false, false, 14, null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (iSearchAdPreloadModule == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("CommerceSearchPreloadHelper@99e6.tryPreloadWhenRecallAds$1");
            return unit;
        }
        for (PreRenderCard preRenderCard : list) {
            Map<Object, ? extends Object> map2 = preRenderCard.detail;
            if (map2 != null && Intrinsics.LJFF(map2.get("is_ads"), true)) {
                Map<Object, ? extends Object> map3 = preRenderCard.detail;
                String strValueOf = null;
                if (map3 != null) {
                    obj2 = map3.get("ad_struct");
                } else {
                    obj2 = null;
                }
                if ((obj2 instanceof Map) && (map = (Map) obj2) != null && (obj3 = map.get("creative_id")) != null) {
                    if (obj3 instanceof Number) {
                        strValueOf = String.valueOf(((Number) obj3).longValue());
                    } else if (obj3 instanceof String) {
                        strValueOf = (String) obj3;
                    }
                }
                iSearchAdPreloadModule.LIZJ(strValueOf);
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CommerceSearchPreloadHelper@99e6.tryPreloadWhenRecallAds$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

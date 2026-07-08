package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.creator.api.InfluencerBagAssembleApi;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nco, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.creator.prefetch.InfluencerShopBagPrefetch$preloadData$1", f = "InfluencerShopBagPrefetch.kt", l = {111}, m = "invokeSuspend")
public final class C597960Nco extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C597960Nco(String str, String str2, InterfaceC1364105Vn<? super C597960Nco> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C597960Nco(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InfluencerShopBagPrefetch@e99c.preloadData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = false;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("page_size", C2286608xc.LJ(20)), new Pair("full_data", C2286608xc.LJ(1)));
                C21210917zX.LIZ.getClass();
                Map mapLIZ = C21210917zX.LIZ(mapLJIIIIZZ);
                C597940Ncm c597940Ncm = InfluencerBagAssembleApi.LIZ;
                String str = this.LLILLJJLI;
                String str2 = this.LLILLL;
                this.LL = 1;
                obj = c597940Ncm.LIZIZ(1, str, str2, mapLIZ, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("InfluencerShopBagPrefetch@e99c.preloadData$1");
                    return objLJFF;
                }
            }
            String str3 = (String) obj;
            if (str3 == null || str3.length() == 0) {
                z = true;
            }
            if (!z) {
                C212391189t c212391189t = C212391189t.LIZ;
                String str4 = this.LLILLJJLI;
                c212391189t.getClass();
                C212391189t.LIZIZ("anchor_shop_bag", str4, str3);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InfluencerShopBagPrefetch@e99c.preloadData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

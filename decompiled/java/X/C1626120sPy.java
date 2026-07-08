package X;

import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sPy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.internals.fetcher.DefaultStickerFetcher$fetchEffect$2", f = "DefaultStickerFetcher.kt", l = {59, 68}, m = "invokeSuspend")
public final class C1626120sPy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1626150sQ1 LLILLJJLI;
    public final /* synthetic */ Effect LLILLL;
    public final /* synthetic */ IFetchEffectListener LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1626120sPy(C1626150sQ1 c1626150sQ1, Effect effect, IFetchEffectListener iFetchEffectListener, InterfaceC1364105Vn<? super C1626120sPy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1626150sQ1;
        this.LLILLL = effect;
        this.LLILZ = iFetchEffectListener;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1626120sPy(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultStickerFetcher@6ac1.fetchEffect$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("DefaultStickerFetcher@6ac1.fetchEffect$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("DefaultStickerFetcher@6ac1.fetchEffect$2");
            return unit2;
        }
        C155000ia.LIZIZ(obj);
        if (this.LLILLJJLI.LIZ.LJIJJLI(this.LLILLL)) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1626100sPw c1626100sPw = new C1626100sPw(this.LLILZ, this.LLILLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c1626100sPw) == objLJFF) {
                C1C7U.LIZIZ("DefaultStickerFetcher@6ac1.fetchEffect$2");
                return objLJFF;
            }
            Unit unit22 = Unit.LIZ;
            C1C7U.LIZIZ("DefaultStickerFetcher@6ac1.fetchEffect$2");
            return unit22;
        }
        C1DFH c1dfh2 = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
        C1626130sPz c1626130sPz = new C1626130sPz(this.LLILLJJLI, this.LLILLL, this.LLILZ, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq2, c1626130sPz) == objLJFF) {
            C1C7U.LIZIZ("DefaultStickerFetcher@6ac1.fetchEffect$2");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("DefaultStickerFetcher@6ac1.fetchEffect$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

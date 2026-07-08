package X;

import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sPz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.internals.fetcher.DefaultStickerFetcher$fetchEffect$2$2", f = "DefaultStickerFetcher.kt", l = {}, m = "invokeSuspend")
public final class C1626130sPz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1626150sQ1 LL;
    public final /* synthetic */ Effect LLILLJJLI;
    public final /* synthetic */ IFetchEffectListener LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1626130sPz(C1626150sQ1 c1626150sQ1, Effect effect, IFetchEffectListener iFetchEffectListener, InterfaceC1364105Vn<? super C1626130sPz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1626150sQ1;
        this.LLILLJJLI = effect;
        this.LLILLL = iFetchEffectListener;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1626130sPz(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultStickerFetcher@6ac1.fetchEffect$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1626150sQ1 c1626150sQ1 = this.LL;
        c1626150sQ1.LIZ.LJIIL(this.LLILLJJLI, new C1629510sVR(this.LLILLL));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultStickerFetcher@6ac1.fetchEffect$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

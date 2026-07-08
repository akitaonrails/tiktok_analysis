package X;

import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sPw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.internals.fetcher.DefaultStickerFetcher$fetchEffect$2$1", f = "DefaultStickerFetcher.kt", l = {}, m = "invokeSuspend")
public final class C1626100sPw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ IFetchEffectListener LL;
    public final /* synthetic */ Effect LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1626100sPw(IFetchEffectListener iFetchEffectListener, Effect effect, InterfaceC1364105Vn<? super C1626100sPw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = iFetchEffectListener;
        this.LLILLJJLI = effect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1626100sPw(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("DefaultStickerFetcher@6ac1.fetchEffect$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IFetchEffectListener iFetchEffectListener = this.LL;
        if (iFetchEffectListener instanceof InterfaceC1626110sPx) {
            ((InterfaceC1626110sPx) iFetchEffectListener).LIZIZ();
            unit = Unit.LIZ;
        } else if (iFetchEffectListener != null) {
            iFetchEffectListener.onSuccess(this.LLILLJJLI);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("DefaultStickerFetcher@6ac1.fetchEffect$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

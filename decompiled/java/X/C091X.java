package X;

import com.ss.android.ugc.effectmanager.effect.model.FetchHotEffectResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import wuk.d0;

/* JADX INFO: renamed from: X.091X, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.internals.main.DefaultStickerSource$postHotStickers$1$1", f = "DefaultStickerSource.kt", l = {}, m = "invokeSuspend")
public final class C091X extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ d0 LL;
    public final /* synthetic */ C1641640sp0<FetchHotEffectResponse> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C091X(d0 d0Var, C1641640sp0<FetchHotEffectResponse> c1641640sp0, InterfaceC1364105Vn<? super C091X> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = d0Var;
        this.LLILLJJLI = c1641640sp0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C091X(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultStickerSource@cf79.postHotStickers$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJJI.getValue().setValue(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultStickerSource@cf79.postHotStickers$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

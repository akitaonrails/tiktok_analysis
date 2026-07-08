package X;

import com.ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import wuk.d0;

/* JADX INFO: renamed from: X.091R, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.internals.main.DefaultStickerSource$postRecommendWords$1$1", f = "DefaultStickerSource.kt", l = {}, m = "invokeSuspend")
public final class C091R extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ d0 LL;
    public final /* synthetic */ C1641640sp0<RecommendSearchWordsResponse> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C091R(d0 d0Var, C1641640sp0<RecommendSearchWordsResponse> c1641640sp0, InterfaceC1364105Vn<? super C091R> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = d0Var;
        this.LLILLJJLI = c1641640sp0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C091R(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultStickerSource@cf79.postRecommendWords$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJJ.getValue().setValue(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultStickerSource@cf79.postRecommendWords$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

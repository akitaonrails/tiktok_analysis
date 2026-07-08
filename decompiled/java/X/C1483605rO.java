package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05rO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.autoplay.core.model.dataproviders.neo.SearchListAutoplayHelper$SearchListAutoplay$initDataSourceChangeObserverV2$1$onChildViewAttachedToWindow$1$1", f = "SearchListAutoplayHelper.kt", l = {}, m = "invokeSuspend")
public final class C1483605rO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C648610PcJ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1483605rO(C648610PcJ c648610PcJ, InterfaceC1364105Vn<? super C1483605rO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c648610PcJ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1483605rO(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchListAutoplayHelper$SearchListAutoplay@5fc1.initDataSourceChangeObserverV2$1$onChildViewAttachedToWindow$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZIZ(false, EnumC587050N0t.DEFAULT);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchListAutoplayHelper$SearchListAutoplay@5fc1.initDataSourceChangeObserverV2$1$onChildViewAttachedToWindow$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

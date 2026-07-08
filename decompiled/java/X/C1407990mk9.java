package X;

import com.ss.android.ugc.aweme.feed.lynxcard.FeedLynxCardLoaderComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mk9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.lynxcard.FeedLynxCardLoaderComponent$onParentViewCreated$2$onPageSelected$1", f = "FeedLynxCardLoaderComponent.kt", l = {}, m = "invokeSuspend")
public final class C1407990mk9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FeedLynxCardLoaderComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407990mk9(FeedLynxCardLoaderComponent feedLynxCardLoaderComponent, InterfaceC1364105Vn<? super C1407990mk9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = feedLynxCardLoaderComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1407990mk9(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeedLynxCardLoaderComponent@5b23.onParentViewCreated$2$onPageSelected$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.m198do();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedLynxCardLoaderComponent@5b23.onParentViewCreated$2$onPageSelected$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

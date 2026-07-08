package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0IPe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.adapter.widget.openlive.LivePromotePreloadStrategyManager$registerStrategy$1", f = "LivePromotePreloadStrategyManager.kt", l = {}, m = "invokeSuspend")
public final class C466000IPe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C466000IPe(InterfaceC1364105Vn<? super C466000IPe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C466000IPe(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LivePromotePreloadStrategyManager@626d.registerStrategy$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1109510eyj.LIZ("live_promote_anchor_page_preload");
        C1109510eyj.LIZ("live_feed_card_page_preload");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LivePromotePreloadStrategyManager@626d.registerStrategy$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C466000IPe(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}

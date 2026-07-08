package X;

import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedDiggDetailListVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06KR, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedDiggDetailListVM$retry$2", f = "VibeFeedDiggDetailListVM.kt", l = {}, m = "invokeSuspend")
public final class C06KR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ VibeFeedDiggDetailListVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06KR(VibeFeedDiggDetailListVM vibeFeedDiggDetailListVM, InterfaceC1364105Vn<? super C06KR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = vibeFeedDiggDetailListVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06KR(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VibeFeedDiggDetailListVM@4fc.retry$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.manualListRefresh();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VibeFeedDiggDetailListVM@4fc.retry$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

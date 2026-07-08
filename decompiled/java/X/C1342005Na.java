package X;

import com.ss.android.ugc.aweme.history.AdWebHistoryFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.05Na, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.history.AdWebHistoryFragment$handleLoadMore$1", f = "AdWebHistoryFragment.kt", l = {}, m = "invokeSuspend")
public final class C1342005Na extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AdWebHistoryFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1342005Na(AdWebHistoryFragment adWebHistoryFragment, InterfaceC1364105Vn<? super C1342005Na> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = adWebHistoryFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1342005Na(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdWebHistoryFragment@bd5c.handleLoadMore$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.MR();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdWebHistoryFragment@bd5c.handleLoadMore$1");
        return unit;
    }
}

package X;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.060N, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.review.vm.TopicReviewVM$publish$1$2", f = "TopicReviewVM.kt", l = {}, m = "invokeSuspend")
public final class C060N extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Fragment LL;
    public final /* synthetic */ DialogC1389620mGW LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C060N(Fragment fragment, DialogC1389620mGW dialogC1389620mGW, InterfaceC1364105Vn<? super C060N> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = fragment;
        this.LLILLJJLI = dialogC1389620mGW;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C060N(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TopicReviewVM@21b6.publish$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1389890mGx c1389890mGx = new C1389890mGx(this.LL);
        c1389890mGx.LJIIJ(this.LL.getString(2131829440));
        c1389890mGx.LJIIJJI();
        C786410Ut5.LJIIJ(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TopicReviewVM@21b6.publish$1$2");
        return unit;
    }
}

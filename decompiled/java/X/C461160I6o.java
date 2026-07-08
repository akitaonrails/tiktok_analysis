package X;

import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.ability.ScrollToMessageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0I6o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.ability.ScrollToMessageViewModel$triggerScrollTo$1", f = "ScrollToMessageViewModel.kt", l = {}, m = "invokeSuspend")
public final class C461160I6o extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ ScrollToMessageViewModel LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C461160I6o(long j, ScrollToMessageViewModel scrollToMessageViewModel, long j2, InterfaceC1364105Vn<? super C461160I6o> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = j;
        this.LLILLJJLI = scrollToMessageViewModel;
        this.LLILLL = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C461160I6o(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ScrollToMessageViewModel@da1.triggerScrollTo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C869590Y9l c869590Y9lLJJJ = C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJJJ(this.LL);
        if (c869590Y9lLJJJ != null) {
            this.LLILLJJLI.setState(new C461150I6n(this.LL, c869590Y9lLJJJ.getIndex(), this.LLILLL));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ScrollToMessageViewModel@da1.triggerScrollTo$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ScrollToMessageViewModel@da1.triggerScrollTo$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

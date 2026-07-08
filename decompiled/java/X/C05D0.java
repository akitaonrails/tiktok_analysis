package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05D0, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedConsumeViewModel$sendInteractReachMsg$1$1", f = "VibeFeedConsumeViewModel.kt", l = {}, m = "invokeSuspend")
public final class C05D0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<Boolean, Unit> LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05D0(InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05D0(interfaceC1364105Vn, this.LL, this.LLILLJJLI);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VibeFeedConsumeViewModel@bb27.sendInteractReachMsg$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Function1<Boolean, Unit> function1 = this.LL;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(this.LLILLJJLI));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VibeFeedConsumeViewModel@bb27.sendInteractReachMsg$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

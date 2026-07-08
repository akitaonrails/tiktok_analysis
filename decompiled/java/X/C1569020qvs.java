package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS425S0200000_24;
import njp.a;

/* JADX INFO: renamed from: X.0qvs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.skylight.feedback.SkylightStoryNegativeFeedbackTrackServiceImpl$report$1", f = "SkylightStoryNegativeFeedbackTrackServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C1569020qvs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC1569120qw2 LL;
    public final /* synthetic */ AbstractC1568960qvm LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1569020qvs(AbstractC1569120qw2 abstractC1569120qw2, AbstractC1568960qvm abstractC1568960qvm, InterfaceC1364105Vn<? super C1569020qvs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC1569120qw2;
        this.LLILLJJLI = abstractC1568960qvm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1569020qvs(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkylightStoryNegativeFeedbackTrackServiceImpl@bd4b.report$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1569070qvx c1569070qvx = C1569070qvx.LIZ;
        AbstractC1569120qw2 abstractC1569120qw2 = this.LL;
        AwS425S0200000_24 awS425S0200000_24 = new AwS425S0200000_24(abstractC1569120qw2, this.LLILLJJLI, 2);
        c1569070qvx.getClass();
        C1569070qvx.LJIIIZ(abstractC1569120qw2, awS425S0200000_24);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SkylightStoryNegativeFeedbackTrackServiceImpl@bd4b.report$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

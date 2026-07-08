package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS568S0100000_24;
import njp.a;

/* JADX INFO: renamed from: X.0qvr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.skylight.feedback.SkylightStoryNegativeFeedbackTrackServiceImpl$checkToReportSkylightSlide$1", f = "SkylightStoryNegativeFeedbackTrackServiceImpl.kt", l = {357}, m = "invokeSuspend")
public final class C1569010qvr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC1569120qw2 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1569010qvr(AbstractC1569120qw2 abstractC1569120qw2, InterfaceC1364105Vn<? super C1569010qvr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC1569120qw2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1569010qvr(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkylightStoryNegativeFeedbackTrackServiceImpl@bd4b.checkToReportSkylightSlide$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(2000L, this) == objLJFF) {
                C1C7U.LIZIZ("SkylightStoryNegativeFeedbackTrackServiceImpl@bd4b.checkToReportSkylightSlide$1");
                return objLJFF;
            }
        }
        C1569070qvx c1569070qvx = C1569070qvx.LIZ;
        AbstractC1569120qw2 abstractC1569120qw2 = this.LLILLJJLI;
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(abstractC1569120qw2, 1);
        c1569070qvx.getClass();
        C1569070qvx.LJIIIZ(abstractC1569120qw2, awS568S0100000_24);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SkylightStoryNegativeFeedbackTrackServiceImpl@bd4b.checkToReportSkylightSlide$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

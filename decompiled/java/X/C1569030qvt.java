package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS425S0200000_24;
import njp.a;

/* JADX INFO: renamed from: X.0qvt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.skylight.feedback.SkylightStoryNegativeFeedbackTrackServiceImpl$onLoadMore$1", f = "SkylightStoryNegativeFeedbackTrackServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C1569030qvt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC1569120qw2 LL;
    public final /* synthetic */ List<Aweme> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1569030qvt(AbstractC1569120qw2 abstractC1569120qw2, List<? extends Aweme> list, InterfaceC1364105Vn<? super C1569030qvt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC1569120qw2;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1569030qvt(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkylightStoryNegativeFeedbackTrackServiceImpl@bd4b.onLoadMore$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1569070qvx c1569070qvx = C1569070qvx.LIZ;
        AbstractC1569120qw2 abstractC1569120qw2 = this.LL;
        AwS425S0200000_24 awS425S0200000_24 = new AwS425S0200000_24(abstractC1569120qw2, (AbstractC1569120qw2) this.LLILLJJLI, (List<? extends Aweme>) 0);
        c1569070qvx.getClass();
        C1569070qvx.LJIIIZ(abstractC1569120qw2, awS425S0200000_24);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SkylightStoryNegativeFeedbackTrackServiceImpl@bd4b.onLoadMore$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

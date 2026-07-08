package X;

import com.ss.android.ugc.aweme.experiment.StoryPublishWeakNetworkConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08dq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.edit.speed.StoryEditSpeedTestComponent$onCreate$1$1$1", f = "StoryEditSpeedTestComponent.kt", l = {191}, m = "invokeSuspend")
public final class C2164008dq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1411220mpM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2164008dq(C1411220mpM c1411220mpM, InterfaceC1364105Vn<? super C2164008dq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1411220mpM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2164008dq(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryEditSpeedTestComponent@4e64.onCreate$1$1$1");
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
            long j = ((StoryPublishWeakNetworkConfig) C2164108dr.LIZIZ.getValue()).speedTestTimeoutMs;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("StoryEditSpeedTestComponent@4e64.onCreate$1$1$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.fY0("fallback_delay");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryEditSpeedTestComponent@4e64.onCreate$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

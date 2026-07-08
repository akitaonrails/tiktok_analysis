package X;

import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS380S0200000_14;
import njp.a;

/* JADX INFO: renamed from: X.0Xoz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.eventtrack.ToolsFluencyEventReport$start$2$1$1", f = "ToolsFluencyEventReport.kt", l = {}, m = "invokeSuspend")
public final class C860310Xoz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C860330Xp1 LL;
    public final /* synthetic */ CountDownLatch LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C860310Xoz(C860330Xp1 c860330Xp1, CountDownLatch countDownLatch, InterfaceC1364105Vn<? super C860310Xoz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c860330Xp1;
        this.LLILLJJLI = countDownLatch;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C860310Xoz(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ToolsFluencyEventReport@cfeb.start$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0CHQ.LIZ().LJJJJI().getCurrentFluencyInfo(C861880XrW.LIZIZ().collectDuration, new AwS380S0200000_14(this.LL, this.LLILLJJLI, 100), new AwS380S0200000_14(this.LL, this.LLILLJJLI, 101));
        this.LL.LJJIFFI = C2286608xc.LJFF(C861880XrW.LIZIZ().collectDuration);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ToolsFluencyEventReport@cfeb.start$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

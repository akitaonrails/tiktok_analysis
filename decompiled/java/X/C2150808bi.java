package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08bi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget$addPortalShortCutWithLottie$2$3", f = "RedEnvelopeWidget.kt", l = {}, m = "invokeSuspend")
public final class C2150808bi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Boolean>>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ CountDownLatch LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2150808bi(CountDownLatch countDownLatch, InterfaceC1364105Vn<? super C2150808bi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = countDownLatch;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2150808bi c2150808bi = new C2150808bi(this.LLILLJJLI, interfaceC1364105Vn);
        c2150808bi.LL = obj;
        return c2150808bi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("RedEnvelopeWidget@65b2.addPortalShortCutWithLottie$2$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            c098200Yq = Boolean.valueOf(this.LLILLJJLI.await(3000L, TimeUnit.MILLISECONDS));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
        C1C7U.LIZIZ("RedEnvelopeWidget@65b2.addPortalShortCutWithLottie$2$3");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Boolean>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

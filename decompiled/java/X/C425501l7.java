package X;

import com.bytedance.android.livesdk.model.VoteResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01l7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.poll.PollApiTryModeProxy$vote$1", f = "PollApiTryModeProxy.kt", l = {}, m = "invokeSuspend")
public final class C425501l7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AnonymousClass0957<? extends C470590Icr<VoteResponseData>>>, Object> {
    public /* synthetic */ Object LL;

    public C425501l7(InterfaceC1364105Vn<? super C425501l7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C425501l7 c425501l7 = new C425501l7(interfaceC1364105Vn);
        c425501l7.LL = obj;
        return c425501l7;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PollApiTryModeProxy@a99e.vote$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C099G c099gLIZIZ = C23250099c.LIZIZ((InterfaceC497601wk) this.LL, null, null, new C425601l8(null), 3);
        C1C7U.LIZIZ("PollApiTryModeProxy@a99e.vote$1");
        return c099gLIZIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AnonymousClass0957<? extends C470590Icr<VoteResponseData>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

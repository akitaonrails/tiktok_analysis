package X;

import com.bytedance.android.livesdk.model.VoteResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01l8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.poll.PollApiTryModeProxy$vote$1$1", f = "PollApiTryModeProxy.kt", l = {}, m = "invokeSuspend")
public final class C425601l8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C470590Icr<VoteResponseData>>, Object> {
    public C425601l8(InterfaceC1364105Vn<? super C425601l8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C425601l8(interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, com.bytedance.android.livesdk.model.VoteResponseData] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PollApiTryModeProxy@a99e.vote$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C470590Icr c470590Icr = new C470590Icr();
        c470590Icr.data = new VoteResponseData();
        C1C7U.LIZIZ("PollApiTryModeProxy@a99e.vote$1$1");
        return c470590Icr;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C470590Icr<VoteResponseData>> interfaceC1364105Vn) {
        return new C425601l8(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}

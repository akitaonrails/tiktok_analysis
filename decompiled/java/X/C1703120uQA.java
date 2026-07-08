package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uQA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.trace.heartbeat.HeartbeatSession$start$2", f = "MinisHeartbeatController.kt", l = {163}, m = "invokeSuspend")
public final class C1703120uQA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1703580uQu LLILLJJLI;
    public final /* synthetic */ C1703590uQv LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1703120uQA(C1703580uQu c1703580uQu, C1703590uQv c1703590uQv, InterfaceC1364105Vn<? super C1703120uQA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1703580uQu;
        this.LLILLL = c1703590uQv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1703120uQA(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HeartbeatSession@a8fa.start$2");
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
            C1703580uQu c1703580uQu = this.LLILLJJLI;
            C1703590uQv c1703590uQv = this.LLILLL;
            this.LL = 1;
            if (c1703580uQu.LJIIIIZZ(c1703590uQv, this) == objLJFF) {
                C1C7U.LIZIZ("HeartbeatSession@a8fa.start$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HeartbeatSession@a8fa.start$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

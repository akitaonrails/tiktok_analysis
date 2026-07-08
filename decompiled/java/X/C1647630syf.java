package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0syf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.countdown.SlowMotionRecordingTimeComponent$createObserver$1$1", f = "SlowMotionRecordingTimeComponent.kt", l = {}, m = "invokeSuspend")
public final class C1647630syf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1647610syd LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1647630syf(C1647610syd c1647610syd, int i, InterfaceC1364105Vn<? super C1647630syf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1647610syd;
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1647630syf(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SlowMotionRecordingTimeComponent@f293.createObserver$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.w2().Vq2(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SlowMotionRecordingTimeComponent@f293.createObserver$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

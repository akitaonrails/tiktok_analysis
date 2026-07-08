package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Du9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.effect.SlowMotionNLEHandler$handle$1$1", f = "SlowMotionNLEHandler.kt", l = {}, m = "invokeSuspend")
public final class C353910Du9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C353920DuA LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C353910Du9(C353920DuA c353920DuA, InterfaceC1364105Vn<? super C353910Du9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c353920DuA;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C353910Du9(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SlowMotionNLEHandler@531b.handle$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJI.onStart();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SlowMotionNLEHandler@531b.handle$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

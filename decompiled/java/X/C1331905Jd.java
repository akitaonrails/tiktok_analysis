package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Jd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.dispatch.ComponentDispatcher$triggerVideoFirstFrame$1$1", f = "ComponentDispatcher.kt", l = {}, m = "invokeSuspend")
public final class C1331905Jd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1333305Jr<Object, Object> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1331905Jd(C1333305Jr<Object, Object> c1333305Jr, InterfaceC1364105Vn<? super C1331905Jd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1333305Jr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1331905Jd(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ComponentDispatcher@4f48.triggerVideoFirstFrame$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1333205Jq c1333205Jq = this.LL.LJ;
        c1333205Jq.getClass();
        c1333205Jq.LIZ(EnumC1333405Js.FIRST_FRAME_COMPLETE);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ComponentDispatcher@4f48.triggerVideoFirstFrame$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

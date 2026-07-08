package X;

import com.bytedance.android.starship.engine.event.Event;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01b0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.starship.engine.event.AppLogEventDispatcher$onEvent$1", f = "AppLogEventDispatcher.kt", l = {38}, m = "invokeSuspend")
public final class C362801b0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05YC<Event> LLILLJJLI;
    public final /* synthetic */ Event LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C362801b0(C05YC<Event> c05yc, Event event, InterfaceC1364105Vn<? super C362801b0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05yc;
        this.LLILLL = event;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C362801b0(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AppLogEventDispatcher@4a6a.onEvent$1");
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
            C05YC<Event> c05yc = this.LLILLJJLI;
            Event event = this.LLILLL;
            this.LL = 1;
            if (c05yc.emit(event, this) == objLJFF) {
                C1C7U.LIZIZ("AppLogEventDispatcher@4a6a.onEvent$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AppLogEventDispatcher@4a6a.onEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

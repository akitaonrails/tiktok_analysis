package X;

import com.bytedance.als.LiveEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Gh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.als.FlowLiveEventKt$asFlow$1$2", f = "FlowLiveEvent.kt", l = {}, m = "invokeSuspend")
public final class C2343709Gh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveEvent<Object> LL;
    public final /* synthetic */ InterfaceC1441305kZ<Object> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2343709Gh(LiveEvent<Object> liveEvent, InterfaceC1441305kZ<Object> interfaceC1441305kZ, InterfaceC1364105Vn<? super C2343709Gh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveEvent;
        this.LLILLJJLI = interfaceC1441305kZ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2343709Gh(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FlowLiveEventKt@69a7.asFlow$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZIZ(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FlowLiveEventKt@69a7.asFlow$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

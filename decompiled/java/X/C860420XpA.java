package X;

import Y.AgS295S0100000_14;
import com.bytedance.android.starship.engine.event.Event;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XpA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.android.starship.engine.graph.node.EventNode$onLoad$5$1", f = "EventNode.kt", l = {156}, m = "invokeSuspend")
public final class C860420XpA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC860430XpB LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC860440XpC LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C860420XpA(InterfaceC860430XpB interfaceC860430XpB, String str, InterfaceC860440XpC interfaceC860440XpC, InterfaceC1364105Vn<? super C860420XpA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC860430XpB;
        this.LLILLL = str;
        this.LLILZ = interfaceC860440XpC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C860420XpA(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EventNode@4846.onLoad$5$1");
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
            InterfaceC346201Wa<Event> interfaceC346201WaLIZIZ = this.LLILLJJLI.LIZIZ(this.LLILLL);
            AgS295S0100000_14 agS295S0100000_14 = new AgS295S0100000_14(this.LLILZ, 43);
            this.LL = 1;
            if (interfaceC346201WaLIZIZ.collect(agS295S0100000_14, this) == objLJFF) {
                C1C7U.LIZIZ("EventNode@4846.onLoad$5$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EventNode@4846.onLoad$5$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

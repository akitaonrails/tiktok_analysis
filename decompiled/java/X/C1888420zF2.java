package X;

import Y.AgS310S0100000_32;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zF2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.input.component.AiChatActionBarComponent$init$2", f = "AiChatActionBarComponent.kt", l = {102}, m = "invokeSuspend")
public final class C1888420zF2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C21287718Sl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1888420zF2(C21287718Sl c21287718Sl, InterfaceC1364105Vn<? super C1888420zF2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c21287718Sl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1888420zF2(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiChatActionBarComponent@6a99.init$2");
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
            InterfaceC1888430zF3 interfaceC1888430zF3F4 = this.LLILLJJLI.F4();
            String strK4 = this.LLILLJJLI.K4();
            C1888480zF8 c1888480zF8 = (C1888480zF8) interfaceC1888430zF3F4;
            c1888480zF8.getClass();
            C095D c095d = new C095D(new C1888460zF6(c1888480zF8, strK4, null));
            AgS310S0100000_32 agS310S0100000_32 = new AgS310S0100000_32(this.LLILLJJLI, 0);
            this.LL = 1;
            if (c095d.collect(agS310S0100000_32, this) == objLJFF) {
                C1C7U.LIZIZ("AiChatActionBarComponent@6a99.init$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiChatActionBarComponent@6a99.init$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

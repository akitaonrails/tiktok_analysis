package X;

import com.ss.android.ugc.tools.chat.message.component.AiChatMessageFeatureComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18T6, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.message.component.AiChatMessageFeatureComponent$init$4", f = "AiChatMessageFeatureComponent.kt", l = {}, m = "invokeSuspend")
public final class C18T6 extends C09AX implements Function2<C18TR<? extends C869590Y9l>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AiChatMessageFeatureComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18T6(AiChatMessageFeatureComponent aiChatMessageFeatureComponent, InterfaceC1364105Vn<? super C18T6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aiChatMessageFeatureComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C18T6 c18t6 = new C18T6(this.LLILLJJLI, interfaceC1364105Vn);
        c18t6.LL = obj;
        return c18t6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiChatMessageFeatureComponent@a7b8.init$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C18TR c18tr = (C18TR) this.LL;
        if (!(c18tr instanceof C18TP)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AiChatMessageFeatureComponent@a7b8.init$4");
            return unit;
        }
        if (((C18TP) c18tr).LIZJ == EnumC1778740wO8.WAITING_TIME_OUT) {
            this.LLILLJJLI.H2().ca0();
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AiChatMessageFeatureComponent@a7b8.init$4");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C18TR<? extends C869590Y9l> c18tr, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c18tr, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

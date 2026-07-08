package X;

import com.ss.android.ugc.tools.chat.message.component.AiChatMessageFeatureComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18T5, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.message.component.AiChatMessageFeatureComponent$init$3", f = "AiChatMessageFeatureComponent.kt", l = {178}, m = "invokeSuspend")
public final class C18T5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AiChatMessageFeatureComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18T5(AiChatMessageFeatureComponent aiChatMessageFeatureComponent, InterfaceC1364105Vn<? super C18T5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aiChatMessageFeatureComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C18T5(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiChatMessageFeatureComponent@a7b8.init$3");
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
            C2252321DDq c2252321DDqLJIIIIZZ = C21163117rp.LIZIZ().LJIIIIZZ();
            C426901lL c426901lL = new C426901lL(null);
            this.LL = 1;
            if (C09IC.LJIJ(c2252321DDqLJIIIIZZ, this, c426901lL) == objLJFF) {
                C1C7U.LIZIZ("AiChatMessageFeatureComponent@a7b8.init$3");
                return objLJFF;
            }
        }
        this.LLILLJJLI.H2().ca0();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiChatMessageFeatureComponent@a7b8.init$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

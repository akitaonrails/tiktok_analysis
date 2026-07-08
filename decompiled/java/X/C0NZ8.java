package X;

import Y.AgS290S0100000_9;
import com.bytedance.tts.pigeon.paas.detailpage.component.impl.PigeonConversationComponentApi;
import com.bytedance.tts.pigeon.paas.detailpage.component.impl.message.PigeonMessageListComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NZ8, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.tts.pigeon.paas.detailpage.component.impl.message.PigeonMessageListComponent$configConversationChange$2", f = "PigeonMessageListComponent.kt", l = {198}, m = "invokeSuspend")
public final class C0NZ8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<?>, Object> {
    public int LL;
    public final /* synthetic */ PigeonMessageListComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NZ8(PigeonMessageListComponent pigeonMessageListComponent, InterfaceC1364105Vn<? super C0NZ8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pigeonMessageListComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NZ8(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PigeonMessageListComponent@9fc5.configConversationChange$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C2252321DDq c2252321DDqLIZIZ = ((PigeonConversationComponentApi) this.LLILLJJLI.LLILZLL.getValue()).LIZIZ();
            AgS290S0100000_9 agS290S0100000_9 = new AgS290S0100000_9(this.LLILLJJLI, 5);
            this.LL = 1;
            if (c2252321DDqLIZIZ.collect(agS290S0100000_9, this) == objLJFF) {
                C1C7U.LIZIZ("PigeonMessageListComponent@9fc5.configConversationChange$2");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

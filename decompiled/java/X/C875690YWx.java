package X;

import Y.AgS103S1100000_14;
import Y.AgS290S0100000_9;
import com.bytedance.tts.pigeon.paas.components.api.PigeonConversationListComponentApi;
import com.bytedance.tts.pigeon.paas.detailpage.component.impl.PigeonConversationComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YWx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.tts.pigeon.paas.detailpage.component.impl.PigeonConversationComponent$configConversationChange$3", f = "PigeonConversationComponent.kt", l = {64}, m = "invokeSuspend")
public final class C875690YWx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PigeonConversationComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C875690YWx(PigeonConversationComponent pigeonConversationComponent, InterfaceC1364105Vn<? super C875690YWx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pigeonConversationComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C875690YWx(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PigeonConversationComponent@542a.configConversationChange$3");
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
            PigeonConversationComponent pigeonConversationComponent = this.LLILLJJLI;
            final String conversationId = pigeonConversationComponent.LLILLJJLI.getConversationId();
            final C2252321DDq c2252321DDqLJIJI = ((PigeonConversationListComponentApi) C0YXD.LIZIZ(pigeonConversationComponent.LL, C13LE.LIZ(PigeonConversationListComponentApi.class))).LJIJI();
            InterfaceC346201Wa<C0YX2> interfaceC346201Wa = new InterfaceC346201Wa<C0YX2>() { // from class: X.0YX0
                @Override // X.InterfaceC346201Wa
                public final Object collect(InterfaceC346701Wf<? super C0YX2> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Object objCollect = c2252321DDqLJIJI.collect(new AgS103S1100000_14(interfaceC346701Wf, conversationId, 1), interfaceC1364105Vn);
                    if (objCollect == C099R.LJFF()) {
                        return objCollect;
                    }
                    return Unit.LIZ;
                }
            };
            AgS290S0100000_9 agS290S0100000_9 = new AgS290S0100000_9(this.LLILLJJLI, 32);
            this.LL = 1;
            if (interfaceC346201Wa.collect(agS290S0100000_9, this) == objLJFF) {
                C1C7U.LIZIZ("PigeonConversationComponent@542a.configConversationChange$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PigeonConversationComponent@542a.configConversationChange$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

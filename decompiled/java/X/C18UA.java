package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18UA, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.room.component.AiChatRoomFlowComponent$showLegalDisclaimer$1", f = "AiChatRoomFlowComponent.kt", l = {}, m = "invokeSuspend")
public final class C18UA extends C09AX implements Function2<InterfaceC1157570gEF<? extends C909930Zmp>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C18UH LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18UA(C18UH c18uh, InterfaceC1364105Vn<? super C18UA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c18uh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C18UA c18ua = new C18UA(this.LLILLJJLI, interfaceC1364105Vn);
        c18ua.LL = obj;
        return c18ua;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiChatRoomFlowComponent@c1af.showLegalDisclaimer$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL instanceof C1157450gE3) {
            C21290818Tq.LIZJ("CreationChatRoomComponent", "showLegalDisclaimer: show");
            FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpi$default(FakeMsgOperatorService.class, false, false, false, 14, null);
            if (fakeMsgOperatorService != null) {
                String str = this.LLILLJJLI.LLILLJJLI.LIZLLL;
                C1684506ih c1684506ih = new C1684506ih();
                c1684506ih.LIZLLL(4097);
                c1684506ih.LIZJ = "visual_poet_legal_disclaimer_msg_id";
                c1684506ih.LJFF = new C18UG();
                fakeMsgOperatorService.LIZIZ(str, c1684506ih, this.LLILLJJLI.LLILLJJLI.LIZ, null, null);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiChatRoomFlowComponent@c1af.showLegalDisclaimer$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1157570gEF<? extends C909930Zmp> interfaceC1157570gEF, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1157570gEF, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

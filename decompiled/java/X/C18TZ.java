package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18TZ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.service.AiChatGenerateService$createConversation$id$1", f = "AiChatGenerateService.kt", l = {198}, m = "invokeSuspend")
public final class C18TZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ C21289618Te LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18TZ(C21289618Te c21289618Te, InterfaceC1364105Vn<? super C18TZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c21289618Te;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C18TZ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String conversationId;
        C1C7U.LIZ("AiChatGenerateService@c920.createConversation$id$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C19482011Jy c19482011JyLIZLLL = ((C21373518kf) this.LLILLJJLI.LJIIZILJ()).LIZLLL(C0YNP.LIZJ(5, C342380DbY.LIZ().aiChatBotId));
                this.LL = 1;
                obj = C11UD.LIZIZ(c19482011JyLIZLLL, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AiChatGenerateService@c920.createConversation$id$1");
                    return objLJFF;
                }
            }
            conversationId = ((C0Y8T) obj).getConversationId();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            conversationId = "";
        }
        C1C7U.LIZIZ("AiChatGenerateService@c920.createConversation$id$1");
        return conversationId;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

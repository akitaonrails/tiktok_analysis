package X;

import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.CommerceAgentMixFeed;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Chp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.MessageViewModel$retryAnswerMessage$1", f = "MessageViewModel.kt", l = {865}, m = "invokeSuspend")
public final class C320790Chp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public MessageViewModel LL;
    public Message LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ MessageViewModel LLILZ;
    public final /* synthetic */ Message LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C320790Chp(MessageViewModel messageViewModel, Message message, InterfaceC1364105Vn<? super C320790Chp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = messageViewModel;
        this.LLILZIL = message;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C320790Chp(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        MessageViewModel messageViewModel;
        Object obj2;
        Message messageLIZ;
        String str;
        Map<String, String> map;
        C1C7U.LIZ("MessageViewModel@2947.retryAnswerMessage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                messageLIZ = this.LLILLJJLI;
                messageViewModel = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            messageViewModel = this.LLILZ;
            C320640Cha c320640Cha = messageViewModel.LLILLL;
            if (c320640Cha != null) {
                Message message = this.LLILZIL;
                Iterator<T> it2 = messageViewModel.getState().LL.LIZ.iterator();
                while (true) {
                    obj2 = null;
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    Message messageLIZ2 = C320800Chq.LIZ((InterfaceC1467705op) next);
                    if (messageLIZ2 != null) {
                        obj2 = messageLIZ2.msgId;
                    }
                    if (Intrinsics.LJFF(obj2, message.replyMsgId)) {
                        obj2 = next;
                        break;
                    }
                }
                InterfaceC1467705op interfaceC1467705op = (InterfaceC1467705op) obj2;
                if (interfaceC1467705op != null && (messageLIZ = C320800Chq.LIZ(interfaceC1467705op)) != null) {
                    List<Message> listLJIIJJI = C1697810uHb.LJIIJJI(messageLIZ, message);
                    this.LL = messageViewModel;
                    this.LLILLJJLI = messageLIZ;
                    this.LLILLL = 1;
                    if (c320640Cha.LIZ(messageLIZ, listLJIIJJI, this) == objLJFF) {
                        C1C7U.LIZIZ("MessageViewModel@2947.retryAnswerMessage$1");
                        return objLJFF;
                    }
                } else {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MessageViewModel@2947.retryAnswerMessage$1");
                    return unit;
                }
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("MessageViewModel@2947.retryAnswerMessage$1");
            return unit2;
        }
        CommerceAgentMixFeed commerceAgentMixFeedLIZIZ = messageLIZ.LIZIZ();
        if (commerceAgentMixFeedLIZIZ != null) {
            String str2 = commerceAgentMixFeedLIZIZ.text;
            CommerceAgentMixFeed commerceAgentMixFeedLIZIZ2 = messageLIZ.LIZIZ();
            if (commerceAgentMixFeedLIZIZ2 == null || (map = commerceAgentMixFeedLIZIZ2.msgExt) == null || (str = map.get("multi_language_interfere_key")) == null) {
                str = "";
            }
            messageViewModel.vQ2(str2, true, UUID.randomUUID().toString(), new LinkedHashMap(), null, null, str, 0, -1, null);
        }
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("MessageViewModel@2947.retryAnswerMessage$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

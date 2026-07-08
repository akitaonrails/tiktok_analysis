package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Y6q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C868860Y6q extends C09AY implements InterfaceC1685430txd<MessageBody, Integer, String, Integer, C0Y82, Long, C0Y72> {
    public final /* synthetic */ C0YEM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C868860Y6q(C0YEM c0yem) {
        super(6);
        this.LL = c0yem;
    }

    @Override // X.InterfaceC1685430txd
    public final C0Y72 invoke(MessageBody messageBody, Integer num, String str, Integer num2, C0Y82 c0y82, Long l) {
        MessageBody messageBody2 = messageBody;
        long jLongValue = l.longValue();
        C0YEM c0yem = this.LL;
        InterfaceC868920Y6w interfaceC868920Y6wLIZIZ = C0Y5X.LIZIZ(num.intValue(), num2.intValue(), jLongValue, c0yem, c0y82, messageBody2, str);
        if (interfaceC868920Y6wLIZIZ == null) {
            EnumC868520Y5i enumC868520Y5i = EnumC868520Y5i.PROCESS_MSG_CMD_UNSUPPORTED_TYPE;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cmd type is ");
            sbLIZ.append(messageBody2.message_type);
            return new C0Y72(enumC868520Y5i, C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            interfaceC868920Y6wLIZIZ.LIZ(messageBody2);
            return C0Y72.LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c0yem.LJIIZILJ().LJFF().getEventTracker().LIZLLL("handleCommandMsg", e);
            C868780Y6i c868780Y6iLIZLLL = c0yem.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("handleCommand error ");
            sbLIZ2.append(messageBody2.message_type);
            c868780Y6iLIZLLL.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2), e);
            if (e instanceof C868940Y6y) {
                EnumC868520Y5i enumC868520Y5i2 = EnumC868520Y5i.PROCESS_MSG_CMD_UNSUPPORTED_TYPE;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("cmd type is ");
                sbLIZ3.append(messageBody2.message_type);
                return new C0Y72(enumC868520Y5i2, C2188811AlT.LIZIZ(sbLIZ3));
            }
            return new C0Y72(EnumC868520Y5i.UNKNOWN, e.getMessage());
        }
    }
}

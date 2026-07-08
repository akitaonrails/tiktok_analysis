package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Y6p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C868850Y6p extends C09AY implements InterfaceC1685430txd<MessageBody, Integer, String, Integer, C0Y82, Long, C0Y7K> {
    public final /* synthetic */ C0YEM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C868850Y6p(C0YEM c0yem) {
        super(6);
        this.LL = c0yem;
    }

    @Override // X.InterfaceC1685430txd
    public final C0Y7K invoke(MessageBody messageBody, Integer num, String str, Integer num2, C0Y82 c0y82, Long l) {
        MessageBody messageBody2 = messageBody;
        int iIntValue = num.intValue();
        String str2 = str;
        int iIntValue2 = num2.intValue();
        C0Y82 c0y822 = c0y82;
        long jLongValue = l.longValue();
        C0YEM c0yem = this.LL;
        try {
            InterfaceC868920Y6w interfaceC868920Y6wLIZIZ = C0Y5X.LIZIZ(iIntValue, iIntValue2, jLongValue, c0yem, c0y822, messageBody2, str2);
            if (interfaceC868920Y6wLIZIZ == null) {
                EnumC868890Y6t enumC868890Y6t = EnumC868890Y6t.NOT_REGISTERED;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Cannot find command message processor for message type ");
                sbLIZ.append(messageBody2.message_type);
                return new C0Y3A(enumC868890Y6t, C2188811AlT.LIZIZ(sbLIZ), (Integer) null, 12);
            }
            return interfaceC868920Y6wLIZIZ.LIZ(messageBody2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c0yem.LJIIZILJ().LJFF().getEventTracker().LIZLLL("handleCommandMsgWithErrorReporting", e);
            C868780Y6i c868780Y6iLIZLLL = c0yem.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("handleCommand error ");
            sbLIZ2.append(messageBody2.message_type);
            c868780Y6iLIZLLL.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2), e);
            return new C0Y3A(EnumC868890Y6t.CLIENT_ERROR, e.getMessage(), (Integer) null, 12);
        }
    }
}

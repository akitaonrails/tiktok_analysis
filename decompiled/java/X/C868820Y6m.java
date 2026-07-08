package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.status_message.StatusMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Y6m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C868820Y6m extends C09AY implements InterfaceC1685430txd<MessageBody, Integer, Integer, String, C0Y82, Long, C0Y7K> {
    public final /* synthetic */ C0YEM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C868820Y6m(C0YEM c0yem) {
        super(6);
        this.LL = c0yem;
    }

    @Override // X.InterfaceC1685430txd
    public final C0Y7K invoke(MessageBody messageBody, Integer num, Integer num2, String str, C0Y82 c0y82, Long l) {
        MessageBody messageBody2 = messageBody;
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        String str2 = str;
        C0Y82 c0y822 = c0y82;
        long jLongValue = l.longValue();
        C0YEM c0yem = this.LL;
        try {
            StatusMessage statusMessageDecode = StatusMessage.ADAPTER.decode(messageBody2.content_pb);
            InterfaceC868830Y6n interfaceC868830Y6nLIZ = C0Y5Y.LIZ(c0yem, statusMessageDecode, str2, iIntValue2, iIntValue, c0y822, jLongValue);
            if (interfaceC868830Y6nLIZ == null) {
                EnumC868890Y6t enumC868890Y6t = EnumC868890Y6t.NOT_REGISTERED;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("status msg type is ");
                sbLIZ.append(statusMessageDecode.type);
                sbLIZ.append(") handler not found");
                return new C0Y3A(enumC868890Y6t, C2188811AlT.LIZIZ(sbLIZ), (Integer) null, 12);
            }
            C0Y7K c0y7kLIZIZ = interfaceC868830Y6nLIZ.LIZIZ(messageBody2, statusMessageDecode, iIntValue);
            if (c0y7kLIZIZ instanceof C0Y3A) {
                return C0Y3A.LIZIZ((C0Y3A) c0y7kLIZIZ, statusMessageDecode.type);
            }
            if (c0y7kLIZIZ instanceof C867580Y1s) {
                Integer num3 = statusMessageDecode.type;
                ((C867580Y1s) c0y7kLIZIZ).getClass();
                return new C867580Y1s(num3);
            }
            if (c0y7kLIZIZ instanceof C867630Y1x) {
                Integer num4 = statusMessageDecode.type;
                ((C867630Y1x) c0y7kLIZIZ).getClass();
                return new C867630Y1x(num4);
            }
            throw new C1954807lC();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C868780Y6i c868780Y6iLIZLLL = c0yem.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("handle status msg error ");
            sbLIZ2.append(messageBody2.message_type);
            c868780Y6iLIZLLL.LJIIIIZZ("handleStatusMsg", C2188811AlT.LIZIZ(sbLIZ2), e);
            return new C0Y3A(EnumC868890Y6t.CLIENT_ERROR, e.getMessage(), (Integer) null, 12);
        }
    }
}

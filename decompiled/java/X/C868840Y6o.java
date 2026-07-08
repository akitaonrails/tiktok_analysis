package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.status_message.StatusMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Y6o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C868840Y6o extends C09AY implements InterfaceC1685430txd<MessageBody, Integer, Integer, String, C0Y82, Long, Pair<? extends EnumC868870Y6r, ? extends String>> {
    public final /* synthetic */ C0YEM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C868840Y6o(C0YEM c0yem) {
        super(6);
        this.LL = c0yem;
    }

    @Override // X.InterfaceC1685430txd
    public final Pair<? extends EnumC868870Y6r, ? extends String> invoke(MessageBody messageBody, Integer num, Integer num2, String str, C0Y82 c0y82, Long l) {
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
                EnumC868870Y6r enumC868870Y6r = EnumC868870Y6r.NOT_SUPPORTED;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("status msg type is ");
                sbLIZ.append(statusMessageDecode.type);
                return new Pair<>(enumC868870Y6r, C2188811AlT.LIZIZ(sbLIZ));
            }
            C0Y7K c0y7kLIZIZ = interfaceC868830Y6nLIZ.LIZIZ(messageBody2, statusMessageDecode, iIntValue);
            if ((c0y7kLIZIZ instanceof C0Y3A) && ((C0Y3A) c0y7kLIZIZ).LJ == EnumC868890Y6t.ENTITY_MISSING) {
                EnumC868870Y6r enumC868870Y6r2 = EnumC868870Y6r.MISSING_ENTITY;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("missing entity, status msg type ");
                sbLIZ2.append(statusMessageDecode.type);
                return new Pair<>(enumC868870Y6r2, C2188811AlT.LIZIZ(sbLIZ2));
            }
            return new Pair<>(EnumC868870Y6r.HANDLED, "ok");
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            C868780Y6i c868780Y6iLIZLLL = c0yem.LIZLLL();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("handle status msg error ");
            sbLIZ3.append(messageBody2.message_type);
            c868780Y6iLIZLLL.LJIIIIZZ("handleStatusMsg", C2188811AlT.LIZIZ(sbLIZ3), e);
            EnumC868870Y6r enumC868870Y6r3 = EnumC868870Y6r.IO_ERROR;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("error msg: ");
            sbLIZ4.append(e);
            return new Pair<>(enumC868870Y6r3, C2188811AlT.LIZIZ(sbLIZ4));
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C868780Y6i c868780Y6iLIZLLL2 = c0yem.LIZLLL();
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("handle status msg error ");
            sbLIZ5.append(messageBody2.message_type);
            c868780Y6iLIZLLL2.LJIIIIZZ("handleStatusMsg", C2188811AlT.LIZIZ(sbLIZ5), e2);
            EnumC868870Y6r enumC868870Y6r4 = EnumC868870Y6r.UNKNOWN_ERROR;
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("error msg: ");
            sbLIZ6.append(e2);
            return new Pair<>(enumC868870Y6r4, C2188811AlT.LIZIZ(sbLIZ6));
        }
    }
}

package X;

import com.bytedance.im.core.common.statusmsg.BusinessCommandMessage;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.status_message.StatusMessage;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Y8R, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y8R implements InterfaceC868920Y6w, InterfaceC868830Y6n {
    public final C0YEM LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final C0Y82 LJ;
    public final long LJFF;

    @Override // X.InterfaceC868920Y6w
    public final C0Y7K LIZ(MessageBody messageBody) {
        long jLongValue;
        C0Y8S c0y8s;
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handle: ");
        sbLIZ.append(messageBody.message_type);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "BusinessCommandHandler", C2188811AlT.LIZIZ(sbLIZ), 4);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = messageBody.create_time;
        if (l == null) {
            jLongValue = 0;
        } else {
            jLongValue = l.longValue();
        }
        int iIntValue = messageBody.conversation_type.intValue();
        String str = messageBody.conversation_id;
        int i = this.LIZIZ;
        int iIntValue2 = messageBody.message_type.intValue();
        String string = messageBody.server_message_id.toString();
        ByteString byteString = messageBody.content_pb;
        String str2 = messageBody.scene;
        Map<String, String> map = messageBody.ext;
        String str3 = this.LIZJ;
        if (this.LIZ.LJIIIZ().LJJLIIIIJ.LJIILIIL.isEnabled()) {
            c0y8s = new C0Y8S(this, messageBody, jCurrentTimeMillis);
        } else {
            c0y8s = null;
        }
        BusinessCommandMessage businessCommandMessage = new BusinessCommandMessage(iIntValue, str, i, iIntValue2, string, byteString, str2, jLongValue, map, str3, null, null, c0y8s);
        C871360YGg c871360YGg = this.LIZ.LJIIZILJ().getDomain().LIZLLL;
        c871360YGg.getClass();
        c871360YGg.LJ(InterfaceC871310YGb.LJII, new C1892807bC(businessCommandMessage));
        return new C867630Y1x(null);
    }

    @Override // X.InterfaceC868830Y6n
    public final C0Y7K LIZIZ(MessageBody messageBody, StatusMessage statusMessage, int i) {
        long jLongValue;
        C0Y8Q c0y8q;
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handle status message: ");
        sbLIZ.append(statusMessage.type);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "BusinessCommandHandler", C2188811AlT.LIZIZ(sbLIZ), 4);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = messageBody.create_time;
        if (l == null) {
            jLongValue = 0;
        } else {
            jLongValue = l.longValue();
        }
        int iIntValue = messageBody.conversation_type.intValue();
        String str = messageBody.conversation_id;
        int i2 = this.LIZIZ;
        int iIntValue2 = messageBody.message_type.intValue();
        String string = messageBody.server_message_id.toString();
        ByteString byteString = messageBody.content_pb;
        String str2 = messageBody.scene;
        Map<String, String> map = messageBody.ext;
        String str3 = this.LIZJ;
        if (this.LIZ.LJIIIZ().LJJLIIIIJ.LJIILIIL.isEnabled()) {
            c0y8q = new C0Y8Q(this, messageBody, jCurrentTimeMillis, statusMessage, i);
        } else {
            c0y8q = null;
        }
        BusinessCommandMessage businessCommandMessage = new BusinessCommandMessage(iIntValue, str, i2, iIntValue2, string, byteString, str2, jLongValue, map, str3, statusMessage, null, c0y8q);
        C871360YGg c871360YGg = this.LIZ.LJIIZILJ().getDomain().LIZLLL;
        c871360YGg.getClass();
        c871360YGg.LJ(InterfaceC871310YGb.LJII, new C1892807bC(businessCommandMessage));
        return new C867630Y1x(null);
    }

    public C0Y8R(int i, int i2, long j, C0YEM c0yem, C0Y82 c0y82, String str) {
        this.LIZ = c0yem;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = i2;
        this.LJ = c0y82;
        this.LJFF = j;
    }
}

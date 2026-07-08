package X;

import android.text.TextUtils;
import com.bytedance.im.core.model.SendMessageCheck;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0Y21, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y21 implements InterfaceC868920Y6w {
    public final C0YEM LIZ;

    public C0Y21(C0YEM c0yem) {
        this.LIZ = c0yem;
    }

    @Override // X.InterfaceC868920Y6w
    public final C0Y7K LIZ(MessageBody messageBody) throws Throwable {
        Map<String, String> map;
        boolean zLJLIIL;
        C07ZY c07zy;
        try {
            if (!TextUtils.isEmpty(messageBody.content) && (map = messageBody.ext) != null) {
                final String str = map.get("s:fail_ref_client_msg_id");
                if (str == null) {
                    str = "";
                }
                if (TextUtils.isEmpty(str)) {
                    this.LIZ.LIZLLL().LJIIIZ("SendFailedRespUpdaterhandleSendFailedResp uuid invalid", null);
                    return new C0Y3A(EnumC868890Y6t.INVALID_PARAMETER, "handleSendFailedResp uuid invalid", (Integer) null, 12);
                }
                C0Y9J c0y9jLIZIZ = this.LIZ.LJIIZILJ().LIZIZ().LIZIZ();
                final C869590Y9l c869590Y9lLJJJI = c0y9jLIZIZ.LJI().LJJJI(str);
                if (c869590Y9lLJJJI == null) {
                    C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("SendFailedRespUpdaterhandleSendFailedResp no local msg, uuid:");
                    sbLIZ.append(str);
                    c868780Y6iLIZLLL.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ), null);
                    EnumC868890Y6t enumC868890Y6t = EnumC868890Y6t.ENTITY_MISSING;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("handleSendFailedResp no local msg, uuid: ");
                    sbLIZ2.append(str);
                    return new C0Y3A(enumC868890Y6t, C2188811AlT.LIZIZ(sbLIZ2), (Integer) null, 12);
                }
                c869590Y9lLJJJI.setMsgStatus(3);
                Map mapLIZIZ = LIZIZ(this.LIZ, c869590Y9lLJJJI, messageBody.content);
                for (Map.Entry entry : mapLIZIZ.entrySet()) {
                    c869590Y9lLJJJI.addLocalExt((String) entry.getKey(), (String) entry.getValue());
                }
                if (this.LIZ.LJIIIZ().LJJLIIIIJ.LJJJ) {
                    C869580Y9k c869580Y9kLJI = c0y9jLIZIZ.LJI();
                    if (mapLIZIZ.isEmpty()) {
                        c07zy = C07ZY.LIZJ;
                    } else {
                        c07zy = new C07ZY(new HashMap(mapLIZIZ), C08CX.INSTANCE);
                    }
                    zLJLIIL = C867960Y3e.LIZIZ(c869580Y9kLJI, c869590Y9lLJJJI, c07zy, false, false);
                } else {
                    zLJLIIL = c0y9jLIZIZ.LJI().LJLIIL(c869590Y9lLJJJI, false, false);
                }
                if (zLJLIIL) {
                    this.LIZ.LJIIZILJ().getDomain().LIZ().LJ(new Runnable() { // from class: X.0Xwb
                        public final void LIZ() {
                            String uuid;
                            C868140Y3w c868140Y3w = this.LL.LIZ.LJIIZILJ().getDomain().LIZIZ;
                            String str2 = str;
                            c868140Y3w.getClass();
                            if (!TextUtils.isEmpty(str2) && ((CopyOnWriteArraySet) c868140Y3w.LJIIJJI).remove(str2)) {
                                C868200Y4c c868200Y4c = this.LL.LIZ.LJIIZILJ().getDomain().LIZ;
                                final C869590Y9l c869590Y9l = c869590Y9lLJJJI;
                                c868200Y4c.getClass();
                                if (c869590Y9l != null && !TextUtils.isEmpty(c869590Y9l.getConversationId())) {
                                    c868200Y4c.LJIIZILJ(c869590Y9l.getConversationId(), new InterfaceC864490Xvj<InterfaceC868420Y4y>() { // from class: X.0Y4n
                                        public final /* synthetic */ boolean LIZIZ = true;

                                        @Override // X.InterfaceC864490Xvj
                                        public final void invoke(InterfaceC868420Y4y interfaceC868420Y4y) {
                                            interfaceC868420Y4y.su(c869590Y9l, this.LIZIZ);
                                        }
                                    });
                                }
                            }
                            C868200Y4c c868200Y4c2 = this.LL.LIZ.LJIIZILJ().getDomain().LIZ;
                            C0Y3I c0y3i = new C0Y3I("handleSendFailedResp");
                            C869590Y9l c869590Y9l2 = c869590Y9lLJJJI;
                            c868200Y4c2.getClass();
                            c868200Y4c2.LJJIIJZLJL(c0y3i, Collections.singletonList(c869590Y9l2));
                            C0Y8T c0y8tLIZ = this.LL.LIZ.LJIIZILJ().LIZLLL().LIZ().LIZ(c869590Y9lLJJJI.getConversationId());
                            if (c0y8tLIZ == null || c0y8tLIZ.getLastShowMessage() == null) {
                                return;
                            }
                            C869590Y9l lastShowMessage = c0y8tLIZ.getLastShowMessage();
                            if (lastShowMessage == null || (uuid = lastShowMessage.getUuid()) == null) {
                                uuid = "";
                            }
                            if (TextUtils.equals(uuid, c869590Y9lLJJJI.getUuid())) {
                                c0y8tLIZ.setLastShowMessage(c869590Y9lLJJJI);
                                this.LL.LIZ.LJIIZILJ().LIZLLL().LIZLLL().LJJL(2, c0y8tLIZ);
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("SendFailedRespUpdater@7823.update$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("SendFailedRespUpdater@7823.update$1");
                        }
                    });
                    return new C867580Y1s(null);
                }
                C868780Y6i c868780Y6iLIZLLL2 = this.LIZ.LIZLLL();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("SendFailedRespUpdaterhandleSendFailedResp update msg failed, uid:");
                sbLIZ3.append(str);
                c868780Y6iLIZLLL2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ3), null);
                EnumC868890Y6t enumC868890Y6t2 = EnumC868890Y6t.DB_ERROR;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("handleSendFailedResp update msg failed, uid:");
                sbLIZ4.append(str);
                return new C0Y3A(enumC868890Y6t2, C2188811AlT.LIZIZ(sbLIZ4), (Integer) null, 12);
            }
            this.LIZ.LIZLLL().LJIIIZ("SendFailedRespUpdaterhandleSendFailedResp content or ext invalid", null);
            return new C0Y3A(EnumC868890Y6t.INVALID_PARAMETER, "handleSendFailedResp content or ext invalid", (Integer) null, 12);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LIZLLL().LJIIIZ("SendFailedRespUpdaterhandleSendFailedResp", e);
            return new C0Y3A(EnumC868890Y6t.CLIENT_ERROR, e.getMessage(), (Integer) null, 12);
        }
    }

    public static Map LIZIZ(C0YEM c0yem, C869590Y9l c869590Y9l, String str) {
        SendMessageCheck sendMessageCheck;
        if (TextUtils.isEmpty(str)) {
            return C2097608Jq.LJ();
        }
        HashMap map = new HashMap(2);
        try {
            sendMessageCheck = (SendMessageCheck) C09EF.LIZ.LJII(str, SendMessageCheck.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c0yem.LIZLLL().LJIIIZ("SendFailedRespUpdaterupdateCheck", e);
        }
        if (sendMessageCheck == null) {
            return C2097608Jq.LJ();
        }
        if (sendMessageCheck.checkCode != 0 && !TextUtils.equals(c869590Y9l.getLocalExtValue("s:send_response_check_code"), String.valueOf(sendMessageCheck.checkCode))) {
            map.put("s:send_response_check_code", String.valueOf(sendMessageCheck.checkCode));
        }
        if (!TextUtils.isEmpty(sendMessageCheck.checkMsg) && !TextUtils.equals(c869590Y9l.getLocalExtValue("s:send_response_check_msg"), sendMessageCheck.checkMsg)) {
            map.put("s:send_response_check_msg", sendMessageCheck.checkMsg);
            return map;
        }
        return map;
    }
}

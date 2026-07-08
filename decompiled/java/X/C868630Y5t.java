package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.status_message.RefreshMessageEntity;
import com.bytedance.im.core.proto.status_message.StatusMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Y5t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C868630Y5t implements InterfaceC868830Y6n, InterfaceC868920Y6w {
    public final C0YEM LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final C0Y82 LJ;
    public final int LJFF;
    public final long LJI;

    @Override // X.InterfaceC868920Y6w
    public final C0Y7K LIZ(MessageBody messageBody) {
        C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "RefreshMessageUpdater", "refresh message", 4);
        try {
            return LIZJ(new JSONObject(messageBody.content).optLong("server_message_id"), messageBody);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LIZLLL().LJIIIZ("RefreshMessageUpdaterhandleMsgRefresh", e);
            return new C0Y3A(EnumC868890Y6t.CLIENT_ERROR, e.getMessage(), (Integer) null, 12);
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [X.0Y5u] */
    public final C0Y7K LIZJ(long j, final MessageBody messageBody) throws Throwable {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C0Y9J c0y9jLIZIZ = this.LIZ.LJIIZILJ().LIZIZ().LIZIZ();
        final C869590Y9l c869590Y9lLJJJ = c0y9jLIZIZ.LJI().LJJJ(j);
        if (c869590Y9lLJJJ == null) {
            C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "RefreshMessageUpdaterhandleMsgRefresh", "Cannot refresh a message from a message that doesn't exist", 4);
            return new C0Y3A(EnumC868890Y6t.CLIENT_ERROR, "Message not found", (Integer) null, 12);
        }
        final String conversationId = c869590Y9lLJJJ.getConversationId();
        C0Y8T c0y8tLIZ = this.LIZ.LJIIZILJ().LIZLLL().LIZ().LIZ(conversationId);
        if (c0y8tLIZ == null) {
            c0y8tLIZ = c0y9jLIZIZ.LJIIJJI().LIZ(conversationId, true);
        }
        if (c0y8tLIZ == null) {
            C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "RefreshMessageUpdaterhandleMsgRefresh", "Cannot refresh a message from a conversation that doesn't exist", 4);
            return new C0Y3A(EnumC868890Y6t.ENTITY_MISSING, "Conversation not found", (Integer) null, 12);
        }
        this.LIZ.LJIIZILJ().getMessage().LIZIZ().LIZJ(c869590Y9lLJJJ.getMsgId());
        String str = messageBody.ext.get("a:media_task_id");
        if (str == null) {
            str = "";
        }
        this.LIZ.LJIIZILJ().getDomain().LIZ.LJJII(messageBody.message_type.intValue(), "refresh_cmd", messageBody.ext, j);
        new C0YB5(this.LIZ, c0y8tLIZ, str, this.LIZIZ, new InterfaceC863600XuI<List<? extends C869590Y9l>>() { // from class: X.0Y5u
            @Override // X.InterfaceC863600XuI
            public final void LIZIZ(C0YMW c0ymw) {
                Throwable throwable;
                String message;
                Throwable throwable2;
                C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZ.LIZLLL();
                Integer numValueOf = null;
                if (c0ymw != null) {
                    throwable = c0ymw.getThrowable();
                } else {
                    throwable = null;
                }
                c868780Y6iLIZLLL.LJIIIZ("RefreshMessageUpdaterhandleMsgRefresh", throwable);
                this.LIZ.LIZ.LJIIZILJ().getDomain().LIZ.LJJIFFI(c869590Y9lLJJJ.getMsgId(), "refresh_cmd", c869590Y9lLJJJ.getMsgType(), false, true, messageBody.ext);
                if (this.LIZ.LIZ.LJIIIZ().LJJLIIIIJ.LJIILIIL.isEnabled()) {
                    C0Y7A c0y7a = new C0Y7A(this.LIZ.LIZ);
                    MessageBody messageBody2 = messageBody;
                    EnumC868890Y6t enumC868890Y6t = EnumC868890Y6t.UNDEFINED;
                    if (c0ymw != null && (throwable2 = c0ymw.getThrowable()) != null) {
                        message = throwable2.getMessage();
                    } else {
                        message = null;
                        if (c0ymw != null) {
                        }
                        C0Y3A c0y3a = new C0Y3A(enumC868890Y6t, message, numValueOf, 8);
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        C868630Y5t c868630Y5t = this.LIZ;
                        c0y7a.LIZ(c0y3a, new C0Y7D(c868630Y5t.LIZJ, jCurrentTimeMillis2, this.LIZ.LJI, c868630Y5t.LIZIZ, c868630Y5t.LJFF, c868630Y5t.LIZLLL, c868630Y5t.LJ.getValue()), messageBody2);
                    }
                    numValueOf = Integer.valueOf(c0ymw.getCode());
                    C0Y3A c0y3a2 = new C0Y3A(enumC868890Y6t, message, numValueOf, 8);
                    long jCurrentTimeMillis22 = System.currentTimeMillis() - jCurrentTimeMillis;
                    C868630Y5t c868630Y5t2 = this.LIZ;
                    c0y7a.LIZ(c0y3a2, new C0Y7D(c868630Y5t2.LIZJ, jCurrentTimeMillis22, this.LIZ.LJI, c868630Y5t2.LIZIZ, c868630Y5t2.LJFF, c868630Y5t2.LIZLLL, c868630Y5t2.LJ.getValue()), messageBody2);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
            @Override // X.InterfaceC863600XuI
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onSuccess(java.util.List<? extends X.C869590Y9l> r16) {
                /*
                    r15 = this;
                    r4 = r16
                    java.util.List r4 = (java.util.List) r4
                    X.0Y5t r0 = r15.LIZ
                    X.0YEM r0 = r0.LIZ
                    X.0Y6i r3 = r0.LIZLLL()
                    java.lang.String r2 = "Msg successfully refreshed"
                    r1 = 4
                    java.lang.String r0 = "RefreshMessageUpdaterhandleMsgRefresh"
                    X.C868780Y6i.LJIILJJIL(r3, r0, r2, r1)
                    r1 = 0
                    if (r4 == 0) goto Lc4
                    java.lang.Object r6 = X.C13LP.LJJJLL(r4)
                    X.0Y9l r6 = (X.C869590Y9l) r6
                L1d:
                    X.0Y5t r0 = r15.LIZ
                    X.0YEM r0 = r0.LIZ
                    X.0XwD r0 = r0.LJIIZILJ()
                    X.0Y52 r0 = r0.getDomain()
                    X.0Y4c r7 = r0.LIZ
                    if (r6 == 0) goto Lbf
                    long r8 = r6.getMsgId()
                    int r11 = r6.getMsgType()
                L35:
                    com.bytedance.im.core.proto.MessageBody r0 = r2
                    java.util.Map<java.lang.String, java.lang.String> r14 = r0.ext
                    r12 = 1
                    if (r6 == 0) goto Lbd
                    boolean r0 = X.C870360YCk.LIZIZ(r6)
                    r13 = 1
                    if (r0 != r12) goto Lbd
                L43:
                    java.lang.String r10 = "refresh_cmd"
                    r7.LJJIFFI(r8, r10, r11, r12, r13, r14)
                    if (r6 == 0) goto L77
                    X.0Y5t r0 = r15.LIZ
                    X.0YEM r0 = r0.LIZ
                    X.0XwD r0 = r0.LJIIZILJ()
                    X.0Y5r r0 = r0.LIZLLL()
                    X.0Y60 r2 = r0.LIZ()
                    java.lang.String r0 = r3
                    X.0Y8T r7 = r2.LIZ(r0)
                    if (r7 == 0) goto L77
                    X.0Y9l r0 = r7.getLastShowMessage()
                    if (r0 == 0) goto L77
                    long r4 = r0.getMsgId()
                    long r2 = r6.getMsgId()
                    int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                    if (r0 != 0) goto L77
                    r7.setLastShowMessage(r6)
                L77:
                    X.0Y5t r0 = r15.LIZ
                    X.0YEM r0 = r0.LIZ
                    X.0YEf r0 = r0.LJIIIZ()
                    X.0YA7 r0 = r0.LJJLIIIIJ
                    com.bytedance.im.core.client.configs.IMSDKStatusMessageCompletenessConfig r0 = r0.LJIILIIL
                    boolean r0 = r0.isEnabled()
                    if (r0 == 0) goto Lbc
                    X.0Y7A r4 = new X.0Y7A
                    X.0Y5t r0 = r15.LIZ
                    X.0YEM r0 = r0.LIZ
                    r4.<init>(r0)
                    com.bytedance.im.core.proto.MessageBody r3 = r2
                    X.0Y1s r2 = new X.0Y1s
                    r2.<init>(r1)
                    X.0Y7D r5 = new X.0Y7D
                    long r7 = java.lang.System.currentTimeMillis()
                    long r0 = r4
                    long r7 = r7 - r0
                    X.0Y5t r0 = r15.LIZ
                    int r11 = r0.LIZIZ
                    java.lang.String r6 = r0.LIZJ
                    int r12 = r0.LJFF
                    int r13 = r0.LIZLLL
                    X.0Y82 r0 = r0.LJ
                    int r14 = r0.getValue()
                    X.0Y5t r0 = r15.LIZ
                    long r9 = r0.LJI
                    r5.<init>(r6, r7, r9, r11, r12, r13, r14)
                    r4.LIZ(r2, r5, r3)
                Lbc:
                    return
                Lbd:
                    r13 = 0
                    goto L43
                Lbf:
                    r8 = 0
                    r11 = 0
                    goto L35
                Lc4:
                    r6 = r1
                    goto L1d
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C868640Y5u.onSuccess(java.lang.Object):void");
            }
        }).LJIIJJI(Collections.singletonList(c869590Y9lLJJJ));
        return new C867630Y1x(null);
    }

    @Override // X.InterfaceC868830Y6n
    public final C0Y7K LIZIZ(MessageBody messageBody, StatusMessage statusMessage, int i) {
        long jLongValue;
        C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "RefreshMessageUpdater", "refresh message from StatusMessage", 4);
        try {
            Long l = RefreshMessageEntity.ADAPTER.decode(statusMessage.entity).server_message_id;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            return LIZJ(jLongValue, messageBody);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LIZLLL().LJIIIIZZ("RefreshMessageUpdater", "decode refreshMessage StatusMessage", e);
            return new C0Y3A(EnumC868890Y6t.CLIENT_ERROR, e.getMessage(), (Integer) null, 12);
        }
    }

    public C868630Y5t(C0YEM c0yem, int i, String str, int i2, C0Y82 c0y82, int i3, long j) {
        this.LIZ = c0yem;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = i2;
        this.LJ = c0y82;
        this.LJFF = i3;
        this.LJI = j;
    }
}

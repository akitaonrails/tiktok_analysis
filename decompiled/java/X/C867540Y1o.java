package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Y1o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C867540Y1o implements InterfaceC868920Y6w {
    public final C0YEM LIZ;

    public C867540Y1o(C0YEM c0yem) {
        this.LIZ = c0yem;
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [X.0Xw0] */
    @Override // X.InterfaceC868920Y6w
    public final C0Y7K LIZ(MessageBody messageBody) throws Throwable {
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VisibleMessageUpdaterhandleMsgVisible msg = ");
        sbLIZ.append(messageBody);
        C868780Y6i.LJIILIIL(c868780Y6iLIZLLL, C2188811AlT.LIZIZ(sbLIZ));
        try {
            JSONObject jSONObject = new JSONObject(messageBody.content);
            long jOptLong = jSONObject.optLong("message_id");
            String string = JSONObjectProtectorUtils.getString(jSONObject, "conversation_id");
            long jOptLong2 = jSONObject.optLong("conversation_index_v1");
            final C0Y9J c0y9jLIZIZ = this.LIZ.LJIIZILJ().LIZIZ().LIZIZ();
            if (jOptLong > 0) {
                C0Y8T c0y8tLIZ = this.LIZ.LJIIZILJ().LIZLLL().LIZ().LIZ(string);
                final boolean z = true;
                if (c0y8tLIZ == null && (c0y8tLIZ = c0y9jLIZIZ.LJIIJJI().LIZ(string, true)) == null) {
                    C868780Y6i.LJIILIIL(this.LIZ.LIZLLL(), "VisibleMessageUpdaterhandleMsgVisible,no local conversation");
                    return new C867580Y1s(null);
                }
                if (jOptLong2 < c0y9jLIZIZ.LJI().LJJIFFI(string)) {
                    C868780Y6i.LJIILIIL(this.LIZ.LIZLLL(), "VisibleMessageUpdaterhandleMsgVisible, index less than localMinIndex, drop it");
                    return new C867580Y1s(null);
                }
                long jLJJIIJ = c0y9jLIZIZ.LJI().LJJIIJ(string);
                long lastMessageIndex = c0y8tLIZ.getLastMessageIndex();
                if (jOptLong2 > lastMessageIndex && lastMessageIndex != jLJJIIJ) {
                    z = false;
                }
                final C869590Y9l c869590Y9lLJJJ = c0y9jLIZIZ.LJI().LJJJ(jOptLong);
                if (c869590Y9lLJJJ != null) {
                    C868780Y6i.LJIILIIL(this.LIZ.LIZLLL(), "VisibleMessageUpdaterhandleMsgVisible,has loaclMsg");
                    this.LIZ.LJIIJJI().LIZJ(new InterfaceC872410YKh() { // from class: X.0Xw2
                        @Override // X.InterfaceC872410YKh
                        public final Object LIZ() {
                            c869590Y9lLJJJ.setMessageStatus(C0YUT.AVAILABLE);
                            c869590Y9lLJJJ.setDeleted(0);
                            boolean zLJLJL = c0y9jLIZIZ.LJI().LJLJL(c869590Y9lLJJJ);
                            C868780Y6i c868780Y6iLIZLLL2 = this.LIZ.LIZLLL();
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("VisibleMessageUpdaterhandleMsgVisible,updateMessage to DB result ");
                            sbLIZ2.append(zLJLJL);
                            C868780Y6i.LJIILIIL(c868780Y6iLIZLLL2, C2188811AlT.LIZIZ(sbLIZ2));
                            return Boolean.valueOf(zLJLJL);
                        }
                    }, new InterfaceC864800XwE<Boolean>() { // from class: X.0Xw1
                        @Override // X.InterfaceC864800XwE
                        public final void LIZ(Boolean bool) {
                            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                                if (z) {
                                    C868200Y4c c868200Y4c = this.LIZ.LJIIZILJ().getDomain().LIZ;
                                    C0Y3I c0y3i = new C0Y3I("command message: visible message");
                                    C869590Y9l c869590Y9l = c869590Y9lLJJJ;
                                    c868200Y4c.getClass();
                                    c868200Y4c.LJJIIZ(c0y3i, Collections.singletonList(c869590Y9l), new HashMap(), 7);
                                    C867540Y1o.LIZIZ(this.LIZ, c869590Y9lLJJJ);
                                    return;
                                }
                                return;
                            }
                            C868780Y6i.LJIILIIL(this.LIZ.LIZLLL(), "VisibleMessageUpdaterhandleMsgVisible update local msg fail");
                        }
                    }, false, this.LIZ.LJIIL().LIZJ());
                } else {
                    C868780Y6i.LJIILIIL(this.LIZ.LIZLLL(), "VisibleMessageUpdaterhandleMsgVisible,no loaclMsg");
                    new C0Y87(this.LIZ, (C864660Xw0) new InterfaceC863600XuI<C869590Y9l>() { // from class: X.0Xw0
                        @Override // X.InterfaceC863600XuI
                        public final void LIZIZ(C0YMW c0ymw) {
                            C868780Y6i c868780Y6iLIZLLL2 = this.LIZ.LIZ.LIZLLL();
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("VisibleMessageUpdaterhandleMsgVisible GetMessageById fail = ");
                            sbLIZ2.append(c0ymw);
                            C868780Y6i.LJIILIIL(c868780Y6iLIZLLL2, C2188811AlT.LIZIZ(sbLIZ2));
                        }

                        @Override // X.InterfaceC863600XuI
                        public final void onSuccess(C869590Y9l c869590Y9l) {
                            C869590Y9l c869590Y9l2 = c869590Y9l;
                            C868780Y6i c868780Y6iLIZLLL2 = this.LIZ.LIZ.LIZLLL();
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("VisibleMessageUpdaterhandleMsgVisible GetMessageById success = ");
                            sbLIZ2.append(c869590Y9l2);
                            C868780Y6i.LJIILIIL(c868780Y6iLIZLLL2, C2188811AlT.LIZIZ(sbLIZ2));
                            if (c869590Y9l2 != null) {
                                if (z) {
                                    C868200Y4c c868200Y4c = this.LIZ.LIZ.LJIIZILJ().getDomain().LIZ;
                                    C0Y3I c0y3i = new C0Y3I("handle msg visible");
                                    c868200Y4c.getClass();
                                    c868200Y4c.LJJIIZ(c0y3i, Collections.singletonList(c869590Y9l2), new HashMap(), 7);
                                    C867540Y1o.LIZIZ(this.LIZ.LIZ, c869590Y9l2);
                                    return;
                                }
                                return;
                            }
                            C868780Y6i.LJIILIIL(this.LIZ.LIZ.LIZLLL(), "VisibleMessageUpdaterhandleMsgVisible update remote msg fail");
                        }
                    }).LJIIJJI(jOptLong, c0y8tLIZ);
                }
            }
            return new C867580Y1s(null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C868780Y6i c868780Y6iLIZLLL2 = this.LIZ.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("VisibleMessageUpdaterhandleMsgVisible,Exception ");
            sbLIZ2.append(e);
            C868780Y6i.LJIILIIL(c868780Y6iLIZLLL2, C2188811AlT.LIZIZ(sbLIZ2));
            return new C0Y3A(EnumC868890Y6t.CLIENT_ERROR, e.getMessage(), (Integer) null, 12);
        }
    }

    public static void LIZIZ(final C0YEM c0yem, final C869590Y9l c869590Y9l) {
        String uuid;
        List<Long> mentionIds;
        C0Y9J c0y9jLIZIZ = c0yem.LJIIZILJ().LIZIZ().LIZIZ();
        final C013C c013c = new C013C();
        final boolean z = false;
        if (c869590Y9l.isRecalled() && (mentionIds = c869590Y9l.getMentionIds()) != null && !mentionIds.isEmpty()) {
            c013c.element = c0y9jLIZIZ.LIZIZ().LIZIZ(c869590Y9l.getUuid());
        }
        final C0Y8T c0y8tLIZ = c0y9jLIZIZ.LJIIJJI().LIZ(c869590Y9l.getConversationId(), true);
        if (c0y8tLIZ != null && c0y8tLIZ.getLastShowMessage() != null) {
            long jLIZ = C0Y2U.LIZ(c0y8tLIZ, c0yem, "update_msg_visibility", "local", true, null);
            if (jLIZ != c0y8tLIZ.getUnreadCount()) {
                z = true;
            }
            c0y8tLIZ.setUnreadCount(jLIZ);
            String uuid2 = c869590Y9l.getUuid();
            C869590Y9l lastShowMessage = c0y8tLIZ.getLastShowMessage();
            if (lastShowMessage != null) {
                uuid = lastShowMessage.getUuid();
            } else {
                uuid = null;
            }
            if (Intrinsics.LJFF(uuid2, uuid) && c869590Y9l.getIndex() > c0y8tLIZ.getLastMessageIndex()) {
                c0y8tLIZ.setLastShowMessage(c869590Y9l);
                c0y8tLIZ.setLastMessageIndex(c869590Y9l.getIndex());
                z = true;
            }
            c0y9jLIZIZ.LJIIJJI().LJJJJJ(c0y8tLIZ);
            c0yem.LJIIZILJ().getDomain().LIZ().LJ(new Runnable() { // from class: X.0Xvn
                public final void LIZ() {
                    c0yem.LJIIZILJ().getDomain().LIZ.LJJIIJZLJL(new C0Y3I("single pull update"), Collections.singletonList(c869590Y9l));
                    if (z || c013c.element) {
                        c0yem.LJIIZILJ().LIZLLL().LIZLLL().LJJL(2, c0y8tLIZ);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("VisibleMessageUpdater@9bd1.updateMsgBySinglePull$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("VisibleMessageUpdater@9bd1.updateMsgBySinglePull$1");
                }
            });
        }
    }
}

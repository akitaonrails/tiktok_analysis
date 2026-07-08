package X;

import com.bytedance.im.core.common.statusmsg.SilentCommandMessage;
import com.bytedance.im.core.internal.link.handler.statusupdater.CommandMessage;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import kotlin.ranges.IntRange;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0Y5X, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y5X {
    public static final IntRange LIZ = new IntRange(EnumC868450Y5b.MsgTypeStreakCommandMessage.getValue(), 109999);

    public static final boolean LIZJ(MessageBody messageBody) {
        Integer num;
        if (messageBody != null && (num = messageBody.message_type) != null && num.intValue() >= EnumC868450Y5b.MESSAGE_TYPE_COMMAND.getValue()) {
            return true;
        }
        return false;
    }

    public static final Object LIZ(C0YEM c0yem, MessageBody messageBody) {
        boolean z;
        if (messageBody == null) {
            C098200Yq c098200Yq = new C098200Yq(new IllegalStateException("Message body is null"));
            C189200o6.m2constructorimpl(c098200Yq);
            return c098200Yq;
        }
        Integer num = messageBody.message_type;
        int value = EnumC868450Y5b.MESSAGE_TYPE_COMMAND.getValue();
        if (num != null && num.intValue() == value) {
            String str = messageBody.content;
            if (str != null) {
                if (str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    try {
                        Object objFromJson = GsonProtectorUtils.fromJson(C09EF.LIZ, messageBody.content, (Class<Object>) CommandMessage.class);
                        C189200o6.m2constructorimpl(objFromJson);
                        return objFromJson;
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C868780Y6i c868780Y6iLIZLLL = c0yem.LIZLLL();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("decodeCommandMessage failed:");
                        sbLIZ.append(messageBody.message_type);
                        c868780Y6iLIZLLL.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ), e);
                        c0yem.LJIIZILJ().LJFF().getEventTracker().LJ(e);
                        C098200Yq c098200Yq2 = new C098200Yq(e);
                        C189200o6.m2constructorimpl(c098200Yq2);
                        return c098200Yq2;
                    }
                }
            }
            C868780Y6i c868780Y6iLIZLLL2 = c0yem.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("decodeCommandMessage failed:");
            sbLIZ2.append(messageBody.message_type);
            sbLIZ2.append(" content null ");
            c868780Y6iLIZLLL2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2), null);
            C098200Yq c098200Yq3 = new C098200Yq(new IllegalStateException("Decode CommandMessage Content is empty"));
            C189200o6.m2constructorimpl(c098200Yq3);
            return c098200Yq3;
        }
        C098200Yq c098200Yq4 = new C098200Yq(new IllegalStateException("Message type is not a command"));
        C189200o6.m2constructorimpl(c098200Yq4);
        return c098200Yq4;
    }

    public static final InterfaceC868920Y6w LIZIZ(int i, int i2, long j, final C0YEM c0yem, C0Y82 c0y82, MessageBody messageBody, final String str) {
        Integer num = messageBody.message_type;
        int value = EnumC868450Y5b.MESSAGE_TYPE_COMMAND.getValue();
        if (num != null && num.intValue() == value) {
            return new InterfaceC868920Y6w(c0yem, str) { // from class: X.0Y28
                public final C0YEM LIZ;
                public final String LIZIZ;

                /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
                @Override // X.InterfaceC868920Y6w
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final X.C0Y7K LIZ(com.bytedance.im.core.proto.MessageBody r8) {
                    /*
                        Method dump skipped, instruction units count: 214
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0Y28.LIZ(com.bytedance.im.core.proto.MessageBody):X.0Y7K");
                }

                {
                    this.LIZ = c0yem;
                    this.LIZIZ = str;
                }
            };
        }
        int value2 = EnumC868450Y5b.MESSAGE_TYPE_UPDATE_MESSAGE_EXT.getValue();
        if (num != null && num.intValue() == value2) {
            return new C0Y3F(c0yem);
        }
        int value3 = EnumC868450Y5b.MESSAGE_TYPE_CONVERSATION_DESTROY.getValue();
        if (num != null && num.intValue() == value3) {
            return new C0Y22(c0yem);
        }
        int value4 = EnumC868450Y5b.MESSAGE_TYPE_REFRESH_MESSAGE.getValue();
        if (num == null || num.intValue() != value4) {
            int value5 = EnumC868450Y5b.MESSAGE_TYPE_RE_FETCH_MESSAGE.getValue();
            if (num == null || num.intValue() != value5) {
                int value6 = EnumC868450Y5b.MESSAGE_TYPE_HIDE_VIOLATIVE_MESSAGE.getValue();
                if (num != null && num.intValue() == value6) {
                    return new C0Y3G(c0yem);
                }
                int value7 = EnumC868450Y5b.MESSAGE_TYPE_RECALL_MESSAGE.getValue();
                if (num != null && num.intValue() == value7) {
                    return new C868500Y5g(i, i2, j, c0yem, c0y82, str);
                }
                int value8 = EnumC868450Y5b.MESSAGE_TYPE_UPDATE_MESSAGE_PROPERTY.getValue();
                if (num != null && num.intValue() == value8) {
                    return new C0Y3H(c0yem);
                }
                int value9 = EnumC868450Y5b.MESSAGE_TYPE_RESET_ALL_MESSAGES.getValue();
                if (num != null && num.intValue() == value9) {
                    return new C868550Y5l(c0yem);
                }
                int value10 = EnumC868450Y5b.MESSAGE_TYPE_BLOCK_COMMAND.getValue();
                if (num != null && num.intValue() == value10) {
                    return new InterfaceC868920Y6w(c0yem) { // from class: X.0Y4t
                        public final C0YEM LIZ;

                        {
                            this.LIZ = c0yem;
                        }

                        @Override // X.InterfaceC868920Y6w
                        public final C0Y7K LIZ(MessageBody messageBody2) {
                            try {
                                C0Y9J c0y9jLIZIZ = this.LIZ.LJIIZILJ().LIZIZ().LIZIZ();
                                SilentCommandMessage silentCommandMessage = (SilentCommandMessage) C09EF.LIZ.LJII(messageBody2.content, SilentCommandMessage.class);
                                if (silentCommandMessage.silentType == 1) {
                                    C868200Y4c c868200Y4c = this.LIZ.LJIIZILJ().getDomain().LIZ;
                                    final String str2 = messageBody2.conversation_id;
                                    final int value11 = silentCommandMessage.status.getValue();
                                    final ArrayList<Long> arrayList = silentCommandMessage.silentMemberId;
                                    c868200Y4c.getClass();
                                    c868200Y4c.LJIILL(str2, new InterfaceC864490Xvj<InterfaceC868050Y3n>() { // from class: X.0Y4r
                                        @Override // X.InterfaceC864490Xvj
                                        public final void invoke(InterfaceC868050Y3n interfaceC868050Y3n) {
                                            interfaceC868050Y3n.LLIILZL(value11, str2, arrayList);
                                        }
                                    });
                                } else {
                                    C868200Y4c c868200Y4c2 = this.LIZ.LJIIZILJ().getDomain().LIZ;
                                    final String str3 = messageBody2.conversation_id;
                                    final int value12 = silentCommandMessage.status.getValue();
                                    c868200Y4c2.getClass();
                                    c868200Y4c2.LJIILL(str3, new InterfaceC864490Xvj<InterfaceC868050Y3n>() { // from class: X.0Y4s
                                        @Override // X.InterfaceC864490Xvj
                                        public final void invoke(InterfaceC868050Y3n interfaceC868050Y3n) {
                                            interfaceC868050Y3n.LLIIII(value12, str3);
                                        }
                                    });
                                }
                                C0Y8T c0y8tLIZ = c0y9jLIZIZ.LJIIJJI().LIZ(messageBody2.conversation_id, true);
                                if (c0y8tLIZ != null && c0y8tLIZ.getCoreInfo() != null) {
                                    this.LIZ.LJIIZILJ().getDomain().LIZIZ.LIZIZ(c0y8tLIZ.getInboxType(), messageBody2);
                                }
                                return new C867580Y1s(null);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                this.LIZ.LIZLLL().LJIIIZ("handle block", e);
                                return new C0Y3A(EnumC868890Y6t.CLIENT_ERROR, e.getMessage(), (Integer) null, 12);
                            }
                        }
                    };
                }
                int value11 = EnumC868450Y5b.MESSAGE_TYPE_MARK_COMMAND.getValue();
                if (num != null && num.intValue() == value11) {
                    return new C867550Y1p(c0yem);
                }
                int value12 = EnumC868450Y5b.MESSAGE_TYPE_SEND_FAILED_RESP.getValue();
                if (num != null && num.intValue() == value12) {
                    return new C0Y21(c0yem);
                }
                int value13 = EnumC868450Y5b.MESSAGE_TYPE_BATCH_UNMARK_COMMAND.getValue();
                if (num != null && num.intValue() == value13) {
                    return new C867560Y1q(c0yem);
                }
                int value14 = EnumC868450Y5b.MESSAGE_TYPE_VISIBLE_MESSAGE_COMMAND.getValue();
                if (num != null && num.intValue() == value14) {
                    return new C867540Y1o(c0yem);
                }
                IntRange intRange = LIZ;
                int i3 = intRange.LL;
                int i4 = intRange.LLILLJJLI;
                int iIntValue = num.intValue();
                if (i3 <= iIntValue && iIntValue <= i4) {
                    return new C0Y8R(i, i2, j, c0yem, c0y82, str);
                }
                return null;
            }
        }
        return new C868630Y5t(c0yem, i, str, i2, c0y82, messageBody.message_type.intValue(), j);
    }
}

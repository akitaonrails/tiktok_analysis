package X;

import android.text.TextUtils;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.status_message.StatusMessage;
import com.bytedance.im.core.proto.status_message.UpdateMessagePropertyEntity;
import com.bytedance.im.core.proto.status_message.UpdateMessagePropertyValue;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Y3H, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y3H implements InterfaceC868830Y6n, InterfaceC868920Y6w {
    public final C0YEM LIZ;

    public C0Y3H(C0YEM c0yem) {
        this.LIZ = c0yem;
    }

    public static final String LIZJ(Map<String, String> map) {
        String str;
        if (map == null || !map.containsKey("s:client_message_id") || TextUtils.isEmpty(map.get("s:client_message_id")) || (str = map.get("s:client_message_id")) == null) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC868920Y6w
    public final C0Y7K LIZ(MessageBody messageBody) throws Throwable {
        C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "MessagePropertyUpdater", "update message property", 4);
        Map<String, String> map = messageBody.ext;
        String strLIZJ = LIZJ(map);
        return LJFF(messageBody.server_message_id.longValue(), messageBody.version.longValue(), C0YA8.LIZ(messageBody, strLIZJ, messageBody.conversation_id), map, LIZLLL(messageBody.server_message_id.longValue(), messageBody.version.longValue(), strLIZJ, map), messageBody);
    }

    @Override // X.InterfaceC868830Y6n
    public final C0Y7K LIZIZ(MessageBody messageBody, StatusMessage statusMessage, int i) throws Throwable {
        long jLongValue;
        long jLongValue2;
        C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "MessagePropertyUpdater", "update message property from StatusMessage", 4);
        try {
            UpdateMessagePropertyEntity updateMessagePropertyEntityDecode = UpdateMessagePropertyEntity.ADAPTER.decode(statusMessage.entity);
            UpdateMessagePropertyValue updateMessagePropertyValueDecode = UpdateMessagePropertyValue.ADAPTER.decode(statusMessage.value);
            String strLIZJ = LIZJ(updateMessagePropertyValueDecode.extensions);
            C869590Y9l c869590Y9lLIZLLL = LIZLLL(updateMessagePropertyEntityDecode.server_message_id.longValue(), statusMessage.version.longValue(), strLIZJ, updateMessagePropertyValueDecode.extensions);
            if (c869590Y9lLIZLLL == null) {
                return new C0Y3A(EnumC868890Y6t.ENTITY_MISSING, "Message not found", (Integer) null, 12);
            }
            Long l = updateMessagePropertyEntityDecode.server_message_id;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            Long l2 = statusMessage.version;
            if (l2 != null) {
                jLongValue2 = l2.longValue();
            } else {
                jLongValue2 = 0;
            }
            String conversationId = c869590Y9lLIZLLL.getConversationId();
            if (conversationId == null) {
                conversationId = "";
            }
            return LJFF(jLongValue, jLongValue2, C0YA8.LIZ(messageBody, strLIZJ, conversationId), updateMessagePropertyValueDecode.extensions, c869590Y9lLIZLLL, messageBody);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LIZLLL().LJIIIIZZ("MessagePropertyUpdater", "decode updateMsgProperty StatusMessage", e);
            return new C0Y3A(EnumC868890Y6t.CLIENT_ERROR, e.getMessage(), (Integer) null, 12);
        }
    }

    public final C869590Y9l LIZLLL(long j, long j2, String str, Map<String, String> map) throws Throwable {
        long j3;
        C869590Y9l c869590Y9lLJJJ = null;
        if (map != null && map.containsKey("s:server_message_id") && !TextUtils.isEmpty(map.get("s:server_message_id"))) {
            C0Y9J c0y9jLIZIZ = this.LIZ.LJIIZILJ().LIZIZ().LIZIZ();
            String str2 = map.get("s:server_message_id");
            if (str2 != null) {
                j3 = CastLongProtector.parseLong(str2);
            } else {
                j3 = 0;
            }
            c869590Y9lLJJJ = c0y9jLIZIZ.LJI().LJJJ(j3);
            if (c869590Y9lLJJJ == null || j2 <= c869590Y9lLJJJ.getVersion()) {
                if (TextUtils.isEmpty(str)) {
                    return c0y9jLIZIZ.LJI().LJJJ(j);
                }
                return c0y9jLIZIZ.LJI().LJJJI(str);
            }
        }
        return c869590Y9lLJJJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0Y7K LJFF(long r23, long r25, java.util.Map<java.lang.String, ? extends java.util.List<? extends X.C0YA1>> r27, java.util.Map<java.lang.String, java.lang.String> r28, X.C869590Y9l r29, com.bytedance.im.core.proto.MessageBody r30) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Y3H.LJFF(long, long, java.util.Map, java.util.Map, X.0Y9l, com.bytedance.im.core.proto.MessageBody):X.0Y7K");
    }

    public final void LJ(final C869590Y9l c869590Y9l, C0Y3I c0y3i, HashMap<String, Map<String, String>> map, final Map<String, ? extends List<C0YA1>> map2, MessageBody messageBody, boolean z, C0Y8T c0y8t) {
        this.LIZ.LJIIZILJ().getDomain().LIZ.LJJIIZ(c0y3i.LIZ(), Collections.singletonList(c869590Y9l), map, -1);
        C868200Y4c c868200Y4c = this.LIZ.LJIIZILJ().getDomain().LIZ;
        final C0Y3I c0y3iLIZ = c0y3i.LIZ();
        final Map<String, List<C0YA1>> propertyItemListMap = c869590Y9l.getPropertyItemListMap();
        final Long l = messageBody.create_time;
        final Long l2 = messageBody.sender;
        c868200Y4c.getClass();
        if (!TextUtils.isEmpty(c869590Y9l.getConversationId())) {
            c868200Y4c.LJIIZILJ(c869590Y9l.getConversationId(), new InterfaceC864490Xvj<InterfaceC868420Y4y>() { // from class: X.0Y4h
                @Override // X.InterfaceC864490Xvj
                public final void invoke(InterfaceC868420Y4y interfaceC868420Y4y) {
                    C0Y3I c0y3i2 = c0y3iLIZ;
                    c0y3i2.getClass();
                    interfaceC868420Y4y.mp(c0y3i2, c869590Y9l, map2, propertyItemListMap, l, l2);
                }
            });
        }
        if (z) {
            if (c0y8t != null) {
                c0y8t.setLastShowMessage(c869590Y9l);
            }
            this.LIZ.LJIIZILJ().LIZLLL().LIZLLL().LJJL(2, c0y8t);
        }
    }
}

package X;

import android.text.TextUtils;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.status_message.StatusMessage;
import com.bytedance.im.core.proto.status_message.UpdateMessageExtEntity;
import com.bytedance.im.core.proto.status_message.UpdateMessageExtValue;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Y3F, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y3F implements InterfaceC868830Y6n, InterfaceC868920Y6w {
    public final C0YEM LIZ;

    public C0Y3F(C0YEM c0yem) {
        this.LIZ = c0yem;
    }

    public static final String LIZLLL(Map<String, String> map) {
        String str;
        if (map == null || !map.containsKey("s:client_message_id") || TextUtils.isEmpty(map.get("s:client_message_id")) || (str = map.get("s:client_message_id")) == null) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC868920Y6w
    public final C0Y7K LIZ(MessageBody messageBody) {
        C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "MessageExtUpdater", "update message ext", 4);
        Map<String, String> map = messageBody.ext;
        return LJFF(map, LJ(messageBody.server_message_id.longValue(), messageBody.version.longValue(), LIZLLL(map), map), messageBody.version.longValue(), messageBody);
    }

    public static boolean LIZJ(String str, String str2, Map map) {
        String str3;
        IntRange intRange = C0Y5X.LIZ;
        if (!map.containsKey(str) || (str3 = (String) map.get(str)) == null || TextUtils.isEmpty(str3)) {
            return false;
        }
        return a0.LJJIIZI(str3, str2, false);
    }

    @Override // X.InterfaceC868830Y6n
    public final C0Y7K LIZIZ(MessageBody messageBody, StatusMessage statusMessage, int i) throws Throwable {
        long jLongValue;
        C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "MessageExtUpdater", "update message ext from StatusMessage", 4);
        try {
            UpdateMessageExtEntity updateMessageExtEntityDecode = UpdateMessageExtEntity.ADAPTER.decode(statusMessage.entity);
            UpdateMessageExtValue updateMessageExtValueDecode = UpdateMessageExtValue.ADAPTER.decode(statusMessage.value);
            C869590Y9l c869590Y9lLJ = LJ(updateMessageExtEntityDecode.server_message_id.longValue(), statusMessage.version.longValue(), LIZLLL(updateMessageExtValueDecode.extensions), updateMessageExtValueDecode.extensions);
            if (c869590Y9lLJ == null) {
                return new C0Y3A(EnumC868890Y6t.ENTITY_MISSING, "Message not found", (Integer) null, 12);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(updateMessageExtValueDecode.extensions);
            Long l = statusMessage.version;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            return LJFF(linkedHashMap, c869590Y9lLJ, jLongValue, messageBody);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LIZLLL().LJIIIIZZ("MessageExtUpdater", "decode updateMessageExt StatusMessage", e);
            return new C0Y3A(EnumC868890Y6t.CLIENT_ERROR, e.getMessage(), (Integer) null, 12);
        }
    }

    public static void LJI(C0YEM c0yem, final C869590Y9l c869590Y9l, Map map, boolean z) {
        boolean zLIZIZ;
        boolean z2;
        String uuid;
        List<Long> mentionIds;
        C0Y9J c0y9jLIZIZ = c0yem.LJIIZILJ().LIZIZ().LIZIZ();
        boolean z3 = true;
        if (c869590Y9l.isRecalled() && (mentionIds = c869590Y9l.getMentionIds()) != null && !mentionIds.isEmpty()) {
            zLIZIZ = c0y9jLIZIZ.LIZIZ().LIZIZ(c869590Y9l.getUuid());
        } else {
            zLIZIZ = false;
        }
        C0Y8T c0y8tLIZ = c0y9jLIZIZ.LJIIJJI().LIZ(c869590Y9l.getConversationId(), true);
        if (c0y8tLIZ != null && c0y8tLIZ.getLastShowMessage() != null) {
            long jLIZ = C0Y2U.LIZ(c0y8tLIZ, c0yem, "update_msg_visibility", "local", true, null);
            if (jLIZ != c0y8tLIZ.getUnreadCount()) {
                z2 = true;
            } else {
                z2 = false;
            }
            c0y8tLIZ.setUnreadCount(jLIZ);
            String uuid2 = c869590Y9l.getUuid();
            C869590Y9l lastShowMessage = c0y8tLIZ.getLastShowMessage();
            if (lastShowMessage != null) {
                uuid = lastShowMessage.getUuid();
            } else {
                uuid = null;
            }
            if (Intrinsics.LJFF(uuid2, uuid)) {
                c0y8tLIZ.setLastShowMessage(c869590Y9l);
                z2 = true;
            }
            c0y9jLIZIZ.LJIIJJI().LJJJJJ(c0y8tLIZ);
            if (!z2 && !zLIZIZ) {
                z3 = false;
            }
            List<C869590Y9l> listSingletonList = Collections.singletonList(c869590Y9l);
            HashMap map2 = new HashMap();
            if (map != null) {
                map2.put(String.valueOf(c869590Y9l.getMsgId()), map);
            }
            c0yem.LJIIZILJ().getDomain().LIZ.LJJIIZ(new C0Y3I("update message"), listSingletonList, map2, -1);
            if (z) {
                C868200Y4c c868200Y4c = c0yem.LJIIZILJ().getDomain().LIZ;
                c868200Y4c.getClass();
                if (!TextUtils.isEmpty(c869590Y9l.getConversationId())) {
                    c868200Y4c.LJIIZILJ(c869590Y9l.getConversationId(), new InterfaceC864490Xvj<InterfaceC868420Y4y>() { // from class: X.0Y4q
                        @Override // X.InterfaceC864490Xvj
                        public final void invoke(InterfaceC868420Y4y interfaceC868420Y4y) {
                            interfaceC868420Y4y.Re(c869590Y9l);
                        }
                    });
                }
            }
            if (z3 || z) {
                c0yem.LJIIZILJ().LIZLLL().LIZLLL().LJJL(2, c0y8tLIZ);
            }
        }
    }

    public final C869590Y9l LJ(long j, long j2, String str, Map<String, String> map) throws Throwable {
        String str2;
        Long lValueOf;
        C0Y9J c0y9jLIZIZ = this.LIZ.LJIIZILJ().LIZIZ().LIZIZ();
        if (map != null && map.containsKey("s:server_message_id") && !TextUtils.isEmpty(map.get("s:server_message_id")) && (str2 = map.get("s:server_message_id")) != null && (lValueOf = Long.valueOf(CastLongProtector.parseLong(str2))) != null) {
            C869590Y9l c869590Y9lLJJJ = c0y9jLIZIZ.LJI().LJJJ(lValueOf.longValue());
            if (c869590Y9lLJJJ != null && j2 > c869590Y9lLJJJ.getVersion()) {
                return c869590Y9lLJJJ;
            }
        }
        if (TextUtils.isEmpty(str)) {
            return c0y9jLIZIZ.LJI().LJJJ(j);
        }
        return c0y9jLIZIZ.LJI().LJJJI(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009c A[Catch: Exception -> 0x0110, TryCatch #0 {Exception -> 0x0110, blocks: (B:3:0x0003, B:5:0x0015, B:7:0x0025, B:9:0x002f, B:11:0x0039, B:13:0x0041, B:15:0x0049, B:16:0x0050, B:18:0x0056, B:20:0x0070, B:22:0x0076, B:24:0x007e, B:37:0x009f, B:39:0x00a9, B:40:0x00ae, B:42:0x00bc, B:47:0x00d1, B:49:0x00ef, B:27:0x0085, B:34:0x0096, B:36:0x009c), top: B:55:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0Y7K LJFF(java.util.Map<java.lang.String, java.lang.String> r14, X.C869590Y9l r15, long r16, com.bytedance.im.core.proto.MessageBody r18) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Y3F.LJFF(java.util.Map, X.0Y9l, long, com.bytedance.im.core.proto.MessageBody):X.0Y7K");
    }
}

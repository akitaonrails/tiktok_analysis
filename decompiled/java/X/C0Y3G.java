package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.status_message.StatusMessage;
import com.bytedance.im.core.proto.status_message.UpdateMessageExtEntity;
import com.bytedance.im.core.proto.status_message.UpdateMessageExtValue;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Y3G, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y3G implements InterfaceC868830Y6n, InterfaceC868920Y6w {
    public final C0YEM LIZ;

    public C0Y3G(C0YEM c0yem) {
        this.LIZ = c0yem;
    }

    @Override // X.InterfaceC868920Y6w
    public final C0Y7K LIZ(MessageBody messageBody) {
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hide violative message ");
        sbLIZ.append(messageBody);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "HideViolativeMessageUpdater", C2188811AlT.LIZIZ(sbLIZ), 4);
        try {
            JSONObject jSONObject = new JSONObject(messageBody.content);
            long jOptLong = jSONObject.optLong("msg_id");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ext");
            HashMap map = new HashMap();
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, (String) jSONObjectOptJSONObject.get(next));
                }
            }
            return LIZJ(jOptLong, map);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LIZLLL().LJIIIIZZ("HideViolativeMessageUpdater", "handleViolative", e);
            return new C0Y3A(EnumC868890Y6t.CLIENT_ERROR, e.getMessage(), (Integer) null, 12);
        }
    }

    public final C0Y7K LIZJ(long j, Map<String, String> map) throws Throwable {
        C0Y9J c0y9jLIZIZ = this.LIZ.LJIIZILJ().LIZIZ().LIZIZ();
        C869590Y9l c869590Y9lLJJJ = c0y9jLIZIZ.LJI().LJJJ(j);
        if (c869590Y9lLJJJ == null) {
            C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "HideViolativeMessageUpdaterhandleViolative", "Cannot refresh a message from a message that doesn't exist", 4);
            return new C0Y3A(EnumC868890Y6t.ENTITY_MISSING, "Message not found", (Integer) null, 12);
        }
        if (!c869590Y9lLJJJ.isDeleted() && c869590Y9lLJJJ.getMessageStatus() != C0YUT.RECALLED) {
            if (!map.containsKey("a:is_violative")) {
                return new C867580Y1s(null);
            }
            if (Intrinsics.LJFF(map.get("a:is_violative"), c869590Y9lLJJJ.getExt().get("a:is_violative")) && Intrinsics.LJFF(map.get("a:violation_reason"), c869590Y9lLJJJ.getExt().get("a:violation_reason"))) {
                return new C867580Y1s(null);
            }
            HashMap map2 = new HashMap(c869590Y9lLJJJ.getExt());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                c869590Y9lLJJJ.addExt(entry.getKey(), entry.getValue());
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(c869590Y9lLJJJ);
            boolean zLJLIL = c0y9jLIZIZ.LJI().LJLIL(c869590Y9lLJJJ.getUuid(), c869590Y9lLJJJ.getExt());
            if (zLJLIL) {
                HashMap map3 = new HashMap();
                map3.put(String.valueOf(c869590Y9lLJJJ.getMsgId()), map2);
                this.LIZ.LJIIZILJ().getDomain().LIZ.LJJIIZ(new C0Y3I("handle violative"), arrayList, map3, -1);
            }
            if (Intrinsics.LJFF(map.get("a:is_violative"), "true")) {
                C0YEM c0yem = this.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ref_");
                sbLIZ.append(j);
                C867650Y1z.LIZIZ(c0yem, C2188811AlT.LIZIZ(sbLIZ), C0YUT.VIOLATIVE);
            } else {
                C0YEM c0yem2 = this.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("ref_");
                sbLIZ2.append(j);
                C867650Y1z.LIZIZ(c0yem2, C2188811AlT.LIZIZ(sbLIZ2), C0YUT.AVAILABLE);
            }
            if (zLJLIL) {
                return new C867580Y1s(null);
            }
            return new C0Y3A(EnumC868890Y6t.DB_ERROR, "Update message ext failed", (Integer) null, 12);
        }
        return new C867580Y1s(null);
    }

    @Override // X.InterfaceC868830Y6n
    public final C0Y7K LIZIZ(MessageBody messageBody, StatusMessage statusMessage, int i) {
        long jLongValue;
        C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "HideViolativeMessageUpdater", "hide violative message from StatusMessage", 4);
        try {
            UpdateMessageExtEntity updateMessageExtEntityDecode = UpdateMessageExtEntity.ADAPTER.decode(statusMessage.entity);
            UpdateMessageExtValue updateMessageExtValueDecode = UpdateMessageExtValue.ADAPTER.decode(statusMessage.value);
            Long l = updateMessageExtEntityDecode.server_message_id;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            return LIZJ(jLongValue, new LinkedHashMap(updateMessageExtValueDecode.extensions));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LIZLLL().LJIIIIZZ("HideViolativeMessageUpdater", "decode HideViolativeMessage StatusMessage", e);
            return new C0Y3A(EnumC868890Y6t.CLIENT_ERROR, e.getMessage(), (Integer) null, 12);
        }
    }
}

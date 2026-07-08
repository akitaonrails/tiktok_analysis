package X;

import com.bytedance.im.core.proto.ConversationParticipantReadIndex;
import com.bytedance.im.core.proto.ParticipantReadIndex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YJW, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YJW {
    public final C0YH7 LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(393));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(394));
    public final List<Function0<Unit>> LIZLLL = new ArrayList();

    public C0YJW(C0YH7 c0yh7) {
        this.LIZ = c0yh7;
    }

    public final C872090YJb LIZ(String str) {
        return (C872090YJb) ((ConcurrentHashMap) this.LIZIZ.getValue()).get(str);
    }

    public final void LIZIZ(C872120YJe c872120YJe) {
        if (LJ(c872120YJe.LIZ, c872120YJe.LIZIZ, c872120YJe.LIZJ)) {
            Iterator it2 = ((ArrayList) this.LIZLLL).iterator();
            while (it2.hasNext()) {
                ((Function0) it2.next()).invoke();
            }
        }
    }

    public final void LIZJ(List<ConversationParticipantReadIndex> list) {
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (ConversationParticipantReadIndex conversationParticipantReadIndex : list) {
            linkedHashMap.put(conversationParticipantReadIndex.conversation_id, conversationParticipantReadIndex);
        }
        boolean z = false;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            for (ParticipantReadIndex participantReadIndex : ((ConversationParticipantReadIndex) entry.getValue()).participantReadIndex) {
                if (!z && !LJ(participantReadIndex.user_id.longValue(), participantReadIndex.index.longValue(), str)) {
                    z = false;
                } else {
                    z = true;
                }
            }
        }
        if (z) {
            Iterator it2 = ((ArrayList) this.LIZLLL).iterator();
            while (it2.hasNext()) {
                ((Function0) it2.next()).invoke();
            }
        }
    }

    public final Unit LIZLLL(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C872090YJb c872090YJb = (C872090YJb) it2.next();
            if (!Intrinsics.LJFF(((ConcurrentHashMap) this.LIZIZ.getValue()).get(c872090YJb.LIZ), c872090YJb)) {
                linkedHashMap.put(c872090YJb.LIZ, C872090YJb.LIZ(c872090YJb, null, 15));
            }
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            C872090YJb c872090YJb2 = (C872090YJb) it3.next();
            ((ConcurrentHashMap) this.LIZIZ.getValue()).put(c872090YJb2.LIZ, c872090YJb2);
        }
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update cache, list size = ");
        sbLIZ.append(list.size());
        C868780Y6i.LJ(c868780Y6iLIZLLL, "ReadReceiptDataCache", C2188811AlT.LIZIZ(sbLIZ), 4);
        if (!linkedHashMap.isEmpty()) {
            ((InterfaceC332260D0u) C01SA.LIZIZ.getValue()).setValue(linkedHashMap);
        }
        return Unit.LIZ;
    }

    public final boolean LJ(long j, long j2, String str) {
        long jLongValue;
        Long l;
        if (!((ConcurrentHashMap) this.LIZJ.getValue()).containsKey(str)) {
            ((ConcurrentHashMap) this.LIZJ.getValue()).put(str, new LinkedHashMap());
        }
        Map map = (Map) ((ConcurrentHashMap) this.LIZJ.getValue()).get(str);
        if (map != null && (l = (Long) map.get(Long.valueOf(j))) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (j2 <= jLongValue) {
            return false;
        }
        Map map2 = (Map) ((ConcurrentHashMap) this.LIZJ.getValue()).get(str);
        if (map2 != null) {
            map2.put(Long.valueOf(j), Long.valueOf(j2));
            return true;
        }
        return true;
    }
}

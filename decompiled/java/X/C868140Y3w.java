package X;

import com.bytedance.im.core.proto.MessageBody;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0Y3w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C868140Y3w {
    public final C0YEM LIZ;
    public final Set<Integer> LIZIZ = new CopyOnWriteArraySet();
    public final Set<String> LIZJ = new CopyOnWriteArraySet();
    public final Set<Integer> LIZLLL = new CopyOnWriteArraySet();
    public final Set<Integer> LJ = new CopyOnWriteArraySet();
    public final Set<String> LJFF = new CopyOnWriteArraySet();
    public final Map<Integer, Map<String, MessageBody>> LJI = new ConcurrentHashMap();
    public final Set<String> LJII = new CopyOnWriteArraySet();
    public final Map<Integer, List<String>> LJIIIIZZ = new ConcurrentHashMap();
    public final Map<Integer, Boolean> LJIIIZ = new ConcurrentHashMap();
    public final Set<Integer> LJIIJ = new CopyOnWriteArraySet();
    public final Set<String> LJIIJJI = new CopyOnWriteArraySet();
    public final Set<String> LJIIL = new CopyOnWriteArraySet();
    public final Map<String, Boolean> LJIILIIL = new ConcurrentHashMap();

    public final void LIZLLL() {
        ((CopyOnWriteArraySet) this.LIZIZ).clear();
        ((CopyOnWriteArraySet) this.LIZJ).clear();
        ((CopyOnWriteArraySet) this.LIZLLL).clear();
        ((CopyOnWriteArraySet) this.LJ).clear();
        ((ConcurrentHashMap) this.LJI).clear();
        ((CopyOnWriteArraySet) this.LJFF).clear();
        ((CopyOnWriteArraySet) this.LJII).clear();
        ((ConcurrentHashMap) this.LJIIIIZZ).clear();
        ((ConcurrentHashMap) this.LJIIIZ).clear();
        ((CopyOnWriteArraySet) this.LJIIJ).clear();
        ((CopyOnWriteArraySet) this.LJIIJJI).clear();
        ((CopyOnWriteArraySet) this.LJIIL).clear();
        ((ConcurrentHashMap) this.LJIILIIL).clear();
    }

    public C868140Y3w(C0YEM c0yem) {
        this.LIZ = c0yem;
    }

    public final void LIZJ(boolean z) {
        if (!((ConcurrentHashMap) this.LJI).isEmpty()) {
            for (Integer num : ((ConcurrentHashMap) this.LJI).keySet()) {
                Map map = (Map) ((ConcurrentHashMap) this.LJI).get(num);
                if (map != null && !map.isEmpty()) {
                    C870180YBs c870180YBsLIZ = this.LIZ.LJIIZILJ().getDomain().LIZ();
                    C867400Y1a.LJIIJJI(c870180YBsLIZ.LLILLL, num.intValue(), map, z);
                    ((ConcurrentHashMap) this.LJI).put(num, new ConcurrentHashMap());
                }
            }
        }
        if (!((CopyOnWriteArraySet) this.LJII).isEmpty()) {
            for (String str : (CopyOnWriteArraySet) this.LJII) {
                C870180YBs c870180YBsLIZ2 = this.LIZ.LJIIZILJ().getDomain().LIZ();
                c870180YBsLIZ2.getClass();
                new C0Y1J(c870180YBsLIZ2.LLILLL).LJIIL(str);
            }
            ((CopyOnWriteArraySet) this.LJII).clear();
        }
    }

    public final boolean LJ(int i) {
        return ((CopyOnWriteArraySet) this.LJ).contains(Integer.valueOf(i));
    }

    public final boolean LJI(int i) {
        if (((ConcurrentHashMap) this.LJI).containsKey(Integer.valueOf(i))) {
            if (!((Map) ((ConcurrentHashMap) this.LJI).get(Integer.valueOf(i))).isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void LJII(String str) {
        if (((ConcurrentHashMap) this.LJIILIIL).containsKey(str)) {
            this.LIZ.LIZLLL().LIZJ("WaitChecker ", "markAsChangedIfSending, msgUuid: $msgUuid");
            ((ConcurrentHashMap) this.LJIILIIL).put(str, Boolean.TRUE);
        }
    }

    public final void LJIIIIZZ(String str) {
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("putSendingMsg, msgUuid: ");
        sbLIZ.append(str);
        c868780Y6iLIZLLL.LIZJ("WaitChecker ", C2188811AlT.LIZIZ(sbLIZ));
        ((ConcurrentHashMap) this.LJIILIIL).put(str, Boolean.FALSE);
    }

    public final void LJIIJ(String str) {
        this.LIZ.LIZLLL().LIZJ("WaitChecker ", "removeSendingMsg, msgUuid: $msgUuid");
        ((ConcurrentHashMap) this.LJIILIIL).remove(str);
    }

    public final void LIZIZ(int i, MessageBody messageBody) {
        if (messageBody != null && messageBody.conversation_id != null && messageBody.conversation_short_id != null && messageBody.conversation_type != null) {
            if (((ConcurrentHashMap) this.LJI).get(Integer.valueOf(i)) == null) {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                concurrentHashMap.put(messageBody.conversation_id, messageBody);
                ((ConcurrentHashMap) this.LJI).put(Integer.valueOf(i), concurrentHashMap);
                return;
            }
            ((Map) ((ConcurrentHashMap) this.LJI).get(Integer.valueOf(i))).put(messageBody.conversation_id, messageBody);
        }
    }

    public final boolean LJFF(int i, String str) {
        if (((ConcurrentHashMap) this.LJI).containsKey(Integer.valueOf(i))) {
            if (((ConcurrentHashMap) this.LJI).get(Integer.valueOf(i)) != null) {
                if (((Map) ((ConcurrentHashMap) this.LJI).get(Integer.valueOf(i))).containsKey(str)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void LJIIIZ(int i, Collection<String> collection) {
        if (collection != null && !collection.isEmpty()) {
            List list = (List) ((ConcurrentHashMap) this.LJIIIIZZ).get(Integer.valueOf(i));
            if (list == null) {
                return;
            }
            list.removeAll(collection);
            if (list.isEmpty()) {
                if (((ConcurrentHashMap) this.LJIIIZ).containsKey(Integer.valueOf(i))) {
                    this.LIZ.LJIIZILJ().getDomain().LIZ.LJIL(i);
                }
            }
        }
    }

    public final void LJIIJJI(int i, String str) {
        if (((ConcurrentHashMap) this.LJI).containsKey(Integer.valueOf(i))) {
            ((Map) ((ConcurrentHashMap) this.LJI).get(Integer.valueOf(i))).remove(str);
        }
    }

    public final void LJIIL(int i, int i2) {
        C0YMI c0ymi;
        if (((CopyOnWriteArraySet) this.LIZIZ).contains(Integer.valueOf(i))) {
            ((CopyOnWriteArraySet) this.LIZIZ).remove(Integer.valueOf(i));
            C871360YGg c871360YGg = this.LIZ.LJIIZILJ().getDomain().LIZLLL;
            c871360YGg.getClass();
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        c0ymi = C0YMI.FAILED;
                    } else {
                        return;
                    }
                } else {
                    c0ymi = C0YMI.COMPLETED;
                }
            } else {
                c0ymi = C0YMI.STARTED;
            }
            c871360YGg.LJ(InterfaceC871310YGb.LIZIZ, new C868150Y3x(c0ymi));
        }
    }

    public final void LIZ(int i, long j, long j2, int i2, String str) {
        C872660YLg c872660YLg = new C872660YLg();
        c872660YLg.LIZLLL = str;
        c872660YLg.LJII = Long.valueOf(j);
        c872660YLg.LJ = Integer.valueOf(i2);
        c872660YLg.LJIIL = Long.valueOf(j2);
        LIZIZ(i, c872660YLg.build());
    }
}

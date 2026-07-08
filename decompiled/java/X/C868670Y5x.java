package X;

import com.bytedance.im.core.client.configs.IMSDKRefreshMediaProactiveConfig;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: X.0Y5x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C868670Y5x {
    public final C0YEM LIZ;
    public final InterfaceC497601wk LIZIZ;
    public final IMSDKRefreshMediaProactiveConfig LIZJ;
    public final C868780Y6i LIZLLL;
    public final ConcurrentMap<Long, C09AE> LJ;

    public final void LIZ() {
        Iterator it2 = ((ConcurrentHashMap) this.LJ).values().iterator();
        while (it2.hasNext()) {
            ((C09AE) it2.next()).LIZIZ(null);
        }
        ((ConcurrentHashMap) this.LJ).clear();
    }

    public C868670Y5x(C0YEM c0yem) {
        InterfaceC497601wk interfaceC497601wkLIZJ = c0yem.LIZJ();
        this.LIZ = c0yem;
        this.LIZIZ = interfaceC497601wkLIZJ;
        this.LIZJ = c0yem.LJIIIZ().LJJLIIIIJ.LJIJI;
        this.LIZLLL = c0yem.LIZLLL();
        this.LJ = new ConcurrentHashMap();
    }

    public final void LIZIZ(long j) {
        C09AE c09ae = (C09AE) ((ConcurrentHashMap) this.LJ).get(Long.valueOf(j));
        if (c09ae != null) {
            c09ae.LIZIZ(null);
            ((ConcurrentHashMap) this.LJ).remove(Long.valueOf(j));
        }
    }

    public final void LIZJ(long j) {
        if (!this.LIZJ.getEnabled()) {
            return;
        }
        C868780Y6i c868780Y6i = this.LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clear proactive refresh job for msgId=");
        sbLIZ.append(j);
        sbLIZ.append(" after refreshed");
        C868780Y6i.LJ(c868780Y6i, "MediaMsgRefresher", C2188811AlT.LIZIZ(sbLIZ), 4);
        LIZIZ(j);
    }

    public final void LIZLLL(C869590Y9l c869590Y9l) {
        Long l;
        String conversationId;
        if (!this.LIZJ.getEnabled()) {
            return;
        }
        if ((!this.LIZJ.getRequireWsDisconnect() || !this.LIZ.LJ().LIZ().isWsConnected()) && (l = this.LIZJ.getMsgTypesWithDelay().get(Integer.valueOf(c869590Y9l.getMsgType()))) != null) {
            long jLongValue = l.longValue();
            if (!C870360YCk.LIZIZ(c869590Y9l)) {
                LIZIZ(c869590Y9l.getMsgId());
                return;
            }
            if (((ConcurrentHashMap) this.LJ).get(Long.valueOf(c869590Y9l.getMsgId())) == null && (conversationId = c869590Y9l.getConversationId()) != null) {
                long msgId = c869590Y9l.getMsgId();
                if (((ConcurrentHashMap) this.LJ).containsKey(Long.valueOf(msgId))) {
                    C868780Y6i c868780Y6i = this.LIZLLL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Already scheduled refreshing for msg=");
                    sbLIZ.append(msgId);
                    sbLIZ.append(", skip");
                    C868780Y6i.LJ(c868780Y6i, "MediaMsgRefresher", C2188811AlT.LIZIZ(sbLIZ), 4);
                    return;
                }
                C868780Y6i c868780Y6i2 = this.LIZLLL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("schedule proactive refresh msg=");
                sbLIZ2.append(c869590Y9l.getMsgId());
                sbLIZ2.append(" delay=");
                sbLIZ2.append(jLongValue);
                sbLIZ2.append("ms");
                C868780Y6i.LJ(c868780Y6i2, "MediaMsgRefresher", C2188811AlT.LIZIZ(sbLIZ2), 4);
                ((ConcurrentHashMap) this.LJ).put(Long.valueOf(msgId), C23250099c.LIZLLL(this.LIZIZ, null, null, new C868660Y5w(jLongValue, this, msgId, c869590Y9l, conversationId, null), 3));
            }
        }
    }
}

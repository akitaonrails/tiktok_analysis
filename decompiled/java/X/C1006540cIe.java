package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.aweme.minis.feed.instantplay.model.FeedSubcardInfo;
import com.ss.android.ugc.aweme.minis.feed.instantplay.model.GameCardMaterial;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS417S0200000_16;

/* JADX INFO: renamed from: X.0cIe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1006540cIe {
    public static volatile boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static volatile boolean LIZLLL;
    public static volatile boolean LJ;
    public static volatile boolean LJI;
    public static final ConcurrentHashMap<Long, C1006440cIU> LIZ = new ConcurrentHashMap<>();
    public static final Set<Long> LJFF = Collections.newSetFromMap(new ConcurrentHashMap());

    public static void LIZIZ() {
        C1006550cIf.LIZ();
        C1006530cId.LJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("releaseAll, releasing ");
        ConcurrentHashMap<Long, C1006440cIU> concurrentHashMap = LIZ;
        sbLIZ.append(concurrentHashMap.size());
        sbLIZ.append(" flow(s)");
        C2188811AlT.LIZIZ(sbLIZ);
        C1007120cJa.LIZ();
        LJFF.clear();
        List listLLIIII = C13LP.LLIIII(concurrentHashMap.values());
        concurrentHashMap.clear();
        Iterator it2 = listLLIIII.iterator();
        while (it2.hasNext()) {
            ((C1006440cIU) it2.next()).LIZJ(EnumC1006610cIl.REFRESH);
        }
    }

    public static C1006440cIU LIZ(long j) {
        return LIZ.get(Long.valueOf(j));
    }

    public static void LIZJ(long j, EnumC1006610cIl enumC1006610cIl) {
        AtomicBoolean atomicBoolean;
        ConcurrentHashMap<Long, C1006560cIg> concurrentHashMap = C1006550cIf.LIZ;
        C1006560cIg c1006560cIgRemove = concurrentHashMap.remove(Long.valueOf(j));
        boolean z = true;
        if (c1006560cIgRemove != null && (atomicBoolean = c1006560cIgRemove.LIZJ) != null) {
            atomicBoolean.set(true);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancel cardId=");
        sbLIZ.append(j);
        sbLIZ.append(" found=");
        if (c1006560cIgRemove == null) {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        C1007120cJa.LIZ();
        if (concurrentHashMap.isEmpty()) {
            C1006550cIf.LIZLLL();
        }
        ConcurrentHashMap<Long, C1006440cIU> concurrentHashMap2 = LIZ;
        C1006440cIU c1006440cIURemove = concurrentHashMap2.remove(Long.valueOf(j));
        if (c1006440cIURemove == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("release miss, cardId=");
            sbLIZ2.append(j);
            sbLIZ2.append(" scene=");
            sbLIZ2.append(enumC1006610cIl);
            sbLIZ2.append(" not in flows");
            C2188811AlT.LIZIZ(sbLIZ2);
            C1007120cJa.LIZ();
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("release cardId=");
        sbLIZ3.append(j);
        sbLIZ3.append(" scene=");
        sbLIZ3.append(enumC1006610cIl);
        sbLIZ3.append(" remaining=");
        sbLIZ3.append(concurrentHashMap2.size());
        C2188811AlT.LIZIZ(sbLIZ3);
        C1007120cJa.LIZ();
        c1006440cIURemove.LIZJ(enumC1006610cIl);
    }

    public static C1006440cIU LIZLLL(Aweme aweme, boolean z) {
        Long lValueOf;
        String cardInsertStatus;
        GameCardMaterial gameCardMaterial;
        List<FeedSubcardInfo> list;
        FeedSubcardInfo feedSubcardInfo;
        C1006440cIU c1006440cIU;
        String str;
        String str2;
        Map<String, String> map;
        CardInsertInfo cardInsertInfo = aweme.getCardInsertInfo();
        Map<String, String> map2 = null;
        if (cardInsertInfo != null) {
            lValueOf = Long.valueOf(cardInsertInfo.getCardId());
        } else {
            lValueOf = null;
        }
        CardInsertInfo cardInsertInfo2 = aweme.getCardInsertInfo();
        if (cardInsertInfo2 == null || (cardInsertStatus = cardInsertInfo2.getCardInsertStatus()) == null) {
            cardInsertStatus = "";
        }
        if (cardInsertStatus.length() != 0) {
            try {
                gameCardMaterial = (GameCardMaterial) C309390CAv.LIZ(cardInsertStatus, GameCardMaterial.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("startLoad parse failed cardId=");
                sbLIZ.append(lValueOf);
                sbLIZ.append(" err=");
                sbLIZ.append(e.getMessage());
                C2188811AlT.LIZIZ(sbLIZ);
                C1007120cJa.LIZ();
                gameCardMaterial = null;
            }
            if (gameCardMaterial == null || (list = gameCardMaterial.feedSubcardInfoList) == null) {
                feedSubcardInfo = null;
            } else {
                feedSubcardInfo = (FeedSubcardInfo) C13LP.LJJJLL(list);
            }
        } else {
            gameCardMaterial = null;
            feedSubcardInfo = null;
        }
        if (z) {
            C1006330cIJ c1006330cIJ = C1006330cIJ.LIZ;
            if (feedSubcardInfo != null) {
                str2 = feedSubcardInfo.clientKey;
                map = feedSubcardInfo.extraParams;
            } else {
                str2 = null;
                map = null;
            }
            c1006330cIJ.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (str2 == null) {
                str2 = "";
            }
            c2344009Gk.LJIIIIZZ("minis_id", str2);
            C1006330cIJ.LIZ(c2344009Gk, map);
            C1006330cIJ.LIZIZ("tm_playable_card_commit_response", c2344009Gk.LIZ);
        }
        if (lValueOf == null) {
            aweme.getAid();
            C1007120cJa.LIZ();
            return null;
        }
        if (cardInsertStatus.length() == 0) {
            C1007120cJa.LIZ();
            return null;
        }
        if (gameCardMaterial == null) {
            C1007120cJa.LIZ();
            return null;
        }
        ConcurrentHashMap<Long, C1006440cIU> concurrentHashMap = LIZ;
        C1006440cIU c1006440cIU2 = concurrentHashMap.get(lValueOf);
        if (c1006440cIU2 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("startLoad dedupe hit, cardId=");
            sbLIZ2.append(lValueOf);
            C2188811AlT.LIZIZ(sbLIZ2);
            C1007120cJa.LIZ();
            return c1006440cIU2;
        }
        C1006440cIU c1006440cIU3 = new C1006440cIU(lValueOf.longValue(), gameCardMaterial, aweme);
        synchronized (concurrentHashMap) {
            try {
                c1006440cIU = concurrentHashMap.get(lValueOf);
                if (c1006440cIU == null) {
                    concurrentHashMap.put(lValueOf, c1006440cIU3);
                    c1006440cIU = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (c1006440cIU != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("startLoad dedupe race, cardId=");
            sbLIZ3.append(lValueOf);
            C2188811AlT.LIZIZ(sbLIZ3);
            C1007120cJa.LIZ();
            return c1006440cIU;
        }
        LIZIZ = true;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("startLoad new flow, cardId=");
        sbLIZ4.append(lValueOf);
        sbLIZ4.append(" liveFlows=");
        sbLIZ4.append(concurrentHashMap.size());
        C2188811AlT.LIZIZ(sbLIZ4);
        C1007120cJa.LIZ();
        C1006330cIJ c1006330cIJ2 = C1006330cIJ.LIZ;
        if (feedSubcardInfo != null) {
            str = feedSubcardInfo.clientKey;
            map2 = feedSubcardInfo.extraParams;
        } else {
            str = null;
        }
        c1006330cIJ2.getClass();
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        if (str == null) {
            str = "";
        }
        c2344009Gk2.LJIIIIZZ("minis_id", str);
        C1006330cIJ.LIZ(c2344009Gk2, map2);
        C1006330cIJ.LIZIZ("tm_playable_card_preload_start", c2344009Gk2.LIZ);
        if (z && C1006570cIh.LIZ().idleScheduleEnabled) {
            if (C1006550cIf.LIZIZ()) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("startLoad immediate, cardId=");
                sbLIZ5.append(lValueOf);
                sbLIZ5.append(" resource OK");
                C2188811AlT.LIZIZ(sbLIZ5);
                C1007120cJa.LIZ();
                c1006440cIU3.LIZLLL();
            } else {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("startLoad deferred, cardId=");
                sbLIZ6.append(lValueOf);
                sbLIZ6.append(" resource insufficient");
                C2188811AlT.LIZIZ(sbLIZ6);
                C1007120cJa.LIZ();
                long jLongValue = lValueOf.longValue();
                C1006560cIg c1006560cIg = new C1006560cIg(jLongValue, new AwS417S0200000_16(lValueOf, c1006440cIU3, 72));
                Long lValueOf2 = Long.valueOf(jLongValue);
                ConcurrentHashMap<Long, C1006560cIg> concurrentHashMap2 = C1006550cIf.LIZ;
                concurrentHashMap2.put(lValueOf2, c1006560cIg);
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("schedule cardId=");
                sbLIZ7.append(jLongValue);
                sbLIZ7.append(" pending=");
                sbLIZ7.append(concurrentHashMap2.size());
                C2188811AlT.LIZIZ(sbLIZ7);
                C1007120cJa.LIZ();
                if (!C1006550cIf.LIZIZ) {
                    C1006550cIf.LIZIZ = true;
                    C1006550cIf.LIZJ.set(false);
                    C1BCA.LJIIZILJ(C1006550cIf.LIZLLL, true, 0L);
                    C1BCA.LJJIIJ(C1006550cIf.LJ, true, 0L);
                    C1BCA.LJJ(C1006550cIf.LJFF, true, 0L);
                    C1007120cJa.LIZ();
                    return c1006440cIU3;
                }
            }
            return c1006440cIU3;
        }
        c1006440cIU3.LIZLLL();
        return c1006440cIU3;
    }
}

package X;

import Y.ACallableS418S0100000_11;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.aweme.feed.model.consistency.ConsistencyGroupStruct;
import com.ss.android.ugc.aweme.feed.model.consistency.ConsistencyRspStruct;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0T5M, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T5M {
    public static final C0T5M LIZ = new C0T5M();
    public static final ExecutorService LIZIZ;
    public static final C01GW LIZJ;
    public static final C01GW LIZLLL;
    public static final C01GW LJ;
    public static final C01GW LJFF;
    public static volatile int LJI;
    public static final C01GW LJII;
    public static final C01GW LJIIIIZZ;
    public static final C01GW LJIIIZ;

    static {
        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(C0WQX.SERIAL);
        c2123408ToLIZ.LIZIZ = "feed_insertion_executor";
        LIZIZ = C823050WQl.LIZ(c2123408ToLIZ.LIZ());
        LIZJ = C452501pT.LIZIZ(new C0T5N());
        LIZLLL = C452501pT.LIZIZ(new C740280T2c());
        LJ = C452501pT.LIZIZ(new C0T5O());
        LJFF = C452501pT.LIZIZ(new C0T34());
        LJII = C452501pT.LIZIZ(new C740290T2d());
        LJIIIIZZ = C452501pT.LIZIZ(new C740270T2b());
        LJIIIZ = C452501pT.LIZIZ(new C0T5P());
    }

    public static CopyOnWriteArrayList LIZLLL() {
        return (CopyOnWriteArrayList) LJ.getValue();
    }

    public static void LIZ(Aweme aweme) {
        String aid;
        List<Long> clientGidList;
        Long l;
        if (LIZLLL().isEmpty()) {
            return;
        }
        String requestId = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        long jLJ = LJ(aid);
        C01GW c01gw = LJFF;
        if (!((CopyOnWriteArrayList) c01gw.getValue()).contains(Long.valueOf(jLJ))) {
            ((CopyOnWriteArrayList) c01gw.getValue()).add(Long.valueOf(jLJ));
        }
        ConsistencyRspStruct consistencyRspStruct = (ConsistencyRspStruct) C13LP.LJJJJZI(LIZLLL());
        if (consistencyRspStruct != null && (clientGidList = consistencyRspStruct.getClientGidList()) != null && (l = (Long) C13LP.LJJLIIIJJI(clientGidList)) != null && jLJ == l.longValue()) {
            consistencyRspStruct.setClientGidList((CopyOnWriteArrayList) c01gw.getValue());
            consistencyRspStruct.setFinalGidList((CopyOnWriteArrayList) c01gw.getValue());
            if (aweme != null) {
                requestId = aweme.getRequestId();
            }
            LJI(consistencyRspStruct, requestId, false);
            C19719612Di.LJJIIZ(LIZLLL());
            ((CopyOnWriteArrayList) c01gw.getValue()).clear();
        }
    }

    public static void LIZIZ(Callable callable) {
        C15O7.LIZIZ(callable, LIZIZ, null);
    }

    public static long LJ(String str) {
        if (str != null) {
            try {
                return CastLongProtector.parseLong(str);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                C741070T5d.LIZ.getClass();
                long jCharAt = -3750763034362895579L;
                for (int i = 0; i < str.length(); i++) {
                    jCharAt = (jCharAt ^ ((long) str.charAt(i))) * C741070T5d.LJ;
                }
                return jCharAt;
            }
        }
        return 0L;
    }

    public static final void LJII(String str, List list) {
        if (list == null) {
            return;
        }
        C741070T5d.LIZ.getClass();
        if (!C13LP.LJJJJ(str, C741070T5d.LIZIZ) && !C13LP.LJJJJ(str, C741070T5d.LIZJ)) {
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Aweme aweme = (Aweme) it2.next();
            String str2 = "";
            if (aweme.getCardInsertInfo() == null) {
                CardInsertInfo cardInsertInfo = new CardInsertInfo(0, 0L, "", 0, 0, null, "");
                cardInsertInfo.setCardSource(3);
                if (str != null) {
                    str2 = str;
                }
                cardInsertInfo.setDiffType(str2);
                aweme.setCardInsertInfo(cardInsertInfo);
            } else {
                CardInsertInfo cardInsertInfo2 = aweme.getCardInsertInfo();
                cardInsertInfo2.setCardSource(3);
                if (str != null) {
                    str2 = str;
                }
                cardInsertInfo2.setDiffType(str2);
            }
        }
    }

    public static ConsistencyGroupStruct LIZJ(long j, String str, String str2) {
        int i;
        HashMap<String, String> groupExtraInfo;
        ConsistencyGroupStruct consistencyGroupStruct = new ConsistencyGroupStruct();
        C741070T5d.LIZ.getClass();
        if (C13LP.LJJJJ(str2, C741070T5d.LIZIZ)) {
            i = 9;
        } else if (C13LP.LJJJJ(str2, C741070T5d.LIZJ)) {
            i = 10;
        } else {
            i = -1;
        }
        consistencyGroupStruct.setConsistencyVideoType(Integer.valueOf(i));
        if (Intrinsics.LJFF(str2, "ad_rerank")) {
            consistencyGroupStruct.setRerankReason(str2);
            consistencyGroupStruct.getRerankReasonList().add(str2);
        } else {
            consistencyGroupStruct.setProvideReason(str2);
            consistencyGroupStruct.setProvideStage(4);
            if (str != null && !Intrinsics.LJFF(str, String.valueOf(j)) && (groupExtraInfo = consistencyGroupStruct.getGroupExtraInfo()) != null) {
                groupExtraInfo.put("client_origin_id", str);
                return consistencyGroupStruct;
            }
        }
        return consistencyGroupStruct;
    }

    public static final void LJFF(final Aweme aweme, final String str, final String str2) {
        if (aweme != null) {
            LJII(str, Collections.singletonList(aweme));
        }
        if (C1241504tR.LIZ() && str2 != null && !TextUtils.isEmpty(str2)) {
            C0T5M c0t5m = LIZ;
            Callable callable = new Callable() { // from class: X.0T5L
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ConsistencyGroupStruct consistencyGroupStruct;
                    C1C7U.LIZ("InsertionDataRepository@5e2f.record$3");
                    C0T5M.LIZ.getClass();
                    ConsistencyRspStruct consistencyRspStruct = (ConsistencyRspStruct) ((ConcurrentHashMap) C0T5M.LIZJ.getValue()).get(str2);
                    Object objPut = null;
                    if (consistencyRspStruct != null) {
                        Aweme aweme2 = aweme;
                        String str3 = str;
                        long jLJ = C0T5M.LJ(aweme2 != null ? aweme2.getAid() : null);
                        HashMap<Long, ConsistencyGroupStruct> consistencyGroups = consistencyRspStruct.getConsistencyGroups();
                        if (consistencyGroups == null || !consistencyGroups.containsKey(Long.valueOf(jLJ))) {
                            ConsistencyGroupStruct consistencyGroupStructLIZJ = C0T5M.LIZJ(jLJ, aweme2 != null ? aweme2.getAid() : null, str3);
                            HashMap<Long, ConsistencyGroupStruct> consistencyGroups2 = consistencyRspStruct.getConsistencyGroups();
                            if (consistencyGroups2 != null) {
                                objPut = consistencyGroups2.put(Long.valueOf(jLJ), consistencyGroupStructLIZJ);
                            }
                        } else {
                            HashMap<Long, ConsistencyGroupStruct> consistencyGroups3 = consistencyRspStruct.getConsistencyGroups();
                            if (consistencyGroups3 != null && (consistencyGroupStruct = consistencyGroups3.get(Long.valueOf(jLJ))) != null) {
                                consistencyGroupStruct.setDeleteStage(4);
                                consistencyGroupStruct.setDeleteReason(str3);
                                objPut = Unit.LIZ;
                            }
                        }
                    }
                    C1C7U.LIZIZ("InsertionDataRepository@5e2f.record$3");
                    return objPut;
                }
            };
            c0t5m.getClass();
            LIZIZ(callable);
        }
    }

    public static void LJI(ConsistencyRspStruct consistencyRspStruct, String str, boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 1;
        }
        try {
            consistencyRspStruct.setRspType(i);
            String strLJIILL = C7740030o.LIZ().getGson().LJIILL(consistencyRspStruct);
            if (strLJIILL != null && a0.LJLIIIL(strLJIILL).toString().length() != 0) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("video_consistency", strLJIILL);
                c2344009Gk.LIZLLL(System.currentTimeMillis(), "mob_time");
                c2344009Gk.LJIIIIZZ("request_id", str);
                C20684815ws.LJIILLIIL("video_consistency_event", c2344009Gk.LIZ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void LJIIIIZZ(ConsistencyRspStruct consistencyRspStruct, String str, boolean z) {
        if (C1241504tR.LIZ() && consistencyRspStruct != null && str != null) {
            if (z) {
                LIZ.getClass();
                ((CopyOnWriteArraySet) LJIIIZ.getValue()).add(str);
            } else {
                LIZ.getClass();
                C01GW c01gw = LJIIIZ;
                if (((CopyOnWriteArraySet) c01gw.getValue()).contains(str)) {
                    ((CopyOnWriteArraySet) c01gw.getValue()).remove(str);
                }
            }
            LIZ.getClass();
            C01GW c01gw2 = LIZLLL;
            if (((CopyOnWriteArrayList) c01gw2.getValue()).contains(str)) {
                return;
            }
            ((CopyOnWriteArrayList) c01gw2.getValue()).add(str);
            ((ConcurrentHashMap) LIZJ.getValue()).put(str, consistencyRspStruct);
        }
    }

    public static final void LJIIIZ(int i, Aweme aweme, String str) {
        if (!C1241504tR.LIZ() || !Intrinsics.LJFF("homepage_hot", str)) {
            return;
        }
        if (i <= LJI) {
            if (i == 0) {
                i = 0;
            } else {
                return;
            }
        }
        LJI = i;
        C0T5M c0t5m = LIZ;
        ACallableS418S0100000_11 aCallableS418S0100000_11 = new ACallableS418S0100000_11(aweme, 1);
        c0t5m.getClass();
        LIZIZ(aCallableS418S0100000_11);
    }
}

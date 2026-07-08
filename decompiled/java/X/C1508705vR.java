package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.05vR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1508705vR implements InterfaceC15414061s {
    public static String LLILZ;
    public static long LLJILJIL;
    public static long LLJILJILJ;
    public static int LLJILLL;
    public static AnonymousClass0956 LLJJ;
    public static final C1508705vR LL = new C1508705vR();
    public static final C054G LLILLJJLI = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public static final Set<String> LLILLL = new LinkedHashSet();
    public static final Set<Long> LLILZIL = new LinkedHashSet();
    public static final Set<Long> LLILZLL = new LinkedHashSet();
    public static final Set<String> LLIZ = new LinkedHashSet();
    public static final Set<String> LLIZLLLIL = new LinkedHashSet();
    public static final Set<String> LLJ = new LinkedHashSet();
    public static final Set<String> LLJI = new LinkedHashSet();
    public static final Map<String, Long> LLJIJIL = new LinkedHashMap();

    @Override // X.InterfaceC15414061s
    public final void Ap2(List<IMAIBotInfo> list) {
    }

    public static Map LIZJ() {
        return C2097908Jt.LIZJ(new Pair("assistant_mode", C15390060u.LL.LJJIIZI() ? "fully_managed" : "topic_managed"));
    }

    public final void LJIIIZ() {
        LLJILJILJ = 0L;
        LLJILJIL = 0L;
        C15408061m.LIZ.getClass();
        C15407061l c15407061l = C15408061m.LIZIZ;
        synchronized (c15407061l.LLILZIL) {
            try {
                ((ArrayList) c15407061l.LLILZIL).remove(this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static String LIZIZ(C0Y8T c0y8t) {
        if (c0y8t.isGroupChat()) {
            if (C1229100i5c.LJII(c0y8t.getConversationId())) {
                return "fan_group";
            }
            return "group";
        }
        if (c0y8t.isSingleChat()) {
            if (C0YNP.LJI(c0y8t.getConversationId()) == 5) {
                return "aiasst";
            }
            if (c0y8t.isStranger()) {
                return "stranger";
            }
            return "private";
        }
        return "";
    }

    public static void LJIIJ(C1508405vO c1508405vO) {
        String strValueOf;
        String strValueOf2;
        Pair[] pairArr = new Pair[4];
        long j = c1508405vO.LIZLLL - c1508405vO.LIZ;
        String strValueOf3 = "-1";
        if (j < 0) {
            strValueOf = "-1";
        } else {
            strValueOf = String.valueOf(j);
        }
        pairArr[0] = new Pair("total_duration", strValueOf);
        long j2 = c1508405vO.LIZIZ - c1508405vO.LIZ;
        if (j2 < 0) {
            strValueOf2 = "-1";
        } else {
            strValueOf2 = String.valueOf(j2);
        }
        pairArr[1] = new Pair("intent_duration", strValueOf2);
        long j3 = c1508405vO.LIZJ - c1508405vO.LIZ;
        if (j3 >= 0) {
            strValueOf3 = String.valueOf(j3);
        }
        pairArr[2] = new Pair("suggest_duration", strValueOf3);
        pairArr[3] = new Pair("error_msg", String.valueOf(c1508405vO.LJ));
        LIZLLL("ttsocial_im_suggested_replies_perf", C2097608Jq.LJIIIIZZ(pairArr));
    }

    @Override // X.InterfaceC15414061s
    public final void ez0(List<IMAIBotInfo> list) {
        Object next;
        long j;
        Iterator it2 = ((ArrayList) list).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((IMAIBotInfo) next).scene == LLJILLL) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        IMAIBotInfo iMAIBotInfo = (IMAIBotInfo) next;
        if (iMAIBotInfo == null) {
            return;
        }
        long j2 = 0;
        if (iMAIBotInfo.status == C062E.BOT_STATUS_WORKING.getValue()) {
            AnonymousClass0956 anonymousClass0956 = LLJJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            if (LLJILJILJ > 0) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = LLJILJILJ;
                long j4 = jElapsedRealtime - j3;
                long j5 = LLJILJIL;
                if (j5 > 0) {
                    j = j3 - j5;
                } else {
                    j = 0;
                }
                LJI(j4, j, String.valueOf(iMAIBotInfo.id), String.valueOf(LLJILLL), "success");
                LLJILJILJ = 0L;
                LLJILJIL = 0L;
                C15408061m.LIZ.getClass();
                C15407061l c15407061l = C15408061m.LIZIZ;
                synchronized (c15407061l.LLILZIL) {
                    try {
                        ((ArrayList) c15407061l.LLILZIL).remove(this);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return;
            }
            return;
        }
        if (iMAIBotInfo.status == C062E.BOT_STATUS_FAILED.getValue()) {
            AnonymousClass0956 anonymousClass09562 = LLJJ;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
            if (LLJILJILJ > 0) {
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                long j6 = LLJILJILJ;
                long j7 = jElapsedRealtime2 - j6;
                long j8 = LLJILJIL;
                if (j8 > 0) {
                    j2 = j6 - j8;
                }
                LJI(j7, j2, String.valueOf(iMAIBotInfo.id), String.valueOf(LLJILLL), "fail");
                LJIIIZ();
            }
        }
    }

    public static void LIZLLL(String str, Map map) {
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL(str, map);
    }

    public static void LJ(List list, List list2) {
        if (!list.isEmpty() && !list2.isEmpty()) {
            C23250099c.LIZLLL(LLILLJJLI, null, null, new C1498005ti(list, list2, null), 3);
        }
    }

    public static void LJII(long j, String str, String str2) {
        C23250099c.LIZLLL(LLILLJJLI, null, null, new C1497805tg(str, j, str2, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List<? extends X.C869590Y9l> r19, java.util.List<? extends X.C869590Y9l> r20, X.InterfaceC1364105Vn<? super kotlin.Unit> r21) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1508705vR.LIZ(java.util.List, java.util.List, X.05Vn):java.lang.Object");
    }

    public static Unit LJFF(C869590Y9l c869590Y9l, C869590Y9l c869590Y9l2, long j, Map map) {
        long jLongValue;
        long jLongValue2;
        String strValueOf;
        String strValueOf2;
        Long lLJIILIIL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("total_duration", String.valueOf(j));
        linkedHashMap.put("message_id", String.valueOf(c869590Y9l.getMsgId()));
        linkedHashMap.put("message_type", String.valueOf(c869590Y9l.getMsgType()));
        String str = c869590Y9l.getExt().get("a:src");
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("message_src", str);
        linkedHashMap.put("set_by", C0ZDX.LJIILIIL(c869590Y9l));
        LL.getClass();
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) LLJIJIL;
        Long l = (Long) linkedHashMap2.get(c869590Y9l2.getUuid());
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        String str2 = c869590Y9l2.getLocalExt().get("send_sdk_time");
        if (str2 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str2)) != null) {
            jLongValue2 = lLJIILIIL.longValue();
        } else {
            jLongValue2 = 0;
        }
        long j2 = jLongValue - jLongValue2;
        if (j2 > 0 && (strValueOf2 = String.valueOf(j2)) != null) {
            linkedHashMap.put("send_message_duration", strValueOf2);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        Long l2 = (Long) linkedHashMap2.get(c869590Y9l2.getUuid());
        if (l2 != null) {
            long jLongValue3 = l2.longValue();
            if (jLongValue3 > 0) {
                long j3 = jUptimeMillis - jLongValue3;
                if (j3 > 0 && (strValueOf = String.valueOf(j3)) != null) {
                    linkedHashMap.put("reply_message_duration", strValueOf);
                }
            }
        }
        linkedHashMap.putAll(map);
        LIZLLL("im_auto_reply_message_perf", linkedHashMap);
        return Unit.LIZ;
    }

    public static void LJI(long j, long j2, String str, String str2, String str3) {
        C23250099c.LIZLLL(LLILLJJLI, null, null, new C1497905th(str, str2, str3, j, j2, null), 3);
    }

    public static void LJIIIIZZ(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        C23250099c.LIZLLL(LLILLJJLI, null, null, new C1498805tq(str, str2, str3, str4, str5, str6, str7, str8, str9, null), 3);
    }
}

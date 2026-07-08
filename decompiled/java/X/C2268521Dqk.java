package X;

import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionClickInfo;
import com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionDetailOpenInfo;
import com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionInfo;
import com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionOpenPageInfo;
import com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionPlayInfo;
import com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionShowInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS325S0000000_35;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1Dqk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2268521Dqk implements InterfaceC1023010cjD {
    public final Map<String, SessionInfo> LIZIZ;
    public final ConcurrentHashMap<String, String> LIZJ;
    public final List<InterfaceC2268481Dqg> LIZLLL;

    public C2268521Dqk() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ads_");
        sbLIZ.append(C2268521Dqk.class.getSimpleName());
        C2188811AlT.LIZIZ(sbLIZ);
        this.LIZIZ = new LinkedHashMap();
        this.LIZJ = new ConcurrentHashMap<>();
        this.LIZLLL = C1697810uHb.LJIIJJI(new InterfaceC2268481Dqg() { // from class: X.1Dqj
            @Override // X.InterfaceC2268481Dqg
            public final void LIZ(C2268501Dqi c2268501Dqi, C1024210cl9 c1024210cl9, Map map) {
                boolean z;
                SessionShowInfo sessionShowInfo;
                SessionClickInfo sessionClickInfo;
                SessionShowInfo sessionShowInfo2;
                SessionClickInfo sessionClickInfo2;
                SessionShowInfo sessionShowInfo3;
                C2268551Dqn c2268551Dqn;
                Long lValueOf;
                String str;
                String str2;
                SessionClickInfo sessionClickInfo3;
                Long lValueOf2;
                String str3;
                String str4;
                SessionInfo sessionInfo = c2268501Dqi.LIZ;
                if (sessionInfo != null) {
                    SessionInfo sessionInfo2 = c2268501Dqi.LIZIZ;
                    String str5 = c1024210cl9.LIZ;
                    Set<String> set = C1022540ciS.LIZ;
                    if (!set.contains(str5) && !Intrinsics.LJFF(str5, "resume") && !Intrinsics.LJFF(str5, "break") && !Intrinsics.LJFF(str5, "container_close")) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        String eventType = C2268531Dql.LIZ(c1024210cl9.LIZ).getEventType();
                        if (Intrinsics.LJFF(eventType, "session_event_type_generate")) {
                            SessionShowInfo sessionShowInfo4 = sessionInfo2.showSession;
                            if (sessionShowInfo4 != null) {
                                sessionClickInfo3 = sessionShowInfo4.LJFF;
                            } else {
                                sessionClickInfo3 = null;
                            }
                            if (sessionClickInfo3 != null) {
                                lValueOf2 = Long.valueOf(sessionClickInfo3.timeStamp);
                                str3 = sessionClickInfo3.clickTag;
                                str4 = sessionClickInfo3.clickRefer;
                            } else {
                                lValueOf2 = null;
                                str3 = null;
                                str4 = null;
                            }
                            c2268551Dqn = new C2268551Dqn(lValueOf2, str3, str4);
                        } else if (Intrinsics.LJFF(eventType, "session_event_type_destroy") && (sessionShowInfo3 = sessionInfo.showSession) != null) {
                            SessionClickInfo sessionClickInfo4 = sessionShowInfo3.clickSession;
                            if (sessionClickInfo4 == null) {
                                sessionClickInfo4 = sessionShowInfo3.LJFF;
                            }
                            if (sessionClickInfo4 != null) {
                                lValueOf = Long.valueOf(sessionClickInfo4.timeStamp);
                                str = sessionClickInfo4.clickTag;
                                str2 = sessionClickInfo4.clickRefer;
                            } else {
                                lValueOf = null;
                                str = null;
                                str2 = null;
                            }
                            c2268551Dqn = new C2268551Dqn(lValueOf, str, str2);
                            SessionShowInfo sessionShowInfo5 = sessionInfo.showSession;
                            if (sessionShowInfo5 != null) {
                                sessionShowInfo5.LJFF = null;
                            }
                            SessionShowInfo sessionShowInfo6 = sessionInfo2.showSession;
                            if (sessionShowInfo6 != null) {
                                sessionShowInfo6.LJFF = null;
                            }
                        }
                        Long l = c2268551Dqn.LIZ;
                        String str6 = c2268551Dqn.LIZIZ;
                        String str7 = c2268551Dqn.LIZJ;
                        if (l != null) {
                            Long lValueOf3 = Long.valueOf(c1024210cl9.LJI - l.longValue());
                            if (lValueOf3.longValue() > 0) {
                                map.put("time_interval_between_current_and_click", Long.valueOf(lValueOf3.longValue()));
                                if (str6 != null) {
                                    map.put("last_click_tag", str6);
                                }
                                if (str7 != null) {
                                    map.put("last_click_refer", str7);
                                }
                            }
                        }
                    }
                    if (set.contains(c1024210cl9.LIZ) && (sessionShowInfo2 = sessionInfo2.showSession) != null && (sessionClickInfo2 = sessionShowInfo2.clickSession) != null) {
                        Long lValueOf4 = Long.valueOf(sessionClickInfo2.LIZ);
                        if (lValueOf4.longValue() > 0) {
                            map.put("time_fast_click", Long.valueOf(lValueOf4.longValue()));
                        }
                    }
                    if (Intrinsics.LJFF(c1024210cl9.LIZ, "otherclick") && (sessionShowInfo = sessionInfo2.showSession) != null && (sessionClickInfo = sessionShowInfo.otherClickSession) != null) {
                        Long lValueOf5 = Long.valueOf(sessionClickInfo.LIZ);
                        if (lValueOf5.longValue() > 0) {
                            map.put("time_fast_click", Long.valueOf(lValueOf5.longValue()));
                        }
                    }
                    if (!set.contains(c1024210cl9.LIZ)) {
                        SessionShowInfo sessionShowInfo7 = sessionInfo.showSession;
                        if (sessionShowInfo7 != null) {
                            sessionShowInfo7.lastClickSession = null;
                        }
                        SessionShowInfo sessionShowInfo8 = sessionInfo2.showSession;
                        if (sessionShowInfo8 != null) {
                            sessionShowInfo8.lastClickSession = null;
                        }
                    }
                }
            }
        }, new InterfaceC2268481Dqg() { // from class: X.1Dqf
            /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static long LIZIZ(com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionShowInfo r7) {
                /*
                    r6 = 0
                    if (r7 == 0) goto L38
                    com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionOpenPageInfo r0 = r7.openPageSession
                    if (r0 == 0) goto L34
                    long r0 = r0.timeStamp
                    java.lang.Long r5 = java.lang.Long.valueOf(r0)
                Ld:
                    java.lang.Long r6 = r7.LJII
                Lf:
                    r3 = 0
                    if (r5 == 0) goto L25
                    long r1 = r5.longValue()
                    int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r0 == 0) goto L25
                    long r2 = r5.longValue()
                L1f:
                    long r0 = java.lang.System.currentTimeMillis()
                    long r0 = r0 - r2
                    return r0
                L25:
                    if (r6 == 0) goto L38
                    long r1 = r6.longValue()
                    int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r0 == 0) goto L38
                    long r2 = r6.longValue()
                    goto L1f
                L34:
                    r5 = r6
                    if (r7 == 0) goto Lf
                    goto Ld
                L38:
                    long r2 = java.lang.System.currentTimeMillis()
                    goto L1f
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2268471Dqf.LIZIZ(com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionShowInfo):long");
            }

            @Override // X.InterfaceC2268481Dqg
            public final void LIZ(C2268501Dqi c2268501Dqi, C1024210cl9 c1024210cl9, Map map) {
                Long lValueOf;
                SessionOpenPageInfo sessionOpenPageInfo;
                SessionOpenPageInfo sessionOpenPageInfo2;
                String str;
                SessionOpenPageInfo sessionOpenPageInfo3;
                SessionShowInfo sessionShowInfo;
                SessionInfo sessionInfo = c2268501Dqi.LIZIZ;
                if (((Boolean) C2268541Dqm.LIZ.invoke(sessionInfo)).booleanValue() && C1022540ciS.LIZ.contains(c1024210cl9.LIZ) && !a0.LJJIIZI("slide", c1024210cl9.LJ, false) && (sessionShowInfo = sessionInfo.showSession) != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Long l = sessionShowInfo.LJII;
                    if (l == null || l.longValue() + ((long) LSPassThroughRecordSizeConfig.DEFAULT) < jCurrentTimeMillis) {
                        sessionShowInfo.LJI = "click";
                        sessionShowInfo.LJII = Long.valueOf(jCurrentTimeMillis);
                    }
                }
                if (C13LQ.LJLIIL(new String[]{"landing_page_open", "landing_page_exposure", "load_finish"}).contains(c1024210cl9.LIZ)) {
                    String str2 = c1024210cl9.LIZ;
                    int iHashCode = str2.hashCode();
                    if (iHashCode != -743401972) {
                        if (iHashCode != 1021149650) {
                            if (iHashCode == 1463014543 && str2.equals("landing_page_exposure")) {
                                SessionShowInfo sessionShowInfo2 = sessionInfo.showSession;
                                if (sessionShowInfo2 == null || (sessionOpenPageInfo3 = sessionShowInfo2.openPageSession) == null || (str = sessionOpenPageInfo3.source) == null) {
                                    str = "page_show_1px";
                                }
                                map.put("source", str);
                                map.put("page_open_duration", Long.valueOf(LIZIZ(sessionInfo.showSession)));
                                return;
                            }
                            return;
                        }
                        if (!str2.equals("landing_page_open")) {
                            return;
                        }
                        SessionShowInfo sessionShowInfo3 = sessionInfo.showSession;
                        String str3 = null;
                        if (sessionShowInfo3 != null && (sessionOpenPageInfo2 = sessionShowInfo3.openPageSession) != null) {
                            lValueOf = Long.valueOf(sessionOpenPageInfo2.timeStamp);
                        } else {
                            lValueOf = null;
                        }
                        SessionShowInfo sessionShowInfo4 = sessionInfo.showSession;
                        if (sessionShowInfo4 != null && (sessionOpenPageInfo = sessionShowInfo4.openPageSession) != null) {
                            str3 = sessionOpenPageInfo.source;
                        }
                        if (lValueOf == null || str3 == null) {
                            return;
                        }
                        long jLongValue = lValueOf.longValue();
                        map.put("source", str3);
                        map.put("open_time_stamp", Long.valueOf(jLongValue));
                        return;
                    }
                    if (!str2.equals("load_finish")) {
                        return;
                    }
                    C1E1U.LIZ.getClass();
                    map.put(C1E1U.LIZIZ.LIZ, Long.valueOf(LIZIZ(sessionInfo.showSession)));
                }
            }
        }, new InterfaceC2268481Dqg() { // from class: X.1Dqh
            @Override // X.InterfaceC2268481Dqg
            public final void LIZ(C2268501Dqi c2268501Dqi, C1024210cl9 c1024210cl9, Map map) {
                long jCurrentTimeMillis;
                SessionDetailOpenInfo sessionDetailOpenInfo;
                SessionShowInfo sessionShowInfo;
                SessionDetailOpenInfo sessionDetailOpenInfo2;
                SessionShowInfo sessionShowInfo2;
                SessionInfo sessionInfo = c2268501Dqi.LIZ;
                if (sessionInfo != null) {
                    if (Intrinsics.LJFF(c1024210cl9.LJFF, "result_ad") || ((sessionShowInfo2 = sessionInfo.showSession) != null && sessionShowInfo2.openSearchDetailSession != null)) {
                        String str = c1024210cl9.LIZ;
                        int iHashCode = str.hashCode();
                        if (iHashCode != 94001407) {
                            if (iHashCode != 994040161) {
                                if (iHashCode != 1425909671 || !str.equals("search_return")) {
                                    return;
                                }
                            } else {
                                if (!str.equals("search_detail_open") || (sessionShowInfo = sessionInfo.showSession) == null || (sessionDetailOpenInfo2 = sessionShowInfo.openSearchDetailSession) == null) {
                                    return;
                                }
                                map.put("open_time_stamp", Long.valueOf(sessionDetailOpenInfo2.timeStamp));
                                return;
                            }
                        } else if (!str.equals("break")) {
                            return;
                        }
                        SessionShowInfo sessionShowInfo3 = sessionInfo.showSession;
                        if (sessionShowInfo3 != null && (sessionDetailOpenInfo = sessionShowInfo3.openSearchDetailSession) != null) {
                            jCurrentTimeMillis = sessionDetailOpenInfo.timeStamp;
                        } else {
                            jCurrentTimeMillis = System.currentTimeMillis();
                        }
                        map.put("search_detail_open_duration", Long.valueOf(c1024210cl9.LJI - jCurrentTimeMillis));
                    }
                }
            }
        });
    }

    @Override // X.InterfaceC1023010cjD
    public final synchronized SessionInfo LIZIZ(String str) {
        return (SessionInfo) ((LinkedHashMap) this.LIZIZ).get(str);
    }

    @Override // X.InterfaceC1023010cjD
    public final void LIZJ(String str) {
        try {
            this.LIZJ.remove(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
    }

    public static SessionInfo LJFF(SessionInfo sessionInfo, C1024210cl9 c1024210cl9) {
        Pair pair;
        Pair pair2;
        Pair pair3;
        Pair pair4;
        Pair pair5;
        long jLongValue;
        Pair pair6;
        SessionShowInfo sessionShowInfoLIZ;
        Pair pair7;
        Pair pair8;
        if (sessionInfo == null) {
            if (!(C2268531Dql.LIZ(c1024210cl9.LIZ) instanceof C2268621Dqu)) {
                return null;
            }
            return new SessionInfo(C1024210cl9.LIZ(), null, c1024210cl9.LIZIZ, 0);
        }
        InterfaceC2268711Dr3 interfaceC2268711Dr3LIZ = C2268531Dql.LIZ(c1024210cl9.LIZ);
        if (!(interfaceC2268711Dr3LIZ instanceof C2268621Dqu)) {
            if (interfaceC2268711Dr3LIZ instanceof C2268581Dqq) {
                int i = sessionInfo.LIZIZ + 1;
                sessionInfo.LIZIZ = i;
                return SessionInfo.LIZ(sessionInfo, new SessionShowInfo(i, c1024210cl9.LJI, null, null, null, null, null, null, 0, 0, 0, 0, 0), 13);
            }
            if (interfaceC2268711Dr3LIZ instanceof C2268591Dqr) {
                if (((Boolean) C2268541Dqm.LIZ.invoke(sessionInfo)).booleanValue()) {
                    return SessionInfo.LIZ(sessionInfo, null, 13);
                }
            } else if (interfaceC2268711Dr3LIZ instanceof C2268661Dqy) {
                if (((Boolean) C2268541Dqm.LIZ.invoke(sessionInfo)).booleanValue() && (pair8 = (Pair) C2268541Dqm.LJI.invoke(sessionInfo)) != null) {
                    AFwS325S0000000_35 aFwS325S0000000_35 = C2268541Dqm.LJII;
                    Object first = pair8.getFirst();
                    SessionShowInfo sessionShowInfo = (SessionShowInfo) pair8.getSecond();
                    int i2 = sessionShowInfo.LIZ + 1;
                    sessionShowInfo.LIZ = i2;
                    return (SessionInfo) aFwS325S0000000_35.invoke(first, SessionShowInfo.LIZ(sessionShowInfo, new SessionPlayInfo(i2, c1024210cl9.LJI), null, null, null, null, null, 8187));
                }
            } else if (interfaceC2268711Dr3LIZ instanceof C2268651Dqx) {
                if (((Boolean) C2268541Dqm.LIZ.invoke(sessionInfo)).booleanValue() && (pair7 = (Pair) C2268541Dqm.LJI.invoke(sessionInfo)) != null) {
                    if (((Boolean) C2268541Dqm.LIZIZ.invoke(pair7.getSecond())).booleanValue()) {
                        return (SessionInfo) C2268541Dqm.LJII.invoke(pair7.getFirst(), SessionShowInfo.LIZ((SessionShowInfo) pair7.getSecond(), null, null, null, null, null, null, 8187));
                    }
                }
            } else if (interfaceC2268711Dr3LIZ instanceof C2268601Dqs) {
                if (((Boolean) C2268541Dqm.LIZ.invoke(sessionInfo)).booleanValue() && (pair6 = (Pair) C2268541Dqm.LJI.invoke(sessionInfo)) != null) {
                    AFwS325S0000000_35 aFwS325S0000000_352 = C2268541Dqm.LJII;
                    Object first2 = pair6.getFirst();
                    SessionShowInfo sessionShowInfo2 = (SessionShowInfo) pair6.getSecond();
                    long j = sessionShowInfo2.timeStamp;
                    SessionClickInfo sessionClickInfo = sessionShowInfo2.clickSession;
                    if (sessionClickInfo == null) {
                        sessionClickInfo = sessionShowInfo2.LJFF;
                    }
                    if (C1022540ciS.LIZ.contains(c1024210cl9.LIZ)) {
                        int i3 = sessionShowInfo2.LIZIZ + 1;
                        sessionShowInfo2.LIZIZ = i3;
                        String str = c1024210cl9.LJ;
                        String str2 = c1024210cl9.LJFF;
                        long j2 = c1024210cl9.LJI;
                        sessionShowInfoLIZ = SessionShowInfo.LIZ(sessionShowInfo2, null, new SessionClickInfo(i3, i3, str, str2, j2, j2 - j), null, null, null, sessionClickInfo, 8055);
                        sessionShowInfoLIZ.LJFF = sessionClickInfo;
                    } else {
                        int i4 = sessionShowInfo2.LIZJ + 1;
                        sessionShowInfo2.LIZJ = i4;
                        int i5 = sessionShowInfo2.LIZIZ;
                        String str3 = c1024210cl9.LJ;
                        String str4 = c1024210cl9.LJFF;
                        long j3 = c1024210cl9.LJI;
                        sessionShowInfoLIZ = SessionShowInfo.LIZ(sessionShowInfo2, null, null, new SessionClickInfo(i4, i5, str3, str4, j3, j3 - j), null, null, null, 8175);
                        sessionShowInfoLIZ.LJFF = sessionClickInfo;
                    }
                    return (SessionInfo) aFwS325S0000000_352.invoke(first2, sessionShowInfoLIZ);
                }
            } else if (!(interfaceC2268711Dr3LIZ instanceof C2268681Dr0) && !(interfaceC2268711Dr3LIZ instanceof C2268671Dqz)) {
                String str5 = "";
                if (interfaceC2268711Dr3LIZ instanceof C2268631Dqv) {
                    if (((Boolean) C2268541Dqm.LIZ.invoke(sessionInfo)).booleanValue() && (pair5 = (Pair) C2268541Dqm.LJI.invoke(sessionInfo)) != null) {
                        AFwS325S0000000_35 aFwS325S0000000_353 = C2268541Dqm.LJII;
                        Object first3 = pair5.getFirst();
                        SessionShowInfo sessionShowInfo3 = (SessionShowInfo) pair5.getSecond();
                        String str6 = sessionShowInfo3.LJI;
                        if (str6 != null) {
                            str5 = str6;
                        }
                        int i6 = sessionShowInfo3.LIZLLL + 1;
                        sessionShowInfo3.LIZLLL = i6;
                        Long l = sessionShowInfo3.LJII;
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        return (SessionInfo) aFwS325S0000000_353.invoke(first3, SessionShowInfo.LIZ(sessionShowInfo3, null, null, null, new SessionOpenPageInfo(str5, i6, jLongValue), null, null, 8159));
                    }
                } else if (interfaceC2268711Dr3LIZ instanceof C2268611Dqt) {
                    if (((Boolean) C2268541Dqm.LIZ.invoke(sessionInfo)).booleanValue() && (pair4 = (Pair) C2268541Dqm.LJI.invoke(sessionInfo)) != null) {
                        if (((Boolean) C2268541Dqm.LJ.invoke(pair4.getSecond())).booleanValue()) {
                            return (SessionInfo) C2268541Dqm.LJII.invoke(pair4.getFirst(), SessionShowInfo.LIZ((SessionShowInfo) pair4.getSecond(), null, null, null, null, null, null, 8159));
                        }
                    }
                } else if (interfaceC2268711Dr3LIZ instanceof C2268561Dqo) {
                    if (((Boolean) C2268541Dqm.LIZ.invoke(sessionInfo)).booleanValue() && (pair3 = (Pair) C2268541Dqm.LJI.invoke(sessionInfo)) != null) {
                        AFwS325S0000000_35 aFwS325S0000000_354 = C2268541Dqm.LJII;
                        Object first4 = pair3.getFirst();
                        SessionShowInfo sessionShowInfo4 = (SessionShowInfo) pair3.getSecond();
                        int i7 = sessionShowInfo4.LIZLLL + 1;
                        sessionShowInfo4.LIZLLL = i7;
                        return (SessionInfo) aFwS325S0000000_354.invoke(first4, SessionShowInfo.LIZ(sessionShowInfo4, null, null, null, null, new SessionDetailOpenInfo("", i7, c1024210cl9.LJI), null, 8127));
                    }
                } else if (interfaceC2268711Dr3LIZ instanceof C2268571Dqp) {
                    if (((Boolean) C2268541Dqm.LIZ.invoke(sessionInfo)).booleanValue() && (pair2 = (Pair) C2268541Dqm.LJI.invoke(sessionInfo)) != null) {
                        if (((Boolean) C2268541Dqm.LJFF.invoke(pair2.getSecond())).booleanValue()) {
                            return (SessionInfo) C2268541Dqm.LJII.invoke(pair2.getFirst(), SessionShowInfo.LIZ((SessionShowInfo) pair2.getSecond(), null, null, null, null, null, null, 8127));
                        }
                    }
                } else {
                    if ((interfaceC2268711Dr3LIZ instanceof C2268701Dr2) || (interfaceC2268711Dr3LIZ instanceof C2268691Dr1)) {
                        return sessionInfo;
                    }
                    if (!(interfaceC2268711Dr3LIZ instanceof C2268641Dqw)) {
                        throw new C1954807lC();
                    }
                }
            } else if (((Boolean) C2268541Dqm.LIZ.invoke(sessionInfo)).booleanValue() && (pair = (Pair) C2268541Dqm.LJI.invoke(sessionInfo)) != null) {
                Object second = pair.getSecond();
                if (((Boolean) C2268541Dqm.LIZJ.invoke(second)).booleanValue() || ((Boolean) C2268541Dqm.LIZLLL.invoke(second)).booleanValue()) {
                    return (SessionInfo) C2268541Dqm.LJII.invoke(pair.getFirst(), SessionShowInfo.LIZ((SessionShowInfo) pair.getSecond(), null, null, null, null, null, null, 8167));
                }
            }
        }
        return null;
    }

    @Override // X.InterfaceC1023010cjD
    public final void LIZLLL(String str, String str2) {
        try {
            this.LIZJ.put(str, str2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    @Override // X.InterfaceC1023010cjD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LJ(X.C1024210cl9 r8, X.C1024690clv r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L58
            r6.<init>()     // Catch: java.lang.Throwable -> L58
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionInfo> r1 = r7.LIZIZ     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = r8.LIZIZ     // Catch: java.lang.Throwable -> L58
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L58
            java.lang.Object r5 = r1.get(r0)     // Catch: java.lang.Throwable -> L58
            com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionInfo r5 = (com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionInfo) r5     // Catch: java.lang.Throwable -> L58
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r1 = r7.LIZJ     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = r8.LIZIZ     // Catch: java.lang.Throwable -> L58
            java.lang.Object r4 = r1.get(r0)     // Catch: java.lang.Throwable -> L58
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L58
            boolean r0 = r8.LIZIZ()     // Catch: java.lang.Throwable -> L58
            if (r0 != 0) goto L27
            r9.invoke(r5, r4, r6)     // Catch: java.lang.Throwable -> L58
            monitor-exit(r7)
            return
        L27:
            com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionInfo r3 = LJFF(r5, r8)     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L50
            X.1Dqi r2 = new X.1Dqi     // Catch: java.lang.Throwable -> L58
            r2.<init>(r5, r3)     // Catch: java.lang.Throwable -> L58
            java.util.List<X.1Dqg> r0 = r7.LIZLLL     // Catch: java.lang.Throwable -> L58
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L58
        L38:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r0 == 0) goto L48
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L58
            X.1Dqg r0 = (X.InterfaceC2268481Dqg) r0     // Catch: java.lang.Throwable -> L58
            r0.LIZ(r2, r8, r6)     // Catch: java.lang.Throwable -> L58
            goto L38
        L48:
            com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionInfo r0 = r7.LJI(r3, r8)     // Catch: java.lang.Throwable -> L58
            if (r0 == 0) goto L50
            r5 = r0
            goto L53
        L50:
            if (r5 != 0) goto L53
            r5 = 0
        L53:
            r9.invoke(r5, r4, r6)     // Catch: java.lang.Throwable -> L58
            monitor-exit(r7)
            return
        L58:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2268521Dqk.LJ(X.0cl9, X.0clv):void");
    }

    public final SessionInfo LJI(SessionInfo sessionInfo, C1024210cl9 c1024210cl9) {
        String str = c1024210cl9.LIZIZ;
        String eventType = C2268531Dql.LIZ(c1024210cl9.LIZ).getEventType();
        if (Intrinsics.LJFF(eventType, "session_event_type_generate")) {
            this.LIZIZ.put(str, sessionInfo);
            return sessionInfo;
        }
        if (Intrinsics.LJFF(eventType, "session_event_type_destroy")) {
            SessionInfo sessionInfo2 = (SessionInfo) ((LinkedHashMap) this.LIZIZ).get(str);
            this.LIZIZ.put(str, sessionInfo);
            return sessionInfo2;
        }
        return null;
    }

    @Override // X.InterfaceC1023010cjD
    public final void LIZ(final long j, final String str, final String str2) {
        ExecutorService logThreadPool;
        IAppLogDepend iAppLogDependLIZ = C2214471Bll.LIZ();
        if (iAppLogDependLIZ != null && (logThreadPool = iAppLogDependLIZ.getLogThreadPool()) != null) {
            logThreadPool.submit(new Runnable() { // from class: X.0dcZ
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    SessionShowInfo sessionShowInfo;
                    C1C7U.LIZ("AdSessionManager@5607.tryRecordPageOpenInfo$1");
                    try {
                        SessionInfo sessionInfo = (SessionInfo) ((LinkedHashMap) this.LL.LIZIZ).get(str);
                        if (sessionInfo != null && (sessionShowInfo = sessionInfo.showSession) != null) {
                            String str3 = str2;
                            long j2 = j;
                            Long l = sessionShowInfo.LJII;
                            if (l == null || l.longValue() + ((long) LSPassThroughRecordSizeConfig.DEFAULT) < j2) {
                                sessionShowInfo.LJI = str3;
                                sessionShowInfo.LJII = Long.valueOf(j2);
                            }
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AdSessionManager@5607.tryRecordPageOpenInfo$1");
                }
            });
        }
    }
}

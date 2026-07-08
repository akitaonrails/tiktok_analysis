package X;

import Y.AfS132S0000000_7;
import Y.AfS176S0100000_7;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayFullLinkPerfSendExp;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveFullLinkQuickScrollFixSetting;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0IX5, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IX5 {
    public static InterfaceC2453409jQ<Map<EnumC1087640ePS, Long>> LJFF;
    public static Function1<? super String, C0IX8> LJI;
    public static InterfaceC2453409jQ<Long> LJII;
    public static final C0IX5 LIZ = new C0IX5();
    public static final ConcurrentHashMap<Long, C468020IWy> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, C468020IWy> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Long, String> LIZLLL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Long, C0IFA> LJ = new ConcurrentHashMap<>();
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(100));

    public static long LIZLLL() {
        return ((Number) LJIIIIZZ.getValue()).longValue();
    }

    public static final void LIZ(String str) {
        long jLongValue;
        if (str != null && str.length() != 0) {
            C468020IWy c468020IWy = LIZJ.get(str);
            if (c468020IWy != null) {
                Long l = c468020IWy.LIZIZ.LIZIZ;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = -1;
                }
                if (jLongValue <= 0) {
                    c468020IWy.LIZ.getClass();
                }
                C467990IWv c467990IWv = c468020IWy.LIZ;
                Math.max(0L, System.currentTimeMillis() - jLongValue);
                c467990IWv.getClass();
                return;
            }
            return;
        }
        LIZ.getClass();
        LJIIL("backgroundImageLoadSuccess but sessionId is invalid");
    }

    public static final String LJ(long j) {
        C468020IWy c468020IWy = LIZIZ.get(Long.valueOf(j));
        if (c468020IWy != null) {
            return c468020IWy.LIZ.LIZIZ;
        }
        C0IX5 c0ix5 = LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("the context for ");
        sbLIZ.append(j);
        sbLIZ.append(" is not existed when getSessionId.");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c0ix5.getClass();
        LJIIJ(strLIZIZ);
        return null;
    }

    public static final C468010IWx LJFF(String str) {
        C468020IWy c468020IWy;
        if (str == null || (c468020IWy = LIZJ.get(str)) == null) {
            return null;
        }
        return c468020IWy.LIZLLL;
    }

    public static final void LJI(String str) {
        C468020IWy c468020IWy;
        C0IX7 c0ix7;
        if (LivePlayFullLinkPerfSendExp.INSTANCE.isEnable() && str != null && (c468020IWy = LIZJ.get(str)) != null && (c0ix7 = c468020IWy.LJ) != null) {
            InterfaceC420801kM interfaceC420801kM = c0ix7.LJI;
            if (interfaceC420801kM != null) {
                interfaceC420801kM.dispose();
            }
            c0ix7.LJI = null;
        }
    }

    public static final void LJII(String str) {
        C468020IWy c468020IWy;
        C0IX7 c0ix7;
        if (LivePlayFullLinkPerfSendExp.INSTANCE.isEnable() && str != null && (c468020IWy = LIZJ.get(str)) != null && (c0ix7 = c468020IWy.LJ) != null) {
            InterfaceC420801kM interfaceC420801kM = c0ix7.LJI;
            if (interfaceC420801kM != null) {
                interfaceC420801kM.dispose();
            }
            c0ix7.LIZLLL.clear();
            c0ix7.LJ.clear();
            c0ix7.LIZJ.clear();
            c0ix7.LIZ.clear();
            c0ix7.LIZIZ.clear();
            LIZ.getClass();
            c0ix7.LJI = C11NZ.LJJJJJL(LIZLLL(), LIZLLL(), TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJLL(new AfS176S0100000_7(c0ix7, 104), new AfS132S0000000_7(22));
        }
    }

    public static final void LJIIIIZZ(String str) {
        C468020IWy c468020IWy;
        C0IX6 c0ix6;
        if (str != null && (c468020IWy = LIZJ.get(str)) != null && (c0ix6 = c468020IWy.LIZJ) != null && c0ix6.LJIIJJI > 0) {
            c0ix6.LJIIJ += SystemClock.elapsedRealtime() - c0ix6.LJIIJJI;
            c0ix6.LJIIJJI = 0L;
        }
    }

    public static final void LJIIIZ(EnterRoomConfig enterRoomConfig) {
        long j = enterRoomConfig.mRoomsData.roomId;
        if (j <= 0) {
            LIZ.getClass();
            LJIIL("screenStateContext return in advance and roomId is N/A.");
            return;
        }
        ConcurrentHashMap<Long, C0IFA> concurrentHashMap = LJ;
        if (concurrentHashMap.containsKey(Long.valueOf(j))) {
            C0IX5 c0ix5 = LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("screenStateContext for roomID is ");
            sbLIZ.append(enterRoomConfig.mLogData.enterRoomId);
            sbLIZ.append("  exist already when prepare");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c0ix5.getClass();
            LJIIJJI(strLIZIZ);
            return;
        }
        concurrentHashMap.put(Long.valueOf(j), new C0IFA(0));
    }

    public static void LJIIJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("full link >> ");
        sbLIZ.append(str);
        C20441214yg.LJ("LivePlayFullLinkManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJIIJJI(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("full link >> ");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("LivePlayFullLinkManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJIIL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("full link >> ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("LivePlayFullLinkManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJIILJJIL(String str) {
        C0IX5 c0ix5 = LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pullStreamLinkPlayerBegin is invoked for sessionId:");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c0ix5.getClass();
        LJIIJJI(strLIZIZ);
        if (str != null && str.length() != 0) {
            C468020IWy c468020IWy = LIZJ.get(str);
            if (c468020IWy == null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("the sessionId(");
                sbLIZ2.append(str);
                sbLIZ2.append(") is invalid due to no context for it when pullStreamLinkPlayerBegin");
                LJIIL(C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            c468020IWy.LIZJ.LIZ(2);
            System.currentTimeMillis();
            return;
        }
        LJIIL("pullStreamLinkPlayerBegin but sessionId is invalid");
    }

    public static final String LJIILLIIL(Long l) {
        if (l != null) {
            l.longValue();
            return LIZLLL.get(l);
        }
        return null;
    }

    public static void LJIIZILJ(C467990IWv c467990IWv) {
        EnterRoomConfig enterRoomConfig;
        String str;
        if (c467990IWv != null && c467990IWv.LJ.length() == 0 && (enterRoomConfig = c467990IWv.LJIIL) != null && (str = enterRoomConfig.mRoomsData.enterType) != null && str.length() > 0) {
            c467990IWv.LJ = str;
            C0IX5 c0ix5 = LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("the actionType is updated to ");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c0ix5.getClass();
            LJIIJJI(strLIZIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x027a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIJI(java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 2257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0IX5.LJIJI(java.lang.String):void");
    }

    public static final void LJIJ(int i, String str) {
        C0IX6 c0ix6;
        if (str != null && str.length() != 0) {
            C468020IWy c468020IWy = LIZJ.get(str);
            if (c468020IWy != null && (c0ix6 = c468020IWy.LIZJ) != null) {
                c0ix6.LIZ = i;
                return;
            }
            return;
        }
        LIZ.getClass();
        LJIIL("setPullStreamSubStates but sessionId is invalid ");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIILIIL(com.bytedance.android.livesdkapi.session.EnterRoomConfig r9, java.lang.String r10, java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0IX5.LJIILIIL(com.bytedance.android.livesdkapi.session.EnterRoomConfig, java.lang.String, java.util.Map):void");
    }

    public static final void LJIILL(int i, String str, String str2, boolean z) {
        C0IX5 c0ix5 = LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pullStreamLinkPlayerEnd is invoked for sessionId:");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c0ix5.getClass();
        LJIIJJI(strLIZIZ);
        int i2 = 0;
        if (str != null && str.length() != 0) {
            C468020IWy c468020IWy = LIZJ.get(str);
            if (c468020IWy == null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("the sessionId(");
                sbLIZ2.append(str);
                sbLIZ2.append(") is invalid due to no context for it when pullStreamLinkPlayerEnd");
                LJIIL(C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            C0IX6 c0ix6 = c468020IWy.LIZJ;
            int i3 = 4;
            if (c0ix6.LJIJ == 4) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("the pullStreamState(");
                sbLIZ3.append(c0ix6.LJIJ);
                sbLIZ3.append(") can not be updated.");
                LJIIJ(C2188811AlT.LIZIZ(sbLIZ3));
                C0IFA c0ifa = LJ.get(Long.valueOf(c468020IWy.LIZ.LIZ));
                if (c0ifa != null) {
                    c0ifa.LIZIZ = 1;
                }
            } else {
                if (i != 0) {
                    i3 = 3;
                }
                c0ix6.LIZ(i3);
                C0IFA c0ifa2 = LJ.get(Long.valueOf(c468020IWy.LIZ.LIZ));
                if (c0ifa2 != null) {
                    if (i == 0) {
                        i2 = 1;
                    }
                    c0ifa2.LIZIZ = i2;
                }
            }
            c0ix6.LIZIZ = i;
            c0ix6.LIZJ = str2;
            c0ix6.LIZLLL = z ? 1 : 0;
            System.currentTimeMillis();
            return;
        }
        LJIIL("pullStreamLinkPlayerEnd but sessionId is invalid");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(long r8, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0IX5.LIZIZ(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static final void LIZJ(long j, String str, long j2, int i, int i2, String str2) {
        C467990IWv c467990IWv;
        C0IX9 c0ix9;
        int i3;
        Long lValueOf;
        C467990IWv c467990IWv2;
        C467990IWv c467990IWv3;
        C0IX5 c0ix5 = LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enterRoomLinkEnd roomId:");
        sbLIZ.append(j);
        sbLIZ.append(" sessionId:");
        sbLIZ.append(str);
        sbLIZ.append(" errorCode:");
        sbLIZ.append(i);
        sbLIZ.append(" errorMsg:");
        sbLIZ.append(str2);
        sbLIZ.append(" duration:");
        sbLIZ.append(j2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c0ix5.getClass();
        LJIIJJI(strLIZIZ);
        boolean z = false;
        if (str != null && str.length() != 0) {
            if (j <= 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("the roomId(");
                sbLIZ2.append(j);
                sbLIZ2.append(") is invalid when enterRoomLinkEnd");
                LJIIL(C2188811AlT.LIZIZ(sbLIZ2));
                if (LiveFullLinkQuickScrollFixSetting.INSTANCE.disableQuickScrollFix()) {
                    return;
                }
            }
            C468020IWy c468020IWy = LIZJ.get(str);
            if (c468020IWy != null && (c467990IWv3 = c468020IWy.LIZ) != null && c467990IWv3.LIZ == j) {
                z = true;
            }
            Integer numValueOf = null;
            if (!z) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("the roomId(");
                if (c468020IWy != null && (c467990IWv2 = c468020IWy.LIZ) != null) {
                    lValueOf = Long.valueOf(c467990IWv2.LIZ);
                } else {
                    lValueOf = null;
                }
                sbLIZ3.append(lValueOf);
                sbLIZ3.append(") from LivePlayFullLinkContext is not same as ");
                sbLIZ3.append(j);
                sbLIZ3.append(" when enterRoomLinkEnd");
                LJIIL(C2188811AlT.LIZIZ(sbLIZ3));
                if (LiveFullLinkQuickScrollFixSetting.INSTANCE.disableQuickScrollFix()) {
                    return;
                }
            }
            if (c468020IWy != null) {
                c467990IWv = c468020IWy.LIZ;
            } else {
                c467990IWv = null;
            }
            LJIIZILJ(c467990IWv);
            if (c468020IWy != null && (c0ix9 = c468020IWy.LIZIZ) != null && (numValueOf = Integer.valueOf(c0ix9.LIZ)) != null && numValueOf.intValue() <= 1) {
                C0IX9 c0ix92 = c468020IWy.LIZIZ;
                if (i == 0) {
                    i3 = 3;
                } else {
                    i3 = 2;
                }
                c0ix92.LIZ = i3;
                c0ix92.LIZJ = i;
                c0ix92.LIZLLL = str2;
                c0ix92.LJ = Long.valueOf(j2);
                c0ix92.LJI = i2;
                return;
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("the state of entering room(");
            sbLIZ4.append(numValueOf);
            sbLIZ4.append(") can not be updated.");
            LJIIJ(C2188811AlT.LIZIZ(sbLIZ4));
            return;
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("enterRoomLinkEnd but sessionId is invalid for ");
        sbLIZ5.append(j);
        LJIIL(C2188811AlT.LIZIZ(sbLIZ5));
    }
}

package X;

import Y.ARunnableS29S1100000_24;
import android.content.Context;
import android.os.Looper;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.ab.CacheManagerConfig;
import com.ss.android.ugc.aweme.feed.ab.ConfigModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.aweme.feed.model.cardinsert.LynxTemplate;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.minis.api.IMinisApiService;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15be, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20553215be {
    public static int LJ;
    public static final C20553215be LIZ = new C20553215be();
    public static final C603820NmG<String, C20553715bj> LIZIZ = new C603820NmG<>(10);
    public static final ConcurrentHashMap<String, C20553715bj> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, C20553715bj> LIZLLL = new ConcurrentHashMap<>();
    public static final Map<String, Boolean> LJFF = new LinkedHashMap();

    public static List LJ() {
        Class<? extends AbstractC1549150qPp<?, ?>> clsLJIJI;
        Class<? extends AbstractC1549150qPp<?, ?>> clsLIZ;
        Class<? extends AbstractC1549150qPp<?, ?>> clsLIZ2;
        IMinisApiService iMinisApiService = (IMinisApiService) PluggableExtentionKt.pluggableSpi$default(IMinisApiService.class, false, false, false, 14, null);
        InterfaceC1057490dcp interfaceC1057490dcpLIZJ = iMinisApiService != null ? iMinisApiService.LIZJ() : null;
        IMinisApiService iMinisApiService2 = (IMinisApiService) PluggableExtentionKt.pluggableSpi$default(IMinisApiService.class, false, false, false, 14, null);
        InterfaceC1057480dco interfaceC1057480dcoLIZIZ = iMinisApiService2 != null ? iMinisApiService2.LIZIZ() : null;
        C323580CmK c323580CmK = new C323580CmK(4);
        c323580CmK.LIZ(C0TXB.class);
        c323580CmK.LIZ(C0TX9.class);
        c323580CmK.LIZ(C0TXG.class);
        c323580CmK.LIZIZ(C1ER1.LIZIZ.LLJJJ());
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(c323580CmK.LIZLLL(new Class[c323580CmK.LIZJ()]));
        if (interfaceC1057490dcpLIZJ != null && (clsLIZ2 = interfaceC1057490dcpLIZJ.LIZ()) != null) {
            listLJIILJJIL.add(clsLIZ2);
        }
        if (interfaceC1057480dcoLIZIZ != null && (clsLIZ = interfaceC1057480dcoLIZIZ.LIZ()) != null) {
            listLJIILJJIL.add(clsLIZ);
        }
        C1EE1 c1ee1 = C1EE1.LIZIZ;
        if (c1ee1 != null && (clsLJIJI = c1ee1.LJIJI()) != null) {
            listLJIILJJIL.add(clsLJIJI);
        }
        return listLJIILJJIL;
    }

    public static void LJFF(Aweme aweme) {
        int cardType;
        if (aweme == null) {
            return;
        }
        CardInsertInfo cardInsertInfo = aweme.getCardInsertInfo();
        if (cardInsertInfo != null) {
            cardType = cardInsertInfo.getCardType();
        } else {
            cardType = -1;
        }
        C20553715bj c20553715bjLJII = LJII(cardType, aweme.getAid());
        if (c20553715bjLJII != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c20553715bjLJII.LIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
            }
            C085L c085l = c20553715bjLJII.LIZLLL;
            if (c085l != null) {
                C1548820qPI.LJIIIZ(c085l, "feedDynamicComponentLoadSuccess");
            }
        }
        LJIIIZ(cardType, aweme.getAid());
    }

    public static boolean LJI(String str) {
        C20553715bj c20553715bjLJII = LJII(-1, str);
        if (c20553715bjLJII == null) {
            return false;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c20553715bjLJII.LIZ;
        C085L c085l = c20553715bjLJII.LIZLLL;
        if (c085l != null) {
            C1548820qPI.LJIIIZ(c085l, "feedDynamicComponentLoadSuccess");
        }
        LJIIIZ(-1, str);
        if (!Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            C0CNO.LIZLLL(0L, new AwS575S0100000_31(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, 1527));
        } else if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
            return true;
        }
        return true;
    }

    public static final void LIZLLL(String str, List list) {
        int cardType;
        ConfigModel configModelLIZIZ;
        List<Integer> list2;
        ConfigModel configModelLIZIZ2;
        try {
            ConfigModel configModelLIZIZ3 = C1601560rmM.LIZIZ();
            if (configModelLIZIZ3 != null && Intrinsics.LJFF(configModelLIZIZ3.enable, Boolean.TRUE)) {
                ConfigModel configModelLIZIZ4 = C1601560rmM.LIZIZ();
                if ((configModelLIZIZ4 == null || !Intrinsics.LJFF(configModelLIZIZ4.enableEnhancedPreload, Boolean.FALSE)) && list != null) {
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            Aweme aweme = (Aweme) obj;
                            if (aweme != null && i <= 1 && aweme.getAwemeType() == 105) {
                                CardInsertInfo cardInsertInfo = aweme.getCardInsertInfo();
                                if (cardInsertInfo != null) {
                                    cardType = cardInsertInfo.getCardType();
                                } else {
                                    cardType = -1;
                                }
                                ConfigModel configModelLIZIZ5 = C1601560rmM.LIZIZ();
                                if (configModelLIZIZ5 != null && Intrinsics.LJFF(configModelLIZIZ5.enable, Boolean.TRUE) && (configModelLIZIZ = C1601560rmM.LIZIZ()) != null && (list2 = configModelLIZIZ.whiteList) != null && list2.contains(Integer.valueOf(cardType)) && (configModelLIZIZ2 = C1601560rmM.LIZIZ()) != null && Intrinsics.LJFF(configModelLIZIZ2.enableEnhancedPreload, Boolean.TRUE)) {
                                    ConfigModel configModelLIZIZ6 = C1601560rmM.LIZIZ();
                                    if (configModelLIZIZ6 != null && Intrinsics.LJFF(configModelLIZIZ6.subThread, Boolean.TRUE)) {
                                        C823050WQl.LIZJ().execute(new ARunnableS29S1100000_24(aweme, str, 5));
                                    } else {
                                        C20553215be c20553215be = LIZ;
                                        Context contextLIZ = C2421209eE.LIZ();
                                        if (contextLIZ == null) {
                                            C844470XAv.LIZ.getClass();
                                            contextLIZ = C844470XAv.LIZ();
                                        }
                                        c20553215be.getClass();
                                        LIZ(contextLIZ, "homepage_hot", aweme, str, null);
                                    }
                                }
                            }
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static C20553715bj LJII(int i, String str) {
        C20553715bj c20553715bj = null;
        if (((CacheManagerConfig) C20552915bb.LIZIZ.getValue()).enable) {
            ConcurrentHashMap<String, C20553715bj> concurrentHashMap = LIZLLL;
            if (str != null) {
                try {
                    c20553715bj = concurrentHashMap.get(str);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            return c20553715bj;
        }
        if (C1601560rmM.LIZ(i)) {
            ConcurrentHashMap<String, C20553715bj> concurrentHashMap2 = LIZJ;
            if (str != null) {
                try {
                    c20553715bj = concurrentHashMap2.get(str);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
            return c20553715bj;
        }
        return (C20553715bj) C08IR.LIZ(LIZIZ, str);
    }

    public static void LJIIIZ(int i, String str) {
        if (((CacheManagerConfig) C20552915bb.LIZIZ.getValue()).enable) {
            ConcurrentHashMap<String, C20553715bj> concurrentHashMap = LIZLLL;
            if (str != null) {
                try {
                    concurrentHashMap.remove(str);
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return;
                }
            }
            return;
        }
        if (C1601560rmM.LIZ(i)) {
            ConcurrentHashMap<String, C20553715bj> concurrentHashMap2 = LIZJ;
            if (str != null) {
                try {
                    concurrentHashMap2.remove(str);
                    return;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    return;
                }
            }
            return;
        }
        C603820NmG<String, C20553715bj> c603820NmG = LIZIZ;
        if (str != null) {
            try {
                c603820NmG.LJ(str);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
        }
    }

    public static void LJIIIIZZ(String str, C20553715bj c20553715bj, int i) {
        if (((CacheManagerConfig) C20552915bb.LIZIZ.getValue()).enable) {
            ConcurrentHashMap<String, C20553715bj> concurrentHashMap = LIZLLL;
            if (str != null) {
                try {
                    concurrentHashMap.put(str, c20553715bj);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            LJ = Math.max(LJ, concurrentHashMap.size());
            return;
        }
        if (C1601560rmM.LIZ(i)) {
            ConcurrentHashMap<String, C20553715bj> concurrentHashMap2 = LIZJ;
            if (str != null) {
                try {
                    concurrentHashMap2.put(str, c20553715bj);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
            LJ = Math.max(LJ, concurrentHashMap2.size() + LIZIZ.LJI());
            return;
        }
        C603820NmG<String, C20553715bj> c603820NmG = LIZIZ;
        if (str != null) {
            try {
                c603820NmG.LIZLLL(str, c20553715bj);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
        }
        LJ = Math.max(LJ, LIZJ.size() + c603820NmG.LJI());
    }

    public static void LJIIJ(Integer num, Aweme aweme, int i) {
        String aid;
        C20553715bj c20553715bjLJII;
        if (aweme != null && (aid = aweme.getAid()) != null && aid.length() != 0 && num != null && (c20553715bjLJII = LJII(num.intValue(), aid)) != null) {
            c20553715bjLJII.LJFF = Integer.valueOf(i);
            c20553715bjLJII.LJI = aweme;
        }
    }

    public static boolean LIZ(Context context, String str, final Aweme aweme, String str2, final AbstractC20553815bk abstractC20553815bk) {
        final int cardType;
        final long jCurrentTimeMillis;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZJ;
        SparkContext sparkContext;
        String str3;
        if (aweme == null) {
            return false;
        }
        CardInsertInfo cardInsertInfo = aweme.getCardInsertInfo();
        if (cardInsertInfo != null) {
            cardType = cardInsertInfo.getCardType();
        } else {
            cardType = -1;
        }
        if (LJII(cardType, aweme.getAid()) != null || (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZJ = LIZJ(context, (jCurrentTimeMillis = System.currentTimeMillis()), str, aweme, str2, abstractC20553815bk)) == null || (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZJ.getSparkContext()) == null || (str3 = sparkContext.containerId) == null) {
            return false;
        }
        C1548820qPI.LJI(new C085L(str3, System.currentTimeMillis(), new InterfaceC1548390qOb() { // from class: X.15bf
            @Override // X.InterfaceC1548390qOb
            public final void H4(InterfaceC1107590evd interfaceC1107590evd, String str4) {
                AbstractC20552515bX abstractC20552515bX;
                LynxTemplate lynxTemplate;
                if (Intrinsics.LJFF(str4, "feedDynamicComponentLoadSuccess")) {
                    CardInsertInfo cardInsertInfo2 = aweme.getCardInsertInfo();
                    Integer numValueOf = null;
                    if (cardInsertInfo2 != null && (lynxTemplate = cardInsertInfo2.getLynxTemplate()) != null) {
                        numValueOf = Integer.valueOf(lynxTemplate.getLoadEntranceType());
                    }
                    if (C305450ByB.LIZ) {
                        if (numValueOf != null) {
                            if (numValueOf.intValue() == 2) {
                                C20553215be c20553215be = C20553215be.LIZ;
                                String aid = aweme.getAid();
                                int i = cardType;
                                c20553215be.getClass();
                                C20553715bj c20553715bjLJII = C20553215be.LJII(i, aid);
                                if (c20553715bjLJII != null) {
                                    AbstractC20553815bk abstractC20553815bk2 = abstractC20553815bk;
                                    c20553715bjLJII.LJIIIIZZ = true;
                                    if (c20553715bjLJII.LIZIZ != EnumC20553615bi.LOAD_FAIL && c20553715bjLJII.LJII) {
                                        c20553715bjLJII.LIZIZ = EnumC20553615bi.SUCCESS;
                                        if ((abstractC20553815bk2 instanceof AbstractC20552515bX) && (abstractC20552515bX = (AbstractC20552515bX) abstractC20553815bk2) != null) {
                                            abstractC20552515bX.LJFF();
                                        }
                                    }
                                }
                            } else if (numValueOf.intValue() == 1) {
                                C20553215be c20553215be2 = C20553215be.LIZ;
                                String aid2 = aweme.getAid();
                                int i2 = cardType;
                                c20553215be2.getClass();
                                C20553715bj c20553715bjLJII2 = C20553215be.LJII(i2, aid2);
                                if (c20553715bjLJII2 != null) {
                                    c20553715bjLJII2.LIZIZ = EnumC20553615bi.SUCCESS;
                                }
                            }
                        }
                    } else {
                        C20553215be c20553215be3 = C20553215be.LIZ;
                        String aid3 = aweme.getAid();
                        int i3 = cardType;
                        c20553215be3.getClass();
                        C20553715bj c20553715bjLJII3 = C20553215be.LJII(i3, aid3);
                        if (c20553715bjLJII3 != null) {
                            c20553715bjLJII3.LIZIZ = EnumC20553615bi.SUCCESS;
                        }
                    }
                    ConcurrentHashMap<String, Pair<Integer, Integer>> concurrentHashMap = C706870Ro5.LIZ;
                    Aweme aweme2 = aweme;
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    C0T5M c0t5m = C0T5M.LIZ;
                    CallableC341080DYs callableC341080DYs = new CallableC341080DYs(aweme2, jCurrentTimeMillis2);
                    c0t5m.getClass();
                    C0T5M.LIZIZ(callableC341080DYs);
                }
            }
        }, null), "feedDynamicComponentLoadSuccess");
        if (!C1601560rmM.LIZ(cardType) && !C2552509zP.LIZ) {
            C20553215be c20553215be = LIZ;
            String aid = aweme.getAid();
            C20553715bj c20553715bj = new C20553715bj(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZJ, EnumC20553615bi.LOADING);
            c20553215be.getClass();
            LJIIIIZZ(aid, c20553715bj, cardType);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0212  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LIZJ(android.content.Context r18, final long r19, final java.lang.String r21, final com.ss.android.ugc.aweme.feed.model.Aweme r22, java.lang.String r23, final X.AbstractC20553815bk r24) {
        /*
            Method dump skipped, instruction units count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20553215be.LIZJ(android.content.Context, long, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, X.15bk):X.0qEB");
    }
}

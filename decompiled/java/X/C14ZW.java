package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurveyConfig;
import com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo;
import com.ss.android.ugc.aweme.service.ISurveyDebuggerService;
import com.ss.android.ugc.tiktok.pns.feedsafety.api.survey.PNSSurveyService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS274S0000000_30;

/* JADX INFO: renamed from: X.14ZW, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14ZW {
    public static volatile PNSSurveyService LJ;
    public static volatile boolean LJIIIIZZ;
    public static boolean LJIIJ;
    public static final C14ZW LIZ = new C14ZW();
    public static final ConcurrentHashMap<String, C14ZG> LIZIZ = new ConcurrentHashMap<>();
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C14ZX());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(513));
    public static final AtomicBoolean LJFF = new AtomicBoolean(false);
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(276));
    public static volatile boolean LJII = true;
    public static final AtomicBoolean LJIIIZ = new AtomicBoolean(false);
    public static final C20293414aq LJIIJJI = new C20293414aq("frequency");

    public static boolean LJIIIIZZ() {
        if (!LJIIIIZZ && LJIIIZ.compareAndSet(false, true)) {
            try {
                ((ExecutorService) LJI.getValue()).execute(new Runnable() { // from class: X.0T4E
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1C7U.LIZ("SurveyRepo@be5f.isPnsSurveyAnrFixEnabledFast$1");
                        try {
                            try {
                                C14ZW c14zw = C14ZW.LIZ;
                                SettingsManager.LIZLLL().getClass();
                                C14ZW.LJII = SettingsManager.LIZ("enable_pns_survey_anr_fix", true);
                            } catch (Throwable th) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    C14ZW c14zw2 = C14ZW.LIZ;
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    C14ZW c14zw3 = C14ZW.LIZ;
                                    C14ZW.LJIIIIZZ = true;
                                    throw th2;
                                }
                            }
                            C14ZW.LJIIIIZZ = true;
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                            if (!C2179971ATj.LIZ(th3)) {
                                throw th3;
                            }
                        }
                        C1C7U.LIZIZ("SurveyRepo@be5f.isPnsSurveyAnrFixEnabledFast$1");
                    }
                });
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LJIIIZ.set(false);
            }
        }
        return LJII;
    }

    public static PNSSurveyService LIZJ() {
        if (!LJIIIIZZ()) {
            return (PNSSurveyService) LIZLLL.getValue();
        }
        PNSSurveyService pNSSurveyService = LJ;
        if (pNSSurveyService != null) {
            return pNSSurveyService;
        }
        if (LJ == null && LJFF.compareAndSet(false, true)) {
            ((ExecutorService) LJI.getValue()).execute(new Runnable() { // from class: X.10Fx
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SurveyRepo@be5f.ensurePnsSurveyServiceAsync$1");
                    try {
                        PNSSurveyService pNSSurveyServiceLJIILLIIL = ComplianceServiceProvider.LJIILLIIL();
                        C14ZW c14zw = C14ZW.LIZ;
                        C14ZW.LJ = pNSSurveyServiceLJIILLIIL;
                        if (pNSSurveyServiceLJIILLIIL == null) {
                            C14ZW.LJFF.set(false);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SurveyRepo@be5f.ensurePnsSurveyServiceAsync$1");
                }
            });
        }
        return null;
    }

    public static String LIZ(Aweme aweme) {
        FeedSurveyConfig feedSurveyConfig;
        List<String> list;
        if (aweme == null) {
            return null;
        }
        ConcurrentHashMap<String, C14ZG> concurrentHashMap = LIZIZ;
        String mainSurveyKey = AwemeExtKt.getMainSurveyKey(aweme);
        if (mainSurveyKey == null) {
            mainSurveyKey = "";
        }
        C14ZG c14zg = concurrentHashMap.get(mainSurveyKey);
        if (c14zg == null || (feedSurveyConfig = c14zg.LJI) == null || (list = feedSurveyConfig.contentScopes) == null) {
            return null;
        }
        return C13LP.LJJLIIIJ(list, ",", null, null, 0, null, AFwS274S0000000_30.get$arr$(255), 30);
    }

    public static final int LIZIZ(Aweme aweme) {
        LIZ.getClass();
        C14ZG c14zgLJI = LJI(aweme);
        if (c14zgLJI != null) {
            return c14zgLJI.LIZLLL;
        }
        return 0;
    }

    public static final int LIZLLL(Aweme aweme) {
        LIZ.getClass();
        C14ZG c14zgLJI = LJI(aweme);
        if (c14zgLJI != null) {
            return c14zgLJI.LIZJ;
        }
        return -1;
    }

    public static FeedSurvey LJ(Aweme aweme) {
        boolean z;
        if (aweme != null && AwemeExtKt.isWithSurvey(aweme)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C14ZG c14zgLJI = LJI(aweme);
            if (c14zgLJI == null) {
                return null;
            }
            return c14zgLJI.LIZIZ;
        }
        PNSSurveyService pNSSurveyServiceLIZJ = LIZJ();
        if (pNSSurveyServiceLIZJ != null) {
            if (aweme != null) {
                aweme.getAid();
            }
            if (pNSSurveyServiceLIZJ.LIZIZ()) {
                return LJFF(pNSSurveyServiceLIZJ.LJ());
            }
        }
        ISurveyDebuggerService iSurveyDebuggerService = (ISurveyDebuggerService) LIZJ.getValue();
        if (iSurveyDebuggerService != null) {
            iSurveyDebuggerService.isOpen();
        }
        return null;
    }

    public static FeedSurvey LJFF(String str) {
        C14ZG c14zg = LIZIZ.get(str);
        if (c14zg != null) {
            return c14zg.LIZIZ;
        }
        return null;
    }

    public static C14ZG LJI(Aweme aweme) {
        SurveyInfo surveyInfo = null;
        if (aweme == null) {
            return null;
        }
        ISurveyDebuggerService iSurveyDebuggerService = (ISurveyDebuggerService) LIZJ.getValue();
        if (iSurveyDebuggerService != null) {
            iSurveyDebuggerService.isOpen();
        }
        PNSSurveyService pNSSurveyServiceLIZJ = LIZJ();
        if (pNSSurveyServiceLIZJ != null) {
            String strLJ = pNSSurveyServiceLIZJ.LJ();
            if (strLJ.length() > 0) {
                aweme.getAid();
                if (pNSSurveyServiceLIZJ.LIZIZ()) {
                    return LIZIZ.get(strLJ);
                }
            }
        }
        List<SurveyInfo> surveyInfos = aweme.getSurveyInfos();
        if (surveyInfos == null || surveyInfos.isEmpty()) {
            return null;
        }
        List<SurveyInfo> surveyInfos2 = aweme.getSurveyInfos();
        String str = "";
        if (surveyInfos2 != null) {
            Iterator<SurveyInfo> it2 = surveyInfos2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                SurveyInfo next = it2.next();
                C20291314aV c20291314aV = C20291314aV.LIZ;
                String str2 = next.surveyKey;
                if (str2 == null) {
                    str2 = "";
                }
                c20291314aV.getClass();
                if (!C20291314aV.LJIIIZ(str2)) {
                    surveyInfo = next;
                    break;
                }
            }
            surveyInfo = surveyInfo;
        }
        aweme.setSurveyInfo(surveyInfo);
        ConcurrentHashMap<String, C14ZG> concurrentHashMap = LIZIZ;
        String mainSurveyKey = AwemeExtKt.getMainSurveyKey(aweme);
        if (mainSurveyKey != null) {
            str = mainSurveyKey;
        }
        return concurrentHashMap.get(str);
    }

    public static C14ZG LJII(String str) {
        ConcurrentHashMap<String, C14ZG> concurrentHashMap = LIZIZ;
        if (str == null) {
            str = "";
        }
        return concurrentHashMap.get(str);
    }
}

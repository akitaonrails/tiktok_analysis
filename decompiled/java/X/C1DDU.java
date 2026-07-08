package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.service.earlyfeedback.EarlyFeedbackButtonData;
import com.ss.android.ugc.aweme.service.earlyfeedback.FeedbackUIRecord;
import com.ss.android.ugc.aweme.service.earlyfeedback.QuestionnaireData;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DDU, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DDU implements InterfaceC20639315pX {
    public static final C1DDU LIZ = new C1DDU();
    public static final C01GW LIZIZ;
    public static final Map<String, Boolean> LIZJ;
    public static final Map<String, FeedbackUIRecord> LIZLLL;
    public static final Set<String> LJ;
    public static int LJFF;
    public static long LJI;
    public static final Map<String, String> LJII;

    @Override // X.InterfaceC20639315pX
    public final String getName() {
        return "dau";
    }

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(249));
        LIZIZ = c01gwLIZIZ;
        LIZJ = new LinkedHashMap();
        LIZLLL = new LinkedHashMap();
        LJ = new LinkedHashSet();
        LJFF = ((Keva) c01gwLIZIZ.getValue()).getInt("vv_continuous_skip_count_for_dau", 0);
        LJI = ((Keva) c01gwLIZIZ.getValue()).getLong("dau_survey_disabled_timestamp", 0L);
        LJII = new LinkedHashMap();
    }

    public static Boolean LJ(String str) {
        C1DD8 c1dd8;
        C1DD8 c1dd82;
        Map<String, Boolean> map = LIZJ;
        Boolean bool = (Boolean) ((LinkedHashMap) map).get(str);
        if (bool != null) {
            return Boolean.valueOf(bool.booleanValue());
        }
        if (str != null) {
            LIZ.getClass();
            Set setLJLIIL = C13LQ.LJLIIL(new C1DD8[]{C1DD8.LIKE, C1DD8.DISLIKE});
            LinkedHashMap linkedHashMap = (LinkedHashMap) LIZLLL;
            FeedbackUIRecord feedbackUIRecord = (FeedbackUIRecord) linkedHashMap.get(str);
            if (feedbackUIRecord != null) {
                c1dd8 = feedbackUIRecord.action;
            } else {
                c1dd8 = null;
            }
            if (C13LP.LJJJJ(c1dd8, setLJLIIL)) {
                LJII.put(str, "interacted before");
                return Boolean.FALSE;
            }
            Set setLJLIIL2 = C13LQ.LJLIIL(new C1DD8[]{C1DD8.SWIPE, C1DD8.SHOWN});
            FeedbackUIRecord feedbackUIRecord2 = (FeedbackUIRecord) linkedHashMap.get(str);
            if (feedbackUIRecord2 != null) {
                c1dd82 = feedbackUIRecord2.action;
            } else {
                c1dd82 = null;
            }
            if (C13LP.LJJJJ(c1dd82, setLJLIIL2)) {
                LJII.put(str, "show but not interacted before");
                return Boolean.TRUE;
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = LJI;
        if (j == 0 || jCurrentTimeMillis > j) {
            return null;
        }
        if (str != null) {
            map.put(str, Boolean.FALSE);
            Map<String, String> map2 = LJII;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("not show survey until: ");
            sbLIZ.append(LJI);
            map2.put(str, C2188811AlT.LIZIZ(sbLIZ));
        }
        return Boolean.FALSE;
    }

    public static final boolean LJFF(String str, C1DD8 c1dd8) {
        Map<String, FeedbackUIRecord> map = LIZLLL;
        FeedbackUIRecord feedbackUIRecord = (FeedbackUIRecord) ((LinkedHashMap) map).get(str);
        if (feedbackUIRecord != null) {
            C1DD8 c1dd82 = feedbackUIRecord.action;
            if (c1dd82 == C1DD8.SWIPE) {
                if (c1dd8 == C1DD8.LIKE || c1dd8 == C1DD8.DISLIKE) {
                    map.put(str, new FeedbackUIRecord(c1dd8));
                    return true;
                }
                return true;
            }
            if (c1dd82 != C1DD8.SHOWN) {
                return false;
            }
            map.put(str, new FeedbackUIRecord(c1dd8));
            return true;
        }
        if (c1dd8 != C1DD8.SHOWN) {
            return false;
        }
        map.put(str, new FeedbackUIRecord(c1dd8));
        return true;
    }

    @Override // X.InterfaceC20639315pX
    public final InterfaceC20638715pR LIZIZ(String str, boolean z) {
        return C21151117pt.LIZ;
    }

    @Override // X.InterfaceC20639315pX
    public final boolean LIZJ(String str, C1155610gB5 c1155610gB5) {
        double d;
        EarlyFeedbackButtonData earlyFeedbackButtonData;
        String str2;
        List<QuestionnaireData> list;
        EarlyFeedbackButtonData earlyFeedbackButtonData2;
        if (c1155610gB5.LIZJ && (str2 = c1155610gB5.LIZIZ) != null && str2.length() != 0) {
            C2252171DDb.LIZ = true;
            Boolean boolLJ = LJ(str);
            if (boolLJ != null) {
                return boolLJ.booleanValue();
            }
            if (!Intrinsics.LJFF(c1155610gB5.LIZIZ, "useful")) {
                if (str != null) {
                    LIZJ.put(str, Boolean.FALSE);
                    Map<String, String> map = LJII;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("personalized: invalid survey_name for DAU=");
                    sbLIZ.append(c1155610gB5.LIZIZ);
                    map.put(str, C2188811AlT.LIZIZ(sbLIZ));
                }
                return false;
            }
            C21151117pt c21151117pt = C21151117pt.LIZ;
            if (C2252171DDb.LIZ && (earlyFeedbackButtonData2 = C21151317pv.LIZIZ().dau) != null) {
                list = earlyFeedbackButtonData2.correctedQuestionnaires;
                if (list == null) {
                    list = earlyFeedbackButtonData2.questionnaires;
                }
            } else {
                list = C21151417pw.LIZ().questionnaires;
            }
            if (C21151217pu.LIZ(c21151117pt, list, 0, LJFF)) {
                if (str != null) {
                    LIZJ.put(str, Boolean.FALSE);
                    Map<String, String> map2 = LJII;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("personalized: questionnaire exhausted ");
                    sbLIZ2.append(c1155610gB5.LIZIZ);
                    map2.put(str, C2188811AlT.LIZIZ(sbLIZ2));
                }
                return false;
            }
            if (str != null) {
                LIZJ.put(str, Boolean.TRUE);
                Map<String, String> map3 = LJII;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("personalized: server picked ");
                sbLIZ3.append(c1155610gB5.LIZIZ);
                map3.put(str, C2188811AlT.LIZIZ(sbLIZ3));
            }
            return true;
        }
        Boolean boolLJ2 = LJ(str);
        if (boolLJ2 != null) {
            return boolLJ2.booleanValue();
        }
        if (C2252171DDb.LIZ && (earlyFeedbackButtonData = C21151317pv.LIZIZ().dau) != null) {
            d = earlyFeedbackButtonData.ratio;
        } else {
            d = C21151417pw.LIZ().ratio;
        }
        if (0.0d <= d && d <= 1.0d && AbstractC19994813Le.Default.nextDouble(0.0d, 1.0d) <= d) {
            if (str == null) {
                return true;
            }
            LIZJ.put(str, Boolean.TRUE);
            LJII.put(str, "show by random");
            return true;
        }
        if (str != null) {
            LIZJ.put(str, Boolean.FALSE);
            LJII.put(str, "not show by random");
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC20639315pX
    public final void LIZ(String str, String str2, EnumC1877260yx2 enumC1877260yx2) {
        long j;
        EarlyFeedbackButtonData earlyFeedbackButtonData;
        if (str != null) {
            LIZ.getClass();
            LIZJ.remove(str);
            LJFF(str, C1DD8.SHOWN);
        }
        if (C2252171DDb.LIZ && (earlyFeedbackButtonData = C21151317pv.LIZIZ().dau) != null) {
            j = earlyFeedbackButtonData.blockDurationSec;
        } else {
            j = C21151417pw.LIZ().blockDurationSec;
        }
        LJI = System.currentTimeMillis() + (j * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        C823050WQl.LIZIZ().submit(RunnableC19347910mj.LL);
        if (str != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("item_id", str);
            C20684815ws.LJIILLIIL("useful_feedback_bar_show", c2344009Gk.LIZ);
        }
    }

    @Override // X.InterfaceC20639315pX
    public final void LIZLLL(String str, String str2, EnumC1877260yx2 enumC1877260yx2, C1DD8 c1dd8, long j) {
        int i;
        String str3;
        long j2;
        EarlyFeedbackButtonData earlyFeedbackButtonData;
        EarlyFeedbackButtonData earlyFeedbackButtonData2;
        C1DD8 c1dd82;
        if (str != null) {
            LIZ.getClass();
            LIZJ.remove(str);
            if (!LJFF(str, c1dd8)) {
                return;
            }
        }
        if (C1DD8.SWIPE == c1dd8) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("userSkipped aid: ");
            sbLIZ.append(str);
            sbLIZ.append(", previous action: ");
            FeedbackUIRecord feedbackUIRecord = (FeedbackUIRecord) ((LinkedHashMap) LIZLLL).get(str);
            if (feedbackUIRecord != null) {
                c1dd82 = feedbackUIRecord.action;
            } else {
                c1dd82 = null;
            }
            sbLIZ.append(c1dd82);
            C2188811AlT.LIZIZ(sbLIZ);
            if (str != null) {
                LIZ.getClass();
                Set<String> set = LJ;
                if (!set.contains(str)) {
                    set.add(str);
                    LJFF++;
                }
            }
        } else {
            LJFF = 0;
            LJ.clear();
        }
        ExecutorService executorServiceLIZIZ = C823050WQl.LIZIZ();
        RunnableC19347810mi runnableC19347810mi = new Runnable() { // from class: X.10mi
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("DAUSurveyInvestigator@6caf.persistContinuousSkipCount$1");
                try {
                    C1DDU.LIZ.getClass();
                    ((Keva) C1DDU.LIZIZ.getValue()).storeInt("vv_continuous_skip_count_for_dau", C1DDU.LJFF);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("DAUSurveyInvestigator@6caf.persistContinuousSkipCount$1");
            }
        };
        executorServiceLIZIZ.submit(runnableC19347810mi);
        int i2 = LJFF;
        if (C2252171DDb.LIZ && (earlyFeedbackButtonData2 = C21151317pv.LIZIZ().dau) != null) {
            i = earlyFeedbackButtonData2.maxSkipCount;
        } else {
            i = C21151417pw.LIZ().maxSkipCount;
        }
        if (i2 >= i) {
            if (C2252171DDb.LIZ && (earlyFeedbackButtonData = C21151317pv.LIZIZ().dau) != null) {
                j2 = earlyFeedbackButtonData.blockSkipDurationSec;
            } else {
                j2 = C21151417pw.LIZ().blockSkipDurationSec;
            }
            LJI = System.currentTimeMillis() + (j2 * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            C823050WQl.LIZIZ().submit(RunnableC19347910mj.LL);
            LJFF = 0;
            C823050WQl.LIZIZ().submit(runnableC19347810mi);
        }
        if (str != null) {
            int i3 = C1DD9.LIZ[c1dd8.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        str3 = "";
                    } else {
                        str3 = "swipe";
                    }
                } else {
                    str3 = "not_useful";
                }
            } else {
                str3 = "useful";
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("item_id", str);
            c2344009Gk.LJIIIIZZ("action", str3);
            c2344009Gk.LIZLLL(j, "duration");
            C20684815ws.LJIILLIIL("useful_feedback_bar_disppear", c2344009Gk.LIZ);
        }
    }
}

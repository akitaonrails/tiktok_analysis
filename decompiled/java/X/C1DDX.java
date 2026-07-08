package X;

import Y.ARunnableS5S0010000_35;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.service.earlyfeedback.EarlyFeedbackButtonData;
import com.ss.android.ugc.aweme.service.earlyfeedback.FeedbackUIRecord;
import com.ss.android.ugc.aweme.service.earlyfeedback.QuestionnaireData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.1DDX, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DDX implements InterfaceC20639315pX {
    public static final C1DDX LIZ = new C1DDX();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(250));
    public static final Map<String, Boolean> LIZJ = new LinkedHashMap();
    public static final Map<String, FeedbackUIRecord> LIZLLL = new LinkedHashMap();
    public static final Set<String> LJ = new LinkedHashSet();
    public static final Set<String> LJFF = new LinkedHashSet();
    public static final Set<String> LJI = new LinkedHashSet();
    public static int LJII = LJFF().getInt("vv_continuous_skip_count", 0);
    public static int LJIIIIZZ = LJFF().getInt("vv_continuous_interest_skip_count", 0);
    public static int LJIIIZ = LJFF().getInt("vv_continuous_useful_count", 0);
    public static long LJIIJ;
    public static final Map<String, InterfaceC20638715pR> LJIIJJI;
    public static final Map<String, String> LJIIL;

    @Override // X.InterfaceC20639315pX
    public final String getName() {
        return "low_active";
    }

    static {
        int iLIZIZ;
        EarlyFeedbackButtonData earlyFeedbackButtonData;
        if (!C2252171DDb.LIZ || (earlyFeedbackButtonData = C21151317pv.LIZIZ().lowActive) == null) {
            C19250110St.LIZ.getClass();
            iLIZIZ = C19250110St.LIZIZ();
        } else {
            iLIZIZ = earlyFeedbackButtonData.minVvInterval;
        }
        LJIIJ = (-iLIZIZ) - 1;
        LJIIJJI = new LinkedHashMap();
        LJIIL = new LinkedHashMap();
    }

    public static final Keva LJFF() {
        return (Keva) LIZIZ.getValue();
    }

    public static final void LJ(String str, boolean z) {
        if (str != null) {
            Map<String, InterfaceC20638715pR> map = LJIIJJI;
            if (!map.containsKey(str)) {
                List<QuestionnaireData> listLIZ = C2252161DDa.LIZ();
                if (listLIZ != null && listLIZ.size() >= 2 && !z) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
                    for (QuestionnaireData questionnaireData : listLIZ) {
                        if (Intrinsics.LJFF(questionnaireData.type, "interest") && LJIIIIZZ < questionnaireData.skipCount) {
                            arrayList.add("interest");
                        }
                        if (Intrinsics.LJFF(questionnaireData.type, "useful") && LJIIIZ < questionnaireData.skipCount) {
                            arrayList.add("useful");
                        }
                        arrayList2.add(Unit.LIZ);
                    }
                    if (!arrayList.isEmpty()) {
                        if (Intrinsics.LJFF(ListProtector.get(arrayList, AbstractC19994813Le.Default.nextInt(1, 10000) % arrayList.size()), "useful")) {
                            LJIIJJI.put(str, C21151117pt.LIZ);
                            return;
                        } else {
                            LJIIJJI.put(str, C20638815pS.LIZ);
                            return;
                        }
                    }
                    LJIIJJI.put(str, C20638815pS.LIZ);
                    return;
                }
                map.put(str, C20638815pS.LIZ);
            }
        }
    }

    public static final Boolean LJI(long j, String str) {
        int iLIZIZ;
        C1DD8 c1dd8;
        C1DD8 c1dd82;
        EarlyFeedbackButtonData earlyFeedbackButtonData;
        if (C2252171DDb.LIZ && (earlyFeedbackButtonData = C21151317pv.LIZIZ().lowActive) != null) {
            iLIZIZ = earlyFeedbackButtonData.minVvInterval;
        } else {
            C19250110St.LIZ.getClass();
            iLIZIZ = C19250110St.LIZIZ();
        }
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
                LJIIL.put(str, "interacted before");
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
                LJIIL.put(str, "show but not interacted before");
                return Boolean.TRUE;
            }
        }
        if (LJIIJ < j - ((long) iLIZIZ)) {
            return null;
        }
        if (str != null) {
            map.put(str, Boolean.FALSE);
            Map<String, String> map2 = LJIIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("not pass frequency, vv=");
            sbLIZ.append(j);
            sbLIZ.append(", expect=");
            sbLIZ.append(LJIIJ);
            sbLIZ.append(", interval=");
            sbLIZ.append(iLIZIZ);
            map2.put(str, C2188811AlT.LIZIZ(sbLIZ));
        }
        return Boolean.FALSE;
    }

    public static final boolean LJII(String str, C1DD8 c1dd8) {
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
        if (str != null) {
            Map<String, InterfaceC20638715pR> map = LJIIJJI;
            if (!map.containsKey(str)) {
                C1DDX c1ddx = LIZ;
                LJ(str, z);
            }
            InterfaceC20638715pR interfaceC20638715pR = (InterfaceC20638715pR) ((LinkedHashMap) map).get(str);
            if (interfaceC20638715pR == null) {
                return C20638815pS.LIZ;
            }
            return interfaceC20638715pR;
        }
        return C20638815pS.LIZ;
    }

    @Override // X.InterfaceC20639315pX
    public final boolean LIZJ(String str, C1155610gB5 c1155610gB5) {
        boolean z;
        long jLIZIZ;
        InterfaceC20638715pR interfaceC20638715pR;
        long jLIZIZ2;
        double d;
        EarlyFeedbackButtonData earlyFeedbackButtonData;
        String str2;
        if (c1155610gB5.LIZJ && (str2 = c1155610gB5.LIZIZ) != null && str2.length() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C20018813Uk.LIZ.getClass();
            if (C13LP.LJJJJ(str, C20018813Uk.LIZJ)) {
                jLIZIZ2 = C20018813Uk.LIZIZ();
            } else {
                jLIZIZ2 = 1 + C20018813Uk.LIZIZ();
            }
            Boolean boolLJI = LJI(jLIZIZ2, str);
            if (boolLJI != null) {
                return boolLJI.booleanValue();
            }
            if (C2252171DDb.LIZ && (earlyFeedbackButtonData = C21151317pv.LIZIZ().lowActive) != null) {
                d = earlyFeedbackButtonData.ratio;
            } else {
                C19250110St.LIZ.getClass();
                d = C19250110St.LIZ().ratio;
            }
            if (0.0d <= d && d <= 1.0d && AbstractC19994813Le.Default.nextDouble(0.0d, 1.0d) <= d) {
                LJ(str, false);
                LJIIJ = jLIZIZ2;
                if (str == null) {
                    return true;
                }
                LIZJ.put(str, Boolean.TRUE);
                LJIIL.put(str, "show by random");
                return true;
            }
            if (str != null) {
                LIZJ.put(str, Boolean.FALSE);
                LJIIL.put(str, "not show by random");
                return false;
            }
            return false;
        }
        C2252171DDb.LIZ = true;
        C20018813Uk.LIZ.getClass();
        if (C13LP.LJJJJ(str, C20018813Uk.LIZJ)) {
            jLIZIZ = C20018813Uk.LIZIZ();
        } else {
            jLIZIZ = 1 + C20018813Uk.LIZIZ();
        }
        Boolean boolLJI2 = LJI(jLIZIZ, str);
        if (boolLJI2 != null) {
            return boolLJI2.booleanValue();
        }
        AbstractC21150817pq abstractC21150817pqLIZ = C21151017ps.LIZ(c1155610gB5.LIZIZ, C2252161DDa.LIZ());
        if (abstractC21150817pqLIZ instanceof C21150917pr) {
            if (str != null) {
                LIZJ.put(str, Boolean.FALSE);
                Map<String, String> map = LJIIL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("personalized: invalid survey_name=");
                sbLIZ.append(c1155610gB5.LIZIZ);
                map.put(str, C2188811AlT.LIZIZ(sbLIZ));
            }
            return false;
        }
        if (abstractC21150817pqLIZ instanceof C21150717pp) {
            if (str != null) {
                Map<String, String> map2 = LJIIL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("personalized: matrix mismatch on ");
                sbLIZ2.append(c1155610gB5.LIZIZ);
                sbLIZ2.append(", render anyway");
                map2.put(str, C2188811AlT.LIZIZ(sbLIZ2));
            }
            interfaceC20638715pR = ((C21150717pp) abstractC21150817pqLIZ).LIZ;
        } else if (abstractC21150817pqLIZ instanceof C21150617po) {
            interfaceC20638715pR = ((C21150617po) abstractC21150817pqLIZ).LIZ;
        } else {
            throw new C1954807lC();
        }
        if (C21151217pu.LIZ(interfaceC20638715pR, C2252161DDa.LIZ(), LJIIIIZZ, LJIIIZ)) {
            if (str != null) {
                LIZJ.put(str, Boolean.FALSE);
                Map<String, String> map3 = LJIIL;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("personalized: questionnaire exhausted ");
                sbLIZ3.append(c1155610gB5.LIZIZ);
                map3.put(str, C2188811AlT.LIZIZ(sbLIZ3));
            }
            return false;
        }
        if (str != null) {
            LJIIJJI.put(str, interfaceC20638715pR);
        }
        LJIIJ = jLIZIZ;
        if (str != null) {
            LIZJ.put(str, Boolean.TRUE);
            Map<String, String> map4 = LJIIL;
            String str3 = (String) ((LinkedHashMap) map4).get(str);
            if (str3 == null || !u.LJJIIJZLJL(str3, "personalized: matrix mismatch", false)) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("personalized: server picked ");
                sbLIZ4.append(c1155610gB5.LIZIZ);
                map4.put(str, C2188811AlT.LIZIZ(sbLIZ4));
                return true;
            }
        }
        return true;
    }

    @Override // X.InterfaceC20639315pX
    public final void LIZ(String str, String str2, EnumC1877260yx2 enumC1877260yx2) {
        if (str != null) {
            LIZ.getClass();
            LIZJ.remove(str);
            LJII(str, C1DD8.SHOWN);
        }
        C823050WQl.LIZIZ().submit(new ARunnableS5S0010000_35(false, 0));
        if (str != null) {
            if (((LinkedHashMap) LJIIJJI).get(str) instanceof C21151117pt) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("item_id", str);
                C20684815ws.LJIILLIIL("useful_feedback_bar_show", c2344009Gk.LIZ);
                return;
            }
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("ui_type", enumC1877260yx2.getEtValue());
            c2344009Gk2.LJIIIIZZ("item_id", str);
            c2344009Gk2.LJIIIIZZ("gid", str2);
            c2344009Gk2.LJIIIIZZ("survey_user_type", "low_active");
            C20684815ws.LJIILLIIL("video_feedback_bar_show", c2344009Gk2.LIZ);
            C2344009Gk c2344009Gk3 = new C2344009Gk();
            c2344009Gk3.LJIIIIZZ("item_id", str);
            C20684815ws.LJIILLIIL("video_feedback_bar_show_lowactive", c2344009Gk3.LIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0162  */
    @Override // X.InterfaceC20639315pX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.String r11, java.lang.String r12, X.EnumC1877260yx2 r13, X.C1DD8 r14, long r15) {
        /*
            Method dump skipped, instruction units count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DDX.LIZLLL(java.lang.String, java.lang.String, X.0yx2, X.1DD8, long):void");
    }
}

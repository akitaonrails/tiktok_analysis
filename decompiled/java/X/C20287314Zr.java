package X;

import Y.ARunnableS34S1100000_30;
import android.os.Looper;
import android.util.LruCache;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo;
import com.ss.android.ugc.aweme.feed.model.survey.TriggerData;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14Zr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20287314Zr {
    public static final C20287314Zr LIZ = new C20287314Zr();
    public static boolean LIZIZ;
    public static Aweme LIZJ;
    public static String LIZLLL;
    public static int LJ;
    public static WeakReference<IBaseListFragmentPanel> LJFF;

    static {
        new LruCache(200);
        LIZLLL = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Iterable] */
    public static void LIZ(Aweme aweme, EnumC20290114aJ enumC20290114aJ) {
        String aid;
        String str;
        ?? arrayList;
        Object next;
        Integer numValueOf;
        Integer numValueOf2;
        TriggerData triggerData;
        TriggerData triggerData2;
        SurveyInfo next2;
        List<Integer> list;
        List<EnumC20290114aJ> list2;
        String str2;
        if (enumC20290114aJ == null) {
            return;
        }
        C20293414aq c20293414aq = C20289014a8.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[step 2.1.1 getTriggerKey] start, aweme ");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        if (aweme != null) {
            C20291314aV.LIZ.getClass();
            if (C20291314aV.LJIIIIZZ.contains(aweme.getAid())) {
                SurveyInfo surveyInfo = aweme.getSurveyInfo();
                if (surveyInfo != null && (str2 = surveyInfo.surveyKey) != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[step 2.1.2 getTriggerKey] surveyKey ");
                    sbLIZ2.append(str2);
                    sbLIZ2.append(" in showSet");
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
                SurveyInfo surveyInfo2 = aweme.getSurveyInfo();
                if (surveyInfo2 != null) {
                    str = surveyInfo2.surveyKey;
                    if (str == null) {
                    }
                }
                str = "";
            } else {
                C20293414aq c20293414aq2 = C20286214Zg.LIZ;
                List<SurveyInfo> surveyInfos = aweme.getSurveyInfos();
                if (surveyInfos != null) {
                    ArrayList<String> arrayList2 = new ArrayList();
                    Iterator<SurveyInfo> it2 = surveyInfos.iterator();
                    while (it2.hasNext()) {
                        String str3 = it2.next().surveyKey;
                        if (str3 != null) {
                            arrayList2.add(str3);
                        }
                    }
                    arrayList = new ArrayList();
                    for (String str4 : arrayList2) {
                        C14ZW.LIZ.getClass();
                        FeedSurvey feedSurveyLJFF = C14ZW.LJFF(str4);
                        if (feedSurveyLJFF != null) {
                            arrayList.add(feedSurveyLJFF);
                        }
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList) {
                    FeedSurvey feedSurvey = (FeedSurvey) obj;
                    List<TriggerData> list3 = feedSurvey.triggerActions;
                    if (list3 != null) {
                        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                        Iterator<TriggerData> it3 = list3.iterator();
                        while (it3.hasNext()) {
                            arrayList4.add(Integer.valueOf(it3.next().action));
                        }
                        if (!arrayList4.isEmpty()) {
                            List<SurveyInfo> surveyInfos2 = aweme.getSurveyInfos();
                            if (surveyInfos2 != null) {
                                Iterator<SurveyInfo> it4 = surveyInfos2.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        next2 = it4.next();
                                        if (Intrinsics.LJFF(next2.surveyKey, feedSurvey.surveyKey)) {
                                            break;
                                        }
                                    } else {
                                        next2 = null;
                                        break;
                                    }
                                }
                                SurveyInfo surveyInfo3 = next2;
                                if (surveyInfo3 != null && (list = surveyInfo3.triggers) != null) {
                                    C20287614Zu c20287614Zu = C20289814aG.LIZ;
                                    String aid2 = aweme.getAid();
                                    c20287614Zu.getClass();
                                    C2252061DCq c2252061DCqLIZ = C20287614Zu.LIZ("homepage_hot", aid2, surveyInfo3);
                                    if (c2252061DCqLIZ != null) {
                                        list2 = c2252061DCqLIZ.LJJJLL;
                                    } else {
                                        list2 = null;
                                    }
                                    aweme.getAid();
                                    EnumC20290114aJ enumC20290114aJLIZ = C20287514Zt.LIZ(C2528909vb.LIZ);
                                    if (list2 != null) {
                                        List listLJJJJLI = C13LP.LJJJJLI(C13LP.LJLILLLLZI(enumC20290114aJ, C13LP.LJLILLLLZI(enumC20290114aJLIZ, list2)));
                                        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(listLJJJJLI, 10));
                                        Iterator it5 = ((ArrayList) listLJJJJLI).iterator();
                                        while (it5.hasNext()) {
                                            arrayList5.add(Integer.valueOf(((EnumC20290114aJ) it5.next()).getTYPE()));
                                        }
                                        List<Integer> listLLIIII = C13LP.LLIIII(C13LP.LJJL(arrayList5, C13LP.LLIIJI(list)));
                                        if (listLLIIII != null && (!listLLIIII.isEmpty())) {
                                            C20289014a8.LIZ.LJIIJJI(new C5182020e(listLLIIII, (List<Function0<Unit>>) 187));
                                            surveyInfo3.setTriggers(listLLIIII);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    arrayList3.add(obj);
                }
                if (!arrayList3.isEmpty()) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("[step 2.1.3 needTrigger] surveys ");
                    sbLIZ3.append(arrayList3);
                    C2188811AlT.LIZIZ(sbLIZ3);
                }
                Iterator it6 = arrayList3.iterator();
                if (!it6.hasNext()) {
                    next = null;
                } else {
                    next = it6.next();
                    if (it6.hasNext()) {
                        C20293414aq c20293414aq3 = C20289014a8.LIZ;
                        List<TriggerData> list4 = ((FeedSurvey) next).triggerActions;
                        if (list4 != null && (triggerData2 = (TriggerData) C13LP.LJJJLL(list4)) != null) {
                            numValueOf = Integer.valueOf(triggerData2.action);
                        } else {
                            numValueOf = null;
                        }
                        int iLIZ = C20289014a8.LIZ(numValueOf);
                        do {
                            Object next3 = it6.next();
                            List<TriggerData> list5 = ((FeedSurvey) next3).triggerActions;
                            if (list5 != null && (triggerData = (TriggerData) C13LP.LJJJLL(list5)) != null) {
                                numValueOf2 = Integer.valueOf(triggerData.action);
                            } else {
                                numValueOf2 = null;
                            }
                            int iLIZ2 = C20289014a8.LIZ(numValueOf2);
                            if (iLIZ > iLIZ2) {
                                next = next3;
                                iLIZ = iLIZ2;
                            }
                        } while (it6.hasNext());
                    }
                }
                FeedSurvey feedSurvey2 = (FeedSurvey) next;
                if (feedSurvey2 != null) {
                    str = feedSurvey2.surveyKey;
                    if (str == null) {
                    }
                }
                str = "";
            }
        } else {
            str = "";
        }
        C14ZW.LIZ.getClass();
        C14ZG c14zgLJII = C14ZW.LJII(str);
        if (c14zgLJII != null && c14zgLJII.LIZJ == C14Z5.FORCE_VIDEO_LYNX.getType() && C123100dR.LIZ(str)) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS34S1100000_30(aweme, str, 10));
        }
    }

    public static void LIZIZ(int i, Aweme aweme, BaseListFragmentPanel baseListFragmentPanel, String str) {
        if (aweme != null && AwemeBizExtKt.isSubAweme(aweme)) {
            return;
        }
        LIZJ = aweme;
        LJ = i;
        if (str == null) {
            str = "";
        }
        LIZLLL = str;
        LJFF = new WeakReference<>(baseListFragmentPanel);
        Aweme aweme2 = LIZJ;
        if (aweme2 != null) {
            aweme2.getAid();
        }
        LIZ(aweme, C20287514Zt.LIZ(C2528909vb.LIZ));
    }
}

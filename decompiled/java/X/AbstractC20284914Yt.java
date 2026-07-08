package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurveyConfig;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import com.ss.android.ugc.aweme.feed.model.survey.SignalRule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14Yt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20284914Yt implements InterfaceC690490R6p {
    public Aweme LL;
    public FeedSurvey LLILLJJLI;
    public Question LLILZLL;
    public Boolean LLIZLLLIL;
    public C14Z0 LLILLL = C14Z0.FEED_TYPE;
    public int LLILZ = C14Z5.BACKGROUND.getType();
    public int LLILZIL = 1;
    public final C20293414aq LLIZ = new C20293414aq(getClass().getSimpleName());
    public List<? extends Function1<? super String, Boolean>> LLJ = C13BV.INSTANCE;

    @Override // X.InterfaceC690490R6p
    public void LIZLLL() {
    }

    public void LJFF() {
    }

    public void LJIIIZ() {
    }

    public boolean So() {
        return false;
    }

    @Override // X.InterfaceC690490R6p
    public void LIZ() {
        C20554315bp.LIZIZ.LJIIL(EnumC20654715s1.SURVEY_CARD);
    }

    @Override // X.InterfaceC690000R4s
    public void LJIILIIL() {
        String str;
        String str2;
        String aid;
        FeedSurvey feedSurvey;
        C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
        C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
        Aweme aweme = this.LL;
        C20283314Yd c20283314YdLIZIZ = c20285414YyLIZ.LIZIZ(aweme != null ? aweme.getAid() : null);
        if (c20283314YdLIZIZ == null) {
            c20283314YdLIZIZ = new C20283314Yd();
        }
        if (!c20283314YdLIZIZ.LIZ) {
            C14ZW c14zw = C14ZW.LIZ;
            Aweme aweme2 = this.LL;
            c14zw.getClass();
            C14ZG c14zgLJI = C14ZW.LJI(aweme2);
            if (c14zgLJI != null) {
                C20291314aV.LIZ.getClass();
                Integer num = c14zgLJI.LJII;
                if (num != null) {
                    num.intValue();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("max_unsubmitted_display_times_");
                    sbLIZ.append(c14zgLJI.LIZ);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    C20291314aV.LIZLLL().storeInt(strLIZIZ, C20291314aV.LIZLLL().getInt(strLIZIZ, 0) + 1);
                }
            }
        }
        if (!c20283314YdLIZIZ.LIZ) {
            c20283314YdLIZIZ.LIZ = true;
            C20285414Yy c20285414YyLIZ2 = C988000bok.LIZ();
            Aweme aweme3 = this.LL;
            c20285414YyLIZ2.LJFF(aweme3 != null ? aweme3.getAid() : null, c20283314YdLIZIZ);
            Aweme aweme4 = this.LL;
            if (aweme4 != null && (feedSurvey = this.LLILLJJLI) != null) {
                C14ZT c14zt = C14ZT.LIZ;
                String str3 = feedSurvey.id;
                C14Z9 c14z9 = C14ZA.Companion;
                Question question = this.LLILZLL;
                Integer numValueOf = question != null ? Integer.valueOf(question.type) : null;
                c14z9.getClass();
                String strLIZ = C14Z9.LIZ(numValueOf);
                c14zt.getClass();
                C14ZT.LJIIL(aweme4, str3, strLIZ);
                this.LLIZ.LJIIJJI(AnonymousClass0206.get$arr$(371));
                C20291314aV c20291314aV = C20291314aV.LIZ;
                Aweme aweme5 = this.LL;
                c20291314aV.getClass();
                C20291314aV.LJIILJJIL(aweme5);
            }
        }
        C20285414Yy c20285414YyLIZ3 = C988000bok.LIZ();
        Aweme aweme6 = this.LL;
        c20285414YyLIZ3.LJII(aweme6 != null ? aweme6.getAid() : null, new C14Z2(this.LLILZ, true));
        C20647815qu c20647815qu = C20647815qu.LIZ;
        FeedSurvey feedSurvey2 = this.LLILLJJLI;
        String str4 = "";
        if (feedSurvey2 == null || (str = feedSurvey2.surveyKey) == null) {
            str = "";
        }
        Aweme aweme7 = this.LL;
        if (aweme7 != null && (aid = aweme7.getAid()) != null) {
            str4 = aid;
        }
        Aweme aweme8 = this.LL;
        String requestId = aweme8 != null ? aweme8.getRequestId() : null;
        c20647815qu.getClass();
        C20647815qu.LIZLLL(str, str4, requestId);
        C20285414Yy c20285414YyLIZ4 = C988000bok.LIZ();
        Aweme aweme9 = this.LL;
        if (!c20285414YyLIZ4.LIZLLL(C14Z5.BACKGROUND.getType(), aweme9 != null ? aweme9.getAid() : null) || C20552315bV.LIZIZ) {
            return;
        }
        Aweme aweme10 = this.LL;
        FeedSurvey feedSurvey3 = this.LLILLJJLI;
        if (feedSurvey3 == null || (str2 = feedSurvey3.surveyKey) == null) {
            str2 = "-2";
        }
        C20552315bV.LIZLLL(aweme10, str2);
        C20552315bV.LIZ = System.currentTimeMillis();
        C20552315bV.LIZIZ = true;
    }

    public void LJIIZILJ() {
        C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
        C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
        Aweme aweme = this.LL;
        if (c20285414YyLIZ.LIZLLL(this.LLILZ, aweme != null ? aweme.getAid() : null)) {
            C20285414Yy c20285414YyLIZ2 = C988000bok.LIZ();
            Aweme aweme2 = this.LL;
            C20283314Yd c20283314YdLIZIZ = c20285414YyLIZ2.LIZIZ(aweme2 != null ? aweme2.getAid() : null);
            if (c20283314YdLIZIZ == null) {
                c20283314YdLIZIZ = new C20283314Yd();
            }
            LJIILJJIL(c20283314YdLIZIZ, EnumC20283814Yi.CLICK_VIDEO, null);
        }
    }

    @Override // X.InterfaceC690490R6p
    public void LJJLJLI() {
        if (!this.LLJ.isEmpty()) {
            C20554315bp.LIZIZ.LIZ(EnumC20654715s1.SURVEY_CARD, new InterfaceC1273504yb() { // from class: X.11Wc
                @Override // X.InterfaceC1273504yb
                public final void ac(String str, Map<String, Object> map) {
                    Object obj = map.get("aweme_id");
                    String aid = null;
                    if (!(obj instanceof String)) {
                        obj = null;
                    }
                    Aweme aweme = this.LL.LL;
                    if (aweme != null) {
                        aid = aweme.getAid();
                    }
                    if (!Intrinsics.LJFF(obj, aid)) {
                        return;
                    }
                    List<? extends Function1<? super String, Boolean>> list = this.LL.LLJ;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        return;
                    }
                    Iterator<? extends Function1<? super String, Boolean>> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (it2.next().invoke(str).booleanValue()) {
                            this.LL.LLIZLLLIL = Boolean.TRUE;
                            return;
                        }
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC690490R6p
    public void g2() {
        C20554315bp.LIZIZ.LJIIL(EnumC20654715s1.SURVEY_CARD);
    }

    public void LJII(Aweme aweme) {
        String mainSurveyKey;
        FeedSurveyConfig feedSurveyConfig;
        List<SignalRule> list;
        Function1<String, Boolean> function1Invoke;
        Question[] questionArr;
        this.LL = aweme;
        C14ZW.LIZ.getClass();
        this.LLILLJJLI = C14ZW.LJ(aweme);
        this.LLILLL = C14Z4.LIZ(aweme);
        this.LLILZ = C14ZW.LIZLLL(aweme);
        this.LLILZIL = C14ZW.LIZIZ(aweme);
        FeedSurvey feedSurvey = this.LLILLJJLI;
        if (feedSurvey != null && (questionArr = feedSurvey.questions) != null && questionArr.length != 0) {
            this.LLILZLL = questionArr[0];
        }
        Aweme aweme2 = this.LL;
        if (aweme2 != null) {
            mainSurveyKey = AwemeExtKt.getMainSurveyKey(aweme2);
        } else {
            mainSurveyKey = null;
        }
        C14ZG c14zgLJII = C14ZW.LJII(mainSurveyKey);
        if (c14zgLJII != null && (feedSurveyConfig = c14zgLJII.LJI) != null && (list = feedSurveyConfig.surveySignalRule) != null) {
            ArrayList<SignalRule> arrayList = new ArrayList();
            for (SignalRule signalRule : list) {
                SignalRule signalRule2 = signalRule;
                if (signalRule2.name != null && signalRule2.value != null) {
                    arrayList.add(signalRule);
                }
            }
            this.LLIZLLLIL = Boolean.FALSE;
            ArrayList arrayList2 = new ArrayList();
            for (SignalRule signalRule3 : arrayList) {
                Function1<SignalRule, Function1<String, Boolean>> function1 = C1D3G.LIZ.get(signalRule3.name);
                if (function1 != null && (function1Invoke = function1.invoke(signalRule3)) != null) {
                    arrayList2.add(function1Invoke);
                }
            }
            this.LLJ = arrayList2;
            return;
        }
        this.LLJ = C13BV.INSTANCE;
        this.LLIZLLLIL = null;
    }

    @Override // X.InterfaceC690490R6p
    public final void LJIIL(C1049060dPE c1049060dPE) {
        C1049070dPF.LIZ(this, c1049060dPE);
    }

    public final void LJIILL(EnumC20283814Yi enumC20283814Yi) {
        String aid;
        String aid2;
        C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
        C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
        Aweme aweme = this.LL;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (c20285414YyLIZ.LIZLLL(this.LLILZ, aid)) {
            C20285414Yy c20285414YyLIZ2 = C988000bok.LIZ();
            Aweme aweme2 = this.LL;
            if (aweme2 != null) {
                aid2 = aweme2.getAid();
            } else {
                aid2 = null;
            }
            C20283314Yd c20283314YdLIZIZ = c20285414YyLIZ2.LIZIZ(aid2);
            if (c20283314YdLIZIZ == null) {
                c20283314YdLIZIZ = new C20283314Yd();
            }
            LJIILJJIL(c20283314YdLIZIZ, enumC20283814Yi, null);
        }
    }

    public void LJIILLIIL(Option option) {
        String aid;
        C692060RCq.LIZIZ(this.LL);
        C20287114Zp c20287114Zp = C20287114Zp.LIZ;
        Aweme aweme = this.LL;
        EnumC20283814Yi enumC20283814Yi = EnumC20283814Yi.SUBMIT;
        c20287114Zp.getClass();
        C20287114Zp.LIZJ(enumC20283814Yi.getType(), aweme, new Option[]{option});
        C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
        C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
        Aweme aweme2 = this.LL;
        String aid2 = null;
        if (aweme2 != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        C20283314Yd c20283314YdLIZIZ = c20285414YyLIZ.LIZIZ(aid);
        if (c20283314YdLIZIZ == null) {
            c20283314YdLIZIZ = new C20283314Yd();
        }
        LJIILJJIL(c20283314YdLIZIZ, enumC20283814Yi, new Option[]{option});
        C20285414Yy c20285414YyLIZ2 = C988000bok.LIZ();
        Aweme aweme3 = this.LL;
        if (aweme3 != null) {
            aid2 = aweme3.getAid();
        }
        c20285414YyLIZ2.LJII(aid2, new C14Z2(this.LLILZ, false));
    }

    @Override // X.InterfaceC690000R4s
    public void LJ(Aweme aweme, boolean z) {
        String aid;
        String aid2;
        String aid3 = null;
        if (z) {
            C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
            C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
            Aweme aweme2 = this.LL;
            if (aweme2 != null) {
                aid3 = aweme2.getAid();
            }
            if (c20285414YyLIZ.LIZLLL(C14Z5.BACKGROUND.getType(), aid3) && !C20552315bV.LIZIZ) {
                C20552315bV.LIZ = System.currentTimeMillis();
                C20552315bV.LIZIZ = true;
                return;
            }
            return;
        }
        C01GW<C20285414Yy> c01gw2 = C20285414Yy.LIZLLL;
        C20285414Yy c20285414YyLIZ2 = C988000bok.LIZ();
        Aweme aweme3 = this.LL;
        if (aweme3 != null) {
            aid = aweme3.getAid();
        } else {
            aid = null;
        }
        if (c20285414YyLIZ2.LIZLLL(this.LLILZ, aid)) {
            C20285414Yy c20285414YyLIZ3 = C988000bok.LIZ();
            Aweme aweme4 = this.LL;
            if (aweme4 != null) {
                aid2 = aweme4.getAid();
            } else {
                aid2 = null;
            }
            C20283314Yd c20283314YdLIZIZ = c20285414YyLIZ3.LIZIZ(aid2);
            if (c20283314YdLIZIZ == null) {
                c20283314YdLIZIZ = new C20283314Yd();
            }
            LJIILJJIL(c20283314YdLIZIZ, EnumC20283814Yi.BACKGROUND, null);
        }
    }

    public final void LJIJ(EnumC20283814Yi enumC20283814Yi, Option[] optionArr) {
        String str;
        String strLJJJ;
        Integer numValueOf;
        Aweme aweme = this.LL;
        if (aweme != null && this.LLILLJJLI != null) {
            C14ZT c14zt = C14ZT.LIZ;
            C14Z0 c14z0 = this.LLILLL;
            String lowerCase = enumC20283814Yi.name().toLowerCase(Locale.ENGLISH);
            FeedSurvey feedSurvey = this.LLILLJJLI;
            String strLJJJ2 = null;
            if (feedSurvey != null) {
                str = feedSurvey.id;
            } else {
                str = null;
            }
            c14zt.getClass();
            if (optionArr != null && optionArr.length != 0) {
                try {
                    strLJJJ = C13LQ.LJJJ(optionArr, ",", null, null, AFwS274S0000000_30.get$arr$(243), 30);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    new C20293414aq("mob").LJ("build multi options error");
                    strLJJJ = "";
                }
            } else {
                strLJJJ = "";
            }
            C14Z9 c14z9 = C14ZA.Companion;
            Question question = this.LLILZLL;
            if (question != null) {
                numValueOf = Integer.valueOf(question.type);
            } else {
                numValueOf = null;
            }
            c14z9.getClass();
            String strLIZ = C14Z9.LIZ(numValueOf);
            if (optionArr != null) {
                strLJJJ2 = C13LQ.LJJJ(optionArr, null, null, null, AFwS274S0000000_30.get$arr$(275), 31);
            }
            C14ZT.LJIIIIZZ(c14zt, aweme, c14z0, lowerCase, str, strLJJJ, strLIZ, strLJJJ2, 64);
        }
    }

    @Override // X.InterfaceC690000R4s
    public void LJIIJJI(EnumC20283814Yi enumC20283814Yi, Aweme aweme, boolean z) {
        String aid;
        String aid2;
        C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
        C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
        Aweme aweme2 = this.LL;
        if (aweme2 != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        if (c20285414YyLIZ.LIZLLL(this.LLILZ, aid)) {
            C20285414Yy c20285414YyLIZ2 = C988000bok.LIZ();
            Aweme aweme3 = this.LL;
            if (aweme3 != null) {
                aid2 = aweme3.getAid();
            } else {
                aid2 = null;
            }
            C20283314Yd c20283314YdLIZIZ = c20285414YyLIZ2.LIZIZ(aid2);
            if (c20283314YdLIZIZ == null) {
                c20283314YdLIZIZ = new C20283314Yd();
            }
            LJIILJJIL(c20283314YdLIZIZ, EnumC20283814Yi.SWIPE, null);
        }
    }

    public final void LJIILJJIL(C20283314Yd c20283314Yd, EnumC20283814Yi enumC20283814Yi, Option[] optionArr) {
        String aid;
        C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
        C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
        Aweme aweme = this.LL;
        String aid2 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (c20285414YyLIZ.LIZLLL(C14Z5.BACKGROUND.getType(), aid) && C20552315bV.LIZIZ) {
            if (EnumC20283814Yi.SUBMIT == enumC20283814Yi || EnumC20283814Yi.SWIPE == enumC20283814Yi || EnumC20283814Yi.BACKGROUND == enumC20283814Yi || EnumC20283814Yi.CLICK_VIDEO == enumC20283814Yi || EnumC20283814Yi.CANCEL == enumC20283814Yi) {
                C20552315bV.LJ(System.currentTimeMillis() - C20552315bV.LIZ, this.LL);
            }
            C20552315bV.LIZIZ = false;
        }
        switch (C20283414Ye.LIZ[enumC20283814Yi.ordinal()]) {
            case 1:
                if (c20283314Yd.LJII) {
                    return;
                }
                c20283314Yd.LJII = true;
                c20283314Yd.LJ = true;
                c20283314Yd.LJIIIIZZ = true;
                LJIJ(enumC20283814Yi, optionArr);
                break;
                break;
            case 2:
                if (c20283314Yd.LJ) {
                    return;
                }
                c20283314Yd.LJ = true;
                LJIJ(enumC20283814Yi, null);
                break;
                break;
            case 3:
                if (c20283314Yd.LJIIIIZZ) {
                    return;
                }
                c20283314Yd.LJIIIIZZ = true;
                LJIJ(enumC20283814Yi, null);
                break;
                break;
            case 4:
                if (c20283314Yd.LJIIJ) {
                    return;
                }
                c20283314Yd.LJIIJ = true;
                LJIJ(enumC20283814Yi, null);
                break;
                break;
            case 5:
                if (c20283314Yd.LIZJ) {
                    return;
                }
                c20283314Yd.LIZJ = true;
                LJIJ(enumC20283814Yi, null);
                break;
                break;
            case 6:
                if (c20283314Yd.LIZLLL) {
                    return;
                }
                c20283314Yd.LIZLLL = true;
                LJIJ(enumC20283814Yi, null);
                break;
                break;
            default:
                return;
        }
        C20285414Yy c20285414YyLIZ2 = C988000bok.LIZ();
        Aweme aweme2 = this.LL;
        if (aweme2 != null) {
            aid2 = aweme2.getAid();
        }
        c20285414YyLIZ2.LJFF(aid2, c20283314Yd);
    }
}

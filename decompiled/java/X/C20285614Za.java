package X;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.ss.android.ugc.aweme.IEcosystemService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import com.ss.android.ugc.aweme.feed.model.survey.ReplaceInfo;
import com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.pns.feedsafety.api.survey.PNSSurveyService;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14Za, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20285614Za extends AbstractC20284914Yt {
    public static final /* synthetic */ int LLJJJJ = 0;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJI;
    public Context LLJILJIL;
    public View LLJILJILJ;
    public View LLJILLL;
    public View LLJJ;
    public View LLJJI;
    public View LLJJIII;
    public View LLJJIJI;
    public InterfaceC1581890rGd LLJJIJIIJIL;
    public C21610619ho LLJJIJIL;
    public final C20293414aq LLJIJIL = new C20293414aq("commonForceVideoLynx");
    public final C20286014Ze LLJJJ = new InterfaceC20294814b4() { // from class: X.14Ze
        @Override // X.InterfaceC20294814b4
        public final boolean LIZ() {
            boolean zIsShowing = this.LIZ.isShowing();
            this.LIZ.LLJIJIL.LJIIJJI(new C020T(zIsShowing, 3));
            return zIsShowing;
        }
    };
    public EnumC19410610wq LLJJJIL = EnumC19410610wq.DEFAULT;

    @Override // X.AbstractC20284914Yt, X.InterfaceC690490R6p
    public final void LIZ() {
        LJIJI(false);
        super.LIZ();
        C622680Oba.LIZLLL(this);
        if (C2552409zO.LIZ) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
            }
            this.LLJI = null;
        }
    }

    @Override // X.InterfaceC690490R6p
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC690490R6p
    public final void LIZJ() {
        C1AV2 c1av2LIZ = C1AV3.LIZ("3", "PGC", null, "survey_lynx");
        View view = this.LLJILJILJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LLJJ;
        if (view2 != null) {
            C2180521AVm.LIZLLL(view2, 0, c1av2LIZ);
        }
        View view3 = this.LLJJIII;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(0, view3);
        }
        View view4 = this.LLJJIJI;
        if (view4 != null) {
            C2180521AVm.LIZLLL(view4, 0, c1av2LIZ);
        }
        this.LLJJJIL = EnumC19410610wq.DEFAULT;
    }

    @Override // X.InterfaceC690490R6p
    public final void LJI() {
        C1AV2 c1av2LIZ = C1AV3.LIZ("2", "PGC", null, "survey_lynx");
        View view = this.LLJJ;
        if (view != null) {
            C2180521AVm.LIZLLL(view, 8, c1av2LIZ);
        }
        View view2 = this.LLJJIII;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        View view3 = this.LLJJIJI;
        if (view3 != null) {
            C2180521AVm.LIZLLL(view3, 8, c1av2LIZ);
        }
    }

    @Override // X.AbstractC20284914Yt, X.InterfaceC690000R4s
    public final void LJIILIIL() {
        String str;
        String str2;
        String aid;
        Aweme aweme = this.LL;
        if (aweme == null || !AwemeBizExtKt.isSubAweme(aweme)) {
            return;
        }
        C20647815qu c20647815qu = C20647815qu.LIZ;
        FeedSurvey feedSurvey = this.LLILLJJLI;
        String str3 = "";
        if (feedSurvey == null || (str = feedSurvey.surveyKey) == null) {
            str = "";
        }
        Aweme aweme2 = this.LL;
        if (aweme2 != null && (aid = aweme2.getAid()) != null) {
            str3 = aid;
        }
        Aweme aweme3 = this.LL;
        String requestId = aweme3 != null ? aweme3.getRequestId() : null;
        c20647815qu.getClass();
        C20647815qu.LIZLLL(str, str3, requestId);
        C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
        C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
        Aweme aweme4 = this.LL;
        if (c20285414YyLIZ.LIZLLL(C14Z5.BACKGROUND.getType(), aweme4 != null ? aweme4.getAid() : null) && !C20552315bV.LIZIZ) {
            Aweme aweme5 = this.LL;
            FeedSurvey feedSurvey2 = this.LLILLJJLI;
            if (feedSurvey2 == null || (str2 = feedSurvey2.surveyKey) == null) {
                str2 = "-4";
            }
            C20552315bV.LIZLLL(aweme5, str2);
            C20552315bV.LIZ = System.currentTimeMillis();
            C20552315bV.LIZIZ = true;
        }
        C20291314aV c20291314aV = C20291314aV.LIZ;
        Aweme aweme6 = this.LL;
        c20291314aV.getClass();
        C20291314aV.LJIILJJIL(aweme6);
        C622680Oba.LIZJ(this);
    }

    @Override // X.InterfaceC690490R6p
    public final boolean isShowing() {
        View view = this.LLJILJILJ;
        return view != null && view.getVisibility() == 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.14Ze] */
    public C20285614Za() {
        C622680Oba.LIZJ(this);
    }

    public final void LJIJI(boolean z) {
        boolean z2;
        C20286014Ze c20286014Ze;
        boolean z3 = C2528709vZ.LIZ;
        if (z && z3) {
            z2 = true;
        } else {
            z2 = false;
        }
        C21610619ho c21610619ho = this.LLJJIJIL;
        this.LLJIJIL.LJIIJJI(new C20285914Zd(z, z3, z2, c21610619ho));
        if (c21610619ho != null) {
            if (z2) {
                c20286014Ze = this.LLJJJ;
            } else {
                c20286014Ze = null;
            }
            c21610619ho.setOnChildScrollUpCallback(c20286014Ze);
        }
    }

    @C14EU
    public final void onRemoveCurrentFeedEvent(C0OX4 c0ox4) {
        String str;
        String aid;
        String aid2;
        SurveyInfo surveyInfo;
        LJIJI(false);
        C1440005kM.LIZ(new C1210880hcE("homepage_hot", "FUNCTION_FROM_DEFAULT", "lynx_common_force_video", this.LL));
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
        }
        C692060RCq.LIZIZ(this.LL);
        C20291314aV c20291314aV = C20291314aV.LIZ;
        Aweme aweme = this.LL;
        String str2 = "";
        if (aweme == null || (surveyInfo = aweme.getSurveyInfo()) == null || (str = surveyInfo.surveyKey) == null) {
            str = "";
        }
        c20291314aV.getClass();
        C20291314aV.LJIIL(str);
        C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
        C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
        Aweme aweme2 = this.LL;
        String aid3 = null;
        if (aweme2 != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        c20285414YyLIZ.LJII(aid, new C14Z2(this.LLILZ, false));
        Aweme aweme3 = this.LL;
        if (aweme3 != null && (aid2 = aweme3.getAid()) != null) {
            str2 = aid2;
        }
        C20291314aV.LJIIL(str2);
        C20285414Yy c20285414YyLIZ2 = C988000bok.LIZ();
        Aweme aweme4 = this.LL;
        if (aweme4 != null) {
            aid3 = aweme4.getAid();
        }
        c20285414YyLIZ2.LJII(aid3, new C14Z2(this.LLILZ, false));
    }

    @Override // X.AbstractC20284914Yt, X.InterfaceC690000R4s
    public final void LJ(Aweme aweme, boolean z) {
        String aid;
        if (z) {
            C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
            C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
            Aweme aweme2 = this.LL;
            if (aweme2 != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            if (c20285414YyLIZ.LIZLLL(C14Z5.BACKGROUND.getType(), aid) && !C20552315bV.LIZIZ) {
                C20552315bV.LIZ = System.currentTimeMillis();
                C20552315bV.LIZIZ = true;
            }
        }
    }

    @Override // X.AbstractC20284914Yt, X.InterfaceC690000R4s
    public final void LJIIJJI(EnumC20283814Yi enumC20283814Yi, Aweme aweme, boolean z) {
        C622680Oba.LIZLLL(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC690490R6p
    public final void LJIIJ(ViewStub viewStub, Context context, Aweme aweme, View view, View view2, View view3, View view4, boolean z, AbstractC19368810q6 abstractC19368810q6) throws JSONException {
        String str;
        boolean z2;
        KeyEvent.Callback callbackFindViewById;
        InterfaceC1581890rGd interfaceC1581890rGd;
        C21610619ho c21610619ho;
        String str2;
        Object adId;
        String advId;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        SurveyInfo surveyInfo;
        SurveyInfo surveyInfo2;
        ReplaceInfo replaceInfo;
        Question question;
        Option[] optionArr;
        Question[] questionArr;
        String str3;
        Activity activity;
        View viewLJLLLL;
        View viewFindViewById;
        if (context == null || aweme == null) {
            return;
        }
        LJII(aweme);
        FeedSurvey feedSurvey = this.LLILLJJLI;
        if (feedSurvey != null && feedSurvey.questions != null) {
            C1387620mDI.LIZ.getClass();
            if (!C1387620mDI.LJI(aweme)) {
                LIZJ();
                C20291314aV c20291314aV = C20291314aV.LIZ;
                FeedSurvey feedSurvey2 = this.LLILLJJLI;
                String strLJJLIIIJ = "";
                if (feedSurvey2 == null || (str = feedSurvey2.surveyKey) == null) {
                    str = "";
                }
                c20291314aV.getClass();
                if (C20291314aV.LJII(str)) {
                    return;
                }
                this.LLJILJIL = context;
                this.LL = aweme;
                this.LLJJ = view;
                this.LLJJI = view2;
                this.LLJJIII = view3;
                this.LLJJIJI = view4;
                if (AwemeBizExtKt.isSubAweme(aweme)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    C20285114Yv c20285114Yv = C20285114Yv.LIZ;
                    int i = this.LLILZ;
                    c20285114Yv.getClass();
                    this.LLJJJIL = C20285114Yv.LIZIZ(i);
                } else {
                    this.LLJJJIL = EnumC19410610wq.DEFAULT;
                    View view5 = this.LLJILJILJ;
                    if (view5 != null) {
                        C786410Ut5.LJLLLLLL(8, view5);
                    }
                    if (view != null) {
                        C786410Ut5.LJLLLLLL(0, view);
                    }
                }
                if (this.LLJJJIL == EnumC19410610wq.DEFAULT) {
                    return;
                }
                View view6 = this.LLJILJILJ;
                if (view6 == null) {
                    if (viewStub != null) {
                        viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
                    } else {
                        viewLJLLLL = null;
                    }
                    this.LLJILJILJ = viewLJLLLL;
                    if (viewLJLLLL != null) {
                        viewFindViewById = viewLJLLLL.findViewById(R.id.ex3);
                    } else {
                        viewFindViewById = null;
                    }
                    this.LLJILLL = viewFindViewById;
                } else {
                    C786410Ut5.LJLLLLLL(0, view6);
                }
                Context context2 = this.LLJILJIL;
                if ((context2 instanceof C19EG) && (activity = (Activity) context2) != null) {
                    callbackFindViewById = activity.findViewById(R.id.t25);
                } else {
                    callbackFindViewById = null;
                }
                if (callbackFindViewById instanceof InterfaceC1581890rGd) {
                    interfaceC1581890rGd = (InterfaceC1581890rGd) callbackFindViewById;
                } else {
                    interfaceC1581890rGd = 0;
                }
                this.LLJJIJIIJIL = interfaceC1581890rGd;
                if (interfaceC1581890rGd instanceof C21610619ho) {
                    c21610619ho = (C21610619ho) interfaceC1581890rGd;
                } else {
                    c21610619ho = null;
                }
                this.LLJJIJIL = c21610619ho;
                LJIJI(true);
                C1AV2 c1av2LIZ = C1AV3.LIZ("1", "PGC", null, "survey_lynx");
                View view7 = this.LLJJ;
                if (view7 != null) {
                    C2180521AVm.LIZLLL(view7, 8, c1av2LIZ);
                }
                View view8 = this.LLJJIII;
                if (view8 != null) {
                    C786410Ut5.LJLLLLLL(8, view8);
                }
                View view9 = this.LLJJIJI;
                if (view9 != null) {
                    C2180521AVm.LIZLLL(view9, 8, c1av2LIZ);
                }
                C20293414aq c20293414aq = C20286214Zg.LIZ;
                Aweme aweme2 = this.LL;
                C20286214Zg.LIZ.LJIIJJI(new AwS574S0100000_30(aweme2, 320));
                if (aweme2 != null && (surveyInfo = aweme2.getSurveyInfo()) != null && surveyInfo.replacement != null) {
                    this.LLJIJIL.LJIIJJI(new AwS574S0100000_30(this, 306));
                    Aweme aweme3 = this.LL;
                    if (aweme3 != null && (surveyInfo2 = aweme3.getSurveyInfo()) != null && (replaceInfo = surveyInfo2.replacement) != null && (question = replaceInfo.question) != null && (optionArr = question.options) != null && this.LLJILJIL != null) {
                        Question question2 = this.LLILZLL;
                        if (question2 != null && (str3 = question2.title) != null && C123100dR.LIZ(str3)) {
                            this.LLJIJIL.LJIIJJI(new AwS573S0100000_29(this, 807));
                            Question question3 = this.LLILZLL;
                            if (question3 != null) {
                                question3.setOptions(optionArr);
                            }
                            this.LLJIJIL.LJIIJJI(new AwS573S0100000_29(this, StrategyCenter.ENABLE_SMART_SERVICE));
                        } else {
                            FeedSurvey feedSurvey3 = this.LLILLJJLI;
                            if (feedSurvey3 != null && (questionArr = feedSurvey3.questions) != null) {
                                questionArr[0] = question;
                            }
                            this.LLILZLL = question;
                        }
                    }
                }
                String strLIZJ = C20286514Zj.LIZJ(aweme.getAid());
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJI;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
                }
                IEcosystemService iEcosystemService = (IEcosystemService) ServiceManager.get().getService(IEcosystemService.class);
                FeedSurvey feedSurvey4 = this.LLILLJJLI;
                if (feedSurvey4 == null || (str2 = feedSurvey4.templateUrl) == null) {
                    str2 = "";
                }
                JSONObject jSONObject = new JSONObject();
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd == null || (adId = awemeRawAd.getAdId()) == null) {
                    adId = "";
                }
                jSONObject.put("adid", adId);
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 == null || (advId = awemeRawAd2.getAdvId()) == null) {
                    advId = "";
                }
                jSONObject.put("adv_id", advId);
                C1209680haI c1209680haI = new C1209680haI(jSONObject, 29);
                if (strLIZJ == null) {
                    strLIZJ = "";
                }
                c1209680haI.LIZJ.put("aweme_id", strLIZJ);
                String mainSurveyKey = AwemeExtKt.getMainSurveyKey(aweme);
                if (mainSurveyKey == null) {
                    mainSurveyKey = "";
                }
                c1209680haI.LIZJ.put("survey_id", mainSurveyKey);
                String mainSurveyKey2 = AwemeExtKt.getMainSurveyKey(aweme);
                if (mainSurveyKey2 == null) {
                    mainSurveyKey2 = "";
                }
                c1209680haI.LIZJ.put("survey_key", mainSurveyKey2);
                C1546210qL5.LIZ.getClass();
                c1209680haI.LIZJ.put("tt_tab_height", Double.valueOf(((double) C679280Qkg.LIZIZ(Integer.valueOf(C1546210qL5.LJII(context)))) + 58.0d));
                int i2 = C14LC.LJIILLIIL;
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C14LC.LJIIJ)));
                if (i2 <= 0) {
                    i2 = iLIZIZ;
                }
                c1209680haI.LIZJ.put("tt_bottom_height", Integer.valueOf(C679280Qkg.LIZIZ(Integer.valueOf(i2))));
                String mainSurveyKey3 = AwemeExtKt.getMainSurveyKey(aweme);
                if (mainSurveyKey3 == null) {
                    mainSurveyKey3 = "";
                }
                PNSSurveyService pNSSurveyServiceLJIILLIIL = ComplianceServiceProvider.LJIILLIIL();
                if (pNSSurveyServiceLJIILLIIL != null && mainSurveyKey3.length() != 0 && Intrinsics.LJFF(pNSSurveyServiceLJIILLIIL.LJ(), mainSurveyKey3)) {
                    strLJJLIIIJ = C13LP.LJJLIIIJ(pNSSurveyServiceLJIILLIIL.LIZJ(), ",", null, null, 0, null, null, 62);
                    pNSSurveyServiceLJIILLIIL.LIZ(mainSurveyKey3);
                }
                c1209680haI.LIZJ.put("topics", strLJJLIIIJ);
                c1209680haI.LIZJ.put("roma_enable_with_param", "1");
                c1209680haI.LIZLLL = Collections.singletonList(C0OX3.class);
                c1209680haI.LJ = true;
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJFF = iEcosystemService.LJFF(context, str2, "commonForceVideoLynx", c1209680haI.LIZ(), null);
                if (!(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJFF instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB)) {
                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJFF = null;
                }
                this.LLJI = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJFF;
                View view10 = this.LLJILLL;
                if ((view10 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) view10) != null) {
                    C786410Ut5.LJJJJI(viewGroup2);
                }
                View view11 = this.LLJILLL;
                if ((view11 instanceof ViewGroup) && (viewGroup = (ViewGroup) view11) != null) {
                    viewGroup.addView(this.LLJI, new ViewGroup.LayoutParams(-1, -1));
                }
            }
        }
    }
}

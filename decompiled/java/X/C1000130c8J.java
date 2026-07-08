package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ad.feed.survey.FeedAdLynxSurvey;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService;
import com.ss.android.ugc.aweme.commercialize.model.AdQuestionnaire;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.concurrent.CopyOnWriteArrayList;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0c8J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1000130c8J implements InterfaceC987560bo2, Observer<C0RD4> {
    public final ViewStub LL;
    public FeedAdLynxSurvey LLILLJJLI;
    public DataCenter LLILLL;
    public FrameLayout LLILZ;
    public Aweme LLILZIL;
    public Long LLILZLL;
    public final Keva LLIZ = Keva.getRepo("feed_ad_survey_repo");
    public boolean LLIZLLLIL;
    public C987980boi LLJ;
    public final InterfaceC1000280c8Y LLJI;

    @Override // X.InterfaceC987560bo2
    public final void LIZ() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        Lifecycle lifecycle;
        FeedAdLynxSurvey feedAdLynxSurvey = this.LLILLJJLI;
        if (feedAdLynxSurvey != null) {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) feedAdLynxSurvey.LLIZ.getValue();
            if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.removeObserver(feedAdLynxSurvey);
            }
            feedAdLynxSurvey.LIZIZ();
            feedAdLynxSurvey.LLJILLL = false;
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = feedAdLynxSurvey.LLJIJIL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2);
            }
            View view = feedAdLynxSurvey.LLJ;
            if ((view instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) view) != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
            }
            this.LLILLJJLI = null;
        }
    }

    public final boolean LIZIZ() {
        Long l;
        AwemeRawAd awemeRawAd;
        AdQuestionnaire adQuestionnaire;
        Integer num;
        if (this.LLILZLL == null) {
            try {
                this.LLILZLL = Long.valueOf(this.LLIZ.getLong("feed_ad_survey_last_show_time", -1L));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
                C2344809Gs.LJI(e);
            }
        }
        Long l2 = this.LLILZLL;
        if ((l2 != null && l2.longValue() == -1) || (l = this.LLILZLL) == null) {
            return true;
        }
        long jLongValue = l.longValue();
        Aweme aweme = this.LLILZIL;
        return System.currentTimeMillis() - jLongValue > ((long) (((aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (adQuestionnaire = awemeRawAd.getAdQuestionnaire()) == null || (num = adQuestionnaire.showInterval) == null) ? 259200 : num.intValue()) * LSPassThroughRecordSizeConfig.DEFAULT));
    }

    @Override // X.InterfaceC987560bo2
    public final void preload() {
        FeedAdLynxSurvey feedAdLynxSurvey;
        String str;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        InterfaceC1000280c8Y interfaceC1000280c8Y = this.LLJI;
        if (interfaceC1000280c8Y == null || !interfaceC1000280c8Y.LJIIIIZZ(this.LLILZIL) || !LIZIZ() || this.LLIZLLLIL || (feedAdLynxSurvey = this.LLILLJJLI) == null) {
            return;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = feedAdLynxSurvey.LLJIJIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getKitView() != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = feedAdLynxSurvey.LLJIJIL) != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        }
        feedAdLynxSurvey.LLJILLL = false;
        AdQuestionnaire adQuestionnaire = feedAdLynxSurvey.LLILZIL;
        if (adQuestionnaire == null || (str = adQuestionnaire.schema) == null) {
            return;
        }
        Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
        n nVar = new n();
        AwemeRawAd awemeRawAd = feedAdLynxSurvey.LLILZ;
        if (awemeRawAd != null) {
            Long adId = awemeRawAd.getAdId();
            nVar.LJJIIJ("adId", adId != null ? adId.toString() : null);
            nVar.LJJIIJ("creativeId", awemeRawAd.getCreativeIdStr());
            nVar.LJJIIJ("logExtra", awemeRawAd.getLogExtra());
            Long groupId = awemeRawAd.getGroupId();
            nVar.LJJIIJ("groupId", groupId != null ? groupId.toString() : null);
            AdQuestionnaire adQuestionnaire2 = awemeRawAd.getAdQuestionnaire();
            nVar.LJJIIJ("content", adQuestionnaire2 != null ? adQuestionnaire2.content : null);
        }
        nVar.LJJIII(Integer.valueOf(C444960Hcc.LIZJ(feedAdLynxSurvey.LLILLJJLI.getContext()) ? 1 : 0), "isRTL");
        builderBuildUpon.appendQueryParameter("initialData", nVar.toString());
        InterfaceC999480c7G interfaceC999480c7G = feedAdLynxSurvey.LLJI;
        if (interfaceC999480c7G != null) {
            String string = builderBuildUpon.toString();
            Bundle bundle = new Bundle();
            Context context = feedAdLynxSurvey.LLILLJJLI.getContext();
            InterfaceC1000280c8Y interfaceC1000280c8Y2 = (InterfaceC1000280c8Y) feedAdLynxSurvey.LLIZLLLIL.getValue();
            if (interfaceC1000280c8Y2 != null) {
                interfaceC1000280c8Y2.LJIJJ(context, bundle, feedAdLynxSurvey.LLILLL);
            }
            AwemeRawAd awemeRawAd2 = feedAdLynxSurvey.LLILZ;
            C786410Ut5.LJJJI("bundle_native_site_custom_data", awemeRawAd2 != null ? awemeRawAd2.getNativeSiteCustomData() : null, bundle);
            interfaceC999480c7G.LIZ(bundle, string, C1000150c8L.LIZ().enableLynxSurvey);
        }
    }

    public C1000130c8J(ViewStub viewStub) {
        InterfaceC1000280c8Y interfaceC1000280c8Y;
        this.LL = viewStub;
        InterfaceC988500bpY interfaceC988500bpYQ = ((ICommercializeAdService) ServiceManager.get().getService(ICommercializeAdService.class)).Q(17);
        if (interfaceC988500bpYQ instanceof InterfaceC1000280c8Y) {
            interfaceC1000280c8Y = (InterfaceC1000280c8Y) interfaceC988500bpYQ;
        } else {
            interfaceC1000280c8Y = null;
        }
        this.LLJI = interfaceC1000280c8Y;
    }

    @Override // X.InterfaceC987560bo2
    public final void LJIIJ(DataCenter dataCenter) {
        this.LLILLL = dataCenter;
        if (dataCenter != null) {
            dataCenter.yQ2("ad_feed_on_page_selected", this, false);
            dataCenter.yQ2("ad_feed_on_page_unselected", this, false);
            dataCenter.yQ2("ad_video_on_resume_play", this, false);
            dataCenter.yQ2("ad_video_on_render_ready", this, false);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(C0RD4 c0rd4) {
        String str;
        DataCenter dataCenter;
        FeedAdLynxSurvey feedAdLynxSurvey;
        DataCenter dataCenter2;
        C0RD4 c0rd42 = c0rd4;
        InterfaceC1000280c8Y interfaceC1000280c8Y = this.LLJI;
        if (interfaceC1000280c8Y == null || !interfaceC1000280c8Y.LJIIIIZZ(this.LLILZIL) || c0rd42 == null || (str = c0rd42.LIZ) == null) {
            return;
        }
        switch (str.hashCode()) {
            case -1929582278:
                if (str.equals("ad_video_on_render_ready") && this.LLIZLLLIL && (dataCenter = this.LLILLL) != null) {
                    dataCenter.zQ2(null, "action_ad_pop_up_web_pause_video");
                    break;
                }
                break;
            case -1540531799:
                if (str.equals("ad_feed_on_page_unselected")) {
                    FeedAdLynxSurvey feedAdLynxSurvey2 = this.LLILLJJLI;
                    if (feedAdLynxSurvey2 != null) {
                        feedAdLynxSurvey2.LIZIZ();
                    }
                    FrameLayout frameLayout = this.LLILZ;
                    if (frameLayout != null) {
                        C786410Ut5.LJZ(8, frameLayout);
                    }
                    this.LLIZLLLIL = false;
                    this.LLJ = null;
                }
                break;
            case -1132409520:
                if (str.equals("ad_feed_on_page_selected") && (feedAdLynxSurvey = this.LLILLJJLI) != null) {
                    EventBus.LIZLLL().LJIJJ(feedAdLynxSurvey);
                    break;
                }
                break;
            case 2040441990:
                if (str.equals("ad_video_on_resume_play") && this.LLIZLLLIL && (dataCenter2 = this.LLILLL) != null) {
                    dataCenter2.zQ2(null, "action_ad_pop_up_web_pause_video");
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    @Override // X.InterfaceC987560bo2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJ(int r5, com.ss.android.ugc.aweme.feed.model.Aweme r6) {
        /*
            r4 = this;
            X.0c8Y r0 = r4.LLJI
            r3 = 0
            if (r0 == 0) goto L19
            boolean r1 = r0.LJIIIIZZ(r6)
            r0 = 1
            if (r1 != r0) goto L19
        Lc:
            r2 = 0
            if (r0 != 0) goto L1b
            r4.LLILZIL = r2
            com.ss.android.ugc.aweme.ad.feed.survey.FeedAdLynxSurvey r0 = r4.LLILLJJLI
            if (r0 == 0) goto L18
            r0.LIZ(r3, r2)
        L18:
            return
        L19:
            r0 = 0
            goto Lc
        L1b:
            r4.LLILZIL = r6
            android.view.ViewStub r0 = r4.LL
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L37
            android.view.ViewStub r1 = r4.LL
            r0 = 2131563424(0x7f0d13a0, float:1.8752305E38)
            r1.setLayoutResource(r0)
            android.view.ViewStub r0 = r4.LL
            android.view.View r0 = X.C786410Ut5.LJLLLL(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r4.LLILZ = r0
        L37:
            android.widget.FrameLayout r1 = r4.LLILZ
            if (r1 != 0) goto L3c
            return
        L3c:
            com.ss.android.ugc.aweme.ad.feed.survey.FeedAdLynxSurvey r0 = r4.LLILLJJLI
            if (r0 != 0) goto L47
            com.ss.android.ugc.aweme.ad.feed.survey.FeedAdLynxSurvey r0 = new com.ss.android.ugc.aweme.ad.feed.survey.FeedAdLynxSurvey
            r0.<init>(r4, r1)
            r4.LLILLJJLI = r0
        L47:
            com.ss.android.ugc.aweme.ad.feed.survey.FeedAdLynxSurvey r0 = r4.LLILLJJLI
            if (r0 == 0) goto L4e
            r0.LIZ(r5, r6)
        L4e:
            android.widget.FrameLayout r1 = r4.LLILZ
            if (r1 == 0) goto L57
            r0 = 8
            X.C786410Ut5.LJZ(r0, r1)
        L57:
            r4.LLIZLLLIL = r3
            r4.LLJ = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1000130c8J.LJJJJ(int, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // X.InterfaceC987560bo2
    public final boolean LJJJJI(int i, int i2, int i3) throws JSONException {
        FrameLayout frameLayout;
        boolean z;
        String str;
        AdQuestionnaire adQuestionnaire;
        Long adId;
        int i4;
        InterfaceC1541990qEH kitView;
        AwemeRawAd awemeRawAd;
        int i5;
        String str2;
        AdQuestionnaire adQuestionnaire2;
        AwemeRawAd awemeRawAd2;
        AdQuestionnaire adQuestionnaire3;
        InterfaceC1000280c8Y interfaceC1000280c8Y = this.LLJI;
        if (interfaceC1000280c8Y == null || !interfaceC1000280c8Y.LJIIIIZZ(this.LLILZIL) || (frameLayout = this.LLILZ) == null || this.LLIZLLLIL || !LIZIZ()) {
            return false;
        }
        FeedAdLynxSurvey feedAdLynxSurvey = this.LLILLJJLI;
        if (feedAdLynxSurvey != null && feedAdLynxSurvey.LLJILLL) {
            z = true;
        } else {
            z = false;
        }
        Long creativeId = null;
        if (!z) {
            Aweme aweme = this.LLILZIL;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "show_failed", awemeRawAd);
            Aweme aweme2 = this.LLILZIL;
            if (aweme2 != null && (awemeRawAd2 = aweme2.getAwemeRawAd()) != null && (adQuestionnaire3 = awemeRawAd2.getAdQuestionnaire()) != null) {
                i5 = adQuestionnaire3.id;
            } else {
                i5 = 0;
            }
            c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i5), "five_star_survey_id");
            c1022820ciuLIZLLL.LJII();
            Aweme aweme3 = this.LLILZIL;
            if (aweme3 != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    AwemeRawAd awemeRawAd3 = aweme3.getAwemeRawAd();
                    if (awemeRawAd3 != null && (adQuestionnaire2 = awemeRawAd3.getAdQuestionnaire()) != null) {
                        str2 = adQuestionnaire2.schema;
                    } else {
                        str2 = null;
                    }
                    jSONObject.put("feed_ad_survey_url", str2);
                    AwemeRawAd awemeRawAd4 = aweme3.getAwemeRawAd();
                    if (awemeRawAd4 != null) {
                        creativeId = awemeRawAd4.getCreativeId();
                    }
                    jSONObject.put("feed_ad_survey_creative_id", creativeId);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                }
                CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                C793770VBv.LJIIJJI("aweme_feed_ad_lynx_survey_show_error_rate", 1, jSONObject);
            }
            return false;
        }
        C786410Ut5.LJZ(0, frameLayout);
        long jCurrentTimeMillis = System.currentTimeMillis();
        FeedAdLynxSurvey feedAdLynxSurvey2 = this.LLILLJJLI;
        if (feedAdLynxSurvey2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("time", jCurrentTimeMillis);
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = feedAdLynxSurvey2.LLJIJIL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
                kitView.LIZ("ad_survey_show", jSONObject2);
            }
            feedAdLynxSurvey2.LLILZLL = jCurrentTimeMillis;
            feedAdLynxSurvey2.LLJILJILJ = "";
            DataCenter dataCenter = feedAdLynxSurvey2.LL.LLILLL;
            if (dataCenter != null) {
                dataCenter.zQ2(null, "action_ad_pop_up_web_pause_video");
            }
            C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("draw_ad", "othershow", feedAdLynxSurvey2.LLILZ);
            AwemeRawAd awemeRawAd5 = feedAdLynxSurvey2.LLILZ;
            if (awemeRawAd5 != null) {
                adId = awemeRawAd5.getAdId();
            } else {
                adId = null;
            }
            c1022820ciuLIZLLL2.LIZJ(adId, "ad_id");
            AdQuestionnaire adQuestionnaire4 = feedAdLynxSurvey2.LLILZIL;
            if (adQuestionnaire4 != null) {
                i4 = adQuestionnaire4.id;
            } else {
                i4 = 0;
            }
            c1022820ciuLIZLLL2.LIZIZ(Integer.valueOf(i4), "five_star_survey_id");
            c1022820ciuLIZLLL2.LJII();
        }
        this.LLILZLL = Long.valueOf(jCurrentTimeMillis);
        try {
            this.LLIZ.storeLong("feed_ad_survey_last_show_time", jCurrentTimeMillis);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1AF0.LJ(e2);
            C2344809Gs.LJI(e2);
        }
        this.LLIZLLLIL = true;
        this.LLJ = new C987980boi(i, i2, i3);
        Aweme aweme4 = this.LLILZIL;
        if (aweme4 != null) {
            JSONObject jSONObject3 = new JSONObject();
            try {
                AwemeRawAd awemeRawAd6 = aweme4.getAwemeRawAd();
                if (awemeRawAd6 != null && (adQuestionnaire = awemeRawAd6.getAdQuestionnaire()) != null) {
                    str = adQuestionnaire.schema;
                } else {
                    str = null;
                }
                jSONObject3.put("feed_ad_survey_url", str);
                AwemeRawAd awemeRawAd7 = aweme4.getAwemeRawAd();
                if (awemeRawAd7 != null) {
                    creativeId = awemeRawAd7.getCreativeId();
                }
                jSONObject3.put("feed_ad_survey_creative_id", creativeId);
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                C1AF0.LJ(e3);
            }
            CopyOnWriteArrayList<Runnable> copyOnWriteArrayList2 = C794240VDq.LIZ;
            C793770VBv.LJIIJJI("aweme_feed_ad_lynx_survey_show_error_rate", 0, jSONObject3);
        }
        return true;
    }
}

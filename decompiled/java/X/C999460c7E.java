package X;

import Y.ARunnableS116S0100000_16;
import android.net.Uri;
import android.os.Looper;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ad.feed.mask.FeedAdLynxMaskContainer;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.IAdTranslatableData;
import com.ss.android.ugc.aweme.feed.model.IAdTranslationData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS630S0100000_16;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0c7E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C999460c7E implements InterfaceC987390bnl, Observer<C0RD4> {
    public final ViewStub LL;
    public final FrameLayout LLILLJJLI;
    public FeedAdLynxMaskContainer LLILLL;
    public DataCenter LLILZ;
    public FrameLayout LLILZIL;
    public Aweme LLILZLL;
    public final InterfaceC1000280c8Y LLIZ;

    @Override // X.InterfaceC987390bnl
    public final void LIZ() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        FeedAdLynxMaskContainer feedAdLynxMaskContainer = this.LLILLL;
        if (feedAdLynxMaskContainer != null) {
            Lifecycle lifecycle = (Lifecycle) feedAdLynxMaskContainer.LLIZLLLIL.getValue();
            if (lifecycle != null) {
                lifecycle.removeObserver(feedAdLynxMaskContainer);
            }
            EventBus.LIZLLL().LJJI(feedAdLynxMaskContainer);
            if (feedAdLynxMaskContainer.LLJILJILJ) {
                return;
            }
            FrameLayout frameLayout = feedAdLynxMaskContainer.LLILLJJLI;
            if ((frameLayout instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) frameLayout) != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
            }
            feedAdLynxMaskContainer.LLJILLL = false;
            this.LLILLL = null;
        }
    }

    @Override // X.InterfaceC987390bnl
    public final void LJJIIJZLJL() {
        InterfaceC1541990qEH kitView;
        FeedAdLynxMaskContainer feedAdLynxMaskContainer = this.LLILLL;
        if (feedAdLynxMaskContainer != null) {
            FrameLayout frameLayout = feedAdLynxMaskContainer.LLILLJJLI;
            if (!(frameLayout instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) || (kitView = ((SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) frameLayout).getKitView()) == null) {
                return;
            }
            kitView.onHide();
        }
    }

    @Override // X.InterfaceC987390bnl
    public final void LJJIIZ() {
        InterfaceC1541990qEH kitView;
        FeedAdLynxMaskContainer feedAdLynxMaskContainer = this.LLILLL;
        if (feedAdLynxMaskContainer != null) {
            FrameLayout frameLayout = feedAdLynxMaskContainer.LLILLJJLI;
            if (!(frameLayout instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) || (kitView = ((SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) frameLayout).getKitView()) == null) {
                return;
            }
            kitView.onShow();
        }
    }

    @Override // X.InterfaceC987390bnl
    public final void preload() {
        FeedAdLynxMaskContainer feedAdLynxMaskContainer;
        String cardUrl;
        AwemeRawAd awemeRawAd;
        IAdTranslationData translationData;
        C997570c4B c997570c4BLIZIZ;
        C997600c4E c997600c4ELIZ;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2;
        FeedAdLynxMaskContainer feedAdLynxMaskContainer2;
        if (C583160Mu2.LJFF) {
            return;
        }
        if ((C290420BZw.LIZ() && (feedAdLynxMaskContainer2 = this.LLILLL) != null && feedAdLynxMaskContainer2.LLJILJILJ) || (feedAdLynxMaskContainer = this.LLILLL) == null) {
            return;
        }
        FrameLayout frameLayout = feedAdLynxMaskContainer.LLILLJJLI;
        JSONObject jSONObject = null;
        if ((frameLayout instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) frameLayout) != null && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView() != null) {
            FrameLayout frameLayout2 = feedAdLynxMaskContainer.LLILLJJLI;
            if ((frameLayout2 instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) frameLayout2) != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2);
            }
        }
        feedAdLynxMaskContainer.LLJILLL = false;
        CardStruct cardStruct = feedAdLynxMaskContainer.LLILZLL;
        if (cardStruct == null || (cardUrl = cardStruct.getCardUrl()) == null) {
            return;
        }
        Uri.Builder builderBuildUpon = UriProtector.parse(cardUrl).buildUpon();
        Aweme aweme = feedAdLynxMaskContainer.LLILZIL;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (translationData = awemeRawAd.getTranslationData()) != null && (c997570c4BLIZIZ = C997720c4Q.LIZIZ(translationData)) != null && (c997600c4ELIZ = c997570c4BLIZIZ.LIZ()) != null) {
            jSONObject = c997600c4ELIZ.LIZIZ;
        }
        Aweme aweme2 = feedAdLynxMaskContainer.LLILZIL;
        if (jSONObject == null) {
            jSONObject = feedAdLynxMaskContainer.LLIZ;
        }
        builderBuildUpon.appendQueryParameter("initialData", C999560c7O.LIZ(feedAdLynxMaskContainer.LLILLJJLI.getContext(), jSONObject, aweme2).toString());
        InterfaceC999480c7G interfaceC999480c7G = feedAdLynxMaskContainer.LLJI;
        if (interfaceC999480c7G != null) {
            interfaceC999480c7G.LIZ(C999560c7O.LIZIZ(feedAdLynxMaskContainer.LLILLJJLI.getContext(), feedAdLynxMaskContainer.LLILZIL), builderBuildUpon.toString(), C1000150c8L.LIZ().enableLynxMask);
        }
    }

    @Override // X.InterfaceC987390bnl
    public final boolean show() throws JSONException {
        FrameLayout frameLayout;
        FeedAdLynxMaskContainer feedAdLynxMaskContainer;
        C999810c7n c999810c7n;
        Aweme aweme = this.LLILZLL;
        if (aweme == null || !C1017070cZd.LLLII(aweme) || (frameLayout = this.LLILZIL) == null || C583160Mu2.LJFF || (feedAdLynxMaskContainer = this.LLILLL) == null || !feedAdLynxMaskContainer.LLJILLL) {
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("currentPlayedIndex", Integer.valueOf(C583160Mu2.LIZIZ));
        jSONObject.putOpt("playedIndices", C13LP.LLIIII(((LinkedHashMap) C583160Mu2.LIZ).keySet()).toString());
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendSubVideoStatusToFE: param= ");
        sbLIZ.append(jSONObject);
        C2188811AlT.LIZIZ(sbLIZ);
        feedAdLynxMaskContainer.LIZIZ("storyMaskShow", jSONObject);
        C786410Ut5.U4(frameLayout, 0.0f);
        C786410Ut5.LJZ(0, frameLayout);
        frameLayout.animate().alpha(1.0f).setDuration(150L).start();
        FeedAdLynxMaskContainer feedAdLynxMaskContainer2 = this.LLILLL;
        if (feedAdLynxMaskContainer2 != null) {
            if (C290420BZw.LIZ() && feedAdLynxMaskContainer2.LLJILJILJ && (c999810c7n = feedAdLynxMaskContainer2.LLJILJIL) != null) {
                c999810c7n.LJFF = true;
            }
            feedAdLynxMaskContainer2.LIZIZ("maskShow", null);
        }
        Aweme aweme2 = this.LLILZLL;
        String strGenerateAdLynxLogExtraAll = aweme2 != null ? ((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).generateAdLynxLogExtraAll(aweme2, ((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).generateTrackId(aweme2)) : "";
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("aweme_log", strGenerateAdLynxLogExtraAll);
        FeedAdLynxMaskContainer feedAdLynxMaskContainer3 = this.LLILLL;
        if (feedAdLynxMaskContainer3 != null) {
            feedAdLynxMaskContainer3.LIZIZ("sendAwemeLogEvent", jSONObject2);
        }
        C583160Mu2.LJFF = true;
        return true;
    }

    @Override // X.InterfaceC987390bnl
    public final boolean isShowing() {
        return C583160Mu2.LJFF;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    @Override // X.InterfaceC987390bnl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L16
            boolean r1 = X.C1017070cZd.LLLII(r5)
            r0 = 1
            if (r1 != r0) goto L16
        L9:
            r3 = 0
            if (r0 != 0) goto L18
            r4.LLILZLL = r3
            com.ss.android.ugc.aweme.ad.feed.mask.FeedAdLynxMaskContainer r0 = r4.LLILLL
            if (r0 == 0) goto L15
            r0.LIZ(r3)
        L15:
            return
        L16:
            r0 = 0
            goto L9
        L18:
            r4.LLILZLL = r5
            android.view.ViewStub r0 = r4.LL
            if (r0 == 0) goto L36
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L36
            android.view.ViewStub r1 = r4.LL
            r0 = 2131563420(0x7f0d139c, float:1.8752297E38)
            r1.setLayoutResource(r0)
            android.view.ViewStub r0 = r4.LL
            android.view.View r0 = X.C786410Ut5.LJLLLL(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r4.LLILZIL = r0
        L36:
            android.widget.FrameLayout r2 = r4.LLILZIL
            if (r2 != 0) goto L3b
            return
        L3b:
            com.ss.android.ugc.aweme.ad.feed.mask.FeedAdLynxMaskContainer r0 = r4.LLILLL
            if (r0 == 0) goto L57
            boolean r0 = X.C290420BZw.LIZ()
            if (r0 == 0) goto L66
            if (r5 == 0) goto L79
            java.lang.String r1 = r5.getAid()
        L4b:
            com.ss.android.ugc.aweme.ad.feed.mask.FeedAdLynxMaskContainer r0 = r4.LLILLL
            if (r0 == 0) goto L77
            java.lang.String r0 = r0.LLILZ
        L51:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L66
        L57:
            com.ss.android.ugc.aweme.ad.feed.mask.FeedAdLynxMaskContainer r1 = new com.ss.android.ugc.aweme.ad.feed.mask.FeedAdLynxMaskContainer
            android.widget.FrameLayout r0 = r4.LLILLJJLI
            if (r5 == 0) goto L61
            java.lang.String r3 = r5.getAid()
        L61:
            r1.<init>(r4, r2, r0, r3)
            r4.LLILLL = r1
        L66:
            com.ss.android.ugc.aweme.ad.feed.mask.FeedAdLynxMaskContainer r0 = r4.LLILLL
            if (r0 == 0) goto L6d
            r0.LIZ(r5)
        L6d:
            android.widget.FrameLayout r1 = r4.LLILZIL
            if (r1 == 0) goto L76
            r0 = 8
            X.C786410Ut5.LJZ(r0, r1)
        L76:
            return
        L77:
            r0 = r3
            goto L51
        L79:
            r1 = r3
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C999460c7E.LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // X.InterfaceC987390bnl
    public final void LJIIJ(DataCenter dataCenter) {
        this.LLILZ = dataCenter;
        if (dataCenter != null) {
            dataCenter.yQ2("ad_feed_on_page_selected", this, false);
            dataCenter.yQ2("ad_feed_on_page_unselected", this, false);
        }
    }

    @Override // X.InterfaceC987390bnl
    public final void LJJJJLL(boolean z) {
        DataCenter dataCenter;
        FrameLayout frameLayout = this.LLILZIL;
        if (frameLayout == null) {
            return;
        }
        C786410Ut5.U4(frameLayout, 1.0f);
        C786410Ut5.LJZ(8, frameLayout);
        frameLayout.animate().alpha(0.0f).setDuration(150L).start();
        C583160Mu2.LJFF = false;
        if (z && (dataCenter = this.LLILZ) != null) {
            dataCenter.zQ2(null, "ad_feed_resume_video");
        }
    }

    @Override // X.InterfaceC987390bnl
    public final void LJJLJ(IAdTranslationData iAdTranslationData) throws JSONException {
        C997600c4E c997600c4ELIZ;
        JSONObject jSONObject;
        FeedAdLynxMaskContainer feedAdLynxMaskContainer;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        InterfaceC1541990qEH kitView;
        C997570c4B c997570c4BLIZIZ = C997720c4Q.LIZIZ(iAdTranslationData);
        if (c997570c4BLIZIZ != null && (c997600c4ELIZ = c997570c4BLIZIZ.LIZ()) != null && (jSONObject = c997600c4ELIZ.LIZIZ) != null && (feedAdLynxMaskContainer = this.LLILLL) != null) {
            FrameLayout frameLayout = feedAdLynxMaskContainer.LLILLJJLI;
            if ((frameLayout instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) frameLayout) != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
                kitView.U0(C2097908Jt.LIZJ(new Pair("updatedCardData", jSONObject)));
                C1001090c9r.LIZ(new AwS630S0100000_16(kitView, 68));
            }
        }
    }

    @Override // X.InterfaceC987390bnl
    public final void LJZ(IAdTranslatableData iAdTranslatableData) throws JSONException {
        JSONObject jSONObject;
        FeedAdLynxMaskContainer feedAdLynxMaskContainer;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        InterfaceC1541990qEH kitView;
        C997660c4K c997660c4KLIZ = ((C997620c4G) iAdTranslatableData).LIZ();
        if (c997660c4KLIZ != null && (jSONObject = c997660c4KLIZ.LIZIZ) != null && (feedAdLynxMaskContainer = this.LLILLL) != null) {
            FrameLayout frameLayout = feedAdLynxMaskContainer.LLILLJJLI;
            if ((frameLayout instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) frameLayout) != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
                kitView.U0(C2097908Jt.LIZJ(new Pair("updatedCardData", jSONObject)));
                C1001090c9r.LIZ(new AwS630S0100000_16(kitView, 68));
            }
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C0RD4 c0rd4) {
        String str;
        long jLongValue;
        Aweme aweme;
        C0RD4 c0rd42 = c0rd4;
        Aweme aweme2 = this.LLILZLL;
        if (aweme2 != null && C1017070cZd.LLLII(aweme2) && c0rd42 != null && (str = c0rd42.LIZ) != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1540531799) {
                if (iHashCode == -1132409520 && str.equals("ad_feed_on_page_selected")) {
                    if (C290420BZw.LIZ() && (aweme = this.LLILZLL) != null) {
                        C1017070cZd.LLLII(aweme);
                    }
                    FeedAdLynxMaskContainer feedAdLynxMaskContainer = this.LLILLL;
                    if (feedAdLynxMaskContainer != null) {
                        EventBus.LIZLLL().LJIJJ(feedAdLynxMaskContainer);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!str.equals("ad_feed_on_page_unselected")) {
                return;
            }
            BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
            ARunnableS116S0100000_16 aRunnableS116S0100000_16 = new ARunnableS116S0100000_16(this, 172);
            if (((Boolean) C309610CBr.LIZ.getValue()).booleanValue()) {
                jLongValue = ((Number) C309610CBr.LIZIZ.getValue()).longValue();
            } else {
                jLongValue = 200;
            }
            C786410Ut5.LJLIIL(jLongValue, bPEAHandler, aRunnableS116S0100000_16);
            FrameLayout frameLayout = this.LLILZIL;
            if (frameLayout != null) {
                C786410Ut5.LJZ(8, frameLayout);
            }
            FeedAdLynxMaskContainer feedAdLynxMaskContainer2 = this.LLILLL;
            if (feedAdLynxMaskContainer2 == null) {
                return;
            }
            EventBus.LIZLLL().LJJI(feedAdLynxMaskContainer2);
        }
    }

    public C999460c7E(ViewStub viewStub, FrameLayout frameLayout) {
        InterfaceC1000280c8Y interfaceC1000280c8Y;
        this.LL = viewStub;
        this.LLILLJJLI = frameLayout;
        InterfaceC988500bpY interfaceC988500bpYQ = ((ICommercializeAdService) ServiceManager.get().getService(ICommercializeAdService.class)).Q(17);
        if (interfaceC988500bpYQ instanceof InterfaceC1000280c8Y) {
            interfaceC1000280c8Y = (InterfaceC1000280c8Y) interfaceC988500bpYQ;
        } else {
            interfaceC1000280c8Y = null;
        }
        this.LLIZ = interfaceC1000280c8Y;
    }
}

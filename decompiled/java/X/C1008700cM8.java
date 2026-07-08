package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.Observer;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.ugc.aweme.commercialize.splash.report.ITopViewAdEventLogger;
import com.bytedance.ies.ugc.aweme.commercialize.splash.report.TopViewAdEventLogger;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commercialize.model.AdFeInteractionModel;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS67S1000000_16;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cM8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1008700cM8 implements InterfaceC987720boI, Observer<C0RD4> {
    public final ViewStub LL;
    public Aweme LLILLJJLI;
    public FrameLayout LLILLL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public final C1008710cM9 LLJIJIL = new AbstractC1024610cln() { // from class: X.0cM9
        @Override // X.AbstractC1537870q7d
        public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
            C1008700cM8 c1008700cM8 = this.LL;
            if (c1008700cM8.LLJI) {
                c1008700cM8.LLIZLLLIL = true;
                c1008700cM8.LIZLLL(EnumC1008600cLy.LOAD_SUCCESS);
            }
        }

        @Override // X.AbstractC1537870q7d
        public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
            C1008700cM8 c1008700cM8 = this.LL;
            c1008700cM8.LLJI = true;
            c1008700cM8.LLIZLLLIL = false;
        }

        @Override // X.AbstractC1537870q7d
        public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
            C1008700cM8 c1008700cM8 = this.LL;
            c1008700cM8.LLJI = false;
            c1008700cM8.LIZLLL(EnumC1008600cLy.LOAD_FAIL);
        }
    };

    @Override // X.InterfaceC987720boI
    public void LIZ() {
        if (this.LLJ) {
            return;
        }
        this.LLIZ = false;
        FrameLayout frameLayout = this.LLILLL;
        if (frameLayout != null) {
            C786410Ut5.LJZ(8, frameLayout);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            C786410Ut5.LLLLIIIILLL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, 8);
        }
    }

    @Override // X.InterfaceC987720boI
    public final void LIZIZ() {
        if (!C1016720cZ4.LIZIZ.LIZJ(this.LLILLJJLI) || this.LLJ || this.LLIZ) {
            return;
        }
        if (!this.LLILZIL) {
            LIZLLL(EnumC1008600cLy.SHOW);
            this.LLILZIL = true;
        }
        String str = !this.LLIZLLLIL ? "data_load_fail" : "load_timeout";
        ITopViewAdEventLogger iTopViewAdEventLoggerLJJIIZ = TopViewAdEventLogger.LJJIIZ();
        C1018060cbE.LIZ.getClass();
        C1023960ckk c1023960ckk = C1018060cbE.LJJII;
        Aweme aweme = this.LLILLJJLI;
        iTopViewAdEventLoggerLJJIIZ.logAd(c1023960ckk, aweme != null ? aweme.getAwemeRawAd() : null, new AwS67S1000000_16(str, 41));
    }

    public final void LIZJ() {
        FrameLayout frameLayout;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null) {
            return;
        }
        ViewParent parent = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getParent();
        if ((parent instanceof FrameLayout) && (frameLayout = (FrameLayout) parent) != null) {
            C786410Ut5.LJZ(8, frameLayout);
            C786410Ut5.LJJJZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, frameLayout);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        this.LLILZ = null;
        this.LLIZLLLIL = false;
        this.LLJ = false;
        this.LLJI = false;
    }

    public void LJ() {
        C622680Oba.LIZLLL(this);
        this.LLILZLL = false;
        LIZ();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0cM9] */
    public C1008700cM8(ViewStub viewStub) {
        this.LL = viewStub;
    }

    public final void LIZLLL(EnumC1008600cLy enumC1008600cLy) {
        AwemeRawAd awemeRawAd;
        ITopViewAdEventLogger iTopViewAdEventLoggerLJJIIZ = TopViewAdEventLogger.LJJIIZ();
        C1018060cbE.LIZ.getClass();
        C1023960ckk c1023960ckk = C1018060cbE.LJJIII;
        Aweme aweme = this.LLILLJJLI;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        iTopViewAdEventLoggerLJJIIZ.logAd(c1023960ckk, awemeRawAd, new AwS595S0100000_16(enumC1008600cLy, 391));
    }

    @Override // X.InterfaceC987720boI
    public final void LJI(Aweme aweme) throws JSONException {
        Context context;
        AdFeInteractionModel adFeInteractionModelLIZ;
        String strK0;
        NativeSiteConfig nativeSiteConfig;
        String str;
        String strK02;
        FrameLayout frameLayout;
        if (this.LLILZLL) {
            LJ();
        }
        C1016720cZ4 c1016720cZ4 = C1016720cZ4.LIZIZ;
        String nativeSiteCustomData = null;
        if (!c1016720cZ4.LIZJ(aweme)) {
            this.LLILLJJLI = null;
            LIZJ();
            return;
        }
        if (aweme == null) {
            return;
        }
        this.LLILLJJLI = aweme;
        if (this.LL.getParent() != null) {
            this.LL.setLayoutResource(R.layout.d5x);
            View viewLJLLLL = C786410Ut5.LJLLLL(this.LL);
            if (viewLJLLLL instanceof FrameLayout) {
                frameLayout = (FrameLayout) viewLJLLLL;
            } else {
                frameLayout = null;
            }
            this.LLILLL = frameLayout;
        }
        FrameLayout frameLayout2 = this.LLILLL;
        if (frameLayout2 != null && (context = frameLayout2.getContext()) != null) {
            C622680Oba.LIZJ(this);
            if (this.LLILZ == null && this.LLILLL != null) {
                C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                SparkContext sparkContext = new SparkContext();
                c1537900q7g.getClass();
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(context, sparkContext).LIZ(false);
                C786410Ut5.C6(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ, new FrameLayout.LayoutParams(context.getResources().getDisplayMetrics().widthPixels, C14KQ.LIZJ(context) - C14KI.LIZIZ(context)));
                FrameLayout frameLayout3 = this.LLILLL;
                if (frameLayout3 != null) {
                    frameLayout3.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ);
                }
                C786410Ut5.LLLLIIIILLL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ, 8);
                this.LLILZ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
            }
            Aweme aweme2 = this.LLILLJJLI;
            if (aweme2 != null && (adFeInteractionModelLIZ = c1016720cZ4.LIZ(aweme2)) != null) {
                this.LLIZLLLIL = false;
                this.LLJ = false;
                this.LLJI = false;
                LIZLLL(EnumC1008600cLy.CHECK_GECKO_START);
                List<String> list = adFeInteractionModelLIZ.geckoChannel;
                if (list != null) {
                    Iterator<String> it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            String next = it2.next();
                            C988570bpf.LIZ.getClass();
                            if (C1041070dCL.LIZIZ() != null) {
                                IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
                                if (iAdLandPagePreloadService != null) {
                                    strK02 = iAdLandPagePreloadService.K0("lynx_feed");
                                } else {
                                    strK02 = null;
                                }
                                if (!C1552050qUV.LIZIZ(strK02, next)) {
                                    break;
                                }
                            }
                        } else {
                            LIZLLL(EnumC1008600cLy.CHECK_GECKO_SUCCESS);
                            String str2 = adFeInteractionModelLIZ.lynxUrl;
                            if (str2 != null) {
                                Uri.Builder builderBuildUpon = UriProtector.parse(str2).buildUpon();
                                n nVarLIZ = C999590c7R.LIZ(context, aweme2);
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.putOpt("width", Integer.valueOf(context.getResources().getDisplayMetrics().widthPixels));
                                jSONObject.putOpt("height", Integer.valueOf(C14KQ.LIZJ(context) - C14KI.LIZIZ(context)));
                                jSONObject.putOpt("scale", Float.valueOf(context.getResources().getDisplayMetrics().density));
                                List<String> list2 = adFeInteractionModelLIZ.geckoChannel;
                                if (list2 != null) {
                                    jSONObject.putOpt("gecko_channel", GsonProtectorUtils.toJson(C09C2.LIZ(), list2));
                                }
                                Object obj = adFeInteractionModelLIZ.frontendData;
                                if (obj != null) {
                                    jSONObject.putOpt("data", GsonProtectorUtils.toJson(C09C2.LIZ(), obj));
                                }
                                nVarLIZ.LJJIIJ("interaction_data", C786410Ut5.J3(jSONObject));
                                nVarLIZ.LJJIII(Integer.valueOf(adFeInteractionModelLIZ.interactionType), "interaction_type");
                                AwemeRawAd awemeRawAd = aweme2.getAwemeRawAd();
                                if (awemeRawAd != null && (nativeSiteConfig = awemeRawAd.getNativeSiteConfig()) != null && (str = nativeSiteConfig.lynxScheme) != null) {
                                    nVarLIZ.LJJIIJ("lynxSchema", str);
                                }
                                builderBuildUpon.appendQueryParameter("initialData", nVarLIZ.toString());
                                InterfaceC1000280c8Y interfaceC1000280c8YLIZ = C988590bph.LIZ();
                                if (interfaceC1000280c8YLIZ != null) {
                                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZ;
                                    IAdLandPagePreloadService iAdLandPagePreloadService2 = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
                                    if (iAdLandPagePreloadService2 != null) {
                                        strK0 = iAdLandPagePreloadService2.K0("lynx_feed");
                                    } else {
                                        strK0 = null;
                                    }
                                    C1029690ctz c1029690ctzLJJIIJZLJL = interfaceC1000280c8YLIZ.LJJIIJZLJL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, strK0, this.LLJIJIL);
                                    if (c1029690ctzLJJIIJZLJL != null) {
                                        String string = builderBuildUpon.toString();
                                        Bundle bundle = new Bundle();
                                        InterfaceC1000280c8Y interfaceC1000280c8YLIZ2 = C988590bph.LIZ();
                                        if (interfaceC1000280c8YLIZ2 != null) {
                                            interfaceC1000280c8YLIZ2.LJIJJ(context, bundle, aweme2);
                                        }
                                        AwemeRawAd awemeRawAd2 = aweme2.getAwemeRawAd();
                                        if (awemeRawAd2 != null) {
                                            nativeSiteCustomData = awemeRawAd2.getNativeSiteCustomData();
                                        }
                                        C786410Ut5.LJJJI("bundle_native_site_custom_data", nativeSiteCustomData, bundle);
                                        c1029690ctzLJJIIJZLJL.LIZ(bundle, string, C1000150c8L.LIZ().enableInteraction);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            LIZ();
        }
    }

    @Override // X.InterfaceC987720boI
    public final void LJIIJ(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.yQ2("ad_feed_on_page_selected", this, false);
            dataCenter.yQ2("ad_feed_on_page_unselected", this, false);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void changeContainerToTopEvent(C1008740cMC c1008740cMC) {
        if (!this.LLILZLL || !C1016720cZ4.LIZIZ.LIZJ(this.LLILLJJLI)) {
        } else {
            throw null;
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void interactionAdEggStatusEvent(C1008750cMD c1008750cMD) {
        throw null;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C0RD4 c0rd4) {
        String str;
        C0RD4 c0rd42 = c0rd4;
        if (C1016720cZ4.LIZIZ.LIZJ(this.LLILLJJLI) && c0rd42 != null && (str = c0rd42.LIZ) != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1540531799) {
                if (iHashCode == -1132409520 && str.equals("ad_feed_on_page_selected")) {
                    C622680Oba.LIZJ(this);
                    this.LLILZLL = true;
                    this.LLILZIL = false;
                    LIZLLL(EnumC1008600cLy.SELECT);
                    return;
                }
                return;
            }
            if (!str.equals("ad_feed_on_page_unselected")) {
                return;
            }
            LJ();
        }
    }
}

package X;

import Y.ARunnableS49S0300000_16;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ad.feed.sticker.FeedAdLynxSticker;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commercialize.model.AdStickerData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.IAdTranslationData;
import kotlin.Pair;
import kotlin.jvm.internal.AwS630S0100000_16;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0c8E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1000080c8E implements InterfaceC987380bnk, Observer<C0RD4> {
    public final ViewStub LL;
    public final String LLILLJJLI;
    public Aweme LLILLL;
    public FeedAdLynxSticker LLILZ;
    public FrameLayout LLILZIL;
    public AdStickerData LLILZLL;
    public boolean LLIZ;
    public C988710bpt LLIZLLLIL;
    public final BPEAHandler LLJ = new BPEAHandler(Looper.getMainLooper());
    public String LLJI;
    public boolean LLJIJIL;
    public int LLJILJIL;
    public Aweme LLJILJILJ;

    @Override // X.InterfaceC987380bnk
    public final void LIZ() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        Lifecycle lifecycle;
        FeedAdLynxSticker feedAdLynxSticker = this.LLILZ;
        if (feedAdLynxSticker != null) {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) feedAdLynxSticker.LLIZLLLIL.getValue();
            if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.removeObserver(feedAdLynxSticker);
            }
            EventBus.LIZLLL().LJJI(feedAdLynxSticker);
            if (feedAdLynxSticker.LLILZLL) {
                return;
            }
            feedAdLynxSticker.LLJI = false;
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = feedAdLynxSticker.LLJILJILJ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2);
            }
            View view = feedAdLynxSticker.LLJIJIL;
            if (view == null) {
                view = null;
            }
            if ((view instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) view) != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
            }
            feedAdLynxSticker.LLJILJIL = null;
            this.LLILZ = null;
        }
    }

    @Override // X.InterfaceC987380bnk
    public final void hide() {
        FrameLayout frameLayout = this.LLILZIL;
        if (frameLayout != null) {
            C786410Ut5.LJZ(8, frameLayout);
        }
        this.LLIZ = false;
        this.LLJ.removeCallbacksAndMessages(null);
    }

    @Override // X.InterfaceC987380bnk
    public final void preload() {
        FeedAdLynxSticker feedAdLynxSticker;
        FeedAdLynxSticker feedAdLynxSticker2;
        Aweme aweme = this.LLILLL;
        if (aweme == null || !C1017070cZd.LLLILZ(aweme) || LJ(this.LLILLL) || this.LLIZ) {
            return;
        }
        if ((C1000100c8G.LIZ() && (feedAdLynxSticker2 = this.LLILZ) != null && feedAdLynxSticker2.LLILZLL) || (feedAdLynxSticker = this.LLILZ) == null) {
            return;
        }
        feedAdLynxSticker.LJIIIIZZ();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = feedAdLynxSticker.LLJILJILJ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView() != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = feedAdLynxSticker.LLJILJILJ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2);
            }
            feedAdLynxSticker.LLJILJIL = null;
        }
        String str = feedAdLynxSticker.LLJJ;
        if (str != null) {
            Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter("initialData", feedAdLynxSticker.LIZLLL().toString());
            InterfaceC999480c7G interfaceC999480c7G = feedAdLynxSticker.LLJJIII;
            if (interfaceC999480c7G != null) {
                interfaceC999480c7G.LIZ(feedAdLynxSticker.LJ(), builderBuildUpon.toString(), C1000150c8L.LIZ().enableLynxSticker);
            }
        }
    }

    @Override // X.InterfaceC987380bnk
    public final boolean isShowing() {
        return this.LLIZ;
    }

    public static final boolean LJ(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        return C1001410cAN.LIZIZ.LJFF(aweme.getAid(), EnumC1001380cAK.STICKER_OPERATION, EnumC599900Nfw.FEED);
    }

    @Override // X.InterfaceC987380bnk
    public final void LIZIZ(C997700c4O c997700c4O) throws JSONException {
        JSONObject jSONObject;
        FeedAdLynxSticker feedAdLynxSticker;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        InterfaceC1541990qEH kitView;
        C997700c4O c997700c4OLIZ = C997750c4T.LIZ(c997700c4O);
        if (c997700c4OLIZ != null && (jSONObject = c997700c4OLIZ.LIZ) != null && (feedAdLynxSticker = this.LLILZ) != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = feedAdLynxSticker.LLJILJILJ) != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
            kitView.U0(C2097908Jt.LIZJ(new Pair("updatedFrontendData", jSONObject)));
            C1001090c9r.LIZ(new AwS630S0100000_16(kitView, 68));
        }
    }

    @Override // X.InterfaceC987380bnk
    public final void LIZLLL(long j) {
        LIZJ(j, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    @Override // X.InterfaceC987380bnk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(com.ss.android.ugc.aweme.feed.model.Aweme r6) {
        /*
            r5 = this;
            r4 = 1
            r1 = 0
            if (r6 == 0) goto L45
            boolean r0 = X.C1017070cZd.LLLILZ(r6)
            if (r0 != r4) goto L45
            r0 = 1
        Lb:
            r3 = 0
            if (r0 == 0) goto L81
            boolean r0 = LJ(r6)
            if (r0 != 0) goto L81
            r5.LLILLL = r6
            if (r6 == 0) goto L43
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r6.getAwemeRawAd()
            if (r0 == 0) goto L43
            com.ss.android.ugc.aweme.commercialize.model.AdStickerData r0 = r0.getStickerData()
        L22:
            r5.LLILZLL = r0
            android.view.ViewStub r0 = r5.LL
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L3e
            android.view.ViewStub r1 = r5.LL
            r0 = 2131563422(0x7f0d139e, float:1.87523E38)
            r1.setLayoutResource(r0)
            android.view.ViewStub r0 = r5.LL
            android.view.View r0 = X.C786410Ut5.LJLLLL(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r5.LLILZIL = r0
        L3e:
            android.widget.FrameLayout r2 = r5.LLILZIL
            if (r2 != 0) goto L47
            return
        L43:
            r0 = r3
            goto L22
        L45:
            r0 = 0
            goto Lb
        L47:
            com.ss.android.ugc.aweme.ad.feed.sticker.FeedAdLynxSticker r0 = r5.LLILZ
            if (r0 == 0) goto L63
            boolean r0 = X.C1000100c8G.LIZ()
            if (r0 != r4) goto L72
            if (r6 == 0) goto L7f
            java.lang.String r1 = r6.getAid()
        L57:
            com.ss.android.ugc.aweme.ad.feed.sticker.FeedAdLynxSticker r0 = r5.LLILZ
            if (r0 == 0) goto L7d
            java.lang.String r0 = r0.LLILLL
        L5d:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L72
        L63:
            com.ss.android.ugc.aweme.ad.feed.sticker.FeedAdLynxSticker r1 = new com.ss.android.ugc.aweme.ad.feed.sticker.FeedAdLynxSticker
            java.lang.String r0 = r5.LLILLJJLI
            if (r6 == 0) goto L6d
            java.lang.String r3 = r6.getAid()
        L6d:
            r1.<init>(r0, r2, r5, r3)
            r5.LLILZ = r1
        L72:
            com.ss.android.ugc.aweme.ad.feed.sticker.FeedAdLynxSticker r0 = r5.LLILZ
            if (r0 == 0) goto L79
            r0.LIZJ(r6)
        L79:
            r5.hide()
            return
        L7d:
            r0 = r3
            goto L5d
        L7f:
            r1 = r3
            goto L57
        L81:
            r5.LLILLL = r3
            r5.LLJILJIL = r1
            com.ss.android.ugc.aweme.ad.feed.sticker.FeedAdLynxSticker r0 = r5.LLILZ
            if (r0 == 0) goto L8c
            r0.LIZJ(r3)
        L8c:
            r5.LLJILJILJ = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1000080c8E.LJI(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // X.InterfaceC987380bnk
    public final void LJIIJ(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.yQ2("ad_feed_on_page_selected", this, false);
            dataCenter.yQ2("ad_feed_on_page_unselected", this, false);
            dataCenter.yQ2("ad_feed_bind_texture_size", this, false);
            dataCenter.yQ2("ad_feed_on_play_completed", this, false);
        }
    }

    @Override // X.InterfaceC987380bnk
    public final void LJIIZILJ(boolean z) {
        FrameLayout frameLayout;
        Aweme aweme = this.LLILLL;
        int i = 0;
        if (aweme != null && C1017070cZd.LLLILZ(aweme) && !LJ(this.LLILLL)) {
            if ((this.LLIZ || z) && (frameLayout = this.LLILZIL) != null) {
                if (z) {
                    i = 4;
                }
                C786410Ut5.LJZ(i, frameLayout);
            }
        }
    }

    @Override // X.InterfaceC987380bnk
    public final void LJJLJ(IAdTranslationData iAdTranslationData) throws JSONException {
        JSONObject jSONObject;
        FeedAdLynxSticker feedAdLynxSticker;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        InterfaceC1541990qEH kitView;
        C997610c4F c997610c4FLIZJ = C997720c4Q.LIZJ(iAdTranslationData);
        if (c997610c4FLIZJ != null && (jSONObject = c997610c4FLIZJ.LIZ) != null && (feedAdLynxSticker = this.LLILZ) != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = feedAdLynxSticker.LLJILJILJ) != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
            kitView.U0(C2097908Jt.LIZJ(new Pair("updatedFrontendData", jSONObject)));
            C1001090c9r.LIZ(new AwS630S0100000_16(kitView, 68));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(C0RD4 c0rd4) {
        String str;
        FeedAdLynxSticker feedAdLynxSticker;
        FeedAdLynxSticker feedAdLynxSticker2;
        Aweme aweme;
        C0RD4 c0rd42 = c0rd4;
        Aweme aweme2 = this.LLILLL;
        if (aweme2 != null && C1017070cZd.LLLILZ(aweme2) && !LJ(this.LLILLL)) {
            Object obj = null;
            if (c0rd42 == null || (str = c0rd42.LIZ) == null) {
                return;
            }
            switch (str.hashCode()) {
                case -1718169445:
                    if (str.equals("ad_feed_on_play_completed")) {
                        Object obj2 = c0rd42.LIZIZ;
                        if (obj2 != null) {
                            obj = obj2;
                        }
                        this.LLJILJIL = ((Integer) obj).intValue();
                    }
                    break;
                case -1540531799:
                    if (str.equals("ad_feed_on_page_unselected")) {
                        FeedAdLynxSticker feedAdLynxSticker3 = this.LLILZ;
                        if (feedAdLynxSticker3 != null) {
                            EventBus.LIZLLL().LJJI(feedAdLynxSticker3);
                        }
                        this.LLJILJIL = 0;
                        C1022030chd c1022030chd = C1022030chd.LIZ;
                        AdStickerData adStickerData = this.LLILZLL;
                        c1022030chd.getClass();
                        if (C1022030chd.LJIL(adStickerData)) {
                            hide();
                        }
                        this.LLJIJIL = false;
                    }
                    break;
                case -1304146782:
                    if (str.equals("ad_feed_bind_texture_size")) {
                        Object obj3 = c0rd42.LIZIZ;
                        if (obj3 != null) {
                            obj = obj3;
                        }
                        this.LLIZLLLIL = (C988710bpt) obj;
                    }
                    break;
                case -1132409520:
                    if (str.equals("ad_feed_on_page_selected")) {
                        if (C1000100c8G.LIZ() && (aweme = this.LLILLL) != null) {
                            C1017070cZd.LLLILZ(aweme);
                        }
                        this.LLJILJIL = 0;
                        FeedAdLynxSticker feedAdLynxSticker4 = this.LLILZ;
                        if (feedAdLynxSticker4 != null) {
                            EventBus.LIZLLL().LJIJJ(feedAdLynxSticker4);
                        }
                        if (this.LLIZ && (feedAdLynxSticker2 = this.LLILZ) != null) {
                            feedAdLynxSticker2.LJII();
                        }
                        if (!TextUtils.isEmpty(this.LLJI) && (feedAdLynxSticker = this.LLILZ) != null) {
                            feedAdLynxSticker.LJI(this.LLJI);
                        }
                        this.LLJIJIL = true;
                    }
                    break;
            }
        }
    }

    public C1000080c8E(ViewStub viewStub, String str) {
        this.LL = viewStub;
        this.LLILLJJLI = str;
    }

    @Override // X.InterfaceC987380bnk
    public final void LIZJ(long j, C987360bni c987360bni) {
        FrameLayout frameLayout;
        if (LJ(this.LLJILJILJ)) {
            C1001410cAN.LIZIZ.LIZJ(this.LLJILJILJ, "sticker");
            return;
        }
        Aweme aweme = this.LLILLL;
        if (aweme == null || !C1017070cZd.LLLILZ(aweme) || (frameLayout = this.LLILZIL) == null || this.LLIZ) {
            return;
        }
        C786410Ut5.LJLIIL(j, this.LLJ, new ARunnableS49S0300000_16(this, frameLayout, c987360bni, 9));
    }
}

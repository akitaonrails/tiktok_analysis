package X;

import Y.ARunnableS3S1110000_16;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Observer;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.ad.feed.card.FeedAdLynxCard;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commercialize.model.VideoPlaybackConfig;
import com.ss.android.ugc.aweme.commercialize.utils.video.VideoPlayTaskManager;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0c7I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C999500c7I implements Observer<C0RD4>, InterfaceC987370bnj {
    public final InterfaceC665370Q7z LL;
    public final IVideoPlayTaskManager LLILLJJLI;
    public FrameLayout LLILLL;
    public final C999510c7J LLILZ;
    public FeedAdLynxCard LLILZIL;
    public DataCenter LLILZLL;
    public boolean LLIZLLLIL;
    public Aweme LLJ;
    public Aweme LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public Aweme LLJJ;
    public boolean LLJJI;
    public String LLJJIII;
    public final BPEAHandler LLIZ = new BPEAHandler(Looper.getMainLooper());
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new C999450c7D(this));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new C998540c5k(this));

    public final void LIZIZ() {
        this.LLJILJIL = false;
        this.LLJJIII = null;
        this.LLJIJIL = false;
        C786410Ut5.LJZ(8, this.LLILZ.LIZ());
        this.LLIZ.removeCallbacksAndMessages(null);
        ((ViewOnLayoutChangeListenerC998530c5j) this.LLJILLL.getValue()).LL = -1;
    }

    @Override // X.InterfaceC987370bnj
    public final void LIZ() {
        FeedAdLynxCard feedAdLynxCard = this.LLILZIL;
        if (feedAdLynxCard == null || !feedAdLynxCard.LJIIIIZZ()) {
            return;
        }
        this.LLILZIL = null;
    }

    @Override // X.InterfaceC987370bnj
    public final void LLI() {
        C999510c7J c999510c7J = this.LLILZ;
        Aweme aweme = this.LLJI;
        Context context = c999510c7J.LIZ().getContext();
        if (context == null || aweme == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c999510c7J.LIZ().getLayoutParams();
        if (AwemeExtKt.isHotSearchAweme(aweme) || AwemeExtKt.isHotVideoAweme(aweme) || AwemeExtKt.isMixAweme(aweme)) {
            marginLayoutParams.bottomMargin += C0HCL.LIZ(32.0f, context);
        }
        C786410Ut5.a6(c999510c7J.LIZ(), marginLayoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01e2  */
    @Override // X.InterfaceC987370bnj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void preload() {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C999500c7I.preload():void");
    }

    @Override // X.InterfaceC987370bnj
    public final FrameLayout LJIJI() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC987370bnj
    public final InterfaceC990040bs2 LLIIIJ() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC987370bnj
    public final boolean isShowing() {
        return this.LLJIJIL;
    }

    public static final boolean LIZJ(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        return C1001410cAN.LIZIZ.LJFF(aweme.getAid(), EnumC1001380cAK.CARD_OPERATION, EnumC599900Nfw.FEED);
    }

    @Override // X.InterfaceC987370bnj
    public final void LJI(Aweme aweme) {
        if (aweme != null) {
            if (AwemeExtKt.isAdTraffic(aweme) || C1017070cZd.LLILZ(aweme)) {
                String aid = null;
                if (C1017070cZd.LLILLL(aweme) && !C1017070cZd.LJJJJLL(aweme) && !LIZJ(aweme)) {
                    this.LLJI = aweme;
                    C999510c7J c999510c7J = this.LLILZ;
                    if (aweme != null) {
                        aweme.getAwemeRawAd();
                    }
                    this.LLILLL = c999510c7J.LIZ();
                    C999510c7J c999510c7J2 = this.LLILZ;
                    FeedAdLynxCard feedAdLynxCard = c999510c7J2.LIZIZ;
                    if (feedAdLynxCard != null) {
                        feedAdLynxCard.LJIIIIZZ();
                    }
                    c999510c7J2.LIZIZ = null;
                    C999510c7J c999510c7J3 = this.LLILZ;
                    if (c999510c7J3.LIZIZ == null) {
                        FrameLayout frameLayoutLIZ = c999510c7J3.LIZ();
                        if (aweme != null) {
                            aid = aweme.getAid();
                        }
                        c999510c7J3.LIZIZ = new FeedAdLynxCard(this, frameLayoutLIZ, aid);
                    }
                    FeedAdLynxCard feedAdLynxCard2 = c999510c7J3.LIZIZ;
                    this.LLILZIL = feedAdLynxCard2;
                    if (feedAdLynxCard2 != null) {
                        feedAdLynxCard2.LIZLLL(aweme);
                    }
                    LIZIZ();
                    return;
                }
                Aweme aweme2 = this.LLJI;
                if (aweme2 != null) {
                    this.LLJ = aweme2;
                }
                this.LLJI = null;
                FeedAdLynxCard feedAdLynxCard3 = this.LLILZ.LIZIZ;
                if (feedAdLynxCard3 != null) {
                    feedAdLynxCard3.LIZLLL(null);
                }
                this.LLJJ = aweme;
            }
        }
    }

    @Override // X.InterfaceC987370bnj
    public final void LJIIJ(DataCenter dataCenter) {
        this.LLILZLL = dataCenter;
        if (dataCenter != null) {
            dataCenter.yQ2("ad_feed_on_page_selected", this, false);
            dataCenter.yQ2("ad_feed_on_page_unselected", this, false);
            dataCenter.yQ2("ad_comment_dialog_visible", this, false);
            dataCenter.yQ2("ad_share_dialog_visible", this, false);
            dataCenter.yQ2("ad_video_on_resume_play", this, false);
        }
    }

    @Override // X.InterfaceC987370bnj
    public final void LLIFFJFJJ(boolean z) {
        FrameLayout frameLayout;
        int i;
        if (C1017070cZd.LLILLL(this.LLJI) && !LIZJ(this.LLJI)) {
            this.LLJJI = z;
            if (this.LLJIJIL && (frameLayout = this.LLILLL) != null) {
                if (z) {
                    i = 4;
                } else {
                    i = 0;
                }
                C786410Ut5.LJZ(i, frameLayout);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    @Override // androidx.lifecycle.Observer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onChanged(X.C0RD4 r9) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C999500c7I.onChanged(java.lang.Object):void");
    }

    public C999500c7I(View view, InterfaceC665370Q7z interfaceC665370Q7z, VideoPlayTaskManager videoPlayTaskManager) {
        this.LL = interfaceC665370Q7z;
        this.LLILLJJLI = videoPlayTaskManager;
        this.LLILZ = new C999510c7J(view);
    }

    @Override // X.InterfaceC987370bnj
    public final void LLII(int i, int i2, int i3) {
        FeedAdLynxCard feedAdLynxCard = this.LLILZIL;
        if (feedAdLynxCard != null) {
            feedAdLynxCard.LJIIL(i, i2, i3);
        }
    }

    @Override // X.InterfaceC987370bnj
    public final void LLIIII(int i, int i2, String str) {
        FeedAdLynxCard feedAdLynxCard = this.LLILZIL;
        if (feedAdLynxCard != null) {
            feedAdLynxCard.LJIIJJI(i, i2, str);
        }
    }

    @Override // X.InterfaceC987370bnj
    public final void LLIIIILZ(long j, String str, boolean z) {
        Integer numValueOf;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        VideoPlaybackConfig videoPlaybackConfig;
        Integer num;
        Video video;
        Aweme aweme2;
        User author;
        if (LIZJ(this.LLJJ)) {
            C1001410cAN.LIZIZ.LIZJ(this.LLJJ, "card");
            return;
        }
        Aweme aweme3 = this.LLJI;
        if (aweme3 != null && C1017070cZd.LLILLL(aweme3)) {
            Aweme aweme4 = this.LLJI;
            if ((aweme4 != null && C1017070cZd.LJJJJLL(aweme4)) || this.LLJIJIL) {
                return;
            }
            Aweme aweme5 = this.LLJI;
            if (aweme5 == null || !C1017070cZd.LLLIL(aweme5) || ((aweme2 = this.LLJI) != null && (author = aweme2.getAuthor()) != null && author.getFollowStatus() == 0)) {
                ARunnableS3S1110000_16 aRunnableS3S1110000_16 = new ARunnableS3S1110000_16(this, str, z, 1);
                Aweme aweme6 = this.LLJI;
                if (aweme6 != null && (video = aweme6.getVideo()) != null) {
                    numValueOf = Integer.valueOf(video.getDuration());
                } else {
                    numValueOf = null;
                }
                if (this.LLILLJJLI != null && numValueOf != null && (aweme = this.LLJI) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (videoPlaybackConfig = awemeRawAd.getVideoPlaybackConfig()) != null && (num = videoPlaybackConfig.componentDisplayTiming) != null && num.intValue() == 1) {
                    IVideoPlayTaskManager iVideoPlayTaskManager = this.LLILLJJLI;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("FeedAdCardDelegate_");
                    sbLIZ.append(System.currentTimeMillis());
                    C988300bpE c988300bpE = new C988300bpE(C2188811AlT.LIZIZ(sbLIZ));
                    c988300bpE.LIZIZ(numValueOf.intValue());
                    c988300bpE.LIZJ = (int) j;
                    c988300bpE.LIZLLL = aRunnableS3S1110000_16;
                    c988300bpE.LJ = false;
                    iVideoPlayTaskManager.LLIFFJFJJ(c988300bpE.LIZ());
                    return;
                }
                C786410Ut5.LJLIIL(j, this.LLIZ, aRunnableS3S1110000_16);
            }
        }
    }
}

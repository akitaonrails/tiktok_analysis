package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0ccs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1019080ccs implements C0Q6Q {
    public boolean LIZ;
    public final /* synthetic */ CommerceVideoDelegateKt LIZIZ;

    @Override // X.C0Q6Q
    public final void LIZ() {
        String originUri;
        Video video;
        VideoUrlModel playAddr;
        C0N4L c0n4l;
        InterfaceC585680My6 interfaceC585680My6LJIILLIIL;
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        CommerceVideoDelegateKt commerceVideoDelegateKt = this.LIZIZ;
        Aweme aweme = commerceVideoDelegateKt.aweme;
        if (aweme == null || commerceVideoDelegateKt.adLayoutShowing || commerceVideoDelegateKt.adLynxLayoutShowing || commerceVideoDelegateKt.adFormLayoutShowing) {
            return;
        }
        if ((C1594680rbG.LJ(aweme) || C1017070cZd.LJIIL(aweme)) && this.LIZIZ.LLLLLJIL() != null) {
            if (this.LIZIZ.LJJJLL().LIZIZ(aweme)) {
                C1045340dJE.LJIJI().LJIIZILJ = this.LIZIZ.LJJJLL().LIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PlayerLog.toPlay, mPausePosition: ");
                sbLIZ.append(C1045340dJE.LJIJI().LJIIZILJ);
                C2188811AlT.LIZIZ(sbLIZ);
            } else {
                C1045340dJE.LJIJI().LJIIZILJ = -1L;
            }
            C1045340dJE c1045340dJELJIJI = C1045340dJE.LJIJI();
            CommerceVideoDelegateKt commerceVideoDelegateKt2 = this.LIZIZ;
            Context context = commerceVideoDelegateKt2.context;
            View viewLLLLLJIL = commerceVideoDelegateKt2.LLLLLJIL();
            int i = this.LIZIZ.adPlayTimes;
            c1045340dJELJIJI.getClass();
            C2344809Gs.LJ("AdOM onPlayResume ");
            if (!C1045340dJE.LJJIJIL(aweme)) {
                if (!C293490Bet.LIZIZ || (interfaceC585680My6LJIILLIIL = C1045340dJE.LJIILLIIL()) == null || !interfaceC585680My6LJIILLIIL.LJIILL(aweme)) {
                    if (context instanceof DetailActivity) {
                        c1045340dJELJIJI.LJJIL(aweme);
                    }
                    if (i == 0) {
                        C1045380dJI.LIZ("resume");
                        C1045770dJv c1045770dJvLJIIJJI = c1045340dJELJIJI.LJIIJJI(context, viewLLLLLJIL, aweme);
                        if (c1045770dJvLJIIJJI != null) {
                            C1045780dJw.LIZJ(c1045770dJvLJIIJJI.LIZ);
                            c1045770dJvLJIIJJI.LIZ.LJ.LIZ("resume", null);
                        }
                        if (C294490BgV.LIZ() && (c0n4l = c1045340dJELJIJI.LJFF.get(C1045370dJH.LIZLLL(aweme))) != null) {
                            c0n4l.LIZLLL = "omsdk_resume";
                            C588660N6y c588660N6y = new C588660N6y("android_old_feed", c0n4l.LIZ, c0n4l.LIZIZ, c0n4l.LIZJ, C1045340dJE.LJIIIZ(aweme));
                            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                            if (C294490BgV.LIZ()) {
                                new C1020690cfT(c588660N6y, awemeRawAd).logAd(C2275841E6c.LIZ, awemeRawAd);
                            }
                        }
                        C1045570dJb c1045570dJbLJII = c1045340dJELJIJI.LJII(context, viewLLLLLJIL, aweme);
                        if (c1045570dJbLJII != null) {
                            C1045580dJc.LIZIZ(c1045570dJbLJII.LIZ);
                            C1045610dJf c1045610dJf = c1045570dJbLJII.LIZ;
                            c1045610dJf.getClass();
                            c1045610dJf.LJII = System.nanoTime();
                            C1046040dKM.LJ.LIZ();
                        }
                    }
                    C1045220dJ2.LJIILLIIL(aweme, "resume", null);
                } else if (viewLLLLLJIL != null && context != null) {
                    interfaceC585680My6LJIILLIIL.LJIIZILJ(i, context, viewLLLLLJIL, aweme);
                }
            }
            CommerceVideoDelegateKt commerceVideoDelegateKt3 = this.LIZIZ;
            Context context2 = commerceVideoDelegateKt3.context;
            Aweme aweme2 = commerceVideoDelegateKt3.aweme;
            C1019030ccn.LJJJJ(context2, "resume", aweme2, C1019030ccn.LJIIJJI(context2, aweme2, false, C1019030ccn.LJ(commerceVideoDelegateKt3.adPlayTimes + 1)));
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "resume", !AwemeExtKt.isPseudoAd(aweme) ? aweme.getAwemeRawAd() : C1017070cZd.LJJIJL(aweme));
            c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(C1045340dJE.LJIJI().LJIILJJIL(c1022820ciuLIZLLL, this.LIZIZ.aweme)), "play_order");
            Aweme aweme3 = this.LIZIZ.aweme;
            if (aweme3 == null || (video = aweme3.getVideo()) == null || (playAddr = video.getPlayAddr()) == null || (originUri = playAddr.getOriginUri()) == null) {
                originUri = "";
            }
            c1022820ciuLIZLLL.LIZIZ(originUri, "bsh_video_id");
            this.LIZIZ.LJIJJLI(c1022820ciuLIZLLL);
            c1022820ciuLIZLLL.LJIIIIZZ();
        }
    }

    @Override // X.C0Q6Q
    public final void LIZIZ() {
        C0N4L c0n4l;
        InterfaceC585680My6 interfaceC585680My6LJIILLIIL;
        if (this.LIZ) {
            this.LIZ = false;
            CommerceVideoDelegateKt commerceVideoDelegateKt = this.LIZIZ;
            Aweme aweme = commerceVideoDelegateKt.aweme;
            if (aweme == null || commerceVideoDelegateKt.adLayoutShowing || commerceVideoDelegateKt.adLynxLayoutShowing) {
                return;
            }
            if ((!(!commerceVideoDelegateKt.adFormLayoutShowing) || !(C1594680rbG.LJ(aweme) || C1017070cZd.LJIIL(aweme))) || this.LIZIZ.LLLLLJIL() == null) {
                return;
            }
            C1045340dJE c1045340dJELJIJI = C1045340dJE.LJIJI();
            CommerceVideoDelegateKt commerceVideoDelegateKt2 = this.LIZIZ;
            Context context = commerceVideoDelegateKt2.context;
            View viewLLLLLJIL = commerceVideoDelegateKt2.LLLLLJIL();
            int i = this.LIZIZ.adPlayTimes;
            c1045340dJELJIJI.getClass();
            C2344809Gs.LJ("AdOM onPlayPause ");
            if (!C1045340dJE.LJJIJIL(aweme)) {
                if (!C293490Bet.LIZIZ || (interfaceC585680My6LJIILLIIL = C1045340dJE.LJIILLIIL()) == null || !interfaceC585680My6LJIILLIIL.LJIILL(aweme)) {
                    if (i == 0) {
                        C1045380dJI.LIZ("pause");
                        C1045770dJv c1045770dJvLJIIJJI = c1045340dJELJIJI.LJIIJJI(context, viewLLLLLJIL, aweme);
                        if (c1045770dJvLJIIJJI != null) {
                            C1045780dJw.LIZJ(c1045770dJvLJIIJJI.LIZ);
                            c1045770dJvLJIIJJI.LIZ.LJ.LIZ("pause", null);
                        }
                        if (C294490BgV.LIZ() && (c0n4l = c1045340dJELJIJI.LJFF.get(C1045370dJH.LIZLLL(aweme))) != null) {
                            c0n4l.LIZLLL = "omsdk_pause";
                            C588660N6y c588660N6y = new C588660N6y("android_old_feed", c0n4l.LIZ, c0n4l.LIZIZ, c0n4l.LIZJ, C1045340dJE.LJIIIZ(aweme));
                            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                            if (C294490BgV.LIZ()) {
                                new C1020690cfT(c588660N6y, awemeRawAd).logAd(C2275821E6a.LIZ, awemeRawAd);
                            }
                        }
                        C1045570dJb c1045570dJbLJII = c1045340dJELJIJI.LJII(context, viewLLLLLJIL, aweme);
                        if (c1045570dJbLJII != null) {
                            C1045580dJc.LIZIZ(c1045570dJbLJII.LIZ);
                            c1045570dJbLJII.LIZ.LJI();
                            C1046040dKM.LJ.LIZIZ();
                        }
                    }
                    C1045220dJ2.LJIILLIIL(aweme, "pause", "play_pause");
                } else if (viewLLLLLJIL != null && context != null) {
                    interfaceC585680My6LJIILLIIL.LJFF(i, context, viewLLLLLJIL, aweme);
                }
            }
            CommerceVideoDelegateKt commerceVideoDelegateKt3 = this.LIZIZ;
            Context context2 = commerceVideoDelegateKt3.context;
            C1019030ccn.LJJJJ(context2, "pause", aweme, C1019030ccn.LJIIJJI(context2, aweme, false, C1019030ccn.LJ(commerceVideoDelegateKt3.adPlayTimes + 1)));
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "pause", !AwemeExtKt.isPseudoAd(aweme) ? aweme.getAwemeRawAd() : C1017070cZd.LJJIJL(aweme));
            c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(C1045340dJE.LJIJI().LJIILJJIL(c1022820ciuLIZLLL, aweme)), "play_order");
            if (C1017070cZd.LJI(aweme)) {
                c1022820ciuLIZLLL.LIZ(((IAdPhotoModeService) ServiceManager.get().getService(IAdPhotoModeService.class)).LJJIIJ(aweme));
            }
            String productId = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).getProductId();
            if (productId != null && C123100dR.LIZ(productId)) {
                c1022820ciuLIZLLL.LIZIZ(productId, "product_id");
            }
            this.LIZIZ.LJIJJLI(c1022820ciuLIZLLL);
            c1022820ciuLIZLLL.LJIIIIZZ();
        }
    }

    public C1019080ccs(CommerceVideoDelegateKt commerceVideoDelegateKt) {
        this.LIZIZ = commerceVideoDelegateKt;
    }
}

package X;

import Y.ACListenerS119S0200000_16;
import Y.ACListenerS151S0100000_16;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AdGestureGuidance;
import com.ss.android.ugc.aweme.feed.model.AdInteractionData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.165Y, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C165Y extends FrameLayout implements InterfaceC207180165i, InterfaceC996730c2p {
    public C1322110kVd LL;
    public C207177165f LLILLJJLI;
    public C207178165g LLILLL;
    public Aweme LLILZ;
    public AdInteractionData LLILZIL;
    public String LLILZLL;
    public AnimatedDrawable2 LLIZ;
    public InterfaceC207173165b LLIZLLLIL;
    public C988710bpt LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public int LLJILJILJ;
    public C20498815Ja LLJILLL;

    @Override // X.InterfaceC996730c2p
    public final void LIZ() {
        this.LLJI = true;
        reset();
    }

    @Override // X.InterfaceC996730c2p
    public final void LIZIZ() {
        this.LLJI = false;
        reset();
    }

    public final void LJI() {
        AnimatedDrawable2 animatedDrawable2;
        this.LLJIJIL = false;
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        AnimatedDrawable2 animatedDrawable22 = this.LLIZ;
        if (animatedDrawable22 != null && animatedDrawable22.isRunning() && (animatedDrawable2 = this.LLIZ) != null) {
            animatedDrawable2.stop();
        }
        this.LLIZ = null;
        C20498815Ja c20498815Ja = this.LLJILLL;
        if (c20498815Ja != null) {
            c20498815Ja.release();
        }
        this.LLJILLL = null;
    }

    private final C1320700kTM<InterfaceC1330440kj4> getControllerListener() {
        return new C16I0(this, 0);
    }

    public final void LJIIIIZZ() {
        Aweme aweme = this.LLILZ;
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "otherclick", aweme != null ? aweme.getAwemeRawAd() : null);
        c1022820ciuLIZLLL.LIZJ("interactive_gesture", "refer");
        c1022820ciuLIZLLL.LJII();
    }

    @Override // X.InterfaceC996730c2p
    public final void LJJJJJL() {
        InterfaceC207173165b interfaceC207173165b;
        if (C1017070cZd.LLIZLLLIL(this.LLILZ) && this.LLJIJIL) {
            return;
        }
        if ((this.LLJIJIL || this.LLJILJIL) && C1483410ohn.LJLJJI().isPlaying() && (interfaceC207173165b = this.LLIZLLLIL) != null) {
            interfaceC207173165b.pauseVideo();
        }
    }

    @Override // X.InterfaceC996730c2p
    public final void onPause() {
        AnimatedDrawable2 animatedDrawable2;
        if (this.LLJIJIL) {
            AnimatedDrawable2 animatedDrawable22 = this.LLIZ;
            if (animatedDrawable22 != null && animatedDrawable22.isRunning() && (animatedDrawable2 = this.LLIZ) != null) {
                animatedDrawable2.stop();
            }
            C20498815Ja c20498815Ja = this.LLJILLL;
            if (c20498815Ja != null) {
                c20498815Ja.pause();
            }
        }
    }

    @Override // X.InterfaceC996730c2p
    public final void show() {
        AdGestureGuidance adGestureGuidance;
        String str;
        AdInteractionData adInteractionData = this.LLILZIL;
        if (adInteractionData == null || (adGestureGuidance = adInteractionData.gestureGuidance) == null || (str = this.LLILZLL) == null) {
            return;
        }
        View view = (View) getParent();
        C988710bpt c988710bpt = this.LLJ;
        int width = c988710bpt != null ? c988710bpt.LIZ : view.getWidth();
        C988710bpt c988710bpt2 = this.LLJ;
        int height = c988710bpt2 != null ? c988710bpt2.LIZIZ : view.getHeight();
        int width2 = width < view.getWidth() ? (view.getWidth() - width) / 2 : 0;
        int height2 = height < view.getHeight() ? (view.getHeight() - height) / 2 : 0;
        float f = width;
        float f2 = height;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (adGestureGuidance.width * f), (int) (adGestureGuidance.height * f2));
        C1322110kVd c1322110kVd = this.LL;
        if (c1322110kVd == null) {
            c1322110kVd = null;
        }
        C786410Ut5.c7(c1322110kVd, layoutParams);
        int width3 = width > view.getWidth() ? (width - view.getWidth()) / 2 : 0;
        int height3 = height > view.getHeight() ? (height - view.getHeight()) / 2 : 0;
        float f3 = ((f * adGestureGuidance.positionX) - width3) + width2;
        float f4 = ((f2 * adGestureGuidance.positionY) - height3) + height2;
        C1322110kVd c1322110kVd2 = this.LL;
        if (c1322110kVd2 == null) {
            c1322110kVd2 = null;
        }
        if (C444960Hcc.LIZJ(getContext())) {
            f3 = -f3;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1322110kVd2);
        c1322110kVd2.setTranslationX(f3);
        C1322110kVd c1322110kVd3 = this.LL;
        if (c1322110kVd3 == null) {
            c1322110kVd3 = null;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1322110kVd3);
        c1322110kVd3.setTranslationY(f4);
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        c1320810kTXLIZJ.LJII(str);
        c1320810kTXLIZJ.LJIIIIZZ = getControllerListener();
        c1320810kTXLIZJ.LJIIJJI = true;
        AbstractC1320710kTN abstractC1320710kTNLIZ = c1320810kTXLIZJ.LIZ();
        C1322110kVd c1322110kVd4 = this.LL;
        (c1322110kVd4 != null ? c1322110kVd4 : null).setController(abstractC1320710kTNLIZ);
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
    }

    @Override // X.InterfaceC207180165i
    public final void LIZJ() {
        ViewStub viewStub;
        if (getVisibility() == 0) {
            ((Vibrator) C786410Ut5.H2(getContext(), "vibrator")).vibrate(200L);
            Activity activityLIZ = C1388190mED.LIZ(getContext());
            if (activityLIZ != null) {
                KeyEvent.Callback callbackFindViewById = activityLIZ.findViewById(R.id.hs7);
                if (callbackFindViewById == null && (viewStub = (ViewStub) activityLIZ.findViewById(R.id.jqo)) != null) {
                    viewStub.setLayoutResource(R.layout.d4b);
                    callbackFindViewById = (C1028680csM) C786410Ut5.LJLLLL(viewStub);
                }
                C1028680csM c1028680csM = (C1028680csM) callbackFindViewById;
                if (c1028680csM != null) {
                    c1028680csM.setCallback(new InterfaceC1028690csN() { // from class: X.165Z
                        @Override // X.InterfaceC1028690csN
                        public final void LIZ(boolean z) {
                            AwemeRawAd awemeRawAd;
                            this.LIZ.LJII();
                            if (z) {
                                InterfaceC207173165b interfaceC207173165b = this.LIZ.LLIZLLLIL;
                                if (interfaceC207173165b != null) {
                                    interfaceC207173165b.LJJLIIJ();
                                }
                                Aweme aweme = this.LIZ.LLILZ;
                                if (aweme != null) {
                                    awemeRawAd = aweme.getAwemeRawAd();
                                } else {
                                    awemeRawAd = null;
                                }
                                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "close", awemeRawAd);
                                c1022820ciuLIZLLL.LIZJ("popup_window", "refer");
                                c1022820ciuLIZLLL.LJII();
                            }
                        }
                    });
                    AdInteractionData adInteractionData = this.LLILZIL;
                    UrlModel urlModel = adInteractionData != null ? adInteractionData.popupImage : null;
                    Aweme aweme = this.LLILZ;
                    if (urlModel != null) {
                        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
                        c1331670kl3LJIIIIZZ.LIZLLL("FeedAdInteractiveAwardMask");
                        c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
                        c1331670kl3LJIIIIZZ.LJJ(c1028680csM.getAwardImageFromXml());
                        c1331670kl3LJIIIIZZ.LIZLLL = true;
                        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                    }
                    C786410Ut5.Q7(c1028680csM.getCloseImageFromXml(), new ACListenerS151S0100000_16(c1028680csM, 9));
                    C786410Ut5.Q8(c1028680csM.getAwardImageFromXml(), new ACListenerS119S0200000_16(c1028680csM, aweme, 3));
                    int visibility = c1028680csM.getVisibility();
                    c1028680csM.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility, 0, c1028680csM);
                    C786410Ut5.U4(c1028680csM.getAwardLayoutFromXml(), 0.0f);
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1028680csM.getAwardLayoutFromXml(), "alpha", 0.0f, 1.0f);
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c1028680csM.getAwardLayoutFromXml(), "scaleX", 0.0f, 1.0f);
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(c1028680csM.getAwardLayoutFromXml(), "scaleY", 0.0f, 1.0f);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(400L);
                    animatorSet.setInterpolator(new C21388418n4());
                    animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3);
                    animatorSet.start();
                    this.LLJILJIL = true;
                    Aweme aweme2 = this.LLILZ;
                    C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", aweme2 != null ? aweme2.getAwemeRawAd() : null);
                    c1022820ciuLIZLLL.LIZJ("popup_window", "refer");
                    c1022820ciuLIZLLL.LJII();
                }
            }
        }
        LJI();
        LJIIIIZZ();
    }

    public final void LJII() {
        Activity activityLIZ = C1388190mED.LIZ(getContext());
        if (activityLIZ == null) {
            return;
        }
        View viewFindViewById = activityLIZ.findViewById(R.id.hs7);
        if (viewFindViewById != null && viewFindViewById.getVisibility() != 8) {
            int visibility = viewFindViewById.getVisibility();
            viewFindViewById.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, viewFindViewById);
        }
        this.LLJILJIL = false;
    }

    @Override // X.InterfaceC207180165i
    public final void m() {
        LJI();
        InterfaceC207173165b interfaceC207173165b = this.LLIZLLLIL;
        if (interfaceC207173165b != null) {
            interfaceC207173165b.LJJLIIJ();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.LL = (C1322110kVd) findViewById(R.id.a9l);
        this.LLILLJJLI = (C207177165f) findViewById(R.id.a9k);
        this.LLILLL = (C207178165g) findViewById(R.id.a9j);
        C1322110kVd c1322110kVd = this.LL;
        if (c1322110kVd == null) {
            c1322110kVd = null;
        }
        C1331090kk7 c1331090kk7 = new C1331090kk7(getContext().getResources());
        c1331090kk7.LJIIL = InterfaceC1320380kSq.LIZJ;
        c1322110kVd.setHierarchy(c1331090kk7.LIZ());
        C207177165f c207177165f = this.LLILLJJLI;
        if (c207177165f == null) {
            c207177165f = null;
        }
        c207177165f.setInteractiveListener(this);
        C207178165g c207178165g = this.LLILLL;
        (c207178165g != null ? c207178165g : null).setInteractiveListener(this);
    }

    @Override // X.InterfaceC996730c2p
    public final void reset() {
        LJI();
        LJII();
        this.LLJILJILJ = 0;
    }

    @Override // X.InterfaceC207180165i
    public final void LIZLLL() {
        LJIIIIZZ();
    }

    public final C988710bpt getTextureSize() {
        return this.LLJ;
    }

    @Override // X.InterfaceC996730c2p
    public final boolean isShowing() {
        return this.LLJILJIL;
    }

    public final void LJIIIZ(AnimatedDrawable2 animatedDrawable2) {
        UrlModel urlModel;
        List<String> urlList;
        InterfaceC207173165b interfaceC207173165b;
        AdInteractionData adInteractionData = this.LLILZIL;
        if (adInteractionData == null) {
            return;
        }
        final C1331020kk0 c1331020kk0 = new C1331020kk0(animatedDrawable2.LLILLL, 1);
        animatedDrawable2.LJI(c1331020kk0);
        animatedDrawable2.LJII(new InterfaceC1331000kjy() { // from class: X.165a
            @Override // X.InterfaceC1331000kjy
            public final void LIZ(AnimatedDrawable2 animatedDrawable22) {
            }

            @Override // X.InterfaceC1331000kjy
            public final void LIZIZ(AnimatedDrawable2 animatedDrawable22) {
            }

            @Override // X.InterfaceC1331000kjy
            public final void LIZJ(AnimatedDrawable2 animatedDrawable22) {
            }

            @Override // X.InterfaceC1331000kjy
            public final void LIZLLL(AnimatedDrawable2 animatedDrawable22, int i) {
                C165Y c165y = this.LIZ;
                if (c165y.LLJILJILJ == 0 || i != 0) {
                    c165y.LLJILJILJ = i;
                }
                if (i == c1331020kk0.getFrameCount() - 1) {
                    this.LIZ.LJI();
                    InterfaceC207173165b interfaceC207173165b2 = this.LIZ.LLIZLLLIL;
                    if (interfaceC207173165b2 != null) {
                        interfaceC207173165b2.LJJLIIJ();
                    }
                }
            }
        });
        animatedDrawable2.start();
        int i = adInteractionData.interactionType;
        C207177165f c207177165f = null;
        if (i == 0) {
            C207178165g c207178165g = this.LLILLL;
            if (c207178165g == null) {
                c207178165g = null;
            }
            int visibility = c207178165g.getVisibility();
            c207178165g.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c207178165g);
            C207177165f c207177165f2 = this.LLILLJJLI;
            if (c207177165f2 != null) {
                c207177165f = c207177165f2;
            }
            int visibility2 = c207177165f.getVisibility();
            c207177165f.setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, c207177165f);
        } else {
            C207178165g c207178165g2 = this.LLILLL;
            if (c207178165g2 == null) {
                c207178165g2 = null;
            }
            int visibility3 = c207178165g2.getVisibility();
            c207178165g2.setVisibility(8);
            C1602160rnK.LIZIZ(visibility3, 8, c207178165g2);
            C207177165f c207177165f3 = this.LLILLJJLI;
            if (c207177165f3 != null) {
                c207177165f = c207177165f3;
            }
            int visibility4 = c207177165f.getVisibility();
            c207177165f.setVisibility(0);
            C1602160rnK.LIZIZ(visibility4, 0, c207177165f);
        }
        if (C1483410ohn.LJLJJI().isPlaying() && (interfaceC207173165b = this.LLIZLLLIL) != null) {
            interfaceC207173165b.pauseVideo();
        }
        AdInteractionData adInteractionData2 = this.LLILZIL;
        if (adInteractionData2 != null && (urlModel = adInteractionData2.music) != null && (urlList = urlModel.getUrlList()) != null && !urlList.isEmpty()) {
            if (this.LLJILLL == null) {
                this.LLJILLL = new C20498815Ja("FeedAdInteractiveLayout");
            }
            C20498815Ja c20498815Ja = this.LLJILLL;
            if (c20498815Ja != null) {
                C1485060okS c1485060okS = new C1485060okS();
                c1485060okS.LIZJ = 4;
                c1485060okS.LIZIZ = urlList;
                c1485060okS.LJI = true;
                c20498815Ja.LIZIZ(c1485060okS);
            }
        }
    }

    @Override // X.InterfaceC996730c2p
    public void setOperator(InterfaceC207173165b interfaceC207173165b) {
        this.LLIZLLLIL = interfaceC207173165b;
    }

    public final void setTextureSize(C988710bpt c988710bpt) {
        this.LLJ = c988710bpt;
    }

    @Override // X.InterfaceC996730c2p
    public void setVideoSize(C988710bpt c988710bpt) {
        this.LLJ = c988710bpt;
    }

    public C165Y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // X.InterfaceC996730c2p
    public final void LJ(String str, boolean z) {
        if (Intrinsics.LJFF(str, "HOME") && this.LLJIJIL && z) {
            AnimatedDrawable2 animatedDrawable2 = this.LLIZ;
            if (animatedDrawable2 != null && !animatedDrawable2.isRunning()) {
                AnimatedDrawable2 animatedDrawable22 = this.LLIZ;
                if (animatedDrawable22 != null) {
                    animatedDrawable22.start();
                }
                AnimatedDrawable2 animatedDrawable23 = this.LLIZ;
                if (animatedDrawable23 != null) {
                    animatedDrawable23.LJ(this.LLJILJILJ);
                }
            }
            C20498815Ja c20498815Ja = this.LLJILLL;
            if (c20498815Ja != null) {
                c20498815Ja.resume();
            }
        }
    }

    @Override // X.InterfaceC996730c2p
    public final void LJFF(Aweme aweme, String str) {
        AdInteractionData adInteractionData;
        AwemeRawAd awemeRawAd;
        this.LLILZ = aweme;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            adInteractionData = awemeRawAd.getAdInteractionData();
        } else {
            adInteractionData = null;
        }
        this.LLILZIL = adInteractionData;
        this.LLILZLL = str;
    }
}

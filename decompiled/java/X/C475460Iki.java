package X;

import Y.ACListenerS142S0100000_7;
import Y.AUListenerS257S0100000_7;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.bytedance.android.feed.api.TopLiveLoadingViewHideEvent;
import com.bytedance.android.livesdk.livesetting.watchlive.TopLiveLoadingAnimTypeSetting;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0Iki, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C475460Iki {
    public final Activity LIZ;
    public final boolean LIZIZ;
    public final View LIZJ;
    public Function0<Float> LIZLLL;
    public C1324720kZq LJ;
    public View LJFF;
    public View LJIIIZ;
    public C16FZ LJIIJ;
    public C1295960jpS LJIIJJI;
    public ValueAnimator LJIIL;
    public boolean LJI = true;
    public boolean LJII = true;
    public boolean LJIIIIZZ = true;
    public final C01GW LJIILIIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(257));

    public final void LIZIZ() {
        ValueAnimator valueAnimator = this.LJIIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LJIIIIZZ = false;
        C12ES.LJIILL(8, this.LJ);
        LJ();
        DataChannelGlobal.LLILZ.FQ2(TopLiveLoadingViewHideEvent.class, Unit.LIZ);
    }

    public final void LIZJ() {
        ValueAnimator valueAnimator = this.LJIIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LJI = false;
        LIZ(8);
        LJ();
    }

    public final void LJ() {
        if (this.LJIIIIZZ || this.LJI || this.LJII) {
            return;
        }
        View view = this.LJIIIZ;
        if (view != null && view.getVisibility() == 0) {
            EnterRoomConfig.TimeStamp timeStamp = C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData.timeStamps;
            long jCurrentTimeMillis = (timeStamp == null || timeStamp.enterRoomStarTimeReal <= 0) ? -1L : System.currentTimeMillis() - timeStamp.enterRoomStarTimeReal;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toplives_loading_quit");
            c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis), "duration");
            c474500IjALIZ.LJJII("success", "quit_type");
            c474500IjALIZ.LIZ();
        }
        C12ES.LJIILL(8, this.LJIIIZ);
    }

    public final void LIZ(int i) {
        if (i != 0) {
            if (i == 8) {
                C16FZ c16fz = this.LJIIJ;
                if (c16fz != null) {
                    C500260Jjc.LJLJLJ(c16fz, false);
                }
                C1295960jpS c1295960jpS = this.LJIIJJI;
                if (c1295960jpS != null) {
                    C500260Jjc.LJLJLJ(c1295960jpS, false);
                }
                C1295960jpS c1295960jpS2 = this.LJIIJJI;
                if (c1295960jpS2 != null) {
                    c1295960jpS2.cancelAnimation();
                    return;
                }
                return;
            }
            return;
        }
        C16FZ c16fz2 = this.LJIIJ;
        if (c16fz2 != null) {
            C500260Jjc.LJLJLJ(c16fz2, true);
        }
        C1295960jpS c1295960jpS3 = this.LJIIJJI;
        if (c1295960jpS3 != null) {
            C500260Jjc.LJLJLJ(c1295960jpS3, true);
        }
        C1295960jpS c1295960jpS4 = this.LJIIJJI;
        if (c1295960jpS4 == null) {
            return;
        }
        c1295960jpS4.playAnimation();
    }

    public final void LIZLLL(boolean z) {
        final float fFloatValue;
        Number numberValueOf;
        float fFloatValue2;
        Float fInvoke;
        Float fInvoke2;
        C1324720kZq c1324720kZq = this.LJ;
        if (c1324720kZq != null && c1324720kZq.getVisibility() == 0) {
            if (z) {
                Function0<Float> function0 = this.LIZLLL;
                if (function0 != null && (fInvoke2 = function0.invoke()) != null) {
                    fFloatValue = fInvoke2.floatValue();
                } else {
                    fFloatValue = ((Number) this.LJIILIIL.getValue()).floatValue();
                }
            } else {
                fFloatValue = 0.0f;
            }
            C1324720kZq c1324720kZq2 = this.LJ;
            if (c1324720kZq2 != null) {
                numberValueOf = Float.valueOf(c1324720kZq2.getY());
            } else {
                numberValueOf = 0;
            }
            float fFloatValue3 = numberValueOf.floatValue();
            ValueAnimator valueAnimator = this.LJIIL;
            if (valueAnimator == null) {
                this.LJIIL = ValueAnimator.ofFloat(fFloatValue3, fFloatValue);
            } else {
                valueAnimator.setFloatValues(fFloatValue3, fFloatValue);
            }
            ValueAnimator valueAnimator2 = this.LJIIL;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                valueAnimator2.removeAllUpdateListeners();
                valueAnimator2.removeAllListeners();
                valueAnimator2.setInterpolator(new LinearInterpolator());
                float fAbs = Math.abs(fFloatValue3 - fFloatValue);
                Function0<Float> function02 = this.LIZLLL;
                if (function02 != null && (fInvoke = function02.invoke()) != null) {
                    fFloatValue2 = fInvoke.floatValue();
                } else {
                    fFloatValue2 = ((Number) this.LJIILIIL.getValue()).floatValue();
                }
                valueAnimator2.setDuration((long) ((fAbs / fFloatValue2) * 300.0f));
                valueAnimator2.addUpdateListener(new AUListenerS257S0100000_7(this, 14));
                valueAnimator2.addListener(new Animator.AnimatorListener() { // from class: X.0Ikj
                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                        C1324720kZq c1324720kZq3 = this.LL.LJ;
                        if (c1324720kZq3 != null) {
                            C786410Ut5.md(c1324720kZq3, fFloatValue);
                        }
                        C1295960jpS c1295960jpS = this.LL.LJIIJJI;
                        if (c1295960jpS != null) {
                            C786410Ut5.ld(c1295960jpS, fFloatValue);
                        }
                        C16FZ c16fz = this.LL.LJIIJ;
                        if (c16fz != null) {
                            float f = fFloatValue;
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c16fz);
                            c16fz.setTranslationY(f);
                        }
                    }
                });
                valueAnimator2.start();
            }
        }
    }

    public C475460Iki(C19GS c19gs, boolean z, View view, Function0 function0) {
        ViewStub viewStub;
        C1295960jpS c1295960jpS;
        C1295960jpS c1295960jpS2;
        C16FZ c16fz;
        C16FZ c16fz2;
        this.LIZ = c19gs;
        this.LIZIZ = z;
        this.LIZJ = view;
        this.LIZLLL = function0;
        if (c19gs != null) {
            if ((view != null && (viewStub = (ViewStub) view.findViewById(R.id.nlo)) != null) || (viewStub = (ViewStub) c19gs.findViewById(R.id.nlo)) != null) {
                View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
                this.LJIIIZ = viewLJLLLL;
                if (viewLJLLLL != null) {
                    this.LJ = (C1324720kZq) viewLJLLLL.findViewById(R.id.mu2);
                    TopLiveLoadingAnimTypeSetting topLiveLoadingAnimTypeSetting = TopLiveLoadingAnimTypeSetting.INSTANCE;
                    if (topLiveLoadingAnimTypeSetting.getAnimType() > 0 && z) {
                        C1143680frq.LJIIJ(this.LJ, C1143780fs0.LJIIJJI("tiktok_live_watch_resource_normal_2", "enter_toplive_default_background.png"), ImageView.ScaleType.CENTER_CROP, null, false, null, 48);
                    } else {
                        C1324720kZq c1324720kZq = this.LJ;
                        if (c1324720kZq != null) {
                            c1324720kZq.setBackground(C0HAS.LIZ(c19gs));
                        }
                    }
                    if (!z) {
                        View view2 = this.LJIIIZ;
                        if (view2 != null) {
                            c16fz2 = (C16FZ) view2.findViewById(R.id.n3r);
                        } else {
                            c16fz2 = null;
                        }
                        this.LJIIJ = c16fz2;
                    } else {
                        int animType = topLiveLoadingAnimTypeSetting.getAnimType();
                        if (animType != 2) {
                            if (animType != 3) {
                                View view3 = this.LJIIIZ;
                                if (view3 != null) {
                                    c16fz = (C16FZ) view3.findViewById(R.id.n3r);
                                } else {
                                    c16fz = null;
                                }
                                this.LJIIJ = c16fz;
                            } else {
                                View view4 = this.LJIIIZ;
                                if (view4 != null) {
                                    c1295960jpS2 = (C1295960jpS) view4.findViewById(R.id.n1r);
                                } else {
                                    c1295960jpS2 = null;
                                }
                                this.LJIIJJI = c1295960jpS2;
                                C1143680frq.LJIIJJI(c1295960jpS2, "tiktok_live_watch_resource_normal_2", "live_logo_loading_lottie.zip");
                            }
                        } else {
                            View view5 = this.LJIIIZ;
                            if (view5 != null) {
                                c1295960jpS = (C1295960jpS) view5.findViewById(R.id.n1r);
                            } else {
                                c1295960jpS = null;
                            }
                            this.LJIIJJI = c1295960jpS;
                            C1143680frq.LJIIJJI(c1295960jpS, "tiktok_live_watch_resource_normal_2", "tiktok_logo_loading_lottie.zip");
                        }
                    }
                    View view6 = this.LJIIIZ;
                    View viewFindViewById = view6 != null ? view6.findViewById(R.id.mvn) : null;
                    this.LJFF = viewFindViewById;
                    if (viewFindViewById != null) {
                        C786410Ut5.I7(new ACListenerS142S0100000_7(this, 192), viewFindViewById);
                    }
                }
            }
        }
    }
}

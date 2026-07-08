package X;

import Y.AAListenerS275S0200000_27;
import Y.AAListenerS337S0100000_27;
import Y.AAListenerS75S0201000_27;
import Y.AUListenerS11S0111000_27;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0yAS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1847140yAS extends C1847050yAJ {
    public final int LJIIJJI;
    public final LinearLayout LJIIL;
    public final C1847150yAT LJIILIIL;
    public final C1847150yAT LJIILJJIL;
    public final C1846630y9d LJIILL;
    public C1847150yAT LJIILLIIL;

    @Override // X.C1847050yAJ
    public final void LJI(C1119420fEi c1119420fEi) {
    }

    @Override // X.C1847050yAJ, X.InterfaceC1846720y9m
    public final Pair<Integer, Integer> LIZ() {
        C1846630y9d c1846630y9d;
        C1846630y9d c1846630y9d2;
        C1119210fEN.LIZ.getClass();
        int i = C1119210fEN.LIZJ;
        this.LJIILL.setText(u.LJJIFFI(C497740JfY.LJIJI(this.LJIIJJI), "[league_tier_and_fragments]", "", false));
        LJIIIIZZ();
        C1847150yAT c1847150yAT = this.LJIILLIIL;
        if (c1847150yAT != null) {
            C500260Jjc.LLFFF(c1847150yAT);
        }
        C1847150yAT c1847150yAT2 = this.LJIILLIIL;
        if (c1847150yAT2 != null && (c1846630y9d2 = c1847150yAT2.LL) != null) {
            c1846630y9d2.setText("D5");
        }
        C1847150yAT c1847150yAT3 = this.LJIILLIIL;
        if (c1847150yAT3 != null) {
            C1324720kZq c1324720kZq = c1847150yAT3.LLILZ;
            if (c1324720kZq != null) {
                C500260Jjc.LLFFF(c1324720kZq);
            }
            C1324720kZq c1324720kZq2 = c1847150yAT3.LLILZLL;
            if (c1324720kZq2 != null) {
                C500260Jjc.LLFFF(c1324720kZq2);
            }
            C1324720kZq c1324720kZq3 = c1847150yAT3.LLIZLLLIL;
            if (c1324720kZq3 != null) {
                C500260Jjc.LLFFF(c1324720kZq3);
            }
        }
        C1846800y9u.LJIIJJI(this.LJIIL);
        C1847150yAT c1847150yAT4 = this.LJIILLIIL;
        if (c1847150yAT4 != null && (c1846630y9d = c1847150yAT4.LL) != null) {
            c1846630y9d.setText("");
        }
        C1847150yAT c1847150yAT5 = this.LJIILLIIL;
        if (c1847150yAT5 != null) {
            C1324720kZq c1324720kZq4 = c1847150yAT5.LLILZ;
            if (c1324720kZq4 != null) {
                C500260Jjc.LJIILIIL(c1324720kZq4);
            }
            C1324720kZq c1324720kZq5 = c1847150yAT5.LLILZLL;
            if (c1324720kZq5 != null) {
                C500260Jjc.LJIILIIL(c1324720kZq5);
            }
            C1324720kZq c1324720kZq6 = c1847150yAT5.LLIZLLLIL;
            if (c1324720kZq6 != null) {
                C500260Jjc.LJIILIIL(c1324720kZq6);
            }
            C1324720kZq c1324720kZq7 = c1847150yAT5.LLILZIL;
            if (c1324720kZq7 != null) {
                C500260Jjc.LJIILIIL(c1324720kZq7);
            }
            C1324720kZq c1324720kZq8 = c1847150yAT5.LLIZ;
            if (c1324720kZq8 != null) {
                C500260Jjc.LJIILIIL(c1324720kZq8);
            }
            C1324720kZq c1324720kZq9 = c1847150yAT5.LLJ;
            if (c1324720kZq9 != null) {
                C500260Jjc.LJIILIIL(c1324720kZq9);
            }
        }
        this.LJIILL.setText("");
        return new Pair<>(Integer.valueOf(this.LJIIL.getMeasuredWidth() + i), Integer.valueOf(this.LJIIL.getMeasuredHeight()));
    }

    @Override // X.C1847050yAJ
    public final void LJII() {
        int i;
        C1846930yA7 c1846930yA7;
        T t = this.LIZIZ;
        int i2 = (t == 0 || (c1846930yA7 = t.LJIIIZ) == null) ? 0 : c1846930yA7.LIZ;
        C786410Ut5.LJZI(0, this.LJFF);
        ImageView imageView = this.LJFF;
        switch (i2) {
            case 100:
            case 200:
            case DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL /* 300 */:
            case 400:
            case 500:
                i = R.drawable.dnh;
                break;
            case 600:
            case OppoPermissionPopupMaskDelayExp.DEFAULT /* 700 */:
            case 800:
            case 900:
            case LSPassThroughRecordSizeConfig.DEFAULT /* 1000 */:
                i = R.drawable.dnf;
                break;
            case 1100:
            case 1200:
            case 1300:
            case 1400:
            case ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED /* 1500 */:
                i = R.drawable.dnd;
                break;
            default:
                i = R.drawable.dnb;
                break;
        }
        imageView.setImageResource(i);
        if (C497740JfY.LJJ()) {
            ImageView imageView2 = this.LJFF;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(imageView2);
            imageView2.setRotationY(180.0f);
        }
    }

    public final void LJIIIIZZ() {
        if (this.LJIILLIIL != null) {
            return;
        }
        String strLJIJI = C497740JfY.LJIJI(this.LJIIJJI);
        int iLJJJ = a0.LJJJ(strLJIJI, "[league_tier_and_fragments]", 0, false, 6);
        if (iLJJJ < 0) {
            C500260Jjc.LJIILIIL(this.LJIILIIL);
            C500260Jjc.LJIILIIL(this.LJIILJJIL);
            this.LJIILLIIL = null;
        } else if (TextUtils.isEmpty(strLJIJI.substring(0, iLJJJ))) {
            C500260Jjc.LLFFF(this.LJIILIIL);
            C500260Jjc.LJIILIIL(this.LJIILJJIL);
            this.LJIILLIIL = this.LJIILIIL;
        } else {
            C500260Jjc.LJIILIIL(this.LJIILIIL);
            C500260Jjc.LLFFF(this.LJIILJJIL);
            this.LJIILLIIL = this.LJIILJJIL;
        }
    }

    public C1847140yAS(C1091250eVH c1091250eVH) {
        super(c1091250eVH, 2131855529);
        this.LJIIJJI = 2131855529;
        LinearLayout linearLayout = (LinearLayout) c1091250eVH.findViewById(R.id.sqv);
        this.LJIIL = linearLayout;
        this.LJIILIIL = (C1847150yAT) c1091250eVH.findViewById(R.id.i6x);
        this.LJIILJJIL = (C1847150yAT) c1091250eVH.findViewById(R.id.i9p);
        C1846630y9d c1846630y9d = (C1846630y9d) c1091250eVH.findViewById(R.id.zdr);
        this.LJIILL = c1846630y9d;
        C500260Jjc.LJIILIIL(this.LJ);
        C500260Jjc.LLFFF(linearLayout);
        c1846630y9d.LJJJJI();
        C1119210fEN.LIZ.getClass();
        int i = C1119210fEN.LIZJ;
        c1846630y9d.LLJJIJIIJIL = true;
        c1846630y9d.LLJJIJI = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1847050yAJ, X.AbstractC1846670y9h
    public final void LIZLLL(C1119420fEi c1119420fEi) {
        int i;
        long j;
        this.LIZIZ = c1119420fEi;
        LJII();
        C1846630y9d c1846630y9d = this.LJIILL;
        C1846930yA7 c1846930yA7LJIIIIZZ = C1846800y9u.LJIIIIZZ(c1119420fEi);
        int i2 = 0;
        if (c1846930yA7LJIIIIZZ != null) {
            i = c1846930yA7LJIIIIZZ.LIZ;
        } else {
            i = 0;
        }
        c1846630y9d.LJJJJL(C1847160yAU.LIZLLL(i));
        String str = "";
        this.LJIILL.setText(u.LJJIFFI(C497740JfY.LJIJI(this.LJIIJJI), "[league_tier_and_fragments]", "", false));
        LJIIIIZZ();
        C1847150yAT c1847150yAT = this.LJIILLIIL;
        if (c1847150yAT != null) {
            C500260Jjc.LLFFF(c1847150yAT);
        }
        C1847150yAT c1847150yAT2 = this.LJIILLIIL;
        if (c1847150yAT2 != null) {
            C1324720kZq c1324720kZq = c1847150yAT2.LLILZ;
            if (c1324720kZq != null) {
                C500260Jjc.LLFFF(c1324720kZq);
            }
            C1324720kZq c1324720kZq2 = c1847150yAT2.LLILZLL;
            if (c1324720kZq2 != null) {
                C500260Jjc.LLFFF(c1324720kZq2);
            }
            C1324720kZq c1324720kZq3 = c1847150yAT2.LLIZLLLIL;
            if (c1324720kZq3 != null) {
                C500260Jjc.LLFFF(c1324720kZq3);
            }
            C1846930yA7 c1846930yA7LJIIIIZZ2 = C1846800y9u.LJIIIIZZ(c1119420fEi);
            if (c1846930yA7LJIIIIZZ2 != null) {
                i2 = c1846930yA7LJIIIIZZ2.LIZ;
            }
            C1846930yA7 c1846930yA7LJIIIIZZ3 = C1846800y9u.LJIIIIZZ(c1119420fEi);
            if (c1846930yA7LJIIIIZZ3 != null) {
                j = c1846930yA7LJIIIIZZ3.LIZIZ;
            } else {
                j = 0;
            }
            int i3 = (int) j;
            C1846630y9d c1846630y9d2 = c1847150yAT2.LL;
            if (c1846630y9d2 != null) {
                c1846630y9d2.LJJJJL(C1847160yAU.LIZLLL(i2));
            }
            C1846630y9d c1846630y9d3 = c1847150yAT2.LL;
            if (c1846630y9d3 != null) {
                int[] iArrLIZJ = C1847160yAU.LIZJ(i2);
                boolean z = C1105900esu.LIZIZ;
                String strLIZJ = C1105900esu.LIZJ(i2);
                if (strLIZJ != null) {
                    str = strLIZJ;
                }
                c1846630y9d3.LJJJJJ(str, iArrLIZJ);
            }
            c1847150yAT2.LLJIJIL = i2;
            C1846630y9d c1846630y9d4 = c1847150yAT2.LL;
            if (c1846630y9d4 != null) {
                boolean z2 = C1105900esu.LIZIZ;
                c1846630y9d4.setText(C1105900esu.LIZJ(i2));
            }
            C1847160yAU.LJ(i2, 1, i3, c1847150yAT2.LLILZ);
            C1847160yAU.LJ(i2, 2, i3, c1847150yAT2.LLILZLL);
            C1847160yAU.LJ(i2, 3, i3, c1847150yAT2.LLIZLLLIL);
        }
    }

    @Override // X.C1847050yAJ, X.AbstractC1846670y9h
    public final void LJ(C1119420fEi c1119420fEi) {
        int i;
        int i2;
        long j;
        long j2;
        boolean z;
        boolean z2;
        int height;
        T t = this.LIZIZ;
        if (t != 0) {
            C1847150yAT c1847150yAT = this.LJIILLIIL;
            if (c1847150yAT != null) {
                C500260Jjc.LLFFF(c1847150yAT);
            }
            C1847150yAT c1847150yAT2 = this.LJIILLIIL;
            if (c1847150yAT2 != null) {
                AwS428S0200000_27 awS428S0200000_27 = new AwS428S0200000_27(this, c1119420fEi, 99);
                AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(this, 1343);
                AwS571S0100000_27 awS571S0100000_272 = new AwS571S0100000_27(this, 1344);
                C1846930yA7 c1846930yA7LJIIIIZZ = C1846800y9u.LJIIIIZZ(c1119420fEi);
                C1846930yA7 c1846930yA7 = t.LJIIIZ;
                if (c1846930yA7 != null) {
                    i = c1846930yA7.LIZ;
                } else {
                    i = 0;
                }
                if (c1846930yA7LJIIIIZZ != null) {
                    i2 = c1846930yA7LJIIIIZZ.LIZ;
                } else {
                    i2 = 0;
                }
                long j3 = 0;
                if (c1846930yA7 != null) {
                    j = c1846930yA7.LIZIZ;
                } else {
                    j = 0;
                }
                if (c1846930yA7LJIIIIZZ != null) {
                    j2 = c1846930yA7LJIIIIZZ.LIZIZ;
                } else {
                    j2 = 0;
                }
                if (i != i2) {
                    awS428S0200000_27.invoke();
                    c1847150yAT2.LLJI = true;
                    if (i2 > i) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    FrameLayout frameLayout = c1847150yAT2.LLILLL;
                    if (frameLayout != null) {
                        height = frameLayout.getHeight();
                    } else {
                        height = 0;
                    }
                    C500260Jjc.LLFFF(c1847150yAT2.LLILLJJLI);
                    C1846630y9d c1846630y9d = c1847150yAT2.LLILLJJLI;
                    if (c1846630y9d != null) {
                        int[] iArrLIZJ = C1847160yAU.LIZJ(i2);
                        boolean z3 = C1105900esu.LIZIZ;
                        String strLIZJ = C1105900esu.LIZJ(i2);
                        if (strLIZJ == null) {
                            strLIZJ = "";
                        }
                        c1846630y9d.LJJJJJ(strLIZJ, iArrLIZJ);
                    }
                    C1846630y9d c1846630y9d2 = c1847150yAT2.LLILLJJLI;
                    if (c1846630y9d2 != null) {
                        boolean z4 = C1105900esu.LIZIZ;
                        c1846630y9d2.setText(C1105900esu.LIZJ(i2));
                    }
                    C1846630y9d c1846630y9d3 = c1847150yAT2.LLILLJJLI;
                    if (c1846630y9d3 != null) {
                        float f = height;
                        if (!z2) {
                            f *= -1.0f;
                        }
                        C786410Ut5.qd(c1846630y9d3, f);
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.setDuration(600L);
                    valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.66f, -0.0f, 0.34f, 1.0f));
                    valueAnimatorOfFloat.addUpdateListener(new AUListenerS11S0111000_27(z2, c1847150yAT2, height, 1));
                    valueAnimatorOfFloat.addListener(new AAListenerS75S0201000_27(c1847150yAT2, awS571S0100000_27, i2, 1));
                    valueAnimatorOfFloat.start();
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat2.setDuration(10L);
                    j3 = 80;
                    valueAnimatorOfFloat2.setStartDelay(80L);
                    valueAnimatorOfFloat2.addListener(new AAListenerS337S0100000_27(awS571S0100000_272, 4));
                    valueAnimatorOfFloat2.start();
                }
                if (j != j2 && c1847150yAT2.LLILZ != null && c1847150yAT2.LLILZLL != null && c1847150yAT2.LLIZLLLIL != null) {
                    awS428S0200000_27.invoke();
                    c1847150yAT2.LLJI = true;
                    if (i != i2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ObjectAnimator objectAnimatorLIZ = c1847150yAT2.LIZ(c1847150yAT2.LLILZ, c1847150yAT2.LLILZIL, j, j2, 1, i2, z);
                    boolean z5 = z;
                    ObjectAnimator objectAnimatorLIZ2 = c1847150yAT2.LIZ(c1847150yAT2.LLILZLL, c1847150yAT2.LLIZ, j, j2, 2, i2, z5);
                    ObjectAnimator objectAnimatorLIZ3 = c1847150yAT2.LIZ(c1847150yAT2.LLIZLLLIL, c1847150yAT2.LLJ, j, j2, 3, i2, z5);
                    c1847150yAT2.LLJIJIL = i2;
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.addListener(new AAListenerS275S0200000_27(c1847150yAT2, awS571S0100000_27, 2));
                    animatorSet.playTogether(objectAnimatorLIZ, objectAnimatorLIZ2, objectAnimatorLIZ3);
                    animatorSet.setStartDelay(j3);
                    animatorSet.start();
                }
            }
        }
    }
}

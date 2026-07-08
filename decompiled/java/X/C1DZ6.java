package X;

import Y.ARunnableS135S0100000_35;
import Y.AUListenerS161S0300000_35;
import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.SeekBar;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.1DZ6, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public class C1DZ6 extends C21413918rB implements C0S3W {
    public static final String LLLF = C0S3Y.LIZ("VideoSeekBar");
    public C1DZA LLILLJJLI;
    public C1DZA LLILLL;
    public C1DZA LLILZ;
    public C1DZA LLILZIL;
    public C1DZF LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;
    public boolean LLJI;
    public long LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public LayerDrawable LLJJ;
    public Drawable LLJJI;
    public Drawable LLJJIII;
    public Drawable LLJJIJI;
    public Drawable LLJJIJIIJIL;
    public Animator LLJJIJIL;
    public boolean LLJJJ;
    public float LLJJJIL;
    public float LLJJJJ;
    public float LLJJJJJIL;
    public int LLJJJJLIIL;
    public final C1DZH LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final C1DZJ LLJL;
    public Function2<? super MotionEvent, ? super Float, Integer> LLJLIL;
    public Set<C1DZN> LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public C1DZA LLJLLL;
    public final C1DZI LLJZ;
    public final ARunnableS135S0100000_35 LLJZIJLIL;
    public InterfaceC715130S3j LLL;

    @Override // X.C0S3W
    public final void LIZ() {
        ((ArrayList) this.LLJJL.LLILLJJLI).clear();
    }

    @Override // X.C0S3W
    public final void LIZLLL() {
        ((ArrayList) this.LLJL.LIZ).clear();
    }

    public final void LJIIJ() {
        if (!this.LLJJJ && isEnabled() && getVisibility() == 0) {
            C1481110oe5.LIZIZ(LLLF, "onStartTrackingTouch");
            this.LLJJJ = true;
            if (this.LLJI) {
                HandlerHook.viewRemoveCallbacks(this, this.LLJZIJLIL);
                LJ(C1DZD.DRAG);
            }
            this.LLJJL.onStartTrackingTouch(this);
        }
    }

    public final void LJIIJJI() {
        if (this.LLJJJ && isEnabled() && getVisibility() == 0) {
            C1481110oe5.LIZIZ(LLLF, "onStopTrackingTouch");
            this.LLJJL.onStopTrackingTouch(this);
            this.LLJJJ = false;
            if (this.LLJI) {
                LJ(C1DZD.RELEASE);
                if (this.LLJLL) {
                    HandlerHook.viewRemoveCallbacks(this, this.LLJZIJLIL);
                    HandlerHook.viewPostDelay(this, this.LLJZIJLIL, this.LLJIJIL);
                }
            }
        }
    }

    public final C1DZA getActiveStyleConfig() {
        C1DZA c1dza = this.LLILLL;
        return c1dza == null ? C1DZ7.LIZIZ() : c1dza;
    }

    public final C1DZA getDefaultStyleConfig() {
        C1DZA c1dza = this.LLILLJJLI;
        if (c1dza != null) {
            return c1dza;
        }
        C19PZ c19pz = C1DZ7.LIZ;
        return new C1DZA();
    }

    public final C1DZA getDragStyleConfig() {
        C1DZA c1dza = this.LLILZ;
        return c1dza == null ? C1DZ7.LIZJ() : c1dza;
    }

    public final C1DZA getFrozenStyleConfig() {
        C1DZA c1dza = this.LLILZIL;
        return c1dza == null ? C1DZ7.LIZLLL() : c1dza;
    }

    public final EnumC2249791D3x getPreviousState() {
        return this.LLJZ.LIZJ;
    }

    public final EnumC2249791D3x getState() {
        return this.LLJZ.LIZIZ;
    }

    private final float getScale() {
        int max = getMax();
        if (max > 0) {
            return getProgress() / max;
        }
        return 0.0f;
    }

    @Override // android.widget.ProgressBar, X.C0S3W
    public int getProgress() {
        return super.getProgress();
    }

    @Override // X.C0S3W
    public final boolean LIZJ() {
        return this.LLJLLIL;
    }

    @Override // X.C0S3W
    public final boolean LJFF() {
        return this.LLJJJ;
    }

    public final Drawable getBgDrawable() {
        return this.LLJJIII;
    }

    public final Set<C1DZN> getDrawers() {
        return this.LLJLILLLLZIIL;
    }

    public final long getDurationOfReset() {
        return this.LLJIJIL;
    }

    public final boolean getForbidAnchorUpdate() {
        return this.LLJILJILJ;
    }

    public final C1DZA getMCurrentSeekbarConfig() {
        return this.LLJLLL;
    }

    public final Function2<MotionEvent, Float, Integer> getMapper() {
        return this.LLJLIL;
    }

    public final InterfaceC715130S3j getOnVisibilityChangeListener() {
        return this.LLL;
    }

    public final Drawable getProDrawable() {
        return this.LLJJIJI;
    }

    public final Drawable getSecondProDrawable() {
        return this.LLJJIJIIJIL;
    }

    public final Drawable getThumbDrawable() {
        return this.LLJJI;
    }

    public final C1DZF getTotalSeekbarConfig() {
        return this.LLILZLL;
    }

    @Override // X.C0S3W
    public final void LIZIZ(C0S3U c0s3u) {
        ((ArrayList) this.LLJJL.LLILLJJLI).remove(c0s3u);
    }

    @Override // X.C0S3W
    public final void LJ(C1DZD c1dzd) {
        EnumC2249791D3x enumC2249791D3x;
        C1DZI c1dzi = this.LLJZ;
        EnumC2249791D3x enumC2249791D3x2 = c1dzi.LIZIZ;
        switch (C1DZC.LIZIZ[c1dzd.ordinal()]) {
            case 1:
                enumC2249791D3x = EnumC2249791D3x.FROZEN;
                break;
            case 2:
            case 3:
                enumC2249791D3x = EnumC2249791D3x.DEFAULT;
                break;
            case 4:
                if (C1DZC.LIZ[c1dzi.LIZIZ.ordinal()] == 1) {
                    enumC2249791D3x = EnumC2249791D3x.ACTIVE;
                } else {
                    enumC2249791D3x = c1dzi.LIZIZ;
                }
                break;
            case 5:
                if (C1DZC.LIZ[c1dzi.LIZIZ.ordinal()] == 2) {
                    enumC2249791D3x = EnumC2249791D3x.DEFAULT;
                } else {
                    enumC2249791D3x = c1dzi.LIZIZ;
                }
                break;
            case 6:
                int i = C1DZC.LIZ[c1dzi.LIZIZ.ordinal()];
                if (i != 1 && i != 2) {
                    enumC2249791D3x = c1dzi.LIZIZ;
                } else {
                    enumC2249791D3x = EnumC2249791D3x.DRAGGING;
                }
                break;
            case 7:
                if (C1DZC.LIZ[c1dzi.LIZIZ.ordinal()] == 3) {
                    enumC2249791D3x = EnumC2249791D3x.ACTIVE;
                } else {
                    enumC2249791D3x = EnumC2249791D3x.ACTIVE;
                }
                break;
            case 8:
                if (C1DZC.LIZ[c1dzi.LIZIZ.ordinal()] == 2) {
                    enumC2249791D3x = EnumC2249791D3x.DEFAULT;
                } else {
                    enumC2249791D3x = c1dzi.LIZIZ;
                }
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                if (C1DZC.LIZ[c1dzi.LIZIZ.ordinal()] == 2) {
                    enumC2249791D3x = EnumC2249791D3x.DEFAULT;
                } else {
                    enumC2249791D3x = c1dzi.LIZIZ;
                }
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                if (C1DZC.LIZ[c1dzi.LIZIZ.ordinal()] == 1) {
                    enumC2249791D3x = EnumC2249791D3x.ACTIVE;
                } else {
                    enumC2249791D3x = c1dzi.LIZIZ;
                }
                break;
            default:
                throw new C1954807lC();
        }
        c1dzi.LIZIZ = enumC2249791D3x;
        if (enumC2249791D3x2 != enumC2249791D3x || c1dzd == C1DZD.VIDEO_CHANGE || c1dzd == C1DZD.PAUSE) {
            c1dzi.LIZJ = enumC2249791D3x2;
            c1dzi.LIZ.invoke(enumC2249791D3x, c1dzd);
        }
    }

    public final void LJI(C1DZA c1dza) {
        C1DZE c1dze;
        GradientDrawable gradientDrawable;
        Drawable drawable;
        int level;
        Drawable drawable2;
        GradientDrawable gradientDrawable2;
        int i;
        this.LLJLLL = c1dza;
        if (c1dza != null) {
            if (getDefaultStyleConfig() != null) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                int i2 = c1dza.LJFF;
                int i3 = c1dza.LJI;
                int i4 = c1dza.LJII;
                layoutParams.height = i2 + i3 + i4;
                setPadding(c1dza.LJIIIIZZ, i3, c1dza.LJIIIZ, i4);
            }
            if (c1dza != null) {
                C1DZG c1dzg = c1dza.LIZ;
                int level2 = 0;
                int i5 = 255;
                if (c1dzg != null) {
                    Drawable drawable3 = c1dzg.LIZLLL;
                    if (drawable3 != null) {
                        LayerDrawable layerDrawable = this.LLJJ;
                        if (layerDrawable != null) {
                            layerDrawable.setDrawableByLayerId(this.LLJ, drawable3);
                        }
                    } else {
                        LayerDrawable layerDrawable2 = this.LLJJ;
                        if (layerDrawable2 != null) {
                            int numberOfLayers = layerDrawable2.getNumberOfLayers();
                            for (int i6 = 0; i6 < numberOfLayers; i6++) {
                                if (layerDrawable2.getId(i6) == this.LLJ) {
                                    Drawable drawable4 = layerDrawable2.getDrawable(i6);
                                    if ((drawable4 instanceof GradientDrawable) && (gradientDrawable2 = (GradientDrawable) drawable4) != null) {
                                        if (c1dzg.LIZJ) {
                                            i = 2;
                                        } else {
                                            i = 0;
                                        }
                                        gradientDrawable2.setStroke(i, 352321535);
                                        int i7 = c1dzg.LIZ;
                                        int i8 = c1dzg.LIZIZ;
                                        int iAlpha = Color.alpha(i8);
                                        int iRed = Color.red(i8);
                                        int iGreen = Color.green(i8);
                                        int iBlue = Color.blue(i8);
                                        if (i7 < 0) {
                                            c1dzg.LIZ = iAlpha;
                                            gradientDrawable2.setColor(Color.argb(iAlpha, iRed, iGreen, iBlue));
                                        } else {
                                            if (i7 > 255) {
                                                i7 = 255;
                                            }
                                            gradientDrawable2.setColor(Color.argb(i7, iRed, iGreen, iBlue));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (c1dza != null) {
                    C1DZL c1dzl = c1dza.LIZIZ;
                    if (c1dzl != null) {
                        Drawable drawable5 = c1dzl.LIZJ;
                        if (drawable5 != null) {
                            LayerDrawable layerDrawable3 = this.LLJJ;
                            if (layerDrawable3 != null && (drawable2 = layerDrawable3.getDrawable(2)) != null) {
                                level = drawable2.getLevel();
                            } else {
                                level = 0;
                            }
                            LayerDrawable layerDrawable4 = this.LLJJ;
                            if (layerDrawable4 != null) {
                                int i9 = this.LLIZ;
                                drawable5.setLevel(level);
                                layerDrawable4.setDrawableByLayerId(i9, drawable5);
                            }
                        } else {
                            LayerDrawable layerDrawable5 = this.LLJJ;
                            if (layerDrawable5 != null) {
                                int numberOfLayers2 = layerDrawable5.getNumberOfLayers();
                                for (int i10 = 0; i10 < numberOfLayers2; i10++) {
                                    if (layerDrawable5.getId(i10) == this.LLIZ) {
                                        Drawable drawable6 = layerDrawable5.getDrawable(i10);
                                        if ((drawable6 instanceof ClipDrawable) && drawable6 != null) {
                                            int i11 = c1dzl.LIZ;
                                            int i12 = c1dzl.LIZIZ;
                                            int iAlpha2 = Color.alpha(i12);
                                            int iRed2 = Color.red(i12);
                                            int iGreen2 = Color.green(i12);
                                            int iBlue2 = Color.blue(i12);
                                            if (i11 < 0) {
                                                c1dzl.LIZ = iAlpha2;
                                                drawable6.setColorFilter(Color.argb(iAlpha2, iRed2, iGreen2, iBlue2), PorterDuff.Mode.SRC);
                                            } else {
                                                if (i11 > 255) {
                                                    i11 = 255;
                                                }
                                                drawable6.setColorFilter(Color.argb(i11, iRed2, iGreen2, iBlue2), PorterDuff.Mode.SRC);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (c1dza != null) {
                        C1DZM c1dzm = c1dza.LIZJ;
                        if (c1dzm != null) {
                            Drawable drawable7 = c1dzm.LIZJ;
                            if (drawable7 != null) {
                                LayerDrawable layerDrawable6 = this.LLJJ;
                                if (layerDrawable6 != null && (drawable = layerDrawable6.getDrawable(1)) != null) {
                                    level2 = drawable.getLevel();
                                }
                                LayerDrawable layerDrawable7 = this.LLJJ;
                                if (layerDrawable7 != null) {
                                    int i13 = this.LLIZLLLIL;
                                    drawable7.setLevel(level2);
                                    layerDrawable7.setDrawableByLayerId(i13, drawable7);
                                }
                            } else {
                                LayerDrawable layerDrawable8 = this.LLJJ;
                                if (layerDrawable8 != null) {
                                    int numberOfLayers3 = layerDrawable8.getNumberOfLayers();
                                    while (level2 < numberOfLayers3) {
                                        if (layerDrawable8.getId(level2) == this.LLIZLLLIL) {
                                            Drawable drawable8 = layerDrawable8.getDrawable(level2);
                                            if ((drawable8 instanceof ScaleDrawable) && drawable8 != null) {
                                                int i14 = c1dzm.LIZ;
                                                int i15 = c1dzm.LIZIZ;
                                                int iAlpha3 = Color.alpha(i15);
                                                int iRed3 = Color.red(i15);
                                                int iGreen3 = Color.green(i15);
                                                int iBlue3 = Color.blue(i15);
                                                if (i14 < 0) {
                                                    c1dzm.LIZ = iAlpha3;
                                                    drawable8.setColorFilter(Color.argb(iAlpha3, iRed3, iGreen3, iBlue3), PorterDuff.Mode.SRC);
                                                } else {
                                                    if (i14 > 255) {
                                                        i14 = 255;
                                                    }
                                                    drawable8.setColorFilter(Color.argb(i14, iRed3, iGreen3, iBlue3), PorterDuff.Mode.SRC);
                                                }
                                            }
                                        }
                                        level2++;
                                    }
                                }
                            }
                        }
                        if (c1dza != null && (c1dze = c1dza.LIZLLL) != null) {
                            Drawable drawable9 = c1dze.LJFF;
                            if (drawable9 != null) {
                                if (drawable9 instanceof GradientDrawable) {
                                    GradientDrawable gradientDrawable3 = (GradientDrawable) drawable9;
                                    gradientDrawable3.setSize(c1dze.LIZ, c1dze.LIZIZ);
                                    gradientDrawable3.setCornerRadius(c1dze.LIZJ);
                                }
                                this.LLJJI = drawable9;
                            } else {
                                Drawable drawable10 = this.LLJJI;
                                if ((drawable10 instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawable10) != null) {
                                    gradientDrawable.setSize(c1dze.LIZ, c1dze.LIZIZ);
                                    gradientDrawable.setCornerRadius(c1dze.LIZJ);
                                    int i16 = c1dze.LIZLLL;
                                    int i17 = c1dze.LJ;
                                    int iAlpha4 = Color.alpha(i17);
                                    int iRed4 = Color.red(i17);
                                    int iGreen4 = Color.green(i17);
                                    int iBlue4 = Color.blue(i17);
                                    if (i16 < 0) {
                                        c1dze.LIZLLL = iAlpha4;
                                        gradientDrawable.setColor(Color.argb(iAlpha4, iRed4, iGreen4, iBlue4));
                                    } else {
                                        if (i16 <= 255) {
                                            i5 = i16;
                                        }
                                        gradientDrawable.setColor(Color.argb(i5, iRed4, iGreen4, iBlue4));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        setProgressDrawable(this.LLJJ);
        setThumb(this.LLJJI);
        requestLayout();
    }

    public final void LJII(EnumC2249791D3x enumC2249791D3x) {
        int i = C1DZB.LIZIZ[enumC2249791D3x.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        C1481110oe5.LIZIZ(LLLF, "enterDragMode: ");
                        LJI(getDragStyleConfig());
                        return;
                    }
                    throw new C1954807lC();
                }
                C1481110oe5.LIZIZ(LLLF, "enterPauseShowMode: ");
                LJI(getActiveStyleConfig());
                return;
            }
            C1481110oe5.LIZIZ(LLLF, "enterPlayShowMode: ");
            LJI(getDefaultStyleConfig());
            return;
        }
        LJI(getFrozenStyleConfig());
    }

    public final void LJIIIIZZ(C1DZA c1dza) {
        if (c1dza == null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(c1dza.LJ.LIZ);
        valueAnimatorOfFloat.setInterpolator(c1dza.LJ.LIZIZ);
        C1DZA c1dza2 = this.LLJLLL;
        if (c1dza2 != null) {
            C1DZA c1dza3 = new C1DZA();
            c1dza2.LIZ.getClass();
            C1DZG c1dzg = new C1DZG();
            c1dzg.LIZ = c1dzg.LIZ;
            c1dzg.LIZIZ = c1dzg.LIZIZ;
            c1dzg.LIZJ = c1dzg.LIZJ;
            c1dzg.LIZLLL = c1dzg.LIZLLL;
            c1dza3.LIZ = c1dzg;
            c1dza2.LIZIZ.getClass();
            C1DZL c1dzl = new C1DZL();
            c1dzl.LIZ = c1dzl.LIZ;
            c1dzl.LIZIZ = c1dzl.LIZIZ;
            c1dzl.LIZJ = c1dzl.LIZJ;
            c1dza3.LIZIZ = c1dzl;
            c1dza2.LIZJ.getClass();
            C1DZM c1dzm = new C1DZM();
            c1dzm.LIZ = c1dzm.LIZ;
            c1dzm.LIZIZ = c1dzm.LIZIZ;
            c1dzm.LIZJ = c1dzm.LIZJ;
            c1dza3.LIZJ = c1dzm;
            c1dza2.LIZLLL.getClass();
            C1DZE c1dze = new C1DZE();
            c1dze.LIZ = c1dze.LIZ;
            c1dze.LIZIZ = c1dze.LIZIZ;
            c1dze.LIZJ = c1dze.LIZJ;
            c1dze.LIZLLL = c1dze.LIZLLL;
            c1dze.LJ = c1dze.LJ;
            c1dze.LJFF = c1dze.LJFF;
            c1dza3.LIZLLL = c1dze;
            c1dza2.LJ.getClass();
            C1DZK c1dzk = new C1DZK();
            c1dzk.LIZ = c1dzk.LIZ;
            c1dzk.LIZIZ = c1dzk.LIZIZ;
            c1dza3.LJ = c1dzk;
            c1dza3.LJFF = c1dza2.LJFF;
            c1dza3.LJI = c1dza2.LJI;
            c1dza3.LJII = c1dza2.LJII;
            c1dza3.LJIIIIZZ = c1dza2.LJIIIIZZ;
            c1dza3.LJIIIZ = c1dza2.LJIIIZ;
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS161S0300000_35(c1dza3, c1dza, this, 1));
            valueAnimatorOfFloat.start();
        }
        this.LLJJIJIL = valueAnimatorOfFloat;
    }

    public final boolean LJIIIZ(MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int measuredWidth = getMeasuredWidth() + i;
        int measuredHeight = getMeasuredHeight() + i2;
        String str = LLLF;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isTouchInSeekbar: x: ");
        sbLIZ.append(rawX);
        sbLIZ.append(", y: ");
        sbLIZ.append(rawY);
        sbLIZ.append(", , left: ");
        sbLIZ.append(i);
        sbLIZ.append(", right: ");
        sbLIZ.append(measuredWidth);
        sbLIZ.append(", top: ");
        sbLIZ.append(i2);
        sbLIZ.append(", bottom: ");
        sbLIZ.append(measuredHeight);
        C1481110oe5.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        if (rawX <= i || rawX >= measuredWidth || rawY <= i2 || rawY >= measuredHeight) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(android.view.MotionEvent r5) {
        /*
            r4 = this;
            float r0 = r5.getX()
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L55
            float r0 = r5.getY()
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L55
            float r0 = r5.getX()
            int r1 = X.C814420VxA.LIZIZ(r0)
            float r0 = r5.getY()
            int r0 = X.C814420VxA.LIZIZ(r0)
            float r2 = (float) r1
            float r1 = (float) r0
            android.graphics.drawable.Drawable r0 = r4.getBackground()
            if (r0 == 0) goto L2f
            r0.setHotspot(r2, r1)
        L2f:
            kotlin.jvm.functions.Function2<? super android.view.MotionEvent, ? super java.lang.Float, java.lang.Integer> r1 = r4.LLJLIL
            r3 = 0
            if (r1 == 0) goto L56
            float r0 = r4.LLJJJJJIL
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r1.invoke(r5, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 < 0) goto L56
            int r3 = r1.intValue()
        L52:
            r4.setProgress(r3)
        L55:
            return
        L56:
            int r2 = r4.getWidth()
            int r0 = r4.getPaddingLeft()
            int r2 = r2 - r0
            int r0 = r4.getPaddingRight()
            int r2 = r2 - r0
            float r1 = r4.LLJJJJJIL
            float r0 = (float) r2
            float r1 = r1 / r0
            int r0 = r4.getMax()
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = r4.getProgress()
            float r0 = (float) r0
            float r1 = r1 + r0
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            float r0 = r1.floatValue()
            boolean r0 = java.lang.Float.isNaN(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L52
            float r0 = r1.floatValue()
            int r3 = X.C814420VxA.LIZIZ(r0)
            goto L52
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DZ6.LJIIL(android.view.MotionEvent):void");
    }

    @Override // X.C21413918rB, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (C1DZN c1dzn : this.LLJLILLLLZIIL) {
            if (c1dzn.getEnable()) {
                canvas.save();
                c1dzn.onDraw(canvas);
                canvas.restore();
            }
        }
    }

    @Override // android.widget.AbsSeekBar, android.view.View, X.C0S3W
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || motionEvent == null) {
            return false;
        }
        this.LLJJJJJIL = motionEvent.getX() - this.LLJJJJ;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        this.LLJJJIL = -1.0f;
                        if (this.LLJJJ) {
                            LJIIJJI();
                            setPressed(false);
                        }
                        invalidate();
                    }
                } else if (this.LLJJJ) {
                    LJIIL(motionEvent);
                } else if (Math.abs(motionEvent.getX() - this.LLJJJIL) > this.LLJJJJLIIL && this.LLJJJIL != -1.0f) {
                    setPressed(true);
                    if (getThumb() != null) {
                        invalidate(getThumb().getBounds());
                    }
                    LJIIJ();
                    LJIIL(motionEvent);
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                }
            } else {
                this.LLJJJIL = -1.0f;
                if (this.LLJJJ) {
                    LJIIL(motionEvent);
                    LJIIJJI();
                    setPressed(false);
                } else if (!this.LLJILJILJ && this.LLJILLL && LJIIIZ(motionEvent)) {
                    C1481110oe5.LIZIZ(LLLF, "onTouchEvent: update progress by click");
                    super.onTouchEvent(motionEvent);
                }
                invalidate();
            }
        } else {
            this.LLJJJIL = motionEvent.getX();
            this.LLJILLL = LJIIIZ(motionEvent);
        }
        this.LLJJJJ = motionEvent.getX();
        return true;
    }

    public final void setActiveStyleConfig(C1DZA c1dza) {
        this.LLILLL = c1dza;
    }

    public final void setBgDrawable(Drawable drawable) {
        this.LLJJIII = drawable;
    }

    public final void setDefaultStyleConfig(C1DZA c1dza) {
        this.LLILLJJLI = c1dza;
    }

    public final void setDragStyleConfig(C1DZA c1dza) {
        this.LLILZ = c1dza;
    }

    public final void setDrawers(Set<C1DZN> set) {
        this.LLJLILLLLZIIL = set;
    }

    public final void setDurationOfReset(long j) {
        this.LLJIJIL = j;
    }

    @Override // X.C0S3W
    public void setEnableTimeOut(boolean z) {
        this.LLJLL = z;
    }

    public final void setForbidAnchorUpdate(boolean z) {
        this.LLJILJILJ = z;
    }

    public final void setFrozenStyleConfig(C1DZA c1dza) {
        this.LLILZIL = c1dza;
    }

    public final void setMapper(Function2<? super MotionEvent, ? super Float, Integer> function2) {
        this.LLJLIL = function2;
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar
    public void setMax(int i) {
        super.setMax(i);
    }

    public final void setMultiStateStyle(boolean z) {
        this.LLJI = z;
    }

    @Override // android.widget.SeekBar
    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        if (!this.LLJJLIIIJLLLLLLLZ) {
            super.setOnSeekBarChangeListener(onSeekBarChangeListener);
            this.LLJJLIIIJLLLLLLLZ = true;
        }
    }

    public void setOnSimVisibilityChangeListener(InterfaceC715130S3j interfaceC715130S3j) {
        this.LLL = interfaceC715130S3j;
    }

    public final void setOnVisibilityChangeListener(InterfaceC715130S3j interfaceC715130S3j) {
        this.LLL = interfaceC715130S3j;
    }

    public final void setProDrawable(Drawable drawable) {
        this.LLJJIJI = drawable;
    }

    public void setResumeByDragRelease(boolean z) {
        this.LLJLLIL = z;
    }

    public final void setSecondProDrawable(Drawable drawable) {
        this.LLJJIJIIJIL = drawable;
    }

    @Override // android.widget.ProgressBar, X.C0S3W
    public void setSecondaryProgress(int i) {
        super.setSecondaryProgress(i);
    }

    public final void setState(EnumC2249791D3x enumC2249791D3x) {
        C1DZI c1dzi = this.LLJZ;
        c1dzi.LIZJ = c1dzi.LIZIZ;
        c1dzi.LIZIZ = enumC2249791D3x;
        LJII(enumC2249791D3x);
        this.LLJL.LIZ(this.LLJZ.LIZJ, enumC2249791D3x, null);
    }

    @Override // android.widget.AbsSeekBar
    public void setThumb(Drawable drawable) {
        super.setThumb(drawable);
    }

    public final void setThumbDrawable(Drawable drawable) {
        this.LLJJI = drawable;
    }

    public final void setTotalSeekbarConfig(C1DZF c1dzf) {
        this.LLILZLL = c1dzf;
    }

    public final void setUseAnimation(boolean z) {
        this.LLJILJIL = z;
    }

    @Override // android.view.View, X.C0S3W
    public void setVisibility(int i) {
        InterfaceC715130S3j interfaceC715130S3j;
        if (getVisibility() != i && (interfaceC715130S3j = this.LLL) != null) {
            getVisibility();
            interfaceC715130S3j.LIZ(i);
        }
        super.setVisibility(i);
    }

    public C1DZ6(Context context, AttributeSet attributeSet) {
        LayerDrawable layerDrawable;
        LayerDrawable layerDrawable2;
        LayerDrawable layerDrawable3;
        super(context, attributeSet, 0);
        this.LLIZ = R.id.progress;
        this.LLIZLLLIL = R.id.secondaryProgress;
        this.LLJ = R.id.background;
        this.LLJI = true;
        this.LLJIJIL = 2000L;
        this.LLJILJIL = true;
        this.LLJJJIL = -1.0f;
        C1DZH c1dzh = new C1DZH(this);
        this.LLJJL = c1dzh;
        this.LLJL = new C1DZJ();
        this.LLJLILLLLZIIL = new LinkedHashSet();
        this.LLJLL = true;
        this.LLJZ = new C1DZI(new C1DZ9(this));
        this.LLJJJJLIIL = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LLJJI = C800330VaR.LIZIZ(context, com.zhiliaoapp.musically.R.drawable.d23);
        this.LLJJ = (LayerDrawable) C800330VaR.LIZIZ(context, com.zhiliaoapp.musically.R.drawable.d22);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.mediabox_seekbar, 0, 0);
        this.LLJI = typedArrayObtainStyledAttributes.getInteger(R$styleable.mediabox_seekbar_seekbar_mode, 1) == 1;
        this.LLJIJIL = typedArrayObtainStyledAttributes.getInt(R$styleable.mediabox_seekbar_seekbar_reset_duration, 2000);
        this.LLJJIII = typedArrayObtainStyledAttributes.getDrawable(R$styleable.mediabox_seekbar_seekbar_bg_drawable);
        this.LLJJIJI = typedArrayObtainStyledAttributes.getDrawable(R$styleable.mediabox_seekbar_seekbar_process_drawable);
        this.LLJJIJIIJIL = typedArrayObtainStyledAttributes.getDrawable(R$styleable.mediabox_seekbar_seekbar_second_process_drawable);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.mediabox_seekbar_seekbar_thumb_drawable);
        if ((drawable instanceof GradientDrawable) && drawable != null) {
            this.LLJJI = drawable;
        }
        typedArrayObtainStyledAttributes.recycle();
        Drawable drawable2 = this.LLJJIII;
        if (drawable2 != null && (layerDrawable3 = this.LLJJ) != null) {
            layerDrawable3.setDrawableByLayerId(R.id.background, drawable2);
        }
        Drawable drawable3 = this.LLJJIJI;
        if (drawable3 != null && (layerDrawable2 = this.LLJJ) != null) {
            layerDrawable2.setDrawableByLayerId(R.id.progress, drawable3);
        }
        Drawable drawable4 = this.LLJJIJIIJIL;
        if (drawable4 != null && (layerDrawable = this.LLJJ) != null) {
            layerDrawable.setDrawableByLayerId(R.id.secondaryProgress, drawable4);
        }
        setProgressDrawable(this.LLJJ);
        setThumb(this.LLJJI);
        setOnSeekBarChangeListener(C1848410yCV.LIZ ? new C786820Utk(c1dzh) : c1dzh);
        this.LLJZIJLIL = new ARunnableS135S0100000_35(this, 24);
    }

    @Override // android.widget.ProgressBar, X.C0S3W
    public final void setProgress(int i, boolean z) {
        super.setProgress(i, z);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}

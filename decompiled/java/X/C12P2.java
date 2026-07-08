package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12P2, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12P2 extends LinearLayout {
    public static final float LLJJIJIIJIL = C418440Gaw.LIZIZ(13);
    public static final float LLJJIJIL = C418440Gaw.LIZIZ(8);
    public static final float LLJJJ = C418440Gaw.LIZIZ(4);
    public final C586640Mze LL;
    public C19749612Ow LLILLJJLI;
    public Float LLILLL;
    public C0JO2 LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public final int LLJI;
    public final int LLJIJIL;
    public final int LLJILJIL;
    public final int LLJILJILJ;
    public final int LLJILLL;
    public final int LLJJ;
    public final Integer LLJJI;
    public int LLJJIII;
    public float LLJJIJI;

    public C12P2() {
        throw null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public final boolean getDisableSeekTouch() {
        return this.LLILZLL;
    }

    public final boolean getForceDispatchTouchEvent() {
        return this.LLIZ;
    }

    public final C0JO2 getMOnSeekBarChangeListener() {
        return this.LLILZ;
    }

    public final Float getMProgress() {
        return this.LLILLL;
    }

    public final int getMScreenWidth() {
        return this.LLILZIL;
    }

    public final C19749612Ow getMutableSeekBar() {
        return this.LLILLJJLI;
    }

    public final int getPageType() {
        return this.LLJ;
    }

    public final float getProgressHeight() {
        return this.LLJJIJI;
    }

    public final int getSeekBarShowType() {
        return this.LLIZLLLIL;
    }

    public final void LIZ(Context context) {
        ViewGroup.LayoutParams layoutParams;
        this.LLILZIL = C12ES.LJIIJ(context);
        View viewLIZ = C20742916Ex.LIZ(context, R.layout.bb9, this, true, -1);
        bringToFront();
        C19749612Ow c19749612Ow = (C19749612Ow) viewLIZ.findViewById(R.id.ujh);
        this.LLILLJJLI = c19749612Ow;
        if (c19749612Ow != null && (layoutParams = c19749612Ow.getLayoutParams()) != null) {
            layoutParams.height = (int) C12ES.LIZJ(28.0f, context);
        }
        C19749612Ow c19749612Ow2 = this.LLILLJJLI;
        if (c19749612Ow2 != null) {
            c19749612Ow2.LJIIIIZZ(Integer.valueOf(this.LLJJIII), Integer.valueOf(this.LLJILJILJ), Float.valueOf(this.LLJJIJI), null, null, 0.0f, false);
            C19749612Ow.LJIIJ(c19749612Ow2, Float.valueOf(this.LLJJIJI), null, 0.0f, null, null, null, this.LLJJI, false, 62);
            float f = LLJJJ;
            C19749612Ow.LJIIJJI(c19749612Ow2, Float.valueOf(f), Float.valueOf(f), Float.valueOf(f / 2), Integer.valueOf(this.LLJJIII), 0.0f, false, 496);
        }
        C19749612Ow c19749612Ow3 = this.LLILLJJLI;
        if (c19749612Ow3 != null) {
            c19749612Ow3.setCustomOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: X.0JO3
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStartTrackingTouch(SeekBar seekBar) {
                    C0JO2 mOnSeekBarChangeListener = this.LL.getMOnSeekBarChangeListener();
                    if (mOnSeekBarChangeListener != null) {
                        mOnSeekBarChangeListener.onStartTrackingTouch(seekBar);
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStopTrackingTouch(SeekBar seekBar) {
                    C0JO2 mOnSeekBarChangeListener = this.LL.getMOnSeekBarChangeListener();
                    if (mOnSeekBarChangeListener != null) {
                        mOnSeekBarChangeListener.onStopTrackingTouch(seekBar);
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                    C0JO2 mOnSeekBarChangeListener = this.LL.getMOnSeekBarChangeListener();
                    if (mOnSeekBarChangeListener != null) {
                        mOnSeekBarChangeListener.onProgressChanged(seekBar, i, z);
                    }
                }
            });
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002b. Please report as an issue. */
    public final void LIZJ(int i) {
        Float fValueOf;
        Float fValueOf2;
        float fLIZIZ;
        int i2;
        float fLIZIZ2 = 0.0f;
        Float fValueOf3 = Float.valueOf(0.0f);
        int i3 = this.LLJJIII;
        int iIntValue = this.LLJILJILJ;
        boolean z = true;
        float fLIZIZ3 = C418440Gaw.LIZIZ(1);
        float fLIZIZ4 = C418440Gaw.LIZIZ(2);
        float fLIZIZ5 = C418440Gaw.LIZIZ(2);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    switch (i) {
                        case 100:
                        case 101:
                            this.LLJJIJI = C418440Gaw.LIZIZ(3);
                            this.LLJJIII = this.LLJI;
                            fLIZIZ = C418440Gaw.LIZIZ(2);
                            float f = LLJJIJIIJIL;
                            fValueOf = Float.valueOf(f);
                            fValueOf2 = Float.valueOf(f);
                            fValueOf3 = Float.valueOf(f / 2);
                            i3 = this.LLJJIII;
                            iIntValue = this.LLJILJILJ;
                            i2 = 0;
                            z = false;
                            break;
                        case 102:
                            this.LLJJIJI = C418440Gaw.LIZIZ(3);
                            this.LLJJIII = this.LLJI;
                            fLIZIZ = C418440Gaw.LIZIZ(2);
                            float f2 = LLJJIJIIJIL;
                            fValueOf = Float.valueOf(f2);
                            fValueOf2 = Float.valueOf(f2);
                            fValueOf3 = Float.valueOf(f2 / 2);
                            i3 = this.LLJJIII;
                            iIntValue = this.LLJILJIL;
                            i2 = this.LLJIJIL;
                            z = false;
                            break;
                        default:
                            z = false;
                            fLIZIZ = 0.0f;
                            fValueOf = fValueOf3;
                            fValueOf2 = fValueOf3;
                            break;
                    }
                } else if (!C0SXF.LJIL(getContext())) {
                    this.LLJJIJI = C418440Gaw.LIZIZ(12);
                    this.LLJJIII = this.LLJILLL;
                    fValueOf = Float.valueOf(C418440Gaw.LIZIZ(10));
                    fValueOf2 = Float.valueOf(C418440Gaw.LIZIZ(16));
                    fValueOf3 = Float.valueOf(C418440Gaw.LIZIZ(4));
                    i3 = this.LLJJ;
                    fLIZIZ = C418440Gaw.LIZIZ(8);
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e9, getContext());
                    if (numLIZJ != null) {
                        iIntValue = numLIZJ.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    fLIZIZ2 = (-C418440Gaw.LIZIZ(6)) + C418440Gaw.LIZIZ(1);
                } else {
                    this.LLJJIJI = C418440Gaw.LIZIZ(4);
                    this.LLJJIII = this.LLJI;
                    float f3 = LLJJIJIIJIL;
                    fValueOf = Float.valueOf(f3);
                    fValueOf2 = Float.valueOf(f3);
                    fValueOf3 = Float.valueOf(f3 / 2);
                    i3 = this.LLJJIII;
                    fLIZIZ = C418440Gaw.LIZIZ(8);
                    iIntValue = this.LLJILJILJ;
                }
                i2 = 0;
            } else {
                float f4 = LLJJIJIL;
                this.LLJJIJI = C418440Gaw.LIZIZ(4);
                this.LLJJIII = this.LLJI;
                fValueOf = Float.valueOf(f4);
                fValueOf2 = Float.valueOf(f4);
                fValueOf3 = Float.valueOf(f4 / 2);
                i3 = this.LLJJIII;
                iIntValue = this.LLJILJILJ;
                fLIZIZ = C418440Gaw.LIZIZ(2);
                fLIZIZ3 = C418440Gaw.LIZIZ(1);
                fLIZIZ4 = C418440Gaw.LIZIZ(1);
                fLIZIZ2 = 0.0f;
                z = true;
                i2 = 0;
                fLIZIZ5 = 0.0f;
            }
        } else {
            this.LLJJIJI = C418440Gaw.LIZIZ(2);
            this.LLJJIII = this.LLJIJIL;
            float f5 = LLJJJ;
            fValueOf = Float.valueOf(f5);
            fValueOf2 = Float.valueOf(f5);
            fValueOf3 = Float.valueOf(f5 / 2);
            i3 = this.LLJJIII;
            iIntValue = this.LLJILJILJ;
            fLIZIZ = C418440Gaw.LIZIZ(2);
            fLIZIZ3 = C418440Gaw.LIZIZ(1);
            fLIZIZ4 = C418440Gaw.LIZIZ(2);
            fLIZIZ5 = C418440Gaw.LIZIZ(2);
            fLIZIZ2 = 0.0f;
            z = true;
            i2 = 0;
        }
        C19749612Ow c19749612Ow = this.LLILLJJLI;
        if (c19749612Ow != null) {
            c19749612Ow.LJIIIIZZ(Integer.valueOf(this.LLJJIII), Integer.valueOf(iIntValue), Float.valueOf(this.LLJJIJI), Float.valueOf(fLIZIZ), Integer.valueOf(i2), fLIZIZ2, z);
            C19749612Ow.LJIIJ(c19749612Ow, Float.valueOf(this.LLJJIJI), Float.valueOf(fLIZIZ), fLIZIZ2, Float.valueOf(fLIZIZ3), Float.valueOf(fLIZIZ5), Float.valueOf(fLIZIZ4), null, z, 64);
            C19749612Ow.LJIIJJI(c19749612Ow, fValueOf, fValueOf2, fValueOf3, Integer.valueOf(i3), fLIZIZ2, z, 240);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.LLIZ) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setDisableSeekTouch(boolean z) {
        this.LLILZLL = z;
    }

    public final void setEnableClickToSeek(boolean z) {
        C19749612Ow c19749612Ow = this.LLILLJJLI;
        if (c19749612Ow != null) {
            c19749612Ow.setEnableClickToSeek(z);
        }
    }

    public final void setForceDispatchTouchEvent(boolean z) {
        this.LLIZ = z;
    }

    public final void setHorizontalMargin(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C19749612Ow c19749612Ow = this.LLILLJJLI;
        ViewGroup.LayoutParams layoutParams = null;
        if (c19749612Ow != null) {
            layoutParams = c19749612Ow.getLayoutParams();
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMarginStart(i);
            marginLayoutParams.setMarginEnd(i);
        }
    }

    public final void setKeyPointsProgressPositions(List<Float> list) {
        C19749612Ow c19749612Ow = this.LLILLJJLI;
        if (c19749612Ow != null) {
            c19749612Ow.setKeyPointsProgressPositions(list);
        }
    }

    public final void setMOnSeekBarChangeListener(C0JO2 c0jo2) {
        this.LLILZ = c0jo2;
    }

    public final void setMProgress(Float f) {
        this.LLILLL = f;
    }

    public final void setMScreenWidth(int i) {
        this.LLILZIL = i;
    }

    public final void setOnSeekBarChangeListener(C0JO2 c0jo2) {
        this.LLILZ = c0jo2;
    }

    public final void setPageType(int i) {
        C19749612Ow c19749612Ow;
        this.LLJ = i;
        if (C0SXF.LJIL(getContext()) && (c19749612Ow = this.LLILLJJLI) != null) {
            c19749612Ow.LJIIIIZZ(Integer.valueOf(this.LLJI), Integer.valueOf(this.LLJILJILJ), Float.valueOf(C418440Gaw.LIZIZ(3)), Float.valueOf(C418440Gaw.LIZIZ(2)), null, 0.0f, true);
            float f = LLJJIJIIJIL;
            C19749612Ow.LJIIJJI(c19749612Ow, Float.valueOf(f), Float.valueOf(f), Float.valueOf(f / 2), Integer.valueOf(this.LLJI), 0.0f, true, 496);
        }
    }

    public final void setPauseStatus(boolean z) {
        C19749612Ow c19749612Ow = this.LLILLJJLI;
        if (c19749612Ow != null) {
            c19749612Ow.setPauseStatus(z);
        }
    }

    public final void setProgress(float f) {
        LIZIZ(f, false);
    }

    public final void setProgressHeight(float f) {
        this.LLJJIJI = f;
    }

    public final void setSecondaryProgress(int i) {
        C19749612Ow c19749612Ow = this.LLILLJJLI;
        if (c19749612Ow != null) {
            c19749612Ow.setSecondaryProgress(i * 100);
        }
    }

    public final void setSeekBarShowType(int i) {
        if (this.LLIZLLLIL != i) {
            this.LLIZLLLIL = i;
            C586640Mze c586640Mze = this.LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("seekbar show type change, change to:");
            sbLIZ.append(i);
            c586640Mze.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
            float fFloatValue = 0.0f;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                switch (i) {
                                    case 100:
                                        C19749612Ow c19749612Ow = this.LLILLJJLI;
                                        if (c19749612Ow != null) {
                                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19749612Ow);
                                            c19749612Ow.setAlpha(1.0f);
                                            Float f = this.LLILLL;
                                            if (f != null) {
                                                fFloatValue = f.floatValue();
                                            }
                                            setProgress(fFloatValue);
                                            C786410Ut5.Z(c19749612Ow, 0);
                                            LIZJ(100);
                                            c19749612Ow.setCanDrag(true);
                                        }
                                        break;
                                    case 101:
                                        C19749612Ow c19749612Ow2 = this.LLILLJJLI;
                                        if (c19749612Ow2 != null) {
                                            C786410Ut5.Z(c19749612Ow2, 0);
                                            LIZJ(101);
                                            c19749612Ow2.setCanDrag(true);
                                        }
                                        break;
                                    case 102:
                                        C19749612Ow c19749612Ow3 = this.LLILLJJLI;
                                        if (c19749612Ow3 != null) {
                                            C786410Ut5.Z(c19749612Ow3, 0);
                                            LIZJ(102);
                                            c19749612Ow3.setCanDrag(true);
                                        }
                                        break;
                                }
                                return;
                            }
                            C19749612Ow c19749612Ow4 = this.LLILLJJLI;
                            if (c19749612Ow4 == null) {
                                return;
                            }
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19749612Ow4);
                            c19749612Ow4.setAlpha(0.0f);
                            C786410Ut5.Z(c19749612Ow4, 0);
                            LIZJ(4);
                            c19749612Ow4.setCanDrag(true);
                            return;
                        }
                        C19749612Ow c19749612Ow5 = this.LLILLJJLI;
                        if (c19749612Ow5 == null) {
                            return;
                        }
                        c19749612Ow5.setCanDrag(false);
                        C786410Ut5.Z(c19749612Ow5, 8);
                        return;
                    }
                    C19749612Ow c19749612Ow6 = this.LLILLJJLI;
                    if (c19749612Ow6 == null) {
                        return;
                    }
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19749612Ow6);
                    c19749612Ow6.setAlpha(1.0f);
                    Float f2 = this.LLILLL;
                    if (f2 != null) {
                        fFloatValue = f2.floatValue();
                    }
                    setProgress(fFloatValue);
                    C786410Ut5.Z(c19749612Ow6, 0);
                    LIZJ(2);
                    c19749612Ow6.setCanDrag(true);
                    return;
                }
                C19749612Ow c19749612Ow7 = this.LLILLJJLI;
                if (c19749612Ow7 == null) {
                    return;
                }
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19749612Ow7);
                c19749612Ow7.setAlpha(1.0f);
                Float f3 = this.LLILLL;
                if (f3 != null) {
                    fFloatValue = f3.floatValue();
                }
                setProgress(fFloatValue);
                C786410Ut5.Z(c19749612Ow7, 0);
                LIZJ(1);
                c19749612Ow7.setCanDrag(true);
                return;
            }
            C19749612Ow c19749612Ow8 = this.LLILLJJLI;
            if (c19749612Ow8 == null) {
                return;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19749612Ow8);
            c19749612Ow8.setAlpha(1.0f);
            Float f4 = this.LLILLL;
            if (f4 != null) {
                fFloatValue = f4.floatValue();
            }
            setProgress(fFloatValue);
            C786410Ut5.Z(c19749612Ow8, 0);
            LIZJ(0);
            c19749612Ow8.setCanDrag(true);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (this.LLILZLL && i == 0) {
            return;
        }
        super.setVisibility(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12P2(Context context, AttributeSet attributeSet) {
        int iIntValue;
        Integer numLIZJ;
        Integer numLIZJ2;
        Integer numLIZJ3;
        super(context, attributeSet, 0);
        int iIntValue2 = 0;
        this.LL = new C586640Mze("VideoSeekBar");
        this.LLIZLLLIL = 3;
        this.LLJ = -1;
        this.LLJI = C446980Hfs.LIZ(getContext(), R.color.ao);
        int iLIZ = C446980Hfs.LIZ(getContext(), R.color.bg);
        this.LLJIJIL = iLIZ;
        Context context2 = getContext();
        if (context2 != null && (numLIZJ3 = C1308910kAL.LIZJ(R.attr.ei, context2)) != null) {
            iIntValue = numLIZJ3.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLJILJIL = iIntValue;
        this.LLJILJILJ = C446980Hfs.LIZ(getContext(), R.color.ba);
        Context context3 = getContext();
        if (context3 != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.eg, context3)) != null) {
            iIntValue2 = numLIZJ2.intValue();
        }
        this.LLJILLL = iIntValue2;
        this.LLJJ = C446980Hfs.LIZ(getContext(), R.color.f569bc);
        Context context4 = getContext();
        if (context4 != null) {
            numLIZJ = C1308910kAL.LIZJ(R.attr.zk, C1385040m98.LIZ(context4, true));
        } else {
            numLIZJ = null;
        }
        this.LLJJI = numLIZJ;
        this.LLJJIII = iLIZ;
        this.LLJJIJI = C418440Gaw.LIZIZ(2);
        try {
            LIZ(context);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2276411E8h.LIZIZ.LIZLLL("common_feed", th);
        }
    }

    public final void LIZIZ(float f, boolean z) {
        Float fValueOf;
        C19749612Ow c19749612Ow;
        this.LLILLL = Float.valueOf(f);
        C19749612Ow c19749612Ow2 = this.LLILLJJLI;
        if (c19749612Ow2 != null) {
            fValueOf = Float.valueOf(c19749612Ow2.getAlpha());
        } else {
            fValueOf = null;
        }
        if (!Intrinsics.LIZLLL(fValueOf, 0.0f)) {
            if (!C299690Bot.LIZIZ() || getVisibility() == 0) {
                if (z) {
                    C19749612Ow c19749612Ow3 = this.LLILLJJLI;
                    if (c19749612Ow3 != null) {
                        c19749612Ow3.setProgressWithAnim(f);
                        return;
                    }
                    return;
                }
                if (C274240Aow.LIZ() && (c19749612Ow = this.LLILLJJLI) != null) {
                    c19749612Ow.LLJJIJI = f;
                    ValueAnimator valueAnimator = c19749612Ow.LLJJIJIIJIL;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    c19749612Ow.LLJJIJIIJIL = null;
                }
                C19749612Ow c19749612Ow4 = this.LLILLJJLI;
                if (c19749612Ow4 == null) {
                    return;
                }
                c19749612Ow4.setProgress((int) (f * 100.0f));
            }
        }
    }
}

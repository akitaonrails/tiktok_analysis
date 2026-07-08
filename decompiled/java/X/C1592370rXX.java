package X;

import Y.AObserverS226S0100000_24;
import Y.ARunnableS43S0110000_24;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rXX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1592370rXX extends FrameLayout implements InterfaceC20343214is {
    public static final /* synthetic */ int LLJJI = 0;
    public final GradientDrawable LL;
    public final FrameLayout LLILLJJLI;
    public final FrameLayout LLILLL;
    public final FrameLayout LLILZ;
    public C1591930rWp LLILZIL;
    public C1592380rXY LLILZLL;
    public C1592380rXY LLIZ;
    public EnumC1592360rXW LLIZLLLIL;
    public Function0<Unit> LLJ;
    public final C1592390rXZ LLJI;
    public Observer<C20590315hd> LLJIJIL;
    public int LLJILJIL;
    public final AObserverS226S0100000_24 LLJILJILJ;
    public MutableLiveData<Integer> LLJILLL;
    public boolean LLJJ;

    public final void LIZIZ() {
        C1592380rXY c1592380rXY = this.LLILZLL;
        if (c1592380rXY != null) {
            LJ(c1592380rXY.LIZIZ, c1592380rXY.LIZJ, c1592380rXY.LIZLLL, c1592380rXY.LJ, true);
        }
        C1592380rXY c1592380rXY2 = this.LLIZ;
        if (c1592380rXY2 != null) {
            LJ(c1592380rXY2.LIZIZ, c1592380rXY2.LIZJ, c1592380rXY2.LIZLLL, c1592380rXY2.LJ, false);
        }
    }

    @Override // X.InterfaceC20343214is
    public String getCustomRiskId() {
        return null;
    }

    @Override // X.InterfaceC20343214is
    public String getRiskId() {
        return "tablet_bottom_bar_host";
    }

    public void setCustomRiskId(String str) {
    }

    public final void LIZ() {
        int iLIZLLL;
        C1591930rWp c1591930rWp = this.LLILZIL;
        if (c1591930rWp == null) {
            return;
        }
        InterfaceC1616480sAQ interfaceC1616480sAQLJIJI = C19252910Tv.LIZIZ.LIZLLL().LJIJI();
        if (interfaceC1616480sAQLJIJI.LLLIIII()) {
            int i = C1592350rXV.LIZ[this.LLIZLLLIL.ordinal()];
            int i2 = 0;
            if (i == 1) {
                Integer numValueOf = Integer.valueOf(getWidth());
                if (numValueOf.intValue() > 0) {
                    iLIZLLL = numValueOf.intValue();
                } else {
                    iLIZLLL = C418440Gaw.LIZLLL(getContext()) - this.LLJILJIL;
                    if (iLIZLLL < 0) {
                        iLIZLLL = 0;
                    }
                }
                int iLJJJJJ = interfaceC1616480sAQLJIJI.LJJJJJ(C418440Gaw.LIZLLL(getContext()));
                if (iLJJJJJ > iLIZLLL) {
                    iLJJJJJ = iLIZLLL;
                }
                int iLIZIZ = ((iLIZLLL - iLJJJJJ) / 2) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                if (iLIZIZ >= 0) {
                    i2 = iLIZIZ;
                }
            } else if (i != 2) {
                throw new C1954807lC();
            }
            if (c1591930rWp.getPaddingLeft() == i2 && c1591930rWp.getPaddingRight() == i2) {
                return;
            }
            c1591930rWp.setPadding(i2, c1591930rWp.getPaddingTop(), i2, c1591930rWp.getPaddingBottom());
        }
    }

    @Override // android.view.View
    public final ViewPropertyAnimator animate() {
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_ANIMATE;
        C2180551AVp.LIZIZ(enumC2180541AVo, this, "");
        ViewPropertyAnimator viewPropertyAnimatorAnimate = super.animate();
        C2180551AVp.LIZ(enumC2180541AVo, this, "");
        return viewPropertyAnimatorAnimate;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Observer<C20590315hd> observer = this.LLJIJIL;
        if (observer != null) {
            C20589915hZ.LIZLLL(observer);
        }
        this.LLJIJIL = null;
        MutableLiveData<Integer> mutableLiveData = this.LLJILLL;
        if (mutableLiveData != null) {
            mutableLiveData.removeObserver(this.LLJILJILJ);
        }
        this.LLJILLL = null;
        super.onDetachedFromWindow();
    }

    public final void LIZJ() {
        int iLJJJJJ;
        Integer numValueOf = Integer.valueOf(getWidth());
        int iIntValue = numValueOf.intValue() > 0 ? numValueOf.intValue() : C418440Gaw.LIZLLL(getContext());
        int iLIZLLL = C418440Gaw.LIZLLL(getContext());
        if (this.LLIZLLLIL == EnumC1592360rXW.FLOAT && (iLJJJJJ = C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJJJJ(iLIZLLL)) <= iIntValue) {
            iIntValue = iLJJJJJ;
        }
        ViewGroup.LayoutParams layoutParams = this.LLILLJJLI.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(-1, -1, 80);
        }
        layoutParams2.width = iIntValue;
        layoutParams2.height = -1;
        layoutParams2.gravity = 81;
        layoutParams2.leftMargin = 0;
        layoutParams2.rightMargin = 0;
        layoutParams2.topMargin = 0;
        layoutParams2.bottomMargin = 0;
        C786410Ut5.a6(this.LLILLJJLI, layoutParams2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(getContext());
        if (c19egLIZIZ == null) {
            return;
        }
        if (this.LLJIJIL == null) {
            C20590915hj c20590915hj = C20589915hZ.LIZ;
            this.LLJIJIL = C20589915hZ.LIZ(this.LLJI, new C20590015ha(this), false);
        }
        MutableLiveData<Integer> mutableLiveData = this.LLJILLL;
        if (mutableLiveData != null) {
            mutableLiveData.removeObserver(this.LLJILJILJ);
        }
        MutableLiveData<Integer> mutableLiveDataXQ2 = C680080Qly.LIZIZ(c19egLIZIZ).xQ2();
        mutableLiveDataXQ2.observeForever(this.LLJILJILJ);
        this.LLJILLL = mutableLiveDataXQ2;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0rXZ] */
    public C1592370rXX(Context context) {
        super(context, null, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        this.LL = gradientDrawable;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.wzg);
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -1, 80));
        this.LLILLJJLI = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.wzi);
        C786410Ut5.LJZ(8, frameLayout2);
        this.LLILLL = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.wzj);
        C786410Ut5.LJZ(8, frameLayout3);
        this.LLILZ = frameLayout3;
        this.LLIZLLLIL = EnumC1592360rXW.COMPACT;
        this.LLJI = new InterfaceC1593800rZq() { // from class: X.0rXZ
            @Override // X.InterfaceC1593800rZq
            public final void LIZ(C20590315hd c20590315hd) {
                Function0<Unit> function0 = this.LIZ.LLJ;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        };
        this.LLJILJILJ = new AObserverS226S0100000_24(this, 0);
        setClipChildren(false);
        setClipToPadding(false);
        addView(frameLayout);
        addView(frameLayout2);
        addView(frameLayout3);
        LIZJ();
        addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1620710sHF(this, 0));
        this.LLJJ = true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.LLJJ) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_ALPHA;
        if (C2180571AVr.LIZIZ(enumC2180541AVo, Float.valueOf(f))) {
            super.setAlpha(f);
            return;
        }
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        C2180551AVp.LIZIZ(enumC2180541AVo, this, Float.valueOf(f));
        super.setAlpha(f);
        C2180551AVp.LIZ(enumC2180541AVo, this, Float.valueOf(f));
    }

    public final void setEnableClick(boolean z) {
        this.LLJJ = z;
    }

    public final void setOnBreakPointChange(Function0<Unit> function0) {
        this.LLJ = function0;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_VISIBLITY;
        C2180551AVp.LIZIZ(enumC2180541AVo, this, Integer.valueOf(i));
        super.setVisibility(i);
        C2180551AVp.LIZ(enumC2180541AVo, this, Integer.valueOf(i));
    }

    public final void LIZLLL(int i, int i2, int i3, View view, boolean z) {
        FrameLayout frameLayout;
        ViewGroup viewGroup;
        if (z) {
            frameLayout = this.LLILLL;
        } else {
            frameLayout = this.LLILZ;
        }
        if (view == null) {
            if (z) {
                this.LLILZLL = null;
            } else {
                this.LLIZ = null;
            }
            C786410Ut5.LJJJJIZL(frameLayout);
            C786410Ut5.LJZ(8, frameLayout);
            return;
        }
        C1592380rXY c1592380rXY = new C1592380rXY(view, i, i2, i3);
        if (z) {
            this.LLILZLL = c1592380rXY;
        } else {
            this.LLIZ = c1592380rXY;
        }
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(view, viewGroup);
        }
        C786410Ut5.LJJJJIZL(frameLayout);
        frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -2, 17));
        C786410Ut5.LJZ(0, frameLayout);
        HandlerHook.viewPost(frameLayout, new ARunnableS43S0110000_24(this, z, 0));
    }

    public final void LJ(int i, int i2, int i3, int i4, boolean z) {
        FrameLayout frameLayout;
        boolean z2;
        int width;
        int i5;
        FrameLayout.LayoutParams layoutParams;
        int i6;
        C1591930rWp c1591930rWp = this.LLILZIL;
        if (c1591930rWp != null && getWidth() != 0 && c1591930rWp.getWidth() != 0) {
            if (z) {
                frameLayout = this.LLILLL;
            } else {
                frameLayout = this.LLILZ;
            }
            if (this.LLJILJIL > 0) {
                C786410Ut5.LJZ(8, frameLayout);
                return;
            }
            if (getLayoutDirection() == 1) {
                z2 = true;
                if (!z) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z2 = false;
            }
            int iMax = Math.max(i2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
            if (z) {
                width = this.LLILLJJLI.getLeft();
            } else {
                width = getWidth() - this.LLILLJJLI.getRight();
            }
            if ((width - i3) - i < iMax) {
                C786410Ut5.LJZ(8, frameLayout);
                return;
            }
            if (!z ? !z2 : z2) {
                i5 = 8388613;
            } else {
                i5 = 8388611;
            }
            ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
            if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                layoutParams = (FrameLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = null;
            }
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(i, -2, i5 | 80);
            }
            layoutParams.width = i;
            layoutParams.height = -2;
            layoutParams.gravity = i5 | 80;
            if (i5 == 8388611) {
                i6 = i3;
            } else {
                i6 = 0;
            }
            layoutParams.setMarginStart(i6);
            layoutParams.topMargin = 0;
            if (i5 != 8388613) {
                i3 = 0;
            }
            layoutParams.setMarginEnd(i3);
            layoutParams.bottomMargin = i4;
            C786410Ut5.a6(frameLayout, layoutParams);
            C786410Ut5.LJZ(0, frameLayout);
        }
    }
}

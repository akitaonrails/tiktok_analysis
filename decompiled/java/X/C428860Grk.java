package X;

import Y.ACListenerS141S0100000_6;
import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import avg.f;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS550S0100000_6;
import mf.a;

/* JADX INFO: renamed from: X.0Grk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C428860Grk extends ViewGroup {
    public Function0<Unit> LL;
    public Function0<Unit> LLILLJJLI;
    public Function0<Unit> LLILLL;
    public Function0<Unit> LLILZ;
    public Function0<Unit> LLILZIL;
    public final float LLILZLL;
    public final float LLIZ;
    public final float LLIZLLLIL;
    public final float LLJ;
    public final float LLJI;
    public final float LLJIJIL;
    public final C425830Gmr LLJILJIL;
    public final C417330GXz LLJILJILJ;
    public final C0GY5 LLJILLL;
    public final C0GY4 LLJJ;
    public EnumC429010Grz LLJJI;
    public boolean LLJJIII;
    public EnumC429210GsJ LLJJIJI;

    public final void LIZJ() {
        C417330GXz c417330GXz = this.LLJILJILJ;
        View.OnClickListener aCListenerS141S0100000_6 = new ACListenerS141S0100000_6(this, 143);
        if (C1848410yCV.LIZ) {
            aCListenerS141S0100000_6 = new f(aCListenerS141S0100000_6);
        }
        a aVar = new a(aCListenerS141S0100000_6);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c417330GXz);
        }
        c417330GXz.setOnClickListener(aVar);
        C786410Ut5.lb(this.LLJILJIL, new ACListenerS141S0100000_6(this, 144));
    }

    public final int getCurrentAvatarCount() {
        return this.LLJILJIL.getAvatarCount();
    }

    public final View getNoteGuideBubbleView() {
        return this.LLJJ;
    }

    public final Function0<Unit> getOnBubbleTap() {
        return this.LLILZIL;
    }

    public final Function0<Unit> getOnNoteGuideAvatarTap() {
        return this.LLILZ;
    }

    public final Function0<Unit> getOnNoteGuideBubbleTap() {
        return this.LLILLL;
    }

    public final Function0<Unit> getOnPenButtonTap() {
        return this.LLILLJJLI;
    }

    public final Function0<Unit> getOnRepostButtonTap() {
        return this.LL;
    }

    public final View getRepostPillButtonView() {
        return this.LLJILLL;
    }

    public C428860Grk(Context context) {
        super(context, null, 0);
        float f = getResources().getDisplayMetrics().density;
        this.LLILZLL = f;
        float f2 = 4.0f * f;
        this.LLIZ = f2;
        this.LLIZLLLIL = f2;
        this.LLJ = 28.0f * f;
        this.LLJI = 32.0f * f;
        this.LLJIJIL = f * 240.0f;
        C425830Gmr c425830Gmr = new C425830Gmr(context);
        this.LLJILJIL = c425830Gmr;
        C417330GXz c417330GXz = new C417330GXz(context);
        this.LLJILJILJ = c417330GXz;
        C0GY5 c0gy5 = new C0GY5(context);
        this.LLJILLL = c0gy5;
        C0GY4 c0gy4 = new C0GY4(context);
        this.LLJJ = c0gy4;
        this.LLJJI = EnumC429010Grz.NONE;
        this.LLJJIJI = EnumC429210GsJ.LL;
        setClipChildren(false);
        setClipToPadding(false);
        addView(c425830Gmr);
        addView(c417330GXz);
        addView(c0gy5);
        addView(c0gy4);
        int visibility = c0gy4.getVisibility();
        c0gy4.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c0gy4);
        setClickable(false);
        setFocusable(false);
        c0gy4.setOnTap(new AwS550S0100000_6(this, 1360));
        c0gy5.setOnTap(new AwS550S0100000_6(this, 1361));
        C2271391DvN.LIZ(c425830Gmr, (C1A5L) C2271381DvM.LLJJL.getValue());
    }

    private final void setNoteGuideAvatarTapEnabled(boolean z) {
        if (z) {
            C786410Ut5.lb(this.LLJILJIL, new ACListenerS141S0100000_6(this, 142));
        } else {
            C786410Ut5.lb(this.LLJILJIL, null);
            this.LLJILJIL.setClickable(false);
        }
    }

    public final void setOnBubbleTap(Function0<Unit> function0) {
        this.LLILZIL = function0;
    }

    public final void setOnNoteGuideAvatarTap(Function0<Unit> function0) {
        this.LLILZ = function0;
    }

    public final void setOnNoteGuideBubbleTap(Function0<Unit> function0) {
        this.LLILLL = function0;
    }

    public final void setOnPenButtonTap(Function0<Unit> function0) {
        this.LLILLJJLI = function0;
    }

    public final void setOnRepostButtonTap(Function0<Unit> function0) {
        this.LL = function0;
    }

    public final void LIZIZ(List<? extends UrlModel> list, EnumC428920Grq enumC428920Grq) {
        this.LLJJIJI = EnumC429210GsJ.LLILLJJLI;
        this.LLJJI = EnumC429010Grz.NONE;
        this.LLJJIII = false;
        setNoteGuideAvatarTapEnabled(true);
        this.LLJILJIL.setAvatars(list);
        this.LLJJ.LIZ(enumC428920Grq);
        C0GY4 c0gy4 = this.LLJJ;
        int visibility = c0gy4.getVisibility();
        c0gy4.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c0gy4);
        C417330GXz c417330GXz = this.LLJILJILJ;
        int visibility2 = c417330GXz.getVisibility();
        c417330GXz.setVisibility(8);
        C1602160rnK.LIZIZ(visibility2, 8, c417330GXz);
        C786410Ut5.h2(this.LLJILLL, 8);
        C0GY5 c0gy5 = this.LLJILLL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gy5);
        c0gy5.setScaleX(1.0f);
        C0GY5 c0gy52 = this.LLJILLL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gy52);
        c0gy52.setScaleY(1.0f);
        C0GY5 c0gy53 = this.LLJILLL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gy53);
        c0gy53.setAlpha(1.0f);
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float size;
        float measuredWidth;
        float f;
        float fMax;
        float fMin;
        if (View.MeasureSpec.getMode(i) == 0) {
            size = 2.1474836E9f;
        } else {
            size = View.MeasureSpec.getSize(i);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        float f2 = this.LLILZLL * 20.0f;
        this.LLJILJIL.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        float measuredWidth2 = this.LLJILJIL.getMeasuredWidth();
        this.LLJILJIL.getMeasuredHeight();
        float fMax2 = 0.0f;
        if (this.LLJJIJI == EnumC429210GsJ.LLILLJJLI) {
            this.LLJJ.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            float measuredWidth3 = this.LLJJ.getMeasuredWidth() - f2;
            if (measuredWidth3 >= 0.0f) {
                fMax2 = measuredWidth3;
            }
            fMin = Math.min(measuredWidth2 + this.LLIZ + fMax2, size);
            fMax = Math.max(this.LLJ, this.LLJJ.getMeasuredHeight() - f2);
        } else {
            this.LLJILLL.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            if (this.LLJJI == EnumC429010Grz.NONE) {
                measuredWidth = 0.0f;
            } else {
                measuredWidth = this.LLIZLLLIL + this.LLJILLL.getMeasuredWidth();
            }
            float f3 = size - ((this.LLIZ + measuredWidth2) + measuredWidth);
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            this.LLJILJILJ.measure(View.MeasureSpec.makeMeasureSpec((int) (f3 + f2), Integer.MIN_VALUE), iMakeMeasureSpec);
            float measuredWidth4 = this.LLJILJILJ.getMeasuredWidth() - f2;
            if (measuredWidth4 < 0.0f) {
                measuredWidth4 = 0.0f;
            }
            Layout layout = this.LLJILJILJ.LL.getLayout();
            if (layout != null && layout.getLineCount() > 1) {
                int lineCount = layout.getLineCount();
                for (int i3 = 0; i3 < lineCount; i3++) {
                    fMax2 = Math.max(fMax2, layout.getLineWidth(i3));
                }
                Integer numValueOf = Integer.valueOf((int) Math.ceil(fMax2 + (r11.LLILLJJLI * 19.0f)));
                if (numValueOf != null) {
                    float fIntValue = numValueOf.intValue();
                    if (fIntValue < measuredWidth4) {
                        measuredWidth4 = fIntValue;
                    }
                }
            }
            if (this.LLJJIII) {
                f = f3;
            } else {
                f = this.LLJIJIL;
            }
            float fMin2 = Math.min(measuredWidth4, f);
            float fMin3 = Math.min(this.LLJI, f3);
            if (fMin2 < fMin3) {
                fMin2 = fMin3;
            }
            this.LLJILJILJ.measure(View.MeasureSpec.makeMeasureSpec((int) (fMin2 + f2), 1073741824), iMakeMeasureSpec);
            fMax = Math.max(this.LLJ, this.LLJILJILJ.getMeasuredHeight() - f2);
            fMin = Math.min(measuredWidth2 + this.LLIZ + fMin2 + measuredWidth, size);
        }
        setMeasuredDimension(ViewGroup.resolveSize((int) fMin, i), ViewGroup.resolveSize((int) fMax, i2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i4 - i2;
        int i10 = i3 - i;
        boolean z3 = true;
        int measuredWidth = 0;
        if (getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i11 = (int) (this.LLILZLL * 10.0f);
        int measuredWidth2 = this.LLJILJIL.getMeasuredWidth();
        int measuredHeight = this.LLJILJIL.getMeasuredHeight();
        int i12 = (int) this.LLIZ;
        if (z2) {
            i5 = i10 - measuredWidth2;
        } else {
            i5 = 0;
        }
        int i13 = i9 - measuredHeight;
        this.LLJILJIL.layout(i5, i13, i5 + measuredWidth2, i9);
        if (this.LLJJIJI == EnumC429210GsJ.LLILLJJLI) {
            int measuredWidth3 = this.LLJJ.getMeasuredWidth();
            int measuredHeight2 = this.LLJJ.getMeasuredHeight();
            int i14 = measuredWidth3 - (i11 * 2);
            if (z2) {
                i8 = ((i10 - measuredWidth2) - i12) - i14;
            } else {
                i8 = measuredWidth2 + i12;
            }
            int i15 = i8 - i11;
            int i16 = i9 + i11;
            this.LLJJ.layout(i15, i16 - measuredHeight2, measuredWidth3 + i15, i16);
            return;
        }
        int measuredWidth4 = this.LLJILJILJ.getMeasuredWidth();
        int measuredHeight3 = this.LLJILJILJ.getMeasuredHeight();
        int i17 = measuredWidth4 - (i11 * 2);
        if (this.LLJJI != EnumC429010Grz.NONE) {
            measuredWidth = this.LLJILLL.getMeasuredWidth();
        } else {
            z3 = false;
        }
        int i18 = (int) this.LLIZLLLIL;
        if (z2) {
            i6 = ((i10 - measuredWidth2) - i12) - i17;
        } else {
            i6 = measuredWidth2 + i12;
        }
        int i19 = i6 - i11;
        int i20 = i9 + i11;
        this.LLJILJILJ.layout(i19, i20 - measuredHeight3, measuredWidth4 + i19, i20);
        if (!z3) {
            return;
        }
        int measuredHeight4 = this.LLJILLL.getMeasuredHeight();
        int i21 = i13 + (measuredHeight / 2);
        if (z2) {
            i7 = (i6 - i18) - measuredWidth;
        } else {
            i7 = i6 + i17 + i18;
        }
        int i22 = measuredHeight4 / 2;
        this.LLJILLL.layout(i7, i21 - i22, measuredWidth + i7, i21 + i22);
    }

    public final void LIZ(List<? extends UrlModel> list, CharSequence charSequence, EnumC429010Grz enumC429010Grz, EnumC428920Grq enumC428920Grq, boolean z, boolean z2) {
        boolean z3;
        this.LLJJI = enumC429010Grz;
        this.LLJJIII = z;
        this.LLJJIJI = EnumC429210GsJ.LL;
        C0GY4 c0gy4 = this.LLJJ;
        int visibility = c0gy4.getVisibility();
        c0gy4.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c0gy4);
        C417330GXz c417330GXz = this.LLJILJILJ;
        int visibility2 = c417330GXz.getVisibility();
        c417330GXz.setVisibility(0);
        C1602160rnK.LIZIZ(visibility2, 0, c417330GXz);
        LIZJ();
        this.LLJILJIL.setAvatars(list);
        boolean z4 = true;
        this.LLJILJILJ.LIZIZ(charSequence, z2, true);
        this.LLJILJILJ.LIZ(enumC428920Grq);
        C0GY5 c0gy5 = this.LLJILLL;
        c0gy5.getClass();
        if (enumC428920Grq == EnumC428920Grq.HIGH_CONTRAST) {
            z3 = true;
        } else {
            z3 = false;
        }
        c0gy5.LLILZIL = z3;
        c0gy5.invalidate();
        C0GY5 c0gy52 = this.LLJILLL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gy52);
        c0gy52.setScaleX(1.0f);
        C0GY5 c0gy53 = this.LLJILLL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gy53);
        c0gy53.setScaleY(1.0f);
        C0GY5 c0gy54 = this.LLJILLL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gy54);
        c0gy54.setAlpha(1.0f);
        if (enumC429010Grz == EnumC429010Grz.NONE) {
            C786410Ut5.h2(this.LLJILLL, 8);
        } else {
            C786410Ut5.h2(this.LLJILLL, 0);
            C0GY5 c0gy55 = this.LLJILLL;
            if (enumC429010Grz != EnumC429010Grz.PEN) {
                z4 = false;
            }
            c0gy55.LIZ(z4, false);
        }
        requestLayout();
        invalidate();
    }
}

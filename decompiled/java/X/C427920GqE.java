package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0GqE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427920GqE extends FrameLayout {
    public final C0GTD LL;
    public final boolean LLILLJJLI;
    public boolean LLILLL;
    public C429270GsP LLILZ;

    public final C429270GsP getActivityStatus() {
        return this.LLILZ;
    }

    public final C0GTD getActivityStatusDotView() {
        return this.LL;
    }

    public final void LIZ(Integer num) {
        int iIntValue;
        if (num != null) {
            int iIntValue2 = num.intValue();
            C0GTD c0gtd = this.LL;
            Integer numLIZJ = C1308910kAL.LIZJ(iIntValue2, getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            c0gtd.setStrokeColor(iIntValue);
        }
    }

    public final void setActivityStatus(C429270GsP c429270GsP) {
        EnumC429250GsN enumC429250GsN;
        C427940GqG c427940GqG;
        if (Intrinsics.LJFF(c429270GsP, this.LLILZ)) {
            return;
        }
        this.LLILZ = c429270GsP;
        EnumC429250GsN enumC429250GsN2 = null;
        if (c429270GsP != null) {
            enumC429250GsN = c429270GsP.LIZ;
        } else {
            enumC429250GsN = null;
        }
        if (enumC429250GsN == EnumC429250GsN.IS_ACTIVE) {
            c427940GqG = new C427940GqG(EnumC429190GsH.LLILLL);
        } else {
            if (c429270GsP != null) {
                enumC429250GsN2 = c429270GsP.LIZ;
            }
            if (enumC429250GsN2 == EnumC429250GsN.IS_INACTIVE && this.LLILLJJLI) {
                c427940GqG = new C427940GqG(EnumC429190GsH.LLILLJJLI);
            } else {
                c427940GqG = new C427940GqG(EnumC429190GsH.LL);
            }
        }
        this.LLILLL = false;
        int iOrdinal = c427940GqG.LIZ.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    this.LL.setActive(true);
                    C337180DJs.LIZJ(this.LL);
                    this.LLILLL = true;
                    return;
                }
                throw new C1954807lC();
            }
            this.LL.setActive(false);
            C337180DJs.LIZJ(this.LL);
            return;
        }
        C337180DJs.LIZ(this.LL);
    }

    public C427920GqE(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ActivityStatusViewContainer);
        try {
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ActivityStatusViewContainer_viewSize, 0);
            this.LLILLJJLI = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ActivityStatusViewContainer_showInactive, false);
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ActivityStatusViewContainer_dotStrokeWidth, 0);
            int color = typedArrayObtainStyledAttributes.getColor(R$styleable.ActivityStatusViewContainer_dotStrokeColor, 0);
            typedArrayObtainStyledAttributes.recycle();
            C0GTD c0gtd = new C0GTD(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gtd);
            c0gtd.setLayoutParams(layoutParams);
            c0gtd.setDrawStroke(true);
            c0gtd.setStrokeWidth(dimensionPixelSize2);
            c0gtd.setStrokeColor(color);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.nv, context);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            c0gtd.setActiveStatusColor(iIntValue);
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1p, context);
            c0gtd.setInactiveStatusColor(numLIZJ2 != null ? numLIZJ2.intValue() : 0);
            int visibility = c0gtd.getVisibility();
            c0gtd.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c0gtd);
            this.LL = c0gtd;
            addView(c0gtd);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}

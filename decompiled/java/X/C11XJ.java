package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.11XJ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11XJ extends LinearLayout {
    public LinearLayout LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public C977203ru LLILZIL;
    public ConstraintLayout LLILZLL;
    public C426160GnO LLIZ;
    public TuxTextView LLIZLLLIL;
    public FrameLayout LLJ;
    public SmartImageView LLJI;
    public TuxIconView LLJIJIL;
    public TuxIconView LLJILJIL;
    public final int LLJILJILJ;

    public final C977203ru getBtnClaimOrUseFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f686com);
            this.LLILZIL = (C977203ru) callbackFindViewById;
        }
        return (C977203ru) callbackFindViewById;
    }

    public final LinearLayout getCouponLayoutBgFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f3_);
            this.LL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final C426160GnO getCouponTagsLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f3k);
            this.LLIZ = (C426160GnO) callbackFindViewById;
        }
        return (C426160GnO) callbackFindViewById;
    }

    public final TuxTextView getDiscountTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fwv);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final FrameLayout getFlIconContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.i6d);
            this.LLJ = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final SmartImageView getSivAuthorIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vd0);
            this.LLJI = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final TuxTextView getSubtitleTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wmw);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final ConstraintLayout getTagsDiscountThresholdLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.x2r);
            this.LLILZLL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final TuxTextView getThresholdTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xuk);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxIconView getTivStatusFollowFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y4d);
            this.LLJIJIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getTivStatusOkFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y4e);
            this.LLJILJIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getTvClaimedFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.zdp);
            this.LLIZLLLIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    private final void setSkuCouponsButtonStyle(boolean z) {
        getBtnClaimOrUseFromXml().setNeedCustomColor(z);
        getBtnClaimOrUseFromXml().setButtonVariant(z ? 1 : 0);
        if (z) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(2));
            c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
            c384050F3z.LJ = Integer.valueOf(C960203pA.LIZ(R.attr.a04, getContext()));
            getBtnClaimOrUseFromXml().setBackground(c384050F3z.LIZ(getContext()));
            getBtnClaimOrUseFromXml().setTextColor(C960203pA.LIZ(R.attr.a04, getContext()));
            return;
        }
        getBtnClaimOrUseFromXml().setTextColor(C960203pA.LIZ(R.attr.ee, getContext()));
    }

    public final void setAuthorIcon(Image image) {
        C1326790kdB.LIZ.getClass();
        C1331670kl3 c1331670kl3LJ = C1326790kdB.LJ(image);
        c1331670kl3LJ.LJJIIZ(R.drawable.fhw);
        c1331670kl3LJ.LJJ(getSivAuthorIconFromXml());
        C786410Ut5.h3(c1331670kl3LJ);
    }

    public final void setAuthorIconStatus(int i) {
        if (i == EnumC19382010sE.INPROGRESS.ordinal()) {
            C786410Ut5.LLLLLLZZ(getTivStatusFollowFromXml(), 0);
            C786410Ut5.LLLLLLZZ(getTivStatusOkFromXml(), 8);
        } else if (i != EnumC19382010sE.WAITTOFINISH.ordinal() && i != EnumC19382010sE.FINISHED.ordinal()) {
            setFollowContainerVisible(8);
            C786410Ut5.LLLLLLZZ(getTivStatusFollowFromXml(), 8);
            C786410Ut5.LLLLLLZZ(getTivStatusOkFromXml(), 8);
        } else {
            C786410Ut5.LLLLLLZZ(getTivStatusFollowFromXml(), 8);
            C786410Ut5.LLLLLLZZ(getTivStatusOkFromXml(), 0);
        }
    }

    public final void setBackground(int i) {
        getCouponLayoutBgFromXml().setBackgroundResource(i);
    }

    public final void setBtnClaimOrUseFromXml(C977203ru c977203ru) {
        this.LLILZIL = c977203ru;
    }

    public final void setCouponLayoutBgFromXml(LinearLayout linearLayout) {
        this.LL = linearLayout;
    }

    public final void setCouponTagsLayoutFromXml(C426160GnO c426160GnO) {
        this.LLIZ = c426160GnO;
    }

    public final void setCouponsTags(List<View> list) {
        C786410Ut5.LLZLLLL(getCouponTagsLayoutFromXml(), 0);
        C426160GnO couponTagsLayoutFromXml = getCouponTagsLayoutFromXml();
        for (View view : list) {
            ViewGroup.MarginLayoutParams marginLayoutParamsLJI = C1744700vVE.LJI(view);
            if (marginLayoutParamsLJI != null) {
                marginLayoutParamsLJI.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            }
            couponTagsLayoutFromXml.addView(view);
        }
    }

    public final void setDiscountTextFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setDiscountTextOld(String str) {
        getDiscountTextFromXml().setText(str);
        getDiscountTextFromXml().setTextColor(C960203pA.LIZ(R.attr.a04, getContext()));
        getDiscountTextFromXml().setTuxFont(62);
    }

    public final void setDiscountTime(String str) {
        getSubtitleTextFromXml().setText(str);
    }

    public final void setFlIconContainerFromXml(FrameLayout frameLayout) {
        this.LLJ = frameLayout;
    }

    public final void setFollowContainerVisible(int i) {
        C786410Ut5.LJZ(i, getFlIconContainerFromXml());
    }

    public final void setSivAuthorIconFromXml(SmartImageView smartImageView) {
        this.LLJI = smartImageView;
    }

    public final void setSubtitleTextFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setTagsDiscountThresholdLayoutFromXml(ConstraintLayout constraintLayout) {
        this.LLILZLL = constraintLayout;
    }

    public final void setThresholdTextFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setTivStatusFollowFromXml(TuxIconView tuxIconView) {
        this.LLJIJIL = tuxIconView;
    }

    public final void setTivStatusOkFromXml(TuxIconView tuxIconView) {
        this.LLJILJIL = tuxIconView;
    }

    public final void setTvClaimedFromXml(TuxTextView tuxTextView) {
        this.LLIZLLLIL = tuxTextView;
    }

    public C11XJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Sd(R.layout.bpp, C786410Ut5.ne(context), this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxCouponsItemView);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxCouponsItemView_couponBackground, 0);
        int i = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxCouponsItemView_couponCount, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxCouponsItemView_multiCouponsHeight, 0);
        getCouponLayoutBgFromXml().setBackgroundResource(resourceId);
        this.LLJILJILJ = i;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            getCouponLayoutBgFromXml().getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                        }
                    } else {
                        getCouponLayoutBgFromXml().getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
                    }
                    if (getCouponLayoutBgFromXml().getLayoutParams().height == C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48))) {
                        ViewGroup.MarginLayoutParams marginLayoutParamsLJI = C1744700vVE.LJI(getBtnClaimOrUseFromXml());
                        if (marginLayoutParamsLJI != null) {
                            marginLayoutParamsLJI.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParamsLJI2 = C1744700vVE.LJI(getTagsDiscountThresholdLayoutFromXml());
                        if (marginLayoutParamsLJI2 != null) {
                            marginLayoutParamsLJI2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParamsLJI3 = C1744700vVE.LJI(getTagsDiscountThresholdLayoutFromXml());
                        if (marginLayoutParamsLJI3 != null) {
                            marginLayoutParamsLJI3.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                        }
                    }
                }
            } else {
                getCouponLayoutBgFromXml().getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                getDiscountTextFromXml().getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17));
                getSubtitleTextFromXml().getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13));
                getDiscountTextFromXml().setTuxFont(62);
                getBtnClaimOrUseFromXml().getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                getBtnClaimOrUseFromXml().getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                ViewGroup.MarginLayoutParams marginLayoutParamsLJI4 = C1744700vVE.LJI(getBtnClaimOrUseFromXml());
                if (marginLayoutParamsLJI4 != null) {
                    marginLayoutParamsLJI4.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                }
                ViewGroup.MarginLayoutParams marginLayoutParamsLJI5 = C1744700vVE.LJI(getTagsDiscountThresholdLayoutFromXml());
                if (marginLayoutParamsLJI5 != null) {
                    marginLayoutParamsLJI5.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                }
                ViewGroup.MarginLayoutParams marginLayoutParamsLJI6 = C1744700vVE.LJI(getTagsDiscountThresholdLayoutFromXml());
                if (marginLayoutParamsLJI6 != null) {
                    marginLayoutParamsLJI6.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                }
            }
        } else {
            getCouponLayoutBgFromXml().getLayoutParams().width = -1;
            getCouponLayoutBgFromXml().getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
            ViewGroup.MarginLayoutParams marginLayoutParamsLJI7 = C1744700vVE.LJI(getThresholdTextFromXml());
            if (marginLayoutParamsLJI7 != null) {
                marginLayoutParamsLJI7.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        if (this.LLJILJILJ == 2) {
            if (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL))) < getMeasuredWidth()) {
                measuredWidth = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL)));
            } else if (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(240)) > getMeasuredWidth()) {
                measuredWidth = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(240));
            }
        }
        setMeasuredDimension(measuredWidth, getMeasuredHeight());
    }

    public final void LIZ(EnumC19368610q4 enumC19368610q4, String str, C11XL c11xl) {
        int i = C11XK.LIZIZ[enumC19368610q4.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C786410Ut5.LLLLZLL(getTvClaimedFromXml(), 0);
                    C977203ru btnClaimOrUseFromXml = getBtnClaimOrUseFromXml();
                    int visibility = btnClaimOrUseFromXml.getVisibility();
                    btnClaimOrUseFromXml.setVisibility(8);
                    C1602160rnK.LIZIZ(visibility, 8, btnClaimOrUseFromXml);
                    getTvClaimedFromXml().setText(str);
                    if (c11xl == C11XL.BLUE) {
                        getTvClaimedFromXml().setTextColor(C960203pA.LIZ(R.attr.a09, getContext()));
                        return;
                    } else {
                        if (c11xl != C11XL.RED) {
                            return;
                        }
                        getTvClaimedFromXml().setTextColor(C960203pA.LIZ(R.attr.a04, getContext()));
                        return;
                    }
                }
                throw new C1954807lC();
            }
            getBtnClaimOrUseFromXml().setText(str);
            if (c11xl == C11XL.BLUE) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(2));
                c384050F3z.LIZLLL = 1;
                c384050F3z.LJ = Integer.valueOf(C960203pA.LIZ(R.attr.a09, getContext()));
                c384050F3z.LIZ = Integer.valueOf(C960203pA.LIZ(R.attr.ee, getContext()));
                getBtnClaimOrUseFromXml().setBackground(c384050F3z.LIZ(getContext()));
                getBtnClaimOrUseFromXml().setTextColor(C960203pA.LIZ(R.attr.a09, getContext()));
                return;
            }
            getBtnClaimOrUseFromXml().setNeedCustomColor(true);
            getBtnClaimOrUseFromXml().setButtonVariant(1);
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(2));
            c384050F3z2.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
            c384050F3z2.LJ = Integer.valueOf(C960203pA.LIZ(R.attr.a04, getContext()));
            c384050F3z2.LIZ = Integer.valueOf(C960203pA.LIZ(R.attr.ee, getContext()));
            getBtnClaimOrUseFromXml().setBackground(c384050F3z2.LIZ(getContext()));
            getBtnClaimOrUseFromXml().setTextColor(C960203pA.LIZ(R.attr.a04, getContext()));
            return;
        }
        getBtnClaimOrUseFromXml().setText(str);
        if (c11xl == C11XL.BLUE) {
            getBtnClaimOrUseFromXml().setBackgroundColor(C960203pA.LIZ(R.attr.a09, getContext()));
        } else {
            getBtnClaimOrUseFromXml().setNeedCustomColor(true);
            getBtnClaimOrUseFromXml().setButtonVariant(0);
        }
        getBtnClaimOrUseFromXml().setTextColor(C960203pA.LIZ(R.attr.ee, getContext()));
    }
}

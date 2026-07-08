package X;

import Y.ALAdapterS3S0200000_6;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphere;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereResource;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereStock;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleEnhancementInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.187T, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C187T extends C187K {
    public final int LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public final int LJIIL;
    public final int LJIILIIL;
    public final int LJIILJJIL;
    public final int LJIILL;
    public final int LJIILLIIL;
    public final int LJIIZILJ;
    public boolean LJIJ;
    public final C01GW LJIJI;
    public final C01GW LJIJJ;
    public final C01GW LJIJJLI;
    public final C01GW LJIL;
    public final C01GW LJJ;
    public final C01GW LJJI;
    public final C01GW LJJIFFI;
    public final C01GW LJJII;
    public final C01GW LJJIII;
    public Animator LJJIIJ;
    public final C01GW LJJIIJZLJL;
    public AtmosphereTag LJJIIZ;
    public Animator LJJIIZI;
    public FlashSaleAtmosphereResource LJJIJ;
    public String LJJIJIIJI;
    public List<String> LJJIJIIJIL;
    public final C01GW LJJIJIL;
    public final C01GW LJJIJL;

    @Override // X.C187K
    public final int LJIILIIL() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00f1 A[PHI: r3
      0x00f1: PHI (r3v4 java.lang.Integer) = (r3v3 java.lang.Integer), (r3v11 java.lang.Integer) binds: [B:11:0x005a, B:13:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C187K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator LJIIL() {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C187T.LJIIL():android.animation.Animator");
    }

    @Override // X.C187K
    public final boolean LJIILLIIL() {
        return this.LJIJ && C185J.LJI(LJJIII()) && !LJIIZILJ();
    }

    public final View LJJI() {
        return (View) this.LJJIII.getValue();
    }

    public final TuxTextView LJJIFFI() {
        return (TuxTextView) this.LJIJJ.getValue();
    }

    public final TuxTextView LJJII() {
        return (TuxTextView) this.LJIJJLI.getValue();
    }

    public final ConstraintLayout LJJIII() {
        return (ConstraintLayout) this.LJIJI.getValue();
    }

    public final TuxTextView LJJIIJ() {
        return (TuxTextView) this.LJJI.getValue();
    }

    public final boolean LJJIIJZLJL() {
        FlashSaleAtmosphere flashSaleAtmosphere;
        FlashSaleEnhancementInfo flashSaleEnhancementInfo;
        AtmosphereTag atmosphereTag = this.LJ;
        return (atmosphereTag == null || (flashSaleAtmosphere = atmosphereTag.LJ) == null || (flashSaleEnhancementInfo = flashSaleAtmosphere.enhancementInfo) == null || flashSaleEnhancementInfo.enhancementStyle == 0) ? false : true;
    }

    public final void LJJIJ() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (this.LJIJ) {
            boolean zLJJIIJZLJL = LJJIIJZLJL();
            SmartImageView smartImageView = (SmartImageView) this.LJJII.getValue();
            ViewGroup.LayoutParams layoutParams = ((View) this.LJJII.getValue()).getLayoutParams();
            layoutParams.width = zLJJIIJZLJL ? this.LJIIJ : this.LJIIJJI;
            layoutParams.height = zLJJIIJZLJL ? this.LJIIJ : this.LJIIL;
            C786410Ut5.G6(smartImageView, layoutParams);
            ViewGroup.LayoutParams layoutParams2 = LJJI().getLayoutParams();
            if (!(layoutParams2 instanceof C19ME) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) == null) {
                return;
            }
            marginLayoutParams.height = zLJJIIJZLJL ? this.LJIILIIL : this.LJIILJJIL;
            marginLayoutParams.topMargin = zLJJIIJZLJL ? this.LJIILL : this.LJIILLIIL;
            C786410Ut5.W5(LJJI(), marginLayoutParams);
        }
    }

    public final void LJJIJIIJI() {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View viewFindViewById;
        int iIntValue;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        if (this.LJIJ) {
            if (LJJIIJZLJL()) {
                Object parent = this.LIZ.getParent();
                View view = parent instanceof View ? (View) parent : null;
                i = 0;
                if (view == null || (viewFindViewById = view.findViewById(R.id.gm8)) == null) {
                    iIntValue = this.LJIIZILJ;
                } else {
                    ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                    if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                        Integer numValueOf = Integer.valueOf(viewFindViewById.getTop());
                        iIntValue = numValueOf.intValue() > 0 ? numValueOf.intValue() : this.LJIIZILJ;
                    } else {
                        iIntValue = marginLayoutParams2.topMargin;
                    }
                }
                int i2 = iIntValue - this.LJIILL;
                if (i2 >= 0) {
                    i = i2;
                }
            } else {
                i = this.LJIIZILJ;
            }
            ViewGroup.LayoutParams layoutParams2 = LJJIII().getLayoutParams();
            if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) == null || marginLayoutParams.topMargin == i) {
                return;
            }
            marginLayoutParams.topMargin = i;
            C786410Ut5.m6(LJJIII(), marginLayoutParams);
        }
    }

    @Override // X.C187K
    public final Animator LJIIJJI() {
        return AnonymousClass1889.LIZIZ(LJJIII(), this.LJIIIZ);
    }

    @Override // X.C187K
    public final void LJIJJ(boolean z) {
        if (this.LJIJ) {
            C185J.LJIIIIZZ(LJJIII(), z);
        }
        if (!z) {
            this.LJJIIZ = null;
            this.LJJIJIIJI = null;
            this.LJJIJIIJIL = null;
        }
    }

    public final void LJIL(FlashSaleAtmosphereResource flashSaleAtmosphereResource) {
        String str;
        List<String> list;
        ECImage eCImage;
        List<String> listLLIIII = null;
        if (flashSaleAtmosphereResource != null && (eCImage = flashSaleAtmosphereResource.tagImage) != null) {
            str = eCImage.url;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, this.LJJIJIIJI)) {
            this.LJJIJIIJI = str;
            if (str != null) {
                C19411510wz.LIZ.LJ(EnumC1769850w9n.LIVE_POP_CARD_LIVE_FLASH_SALE_ICON, (SmartImageView) this.LJJII.getValue(), str);
            } else {
                ((C1322110kVd) this.LJJII.getValue()).setActualImageResource(R.drawable.bmj);
            }
        }
        if (flashSaleAtmosphereResource != null) {
            list = flashSaleAtmosphereResource.backgroundGradientColors;
        } else {
            list = null;
        }
        if (!Intrinsics.LJFF(list, this.LJJIJIIJIL)) {
            if (list != null) {
                listLLIIII = C13LP.LLIIII(list);
            }
            this.LJJIJIIJIL = listLLIIII;
            if (list != null && list.size() >= 3) {
                try {
                    int[] iArr = {C1100000ejO.LIZ(list.get(0)), C1100000ejO.LIZ(list.get(1)), C1100000ejO.LIZ(list.get(2))};
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
                    gradientDrawable.setColors(iArr);
                    gradientDrawable.setGradientCenter(0.65f, 0.65f);
                    gradientDrawable.setGradientType(0);
                    LJJI().setBackground(gradientDrawable);
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                    AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(e, 1046);
                    c2341109Fh.getClass();
                    C2341109Fh.LIZLLL(awS546S0100000_2);
                    LJJI().setBackgroundResource(R.drawable.bmi);
                    return;
                }
            }
            LJJI().setBackgroundResource(R.drawable.bmi);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIIZI(boolean z) {
        Integer numValueOf;
        Integer numValueOf2;
        int i;
        int iIntValue;
        FlashSaleAtmosphereStock flashSaleAtmosphereStock;
        FlashSaleAtmosphereStock flashSaleAtmosphereStock2;
        FlashSaleAtmosphereStock flashSaleAtmosphereStock3;
        FlashSaleAtmosphereStock flashSaleAtmosphereStock4;
        AtmosphereTag atmosphereTag = this.LJ;
        Integer numValueOf3 = null;
        if (atmosphereTag != null && (flashSaleAtmosphereStock4 = atmosphereTag.LIZLLL) != null) {
            numValueOf = Integer.valueOf(flashSaleAtmosphereStock4.activityStock);
        } else {
            numValueOf = null;
        }
        AtmosphereTag atmosphereTag2 = this.LJJIIZ;
        if (atmosphereTag2 != null && (flashSaleAtmosphereStock3 = atmosphereTag2.LIZLLL) != null) {
            numValueOf2 = Integer.valueOf(flashSaleAtmosphereStock3.activityStock);
        } else {
            numValueOf2 = null;
        }
        if (Intrinsics.LJFF(numValueOf, numValueOf2)) {
            String string = a0.LJLIIIL(LJJIIJ().getText().toString()).toString();
            AtmosphereTag atmosphereTag3 = this.LJ;
            if (atmosphereTag3 != null && (flashSaleAtmosphereStock2 = atmosphereTag3.LIZLLL) != null) {
                numValueOf3 = Integer.valueOf(flashSaleAtmosphereStock2.activityStock);
            }
            if (Intrinsics.LJFF(string, String.valueOf(numValueOf3))) {
                return;
            }
        }
        C187U c187u = new C187U();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        AtmosphereTag atmosphereTag4 = this.LJ;
        int iIntValue2 = 0;
        if (atmosphereTag4 != null && (flashSaleAtmosphereStock = atmosphereTag4.LIZLLL) != null) {
            i = flashSaleAtmosphereStock.activityStock;
        } else {
            i = 0;
        }
        sbLIZ.append(i);
        sbLIZ.append(' ');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, this.LIZ.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        C187W c187wLIZLLL = C187U.LIZLLL(strLIZIZ, 53, iIntValue, 0, 0, 3);
        if (c187wLIZLLL != null) {
            c187u.LIZ(c187wLIZLLL);
        }
        if (z) {
            Animator animator = this.LJJIIJ;
            if (animator != null) {
                animator.cancel();
            }
            C786410Ut5.LLLLZLL(LJJIIJ(), 0);
            LJJIIJ().setPivotX(0.0f);
            LJJIIJ().setPivotY(this.LIZJ.getResources().getDimension(R.dimen.u9));
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(LJJIIJ(), this.LJJIJIL.getValue(), this.LJJIJL.getValue());
            objectAnimatorOfPropertyValuesHolder.setDuration(400L);
            objectAnimatorOfPropertyValuesHolder.setInterpolator(C1619980sG4.LIZ());
            C786410Ut5.Pd(objectAnimatorOfPropertyValuesHolder);
            this.LJJIIJ = objectAnimatorOfPropertyValuesHolder;
        }
        LJJIIJ().setText(c187u.LIZJ());
        if (!z) {
            C187U c187u2 = new C187U();
            String string2 = this.LIZJ.getString(2131834573);
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ee, this.LIZ.getContext());
            if (numLIZJ2 != null) {
                iIntValue2 = numLIZJ2.intValue();
            }
            C187W c187wLIZLLL2 = C187U.LIZLLL(string2, 53, iIntValue2, 0, 0, 3);
            if (c187wLIZLLL2 != null) {
                c187u2.LIZ(c187wLIZLLL2);
            }
            ((TextView) this.LJJIFFI.getValue()).setText(c187u2.LIZJ());
        }
    }

    public C187T(int i, ViewGroup viewGroup) {
        super(i, viewGroup);
        this.LJIIIZ = this.LIZJ.getResources().getDimensionPixelOffset(R.dimen.un);
        this.LJIIJ = this.LIZJ.getResources().getDimensionPixelOffset(R.dimen.ui);
        this.LJIIJJI = this.LIZJ.getResources().getDimensionPixelOffset(R.dimen.uk);
        this.LJIIL = this.LIZJ.getResources().getDimensionPixelOffset(R.dimen.un);
        this.LJIILIIL = this.LIZJ.getResources().getDimensionPixelOffset(R.dimen.ud);
        this.LJIILJJIL = this.LIZJ.getResources().getDimensionPixelOffset(R.dimen.uh);
        this.LJIILL = this.LIZJ.getResources().getDimensionPixelOffset(R.dimen.ug);
        this.LJIILLIIL = this.LIZJ.getResources().getDimensionPixelOffset(R.dimen.uv);
        this.LJIIZILJ = this.LIZJ.getResources().getDimensionPixelOffset(R.dimen.tw);
        this.LJIJI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 559));
        this.LJIJJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 553));
        this.LJIJJLI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 555));
        this.LJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 549));
        this.LJJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 531));
        this.LJJI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 560));
        this.LJJIFFI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 527));
        this.LJJII = C452501pT.LIZIZ(new AwS576S0100000_32(this, 557));
        this.LJJIII = C452501pT.LIZIZ(new AwS576S0100000_32(this, 552));
        this.LJJIIJZLJL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(377));
        this.LJJIJIL = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(175));
        this.LJJIJL = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(176));
        this.LJIJ = LJIILJJIL(R.id.ibv);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    @Override // X.C187K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C187X LJIJJLI(long r16, java.util.List<android.animation.Animator> r18) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C187T.LJIJJLI(long, java.util.List):X.187X");
    }

    public final boolean LJJ(List list, boolean z) {
        boolean z2;
        View view;
        View view2;
        if (z) {
            if (((View) this.LJJ.getValue()).getVisibility() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            view = (View) this.LJJ.getValue();
            view2 = (View) this.LJIL.getValue();
            C1744700vVE.LJIIL(LJJI(), -1);
        } else {
            if (((View) this.LJIL.getValue()).getVisibility() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            view = (View) this.LJIL.getValue();
            view2 = (View) this.LJJ.getValue();
            C1744700vVE.LJIIL(LJJI(), LJJI().getResources().getDimensionPixelSize(R.dimen.v2));
        }
        if (z2 && list != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, -this.LIZJ.getResources().getDimension(R.dimen.uh)), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, this.LIZJ.getResources().getDimension(R.dimen.uh), 0.0f));
            animatorSet.addListener(new ALAdapterS3S0200000_6(view2, view, 24));
            list.add(animatorSet);
            return z2;
        }
        C786410Ut5.ed(view, 0.0f);
        C786410Ut5.LJLLLLLL(0, view);
        C786410Ut5.ed(view2, 0.0f);
        C786410Ut5.LJLLLLLL(4, view2);
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIIZ(long j, boolean z) {
        int iIntValue;
        int iIntValue2;
        Animator animator;
        if (j > 0 && j < 11000) {
            C187U c187u = new C187U();
            String strValueOf = String.valueOf(j / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, this.LIZ.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            C187W c187wLIZLLL = C187U.LIZLLL(strValueOf, 103, iIntValue, 0, 0, 1);
            if (c187wLIZLLL != null) {
                c187u.LIZ(c187wLIZLLL);
            }
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ee, this.LIZ.getContext());
            if (numLIZJ2 != null) {
                iIntValue2 = numLIZJ2.intValue();
            } else {
                iIntValue2 = 0;
            }
            C187W c187wLIZLLL2 = C187U.LIZLLL("s", 73, iIntValue2, 0, 0, 1);
            if (c187wLIZLLL2 != null) {
                c187u.LIZ(c187wLIZLLL2);
            }
            if (z) {
                Animator animator2 = this.LJJIIZI;
                if (animator2 != null) {
                    animator2.cancel();
                }
                C786410Ut5.LLLLZLL(LJJIFFI(), 0);
                LJJIFFI().setPivotX(0.0f);
                LJJIFFI().setPivotY(this.LIZJ.getResources().getDimension(R.dimen.u9));
                if (LJJII().getVisibility() == 0) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(LJJII(), (Property<TuxTextView, Float>) View.ALPHA, 1.0f, 0.0f);
                    objectAnimatorOfFloat.setDuration(50L);
                    ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(LJJIFFI(), this.LJJIJIL.getValue(), this.LJJIJL.getValue());
                    objectAnimatorOfPropertyValuesHolder.setDuration(400L);
                    objectAnimatorOfPropertyValuesHolder.setInterpolator(C1619980sG4.LIZ());
                    animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOfPropertyValuesHolder);
                    C786410Ut5.LLLLZLL(LJJII(), 8);
                    animator = animatorSet;
                } else {
                    ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(LJJIFFI(), this.LJJIJIL.getValue(), this.LJJIJL.getValue());
                    objectAnimatorOfPropertyValuesHolder2.setDuration(400L);
                    objectAnimatorOfPropertyValuesHolder2.setInterpolator(C1619980sG4.LIZ());
                    animator = objectAnimatorOfPropertyValuesHolder2;
                }
                animator.start();
                this.LJJIIZI = animator;
            }
            LJJIFFI().setText(c187u.LIZJ());
            return;
        }
        if (j < 11000) {
            return;
        }
        Animator animator3 = this.LJJIIZI;
        if (animator3 != null) {
            animator3.cancel();
        }
        this.LJJIIZI = null;
        C786410Ut5.B5(LJJII(), 1.0f);
        C786410Ut5.LLLLZLL(LJJII(), 0);
        C786410Ut5.LLLLZLL(LJJIFFI(), 8);
        TuxTextView tuxTextViewLJJII = LJJII();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(((DateFormat) this.LJJIIJZLJL.getValue()).format(new Date(j)));
        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(53, false), 0, spannableStringBuilder.length(), 17);
        C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), 0, spannableStringBuilder.length(), 17);
        tuxTextViewLJJII.setText(spannableStringBuilder);
    }
}

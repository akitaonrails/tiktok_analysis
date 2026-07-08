package X;

import Y.AAListenerS278S0200000_32;
import Y.AAListenerS36S0100100_32;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionAtmosphere;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionText;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.Color;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import webcast.data.oec_msg.CarouselCfg;

/* JADX INFO: renamed from: X.186i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C212302186i extends AbstractC212300186g implements AnonymousClass1875 {
    public Animator LLJJIII;
    public AnonymousClass1873 LLJJIJI;
    public final C212198182i LLJJIJIIJIL;
    public final SmartImageView LLJJIJIL;
    public final ViewGroup LLJJJ;
    public final FrameLayout LLJJJIL;
    public final ViewGroup LLJJJJ;
    public final SmartImageView LLJJJJJIL;
    public final TuxTextView LLJJJJLIIL;
    public final ViewGroup LLJJL;
    public final TuxTextView LLJJLIIIJLLLLLLLZ;
    public final C197039127h LLJL;
    public final TuxTextView LLJLIL;
    public final C18QS LLJLILLLLZIIL;
    public final TuxTextView LLJLL;
    public final TuxTextView LLJLLIL;
    public Animator LLJLLL;
    public final FrameLayout LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;

    public C212302186i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public int P0() {
        return R.layout.bws;
    }

    @Override // X.AbstractC212300186g
    public C197039127h getCustomButton() {
        return null;
    }

    @Override // X.AbstractC212300186g
    public AnonymousClass1875 n0() {
        return this;
    }

    private final PropertyValuesHolder getNumScaleX() {
        return (PropertyValuesHolder) this.LLJZIJLIL.getValue();
    }

    private final PropertyValuesHolder getNumScaleY() {
        return (PropertyValuesHolder) this.LLL.getValue();
    }

    @Override // X.AbstractC212300186g
    public final void C0() {
        C197039127h c197039127h = this.LLJL;
        if (c197039127h != null) {
            C03DZ.LIZJ(c197039127h);
        }
        C19MB c19mb = new C19MB();
        c19mb.LJII(this);
        c19mb.LJIIIIZZ(R.id.gmb, 7, R.id.gkl, 6);
        c19mb.LIZIZ(this);
        TuxTextView tuxTextView = this.LLJLIL;
        if (tuxTextView != null) {
            C0H1U.LIZIZ(tuxTextView);
        }
    }

    @Override // X.AbstractC212300186g
    public void L0() {
        C786410Ut5.G6(this.LLJJIJIL, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(108)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(108))));
        ViewGroup viewGroup = this.LLJJJJ;
        if (viewGroup != null) {
            C786410Ut5.X5(new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(108)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(108))), viewGroup);
        }
        C197039127h c197039127h = this.LLJL;
        if (c197039127h != null) {
            C0H1U.LIZIZ(c197039127h);
        }
        TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView != null) {
            C03DZ.LIZJ(tuxTextView);
        }
        C18QS c18qs = this.LLJLILLLLZIIL;
        if (c18qs != null) {
            C19MB c19mb = new C19MB();
            c19mb.LJII(this);
            c19mb.LJJIIJZLJL(R.id.rz1, 6, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            c19mb.LIZIZ(this);
            c18qs.setTuxFont(32);
        }
    }

    @Override // X.AnonymousClass1875
    public final void LJL() {
        Animator animator = this.LLJLLL;
        if (animator != null) {
            animator.cancel();
        }
        this.LLJLLL = null;
    }

    @Override // X.AnonymousClass1875
    public final void LLLLLZL() {
        TuxTextView tuxTextView = this.LLJLLIL;
        AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(this, 27);
        AwS576S0100000_32 awS576S0100000_322 = new AwS576S0100000_32(this, 28);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(tuxTextView, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, 20.0f, 0.0f));
        objectAnimatorOfPropertyValuesHolder.setDuration(480L);
        objectAnimatorOfPropertyValuesHolder.addListener(new AAListenerS278S0200000_32(awS576S0100000_32, awS576S0100000_322, 4));
        this.LLJLLL = objectAnimatorOfPropertyValuesHolder;
    }

    public void S0() {
        ViewGroup viewGroup = this.LLJJL;
        if (viewGroup != null) {
            C0H1U.LIZIZ(viewGroup);
        }
        SmartImageView smartImageView = this.LLJJJJJIL;
        if (smartImageView != null) {
            C0H1U.LIZIZ(smartImageView);
        }
        ViewGroup viewGroup2 = this.LLJJJ;
        if (viewGroup2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            if (C426750GoL.LIZLLL(getContext())) {
                ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                }
                C786410Ut5.X5(marginLayoutParams, viewGroup2);
            } else {
                ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    marginLayoutParams.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                }
                C786410Ut5.X5(marginLayoutParams, viewGroup2);
            }
            if (!this.LLJI) {
                C786410Ut5.Pd(AnonymousClass1888.LIZ(viewGroup2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(29)), new AwS433S0200000_32(viewGroup2, this, 13), 8));
                return;
            }
            ViewGroup viewGroup3 = this.LLJJL;
            if (viewGroup3 != null) {
                C03DZ.LIZJ(viewGroup3);
            }
            SmartImageView smartImageView2 = this.LLJJJJJIL;
            if (smartImageView2 != null) {
                C03DZ.LIZJ(smartImageView2);
            }
        }
    }

    @Override // X.AbstractC212300186g
    public void l0() {
        ViewGroup viewGroup = this.LLJJL;
        if (viewGroup != null) {
            C0H1U.LIZIZ(viewGroup);
        }
        SmartImageView smartImageView = this.LLJJJJJIL;
        if (smartImageView != null) {
            C0H1U.LIZIZ(smartImageView);
        }
    }

    @Override // X.AnonymousClass1875
    public final Animator V() {
        return this.LLJLLL;
    }

    @Override // X.AbstractC212300186g
    public C197039127h getBidButton() {
        return this.LLJL;
    }

    @Override // X.AbstractC212300186g
    public TuxTextView getMaxBidText() {
        return this.LLJLIL;
    }

    @Override // X.AnonymousClass1875
    public final void LJJLIIIJJIZ(boolean z) {
        if (z) {
            TuxTextView tuxTextView = this.LLJLLIL;
            if (tuxTextView != null) {
                C03DZ.LIZJ(tuxTextView);
                return;
            }
            return;
        }
        TuxTextView tuxTextView2 = this.LLJLLIL;
        if (tuxTextView2 == null) {
            return;
        }
        C0H1U.LIZIZ(tuxTextView2);
    }

    @Override // X.AbstractC212300186g
    public final void i0(boolean z) {
        ViewGroup viewGroup;
        C0NOH countDownManager;
        AnonymousClass0956 anonymousClass0956;
        if (z && (((viewGroup = this.LLJJL) == null || viewGroup.getVisibility() != 0) && (countDownManager = getCountDownManager()) != null && countDownManager.LIZJ == 2 && (anonymousClass0956 = countDownManager.LJII) != null && true == anonymousClass0956.isActive())) {
            S0();
        }
        ViewGroup viewGroup2 = this.LLJJJJ;
        if (viewGroup2 != null) {
            C0H1U.LIZIZ(viewGroup2);
        }
        s0();
    }

    @Override // X.AnonymousClass1875
    public final void q(long j) {
        TuxTextView tuxTextView = this.LLJLLIL;
        if (tuxTextView != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('+');
            sbLIZ.append(j);
            sbLIZ.append('s');
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
            C786410Ut5.q2(spannableStringBuilder, new C444920HcY(73, false), 0, spannableStringBuilder.length(), 17);
            C786410Ut5.q2(spannableStringBuilder, new StyleSpan(3), 0, spannableStringBuilder.length(), 17);
            tuxTextView.setText(spannableStringBuilder);
        }
    }

    @Override // X.AbstractC212300186g
    public void setAtmosphere(UsPopupCardVO usPopupCardVO) {
        ArrayList arrayList;
        AuctionAtmosphere auctionAtmosphere;
        List<Color> list;
        try {
            AuctionData auctionData = usPopupCardVO.auctionData;
            int[] iArrLLII = null;
            if (auctionData != null && (auctionAtmosphere = auctionData.atmosphere) != null && (list = auctionAtmosphere.colors) != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<Color> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Integer.valueOf(android.graphics.Color.parseColor(it2.next().value)));
                }
            } else {
                arrayList = null;
            }
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
            if (arrayList != null) {
                iArrLLII = C13LP.LLII(arrayList);
            }
            this.LLJJL.setBackground(new GradientDrawable(orientation, iArrLLII));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.AbstractC212300186g
    public void setMaxbidStatus(C181U c181u) {
        super.setMaxbidStatus(c181u);
        C19MB c19mb = new C19MB();
        c19mb.LJII(this);
        c19mb.LJI(R.id.gmb, 7);
        c19mb.LIZIZ(this);
    }

    @Override // X.AbstractC212300186g
    public void O0(long j, AAListenerS36S0100100_32 aAListenerS36S0100100_32) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C1868470yir.LIZIZ(j));
        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(53, false), 0, spannableStringBuilder.length(), 17);
        C786410Ut5.q2(spannableStringBuilder, new StyleSpan(3), 0, spannableStringBuilder.length(), 17);
        TuxTextView tuxTextView = this.LLJJJJLIIL;
        if (tuxTextView != null) {
            tuxTextView.setText(spannableStringBuilder);
        }
        if (j < 11000) {
            TuxTextView tuxTextView2 = this.LLJLL;
            if (tuxTextView2 != null) {
                C03DZ.LIZJ(tuxTextView2);
                tuxTextView2.setText(spannableStringBuilder);
                tuxTextView2.setPivotX(30.0f);
                tuxTextView2.setPivotY(25.0f);
            }
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("countdownpivot", "remainTimeLessThan10 pivotx: " + this.LLJLL.getPivotX() + ", pivoty: " + this.LLJLL.getPivotY() + ", width: " + this.LLJLL.getWidth() + ", height: " + this.LLJLL.getHeight());
            TuxTextView tuxTextView3 = this.LLJJJJLIIL;
            if (tuxTextView3 != null) {
                C0H1U.LIZIZ(tuxTextView3);
            }
            Animator animator = this.LLJJIII;
            if (animator != null) {
                animator.cancel();
            }
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.LLJLL, getNumScaleX(), getNumScaleY());
            objectAnimatorOfPropertyValuesHolder.setDuration(400L);
            objectAnimatorOfPropertyValuesHolder.setInterpolator(C1619980sG4.LIZ());
            objectAnimatorOfPropertyValuesHolder.addListener(aAListenerS36S0100100_32);
            C786410Ut5.Pd(objectAnimatorOfPropertyValuesHolder);
            this.LLJJIII = objectAnimatorOfPropertyValuesHolder;
            return;
        }
        TuxTextView tuxTextView4 = this.LLJLL;
        if (tuxTextView4 != null) {
            C0H1U.LIZIZ(tuxTextView4);
        }
        TuxTextView tuxTextView5 = this.LLJJJJLIIL;
        if (tuxTextView5 == null) {
            return;
        }
        C03DZ.LIZJ(tuxTextView5);
    }

    @Override // X.AbstractC212300186g
    public void e0(final boolean z, final boolean z2) {
        HandlerHook.viewPost(this, new Runnable() { // from class: X.186r
            public final void LIZ() {
                ViewGroup viewGroup = this.LL.LLJJL;
                if (viewGroup != null) {
                    C0H1U.LIZIZ(viewGroup);
                }
                SmartImageView smartImageView = this.LL.LLJJJJJIL;
                if (smartImageView != null) {
                    C0H1U.LIZIZ(smartImageView);
                }
                if (z) {
                    this.LL.s0();
                } else {
                    this.LL.p0();
                }
                if (z2) {
                    ViewGroup viewGroup2 = this.LL.LLJJJJ;
                    if (viewGroup2 != null) {
                        C03DZ.LIZJ(viewGroup2);
                        return;
                    }
                    return;
                }
                ViewGroup viewGroup3 = this.LL.LLJJJJ;
                if (viewGroup3 != null) {
                    C0H1U.LIZIZ(viewGroup3);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("UsBidCardView@9c4b.bidEnd$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("UsBidCardView@9c4b.bidEnd$1");
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00cc A[PHI: r4
      0x00cc: PHI (r4v3 java.lang.String) = (r4v0 java.lang.String), (r4v5 java.lang.String) binds: [B:43:0x00b8, B:48:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractC212300186g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u0(com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C212302186i.u0(com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO, boolean):void");
    }

    public C212302186i(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJZIJLIL = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(59));
        this.LLL = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(60));
        LayoutInflater layoutInflaterCloneInContext = C786410Ut5.ne(context).cloneInContext(new ContextThemeWrapper(context, R.style.acp));
        if (layoutInflaterCloneInContext != null) {
            C786410Ut5.Sd(P0(), layoutInflaterCloneInContext, this);
        }
        setPriceLayoutViewControllerFront(new C212295186b<>(this, new C212299186f(R.id.gmd), 1, 1));
        setPriceLayoutViewControllerBehind(new C212295186b<>(this, new C212299186f(R.id.gme), 1, 1));
        this.LLJJIJIL = (SmartImageView) findViewById(R.id.glb);
        this.LLJJJ = (ViewGroup) findViewById(R.id.b_b);
        this.LLJJJIL = (FrameLayout) findViewById(R.id.b_s);
        this.LLJJJJ = (ViewGroup) findViewById(R.id.bzj);
        this.LLJJJJJIL = (SmartImageView) findViewById(R.id.eyv);
        this.LLJJJJLIIL = (TuxTextView) findViewById(R.id.f02);
        this.LLJJL = (ViewGroup) findViewById(R.id.f03);
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) findViewById(R.id.fbc);
        this.LLJL = (C197039127h) findViewById(R.id.gkl);
        this.LLJLIL = (TuxTextView) findViewById(R.id.o4h);
        C18QS c18qs = (C18QS) findViewById(R.id.rz1);
        this.LLJLILLLLZIIL = c18qs;
        this.LLJLL = (TuxTextView) findViewById(R.id.t5a);
        this.LLJJIJIIJIL = new C212198182i(c18qs);
        this.LLJLLIL = (TuxTextView) findViewById(R.id.hib);
        this.LLJZ = (FrameLayout) findViewById(R.id.gmb);
    }

    public /* synthetic */ C212302186i(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C212295186b<ViewGroup> priceLayoutViewControllerFront;
        C212332187m c212332187m;
        Float fValueOf;
        Integer numValueOf;
        TuxTextView tuxTextView;
        Layout layout;
        C212332187m c212332187m2;
        C212332187m c212332187m3;
        super.onLayout(z, i, i2, i3, i4);
        TuxTextView tuxTextView2 = this.LLJLIL;
        if (tuxTextView2 != null && tuxTextView2.getVisibility() == 0 && (priceLayoutViewControllerFront = getPriceLayoutViewControllerFront()) != null && (c212332187m = priceLayoutViewControllerFront.LJII) != null && (fValueOf = Float.valueOf(c212332187m.getPriceNumTextSize())) != null && (numValueOf = Integer.valueOf(C679280Qkg.LIZIZ(fValueOf))) != null && numValueOf.intValue() > 14.0f && (tuxTextView = this.LLJLIL) != null && (layout = tuxTextView.getLayout()) != null && layout.getEllipsisCount(0) > 0) {
            C212295186b<ViewGroup> priceLayoutViewControllerFront2 = getPriceLayoutViewControllerFront();
            if (priceLayoutViewControllerFront2 != null && (c212332187m3 = priceLayoutViewControllerFront2.LJII) != null) {
                c212332187m3.setPriceNumTuxFont(52);
            }
            C212295186b<ViewGroup> priceLayoutViewControllerBehind = getPriceLayoutViewControllerBehind();
            if (priceLayoutViewControllerBehind != null && (c212332187m2 = priceLayoutViewControllerBehind.LJII) != null) {
                c212332187m2.setPriceNumTuxFont(52);
            }
            requestLayout();
        }
    }

    @Override // X.AbstractC212300186g
    public void M0(C212167181d c212167181d, Map<String, AuctionText> map, boolean z, int i, int i2, C212294186a c212294186a, boolean z2, CarouselCfg carouselCfg) {
        String str;
        String str2;
        Boolean bool;
        AnonymousClass1873 anonymousClass1873 = this.LLJJIJI;
        if (anonymousClass1873 != null) {
            Long l = null;
            if (c212167181d != null) {
                l = c212167181d.LIZ;
                str = c212167181d.LIZIZ;
                str2 = c212167181d.LIZJ;
                bool = c212167181d.LIZLLL;
            } else {
                str = null;
                str2 = null;
                bool = null;
            }
            anonymousClass1873.LJIIL(new AnonymousClass1872(l, str, str2, bool, map, z, i, i2, false, null, z2, carouselCfg, 1792));
        }
    }
}

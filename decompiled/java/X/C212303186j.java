package X;

import Y.ARunnableS124S0100000_24;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.DepositPrice;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: renamed from: X.186j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212303186j extends ConstraintLayout implements InterfaceC1631620sYq<Integer, Integer, Long, Unit> {
    public Animator LL;
    public final C212312186s<ViewGroup> LLILLJJLI;
    public boolean LLILLL;
    public final ViewGroup LLILZ;
    public final FrameLayout LLILZIL;
    public final TuxTextView LLILZLL;
    public final ViewGroup LLIZ;
    public final SmartImageView LLIZLLLIL;
    public final TuxTextView LLJ;
    public final ViewGroup LLJI;
    public final C197039127h LLJIJIL;
    public final TuxTextView LLJILJIL;
    public final TuxTextView LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;

    private final PropertyValuesHolder getNumScaleX() {
        return (PropertyValuesHolder) this.LLJILLL.getValue();
    }

    private final PropertyValuesHolder getNumScaleY() {
        return (PropertyValuesHolder) this.LLJJ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void setCurrentBidPrice(SinglePriceItem singlePriceItem) {
        boolean z;
        String str;
        String strLIZIZ;
        if (singlePriceItem != null) {
            C212312186s<ViewGroup> c212312186s = this.LLILLJJLI;
            String str2 = singlePriceItem.salePriceFormat;
            String strCurrency = singlePriceItem.currency();
            if (singlePriceItem.symbolPosition == 1) {
                z = true;
            } else {
                z = false;
            }
            C212316186w c212316186w = new C212316186w(str2, strCurrency, z);
            int i = c212312186s.LJ;
            Integer num = c212316186w.LIZLLL;
            if (num != null && num.intValue() == 1) {
                c212312186s.getClass();
                return;
            }
            if (C703302op.LIZ(str2)) {
                StringBuilder sb = new StringBuilder();
                int length = str2.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char cCharAt = str2.charAt(i2);
                    if (C183L.LIZ(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                if (sb.toString().length() > 7) {
                    i = c212312186s.LJFF;
                }
                boolean z2 = c212316186w.LIZIZ;
                C212332187m c212332187mLIZIZ = c212312186s.LJI;
                if (c212332187mLIZIZ == null) {
                    c212332187mLIZIZ = c212312186s.LIZLLL.LIZIZ(c212312186s.LIZ, z2);
                    c212312186s.LJI = c212332187mLIZIZ;
                }
                String str3 = c212316186w.LIZ;
                if (str3 != null) {
                    c212332187mLIZIZ.setCurrencyText(str3);
                }
                String str4 = c212316186w.LIZJ;
                if (str4 != null) {
                    c212332187mLIZIZ.setPricePrefix(str4);
                }
                c212332187mLIZIZ.setPriceNumText(str2);
                c212332187mLIZIZ.setPriceSize(i);
                C786410Ut5.P(c212332187mLIZIZ, 0);
            } else {
                C212332187m c212332187m = c212312186s.LJI;
                if (c212332187m != null) {
                    C786410Ut5.P(c212332187m, 8);
                }
            }
            if (C703302op.LIZ(null)) {
                TuxTextView tuxTextViewLIZ = c212312186s.LJII;
                if (tuxTextViewLIZ == null) {
                    tuxTextViewLIZ = c212312186s.LIZLLL.LIZ(c212312186s.LIZ);
                    c212312186s.LJII = tuxTextViewLIZ;
                }
                String str5 = "";
                if (c212316186w.LIZIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    String str6 = c212316186w.LIZ;
                    if (str6 != null) {
                        str5 = str6;
                    }
                    sbLIZ.append(str5);
                    sbLIZ.append((String) null);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append((String) null);
                    String str7 = c212316186w.LIZ;
                    if (str7 != null) {
                        str5 = str7;
                    }
                    sbLIZ2.append(str5);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
                tuxTextViewLIZ.setText(strLIZIZ);
                C1003950cET.LIZ(tuxTextViewLIZ, i);
                C786410Ut5.LLLLZLL(tuxTextViewLIZ, 0);
            } else {
                TuxTextView tuxTextView = c212312186s.LJII;
                if (tuxTextView != null) {
                    C786410Ut5.LLLLZLL(tuxTextView, 8);
                }
            }
            DepositPrice depositPrice = c212316186w.LJ;
            if (depositPrice != null && (str = depositPrice.minDeposit) != null) {
                if (C703302op.LIZ(str)) {
                    TuxTextView tuxTextViewLIZLLL = c212312186s.LJIIIIZZ;
                    if (tuxTextViewLIZLLL == null) {
                        tuxTextViewLIZLLL = c212312186s.LIZLLL.LIZLLL(c212312186s.LIZ);
                        c212312186s.LJIIIIZZ = tuxTextViewLIZLLL;
                    }
                    tuxTextViewLIZLLL.setText(str);
                    C786410Ut5.LLLLZLL(tuxTextViewLIZLLL, 0);
                } else {
                    TuxTextView tuxTextView2 = c212312186s.LJIIIIZZ;
                    if (tuxTextView2 != null) {
                        C786410Ut5.LLLLZLL(tuxTextView2, 8);
                    }
                }
            }
            TuxTextView tuxTextView3 = c212312186s.LJIIIIZZ;
            if (tuxTextView3 == null) {
                return;
            }
            HandlerHook.viewPost(tuxTextView3, new ARunnableS124S0100000_24(c212312186s, 115));
        }
    }

    public final void setAuctionData(C19509611Uo c19509611Uo) {
        C197039127h c197039127h = this.LLJIJIL;
        if (c197039127h != null) {
            C03DZ.LIZJ(c197039127h);
        }
        if (this.LLILLL) {
            this.LLILLL = false;
        }
        TuxTextView tuxTextView = this.LLJILJIL;
        if (tuxTextView != null) {
            C0H1U.LIZIZ(tuxTextView);
        }
        C197039127h c197039127h2 = this.LLJIJIL;
        if (c197039127h2 != null) {
            C786410Ut5.I7(new C19674711yL(this), c197039127h2);
        }
        C197039127h c197039127h3 = this.LLJIJIL;
        if (c197039127h3 != null) {
            C786410Ut5.w5(c197039127h3, 0.6f);
        }
        setCurrentBidPrice(null);
    }

    public final void setBtnLoading(boolean z) {
        C197039127h c197039127h = this.LLJIJIL;
        if (c197039127h != null) {
            c197039127h.setLoading(z);
        }
    }

    public C212303186j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.186t] */
    public C212303186j(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILLL = true;
        this.LLJILLL = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(62));
        this.LLJJ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(63));
        LayoutInflater layoutInflaterCloneInContext = C786410Ut5.ne(context).cloneInContext(new ContextThemeWrapper(context, R.style.acp));
        if (layoutInflaterCloneInContext != null) {
            C786410Ut5.Sd(R.layout.bv7, layoutInflaterCloneInContext, this);
        }
        this.LLILLJJLI = new C212312186s<>(this, new InterfaceC212314186u<ViewGroup>() { // from class: X.186t
            @Override // X.InterfaceC212314186u
            public final TuxTextView LIZ(ViewGroup viewGroup) {
                return new TuxTextView(viewGroup.getContext(), null, 6, 0);
            }

            @Override // X.InterfaceC212314186u
            public final TuxTextView LIZLLL(ViewGroup viewGroup) {
                return new TuxTextView(viewGroup.getContext(), null, 6, 0);
            }

            @Override // X.InterfaceC212314186u
            public final C212332187m LIZIZ(ViewGroup viewGroup, boolean z) {
                ViewGroup viewGroup2 = viewGroup;
                C212332187m c212332187m = (C212332187m) viewGroup2.findViewById(R.id.gmd);
                if (c212332187m != null) {
                    c212332187m.setCurrencyShowLeft(z);
                    return c212332187m;
                }
                return new C212332187m(viewGroup2.getContext(), null, 6);
            }
        });
        findViewById(R.id.glb);
        this.LLILZ = (ViewGroup) findViewById(R.id.b_b);
        this.LLILZIL = (FrameLayout) findViewById(R.id.b_s);
        this.LLILZLL = (TuxTextView) findViewById(R.id.bzh);
        this.LLIZ = (ViewGroup) findViewById(R.id.bzj);
        this.LLIZLLLIL = (SmartImageView) findViewById(R.id.eyv);
        this.LLJ = (TuxTextView) findViewById(R.id.f02);
        this.LLJI = (ViewGroup) findViewById(R.id.f03);
        findViewById(R.id.fbc);
        this.LLJIJIL = (C197039127h) findViewById(R.id.gkl);
        this.LLJILJIL = (TuxTextView) findViewById(R.id.o4h);
        C18QS c18qs = (C18QS) findViewById(R.id.rz1);
        this.LLJILJILJ = (TuxTextView) findViewById(R.id.t5a);
        new C185E(c18qs);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Integer num, Integer num2, Long l) {
        num.intValue();
        num2.intValue();
        long jLongValue = l.longValue();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C1868470yir.LIZIZ(jLongValue));
        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(53, false), 0, spannableStringBuilder.length(), 17);
        C786410Ut5.q2(spannableStringBuilder, new StyleSpan(3), 0, spannableStringBuilder.length(), 17);
        TuxTextView tuxTextView = this.LLJ;
        if (tuxTextView != null) {
            tuxTextView.setText(spannableStringBuilder);
        }
        if (jLongValue < 11000) {
            TuxTextView tuxTextView2 = this.LLJILJILJ;
            if (tuxTextView2 != null) {
                C03DZ.LIZJ(tuxTextView2);
                tuxTextView2.setText(spannableStringBuilder);
                tuxTextView2.setPivotX(0.0f);
                tuxTextView2.setPivotY(tuxTextView2.getContext().getResources().getDimension(R.dimen.u9));
            }
            TuxTextView tuxTextView3 = this.LLJ;
            if (tuxTextView3 != null) {
                C0H1U.LIZIZ(tuxTextView3);
            }
            Animator animator = this.LL;
            if (animator != null) {
                animator.cancel();
            }
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.LLJILJILJ, getNumScaleX(), getNumScaleY());
            objectAnimatorOfPropertyValuesHolder.setDuration(400L);
            objectAnimatorOfPropertyValuesHolder.setInterpolator(C1619980sG4.LIZ());
            C786410Ut5.Pd(objectAnimatorOfPropertyValuesHolder);
            this.LL = objectAnimatorOfPropertyValuesHolder;
        } else {
            TuxTextView tuxTextView4 = this.LLJILJILJ;
            if (tuxTextView4 != null) {
                C0H1U.LIZIZ(tuxTextView4);
            }
            TuxTextView tuxTextView5 = this.LLJ;
            if (tuxTextView5 != null) {
                C03DZ.LIZJ(tuxTextView5);
            }
        }
        if (jLongValue <= 1000) {
            ViewGroup viewGroup = this.LLJI;
            if (viewGroup != null) {
                C0H1U.LIZIZ(viewGroup);
            }
            SmartImageView smartImageView = this.LLIZLLLIL;
            if (smartImageView != null) {
                C0H1U.LIZIZ(smartImageView);
            }
            ViewGroup viewGroup2 = this.LLIZ;
            if (viewGroup2 != null) {
                C03DZ.LIZJ(viewGroup2);
            }
            TuxTextView tuxTextView6 = this.LLILZLL;
            if (tuxTextView6 != null) {
                C03DZ.LIZJ(tuxTextView6);
            }
            C197039127h c197039127h = this.LLJIJIL;
            if (c197039127h != null) {
                C786410Ut5.I7(new C19674711yL(this), c197039127h);
            }
            C197039127h c197039127h2 = this.LLJIJIL;
            if (c197039127h2 != null) {
                C786410Ut5.w5(c197039127h2, 0.6f);
            }
        }
        return Unit.LIZ;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C212332187m c212332187m;
        Float fValueOf;
        TuxTextView tuxTextView;
        Layout layout;
        super.onLayout(z, i, i2, i3, i4);
        TuxTextView tuxTextView2 = this.LLJILJIL;
        if (tuxTextView2 != null && tuxTextView2.getVisibility() == 0 && (c212332187m = this.LLILLJJLI.LJI) != null && (fValueOf = Float.valueOf(c212332187m.getPriceNumTextSize())) != null && fValueOf.floatValue() > 14.0f && (tuxTextView = this.LLJILJIL) != null && (layout = tuxTextView.getLayout()) != null && layout.getEllipsisCount(0) > 0) {
            C212332187m c212332187m2 = this.LLILLJJLI.LJI;
            if (c212332187m2 != null) {
                c212332187m2.setPriceNumTuxFont(52);
            }
            requestLayout();
        }
    }
}

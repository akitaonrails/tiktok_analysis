package X;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.LabelColor;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PriceTextConfig;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.SeparatorConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1855, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1855 extends C185J<LinearLayout, C185F> {
    public C185F LIZLLL;
    public int LJ;
    public LinearLayout LJFF;
    public C18L9 LJI;
    public TuxTextView LJII;
    public SpannableStringBuilder LJIIIIZZ;
    public SpannableStringBuilder LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public String LJIIL;
    public FrameLayout LJIILIIL;
    public TuxTextView LJIILJJIL;
    public FrameLayout LJIILL;
    public View LJIILLIIL;
    public TuxTextView LJIIZILJ;
    public Animator LJIJ;
    public Animator LJIJI;
    public SeparatorConfig LJIJJ;
    public final C19LV LJIJJLI;

    public final void destroy() {
        this.LIZLLL = null;
        this.LJ = -2;
        LJIJJLI();
        super.LJIIIZ(false);
    }

    public static final FrameLayout.LayoutParams LJIILJJIL() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15)));
        layoutParams.gravity = 8388627;
        return layoutParams;
    }

    public final void LJIJJ() {
        C185F c185f = this.LIZLLL;
        if (c185f == null) {
            return;
        }
        int i = this.LJ;
        if (i == 1) {
            LJIJI(c185f);
        } else if (i == 2) {
            LJIJ(c185f);
        }
    }

    public final void LJIJJLI() {
        Animator animator = this.LJIJ;
        if (animator != null) {
            animator.cancel();
        }
        this.LJIJ = null;
        Animator animator2 = this.LJIJI;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.LJIJI = null;
        C786410Ut5.LJJJJJL((LinearLayout) this.LIZ);
        TuxTextView tuxTextView = this.LJII;
        if (tuxTextView != null) {
            tuxTextView.removeOnLayoutChangeListener(this.LJIJJLI);
        }
        this.LJII = null;
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
        this.LJIIJ = -1;
        this.LJIIJJI = -1;
        this.LJFF = null;
        this.LJI = null;
        this.LJIILIIL = null;
        this.LJIILJJIL = null;
        this.LJIILL = null;
        this.LJIILLIIL = null;
        this.LJIIZILJ = null;
        this.LJIIL = null;
    }

    public AnonymousClass1855(LinearLayout linearLayout) {
        super(linearLayout);
        this.LJ = -2;
        this.LJIIJ = -1;
        this.LJIIJJI = -1;
        this.LJIJJLI = new C19LV(this, 2);
    }

    public static final float LJIIJJI(int i) {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i * 12)));
    }

    @Override // X.C185J
    public final boolean LJIIIZ(boolean z) {
        return super.LJIIIZ(z);
    }

    public final boolean LJIIJ(C185F c185f) {
        View childAt;
        C18L9 c18l9 = this.LJI;
        if (c18l9 == null || (childAt = c18l9.getChildAt(0)) == null) {
            return false;
        }
        if (c185f.LJIIJ == null && (childAt instanceof TuxTextView)) {
            ((TextView) childAt).setText("");
            return true;
        }
        LJIILIIL(c185f);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00db  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(X.C185F r18) {
        /*
            Method dump skipped, instruction units count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1855.LJIILIIL(X.185F):void");
    }

    public final void LJIIZILJ(C185F c185f) {
        String str = c185f.LIZJ;
        if (C703302op.LIZ(str)) {
            if (a0.LJJIIZI(str, e3.h, false)) {
                this.LJIIJ = a0.LJJJ(str, e3.h, 0, false, 6);
                this.LJIIJJI = a0.LJJJ(str, ")", 0, false, 6);
            } else {
                this.LJIIJ = a0.LJJJ(str, "（", 0, false, 6);
                this.LJIIJJI = a0.LJJJ(str, "）", 0, false, 6);
            }
            int i = this.LJIIJ;
            if (i >= 0) {
                i++;
            }
            this.LJIIJ = i;
            this.LJIIIIZZ = new SpannableStringBuilder(str);
        }
    }

    public final void LJIJ(C185F c185f) {
        TuxTextView tuxTextView = this.LJII;
        if (tuxTextView != null) {
            tuxTextView.removeOnLayoutChangeListener(this.LJIJJLI);
        }
        this.LJII = null;
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
        this.LJIIJ = -1;
        this.LJIIJJI = -1;
        C786410Ut5.LJJJJJL((LinearLayout) this.LIZ);
        LinearLayout linearLayout = new LinearLayout(this.LIZ.getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        this.LJFF = linearLayout;
        C18L9 c18l9 = new C18L9(this.LIZ.getContext(), null);
        if (c18l9.LLILLL != 0) {
            c18l9.LLILLL = 0;
            c18l9.requestLayout();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2, 1.0f);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c18l9);
        c18l9.setLayoutParams(layoutParams);
        c18l9.setDividerSymbol(this.LJIJJ);
        this.LJI = c18l9;
        LinearLayout linearLayout2 = this.LJFF;
        if (linearLayout2 != null) {
            linearLayout2.addView(c18l9);
        }
        ((ViewGroup) this.LIZ).addView(this.LJFF);
        LJIILIIL(c185f);
    }

    public final void LJIJI(C185F c185f) {
        TuxTextView tuxTextView;
        C786410Ut5.LJJJJJL((LinearLayout) this.LIZ);
        this.LJFF = null;
        this.LJI = null;
        this.LJIILIIL = null;
        this.LJIILJJIL = null;
        this.LJIILL = null;
        this.LJIILLIIL = null;
        this.LJIIZILJ = null;
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
        this.LJIIJ = -1;
        this.LJIIJJI = -1;
        int iIntValue = 0;
        TuxTextView tuxTextView2 = new TuxTextView(this.LIZJ, null, 6, iIntValue);
        tuxTextView2.setTuxFont(71);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, tuxTextView2.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        }
        tuxTextView2.setTextColor(iIntValue);
        tuxTextView2.setMaxLines(2);
        LJIIZILJ(c185f);
        SpannableStringBuilder spannableStringBuilder = this.LJIIIIZZ;
        if (spannableStringBuilder != null) {
            tuxTextView2.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        }
        tuxTextView2.addOnLayoutChangeListener(this.LJIJJLI);
        this.LJII = tuxTextView2;
        ((ViewGroup) this.LIZ).addView(tuxTextView2, new LinearLayout.LayoutParams(-1, -2));
        if (C703302op.LIZ(this.LJIIL)) {
            String str = this.LJIIL;
            if (str == null) {
                str = "";
            }
            LJJ(str);
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = this.LJIIIIZZ;
        if (spannableStringBuilder2 == null || (tuxTextView = this.LJII) == null) {
            return;
        }
        tuxTextView.setText(spannableStringBuilder2, TextView.BufferType.SPANNABLE);
    }

    public final void LJIL(SeparatorConfig separatorConfig) {
        this.LJIJJ = separatorConfig;
        C18L9 c18l9 = this.LJI;
        if (c18l9 != null) {
            c18l9.setDividerSymbol(separatorConfig);
        }
        C18L9 c18l92 = this.LJI;
        if (c18l92 != null) {
            c18l92.setChildHorizontalMargin(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0072 A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:25:0x0072, B:27:0x007a, B:28:0x007e, B:22:0x0067, B:24:0x006d), top: B:42:0x0067 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJ(java.lang.String r11) {
        /*
            r10 = this;
            X.185F r9 = r10.LIZLLL
            if (r9 != 0) goto L5
            return
        L5:
            int r0 = r10.LJ
            r2 = 1
            if (r0 == r2) goto Lb
            return
        Lb:
            r10.LJIIL = r11
            android.text.SpannableStringBuilder r8 = r10.LJIIIZ
            if (r8 == 0) goto Lc5
            com.bytedance.tux.input.TuxTextView r5 = r10.LJII
            if (r5 == 0) goto Lc5
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>(r8)
            java.lang.String r0 = " "
            android.text.SpannableStringBuilder r0 = r4.append(r0)
            r0.append(r11)
            android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan
            android.content.Context r1 = r10.LIZJ
            r0 = 2131100624(0x7f0603d0, float:1.7813635E38)
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r1)
            r7 = 0
            if (r0 == 0) goto L65
            int r0 = r0.intValue()
        L35:
            r3.<init>(r0)
            int r0 = r4.length()
            r6 = 18
            X.C786410Ut5.q2(r4, r3, r7, r0, r6)
            int r1 = r10.LJIIJ
            int r0 = r8.length()
            int r0 = r0 - r2
            int r3 = java.lang.Math.min(r1, r0)
            int r1 = r10.LJIIJJI
            int r0 = r8.length()
            int r0 = r0 - r2
            int r2 = java.lang.Math.min(r1, r0)
            if (r3 < 0) goto Lc0
            if (r2 < 0) goto Lc0
            android.text.style.ForegroundColorSpan r8 = new android.text.style.ForegroundColorSpan
            java.lang.String r1 = r9.LJIIIIZZ
            r9 = 2131100452(0x7f060324, float:1.7813286E38)
            if (r1 == 0) goto L72
            goto L67
        L65:
            r0 = 0
            goto L35
        L67:
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L72
            int r0 = android.graphics.Color.parseColor(r1)     // Catch: java.lang.Throwable -> L88
            goto L7e
        L72:
            android.content.Context r0 = r10.LIZJ     // Catch: java.lang.Throwable -> L88
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r9, r0)     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L86
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L88
        L7e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L88
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L88
            goto L94
        L86:
            r0 = 0
            goto L7e
        L88:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L94:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r1)
            if (r0 == 0) goto Laa
            android.content.Context r0 = r10.LIZJ
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r9, r0)
            if (r0 == 0) goto Lc6
            int r0 = r0.intValue()
        La6:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        Laa:
            java.lang.Number r1 = (java.lang.Number) r1
            int r0 = r1.intValue()
            r8.<init>(r0)
            X.C786410Ut5.q2(r4, r8, r3, r2, r6)
            X.0HcY r1 = new X.0HcY
            r0 = 72
            r1.<init>(r0, r7)
            X.C786410Ut5.q2(r4, r1, r3, r2, r6)
        Lc0:
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.SPANNABLE
            r5.setText(r4, r0)
        Lc5:
            return
        Lc6:
            r0 = 0
            goto La6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1855.LJJ(java.lang.String):void");
    }

    public final void LJJI(long j) {
        C185F c185f = this.LIZLLL;
        if (c185f == null || this.LJ != 2 || c185f.LIZ != 0) {
            return;
        }
        C185F c185fLIZ = C185F.LIZ(c185f, 0, null, null, j, 0.0f, 32735);
        this.LIZLLL = c185fLIZ;
        LJIIJ(c185fLIZ);
    }

    public static final FrameLayout LJIILL(Context context, C1555800qaY c1555800qaY) {
        String str;
        FrameLayout frameLayout = new FrameLayout(context);
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        Float fValueOf = Float.valueOf(1.0f);
        gradientDrawable.setStroke(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)), -1);
        gradientDrawable.setColor(-1);
        smartImageView.setBackground(gradientDrawable);
        smartImageView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)));
        ECImage eCImage = c1555800qaY.LIZ;
        if (eCImage != null) {
            str = eCImage.url;
        } else {
            str = null;
        }
        if (C703302op.LIZ(str)) {
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LIZ = true;
            c1331670kl3LIZLLL.LJJI = new C1331730kl9(c1331750klB);
            c1331670kl3LIZLLL.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LIZLLL);
        }
        frameLayout.addView(smartImageView, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15)), 17));
        return frameLayout;
    }

    public final void LJIIL(FrameLayout frameLayout, List<C1555800qaY> list) {
        String str;
        C786410Ut5.LJJJJIZL(frameLayout);
        int i = 0;
        for (Object obj : C13LP.LL(list, 2)) {
            int i2 = i + 1;
            if (i >= 0) {
                FrameLayout frameLayoutLJIILL = LJIILL(frameLayout.getContext(), (C1555800qaY) obj);
                if (i == 0) {
                    str = "sea_flash_sale_tag_avatar_first";
                } else {
                    str = "sea_flash_sale_tag_avatar_second";
                }
                frameLayoutLJIILL.setTag(str);
                frameLayoutLJIILL.setZ(2 - i);
                C786410Ut5.U4(frameLayoutLJIILL, 1.0f);
                C786410Ut5.Pb(frameLayoutLJIILL, 1.0f);
                C786410Ut5.qc(frameLayoutLJIILL, 1.0f);
                C786410Ut5.Gd(frameLayoutLJIILL, LJIIJJI(i));
                C786410Ut5.Md(frameLayoutLJIILL, 0.0f);
                frameLayout.addView(frameLayoutLJIILL, LJIILJJIL());
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public static void LJJIFFI(float f, int i, View view) {
        int iLJ = C13LZ.LJ((int) (i * f), 0, i);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = iLJ;
        C786410Ut5.W5(view, layoutParams);
    }

    public final TuxTextView LJIILLIIL(Context context, String str, PriceTextConfig priceTextConfig) {
        int iIntValue;
        LabelColor labelColor;
        Integer numLIZIZ;
        int i = 0;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, i);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.gp, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        C1003920cEQ c1003920cEQ = InterfaceC1003930cER.LJIILIIL;
        if (priceTextConfig != null) {
            i = priceTextConfig.font;
        }
        c1003920cEQ.getClass();
        tuxTextView.setTuxFont(C1003920cEQ.LIZ(i));
        if (priceTextConfig != null && (labelColor = priceTextConfig.color) != null && (numLIZIZ = labelColor.LIZIZ(this.LIZJ, true)) != null) {
            iIntValue = numLIZIZ.intValue();
        }
        tuxTextView.setTextColor(iIntValue);
        tuxTextView.setSingleLine(true);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setText(str);
        C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
        return tuxTextView;
    }
}

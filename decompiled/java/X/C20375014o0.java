package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS153S0201000_31;
import kotlin.jvm.internal.AwS240S0300000_31;
import kotlin.jvm.internal.AwS397S0200000_31;

/* JADX INFO: renamed from: X.14o0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20375014o0 extends AbstractC960470b6L<C20365614mU> {
    public final InterfaceC20375514o5 LL;
    public final CharSequence LLILLJJLI;
    public final String LLILLL;
    public final C20375614o6 LLILZ;
    public final View LLILZIL;
    public final C20376014oA LLILZLL;
    public final ViewGroup LLIZ;
    public final LiveIconView LLIZLLLIL;
    public final TextView LLJ;
    public final TextView LLJI;
    public final ImageView LLJIJIL;
    public final ImageView LLJILJIL;
    public final ImageView LLJILJILJ;
    public final FrameLayout LLJILLL;
    public final ConstraintLayout LLJJ;
    public final ConstraintLayout LLJJI;
    public final LinearLayout LLJJIII;
    public final LinearLayout LLJJIJI;
    public final int LLJJIJIIJIL;
    public final LiveIconView LLJJIJIL;
    public final TextView LLJJJ;
    public final LiveIconView LLJJJIL;
    public final TextView LLJJJJ;
    public final LinearLayout LLJJJJJIL;
    public final C16F5 LLJJJJLIIL;
    public final LinearLayout LLJJL;
    public final FrameLayout LLJJLIIIJLLLLLLLZ;
    public final C21411818qq LLJL;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T5() {
        /*
            r3 = this;
            android.view.View r2 = r3.LLILZIL
            X.14o6 r0 = r3.LLILZ
            com.bytedance.android.live.design.widget.LiveEditText r0 = r0.LLILLL
            r1 = 0
            if (r0 == 0) goto L32
            boolean r0 = r0.hasFocus()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L11:
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 != 0) goto L30
            X.14oA r0 = r3.LLILZLL
            com.bytedance.android.live.design.widget.LiveEditText r0 = r0.LLILLL
            if (r0 == 0) goto L25
            boolean r0 = r0.hasFocus()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L25:
            boolean r0 = X.C500260Jjc.LJJJI(r1)
            if (r0 != 0) goto L30
            r0 = 0
        L2c:
            X.C500260Jjc.LJLJLJ(r2, r0)
            return
        L30:
            r0 = 1
            goto L2c
        L32:
            r0 = r1
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20375014o0.T5():void");
    }

    public C20375014o0(View view, InterfaceC20375514o5 interfaceC20375514o5) {
        CharSequence charSequenceLJIJJ;
        super(view);
        this.LL = interfaceC20375514o5;
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) C497740JfY.LJIJJ(2131854035, ""));
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C497740JfY.LIZLLL(R.attr.ezs, view.getContext())), 0, spannableStringBuilder.length(), 33);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) C497740JfY.LJIJI(2131854044));
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C497740JfY.LIZLLL(R.attr.ezy, view.getContext())), length, spannableStringBuilder.length(), 33);
            charSequenceLJIJJ = spannableStringBuilder;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            charSequenceLJIJJ = C497740JfY.LJIJJ(2131854035, C497740JfY.LJIJI(2131854044));
        }
        this.LLILLJJLI = charSequenceLJIJJ;
        this.LLILLL = "Add design";
        this.LLILZ = (C20375614o6) view.findViewById(R.id.guj);
        this.LLILZIL = view.findViewById(R.id.gt8);
        this.LLILZLL = (C20376014oA) view.findViewById(R.id.zto);
        this.LLIZ = (ViewGroup) view.findViewById(R.id.etg);
        this.LLIZLLLIL = (LiveIconView) view.findViewById(R.id.lkw);
        this.LLJ = (TextView) view.findViewById(R.id.tv_title_task);
        this.LLJI = (TextView) view.findViewById(R.id.zfc);
        this.LLJIJIL = (ImageView) view.findViewById(R.id.led);
        this.LLJILJIL = (ImageView) view.findViewById(R.id.lef);
        this.LLJILJILJ = (ImageView) view.findViewById(R.id.l_v);
        this.LLJILLL = (FrameLayout) view.findViewById(R.id.qqq);
        this.LLJJ = (ConstraintLayout) view.findViewById(R.id.qsx);
        this.LLJJI = (ConstraintLayout) view.findViewById(R.id.qsy);
        this.LLJJIII = (LinearLayout) view.findViewById(R.id.qsi);
        this.LLJJIJI = (LinearLayout) view.findViewById(R.id.qrj);
        this.LLJJIJIIJIL = R.id.qqs;
        this.LLJJIJIL = (LiveIconView) view.findViewById(R.id.qqt);
        this.LLJJJ = (TextView) view.findViewById(R.id.qqu);
        this.LLJJJIL = (LiveIconView) view.findViewById(R.id.qri);
        this.LLJJJJ = (TextView) view.findViewById(R.id.qrk);
        this.LLJJJJJIL = (LinearLayout) view.findViewById(R.id.w3m);
        this.LLJJJJLIIL = (C16F5) view.findViewById(R.id.w3o);
        this.LLJJL = (LinearLayout) view.findViewById(R.id.w3p);
        this.LLJJLIIIJLLLLLLLZ = (FrameLayout) view.findViewById(R.id.w3r);
        this.LLJL = (C21411818qq) view.findViewById(R.id.w3q);
    }

    public final void P5(C20365614mU c20365614mU, C20365514mT c20365514mT) {
        View viewInvoke;
        C20361214lm c20361214lm = c20365514mT.LIZ;
        Function2<C20361214lm, Context, View> function2 = c20361214lm.LIZJ.LJIIIZ;
        if (function2 != null) {
            viewInvoke = function2.invoke(c20361214lm, this.itemView.getContext());
        } else {
            viewInvoke = null;
        }
        C12ES.LJIILL(0, this.LLJJ);
        if (viewInvoke != null) {
            C439101nJ.LJI(this.LLJJI);
            FrameLayout frameLayout = this.LLJILLL;
            if (frameLayout != null) {
                C12ES.LJIILL(0, frameLayout);
            }
            FrameLayout frameLayout2 = this.LLJILLL;
            if (frameLayout2 != null) {
                frameLayout2.addView(viewInvoke);
            }
            FrameLayout frameLayout3 = this.LLJILLL;
            if (frameLayout3 != null) {
                C500260Jjc.LJLIIIL(500L, frameLayout3, new AwS240S0300000_31(this, c20365614mU, c20365514mT, 41));
            }
        } else {
            C12ES.LJIILL(0, this.LLJJI);
            L5(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJILJIL, this.LLJILJILJ, c20365514mT);
        }
        C500260Jjc.LJLJLJ(this.LLJIJIL, true);
        C500260Jjc.LJLIIIL(500L, this.LLJIJIL, new AwS240S0300000_31(this, c20365614mU, c20365514mT, 42));
        C500260Jjc.LJLIIIL(500L, this.LLIZ, new AwS240S0300000_31(this, c20365614mU, c20365514mT, 43));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0255  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // X.AbstractC960470b6L
    /* JADX INFO: renamed from: R5, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5(final X.C20365614mU r16, final int r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20375014o0.I5(X.14mU, int):void");
    }

    public final void N5(C20365614mU c20365614mU, View view, LiveIconView liveIconView, TextView textView) {
        CharSequence charSequence;
        C500260Jjc.LJLJLJ(liveIconView, true);
        C500260Jjc.LJLJLJ(textView, true);
        if (c20365614mU.LJFF) {
            charSequence = this.LLILLL;
        } else {
            charSequence = this.LLILLJJLI;
        }
        textView.setText(charSequence);
        C500260Jjc.LJLIIIL(500L, view, new AwS397S0200000_31(this, c20365614mU, 106));
    }

    public static void S5(LiveIconView liveIconView, TextView textView, TextView textView2, ImageView imageView, ImageView imageView2) {
        C12ES.LJIILL(0, liveIconView);
        C12ES.LJIILL(0, textView);
        textView.setText("");
        textView2.setText("");
        C439101nJ.LJI(textView2);
        C439101nJ.LJI(imageView);
        C12ES.LJIILL(0, imageView2);
        imageView2.setBackground(null);
    }

    public static void L5(LiveIconView liveIconView, TextView textView, TextView textView2, ImageView imageView, ImageView imageView2, C20365514mT c20365514mT) {
        Unit unit;
        C20361214lm c20361214lm = c20365514mT.LIZ;
        S5(liveIconView, textView, textView2, imageView, imageView2);
        C20361314ln c20361314ln = c20361214lm.LIZJ;
        if (c20361314ln.LJII == EnumC1779270wOz.ATTR) {
            liveIconView.setIconAttr(c20361314ln.LIZJ);
        } else {
            liveIconView.setIcon(c20361314ln.LIZJ);
        }
        textView.setText(c20361314ln.LIZ);
        Boolean boolValueOf = null;
        if (c20361314ln.LJ.isEmpty()) {
            C500260Jjc.LJLJLJ(textView2, false);
        } else {
            C500260Jjc.LJLJLJ(textView2, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i = 0;
            for (String str : c20361314ln.LJ) {
                int i2 = i + 1;
                if (i >= 0) {
                    String str2 = str;
                    if (i != 0) {
                        spannableStringBuilder.append((CharSequence) " · ");
                    }
                    spannableStringBuilder.append((CharSequence) str2);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            textView2.setText(spannableStringBuilder);
        }
        try {
            C20365714mV c20365714mV = c20361314ln.LJFF;
            if (c20365714mV != null) {
                File file = c20365714mV.LIZIZ;
                C500260Jjc.LJLJLJ(imageView, true);
                C500260Jjc.LJLJLJ(imageView2, false);
                C500260Jjc.LJLJLJ(liveIconView, false);
                int i3 = c20365714mV.LIZJ;
                if (file != null) {
                    boolValueOf = Boolean.valueOf(file.exists());
                }
                if (C500260Jjc.LJJJI(boolValueOf)) {
                    C1324610kZf c1324610kZfLJIIJ = C1819620xS4.LIZ().LJIIJ(file);
                    c1324610kZfLJIIJ.LJIIJJI = new ColorDrawable(i3);
                    c1324610kZfLJIIJ.LJIJI(Float.valueOf(C418440Gaw.LIZIZ(12)));
                    c1324610kZfLJIIJ.LJJIFFI = true;
                    c1324610kZfLJIIJ.LJIJJ = ImageView.ScaleType.FIT_START;
                    c1324610kZfLJIIJ.LJJI(imageView);
                    unit = Unit.LIZ;
                } else {
                    Function1<InterfaceC1631620sYq<? super String, ? super String, ? super List<String>, Unit>, Unit> function1 = c20365714mV.LJ;
                    if (function1 != null) {
                        function1.invoke(new AwS153S0201000_31(c20365714mV, i3, imageView, 1));
                        unit = Unit.LIZ;
                    }
                }
                if (unit != null) {
                    return;
                }
            }
            C500260Jjc.LJLJLJ(imageView, false);
            C500260Jjc.LJLJLJ(imageView2, true);
            imageView2.setBackgroundColor(c20365514mT.LJIIIZ);
            C500260Jjc.LJLJLJ(liveIconView, true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJ("Editor_PlaybookEditorTaskViewHolder", "setDescImgFail, throwableMessage=" + th.getMessage());
        }
    }
}

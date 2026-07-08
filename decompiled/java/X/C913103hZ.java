package X;

import Y.ACListenerS136S0100000_1;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import g1c.AjS1S0500000_1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03hZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C913103hZ {
    public static final TuxSheet LIZJ(Context context, FragmentManager fragmentManager, TuxSheet tuxSheet, InterfaceC497601wk interfaceC497601wk) {
        int iIntValue;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
        String string = context.getString(2131840353);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(2131840343));
        String string2 = context.getString(2131840294);
        int length = spannableStringBuilder.length() + 1;
        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(101, false), 0, spannableStringBuilder.length(), 33);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(iIntValue), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) string2);
        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(102, false), length, spannableStringBuilder.length(), 33);
        C786410Ut5.q2(spannableStringBuilder, new C04J7(interfaceC497601wk, context, 2), length, spannableStringBuilder.length(), 33);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        C786410Ut5.e6(relativeLayout, new LinearLayout.LayoutParams(-1, -1));
        relativeLayout.setPaddingRelative(C0H9H.LIZIZ(32), C0H9H.LIZIZ(8), C0H9H.LIZIZ(32), C0H9H.LIZIZ(24));
        C0H9H.LJI(C0H9H.LIZIZ(24), relativeLayout);
        int iGenerateViewId = View.generateViewId();
        C21578619ce c21578619ce = new C21578619ce(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(2, iGenerateViewId);
        C786410Ut5.o6(c21578619ce, layoutParams);
        c21578619ce.setFillViewport(true);
        LinearLayout linearLayout = new LinearLayout(context);
        C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        c21578619ce.addView(linearLayout);
        relativeLayout.addView(c21578619ce);
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C0H9H.LIZIZ(88), C0H9H.LIZIZ(88));
        layoutParams2.gravity = 1;
        layoutParams2.bottomMargin = C0H9H.LIZIZ(16);
        C786410Ut5.M6(tuxIconView, layoutParams2);
        tuxIconView.setIconRes(R.raw.icon_shield_lock_fill);
        tuxIconView.setTintColorRes(R.attr.fm);
        linearLayout.addView(tuxIconView);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.bottomMargin = C0H9H.LIZIZ(12);
        C786410Ut5.R6(tuxTextView, layoutParams3);
        tuxTextView.setGravity(1);
        tuxTextView.setTextColorRes(R.attr.a1h);
        tuxTextView.setTuxFont(123);
        tuxTextView.LJJJJI(28.0f);
        tuxTextView.setText(string);
        linearLayout.addView(tuxTextView);
        TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.bottomMargin = C0H9H.LIZIZ(24);
        C786410Ut5.R6(tuxTextView2, layoutParams4);
        tuxTextView2.setGravity(1);
        tuxTextView2.setTextColorRes(R.attr.a1j);
        tuxTextView2.setTuxFont(61);
        tuxTextView2.setText(spannableStringBuilder);
        tuxTextView2.setMovementMethod(LinkMovementMethod.getInstance());
        tuxTextView2.setHighlightColor(0);
        linearLayout.addView(tuxTextView2);
        linearLayout.addView(LIZ(context, context.getString(2131840345), context.getString(2131840344), R.raw.icon_person_tick_fill, true));
        linearLayout.addView(LIZ(context, context.getString(2131840347), context.getString(2131840346), R.raw.icon_umberella_fill, true));
        linearLayout.addView(LIZ(context, context.getString(2131840349), context.getString(2131840348), R.raw.icon_ai_insight_fill, false));
        C197039127h c197039127h = new C197039127h(context, null, 6, 0);
        c197039127h.setId(iGenerateViewId);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, C0H9H.LIZIZ(52));
        layoutParams5.addRule(12);
        layoutParams5.bottomMargin = C0H9H.LIZIZ(24);
        C786410Ut5.J6(c197039127h, layoutParams5);
        c197039127h.setButtonSize(3);
        c197039127h.setButtonVariant(0);
        c197039127h.setText(context.getString(2131840288));
        C786410Ut5.U8(c197039127h, new ACListenerS136S0100000_1(relativeLayout, 5));
        relativeLayout.addView(c197039127h);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(1);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJIJIIJIL = true;
        tuxSheet2.LLJLILLLLZIIL = false;
        tuxSheet2.LLILLL = true;
        tuxSheet2.LLJLLIL = true;
        tuxSheet2.LLJLLL = true;
        tuxSheet2.LLJJIII = relativeLayout;
        int iLIZJ = (int) (((double) C958103op.LIZJ()) * 0.73d);
        TuxSheet tuxSheet3 = c1390920mIc.LIZ;
        tuxSheet3.LLJJL = iLIZJ;
        tuxSheet3.show(fragmentManager, "PAYMENT_ASSURANCE");
        return tuxSheet3;
    }

    public static final View LIZ(Context context, String str, String str2, int i, boolean z) {
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (z) {
            layoutParams.bottomMargin = C0H9H.LIZIZ(16);
        }
        C786410Ut5.d6(linearLayout, layoutParams);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(48);
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C0H9H.LIZIZ(24), C0H9H.LIZIZ(24));
        layoutParams2.topMargin = C0H9H.LIZIZ(2);
        layoutParams2.setMarginEnd(C0H9H.LIZIZ(8));
        C786410Ut5.M6(tuxIconView, layoutParams2);
        tuxIconView.setIconRes(i);
        tuxIconView.setTintColorRes(R.attr.a1k);
        linearLayout.addView(tuxIconView);
        LinearLayout linearLayout2 = new LinearLayout(context);
        C786410Ut5.d6(linearLayout2, new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout2.setOrientation(1);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-1, -2));
        tuxTextView.setTextColorRes(R.attr.a1h);
        tuxTextView.setTuxFont(32);
        tuxTextView.setText(str);
        linearLayout2.addView(tuxTextView);
        TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
        C786410Ut5.R6(tuxTextView2, new LinearLayout.LayoutParams(-1, -2));
        tuxTextView2.setTextColorRes(R.attr.a1j);
        tuxTextView2.setTuxFont(41);
        tuxTextView2.setText(str2);
        linearLayout2.addView(tuxTextView2);
        linearLayout.addView(linearLayout2);
        return linearLayout;
    }

    public static final void LIZIZ(View view, TuxTextView tuxTextView, boolean z, Context context, FragmentManager fragmentManager, TuxSheet tuxSheet, InterfaceC497601wk interfaceC497601wk, Function1<? super TuxSheet, Unit> function1) {
        String string;
        if (view == null) {
            return;
        }
        if (!z) {
            C03DZ.LIZ(view);
            return;
        }
        C03DZ.LIZJ(view);
        if (context == null || (string = context.getString(2131840342)) == null) {
            string = "";
        }
        if (tuxTextView != null) {
            tuxTextView.setText(C933003km.LIZ(string));
        }
        C786410Ut5.I7(new AjS1S0500000_1(context, fragmentManager, tuxSheet, interfaceC497601wk, function1, 1), view);
    }
}

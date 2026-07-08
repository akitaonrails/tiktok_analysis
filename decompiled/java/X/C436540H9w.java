package X;

import Y.ACListenerS141S0100000_6;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.tns.AnsaPromptModel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.AwS407S0200000_6;
import wh6.AbS498S0200000_6;

/* JADX INFO: renamed from: X.0H9w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C436540H9w implements InterfaceC855080XgY {
    public static final /* synthetic */ int LIZJ = 0;
    public final AnsaPromptModel LIZ;
    public EnumC1995807ro LIZIZ = EnumC1995807ro.NONE;

    public C436540H9w(AnsaPromptModel ansaPromptModel) {
        this.LIZ = ansaPromptModel;
    }

    public static Pair LJI(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        System.currentTimeMillis();
        int iLJIIJ = C12ES.LJIIJ(view.getContext());
        int iLJIIIIZZ = C12ES.LJIIIIZZ(view.getContext());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(iLJIIJ - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin), 1073741824), View.MeasureSpec.makeMeasureSpec(iLJIIIIZZ, Integer.MIN_VALUE));
            return new Pair(Integer.valueOf(view.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin), Integer.valueOf(view.getMeasuredHeight() + marginLayoutParams.bottomMargin + marginLayoutParams.topMargin));
        }
        return new Pair(0, 0);
    }

    @Override // X.InterfaceC855080XgY
    public final void LIZ(View view) {
        EnumC1995807ro enumC1995807ro = this.LIZIZ;
        EnumC1995807ro enumC1995807ro2 = EnumC1995807ro.NORMAL;
        if (enumC1995807ro == enumC1995807ro2) {
            return;
        }
        LJII(view);
        C786410Ut5.LJLLLLLL(0, view);
        this.LIZIZ = enumC1995807ro2;
    }

    @Override // X.InterfaceC855080XgY
    public final void LIZIZ(View view) {
        int i;
        int i2;
        SpannableStringBuilder spannableStringBuilder;
        EnumC1995807ro enumC1995807ro = this.LIZIZ;
        EnumC1995807ro enumC1995807ro2 = EnumC1995807ro.CONDENSED;
        if (enumC1995807ro == enumC1995807ro2) {
            return;
        }
        Context context = view.getContext();
        View viewFindViewById = view.findViewById(R.id.video_creation_intervention_divider);
        View viewFindViewById2 = view.findViewById(R.id.video_creation_intervention_tip_container);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.video_creation_intervention_tip);
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.video_creation_intervention_learn_more_url);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.video_creation_intervention_dismiss);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zn);
        c384050F3z.LIZJ = Float.valueOf(context.getResources().getDimension(R.dimen.ay));
        viewFindViewById2.setBackground(c384050F3z.LIZ(context));
        C786410Ut5.LJLLLLLL(0, viewFindViewById);
        tuxTextView.setEllipsize(null);
        tuxTextView.setMaxLines(Integer.MAX_VALUE);
        String string = context.getString(2131858080);
        Object[] objArr = new Object[1];
        String str = this.LIZ.violationType;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        String strJ4 = C786410Ut5.j4(string, Arrays.copyOf(objArr, 1));
        String string2 = context.getString(2131858081);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strJ4);
        sbLIZ.append(' ');
        sbLIZ.append(string2);
        new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
        tuxTextView.setText(strJ4);
        C786410Ut5.LLLLZLL(tuxTextView, 0);
        C786410Ut5.LLLLZLL(tuxTextView2, 8);
        C786410Ut5.a9(tuxIconView, new ACListenerS141S0100000_6(view, 165));
        if (tuxTextView.getLayout() == null) {
            LJI(view);
        }
        if (tuxTextView.getLayout() != null) {
            tuxTextView.getLineCount();
        }
        int lineCount = tuxTextView.getLineCount();
        int measuredWidth = (tuxTextView.getMeasuredWidth() - tuxTextView.getPaddingStart()) - tuxTextView.getPaddingEnd();
        float fMeasureText = tuxTextView.getPaint().measureText("... ");
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(52);
        float fMeasureText2 = fMeasureText + c444890HcV.measureText(string2);
        float f = measuredWidth;
        if (fMeasureText2 < f && lineCount >= 2) {
            int lineStart = tuxTextView.getLayout().getLineStart(1);
            int lineStart2 = tuxTextView.getLayout().getLineStart(2) - 1;
            float f2 = f - fMeasureText2;
            float fMeasureText3 = tuxTextView.getPaint().measureText(strJ4.subSequence(lineStart, lineStart2).toString());
            TextPaint paint = tuxTextView.getPaint();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(' ');
            sbLIZ2.append(string2);
            float fMeasureText4 = paint.measureText(C2188811AlT.LIZIZ(sbLIZ2));
            if (lineCount == 2 && fMeasureText4 + fMeasureText3 < f) {
                spannableStringBuilder = new SpannableStringBuilder(strJ4);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append(LJFF(context, tuxTextView, string2));
            } else {
                if (fMeasureText3 > f2) {
                    float f3 = fMeasureText3 - f2;
                    i2 = 1;
                    while (i2 < lineStart2 && tuxTextView.getPaint().measureText(strJ4.subSequence(lineStart2 - i2, lineStart2).toString()) <= f3) {
                        i2++;
                    }
                } else {
                    i2 = 0;
                }
                spannableStringBuilder = new SpannableStringBuilder(strJ4.subSequence(0, lineStart2 - i2));
                spannableStringBuilder.append((CharSequence) "... ");
                spannableStringBuilder.append(LJFF(context, tuxTextView, string2));
            }
            tuxTextView.setText(spannableStringBuilder);
            tuxTextView.setMovementMethod(C431260Gvc.LIZ);
            i = 0;
        } else {
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            tuxTextView.setMaxLines(2);
            tuxTextView.setText(strJ4);
            i = 0;
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            tuxTextView2.setMovementMethod(C431260Gvc.LIZ);
            tuxTextView2.setText(LJFF(context, tuxTextView2, string2));
            C786410Ut5.LLLLZLL(tuxTextView2, 0);
        }
        C786410Ut5.LJLLLLLL(i, view);
        this.LIZIZ = enumC1995807ro2;
    }

    @Override // X.InterfaceC855080XgY
    public final Pair<Integer, Integer> LIZJ(View view) {
        LJII(view);
        return LJI(view);
    }

    @Override // X.InterfaceC855080XgY
    public final View LIZLLL(ViewStub viewStub) {
        if (viewStub.getParent() != null) {
            viewStub.setLayoutResource(R.layout.bcc);
            View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
            if (viewLJLLLL instanceof ViewGroup) {
                return viewLJLLLL;
            }
        }
        return null;
    }

    public final void LJII(View view) {
        Context context = view.getContext();
        View viewFindViewById = view.findViewById(R.id.video_creation_intervention_divider);
        View viewFindViewById2 = view.findViewById(R.id.video_creation_intervention_tip_container);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.video_creation_intervention_tip);
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.video_creation_intervention_learn_more_url);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.video_creation_intervention_dismiss);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zn);
        c384050F3z.LIZJ = Float.valueOf(context.getResources().getDimension(R.dimen.ay));
        viewFindViewById2.setBackground(c384050F3z.LIZ(context));
        C786410Ut5.LJLLLLLL(8, viewFindViewById);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(2);
        String string = context.getString(2131858080);
        Object[] objArr = new Object[1];
        String str = this.LIZ.violationType;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        tuxTextView.setText(C786410Ut5.j4(string, Arrays.copyOf(objArr, 1)));
        C786410Ut5.LLLLZLL(tuxTextView, 0);
        tuxTextView2.setMovementMethod(C431260Gvc.LIZ);
        tuxTextView2.setText(LJFF(context, tuxTextView2, context.getString(2131858081)));
        C786410Ut5.LLLLZLL(tuxTextView2, 0);
        C786410Ut5.a9(tuxIconView, new ACListenerS141S0100000_6(view, 164));
    }

    public static View LJ(Context context, CharSequence charSequence, boolean z) {
        int iIntValue;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        View viewLJLLJ = C786410Ut5.LJLLJ(context, R.layout.gb, null);
        ImageView imageView = (ImageView) viewLJLLJ.findViewById(R.id.cy0);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = Integer.valueOf(iIntValue);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(2));
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        imageView.setImageDrawable(c384050F3z.LIZ(context));
        C786410Ut5.LJZI(0, imageView);
        TuxTextView tuxTextView = (TuxTextView) viewLJLLJ.findViewById(R.id.cy1);
        tuxTextView.setTuxFont(41);
        tuxTextView.setTextColor(iIntValue);
        tuxTextView.setText(charSequence);
        tuxTextView.setTextDirection(5);
        tuxTextView.setMovementMethod(C431260Gvc.LIZ);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (z) {
            layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        } else {
            layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        }
        C786410Ut5.W5(viewLJLLJ, layoutParams);
        return viewLJLLJ;
    }

    public final CharSequence LJFF(Context context, TuxTextView tuxTextView, String str) {
        AbS498S0200000_6 abS498S0200000_6 = new AbS498S0200000_6(this, context, 7);
        C444940Hca c444940Hca = new C444940Hca();
        c444940Hca.LIZLLL(1);
        c444940Hca.LIZIZ(52);
        c444940Hca.LIZJ = str;
        c444940Hca.LIZIZ = false;
        c444940Hca.LJIIIIZZ = new AwS407S0200000_6(abS498S0200000_6, tuxTextView, 115);
        return c444940Hca.LIZ(context);
    }
}

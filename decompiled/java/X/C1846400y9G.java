package X;

import Y.ACListenerS161S0100000_27;
import Y.ARunnableS60S0300000_27;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.text.Bidi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0y9G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1846400y9G {
    public static final C01GW<Integer> LJIIIIZZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(806));
    public ViewGroup LIZ;
    public View.OnClickListener LJFF;
    public boolean LJI;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1357));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1354));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1356));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1355));
    public final int LJII = R.layout.c58;

    public final ViewGroup LIZIZ() {
        ViewGroup viewGroup = this.LIZ;
        if (viewGroup != null) {
            return viewGroup;
        }
        return null;
    }

    public final ViewGroup LIZJ() {
        return (ViewGroup) this.LIZJ.getValue();
    }

    public final ImageView LIZLLL() {
        return (ImageView) this.LJ.getValue();
    }

    public final TextView LJ() {
        return (TextView) this.LIZLLL.getValue();
    }

    public final TextView LJFF() {
        return (TextView) this.LIZIZ.getValue();
    }

    public final void LJI(ViewStub viewStub) {
        if (viewStub.getParent() == null) {
            return;
        }
        viewStub.setLayoutResource(this.LJII);
        this.LIZ = (ViewGroup) C786410Ut5.LJLLLL(viewStub);
        this.LJI = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(int i, String str, Function1 function1) {
        int i2;
        int i3;
        String strReplace;
        String string;
        int i4;
        int i5;
        if (!this.LJI) {
            return;
        }
        if (str != null && !TextUtils.isEmpty(str)) {
            C786410Ut5.LJLZ(0, LIZIZ());
            if (C444960Hcc.LIZJ(LJFF().getContext())) {
                i2 = -1;
            } else {
                i2 = -2;
            }
            boolean zBaseIsLeftToRight = new Bidi(str, i2).baseIsLeftToRight();
            TextView textViewLJFF = LJFF();
            ViewGroup viewGroupLIZJ = LIZJ();
            boolean zLIZJ = C444960Hcc.LIZJ(viewGroupLIZJ.getContext());
            View view = (View) textViewLJFF.getParent();
            boolean z = !zBaseIsLeftToRight;
            view.setLayoutDirection(z ? 1 : 0);
            if (zBaseIsLeftToRight) {
                i3 = 3;
            } else {
                i3 = 5;
            }
            textViewLJFF.setGravity(i3);
            viewGroupLIZJ.setLayoutDirection(zLIZJ ? 1 : 0);
            C21626719kP c21626719kP = C21627319kV.LIZLLL;
            new C1086340eNM(z).LIZ().LJFF(str);
            if (zBaseIsLeftToRight) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((char) 8237);
                sbLIZ.append(str);
                sbLIZ.append((char) 8237);
                strReplace = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strReplace = new Regex("(?<!^)(#)([a-zA-Z0-9])").replace(str, "\u200e$1\u200e$2");
            }
            if (TextUtils.equals(LJFF().getText(), strReplace)) {
                return;
            }
            if (!TextUtils.isEmpty(LJFF().getText())) {
                TextView textViewLJFF2 = LJFF();
                ViewGroup viewGroupLIZJ2 = LIZJ();
                TextView textViewLJ = LJ();
                ImageView imageViewLIZLLL = LIZLLL();
                imageViewLIZLLL.setSelected(false);
                if (textViewLJ != null) {
                    textViewLJ.setText(C20642515q3.LJI(2131834298));
                }
                C786410Ut5.Cb(imageViewLIZLLL, 0.0f);
                textViewLJFF2.getLayoutParams().height = -2;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroupLIZJ2.getLayoutParams();
                marginLayoutParams.topMargin = LJIIIIZZ.getValue().intValue();
                C786410Ut5.X5(marginLayoutParams, viewGroupLIZJ2);
            }
            int iLJIIJ = (int) (C12ES.LJIIJ(LJFF().getContext()) - C12ES.LIZJ(32.0f, LJFF().getContext()));
            SpannableString spannableString = new SpannableString(strReplace);
            CharSequence text = LJ().getText();
            if (text == null || (string = text.toString()) == null) {
                string = "";
            }
            TextView textViewLJFF3 = LJFF();
            TextPaint paint = LJFF().getPaint();
            C433700GzY c433700GzY = new C433700GzY(textViewLJFF3, paint, iLJIIJ, string, i);
            SpannableString spannableStringLIZ = (SpannableString) function1.invoke(spannableString);
            DynamicLayout dynamicLayout = new DynamicLayout(spannableStringLIZ.toString(), paint, iLJIIJ, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            if (dynamicLayout.getLineCount() > c433700GzY.LIZJ) {
                int i6 = 1;
                c433700GzY.LIZLLL = true;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("...");
                sbLIZ2.append(string);
                float fMeasureText = paint.measureText(C2188811AlT.LIZIZ(sbLIZ2)) + 45.0f;
                C844470XAv.LIZ.getClass();
                float fLIZJ = fMeasureText + C12ES.LIZJ(5.0f, C844470XAv.LIZ());
                int lineStart = dynamicLayout.getLineStart(c433700GzY.LIZJ - 1);
                int lineStart2 = dynamicLayout.getLineStart(c433700GzY.LIZJ) - 1;
                float fMeasureText2 = paint.measureText(spannableStringLIZ.subSequence(lineStart, lineStart2).toString());
                float f = (int) (iLJIIJ - fLIZJ);
                if (fMeasureText2 > f) {
                    float f2 = fMeasureText2 - f;
                    while (c433700GzY.LIZ.measureText(spannableStringLIZ.subSequence(lineStart2 - i6, lineStart2).toString()) <= f2 && (i6 = i6 + 1) < 15) {
                    }
                } else {
                    i6 = 0;
                }
                new SpannableString("");
                TextView textView = c433700GzY.LJ;
                if (textView != null) {
                    if (C433700GzY.LIZIZ(c433700GzY.LIZIZ, textView, C433700GzY.LIZ(spannableStringLIZ, lineStart2, i6)) == C433700GzY.LIZIZ(c433700GzY.LIZIZ, c433700GzY.LJ, spannableStringLIZ)) {
                        i4 = 0;
                        c433700GzY.LIZLLL = false;
                    } else {
                        i4 = 0;
                        spannableStringLIZ = C433700GzY.LIZ(spannableStringLIZ, lineStart2, i6);
                    }
                } else {
                    i4 = 0;
                    spannableStringLIZ = C433700GzY.LIZ(spannableStringLIZ, lineStart2, i6);
                }
            } else {
                i4 = 0;
            }
            LJFF().setText(spannableStringLIZ);
            TextView textViewLJFF4 = LJFF();
            if (ViewOnTouchListenerC430690Guh.LL == null) {
                ViewOnTouchListenerC430690Guh.LL = new ViewOnTouchListenerC430690Guh();
            }
            textViewLJFF4.setOnTouchListener(ViewOnTouchListenerC430690Guh.LL);
            if (!c433700GzY.LIZLLL) {
                C786410Ut5.LJZI(8, LIZLLL());
                C786410Ut5.LLIL(LJ(), 8);
                return;
            }
            TextView textViewLJ2 = LJ();
            if (!TextUtils.isEmpty(strReplace)) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            C786410Ut5.LLIL(textViewLJ2, i5);
            ImageView imageViewLIZLLL2 = LIZLLL();
            if (TextUtils.isEmpty(strReplace)) {
                i4 = 8;
            }
            C786410Ut5.LJZI(i4, imageViewLIZLLL2);
            HandlerHook.viewPost(LJFF(), new ARunnableS60S0300000_27(this, spannableString, spannableStringLIZ, 16));
            C786410Ut5.T7(LJ(), new ACListenerS161S0100000_27(this, 190));
            return;
        }
        C786410Ut5.LJLZ(8, LIZIZ());
    }
}

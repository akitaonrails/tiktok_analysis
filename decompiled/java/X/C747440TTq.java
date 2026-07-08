package X;

import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.model.TakoFullScreenDisclaimerTextModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS126S1100000_12;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0TTq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C747440TTq {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(7));

    public static final TakoFullScreenDisclaimerTextModel LIZJ() {
        return (TakoFullScreenDisclaimerTextModel) LIZ.getValue();
    }

    public static void LIZ(TextView textView, boolean z, Integer num, Integer num2, int i) {
        int iIntValue;
        int iIntValue2;
        SpannableString spannableString;
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((Object) textView.getText());
        sbLIZ.append(' ');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(C20642515q3.LJI(2131828523));
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        int length = strLIZIZ.length();
        int length2 = strLIZIZ2.length();
        if (num != null) {
            iIntValue = num.intValue();
        } else if (z) {
            iIntValue = 72;
        } else {
            iIntValue = 52;
        }
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else if (z) {
            iIntValue2 = R.attr.a1p;
        } else {
            iIntValue2 = R.attr.a1k;
        }
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(iIntValue);
        Typeface typeface = c444890HcV.getTypeface();
        if (C07Q4.LIZ()) {
            spannableString = new SpannableString(strLIZIZ2);
            C1857690yRT.LIZJ(spannableString, length, length2, Integer.valueOf(C1857690yRT.LJIIJ(iIntValue2)), typeface, AFwS245S0000000_12.get$arr$(4));
        } else {
            spannableString = new SpannableString(strLIZIZ2);
            C1857690yRT.LJ(spannableString, length, length2, Integer.valueOf(C1857690yRT.LJIIJ(iIntValue2)), typeface, new AwS556S0100000_12(textView, 18));
        }
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
    }

    public static void LIZIZ(TuxTextView tuxTextView, Integer num, String str, Integer num2, int i) {
        int iIntValue;
        int iIntValue2;
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((Object) tuxTextView.getText());
        sbLIZ.append(' ');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(C20642515q3.LJI(2131828523));
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        int length = strLIZIZ.length();
        int length2 = strLIZIZ2.length();
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 52;
        }
        if (str != null) {
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = R.attr.a1k;
            }
            C444890HcV c444890HcV = new C444890HcV();
            c444890HcV.LIZ(iIntValue);
            Typeface typeface = c444890HcV.getTypeface();
            SpannableString spannableString = new SpannableString(strLIZIZ2);
            C1857690yRT.LIZJ(spannableString, length, length2, Integer.valueOf(C1857690yRT.LJIIJ(iIntValue2)), typeface, new AwS126S1100000_12(tuxTextView, str, 0));
            tuxTextView.setText(spannableString);
            tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
            tuxTextView.setHighlightColor(0);
        }
    }
}

package X;

import android.content.Context;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.widget.TextView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.03gt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C908903gt {
    public static final SpannableString LIZ(Context context, String str, int i, Function0 function0) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("  ");
        SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        TuxIconDrawable tuxIconDrawable = new TuxIconDrawable(context, R.raw.icon_info_circle);
        tuxIconDrawable.setBounds(0, 0, iLIZIZ, iLIZIZ);
        tuxIconDrawable.LJFF(i);
        C786410Ut5.p2(spannableString, new ImageSpan(tuxIconDrawable), spannableString.length() - 1, spannableString.length(), 17);
        C786410Ut5.p2(spannableString, new C04J8(function0, 0), spannableString.length() - 1, spannableString.length(), 17);
        return spannableString;
    }

    public static final SpannableString LIZIZ(TuxNavBar tuxNavBar, String str, int i, int i2, Integer num) {
        String strLIZIZ;
        int iIntValue;
        int i3;
        if (num == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("  ");
            sbLIZ.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("  ");
            sbLIZ2.append(str);
            sbLIZ2.append(' ');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        SpannableString spannableString = new SpannableString(strLIZIZ);
        Integer numLIZJ = C1308910kAL.LIZJ(i, tuxNavBar.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16711936;
        }
        C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue), 0, spannableString.length(), 17);
        int textSize = (int) ((TextView) tuxNavBar.findViewById(R.id.p28)).getTextSize();
        if (Build.VERSION.SDK_INT >= 29) {
            i3 = 2;
        } else {
            i3 = 0;
        }
        TuxIconDrawable tuxIconDrawable = new TuxIconDrawable(tuxNavBar.getContext(), i2);
        tuxIconDrawable.setBounds(0, 0, textSize, textSize);
        tuxIconDrawable.LJFF(iIntValue);
        C786410Ut5.p2(spannableString, new ImageSpan(tuxIconDrawable, i3), 0, 1, 17);
        if (num != null) {
            TuxIconDrawable tuxIconDrawable2 = new TuxIconDrawable(tuxNavBar.getContext(), num.intValue());
            tuxIconDrawable2.setBounds(0, 0, textSize, textSize);
            tuxIconDrawable2.LJFF(iIntValue);
            C786410Ut5.p2(spannableString, new ImageSpan(tuxIconDrawable2, i3), spannableString.length() - 1, spannableString.length(), 17);
        }
        return spannableString;
    }
}

package X;

import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.view.View;

/* JADX INFO: renamed from: X.0DYe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C340940DYe {
    public static final String LIZ = "&";

    public static void LIZ(final C16F5 c16f5, final String str, final C16F5 c16f52) {
        int ellipsisCount;
        if (c16f5 == null) {
            return;
        }
        if (c16f5.isLaidOut() && !c16f5.isLayoutRequested()) {
            Layout layout = c16f5.getLayout();
            if (layout != null && (ellipsisCount = layout.getEllipsisCount(layout.getLineCount() - 1)) > 0) {
                c16f5.setText(LIZIZ(c16f5, str, str.length() - ellipsisCount, c16f52, 2));
                C786410Ut5.LLJJJJ(c16f52, 0);
                return;
            }
            return;
        }
        c16f5.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0DYf
            public final /* synthetic */ int LLILZ = 2;

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                int ellipsisCount2;
                view.removeOnLayoutChangeListener(this);
                Layout layout2 = c16f5.getLayout();
                if (layout2 != null && (ellipsisCount2 = layout2.getEllipsisCount(layout2.getLineCount() - 1)) > 0) {
                    int length = str.length() - ellipsisCount2;
                    String str2 = C340940DYe.LIZ;
                    c16f5.setText(C340940DYe.LIZIZ(c16f5, str, length, c16f52, this.LLILZ));
                    C786410Ut5.LLJJJJ(c16f52, 0);
                }
            }
        });
    }

    public static String LIZIZ(C16F5 c16f5, String str, int i, C16F5 c16f52, int i2) {
        String str2;
        int i3 = 0;
        do {
            int i4 = i - i3;
            if (i4 < 0) {
                return str.subSequence(0, i).toString();
            }
            CharSequence charSequenceSubSequence = str.subSequence(0, i4);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((Object) charSequenceSubSequence);
            str2 = LIZ;
            sbLIZ.append(str2);
            CharSequence text = c16f52.getText();
            CharSequence charSequence = "";
            if (text == null) {
                text = "";
            }
            sbLIZ.append((Object) text);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            SpannableString spannableString = new SpannableString(strLIZIZ);
            int length = strLIZIZ.length();
            CharSequence text2 = c16f52.getText();
            if (text2 != null) {
                charSequence = text2;
            }
            C1119920fFW.LJIIIIZZ(spannableString, length - charSequence.length(), strLIZIZ.length(), 33, 500);
            if (new StaticLayout(strLIZIZ, c16f5.getPaint(), (c16f5.getWidth() - c16f5.getPaddingLeft()) - c16f5.getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, c16f5.getLineSpacingMultiplier(), c16f5.getLineSpacingExtra(), c16f5.getIncludeFontPadding()).getLineCount() <= i2) {
                break;
            }
            i3++;
        } while (i3 < 30);
        int i5 = i3 + 1;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("toBeRemovedCount:");
        sbLIZ2.append(i5);
        C20441214yg.LIZIZ("ExpandTextUtil", C2188811AlT.LIZIZ(sbLIZ2));
        int i6 = i - i5;
        if (i6 < 0) {
            return str.subSequence(0, i).toString();
        }
        CharSequence charSequenceSubSequence2 = str.subSequence(0, i6);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append((Object) charSequenceSubSequence2);
        sbLIZ3.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ3);
    }
}

package X;

import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0Gv0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C430880Gv0 {
    public static final StaticLayout LIZ(TuxTextView tuxTextView, Spanned spanned, int i) {
        if (i < 1) {
            i = 1;
        }
        TextPaint paint = tuxTextView.getPaint();
        return StaticLayout.Builder.obtain(spanned, 0, ((SpannedString) spanned).length(), paint, i).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(tuxTextView.getLineSpacingExtra(), tuxTextView.getLineSpacingMultiplier()).setIncludePad(tuxTextView.getIncludeFontPadding()).build();
    }
}

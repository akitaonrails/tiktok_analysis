package X;

import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ImageSpan;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.18QL, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18QL {
    public final C18QK LIZ;

    public C18QL(C18QK c18qk) {
        this.LIZ = c18qk;
    }

    public static int LIZIZ(TuxTextView tuxTextView) {
        CharSequence text;
        if (tuxTextView == null || (text = tuxTextView.getText()) == null || text.length() == 0) {
            return 0;
        }
        TextPaint paint = tuxTextView.getPaint();
        if ((text instanceof Spanned) && ((Spanned) text).getSpans(0, text.length(), ImageSpan.class).length != 0) {
            int measuredWidth = tuxTextView.getMeasuredWidth();
            if (measuredWidth < 0) {
                return 0;
            }
            return measuredWidth;
        }
        int iCeil = (int) Math.ceil(paint.measureText(text, 0, text.length()));
        if (iCeil < 0) {
            return 0;
        }
        return iCeil;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18QL.LIZ(int, boolean):void");
    }
}

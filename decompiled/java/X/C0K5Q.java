package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: renamed from: X.0K5Q, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K5Q extends AppCompatTextView {
    public boolean LLIZLLLIL;

    public final boolean getEnlargeNumberOnly() {
        return this.LLIZLLLIL;
    }

    public final void LJJJI(String str) {
        SpannableString spannableString = new SpannableString(str);
        C786410Ut5.p2(spannableString, new StyleSpan(1), 0, str.length(), 33);
        if (this.LLIZLLLIL) {
            int iLIZIZ = C513890KDj.LIZIZ(str);
            int iLIZJ = C513890KDj.LIZJ(str);
            if (iLIZIZ >= 0 && iLIZJ >= 0) {
                C786410Ut5.p2(spannableString, new RelativeSizeSpan(1.9f), iLIZIZ, iLIZJ + 1, 33);
            }
        }
        setText(spannableString);
    }

    public final void setEnlargeNumberOnly(boolean z) {
        this.LLIZLLLIL = z;
    }

    public C0K5Q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLIZLLLIL = true;
    }
}

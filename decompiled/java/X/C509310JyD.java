package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0JyD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C509310JyD extends C16F5 {
    public boolean LLJJ;

    public final boolean getEnlargeNumberOnly() {
        return this.LLJJ;
    }

    public final void LJJJJI(String str) {
        SpannableString spannableString = new SpannableString(str);
        C1119920fFW.LJIIIIZZ(spannableString, 0, str.length(), 33, OppoPermissionPopupMaskDelayExp.DEFAULT);
        if (this.LLJJ) {
            int iLIZIZ = C513900KDk.LIZIZ(str);
            int iLIZJ = C513900KDk.LIZJ(str);
            if (iLIZIZ >= 0 && iLIZJ >= 0) {
                C786410Ut5.p2(spannableString, new RelativeSizeSpan(1.9f), iLIZIZ, iLIZJ + 1, 33);
            }
        }
        setText(spannableString);
    }

    public final void setEnlargeNumberOnly(boolean z) {
        this.LLJJ = z;
    }

    public C509310JyD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ex8);
        this.LLJJ = true;
    }
}

package X;

import android.text.TextUtils;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0UrF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C785270UrF extends C1119660fF6 {
    public C785270UrF(C785230UrB c785230UrB) {
        super(c785230UrB);
        CharSequence charSequence = c785230UrB.LJIJJ;
        this.LJIILJJIL = charSequence;
        if (this.LIZ != null && !TextUtils.isEmpty(charSequence)) {
            TextView textView = (TextView) C786410Ut5.Sd(R.layout.h5s, C786410Ut5.ne(this.LIZ), null);
            textView.setText(c785230UrB.LJIJJ);
            textView.setMaxLines(c785230UrB.LJIILJJIL);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setTextColor(c785230UrB.LJIL);
            if (this.LJJII) {
                textView.setTextColor(C20736316Cj.LIZIZ(R.attr.ezq, C1834150xpV.LJIIIIZZ(this.LIZ)));
            }
            this.LIZJ = textView;
        }
    }
}

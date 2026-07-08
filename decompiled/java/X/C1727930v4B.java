package X;

import android.content.Context;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.text.Regex;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0v4B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1727930v4B extends LinearLayout {
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;

    public final String getCountryCodeString() {
        CharSequence text;
        String strReplace;
        TuxTextView tuxTextView = this.LLILLJJLI;
        return (tuxTextView == null || (text = tuxTextView.getText()) == null || (strReplace = new Regex("\\D+").replace(text, "")) == null) ? "" : strReplace;
    }

    public final TuxTextView getCountryCodeDdName() {
        return this.LL;
    }

    public final TuxTextView getCountryCodeDdNumber() {
        return this.LLILLJJLI;
    }

    public C1727930v4B(Context context) {
        super(context, null);
        LinearLayout.inflate(context, R.layout.hfr, this);
        this.LL = (TuxTextView) findViewById(R.id.f1i);
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.f1k);
    }

    public final void setCountryCode(C1727970v4F c1727970v4F) {
        if (c1727970v4F == null) {
            return;
        }
        String strLIZIZ = c1727970v4F.LIZLLL;
        if (strLIZIZ.length() > 0 && !u.LJJIIJZLJL(strLIZIZ, "+", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('+');
            sbLIZ.append(strLIZIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setText(strLIZIZ);
        }
        TuxTextView tuxTextView2 = this.LL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(c1727970v4F.LIZJ);
        }
    }

    public final void setCountryCodeDdName(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public final void setCountryCodeDdNumber(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }
}

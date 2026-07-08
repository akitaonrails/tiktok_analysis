package X;

import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0sYO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1631340sYO extends C1631360sYQ implements InterfaceC1631350sYP {
    public TextView LIZLLL;

    public C1631340sYO(FrameLayout frameLayout) {
        super(frameLayout);
    }

    public final void LIZ(String str) {
        if (this.LIZLLL == null) {
            this.LIZLLL = (TextView) this.LIZIZ.findViewById(R.id.egp);
        }
        TextView textView = this.LIZLLL;
        if (textView != null) {
            if (!TextUtils.isEmpty(str)) {
                textView.setText(str);
                C786410Ut5.LLIL(textView, 0);
            } else {
                C786410Ut5.LLIL(textView, 8);
            }
        }
    }
}

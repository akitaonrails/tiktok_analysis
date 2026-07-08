package X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import java.util.Collection;

/* JADX INFO: renamed from: X.0Ur9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C785210Ur9 extends C1119660fF6 {
    public C785210Ur9(AbstractC785200Ur8 abstractC785200Ur8) {
        int iIntValue;
        super(abstractC785200Ur8);
        Context context = this.LIZ;
        if (context != null) {
            C0H0H c0h0hLJI = abstractC785200Ur8.LJI(context);
            if (!TextUtils.isEmpty(abstractC785200Ur8.LJIJJ)) {
                LinearLayout linearLayout = new LinearLayout(this.LIZ);
                linearLayout.setOrientation(0);
                C16F5 c16f5 = new C16F5(this.LIZ, null);
                c16f5.LJJJI(R.style.a9f);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.fxc, c16f5.getContext());
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                c16f5.setTextColor(iIntValue);
                c16f5.setIncludeFontPadding(false);
                c16f5.setMaxLines(abstractC785200Ur8.LJIILJJIL);
                c16f5.setEllipsize(TextUtils.TruncateAt.END);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 16;
                linearLayout.addView(c0h0hLJI, layoutParams);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                layoutParams2.gravity = 16;
                linearLayout.addView(c16f5, layoutParams2);
                Collection collection = abstractC785200Ur8.LJJIIJZLJL;
                if (collection != null) {
                    c0h0hLJI.setDrawables(collection);
                }
                c16f5.setText(abstractC785200Ur8.LJIJJ);
                this.LJIILJJIL = abstractC785200Ur8.LJIJJ;
                this.LIZJ = linearLayout;
            }
        }
    }
}

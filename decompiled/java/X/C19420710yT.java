package X;

import android.content.Context;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.discover.model.FormattedText;
import com.zhiliaoapp.musically.R;
import java.util.Set;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.10yT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19420710yT {
    public static final Set<Integer> LJIIIZ = C13LQ.LJLIIL(new Integer[]{1, 2});
    public final View LIZ;
    public final TextView LIZIZ;
    public final TextView LIZJ;
    public final TextView LIZLLL;
    public final TextView LJ;
    public final FrameLayout LJFF;
    public final FrameLayout LJI;
    public final C197039127h LJII;
    public boolean LJIIIIZZ;

    public C19420710yT(View view) {
        this.LIZ = view;
        this.LIZIZ = (TextView) view.findViewById(R.id.oha);
        this.LIZJ = (TextView) view.findViewById(R.id.fpj);
        this.LIZLLL = (TextView) view.findViewById(R.id.q38);
        this.LJ = (TextView) view.findViewById(R.id.s8y);
        this.LJFF = (FrameLayout) view.findViewById(R.id.s8q);
        this.LJI = (FrameLayout) view.findViewById(R.id.s8r);
        this.LJII = (C197039127h) view.findViewById(R.id.m0a);
    }

    public static void LIZ(TextView textView, FormattedText formattedText) {
        int iIntValue;
        int iLJJJ;
        Integer numLIZJ;
        if (formattedText != null) {
            if (Build.VERSION.SDK_INT < 28) {
                textView.setText(formattedText.text);
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formattedText.text);
            String str = formattedText.bold;
            Context context = textView.getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context)) != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = -16777216;
            }
            if (str != null && (iLJJJ = a0.LJJJ(formattedText.text, str, 0, false, 6)) != -1) {
                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(iIntValue), iLJJJ, str.length() + iLJJJ, 18);
            }
            textView.setText(spannableStringBuilder);
        }
    }
}

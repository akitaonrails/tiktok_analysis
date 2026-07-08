package X;

import Y.ACListenerS116S0200000_12;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.router.SmartRouter;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0TIw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C744640TIw extends RecyclerView.ViewHolder {
    public final View LL;

    public C744640TIw(View view) {
        super(view);
        this.LL = view;
    }

    public final void I5(final C1259360isQ c1259360isQ) {
        final Context context = this.LL.getContext();
        final View viewFindViewById = this.LL.findViewById(R.id.je1);
        TextView textView = (TextView) this.LL.findViewById(R.id.mo6);
        String string = context.getString(2131845483);
        String strJ4 = C786410Ut5.j4(context.getString(2131845486), Arrays.copyOf(new Object[]{context.getString(2131845483)}, 1));
        SpannableString spannableString = new SpannableString(strJ4);
        int iLJJJ = a0.LJJJ(strJ4, string, 0, false, 6);
        int length = string.length() + iLJJJ;
        if (iLJJJ >= 0 && length >= 0) {
            C786410Ut5.p2(spannableString, new ClickableSpan() { // from class: X.0TOo
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    C746350TPl.LIZ.LJII().LJ(Boolean.TRUE);
                    c1259360isQ.notifyItemRemoved(this.getAbsoluteAdapterPosition());
                    C786410Ut5.LJLLLLLL(8, viewFindViewById);
                    SmartRouter.buildRoute(context, "aweme://privacy/setting").open();
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("previous_page", "personal_favourite_page");
                    C20684815ws.LJIILLIIL("enter_privacy_setting", c2344009Gk.LIZ);
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    textPaint.setUnderlineText(false);
                }
            }, iLJJJ, length, 18);
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(C960203pA.LIZ(R.attr.a04, context)), iLJJJ, length, 18);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setText(spannableString);
        }
        ImageView imageView = (ImageView) this.LL.findViewById(R.id.lc0);
        if (imageView != null) {
            C786410Ut5.Q7(imageView, new ACListenerS116S0200000_12(c1259360isQ, this, 76));
        }
    }
}

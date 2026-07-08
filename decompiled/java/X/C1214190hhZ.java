package X;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0hhZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1214190hhZ extends RelativeLayout {
    public TextView LL;
    public TextView LLILLJJLI;

    public final void setSelect(boolean z) {
        if (z) {
            TextView textView = this.LL;
            if (textView != null) {
                textView.setTextColor(C960203pA.LIZ(R.attr.ub, getContext()));
            }
            TextView textView2 = this.LLILLJJLI;
            if (textView2 != null) {
                textView2.setTextColor(C960203pA.LIZ(R.attr.ub, getContext()));
                return;
            }
            return;
        }
        TextView textView3 = this.LL;
        if (textView3 != null) {
            textView3.setTextColor(C960203pA.LIZ(R.attr.ud, getContext()));
        }
        TextView textView4 = this.LLILLJJLI;
        if (textView4 == null) {
            return;
        }
        textView4.setTextColor(C960203pA.LIZ(R.attr.ud, getContext()));
    }

    public C1214190hhZ(Context context, boolean z) {
        View viewTd;
        TextView textView;
        super(context);
        if (z) {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.i_w, this, false);
        } else {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.i_y, this, false);
        }
        if (viewTd != null) {
            textView = (TextView) viewTd.findViewById(R.id.zfl);
        } else {
            textView = null;
        }
        this.LL = textView;
        this.LLILLJJLI = viewTd != null ? (TextView) viewTd.findViewById(R.id.tv_option) : null;
        addView(viewTd);
    }
}

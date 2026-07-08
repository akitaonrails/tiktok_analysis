package X;

import Y.ACListenerS141S0100000_6;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gl8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C424760Gl8 extends RecyclerView.ViewHolder {
    public final View LL;
    public final /* synthetic */ C424810GlD LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C424760Gl8(C424810GlD c424810GlD, View view) {
        super(view);
        this.LLILLJJLI = c424810GlD;
        this.LL = view;
        C786410Ut5.I7(new ACListenerS141S0100000_6(this, 13), view);
    }

    public final void I5(String str, boolean z) {
        View view = this.LL;
        if ((view instanceof TextView) && view != null) {
            C424810GlD c424810GlD = this.LLILLJJLI;
            ((TextView) view).setText(str);
            C844470XAv.LIZ.getClass();
            int iLIZJ = (int) C12ES.LIZJ(5.5f, C844470XAv.LIZ());
            int iLIZJ2 = (int) C12ES.LIZJ(8.0f, C844470XAv.LIZ());
            if (c424810GlD.LJ && getAdapterPosition() == 0) {
                this.LL.setBackground(new ColorDrawable(0));
                TextView textView = (TextView) this.LL;
                textView.setTextColor(C960203pA.LIZ(R.attr.a1k, textView.getContext()));
                ((TextView) this.LL).setPadding(0, iLIZJ, 0, iLIZJ);
            } else {
                ((TextView) this.LL).setSelected(z);
                View view2 = this.LL;
                view2.setBackground(C800330VaR.LIZIZ(view2.getContext(), R.drawable.ad8));
                TextView textView2 = (TextView) this.LL;
                textView2.setTextColor(C960203pA.LIZ(R.attr.a1h, textView2.getContext()));
                ((TextView) this.LL).setPadding(iLIZJ2, iLIZJ, iLIZJ2, iLIZJ);
            }
        }
        View view3 = this.LL;
        if ((view3 instanceof TuxTextView) && view3 != null) {
            ((TuxTextView) view3).setTuxFont(52);
        }
    }
}

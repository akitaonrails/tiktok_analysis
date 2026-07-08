package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0cuC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class ViewOnClickListenerC1029820cuC extends LinearLayout implements View.OnClickListener {
    public InterfaceC1029860cuG LL;
    public TextView LLILLJJLI;
    public TextView LLILLL;
    public TextView LLILZ;

    public ViewOnClickListenerC1029820cuC(Context context) {
        super(context, null, 0);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.agq, this, true);
        this.LLILLJJLI = (TextView) viewTd.findViewById(R.id.nqq);
        this.LLILLL = (TextView) viewTd.findViewById(R.id.pc6);
        this.LLILZ = (TextView) viewTd.findViewById(R.id.t84);
        TextView textView = this.LLILLJJLI;
        if (textView != null) {
            C786410Ut5.T7(textView, this);
        }
        TextView textView2 = this.LLILLL;
        if (textView2 != null) {
            C786410Ut5.T7(textView2, this);
        }
        TextView textView3 = this.LLILZ;
        if (textView3 != null) {
            C786410Ut5.T7(textView3, this);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1029860cuG interfaceC1029860cuG;
        int id = view.getId();
        if (id == R.id.nqq) {
            InterfaceC1029860cuG interfaceC1029860cuG2 = this.LL;
            if (interfaceC1029860cuG2 != null) {
                interfaceC1029860cuG2.LIZIZ();
                return;
            }
            return;
        }
        if (id == R.id.pc6) {
            InterfaceC1029860cuG interfaceC1029860cuG3 = this.LL;
            if (interfaceC1029860cuG3 == null) {
                return;
            }
            interfaceC1029860cuG3.LIZ();
            return;
        }
        if (id != R.id.t84 || (interfaceC1029860cuG = this.LL) == null) {
            return;
        }
        interfaceC1029860cuG.LIZJ();
    }

    public final void setInnerClick(InterfaceC1029860cuG interfaceC1029860cuG) {
        this.LL = interfaceC1029860cuG;
    }
}

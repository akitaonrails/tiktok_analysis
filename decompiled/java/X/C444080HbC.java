package X;

import Y.ACListenerS41S0201000_6;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function2;
import u4.q0;

/* JADX INFO: renamed from: X.0HbC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C444080HbC extends C444090HbD<InterfaceC444050Hb9> {
    public TextView LL;
    public final /* synthetic */ C444070HbB LLILLJJLI;

    @Override // X.C444090HbD
    public final void N5() {
        this.LL = (TextView) this.itemView.findViewById(R.id.wy_);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C444080HbC(C444070HbB c444070HbB, View view) {
        super(view);
        this.LLILLJJLI = c444070HbB;
    }

    @Override // X.C444090HbD
    public final void I5(final int i, Object obj) {
        InterfaceC444050Hb9 interfaceC444050Hb9 = (InterfaceC444050Hb9) obj;
        TextView textView = this.LL;
        TextView textView2 = null;
        if (textView == null) {
            textView = null;
        }
        boolean z = false;
        textView.setPadding(0, 0, 0, 0);
        if (interfaceC444050Hb9.LIZJ() == 5) {
            TextView textView3 = this.LL;
            if (textView3 == null) {
                textView3 = null;
            }
            textView3.setText(interfaceC444050Hb9.LJIIIZ());
        }
        String name = interfaceC444050Hb9.getName();
        if (name != null && name.length() != 0) {
            TextView textView4 = this.LL;
            if (textView4 == null) {
                textView4 = null;
            }
            q0.LJIJ(textView4, new C0IE6(interfaceC444050Hb9, 2));
        }
        int i2 = this.LLILLJJLI.LL.LLILZIL.LIZLLL;
        TextView textView5 = this.LL;
        if (textView5 == null) {
            textView5 = null;
        }
        if (i == i2) {
            z = true;
        }
        textView5.setSelected(z);
        TextView textView6 = this.LL;
        if (textView6 == null) {
            textView6 = null;
        }
        C786410Ut5.T7(textView6, new ACListenerS41S0201000_6(this, this.LLILLJJLI, i, 5));
        final Function2<View, Integer, Boolean> function2 = this.LLILLJJLI.LLILLJJLI;
        if (function2 != null) {
            TextView textView7 = this.LL;
            if (textView7 != null) {
                textView2 = textView7;
            }
            textView2.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.03AX
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return function2.invoke(view, Integer.valueOf(i)).booleanValue();
                }
            });
        }
    }
}

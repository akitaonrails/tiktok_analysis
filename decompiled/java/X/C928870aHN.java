package X;

import Y.ACListenerS118S0200000_15;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0aHN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C928870aHN extends AbstractC960470b6L<C929230aHx> {
    public final View LL;
    public InterfaceC929270aI1 LLILLJJLI;
    public final Function1<Integer, Unit> LLILLL;
    public final View LLILZ;
    public final View LLILZIL;

    @Override // X.AbstractC960470b6L
    public final void LLIILZL() {
        this.LLILLJJLI = null;
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        C929230aHx c929230aHx = (C929230aHx) obj;
        C786410Ut5.I7(new ACListenerS118S0200000_15(this, c929230aHx, 15), this.LLILZ);
        C786410Ut5.I7(new ACListenerS118S0200000_15(this, c929230aHx, 16), this.LLILZIL);
        this.LLILLL.invoke(Integer.valueOf(c929230aHx.LIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C928870aHN(View view, InterfaceC929270aI1 interfaceC929270aI1, Function1<? super Integer, Unit> function1) {
        TextView textView;
        super(view);
        this.LL = view;
        this.LLILLJJLI = interfaceC929270aI1;
        this.LLILLL = function1;
        View viewFindViewById = view.findViewById(R.id.tv_see_all);
        this.LLILZ = viewFindViewById;
        this.LLILZIL = view.findViewById(R.id.jwt);
        if (C930540aK4.LJIJJLI()) {
            view.setBackgroundColor(C20736316Cj.LIZJ(R.attr.ezm, view));
            if ((viewFindViewById instanceof C16F5) && (textView = (TextView) viewFindViewById) != null) {
                textView.setText(C497740JfY.LJIJI(2131854568));
            }
        }
    }
}

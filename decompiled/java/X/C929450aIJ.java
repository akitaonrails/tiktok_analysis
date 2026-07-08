package X;

import Y.ACListenerS150S0100000_15;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aIJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C929450aIJ extends AbstractC960470b6L<C929320aI6> {
    public final View LL;
    public Function0<Unit> LLILLJJLI;
    public final View LLILLL;
    public final C16F5 LLILZ;
    public final View LLILZIL;

    @Override // X.AbstractC960470b6L
    public final void LLIILZL() {
        this.LLILLJJLI = null;
    }

    public C929450aIJ(View view, Function0<Unit> function0) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = function0;
        View viewFindViewById = view.findViewById(R.id.cmx);
        this.LLILLL = viewFindViewById;
        C16F5 c16f5 = (C16F5) view.findViewById(R.id.o8v);
        this.LLILZ = c16f5;
        View viewFindViewById2 = view.findViewById(R.id.yd5);
        this.LLILZIL = viewFindViewById2;
        if (C930540aK4.LJIJJLI()) {
            C500260Jjc.LJIILIIL(viewFindViewById2);
            C426750GoL.LJIIIZ(view, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0, 0, false, 16);
            C426750GoL.LJIIL(view, 0, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))), 16);
            view.setBackground(C800330VaR.LIZIZ(view.getContext(), R.drawable.dk3));
            C426750GoL.LJIIIZ(c16f5, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0, false, 16);
            viewFindViewById.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
            viewFindViewById.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
            viewFindViewById.setBackground(C800330VaR.LIZIZ(view.getContext(), R.drawable.e1o));
        }
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        C786410Ut5.I7(new ACListenerS150S0100000_15(this, 19), this.LLILLL);
        if (C925150aBN.LJJIII()) {
            this.LLILZ.setText(2131854212);
        } else {
            this.LLILZ.setText(2131843254);
        }
    }
}

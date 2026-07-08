package X;

import Y.ACListenerS150S0100000_15;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0aHT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C928930aHT extends AbstractC960470b6L<C929380aIC> {
    public InterfaceC929290aI3 LL;
    public final View LLILLJJLI;
    public long LLILLL;

    @Override // X.AbstractC960470b6L
    public final void LLIILZL() {
        this.LL = null;
    }

    public C928930aHT(View view, InterfaceC929290aI3 interfaceC929290aI3) {
        super(view);
        this.LL = interfaceC929290aI3;
        this.LLILLJJLI = view.findViewById(R.id.opz);
        if (C930540aK4.LJIJJLI()) {
            view.setBackgroundColor(C20736316Cj.LIZIZ(R.attr.ezm, view.getContext()));
            view.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38));
        }
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        C786410Ut5.I7(new ACListenerS150S0100000_15(this, 27), this.LLILLJJLI);
    }
}

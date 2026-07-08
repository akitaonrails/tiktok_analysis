package X;

import Y.ACListenerS150S0100000_15;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0aHa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C929000aHa extends AbstractC960470b6L<C929330aI7> {
    public final InterfaceC929280aI2 LL;
    public final View LLILLJJLI;

    public C929000aHa(View view, InterfaceC929280aI2 interfaceC929280aI2) {
        super(view);
        this.LL = interfaceC929280aI2;
        this.LLILLJJLI = view.findViewById(R.id.pak);
        if (C930540aK4.LJIJJLI()) {
            view.setBackgroundColor(C20736316Cj.LIZIZ(R.attr.ezm, view.getContext()));
        }
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        C786410Ut5.I7(new ACListenerS150S0100000_15(this, 28), this.LLILLJJLI);
    }
}

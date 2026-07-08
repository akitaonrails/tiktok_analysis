package X;

import Y.ACListenerS110S0200000_6;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Gk6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C424120Gk6 implements InterfaceC428390Gqz {
    public Function1<? super View, Unit> LIZ;
    public View LIZIZ;

    @Override // X.InterfaceC428390Gqz
    public final void hide() {
        C1706630uVp.LIZ("SmallStatusView", "hide");
        View view = this.LIZIZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    @Override // X.InterfaceC428390Gqz
    public final void LIZIZ(EnumC429200GsI enumC429200GsI) {
        View view;
        if (enumC429200GsI == EnumC429200GsI.NoNetwork) {
            C1706630uVp.LIZ("SmallStatusView", "show");
            View view2 = this.LIZIZ;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
            if (this.LIZ != null && (view = this.LIZIZ) != null) {
                C786410Ut5.I7(new ACListenerS110S0200000_6(view, this, 60), view);
            }
        }
    }

    @Override // X.InterfaceC428390Gqz
    public final void LIZJ(Function1 function1) {
        this.LIZ = function1;
    }

    @Override // X.InterfaceC428390Gqz
    public final View LIZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C1706630uVp.LIZ("SmallStatusView", "inflate");
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.afe, viewGroup, false);
        this.LIZIZ = viewTd;
        viewGroup.addView(viewTd);
        View view = this.LIZIZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        return this.LIZIZ;
    }
}

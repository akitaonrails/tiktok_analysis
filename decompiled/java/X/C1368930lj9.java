package X;

import Y.AObserverS224S0100000_21;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lj9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1368930lj9 extends AbstractC1368920lj8 {
    public C1749280vcc LLJIJIL;
    public View LLJILJIL;

    public final void LJII() {
        C1749280vcc c1749280vcc = this.LLJIJIL;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 0);
        }
        C1749280vcc c1749280vcc2 = this.LLJIJIL;
        if (c1749280vcc2 != null) {
            c1749280vcc2.LJ();
        }
        View view = this.LLJILJIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        View view2 = this.LLJILJIL;
        if (view2 != null) {
            view2.setEnabled(true);
        }
    }

    public final void LJI() {
        Context contextLIZ = LIZ();
        if (contextLIZ == null) {
            return;
        }
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        c1722300uv6.LJI = " ";
        c1722300uv6.LJIIIIZZ = contextLIZ.getString(2131821881);
        C1749280vcc c1749280vcc = this.LLJIJIL;
        if (c1749280vcc != null) {
            c1749280vcc.setTopMargin(0.0f);
        }
        C1749280vcc c1749280vcc2 = this.LLJIJIL;
        if (c1749280vcc2 != null) {
            c1749280vcc2.setStatus(c1722300uv6);
        }
        C1749280vcc c1749280vcc3 = this.LLJIJIL;
        if (c1749280vcc3 != null) {
            C786410Ut5.LLLZLZ(c1749280vcc3, 0);
        }
    }

    public C1368930lj9(C1368870lj3 c1368870lj3) {
        super(c1368870lj3);
    }

    public final void LJFF(boolean z) {
        if (LIZJ().LJJIII != null) {
            if (z) {
                C1749280vcc c1749280vcc = this.LLJIJIL;
                if (c1749280vcc != null) {
                    C786410Ut5.LLLZLZ(c1749280vcc, 0);
                }
                C1749280vcc c1749280vcc2 = this.LLJIJIL;
                if (c1749280vcc2 != null) {
                    c1749280vcc2.LJ();
                }
                View view = this.LLJILJIL;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                }
                View view2 = this.LLJILJIL;
                if (view2 != null) {
                    view2.setEnabled(false);
                    return;
                }
                return;
            }
            View view3 = this.LLJILJIL;
            if (view3 != null) {
                view3.setEnabled(true);
            }
            C1749280vcc c1749280vcc3 = this.LLJIJIL;
            if (c1749280vcc3 == null) {
                return;
            }
            C786410Ut5.LLLZLZ(c1749280vcc3, 8);
        }
    }

    @Override // X.InterfaceC1368960ljC
    public final void onViewCreated(View view, Bundle bundle) {
        this.LLIZ = view;
        if (LJ()) {
            return;
        }
        this.LLJIJIL = (C1749280vcc) view.findViewById(R.id.w28);
        this.LLJILJIL = view.findViewById(R.id.uaf);
        LIZLLL().LLJILJIL.observe(LIZIZ(), new AObserverS224S0100000_21(this, 9));
        LIZLLL().LLJIJIL.observe(LIZIZ(), new AObserverS224S0100000_21(this, 10));
        LIZLLL().LLJILJILJ.observe(LIZIZ(), new AObserverS224S0100000_21(this, 11));
    }
}

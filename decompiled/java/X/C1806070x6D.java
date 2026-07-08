package X;

import Y.ACListenerS129S0200000_27;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0x6D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1806070x6D extends AbstractC1807100x7s<C1806030x69> {
    public final InterfaceC1806240x6U LL;
    public final View LLILLJJLI;
    public final View LLILLL;
    public final C16F5 LLILZ;
    public final C16F5 LLILZIL;
    public final C16FS LLILZLL;

    public final void I5(C1806030x69 c1806030x69) {
        CharSequence charSequenceLJIJI;
        C1807410x8N c1807410x8N;
        C12ES.LJIILL(4, this.LLILLJJLI);
        C12ES.LJIILL(0, this.LLILLL);
        InterfaceC1807440x8Q interfaceC1807440x8Q = c1806030x69.LIZJ;
        if (interfaceC1807440x8Q != null) {
            interfaceC1807440x8Q.LIZ(this.LLILZ);
        }
        InterfaceC1807440x8Q interfaceC1807440x8Q2 = c1806030x69.LIZLLL;
        if (interfaceC1807440x8Q2 != null) {
            interfaceC1807440x8Q2.LIZ(this.LLILZIL);
        }
        InterfaceC1807440x8Q interfaceC1807440x8Q3 = c1806030x69.LIZLLL;
        if (interfaceC1807440x8Q3 != null) {
            InterfaceC1807460x8S interfaceC1807460x8S = new InterfaceC1807460x8S() { // from class: X.0x6C
                @Override // X.InterfaceC1807460x8S
                public final void LIZ(String str) {
                    C1803800x2Y.LIZ.getClass();
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_iap_guide_to_web_click");
                    c474500IjALIZ.LJJIIZI(C1803800x2Y.LJIIIZ());
                    c474500IjALIZ.LJJII("recharge_panel", "position");
                    c474500IjALIZ.LJJII("hyperlink", "click_position");
                    c474500IjALIZ.LJJII(1, "is_iap_package_fail");
                    c474500IjALIZ.LIZ();
                    this.LIZ.LL.LJIIJJI(str);
                }
            };
            if ((interfaceC1807440x8Q3 instanceof C1807410x8N) && (c1807410x8N = (C1807410x8N) interfaceC1807440x8Q3) != null) {
                c1807410x8N.LJFF = interfaceC1807460x8S;
            }
        }
        C16FS c16fs = this.LLILZLL;
        InterfaceC1806620x76 interfaceC1806620x76 = c1806030x69.LJ;
        if (interfaceC1806620x76 == null || (charSequenceLJIJI = interfaceC1806620x76.LIZIZ(this.itemView.getContext())) == null) {
            charSequenceLJIJI = C497740JfY.LJIJI(2131844616);
        }
        c16fs.setText(charSequenceLJIJI);
        C786410Ut5.h8(this.LLILZLL, new ACListenerS129S0200000_27(c1806030x69, this, 61));
        if (C1804000x2s.LIZ(this.itemView.getContext())) {
            C500260Jjc.LJLJL((int) C497740JfY.LIZIZ(12.0f), this.LLILZ);
        } else {
            C500260Jjc.LJLJL((int) C497740JfY.LIZIZ(60.0f), this.LLILZ);
        }
    }

    public C1806070x6D(ViewGroup viewGroup, InterfaceC1806590x73 interfaceC1806590x73) {
        super(R.layout.hkn, viewGroup);
        this.LL = interfaceC1806590x73;
        this.LLILLJJLI = this.itemView.findViewById(R.id.s8j);
        this.LLILLL = this.itemView.findViewById(R.id.hbe);
        this.LLILZ = (C16F5) this.itemView.findViewById(R.id.y3j);
        this.LLILZIL = (C16F5) this.itemView.findViewById(R.id.wmy);
        this.LLILZLL = (C16FS) this.itemView.findViewById(R.id.d6g);
    }
}

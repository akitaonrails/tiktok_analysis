package X;

import Y.ACallableS424S0100000_19;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0iMu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1239820iMu extends C1239830iMv {
    public TextView LLIZLLLIL;

    @Override // X.C1239830iMv
    public final View LIZJ() {
        if (this.LL.getLayoutResource() <= 0) {
            this.LL.setLayoutResource(R.layout.za);
        }
        View viewLJLLLL = C786410Ut5.LJLLLL(this.LL);
        this.LLIZLLLIL = (TextView) viewLJLLLL.findViewById(R.id.c4e);
        if (this.LLILZIL != null) {
            C15O7.LIZJ(new ACallableS424S0100000_19(this, 8)).LJ(new C1266160j3O(this, 17), C15O7.LJIIIIZZ, null);
            return viewLJLLLL;
        }
        InterfaceC1239890iN1 interfaceC1239890iN1 = this.LLILLJJLI;
        if (interfaceC1239890iN1 != null) {
            interfaceC1239890iN1.LLLII();
        }
        return viewLJLLLL;
    }

    public C1239820iMu(C19GS c19gs, ViewStub viewStub, InterfaceC1239890iN1 interfaceC1239890iN1) {
        super(c19gs, viewStub, interfaceC1239890iN1);
    }
}

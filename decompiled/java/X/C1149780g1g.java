package X;

import android.content.Context;
import com.bytedance.android.live.wallet.viewmodel.exchange.AutoExchangeConfirmExchangeDialogVM;
import com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM;

/* JADX INFO: renamed from: X.0g1g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1149780g1g extends AbstractC1149720g1a {
    public final int LJII;
    public final AutoExchangeConfirmExchangeDialogVM LJIIIIZZ;

    @Override // X.InterfaceC1150010g23
    public final boolean show() {
        this.LJIIIIZZ.LLILZ = C158B.LIZ();
        int i = this.LJII;
        if (i == 1) {
            this.LJ = new C1149810g1j(C497740JfY.LJIJI(2131840991), C497740JfY.LJIJI(2131840994), 2131840988, 2131840995, 0, false, false, null, null, 3968);
            this.LIZLLL = true;
        } else if (i == 2) {
            this.LJ = new C1149810g1j(C497740JfY.LJIJI(2131840991), AbstractC1149720g1a.LJI() ? C497740JfY.LJIJI(2131841550) : C497740JfY.LJIJI(2131840993), 2131840988, 2131840995, 0, false, false, null, null, 3968);
            this.LIZLLL = true;
        }
        LIZIZ();
        return true;
    }

    @Override // X.AbstractC1149720g1a
    public final /* bridge */ /* synthetic */ ExchangeDialogVM LIZJ() {
        return this.LJIIIIZZ;
    }

    public C1149780g1g(Context context, C1144350fsv c1144350fsv, InterfaceC1149850g1n interfaceC1149850g1n, int i) {
        super(context, c1144350fsv);
        this.LJII = i;
        this.LJIIIIZZ = new AutoExchangeConfirmExchangeDialogVM(c1144350fsv, interfaceC1149850g1n, i);
    }
}

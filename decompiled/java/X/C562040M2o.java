package X;

import android.view.View;
import irm.AkS80S0100000_8;

/* JADX INFO: renamed from: X.0M2o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C562040M2o extends AbstractC562050M2p<C561950M2f> {
    public final C0M3H LL;

    public C562040M2o(View view, C0M3H c0m3h) {
        super(view);
        this.LL = c0m3h;
    }

    @Override // X.AbstractC562050M2p
    public final void I5(C561950M2f c561950M2f, int i) {
        C0M0F c0m0f;
        int i2 = 8;
        if (c561950M2f.LIZIZ) {
            C786410Ut5.LJLLLLLL(8, this.itemView);
        } else {
            View view = this.itemView;
            if ((c561950M2f instanceof C0M0F) && (c0m0f = (C0M0F) c561950M2f) != null) {
                i2 = c0m0f.LJ;
            }
            C786410Ut5.LJLLLLLL(i2, view);
        }
        C786410Ut5.I7(new AkS80S0100000_8(this, 41), this.itemView);
    }
}

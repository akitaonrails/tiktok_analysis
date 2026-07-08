package X;

import android.view.View;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;
import irm.AkS80S0100000_8;

/* JADX INFO: renamed from: X.0M2i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C561980M2i extends AbstractC562050M2p<C561950M2f> {
    public final InterfaceC561990M2j LL;

    public C561980M2i(View view, DraftBoxFragment draftBoxFragment) {
        super(view);
        this.LL = draftBoxFragment;
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
        C786410Ut5.I7(new AkS80S0100000_8(this, 25), this.itemView);
    }
}

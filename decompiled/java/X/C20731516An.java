package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.16An, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20731516An {
    public final RecyclerView LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1577));
    public boolean LIZJ;

    public C20731516An(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        this.LIZ = viewOnAttachStateChangeListenerC20604515jv;
    }

    public final void LIZ(boolean z) {
        this.LIZJ = z;
        if (z && this.LIZ.getTranslationY() != 0.0f) {
            C786410Ut5.kd(this.LIZ, 0.0f);
            if (((AbstractC21616419ik) this.LIZIZ.getValue()).LJFF) {
                ((AbstractC21616419ik) this.LIZIZ.getValue()).LIZLLL();
            }
        }
    }

    public final void LIZIZ(int i) {
        if (!this.LIZJ && i < 0 && !this.LIZ.canScrollVertically(1)) {
            C786410Ut5.kd(this.LIZ, this.LIZ.getTranslationY() - (i * 0.5f));
            if (!((AbstractC21616419ik) this.LIZIZ.getValue()).LJFF) {
                ((C21616519il) this.LIZIZ.getValue()).LJIIIZ();
            }
        }
    }
}

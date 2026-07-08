package X;

import com.ss.android.ugc.aweme.ad.comment.reviewtab.ui.powerlist.ReviewCell;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.ui.powerlist.ReviewPrivacyCell;

/* JADX INFO: renamed from: X.0y5Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1844100y5Y {
    public final C1749280vcc LIZ;
    public final ViewOnAttachStateChangeListenerC20604515jv LIZIZ;
    public final C1844170y5f LIZJ = new AbstractC1906720ziY() { // from class: X.0y5f
        @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
        public final void onCreate() {
            LJIILIIL(ReviewCell.class);
        }
    };
    public final C1844160y5e LIZLLL = new AbstractC1906720ziY() { // from class: X.0y5e
        @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
        public final void onCreate() {
            LJIILIIL(ReviewCell.class);
        }
    };
    public final C1844180y5g LJ = new AbstractC1906720ziY() { // from class: X.0y5g
        @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
        public final void onCreate() {
            LJIILIIL(ReviewPrivacyCell.class);
        }
    };

    public final void LIZ(boolean z) {
        int i;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LIZIZ;
        int i2 = 0;
        if (!z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewOnAttachStateChangeListenerC20604515jv);
        C1749280vcc c1749280vcc = this.LIZ;
        if (!z) {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, c1749280vcc);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0y5f] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0y5e] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0y5g] */
    public C1844100y5Y(C1749280vcc c1749280vcc, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        this.LIZ = c1749280vcc;
        this.LIZIZ = viewOnAttachStateChangeListenerC20604515jv;
        this.LIZIZ.LIZJ(this.LIZJ);
        this.LIZIZ.LIZJ(this.LIZLLL);
        this.LIZIZ.LIZJ(this.LJ);
    }
}

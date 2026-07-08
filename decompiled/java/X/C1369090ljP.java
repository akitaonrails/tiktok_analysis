package X;

import Y.AObserverS224S0100000_21;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.viewmodel.ShareDialogViewModel;

/* JADX INFO: renamed from: X.0ljP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1369090ljP {
    public final C1749280vcc LIZ;
    public final View LIZIZ;
    public final ShareDialogViewModel LIZJ;
    public final boolean LIZLLL;

    public final void LIZ(boolean z) {
        if (this.LIZLLL) {
            if (z) {
                C786410Ut5.LLLZLZ(this.LIZ, 0);
                this.LIZ.LJ();
                C786410Ut5.LJLLLLLL(0, this.LIZIZ);
                this.LIZIZ.setEnabled(false);
                return;
            }
            this.LIZIZ.setEnabled(true);
            C786410Ut5.LLLZLZ(this.LIZ, 8);
        }
    }

    public C1369090ljP(C1749280vcc c1749280vcc, View view, ShareDialogViewModel shareDialogViewModel, boolean z, LifecycleOwner lifecycleOwner) {
        this.LIZ = c1749280vcc;
        this.LIZIZ = view;
        this.LIZJ = shareDialogViewModel;
        this.LIZLLL = z;
        shareDialogViewModel.LLIZ.observe(lifecycleOwner, new AObserverS224S0100000_21(this, 82));
        shareDialogViewModel.LLILZLL.observe(lifecycleOwner, new AObserverS224S0100000_21(this, 83));
        shareDialogViewModel.LLIZLLLIL.observe(lifecycleOwner, new AObserverS224S0100000_21(this, 84));
    }
}

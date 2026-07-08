package X;

import android.view.KeyEvent;
import com.ss.android.ugc.aweme.detail.ui.saf.DetailSafRootFragment;

/* JADX INFO: renamed from: X.0mWm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1399700mWm implements InterfaceC1399350mWD {
    public final /* synthetic */ DetailSafRootFragment LL;

    public C1399700mWm(DetailSafRootFragment detailSafRootFragment) {
        this.LL = detailSafRootFragment;
    }

    @Override // X.InterfaceC1399350mWD
    public final /* synthetic */ boolean Fi() {
        return false;
    }

    @Override // X.InterfaceC1399350mWD
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        C1399710mWn.LIZIZ.LIZ(Integer.valueOf(i), keyEvent, this.LL.getActivity());
        return false;
    }
}

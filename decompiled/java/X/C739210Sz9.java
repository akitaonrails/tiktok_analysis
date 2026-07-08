package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;

/* JADX INFO: renamed from: X.0Sz9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C739210Sz9 implements InterfaceC1167780gUi {
    public final /* synthetic */ BaseListFragmentPanel LIZ;

    @Override // X.InterfaceC1167780gUi
    public final void LIZIZ(boolean z) {
    }

    public C739210Sz9(BaseListFragmentPanel baseListFragmentPanel) {
        this.LIZ = baseListFragmentPanel;
    }

    @Override // X.InterfaceC1167780gUi
    public final void LIZ(boolean z) {
        if (z) {
            Aweme awemeLJIIIIZZ = this.LIZ.LJIIIIZZ();
            if (awemeLJIIIIZZ != null) {
                awemeLJIIIIZZ.playlist_info = null;
            }
            this.LIZ.LJJJJ();
        }
        this.LIZ.R();
        this.LIZ.LLJJIJI.setDisableScroll(false);
    }
}

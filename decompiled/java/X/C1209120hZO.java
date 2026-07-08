package X;

import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;

/* JADX INFO: renamed from: X.0hZO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1209120hZO implements C0J3O {
    public final /* synthetic */ DetailFragmentPanel LIZ;

    public final void LIZ() {
        DetailFragmentPanel detailFragmentPanel = this.LIZ;
        C1209140hZQ c1209140hZQ = detailFragmentPanel.q0;
        if (c1209140hZQ != null) {
            c1209140hZQ.LIZIZ();
        }
        int currentItem = detailFragmentPanel.LLJJIJI.getCurrentItem() + 1;
        if (currentItem < detailFragmentPanel.LLJL.getCount()) {
            detailFragmentPanel.LLFFF(currentItem, true);
        }
        detailFragmentPanel.LLJJIII.LJIIIZ("[advanceToNextItem]");
    }

    public C1209120hZO(DetailFragmentPanel detailFragmentPanel) {
        this.LIZ = detailFragmentPanel;
    }
}

package X;

import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0T0Q, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T0Q implements Runnable {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ DetailFragmentPanel LLILZ;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("DetailFragmentPanel@5b0b.makeSureViewHolderCreatedAndShowViewFragment$1");
        try {
            DetailFragmentPanel detailFragmentPanel = this.LLILZ;
            Aweme aweme = this.LL;
            String str = this.LLILLJJLI;
            int i = this.LLILLL + 1;
            if (detailFragmentPanel.LJLIL() != null || i >= 3) {
                detailFragmentPanel.LLLLLLZZ(aweme, str, null, false);
            } else {
                detailFragmentPanel.postDelayed(new C0T0Q(detailFragmentPanel, aweme, str, i), 50L);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DetailFragmentPanel@5b0b.makeSureViewHolderCreatedAndShowViewFragment$1");
    }

    public C0T0Q(DetailFragmentPanel detailFragmentPanel, Aweme aweme, String str, int i) {
        this.LLILZ = detailFragmentPanel;
        this.LL = aweme;
        this.LLILLJJLI = str;
        this.LLILLL = i;
    }
}

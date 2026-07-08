package X;

import Y.ARunnableS107S0100000_7;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;

/* JADX INFO: renamed from: X.0J8Y, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J8Y implements Runnable {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ FullFeedFragmentPanel LLILLL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("FullFeedFragmentPanel@9b2e.checkLiveStatusBatch$1");
        try {
            C823050WQl.LIZLLL().submit(new ARunnableS107S0100000_7(this, 117));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FullFeedFragmentPanel@9b2e.checkLiveStatusBatch$1");
    }

    public C0J8Y(FullFeedFragmentPanel fullFeedFragmentPanel, int i, String str) {
        this.LLILLL = fullFeedFragmentPanel;
        this.LL = i;
        this.LLILLJJLI = str;
    }
}

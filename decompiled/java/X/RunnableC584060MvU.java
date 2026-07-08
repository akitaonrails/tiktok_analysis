package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;

/* JADX INFO: renamed from: X.0MvU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class RunnableC584060MvU implements Runnable {
    public final /* synthetic */ View LL;
    public final /* synthetic */ VideoViewCell LLILLJJLI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("VideoViewCell@c979.doInit$1");
        try {
            this.LLILLJJLI.J(this.LL);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoViewCell@c979.doInit$1");
    }

    public RunnableC584060MvU(VideoViewCell videoViewCell, View view) {
        this.LLILLJJLI = videoViewCell;
        this.LL = view;
    }
}

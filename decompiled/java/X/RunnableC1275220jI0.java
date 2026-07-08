package X;

import com.ss.avframework.livestreamv2.core.interact.video.render.LyraxVideoRendererWrapper;

/* JADX INFO: renamed from: X.0jI0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class RunnableC1275220jI0 implements Runnable {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ LyraxVideoRendererWrapper LLILZIL;

    public final void LIZ() {
        synchronized (this.LLILZIL) {
            try {
                LyraxVideoRendererWrapper lyraxVideoRendererWrapper = this.LLILZIL;
                if (lyraxVideoRendererWrapper.LIZIZ) {
                    return;
                }
                lyraxVideoRendererWrapper.LJJIJ = false;
                synchronized (this.LLILZIL.LJJIIZI) {
                    try {
                        long j = this.LLILZIL.LJJIIZ;
                        if (j != 0) {
                            LyraxVideoRendererWrapper.nativeOnRenderFrameCompleted(j, this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ);
                        }
                    } finally {
                    }
                }
            } finally {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LyraxVideoRendererWrapper@5a1e.buildOnRenderedRunnable$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LyraxVideoRendererWrapper@5a1e.buildOnRenderedRunnable$1");
    }

    public RunnableC1275220jI0(LyraxVideoRendererWrapper lyraxVideoRendererWrapper, int i, int i2, int i3, long j) {
        this.LLILZIL = lyraxVideoRendererWrapper;
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = j;
    }
}

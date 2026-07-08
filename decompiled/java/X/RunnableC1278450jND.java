package X;

import com.ss.bytertc.engine.video.converter.WebRTCConverter;
import com.ss.lyrax.video.LyraxVideoFrame;

/* JADX INFO: renamed from: X.0jND, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class RunnableC1278450jND implements Runnable {
    public final /* synthetic */ LyraxVideoFrame LL;

    public /* synthetic */ RunnableC1278450jND(LyraxVideoFrame lyraxVideoFrame) {
        this.LL = lyraxVideoFrame;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebRTCConverter.lambda$semisugar$release$1(this.LL);
    }
}

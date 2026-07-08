package X;

import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;

/* JADX INFO: renamed from: X.0j5f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class RunnableC1267570j5f implements Runnable {
    public final /* synthetic */ AudioDeviceModule.AudioRenderSink LL;
    public final /* synthetic */ boolean LLILLJJLI;

    public /* synthetic */ RunnableC1267570j5f(AudioDeviceModule.AudioRenderSink audioRenderSink, boolean z) {
        this.LL = audioRenderSink;
        this.LLILLJJLI = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudioDeviceModule.AudioRenderSink audioRenderSink = this.LL;
        boolean z = this.LLILLJJLI;
        audioRenderSink.getClass();
        C1C7U.LIZ("AudioDeviceModule$AudioRenderSink@e2e.setMute$1L");
        AudioDeviceModule.nativeRenderSinkSetMute(audioRenderSink.mNativeObj, z);
        C1C7U.LIZIZ("AudioDeviceModule$AudioRenderSink@e2e.setMute$1L");
    }
}

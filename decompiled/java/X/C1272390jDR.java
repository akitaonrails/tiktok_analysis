package X;

import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.player.NativeRenderObserver;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: X.0jDR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1272390jDR {
    public AudioDeviceModule.AudioRenderSink LIZ;
    public NativeRenderObserver LIZIZ;
    public CountDownLatch LIZJ = new CountDownLatch(1);
    public volatile boolean LIZLLL = false;

    public C1272390jDR(InterfaceC1273910jFt interfaceC1273910jFt) {
        AudioDeviceModule.RenderObserver renderObserver = new AudioDeviceModule.RenderObserver() { // from class: X.0jDX
            @Override // com.ss.ttlivestreamer.core.engine.AudioDeviceModule.RenderObserver
            public final void onCompletion() {
            }

            @Override // com.ss.ttlivestreamer.core.engine.AudioDeviceModule.RenderObserver
            public final void onError(int i) {
            }

            @Override // com.ss.ttlivestreamer.core.engine.AudioDeviceModule.RenderObserver
            public final void onProgress(long j, int i) {
            }

            @Override // com.ss.ttlivestreamer.core.engine.AudioDeviceModule.RenderObserver
            public final void onStopped() {
            }

            @Override // com.ss.ttlivestreamer.core.engine.AudioDeviceModule.RenderObserver
            public final void onBegin() {
                this.LL.LIZLLL = true;
                this.LL.LIZJ.countDown();
            }
        };
        if (interfaceC1273910jFt != null) {
            AudioDeviceModule.AudioRenderSink audioRenderSinkCreateRenderSink = interfaceC1273910jFt.LJJJJJ().createRenderSink();
            this.LIZ = audioRenderSinkCreateRenderSink;
            if (audioRenderSinkCreateRenderSink != null) {
                audioRenderSinkCreateRenderSink.LLJILJIL(0L);
                NativeRenderObserver nativeRenderObserver = new NativeRenderObserver(renderObserver);
                this.LIZIZ = nativeRenderObserver;
                this.LIZ.LLJILJILJ(nativeRenderObserver);
            }
        }
    }
}

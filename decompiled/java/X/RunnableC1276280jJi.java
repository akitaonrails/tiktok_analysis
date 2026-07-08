package X;

import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;

/* JADX INFO: renamed from: X.0jJi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class RunnableC1276280jJi implements Runnable {
    public final /* synthetic */ AudioDeviceModule.AudioRenderSink LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    public /* synthetic */ RunnableC1276280jJi(AudioDeviceModule.AudioRenderSink audioRenderSink, String str, String str2) {
        this.LL = audioRenderSink;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudioDeviceModule.AudioRenderSink audioRenderSink = this.LL;
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        audioRenderSink.getClass();
        C1C7U.LIZ("AudioDeviceModule$AudioRenderSink@e2e.setAudioFilePath$1L");
        AudioDeviceModule.nativeSetAudioFilePath(audioRenderSink.mNativeObj, str, str2);
        C1C7U.LIZIZ("AudioDeviceModule$AudioRenderSink@e2e.setAudioFilePath$1L");
    }
}

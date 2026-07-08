package X;

import com.ss.ttlivestreamer.core.capture.audio.AudioCapturer;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.utils.TEBundle;

/* JADX INFO: renamed from: X.0j7H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1268570j7H extends AudioCapturer {
    public int LL;
    public AudioDeviceModule LLILLJJLI;
    public final InterfaceC1268590j7J LLILLL;

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer, com.ss.ttlivestreamer.core.engine.AudioSource, com.ss.ttlivestreamer.core.engine.NativeObject
    public final synchronized void release() {
        super.release();
        this.LLILLJJLI = null;
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public final void start() {
        int iStartRecording = this.LLILLJJLI.startRecording();
        if (iStartRecording == 0) {
            this.LL = 1;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Start adm audio record failure (");
        sbLIZ.append(iStartRecording);
        sbLIZ.append(")");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public final void stop() {
        this.LLILLJJLI.stopRecording();
        this.LL = 2;
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public final int updateChannel() {
        return this.LLILLJJLI.getParameter().getInt("audio_channels");
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public final void pause() {
        super.pause();
        AudioDeviceModule audioDeviceModule = this.LLILLJJLI;
        if (audioDeviceModule != null) {
            audioDeviceModule.pause();
        }
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public final void resume() {
        super.resume();
        AudioDeviceModule audioDeviceModule = this.LLILLJJLI;
        if (audioDeviceModule != null) {
            audioDeviceModule.resume();
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.MediaSource
    public final int status() {
        return this.LL;
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public final void mute(boolean z) {
        this.mMute = z;
        AudioDeviceModule audioDeviceModule = this.LLILLJJLI;
        if (audioDeviceModule != null) {
            audioDeviceModule.setMicMute(z);
        }
    }

    public C1268570j7H(int i, AudioDeviceModule audioDeviceModule, InterfaceC1268590j7J interfaceC1268590j7J) {
        this.LLILLJJLI = audioDeviceModule;
        this.LLILLL = interfaceC1268590j7J;
        this.LLILLJJLI.setAudioCaptureObserver(this.LLILLL);
        this.LLILLJJLI.setParameter(this.LLILLJJLI.getParameter());
        setMode(i);
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public final void setOutputFormat(int i, int i2, int i3) {
        AudioDeviceModule audioDeviceModule = this.LLILLJJLI;
        if (audioDeviceModule != null) {
            TEBundle parameter = audioDeviceModule.getParameter();
            parameter.setInt("audio_channels", i2);
            parameter.setInt("audio_sample", i);
            this.LLILLJJLI.setParameter(parameter);
        }
    }
}

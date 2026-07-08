package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS31S0101000_20;
import Y.ARunnableS39S0110000_20;
import Y.ARunnableS89S0200000_20;
import android.media.AudioManager;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.buffer.WrapperNativeAudioBuffer;
import com.ss.ttlivestreamer.core.capture.audio.AudioCapturer;
import com.ss.ttlivestreamer.core.engine.AudioSink;
import com.ss.ttlivestreamer.core.engine.MediaEngineFactory;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;
import java.nio.Buffer;

/* JADX INFO: renamed from: X.0j7G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1268560j7G extends AudioCapturer implements InterfaceC1268590j7J {
    public final int LL;
    public final int LLILLJJLI;
    public final Handler LLILLL;
    public C1268570j7H LLILZIL;
    public C1268580j7I LLILZLL;
    public InterfaceC1268590j7J LLIZLLLIL;
    public SafeHandlerThread LLJ;
    public int LLJI;
    public boolean LLJIJIL;
    public final Object LLJILJILJ = new Object();
    public boolean LLJILLL = false;
    public int LLILZ = 5;
    public final int LLJILJIL = 5;
    public final int LLJJ = 5;
    public final MediaEngineFactory LLIZ = null;

    public void LLJILJIL(AudioManager.AudioRecordingCallback audioRecordingCallback) {
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer, com.ss.ttlivestreamer.core.engine.AudioSource, com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        AVLog.iow("LiveStreamAudioCapture", "Release at LiveStreamAudioCapture ...");
        stop();
        C1283100jUi.LIZIZ(this.LLILLL, new ARunnableS120S0100000_20(this, 423));
        synchronized (this.LLJILJILJ) {
            try {
                super.release();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        AVLog.ioi("LiveStreamAudioCapture", "Release at LiveStreamAudioCapture done");
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public void start() {
        Exception[] excArr = new Exception[1];
        C1283100jUi.LIZIZ(this.LLILLL, new ARunnableS89S0200000_20(this, excArr, 236));
        if (excArr[0] != null) {
            throw new IllegalStateException(excArr[0].getCause());
        }
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public synchronized void stop() {
        C1283100jUi.LIZIZ(this.LLILLL, new ARunnableS120S0100000_20(this, 422));
    }

    public void unRegisterAudioRecordingCallback(AudioManager.AudioRecordingCallback audioRecordingCallback) {
    }

    public final void LLJI() {
        C1268570j7H c1268570j7H = this.LLILZIL;
        if (c1268570j7H != null) {
            c1268570j7H.setCalculatePcmPowerEventObserver(null);
            this.LLILZIL.pause();
            this.LLILZIL.stop();
            this.LLILZIL.release();
            this.LLILZIL = null;
        }
    }

    public void LLJJ() {
        AVLog.iod("LiveStreamAudioCapture", "toBack");
        C786410Ut5.LJJZZIII(this.LLILLL, new ARunnableS120S0100000_20(this, 424));
    }

    public void LLJJI() {
        AVLog.iod("LiveStreamAudioCapture", "toFront");
        C786410Ut5.LJJZZIII(this.LLILLL, new ARunnableS120S0100000_20(this, 425));
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public int updateChannel() {
        C1268570j7H c1268570j7H = this.LLILZIL;
        return c1268570j7H != null ? c1268570j7H.updateChannel() : this.LL;
    }

    public int LL() {
        return this.LLILZ;
    }

    public final void LLJILJILJ() {
        super.release();
    }

    @Override // com.ss.ttlivestreamer.core.engine.MediaSource
    public int status() {
        return this.LLJI;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0j7I] */
    public final void LLIZ(int i) {
        if (this.LLJIJIL && i != 4) {
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("Call exception");
            C1274080jGA.LIZ.LIZ("LiveStreamAudioCapture.onCreateCapture", androidRuntimeException);
            if (C1274040jG6.LIZ()) {
                throw androidRuntimeException;
            }
        }
        C1270290jA3.LIZIZ().LIZIZ = EnumC1270260jA0.SWITCH;
        LLJI();
        C1270290jA3.LIZIZ().LIZIZ = EnumC1270260jA0.NONE;
        if (i == 5) {
            this.LLILZIL = new C1268570j7H(getMode(), this.mADM, this);
        }
        if (this.LLILZIL == null) {
            if (i == 0) {
                return;
            } else {
                throw new Exception("Audio capture create failed");
            }
        }
        if (this.LLILZLL == null) {
            this.LLILZLL = new AudioSink() { // from class: X.0j7I
                @Override // com.ss.ttlivestreamer.core.engine.AudioSink
                public final void onNoData() {
                }

                @Override // com.ss.ttlivestreamer.core.engine.AudioSink
                public final void onData(WrapperNativeAudioBuffer wrapperNativeAudioBuffer) {
                    this.LL.LLIZLLLIL(wrapperNativeAudioBuffer, wrapperNativeAudioBuffer.mSamplesPerChannel, wrapperNativeAudioBuffer.mSampleRateHz, wrapperNativeAudioBuffer.mChannel, wrapperNativeAudioBuffer.timestampUs);
                }

                @Override // com.ss.ttlivestreamer.core.engine.AudioSink
                public final void onData(Buffer buffer, int i2, int i3, int i4, long j) {
                    this.LL.onData(buffer, i2, i3, i4, j * 1000);
                }
            };
        }
        this.LLILZIL.start();
        this.LLILZIL.resume();
        int i2 = this.LLILZIL.LL;
        if (i2 == 1) {
            this.LLJI = i2;
            this.LLILZ = i;
            return;
        }
        throw new Exception("Audio capture status exception");
    }

    public final void LLJ(boolean z) {
        if (this.mMute == z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Ignore to repeat mute operations (");
            sbLIZ.append(z);
            sbLIZ.append(")");
            AVLog.iow("LiveStreamAudioCapture", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C1268570j7H c1268570j7H = this.LLILZIL;
        if (c1268570j7H == null) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Mute operation (");
        sbLIZ2.append(this.mMute);
        sbLIZ2.append(" -> ");
        sbLIZ2.append(z);
        sbLIZ2.append(") last source ");
        sbLIZ2.append(this.LLJJ);
        sbLIZ2.append(" current source ");
        sbLIZ2.append(this.LLILZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        AVLog.iod("LiveStreamAudioCapture", strLIZIZ);
        AVLog.logKibana(4, "LiveStreamAudioCapture", strLIZIZ, null);
        this.mMute = z;
        c1268570j7H.mute(z);
    }

    public final void LLJIJIL(int i) {
        String strLIZIZ;
        C1268570j7H c1268570j7H;
        C1268570j7H c1268570j7H2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switch audio source current source ");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(" target source ");
        sbLIZ.append(i);
        sbLIZ.append(" audioSourceMode ");
        sbLIZ.append(getMode());
        sbLIZ.append(" is bgm ");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(" status ");
        sbLIZ.append(status());
        sbLIZ.append(" mAudioCapture ");
        if (this.LLILZIL != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.LLILZIL);
            sbLIZ2.append(" mode ");
            sbLIZ2.append(this.LLILZIL.getMode());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            strLIZIZ = "null";
        }
        sbLIZ.append(strLIZIZ);
        AVLog.iod("LiveStreamAudioCapture", C2188811AlT.LIZIZ(sbLIZ));
        if (status() != 1 && !this.LLJILLL) {
            this.LLIZLLLIL.LJJJJLI(-304, new Exception("on live audio capture status exception call."));
            return;
        }
        if (!this.LLJILLL && this.LLILZ == i && ((c1268570j7H2 = this.LLILZIL) == null || c1268570j7H2.getMode() == getMode())) {
            return;
        }
        if (this.LLILZ == i && (c1268570j7H = this.LLILZIL) != null && this.mADM != null && c1268570j7H.getMode() != getMode()) {
            this.LLILZIL.setMode(getMode());
            return;
        }
        C1270290jA3.LIZIZ().LIZIZ = EnumC1270260jA0.SWITCH;
        LLJI();
        C1270290jA3.LIZIZ().LIZIZ = EnumC1270260jA0.NONE;
        try {
            LLIZ(i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (!this.LLJILLL) {
                this.LLJILLL = true;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Try open AudioCapture and source ");
                sbLIZ3.append(this.LLILZ);
                sbLIZ3.append(" VS ");
                sbLIZ3.append(i);
                sbLIZ3.append(" mode ");
                sbLIZ3.append(getMode());
                AVLog.iod("LiveStreamAudioCapture", C2188811AlT.LIZIZ(sbLIZ3));
                C786410Ut5.LJLIIL(200L, this.LLILLL, new ARunnableS31S0101000_20(i, this, 38));
            } else {
                this.LLIZLLLIL.LJJJJLI(-305, e);
                this.LLJI = 2;
                return;
            }
        }
        this.LLJI = 1;
    }

    public void LLJILLL(int i) {
        C786410Ut5.LJJZZIII(this.LLILLL, new ARunnableS31S0101000_20(i, this, 37));
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public void mute(boolean z) {
        C786410Ut5.LJJZZIII(this.LLILLL, new ARunnableS39S0110000_20(this, z, 28));
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public void setVolume(double d) {
        C1268570j7H c1268570j7H = this.LLILZIL;
        if (c1268570j7H != null) {
            c1268570j7H.setVolume(d);
        }
    }

    public void LJJJJLI(int i, Exception exc) {
        this.LLJI = 2;
        InterfaceC1268590j7J interfaceC1268590j7J = this.LLIZLLLIL;
        if (interfaceC1268590j7J != null) {
            interfaceC1268590j7J.LJJJJLI(i, exc);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAudioCaptureError,code:");
        sbLIZ.append(i);
        sbLIZ.append(",");
        sbLIZ.append(this);
        AVLog.logKibana(5, "LiveStreamAudioCapture", C2188811AlT.LIZIZ(sbLIZ), exc);
    }

    public C1268560j7G(int i, int i2, InterfaceC1268590j7J interfaceC1268590j7J, int i3) {
        this.LL = i2;
        this.LLILLL = null;
        this.LLIZLLLIL = interfaceC1268590j7J;
        setMode(i);
        this.LLILLJJLI = i3;
        SafeHandlerThread safeHandlerThreadLIZIZ = C1273730jFb.LIZIZ(0, "LiveStreamAudioCapture");
        this.LLJ = safeHandlerThreadLIZIZ;
        safeHandlerThreadLIZIZ.start();
        this.LLILLL = this.LLJ.getHandler();
    }

    public void LLIZLLLIL(WrapperNativeAudioBuffer wrapperNativeAudioBuffer, int i, int i2, int i3, long j) {
        synchronized (this.LLJILJILJ) {
            try {
                nativeOnData(wrapperNativeAudioBuffer, i, i2, i3, j);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void onData(Buffer buffer, int i, int i2, int i3, long j) {
        synchronized (this.LLJILJILJ) {
            try {
                if (buffer.isDirect()) {
                    nativeOnData(buffer, i, i2, i3, j);
                } else {
                    throw new AndroidRuntimeException("A direct ByteBuffer is needed.");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}

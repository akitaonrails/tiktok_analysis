package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS31S0101000_20;
import Y.ARunnableS39S0110000_20;
import Y.ARunnableS89S0200000_20;
import android.media.AudioManager;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.buffer.WrapperNativeAudioBuffer;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import java.nio.Buffer;

/* JADX INFO: renamed from: X.0j7F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1268550j7F extends C1268560j7G {
    public static final String LLJJIJIIJIL = C1268550j7F.class.getSimpleName();
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;

    @Override // X.C1268560j7G
    public final int LL() {
        return 5;
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public final int getMode() {
        return 1;
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public final boolean isMute() {
        boolean[] zArr = {false};
        C1283100jUi.LIZIZ(this.LLILLL, new ARunnableS89S0200000_20(this, zArr, 239));
        return zArr[0];
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public final void pause() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        X.C786410Ut5.u3().interrupt();
     */
    @Override // X.C1268560j7G, com.ss.ttlivestreamer.core.capture.audio.AudioCapturer, com.ss.ttlivestreamer.core.engine.AudioSource, com.ss.ttlivestreamer.core.engine.NativeObject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void release() {
        /*
            r14 = this;
            monitor-enter(r14)
            java.lang.String r2 = X.C1268550j7F.LLJJIJIIJIL     // Catch: java.lang.Throwable -> Lb4
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r0 = "release this "
            r1.append(r0)     // Catch: java.lang.Throwable -> Lb4
            r1.append(r14)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> Lb4
            com.ss.ttlivestreamer.core.utils.AVLog.iod(r2, r0)     // Catch: java.lang.Throwable -> Lb4
            boolean r0 = r14.LLJJIJI     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto L2f
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r0 = "LiveStreamAudioCapture already released."
            r1.append(r0)     // Catch: java.lang.Throwable -> Lb4
            r1.append(r14)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> Lb4
            com.ss.ttlivestreamer.core.utils.AVLog.e(r2, r0)     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r14)
            return
        L2f:
            r1 = 1
            r14.LLJJIJI = r1     // Catch: java.lang.Throwable -> Lb4
            r14.stop()     // Catch: java.lang.Throwable -> Lb4
            r0 = 0
            r14.LLIZLLLIL = r0     // Catch: java.lang.Throwable -> Lb4
            long[] r4 = new long[r1]     // Catch: java.lang.Throwable -> Lb4
            r5 = -1
            r13 = 0
            r4[r13] = r5     // Catch: java.lang.Throwable -> Lb4
            android.os.Handler r2 = r14.LLILLL     // Catch: java.lang.Throwable -> Lb4
            java.util.concurrent.CountDownLatch r10 = new java.util.concurrent.CountDownLatch     // Catch: java.lang.Throwable -> Lb4
            r10.<init>(r1)     // Catch: java.lang.Throwable -> Lb4
            Y.ARunnableS103S0100000_3 r1 = new Y.ARunnableS103S0100000_3     // Catch: java.lang.Throwable -> Lb4
            r0 = 61
            r1.<init>(r10, r0)     // Catch: java.lang.Throwable -> Lb4
            boolean r0 = X.C786410Ut5.LJJZZIII(r2, r1)     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto L89
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Lb4
            r8 = 3000(0xbb8, double:1.482E-320)
            r7 = 0
            r2 = 3000(0xbb8, double:1.482E-320)
        L5c:
            r5 = 0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L65 java.lang.Throwable -> Lb4
            boolean r1 = r10.await(r2, r0)     // Catch: java.lang.InterruptedException -> L65 java.lang.Throwable -> Lb4
            goto L77
        L65:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lb4
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Lb4
            long r0 = r0 - r11
            long r2 = r8 - r0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 > 0) goto L75
            goto L7a
        L75:
            r7 = 1
            goto L5c
        L77:
            if (r7 == 0) goto L82
            goto L7b
        L7a:
            r1 = 0
        L7b:
            java.lang.Thread r0 = X.C786410Ut5.u3()     // Catch: java.lang.Throwable -> Lb4
            r0.interrupt()     // Catch: java.lang.Throwable -> Lb4
        L82:
            if (r1 == 0) goto L87
            r5 = 0
            goto L89
        L87:
            r5 = 3000(0xbb8, double:1.482E-320)
        L89:
            r4[r13] = r5     // Catch: java.lang.Throwable -> Lb4
            com.ss.ttlivestreamer.core.utils.SafeHandlerThread r0 = r14.LLJ     // Catch: java.lang.Throwable -> Lb4
            X.C1273730jFb.LIZLLL(r0)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r3 = X.C1268550j7F.LLJJIJIIJIL     // Catch: java.lang.Throwable -> Lb4
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r0 = "release this "
            r2.append(r0)     // Catch: java.lang.Throwable -> Lb4
            r2.append(r14)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r0 = " done, ret "
            r2.append(r0)     // Catch: java.lang.Throwable -> Lb4
            r0 = r4[r13]     // Catch: java.lang.Throwable -> Lb4
            r2.append(r0)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)     // Catch: java.lang.Throwable -> Lb4
            com.ss.ttlivestreamer.core.utils.AVLog.iod(r3, r0)     // Catch: java.lang.Throwable -> Lb4
            r14.LLJILJILJ()     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r14)
            return
        Lb4:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1268550j7F.release():void");
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public final void resume() {
    }

    @Override // X.C1268560j7G, com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public final synchronized void start() {
        C786410Ut5.LJJZZIII(this.LLILLL, new ARunnableS120S0100000_20(this, 437));
    }

    @Override // X.C1268560j7G, com.ss.ttlivestreamer.core.engine.MediaSource
    public final int status() {
        return 1;
    }

    @Override // X.C1268560j7G, com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public final synchronized void stop() {
        C786410Ut5.LJJZZIII(this.LLILLL, new ARunnableS120S0100000_20(this, 438));
    }

    @Override // X.C1268560j7G
    public final void LLJJ() {
        C786410Ut5.LJJZZIII(this.LLILLL, new ARunnableS120S0100000_20(this, 435));
    }

    @Override // X.C1268560j7G
    public final void LLJJI() {
        C786410Ut5.LJJZZIII(this.LLILLL, new ARunnableS120S0100000_20(this, 436));
    }

    @Override // X.C1268560j7G, com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public final int updateChannel() {
        return this.mADM.getParameter().getInt("audio_channels");
    }

    @Override // X.C1268560j7G
    public final void LLJILJIL(AudioManager.AudioRecordingCallback audioRecordingCallback) {
        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("NO Implement.");
        C1274070jG9 c1274070jG9 = C1274080jGA.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LLJJIJIIJIL);
        sbLIZ.append(".registerAudioRecordingCallback");
        c1274070jG9.LIZ(C2188811AlT.LIZIZ(sbLIZ), androidRuntimeException);
    }

    @Override // X.C1268560j7G
    public final void LLJILLL(int i) {
        C786410Ut5.LJJZZIII(this.LLILLL, new ARunnableS31S0101000_20(i, this, 39));
    }

    @Override // X.C1268560j7G, com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public final void mute(boolean z) {
        C786410Ut5.LJJZZIII(this.LLILLL, new ARunnableS39S0110000_20(this, z, 29));
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public final void setAudioQuantizeGapPeriod(long j) {
        AudioDeviceModule audioDeviceModule = this.mADM;
        if (audioDeviceModule != null) {
            TEBundle parameter = audioDeviceModule.getParameter();
            parameter.setInt("adm_audio_record_power_gap_ms", (int) j);
            audioDeviceModule.setParameter(parameter);
        }
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public final void setMode(int i) {
        String str = LLJJIJIIJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Ignore switch mode(");
        sbLIZ.append(i);
        sbLIZ.append(") on ADM mode.");
        AVLog.iow(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C1268560j7G, com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public final void setVolume(double d) {
        AudioDeviceModule audioDeviceModule = this.mADM;
        if (audioDeviceModule != null) {
            audioDeviceModule.setMicVolume((float) d);
        }
    }

    @Override // X.C1268560j7G
    public final void unRegisterAudioRecordingCallback(AudioManager.AudioRecordingCallback audioRecordingCallback) {
        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("NO Implement.");
        C1274070jG9 c1274070jG9 = C1274080jGA.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LLJJIJIIJIL);
        sbLIZ.append(".unRegisterAudioRecordingCallback");
        c1274070jG9.LIZ(C2188811AlT.LIZIZ(sbLIZ), androidRuntimeException);
    }

    @Override // X.C1268560j7G, X.InterfaceC1268590j7J
    public final void LJJJJLI(int i, Exception exc) {
        InterfaceC1268590j7J interfaceC1268590j7J = this.LLIZLLLIL;
        if (interfaceC1268590j7J != null) {
            interfaceC1268590j7J.LJJJJLI(i, exc);
        }
        String str = LLJJIJIIJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAudioCaptureError,code:");
        sbLIZ.append(i);
        sbLIZ.append(",");
        sbLIZ.append(this);
        AVLog.logKibana(5, str, C2188811AlT.LIZIZ(sbLIZ), exc);
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public final void setOutputFormat(int i, int i2, int i3) {
        nativeAdaptedOutputFormat(i, i2, i3);
    }

    public C1268550j7F(int i, int i2, InterfaceC1268590j7J interfaceC1268590j7J, int i3, AudioDeviceModule audioDeviceModule) {
        super(i, i2, interfaceC1268590j7J, i3);
        this.mADM = audioDeviceModule;
        String str = LLJJIJIIJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Create LiveStreamAudioCaptureFromADM with bgmMode ");
        sbLIZ.append(i3);
        sbLIZ.append(" source ");
        sbLIZ.append(5);
        sbLIZ.append(" this ");
        sbLIZ.append(this);
        AVLog.iod(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C1268560j7G
    public final void LLIZLLLIL(WrapperNativeAudioBuffer wrapperNativeAudioBuffer, int i, int i2, int i3, long j) {
        throw new AndroidRuntimeException("Not should be here.");
    }

    @Override // X.C1268560j7G
    public final void onData(Buffer buffer, int i, int i2, int i3, long j) {
        throw new AndroidRuntimeException("Not should be here.");
    }
}

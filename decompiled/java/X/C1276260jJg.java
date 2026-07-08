package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS24S1200000_20;
import Y.ARunnableS89S0200000_20;
import android.os.Handler;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.player.NativeRenderObserver;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.nio.Buffer;

/* JADX INFO: renamed from: X.0jJg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1276260jJg extends AbstractC765580U1k implements AudioDeviceModule.RenderObserver {
    public final Handler LLILLJJLI;
    public final InterfaceC1268640j7O LLILZ;
    public AudioDeviceModule LLILZIL;
    public AudioDeviceModule.AudioRenderSink LLILZLL;
    public boolean LLIZ;
    public InterfaceC765600U1m LLJIJIL;
    public AbstractC768410UCh LLJILJIL;
    public boolean LLJILJILJ;
    public NativeRenderObserver LLJILLL;
    public final boolean LLJJ;
    public volatile boolean LLJJI;
    public float LLIZLLLIL = 0.75f;
    public float LLJ = 0.75f;
    public float LLJI = 0.75f;
    public final boolean LLILLL = true;

    @Override // X.AbstractC765540U1g
    public final void LLIZ() {
    }

    @Override // X.AbstractC765540U1g
    public final void LLIZLLLIL() {
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioDeviceModule.RenderObserver
    public final void onStopped() {
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public final synchronized void release() {
        ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 176);
        if (!this.LLJJ) {
            aRunnableS120S0100000_20.run();
        } else if (!this.LLJJI) {
            if (C786410Ut5.u3() == this.LLILLJJLI.getLooper().getThread()) {
                aRunnableS120S0100000_20.run();
            } else {
                C786410Ut5.LJJZZIII(this.LLILLJJLI, new ARunnableS89S0200000_20(aRunnableS120S0100000_20, this, 112));
            }
        }
    }

    @Override // X.AbstractC765580U1k
    public final AbstractC768410UCh LLJJJ() {
        InterfaceC1268640j7O interfaceC1268640j7O;
        AudioDeviceModule audioDeviceModule = this.LLILZIL;
        if (this.LLJILJIL == null && (interfaceC1268640j7O = this.LLILZ) != null && interfaceC1268640j7O.isValid()) {
            this.LLJILJIL = this.LLILZ.LLD(audioDeviceModule);
        }
        AbstractC768410UCh abstractC768410UCh = this.LLJILJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Have audio strange voice ");
        sbLIZ.append(abstractC768410UCh != null ? abstractC768410UCh.toString() : "false");
        AVLog.iod("LiveCoreKaraokFilterV2", C2188811AlT.LIZIZ(sbLIZ));
        return this.LLJILJIL;
    }

    @Override // X.AbstractC765540U1g
    public final void initEarMonitor() {
        AudioDeviceModule audioDeviceModule = this.LLILZIL;
        if (audioDeviceModule != null) {
            audioDeviceModule.initEarMonitor();
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioDeviceModule.RenderObserver
    public final void onBegin() {
        AVLog.i("LiveCoreKaraokFilterV2", "java onBegin");
        InterfaceC765600U1m interfaceC765600U1m = this.LLJIJIL;
        if (interfaceC765600U1m != null) {
            interfaceC765600U1m.start();
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioDeviceModule.RenderObserver
    public final void onCompletion() {
        AVLog.i("LiveCoreKaraokFilterV2", "java onCompletion");
        InterfaceC765600U1m interfaceC765600U1m = this.LLJIJIL;
        if (interfaceC765600U1m != null) {
            interfaceC765600U1m.stop();
        }
    }

    @Override // X.AbstractC765540U1g
    public final void pause() {
        AudioDeviceModule.AudioRenderSink audioRenderSink = this.LLILZLL;
        if (audioRenderSink != null) {
            audioRenderSink.pause();
        }
    }

    @Override // X.AbstractC765540U1g
    public final void resume() {
        AudioDeviceModule.AudioRenderSink audioRenderSink = this.LLILZLL;
        if (audioRenderSink != null) {
            audioRenderSink.resume();
        }
    }

    @Override // X.AbstractC765540U1g
    public final void LLJILJILJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudioFading enable:");
        sbLIZ.append(true);
        AVLog.ioi("LiveCoreKaraokFilterV2", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC765540U1g
    public final void LLJJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setLoopEnable, enable = ");
        sbLIZ.append(false);
        AVLog.logKibana(4, "LiveCoreKaraokFilterV2", C2188811AlT.LIZIZ(sbLIZ), null);
        AudioDeviceModule.AudioRenderSink audioRenderSink = this.LLILZLL;
        if (audioRenderSink != null) {
            audioRenderSink.LLJI(1);
        }
    }

    public static /* synthetic */ void LLJJJJ(C1276260jJg c1276260jJg) {
        c1276260jJg.getClass();
        C1C7U.LIZ("LiveCoreKaraokFilterV2@ff9f.release$1L");
        c1276260jJg.LLJJI = true;
        AVLog.iod("LiveCoreKaraokFilterV2", "release karaoke.");
        c1276260jJg.setEnable(false);
        AbstractC768410UCh abstractC768410UCh = c1276260jJg.LLJILJIL;
        if (abstractC768410UCh != null) {
            abstractC768410UCh.release();
            c1276260jJg.LLJILJIL = null;
        }
        AudioDeviceModule.AudioRenderSink audioRenderSink = c1276260jJg.LLILZLL;
        if (audioRenderSink != null) {
            audioRenderSink.LLJILJILJ(null);
            c1276260jJg.LLILZLL.release();
            c1276260jJg.LLILZLL = null;
        }
        NativeRenderObserver nativeRenderObserver = c1276260jJg.LLJILLL;
        if (nativeRenderObserver != null) {
            nativeRenderObserver.release();
            c1276260jJg.LLJILLL = null;
        }
        c1276260jJg.LLILZIL = null;
        super.release();
        C1C7U.LIZIZ("LiveCoreKaraokFilterV2@ff9f.release$1L");
    }

    @Override // X.AbstractC765540U1g
    public final void LLJ(String str) {
        LLJI(str, null);
    }

    @Override // X.AbstractC765540U1g
    public final void LLJIJIL(InterfaceC765610U1n interfaceC765610U1n) {
        this.LLJIJIL = interfaceC765610U1n;
    }

    @Override // X.AbstractC765540U1g
    public final void LLJILJIL(float f) {
        this.LLIZLLLIL = f;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setBGMVolume: ");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", transfer volume: ");
        sbLIZ.append(f);
        AVLog.logKibana(5, "LiveCoreKaraokFilterV2", C2188811AlT.LIZIZ(sbLIZ), null);
        AudioDeviceModule.AudioRenderSink audioRenderSink = this.LLILZLL;
        if (audioRenderSink != null) {
            audioRenderSink.LLJJ(f);
        }
    }

    @Override // X.AbstractC765540U1g
    public final void LLJILLL(boolean z) {
        AudioDeviceModule audioDeviceModule = this.LLILZIL;
        if (z) {
            float f = this.LLJ;
            this.LLJ = f;
            if (audioDeviceModule != null) {
                audioDeviceModule.setHardwareEarMonitorVolume(f);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EnableHardwareEarMonitoring, volume = ");
            sbLIZ.append(this.LLJ);
            AVLog.logKibana(4, "LiveCoreKaraokFilterV2", C2188811AlT.LIZIZ(sbLIZ), null);
        }
        if (audioDeviceModule != null) {
            audioDeviceModule.enableHardwareEchoMode(z);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("setHardwareEchoMode ");
        sbLIZ2.append(z);
        AVLog.iod("LiveCoreKaraokFilterV2", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.AbstractC765540U1g
    public final void LLJJI(boolean z) {
        long j;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" setMixerEnable: ");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(" -> ");
        sbLIZ.append(z);
        AVLog.iod("LiveCoreKaraokFilterV2", C2188811AlT.LIZIZ(sbLIZ));
        this.LLIZ = z;
        AudioDeviceModule.AudioRenderSink audioRenderSink = this.LLILZLL;
        if (audioRenderSink != null) {
            if (z) {
                j = 1;
            } else {
                j = 0;
            }
            audioRenderSink.LLJILJIL(j);
        }
    }

    @Override // X.AbstractC765540U1g
    public final void LLJJIII(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setOriginEnable, enable = ");
        sbLIZ.append(z);
        AVLog.logKibana(4, "LiveCoreKaraokFilterV2", C2188811AlT.LIZIZ(sbLIZ), null);
        AudioDeviceModule.AudioRenderSink audioRenderSink = this.LLILZLL;
        if (audioRenderSink != null) {
            audioRenderSink.LLIZ(z);
        }
    }

    @Override // X.AbstractC765540U1g
    public final void LLJJIJI(boolean z) {
        AudioDeviceModule audioDeviceModule = this.LLILZIL;
        if (z) {
            float f = this.LLJ;
            if (audioDeviceModule != null) {
                audioDeviceModule.setSoftwareEarMonitorVolume(f);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EnableSoftwareEarMonitoring, volume = ");
            sbLIZ.append(this.LLJ);
            AVLog.logKibana(4, "LiveCoreKaraokFilterV2", C2188811AlT.LIZIZ(sbLIZ), null);
        }
        if (audioDeviceModule != null) {
            audioDeviceModule.enableSoftwareEchoMode(z);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("setSoftwareEchoMode ");
        sbLIZ2.append(z);
        AVLog.iod("LiveCoreKaraokFilterV2", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.AbstractC765540U1g
    public final void LLJJIJIIJIL(String str) {
        AudioDeviceModule audioDeviceModule = this.LLILZIL;
        if (audioDeviceModule != null) {
            C786410Ut5.LJJZZIII(this.LLILLJJLI, new ARunnableS24S1200000_20(this, str, audioDeviceModule, 10));
        }
    }

    @Override // X.AbstractC765540U1g
    public final void LLJJIJIL(float f) {
        this.LLJI = f;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setVoiceVolume: ");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(", transfer volume: ");
        sbLIZ.append(f);
        AVLog.logKibana(5, "LiveCoreKaraokFilterV2", C2188811AlT.LIZIZ(sbLIZ), null);
        AudioDeviceModule audioDeviceModule = this.LLILZIL;
        if (audioDeviceModule != null) {
            audioDeviceModule.setMicVolume(f);
        }
    }

    @Override // X.AbstractC765580U1k
    public final void LLJJJIL(double d) {
        if (!this.LLILLL) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setPitchShift: ");
        sbLIZ.append(d);
        AVLog.logKibana(4, "LiveCoreKaraokFilterV2", C2188811AlT.LIZIZ(sbLIZ), null);
        AudioDeviceModule.AudioRenderSink audioRenderSink = this.LLILZLL;
        if (audioRenderSink != null) {
            audioRenderSink.LLJIJIL((float) d);
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioDeviceModule.RenderObserver
    public final void onError(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("java onError: ");
        sbLIZ.append(i);
        AVLog.e("LiveCoreKaraokFilterV2", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("err occurs: ");
        sbLIZ2.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        AVLog.logKibana(6, "LiveCoreKaraokFilterV2", strLIZIZ, null);
        InterfaceC765600U1m interfaceC765600U1m = this.LLJIJIL;
        if ((interfaceC765600U1m instanceof InterfaceC765610U1n) && !this.LLJILJILJ) {
            this.LLJILJILJ = true;
            ((InterfaceC765610U1n) interfaceC765600U1m).J(i, new Exception(strLIZIZ));
        }
    }

    @Override // X.AbstractC765580U1k
    public final void setEnable(boolean z) {
        this.LL = z;
        AudioDeviceModule audioDeviceModule = this.LLILZIL;
        if (audioDeviceModule != null) {
            audioDeviceModule.enableApmProcess(z);
        }
        if (z) {
            LLJJIJIL(this.LLJI);
        } else {
            if (audioDeviceModule != null) {
                audioDeviceModule.setMicVolume(1.0f);
            }
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.LLILZLL;
            if (audioRenderSink != null) {
                audioRenderSink.stop();
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setEnable ");
        sbLIZ.append(z);
        sbLIZ.append(" adm ");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(" voice ");
        sbLIZ.append(this.LLJI);
        AVLog.iod("LiveCoreKaraokFilterV2", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC765540U1g
    public final void LLJI(String str, String str2) {
        if (this.LLILZLL != null) {
            if (str != null && str.endsWith("audio_dummy")) {
                str = null;
            }
            if (str2 != null && str2.endsWith("audio_dummy")) {
                str2 = null;
            }
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.LLILZLL;
            audioRenderSink.getClass();
            RunnableC1276280jJi runnableC1276280jJi = new RunnableC1276280jJi(audioRenderSink, str, str2);
            if (audioRenderSink.LLILZ) {
                audioRenderSink.LLIZLLLIL(audioRenderSink.LL, runnableC1276280jJi);
            } else {
                runnableC1276280jJi.run();
            }
            if (this.LLJILLL == null) {
                this.LLJILLL = new NativeRenderObserver(this);
            }
            this.LLILZLL.LLJILJILJ(this.LLJILLL);
            this.LLILZLL.start();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setBGMFile: ");
        sbLIZ.append(str);
        sbLIZ.append(" origin: ");
        sbLIZ.append(str2);
        sbLIZ.append(", startms: ");
        sbLIZ.append(0L);
        AVLog.iod("LiveCoreKaraokFilterV2", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioDeviceModule.RenderObserver
    public final void onProgress(long j, int i) {
        InterfaceC765600U1m interfaceC765600U1m = this.LLJIJIL;
        if (interfaceC765600U1m != null) {
            interfaceC765600U1m.onProgress(j);
        }
    }

    public C1276260jJg(AudioDeviceModule audioDeviceModule, Handler handler, C1269160j8E c1269160j8E, InterfaceC1268640j7O interfaceC1268640j7O, boolean z) {
        this.LLILZIL = audioDeviceModule;
        this.LLJJ = z;
        ARunnableS89S0200000_20 aRunnableS89S0200000_20 = new ARunnableS89S0200000_20(audioDeviceModule, this, 110);
        if (z) {
            C786410Ut5.LJJZZIII(handler, aRunnableS89S0200000_20);
        } else {
            aRunnableS89S0200000_20.run();
        }
        this.LLILLJJLI = handler;
        this.LLILZ = interfaceC1268640j7O;
        LLJJI(this.LLIZ);
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioProcessor
    public final synchronized Buffer process(Buffer buffer, int i, int i2, int i3, long j) {
        return buffer;
    }
}

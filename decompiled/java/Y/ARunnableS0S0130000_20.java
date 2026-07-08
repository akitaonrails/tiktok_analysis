package Y;

import X.C1272090jCx;
import X.C1272130jD1;
import X.C1C7U;
import X.C2188811AlT;
import X.InterfaceC1268820j7g;
import X.InterfaceC1272120jD0;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.utils.AVLog;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS0S0130000_20 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;
    public boolean z2;
    public boolean z3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        AudioDeviceModule.AudioRenderSink effectAudioRender;
        AudioDeviceModule.AudioRenderSink effectAudioRender2;
        AudioDeviceModule.AudioRenderSink effectAudioRender3;
        C1272090jCx c1272090jCx = (C1272090jCx) this.l0;
        if (c1272090jCx.LLLLZLLLI != null && c1272090jCx.LLLZI != 3 && c1272090jCx.isValid()) {
            ((C1272090jCx) this.l0).LLJJIJIIJIL.setEffectAudioGraphCfg(this.z1, this.z2, this.z3);
            synchronized (((C1272090jCx) this.l0).LLIZ) {
                try {
                    if (this.z3) {
                        C1272090jCx c1272090jCx2 = (C1272090jCx) this.l0;
                        if (!c1272090jCx2.LLLIZZ && (effectAudioRender3 = c1272090jCx2.LLJJIJIIJIL.getEffectAudioRender()) != null) {
                            effectAudioRender3.LLJILJIL(1L);
                            effectAudioRender3.start();
                            AVLog.logKibana(5, "FilterManager", "setupAudioGraphStickerContext sink.start", null);
                            ((C1272090jCx) this.l0).LLLIZZ = true;
                        }
                    } else {
                        C1272090jCx c1272090jCx3 = (C1272090jCx) this.l0;
                        if (c1272090jCx3.LLLIZZ && (effectAudioRender2 = c1272090jCx3.LLJJIJIIJIL.getEffectAudioRender()) != null) {
                            effectAudioRender2.stop();
                            AVLog.logKibana(5, "FilterManager", "setupAudioGraphStickerContext sink.stop", null);
                            ((C1272090jCx) this.l0).LLLIZZ = false;
                        }
                    }
                } finally {
                }
            }
        }
        C1272090jCx c1272090jCx4 = (C1272090jCx) this.l0;
        if (!c1272090jCx4.LLLILZLLLI && c1272090jCx4.isValid()) {
            C1272090jCx c1272090jCx5 = (C1272090jCx) this.l0;
            c1272090jCx5.LLLIZZ = this.z3;
            int iEnableEffectAudio = c1272090jCx5.LLLLJ ? c1272090jCx5.LLJJIJIIJIL.enableEffectAudio() : c1272090jCx5.LLJJIJIIJIL.setupEffectAudioHandler();
            if (iEnableEffectAudio != 0) {
                ((C1272090jCx) this.l0).LLJZIJLIL.onError(iEnableEffectAudio, "");
            }
            synchronized (((C1272090jCx) this.l0).LLIZ) {
                try {
                    C1272090jCx c1272090jCx6 = (C1272090jCx) this.l0;
                    c1272090jCx6.LLLILZLLLI = true;
                    if ((c1272090jCx6.LLLLZLLLI == null || c1272090jCx6.LLLZI == 3) && (effectAudioRender = c1272090jCx6.LLJJIJIIJIL.getEffectAudioRender()) != null && ((C1272090jCx) this.l0).LLLIZZ) {
                        effectAudioRender.LLJILJIL(1L);
                        effectAudioRender.start();
                    }
                    AVLog.logKibana(5, "FilterManager", "mEnalbeAudioGraphSticker is set to true in setupAudioGraphStickerContext", null);
                } finally {
                }
            }
            AudioDeviceModule audioDeviceModule = ((C1272090jCx) this.l0).LLIZLLLIL;
            if (audioDeviceModule != null) {
                audioDeviceModule.enableAsyncProcess(true);
            }
            ((C1272090jCx) this.l0).LLJJIJIIJIL.effectAudioSetPlaybackDeviceType(2);
            C1272090jCx c1272090jCx7 = (C1272090jCx) this.l0;
            if (c1272090jCx7.LLLLZLLLI == null || c1272090jCx7.LLLZI == 3) {
                c1272090jCx7.LLJJIJIIJIL.setEffectAudioGraphCfg(this.z1, this.z2, this.z3);
            }
            C1272090jCx c1272090jCx8 = (C1272090jCx) this.l0;
            if (c1272090jCx8.LLLIZZ) {
                InterfaceC1268820j7g interfaceC1268820j7g = c1272090jCx8.LLJLLIL;
                if (interfaceC1268820j7g == null || interfaceC1268820j7g.LIZJ() == null) {
                    return;
                }
                ((C1272090jCx) this.l0).LLJLLIL.LIZJ().setEnable(true);
                return;
            }
            InterfaceC1268820j7g interfaceC1268820j7g2 = c1272090jCx8.LLJLLIL;
            if (interfaceC1268820j7g2 == null || interfaceC1268820j7g2.LIZJ() == null) {
                return;
            }
            ((C1272090jCx) this.l0).LLJLLIL.LIZJ().setEnable(false);
        }
    }

    public static final void run$0(ARunnableS0S0130000_20 aRunnableS0S0130000_20) {
        boolean zLIZ;
        C1C7U.LIZ("FilterManager@d45d.setupAudioGraphStickerContext$1");
        try {
            aRunnableS0S0130000_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FilterManager@d45d.setupAudioGraphStickerContext$1");
    }

    public static final void run$1(ARunnableS0S0130000_20 aRunnableS0S0130000_20) {
        Boolean boolValueOf;
        InterfaceC1272120jD0 interfaceC1272120jD0;
        AudioDeviceModule.AudioRenderSink effectAudioRender;
        InterfaceC1272120jD0 interfaceC1272120jD02;
        AudioDeviceModule.AudioRenderSink effectAudioRender2;
        C1272130jD1 c1272130jD1 = (C1272130jD1) aRunnableS0S0130000_20.l0;
        boolean z = aRunnableS0S0130000_20.z1;
        boolean z2 = aRunnableS0S0130000_20.z2;
        boolean z3 = aRunnableS0S0130000_20.z3;
        C1C7U.LIZ("AudioEffectNode@631.setupAudioGraphStickerContext$1L");
        InterfaceC1272120jD0 interfaceC1272120jD03 = c1272130jD1.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isValid effect:");
        sbLIZ.append(interfaceC1272120jD03);
        sbLIZ.append(" valid:");
        if (interfaceC1272120jD03 != null) {
            boolValueOf = Boolean.valueOf(interfaceC1272120jD03.valid());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (interfaceC1272120jD03 != null && interfaceC1272120jD03.valid()) {
            InterfaceC1272120jD0 interfaceC1272120jD04 = c1272130jD1.LL;
            if (interfaceC1272120jD04 != null) {
                interfaceC1272120jD04.setEffectAudioGraphCfg(z, z2, z3);
            }
            synchronized (c1272130jD1.LLILZIL) {
                try {
                    if (z3) {
                        if (!c1272130jD1.LLILZ && (interfaceC1272120jD0 = c1272130jD1.LL) != null && (effectAudioRender = interfaceC1272120jD0.getEffectAudioRender()) != null) {
                            effectAudioRender.LLJILJIL(1L);
                            effectAudioRender.start();
                            AVLog.logKibana(5, "AudioEffectNode", "setupAudioGraphStickerContext sink.start", null);
                            c1272130jD1.LLILZ = true;
                        }
                    } else if (c1272130jD1.LLILZ && (interfaceC1272120jD02 = c1272130jD1.LL) != null && (effectAudioRender2 = interfaceC1272120jD02.getEffectAudioRender()) != null) {
                        effectAudioRender2.stop();
                        AVLog.logKibana(5, "AudioEffectNode", "setupAudioGraphStickerContext sink.stop", null);
                        c1272130jD1.LLILZ = false;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (!c1272130jD1.LLILLL) {
                c1272130jD1.LLILZ = z3;
                InterfaceC1272120jD0 interfaceC1272120jD05 = c1272130jD1.LL;
                if (interfaceC1272120jD05 != null) {
                    interfaceC1272120jD05.enableEffectAudio();
                }
                synchronized (c1272130jD1.LLILZIL) {
                    try {
                        c1272130jD1.LLILLL = true;
                        AVLog.logKibana(5, "AudioEffectNode", "enableAudioGraphSticker is set to true in setupAudioGraphStickerContext", null);
                        AudioDeviceModule audioDeviceModule = c1272130jD1.LLILLJJLI;
                        if (audioDeviceModule != null) {
                            audioDeviceModule.enableAsyncProcess(true);
                        }
                        InterfaceC1272120jD0 interfaceC1272120jD06 = c1272130jD1.LL;
                        if (interfaceC1272120jD06 != null) {
                            interfaceC1272120jD06.effectAudioSetPlaybackDeviceType(2);
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
            }
        }
        C1C7U.LIZIZ("AudioEffectNode@631.setupAudioGraphStickerContext$1L");
    }

    public ARunnableS0S0130000_20(Object obj, boolean z, boolean z2, boolean z3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
        this.z2 = z2;
        this.z3 = z3;
    }
}

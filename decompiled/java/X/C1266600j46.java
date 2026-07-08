package X;

import Y.ARunnableS89S0200000_20;
import com.ss.ttlivestreamer.core.engine.AudioTrack;
import com.ss.ttlivestreamer.core.mixer.AudioMixer;

/* JADX INFO: renamed from: X.0j46, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1266600j46 implements InterfaceC1268820j7g, InterfaceC1268590j7J {
    public final InterfaceC1267040j4o LL;
    public AudioMixer.AudioMixerDescription LLILLJJLI = new AudioMixer.AudioMixerDescription();

    @Override // X.InterfaceC1268820j7g
    public final int LIZIZ() {
        return 0;
    }

    @Override // X.InterfaceC1268820j7g
    public final AudioTrack LIZJ() {
        return null;
    }

    @Override // X.InterfaceC1268590j7J
    public final void LJJJJLI(int i, Exception exc) {
    }

    @Override // X.InterfaceC1268820j7g
    public final synchronized void release() {
        InterfaceC1267040j4o interfaceC1267040j4o = this.LL;
        if (interfaceC1267040j4o != null) {
            ((C1266590j45) interfaceC1267040j4o).LIZ(this);
        }
    }

    @Override // X.InterfaceC1268820j7g
    public final int start() {
        return 0;
    }

    @Override // X.InterfaceC1268820j7g
    public final int stop() {
        return 0;
    }

    @Override // X.InterfaceC1268820j7g
    public final AudioMixer.AudioMixerDescription LIZ() {
        return this.LLILLJJLI;
    }

    public C1266600j46(C1266590j45 c1266590j45) {
        this.LL = c1266590j45;
    }

    @Override // X.InterfaceC1268820j7g
    public final void LIZLLL(AudioMixer.AudioMixerDescription audioMixerDescription) {
        this.LLILLJJLI = audioMixerDescription;
        InterfaceC1267040j4o interfaceC1267040j4o = this.LL;
        if (interfaceC1267040j4o != null) {
            C1266590j45 c1266590j45 = (C1266590j45) interfaceC1267040j4o;
            C786410Ut5.LJJZZIII(c1266590j45.LIZ.LL, new ARunnableS89S0200000_20(c1266590j45, this, 210));
        }
    }
}

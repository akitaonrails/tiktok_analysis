package X;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.player.sdk.audio.SimAudioFocusManager$checkStart$1;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0odV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1480750odV {
    public static boolean LJIILIIL;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJI;
    public boolean LJII;
    public InterfaceC1480720odS LJIIJJI;
    public float LIZ = -1.0f;
    public float LIZIZ = -1.0f;
    public float LJ = 1.0f;
    public final C1484570ojf LJFF = C1484570ojf.LJIIJ.getValue();
    public final C1480760odW LJIIIIZZ = new InterfaceC1024730clz() { // from class: X.0odW
        @Override // X.InterfaceC1024730clz
        public final boolean LIZ() {
            return this.LIZ.LJI;
        }

        @Override // X.InterfaceC1024730clz
        public final void LIZIZ() {
            InterfaceC1480710odR interfaceC1480710odRLJ;
            this.LIZ.getClass();
            C1480750odV.LJIILIIL = C1474810oTv.LJJIJIIJIL() && C1480850odf.LIZJ.getAutoAudioFocus();
            InterfaceC1480720odS interfaceC1480720odS = this.LIZ.LJIIJJI;
            if (interfaceC1480720odS == null || (interfaceC1480710odRLJ = interfaceC1480720odS.LJ()) == null) {
                return;
            }
            if (interfaceC1480710odRLJ.isPlaying() || interfaceC1480710odRLJ.isLoading()) {
                this.LIZ.LIZLLL();
            }
        }

        @Override // X.InterfaceC1024730clz
        public final void onWindowFocusChanged(boolean z) {
            InterfaceC1480710odR interfaceC1480710odRLJ;
            InterfaceC1480720odS interfaceC1480720odS = this.LIZ.LJIIJJI;
            if (interfaceC1480720odS != null) {
                interfaceC1480710odRLJ = interfaceC1480720odS.LJ();
            } else {
                interfaceC1480710odRLJ = null;
            }
            if (z && interfaceC1480710odRLJ != null) {
                if (interfaceC1480710odRLJ.isPlaying() || interfaceC1480710odRLJ.isLoading()) {
                    this.LIZ.LIZLLL();
                }
            }
        }
    };
    public final WeakReference<InterfaceC1024730clz> LJIIIZ = new WeakReference<>(this.LJIIIIZZ);
    public final BPEAHandler LJIIJ = new BPEAHandler(Looper.getMainLooper());
    public final C1480740odU LJIIL = new InterfaceC1484620ojk() { // from class: X.0odU
        @Override // X.InterfaceC1484620ojk
        public final void LIZ(boolean z, boolean z2) {
            InterfaceC1480710odR interfaceC1480710odRLJ;
            InterfaceC1480710odR interfaceC1480710odRLJ2;
            float fLJIIJ = -1.0f;
            InterfaceC1480710odR interfaceC1480710odRLJ3 = null;
            if (z) {
                C1480750odV c1480750odV = this.LIZ;
                c1480750odV.LJI = true;
                if (C1480750odV.LJIILIIL && !c1480750odV.LIZJ && c1480750odV.LIZLLL && c1480750odV.LIZ > 0.0f) {
                    InterfaceC1480720odS interfaceC1480720odS = c1480750odV.LJIIJJI;
                    if (interfaceC1480720odS != null && (interfaceC1480710odRLJ2 = interfaceC1480720odS.LJ()) != null) {
                        float f = c1480750odV.LIZ;
                        interfaceC1480710odRLJ2.LJIILLIIL(f, f);
                    }
                    c1480750odV.LIZIZ = -1.0f;
                    return;
                }
                return;
            }
            C1480750odV c1480750odV2 = this.LIZ;
            c1480750odV2.LJI = false;
            if (!C1480750odV.LJIILIIL || c1480750odV2.LIZJ || !c1480750odV2.LIZLLL || c1480750odV2.LIZIZ >= 0.0f) {
                return;
            }
            InterfaceC1480720odS interfaceC1480720odS2 = c1480750odV2.LJIIJJI;
            if (interfaceC1480720odS2 != null && (interfaceC1480710odRLJ = interfaceC1480720odS2.LJ()) != null) {
                fLJIIJ = interfaceC1480710odRLJ.LJIIJ();
                c1480750odV2.LIZ = fLJIIJ;
            }
            c1480750odV2.LIZ = fLJIIJ;
            if (fLJIIJ <= 0.0f) {
                return;
            }
            if (z2 && ((Boolean) C1474810oTv.LJJJJIZL.getValue()).booleanValue()) {
                return;
            }
            InterfaceC1480720odS interfaceC1480720odS3 = c1480750odV2.LJIIJJI;
            if (interfaceC1480720odS3 != null) {
                interfaceC1480710odRLJ3 = interfaceC1480720odS3.LJ();
            }
            float f2 = c1480750odV2.LJ;
            if (f2 < 0.0f || interfaceC1480710odRLJ3 == null) {
                return;
            }
            float f3 = c1480750odV2.LIZ * f2;
            c1480750odV2.LIZIZ = f3;
            interfaceC1480710odRLJ3.LJIILLIIL(f3, f3);
        }
    };

    public final void LIZ() {
        if (!LJIILIIL || this.LIZJ) {
            return;
        }
        C1484570ojf c1484570ojf = this.LJFF;
        C1480740odU c1480740odU = this.LJIIL;
        BPEAHandler bPEAHandler = this.LJIIJ;
        if (c1484570ojf.LIZ == null) {
            HandlerThread handlerThread = new HandlerThread("SimAudioFocusManager");
            handlerThread.start();
            c1484570ojf.LIZ = new SimAudioFocusManager$checkStart$1(c1484570ojf, C786410Ut5.W2(handlerThread));
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.obj = new C1484600oji(2, this, c1480740odU, bPEAHandler);
        C786410Ut5.LJLJJL(c1484570ojf.LIZ, messageObtain);
        this.LJI = false;
        this.LIZ = -1.0f;
        this.LIZIZ = -1.0f;
    }

    public final void LIZLLL() {
        if (!LJIILIIL || this.LIZJ || this.LJI) {
            return;
        }
        this.LJFF.LJIIIIZZ(this, this.LJIIL, this.LJIIJ);
    }

    public final void LIZIZ(boolean z) {
        if (z) {
            if (!this.LJII) {
                InterfaceC1024740cm0 interfaceC1024740cm0 = C1024720cly.LIZ;
                if (interfaceC1024740cm0 != null) {
                    ((CopyOnWriteArrayList) ((C1024750cm1) interfaceC1024740cm0).LIZ).add(this.LJIIIZ);
                }
                this.LJII = true;
                return;
            }
            return;
        }
        if (!this.LJII) {
            return;
        }
        InterfaceC1024740cm0 interfaceC1024740cm02 = C1024720cly.LIZ;
        if (interfaceC1024740cm02 != null) {
            ((CopyOnWriteArrayList) ((C1024750cm1) interfaceC1024740cm02).LIZ).remove(this.LJIIIZ);
        }
        this.LJII = false;
    }

    public final void LIZJ(InterfaceC1480720odS interfaceC1480720odS) {
        boolean z;
        if (this.LJIIJJI == null) {
            this.LJIIJJI = interfaceC1480720odS;
            this.LIZLLL = ((Boolean) C1474810oTv.LJJJJI.getValue()).booleanValue();
            this.LJ = ((Number) C1474810oTv.LJJJJJ.getValue()).floatValue();
            if (C1474810oTv.LJJIJIIJIL() && C1480850odf.LIZJ.getAutoAudioFocus()) {
                z = true;
            } else {
                z = false;
            }
            LJIILIIL = z;
            if (C1474810oTv.LJJIJIIJIL()) {
                LIZIZ(true);
            }
        }
    }
}

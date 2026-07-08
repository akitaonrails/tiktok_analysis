package X;

import Y.ARunnableS120S0100000_20;
import android.os.Looper;
import android.view.MotionEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.lynx.react.bridge.ReadableMap;
import j27.s;

/* JADX INFO: renamed from: X.0kEe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1311580kEe extends AbstractC1311530kEZ {
    public long LJI;
    public float LJII;
    public BPEAHandler LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public float LJIIL;
    public C1298740jtw LJIILIIL;
    public boolean LJIILJJIL;
    public final ARunnableS120S0100000_20 LJIILL;

    @Override // X.AbstractC1311530kEZ
    public final void LJIIL() {
        this.LIZIZ = 0;
        this.LJIILJJIL = false;
    }

    @Override // X.AbstractC1311530kEZ
    public final void LIZLLL() {
        super.LIZLLL();
        C1298740jtw c1298740jtw = this.LJIILIIL;
        if (!LJII() || this.LJIILJJIL) {
            return;
        }
        this.LJIILJJIL = true;
        LJIILIIL("onEnd", LJFF(c1298740jtw));
    }

    @Override // X.AbstractC1311530kEZ
    public final void LJ() {
        super.LJ();
        C1298740jtw c1298740jtw = this.LJIILIIL;
        if (!LJII() || this.LJIILJJIL) {
            return;
        }
        this.LJIILJJIL = true;
        LJIILIIL("onEnd", LJFF(c1298740jtw));
    }

    public C1311580kEe(int i, s sVar, C1311420kEO c1311420kEO, InterfaceC1311590kEf interfaceC1311590kEf) {
        super(i, sVar, c1311420kEO, interfaceC1311590kEf);
        this.LJI = 500L;
        this.LJII = C1311130kDv.LIZIZ(10.0f, 0.0f);
        this.LJIIIIZZ = null;
        this.LJIIIZ = 0.0f;
        this.LJIIJ = 0.0f;
        this.LJIIJJI = 0.0f;
        this.LJIIL = 0.0f;
        this.LJIILIIL = null;
        this.LJIILJJIL = false;
        this.LJIILL = new ARunnableS120S0100000_20(this, 253);
        ReadableMap readableMap = c1311420kEO.LJ;
        if (readableMap != null) {
            this.LJI = readableMap.getLong("minDuration", 500L);
            this.LJII = C1311130kDv.LIZIZ(readableMap.getLong("maxDistance", 10L), 0.0f);
        }
    }

    @Override // X.AbstractC1311530kEZ
    public final void LJIIJ(MotionEvent motionEvent, C1298740jtw c1298740jtw, float f, float f2, boolean z, C1311460kES c1311460kES) {
        this.LJIILIIL = c1298740jtw;
        if (motionEvent == null) {
            this.LIZIZ = 6;
            return;
        }
        if (this.LIZIZ >= 3) {
            BPEAHandler bPEAHandler = this.LJIIIIZZ;
            if (bPEAHandler != null) {
                bPEAHandler.removeCallbacksAndMessages(null);
                this.LJIIIIZZ = null;
                return;
            }
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    this.LJIIJJI = motionEvent.getX();
                    this.LJIIL = motionEvent.getY();
                    float fAbs = Math.abs(this.LJIIJJI - this.LJIIIZ);
                    float fAbs2 = Math.abs(this.LJIIL - this.LJIIJ);
                    float f3 = this.LJII;
                    if (fAbs > f3 || fAbs2 > f3) {
                        LJ();
                        BPEAHandler bPEAHandler2 = this.LJIIIIZZ;
                        if (bPEAHandler2 != null) {
                            bPEAHandler2.removeCallbacksAndMessages(null);
                            this.LJIIIIZZ = null;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            BPEAHandler bPEAHandler3 = this.LJIIIIZZ;
            if (bPEAHandler3 != null) {
                bPEAHandler3.removeCallbacksAndMessages(null);
                this.LJIIIIZZ = null;
            }
            LJ();
            return;
        }
        this.LJIIIZ = motionEvent.getX();
        this.LJIIJ = motionEvent.getY();
        this.LJIILJJIL = false;
        LIZIZ();
        if (LJI()) {
            LJIILIIL("onBegin", LJFF(c1298740jtw));
        }
        BPEAHandler bPEAHandler4 = this.LJIIIIZZ;
        if (bPEAHandler4 == null) {
            this.LJIIIIZZ = new BPEAHandler(Looper.getMainLooper());
        } else {
            bPEAHandler4.removeCallbacksAndMessages(null);
        }
        C786410Ut5.LJLIIL(this.LJI, this.LJIIIIZZ, this.LJIILL);
    }
}

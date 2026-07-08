package X;

import android.view.MotionEvent;
import j27.s;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0kEb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1311550kEb extends AbstractC1311530kEZ {
    public final HashMap<String, Object> LJI;
    public float LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public C1298740jtw LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;

    @Override // X.AbstractC1311530kEZ
    public final void LJIIL() {
        this.LIZIZ = 0;
        this.LJIILIIL = false;
        this.LJIILJJIL = false;
        this.LJIILL = false;
    }

    @Override // X.AbstractC1311530kEZ
    public final void LIZLLL() {
        super.LIZLLL();
        LJIILL(this.LJIIL);
    }

    @Override // X.AbstractC1311530kEZ
    public final void LJ() {
        super.LJ();
        LJIILL(this.LJIIL);
    }

    public final HashMap<String, Object> LJIILJJIL(C1298740jtw c1298740jtw) {
        this.LJI.put("scrollX", Integer.valueOf(LJIIJJI(this.LJFF.getMemberScrollX())));
        this.LJI.put("scrollY", Integer.valueOf(LJIIJJI(this.LJFF.getMemberScrollY())));
        this.LJI.put("isAtStart", Boolean.valueOf(this.LJFF.isAtBorder(true)));
        this.LJI.put("isAtEnd", Boolean.valueOf(this.LJFF.isAtBorder(false)));
        this.LJI.putAll(LJFF(c1298740jtw));
        return this.LJI;
    }

    public final void LJIILL(C1298740jtw c1298740jtw) {
        if (LJII() && !this.LJIILL && this.LJIILIIL) {
            this.LJIILL = true;
            LJIILIIL("onEnd", LJIILJJIL(c1298740jtw));
        }
    }

    public C1311550kEb(int i, s sVar, C1311420kEO c1311420kEO, InterfaceC1311590kEf interfaceC1311590kEf) {
        super(i, sVar, c1311420kEO, interfaceC1311590kEf);
        this.LJII = C1311130kDv.LIZIZ(0.0f, 0.0f);
        this.LJIIIIZZ = 0.0f;
        this.LJIIIZ = 0.0f;
        this.LJIIJ = 0.0f;
        this.LJIIJJI = 0.0f;
        this.LJIILIIL = false;
        this.LJIILJJIL = false;
        this.LJIILL = false;
        if (c1311420kEO.LJ != null) {
            this.LJII = C1311130kDv.LIZIZ(r3.getLong("minDistance", 0L), 0.0f);
        }
        this.LJI = new HashMap<>();
    }

    @Override // X.AbstractC1311530kEZ
    public final void LJIIJ(MotionEvent motionEvent, C1298740jtw c1298740jtw, float f, float f2, boolean z, C1311460kES c1311460kES) {
        if (c1298740jtw != null) {
            this.LJIIL = c1298740jtw;
        }
        if (motionEvent == null) {
            this.LIZIZ = 6;
            return;
        }
        if (this.LIZIZ >= 3) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    this.LJIIJ = motionEvent.getX();
                    this.LJIIJJI = motionEvent.getY();
                    if (this.LIZIZ == 0) {
                        LIZIZ();
                        if (!this.LJIILIIL) {
                            this.LJIILIIL = true;
                            if (LJI()) {
                                LJIILIIL("onBegin", LJIILJJIL(c1298740jtw));
                            }
                        }
                    }
                    if (this.LIZIZ < 3) {
                        float fAbs = Math.abs(this.LJIIJ - this.LJIIIIZZ);
                        float fAbs2 = Math.abs(this.LJIIJJI - this.LJIIIZ);
                        float f3 = this.LJII;
                        if (fAbs > f3 || fAbs2 > f3) {
                            LIZ();
                            if (LJIIIIZZ() && !this.LJIILJJIL && this.LJIILIIL) {
                                this.LJIILJJIL = true;
                                LJIILIIL("onStart", LJIILJJIL(c1298740jtw));
                            }
                        }
                    }
                    int i = this.LIZIZ;
                    if (i == 2) {
                        if (LJIIIZ()) {
                            LJIILIIL("onUpdate", LJIILJJIL(c1298740jtw));
                            return;
                        }
                        return;
                    } else {
                        if (i < 3) {
                            return;
                        }
                        LJIILL(c1298740jtw);
                        return;
                    }
                }
                return;
            }
            LJ();
            LJIILL(this.LJIIL);
            return;
        }
        this.LJIIIIZZ = motionEvent.getX();
        this.LJIIIZ = motionEvent.getY();
        this.LJIILL = false;
        LIZIZ();
        if (this.LJIILIIL) {
            return;
        }
        this.LJIILIIL = true;
        if (!LJI()) {
            return;
        }
        LJIILIIL("onBegin", LJIILJJIL(c1298740jtw));
    }
}

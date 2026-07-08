package X;

import Y.ARunnableS124S0100000_24;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.memrelief.gc.WeakRefQueueMonitor;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0rq1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@InterfaceC1294060jmO
public final class C1603830rq1 extends AbstractC1591260rVk {
    public final BPEAHandler LJI;
    public final AtomicBoolean LJII;
    public final ArrayDeque<Float> LJIIIIZZ;
    public int LJIIIZ;
    public long LJIIJ;
    public final AtomicBoolean LJIIJJI;
    public C1603840rq2 LJIIL;
    public boolean LJIILIIL;
    public final ARunnableS124S0100000_24 LJIILJJIL;

    @Override // X.AbstractC1591260rVk
    public final void LIZ() {
        if (this.LJIIJJI.get() && this.LJII.compareAndSet(false, true)) {
            C1603840rq2 c1603840rq2 = this.LJIIL;
            if (c1603840rq2 == null) {
                c1603840rq2 = null;
            }
            this.LJIIJ = c1603840rq2.LIZ;
            C786410Ut5.LJJZZIII(this.LJI, new ARunnableS124S0100000_24(this, 149));
        }
    }

    @Override // X.AbstractC1591260rVk
    public final void LIZIZ() {
        if (this.LJIIJJI.get() && this.LJII.compareAndSet(true, false)) {
            this.LJI.removeCallbacksAndMessages(null);
            C786410Ut5.LJJZZIII(this.LJI, new ARunnableS124S0100000_24(this, 148));
        }
    }

    public final void LIZLLL() {
        C1603840rq2 c1603840rq2 = this.LJIIL;
        if (c1603840rq2 == null) {
            c1603840rq2 = null;
        }
        this.LJIIJ = c1603840rq2.LIZ;
        this.LJIIIIZZ.clear();
        this.LJIIIZ = 0;
        C1603840rq2 c1603840rq22 = this.LJIIL;
        if ((c1603840rq22 != null ? c1603840rq22 : null).LIZLLL <= 0 || !this.LJIILIIL) {
            return;
        }
        WeakRefQueueMonitor.removeGcWatcher(this.LJIILJJIL);
        this.LJIILIIL = false;
    }

    public C1603830rq1() {
        HandlerThread handlerThread = new HandlerThread("JavaPressure");
        handlerThread.start();
        this.LJI = new BPEAHandler(C786410Ut5.W2(handlerThread));
        this.LJII = new AtomicBoolean(false);
        this.LJIIIIZZ = new ArrayDeque<>();
        this.LJIIJJI = new AtomicBoolean(false);
        this.LJIILJJIL = new ARunnableS124S0100000_24(this, 150);
    }

    public static void LIZJ(C1603830rq1 c1603830rq1) {
        C1603840rq2 c1603840rq2;
        C1603840rq2 c1603840rq22;
        float size;
        C09Q3 c09q3;
        C1C7U.LIZ("JavaPressureByPull@2814.checkMemory$2L");
        if (c1603830rq1.LJII.get()) {
            C1603840rq2 c1603840rq23 = c1603830rq1.LJIIL;
            if (c1603840rq23 == null) {
                c1603840rq23 = null;
            }
            if (c1603840rq23.LIZLLL > 0 && !c1603830rq1.LJIILIIL) {
                WeakRefQueueMonitor.addGcWatcher(c1603830rq1.LJIILJJIL);
                c1603830rq1.LJIILIIL = true;
            }
            float fLIZLLL = C2367709Pn.LIZLLL() / C2367709Pn.LJ();
            c1603830rq1.LJIIIIZZ.add(Float.valueOf(fLIZLLL));
            C1603840rq2 c1603840rq24 = c1603830rq1.LJIIL;
            if (c1603840rq24 == null) {
                c1603840rq24 = null;
            }
            c1603840rq24.getClass();
            if (fLIZLLL + 0.001f < c1603830rq1.LIZIZ) {
                c1603830rq1.LIZLLL();
                C09Q3 c09q32 = C09Q3.UNKNOWN;
                if (c09q32 != c1603830rq1.LIZ) {
                    c1603830rq1.LIZ = c09q32;
                    c1603830rq1.LJFF.LIZ(c09q32, null);
                }
            } else {
                C1603840rq2 c1603840rq25 = c1603830rq1.LJIIL;
                if (c1603840rq25 == null) {
                    c1603840rq25 = null;
                }
                c1603830rq1.LJIIJ = c1603840rq25.LIZIZ;
                int size2 = c1603830rq1.LJIIIIZZ.size();
                C1603840rq2 c1603840rq26 = c1603830rq1.LJIIL;
                if (c1603840rq26 == null) {
                    c1603840rq2 = null;
                } else {
                    c1603840rq2 = c1603840rq26;
                }
                if (size2 >= c1603840rq2.LIZJ) {
                    if (c1603840rq26 == null) {
                        c1603840rq22 = null;
                    } else {
                        c1603840rq22 = c1603840rq26;
                    }
                    if (c1603840rq22.LIZLLL > 0) {
                        int i = c1603830rq1.LJIIIZ;
                        if (c1603840rq26 == null) {
                            c1603840rq26 = null;
                        }
                        if (i < c1603840rq26.LIZLLL) {
                            c1603830rq1.LIZLLL();
                            C786410Ut5.LJLIIL(c1603830rq1.LJIIJ, c1603830rq1.LJI, new ARunnableS124S0100000_24(c1603830rq1, 149));
                        }
                    }
                    List listLLIIII = C13LP.LLIIII(c1603830rq1.LJIIIIZZ);
                    if (listLLIIII.size() <= 2) {
                        size = (float) C13LP.LJJIZ(listLLIIII);
                    } else {
                        Iterator it2 = listLLIIII.iterator();
                        float fMin = Float.MAX_VALUE;
                        float fMax = Float.MIN_VALUE;
                        float f = 0.0f;
                        while (it2.hasNext()) {
                            float fFloatValue = ((Number) it2.next()).floatValue();
                            fMin = Math.min(fMin, fFloatValue);
                            fMax = Math.max(fMax, fFloatValue);
                            f += fFloatValue;
                        }
                        size = ((f - fMin) - fMax) / (listLLIIII.size() - 2);
                    }
                    float f2 = size + 0.001f;
                    if (f2 >= c1603830rq1.LJ) {
                        c09q3 = C09Q3.EXTREME;
                    } else if (f2 >= c1603830rq1.LIZLLL) {
                        c09q3 = C09Q3.HIGH;
                    } else if (f2 >= c1603830rq1.LIZJ) {
                        c09q3 = C09Q3.MEDIUM;
                    } else if (f2 >= c1603830rq1.LIZIZ) {
                        c09q3 = C09Q3.LOW;
                    } else {
                        c09q3 = C09Q3.UNKNOWN;
                    }
                    if (c09q3 != c1603830rq1.LIZ) {
                        c1603830rq1.LIZ = c09q3;
                        c1603830rq1.LJFF.LIZ(c09q3, null);
                    }
                    c1603830rq1.LIZLLL();
                }
            }
            C786410Ut5.LJLIIL(c1603830rq1.LJIIJ, c1603830rq1.LJI, new ARunnableS124S0100000_24(c1603830rq1, 149));
        }
        C1C7U.LIZIZ("JavaPressureByPull@2814.checkMemory$2L");
    }
}

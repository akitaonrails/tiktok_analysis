package X;

import Y.ARunnableS123S0100000_23;
import Y.ARunnableS92S0200000_23;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.lang.Thread;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0oou, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1487820oou implements InterfaceC1486580omu {
    public HandlerThreadC1487830oov LIZLLL;
    public volatile Handler LJ;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public ARunnableS123S0100000_23 LJIILIIL;
    public final ConcurrentLinkedDeque<HandlerThreadC1487770oop> LIZ = new ConcurrentLinkedDeque<>();
    public final ConcurrentLinkedDeque<HandlerThreadC1487770oop> LIZIZ = new ConcurrentLinkedDeque<>();
    public final ConcurrentHashMap<HandlerThread, Runnable> LIZJ = new ConcurrentHashMap<>();
    public final AtomicBoolean LJFF = new AtomicBoolean(false);
    public final AtomicBoolean LJIIL = new AtomicBoolean(false);

    @Override // X.InterfaceC1486580omu
    public final void release() {
    }

    @Override // X.InterfaceC1486580omu
    public final C1481380oeW LIZJ() {
        int size = this.LIZ.size();
        int size2 = this.LIZIZ.size();
        Iterator<HandlerThreadC1487770oop> it2 = this.LIZIZ.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (it2.next().getState() == Thread.State.BLOCKED) {
                i++;
            }
        }
        return new C1481380oeW(size, size2, i);
    }

    @Override // X.InterfaceC1486580omu
    public final void init() {
        C1486550omr c1486550omr = C1486540omq.LIZIZ;
        if (this.LJFF.compareAndSet(false, true)) {
            C1487750oon.LIZ = c1486550omr;
            C1487810oot.LIZIZ();
            C1487840oow c1487840oowLIZIZ = C1487810oot.LIZIZ();
            this.LJI = c1487840oowLIZIZ.LIZ;
            this.LJII = c1487840oowLIZIZ.LIZIZ;
            this.LJIIIIZZ = c1487840oowLIZIZ.LJ;
            this.LJIIIZ = c1487840oowLIZIZ.LJFF;
            this.LJIIJ = c1487840oowLIZIZ.LJI;
            this.LJIIJJI = c1487840oowLIZIZ.LJII;
            int i = c1487840oowLIZIZ.LIZJ;
            if (i > 0) {
                C1487800oos c1487800oos = new C1487800oos();
                c1487800oos.LJ = i;
                c1487800oos.LJFF = c1487840oowLIZIZ.LIZLLL;
                new C1487740oom(new C1487790oor(c1487800oos));
            }
            HandlerThreadC1487830oov handlerThreadC1487830oov = new HandlerThreadC1487830oov(this, this.LJIIJ);
            this.LIZLLL = handlerThreadC1487830oov;
            handlerThreadC1487830oov.start();
        }
    }

    @Override // X.InterfaceC1486580omu
    public final C1480770odX LIZ(EnumC1482310og1 enumC1482310og1) {
        HandlerThreadC1487770oop handlerThreadC1487770oopPoll;
        int i;
        boolean z;
        int i2;
        if (enumC1482310og1 == null || TextUtils.isEmpty(enumC1482310og1.getValue())) {
            if (C1487750oon.LIZIZ()) {
                C1487750oon.LIZ("MediaThreadManagerV2", "acquireHandlerThread scene null return");
                return null;
            }
            return null;
        }
        while (true) {
            handlerThreadC1487770oopPoll = this.LIZ.poll();
            if (handlerThreadC1487770oopPoll == null || (handlerThreadC1487770oopPoll.isAlive() && handlerThreadC1487770oopPoll.getLooper() != null)) {
                break;
            }
        }
        if (handlerThreadC1487770oopPoll != null) {
            if (enumC1482310og1 == EnumC1482310og1.LIVE) {
                i2 = this.LJIIIZ;
            } else {
                i2 = this.LJIIIIZZ;
            }
            handlerThreadC1487770oopPoll.LIZIZ(i2);
            z = true;
        } else {
            if (enumC1482310og1 == EnumC1482310og1.LIVE) {
                i = this.LJIIIZ;
            } else {
                i = this.LJIIIIZZ;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("media_thread_fallback_");
            sbLIZ.append(jCurrentTimeMillis);
            handlerThreadC1487770oopPoll = new HandlerThreadC1487770oop(C2188811AlT.LIZIZ(sbLIZ), i);
            handlerThreadC1487770oopPoll.start();
            handlerThreadC1487770oopPoll.getLooper();
            z = false;
        }
        if (this.LJIIJJI > 0 && this.LIZ.isEmpty() && this.LJ != null) {
            C786410Ut5.LJJZZIII(this.LJ, new ARunnableS123S0100000_23(this, 153));
        }
        if (C1487750oon.LIZIZ() && this.LJ != null && this.LJIIL.compareAndSet(false, true)) {
            this.LJIILIIL = new ARunnableS123S0100000_23(this, 155);
            C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, this.LJ, this.LJIILIIL);
        }
        this.LIZIZ.add(handlerThreadC1487770oopPoll);
        C1480770odX c1480770odX = new C1480770odX(handlerThreadC1487770oopPoll, "");
        c1480770odX.LIZJ = z;
        return c1480770odX;
    }

    @Override // X.InterfaceC1486580omu
    public final void LIZIZ(C1480770odX c1480770odX) {
        HandlerThread handlerThread;
        if (c1480770odX != null && (handlerThread = c1480770odX.LIZ) != null) {
            if (C1487750oon.LIZIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("recycleHandlerThread: handlerThread=");
                sbLIZ.append(handlerThread);
                C1487750oon.LIZ("MediaThreadManagerV2", C2188811AlT.LIZIZ(sbLIZ));
            }
            Runnable runnableRemove = this.LIZJ.remove(handlerThread);
            if (runnableRemove != null && this.LJ != null) {
                this.LJ.removeCallbacks(runnableRemove);
                if (C1487750oon.LIZIZ()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("cancelTimeoutTask: cancelled for handlerThread=");
                    sbLIZ2.append(handlerThread);
                    C1487750oon.LIZ("MediaThreadManagerV2", C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            if (this.LJ != null) {
                C786410Ut5.LJJZZIII(this.LJ, new ARunnableS92S0200000_23(this, handlerThread, 97));
            } else {
                handlerThread.quitSafely();
            }
        }
    }
}

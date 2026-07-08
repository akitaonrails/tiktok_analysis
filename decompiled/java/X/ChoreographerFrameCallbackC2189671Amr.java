package X;

import android.os.SystemClock;
import android.view.Choreographer;
import com.bytedance.mt.protector.impl.collections.ListProtector;

/* JADX INFO: renamed from: X.1Amr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class ChoreographerFrameCallbackC2189671Amr implements Choreographer.FrameCallback {
    public final int $t;
    public Object l0;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.$t) {
            case 0:
                doFrame$0(this, j);
                break;
            case 1:
                doFrame$1(this, j);
                break;
            case 2:
                doFrame$2(this, j);
                break;
        }
    }

    public ChoreographerFrameCallbackC2189671Amr(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void doFrame$0(ChoreographerFrameCallbackC2189671Amr choreographerFrameCallbackC2189671Amr, long j) {
        C21617519iv c21617519iv = ((C21616819io) choreographerFrameCallbackC2189671Amr.l0).LIZ;
        c21617519iv.LIZ.LJ = SystemClock.uptimeMillis();
        C21616719in c21616719in = c21617519iv.LIZ;
        long j2 = c21616719in.LJ;
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < c21616719in.LIZIZ.size(); i++) {
            InterfaceC21617619iw interfaceC21617619iw = (InterfaceC21617619iw) ListProtector.get(c21616719in.LIZIZ, i);
            if (interfaceC21617619iw != null) {
                Long l = c21616719in.LIZ.get(interfaceC21617619iw);
                if (l != null) {
                    if (l.longValue() < jUptimeMillis) {
                        c21616719in.LIZ.remove(interfaceC21617619iw);
                        interfaceC21617619iw.LIZ(j2);
                    }
                } else {
                    interfaceC21617619iw.LIZ(j2);
                }
            }
        }
        if (c21616719in.LJFF) {
            int size = c21616719in.LIZIZ.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else if (ListProtector.get(c21616719in.LIZIZ, size) == null) {
                    ListProtector.remove(c21616719in.LIZIZ, size);
                }
            }
            c21616719in.LJFF = false;
        }
        if (c21617519iv.LIZ.LIZIZ.size() > 0) {
            C21616719in c21616719in2 = c21617519iv.LIZ;
            if (c21616719in2.LIZLLL == null) {
                c21616719in2.LIZLLL = new C21616819io(c21616719in2.LIZJ);
            }
            C21616819io c21616819io = c21616719in2.LIZLLL;
            c21616819io.LIZIZ.postFrameCallback(c21616819io.LIZJ);
        }
    }

    public static final void doFrame$1(ChoreographerFrameCallbackC2189671Amr choreographerFrameCallbackC2189671Amr, long j) {
        if (!((C2184991AfJ) choreographerFrameCallbackC2189671Amr.l0).LIZJ) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C2184991AfJ c2184991AfJ = (C2184991AfJ) choreographerFrameCallbackC2189671Amr.l0;
        long j2 = c2184991AfJ.LJ;
        if (j2 > 0) {
            long j3 = (j - j2) / 1000000;
            if (j3 > 0) {
                c2184991AfJ.LIZ = j3;
                ((C2184991AfJ) choreographerFrameCallbackC2189671Amr.l0).getClass();
                long j4 = ((C2184991AfJ) choreographerFrameCallbackC2189671Amr.l0).LIZLLL;
                if (j4 < 0 || Math.abs(j3 - j4) >= 32) {
                    ((C2184991AfJ) choreographerFrameCallbackC2189671Amr.l0).LIZLLL = j3;
                }
            }
        }
        C2184991AfJ c2184991AfJ2 = (C2184991AfJ) choreographerFrameCallbackC2189671Amr.l0;
        c2184991AfJ2.LJ = j;
        c2184991AfJ2.LIZIZ = jElapsedRealtime;
        Choreographer choreographer = ((C2184991AfJ) choreographerFrameCallbackC2189671Amr.l0).LJFF;
        if (choreographer != null) {
            choreographer.postFrameCallback(choreographerFrameCallbackC2189671Amr);
        }
    }

    public static final void doFrame$2(ChoreographerFrameCallbackC2189671Amr choreographerFrameCallbackC2189671Amr, long j) {
        C21546919Ud c21546919Ud = (C21546919Ud) choreographerFrameCallbackC2189671Amr.l0;
        c21546919Ud.LLJIJIL.LLLL = false;
        if (c21546919Ud.getWindowToken() != null) {
            c21546919Ud.postInvalidateOnAnimation();
        }
    }
}

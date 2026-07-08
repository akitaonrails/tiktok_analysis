package X;

import Y.ARunnableS89S0200000_20;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.delegate.BPEAThread;

/* JADX INFO: renamed from: X.0kx9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1339170kx9 extends C0W9W {
    public final int $t;
    public Object l0;

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            default:
                super.run();
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(C1339170kx9 c1339170kx9) {
        C1C7U.LIZ("TTLHAdaptive@ddd0.start$5");
        boolean zLJ = C0W9U.LJ(c1339170kx9.bpeaTraceContext);
        try {
            ((C1267280j5C) c1339170kx9.l0).LIZIZ("timer");
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("TTLHAdaptive@ddd0.start$5");
    }

    public static final void run$1(C1339170kx9 c1339170kx9) {
        C1C7U.LIZ("LyraxPlayerLogEventProcesser@7bbb.startTimer$1");
        boolean zLJ = C0W9U.LJ(c1339170kx9.bpeaTraceContext);
        try {
            ((C1279540jOy) c1339170kx9.l0).LJIIIZ();
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("LyraxPlayerLogEventProcesser@7bbb.startTimer$1");
    }

    public static final void run$2(C1339170kx9 c1339170kx9) {
        C1C7U.LIZ("CardOcrActivity@bb9e.initTimer$$inlined$apply$lambda$1");
        boolean zLJ = C0W9U.LJ(c1339170kx9.bpeaTraceContext);
        try {
            new BPEAThread(new ARunnableS89S0200000_20(c1339170kx9, new BPEAHandler(Looper.getMainLooper()), 189)).start();
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("CardOcrActivity@bb9e.initTimer$$inlined$apply$lambda$1");
    }

    public C1339170kx9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}

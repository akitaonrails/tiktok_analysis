package X;

import Y.ARunnableS103S0100000_3;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Choreographer;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.qmi.vsync.bridge.HandlerBridge;
import com.bytedance.qmi.vsync.jni.MethodDeOptimize;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.08GF, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08GF {
    public static volatile C08GF LJ;
    public final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public final List<C08GE> LIZJ = new ArrayList();
    public final List<C08GD> LIZLLL = new ArrayList();
    public final C08GG LIZIZ = new C08GH() { // from class: X.08GG
        @Override // X.C08GH
        public final void LIZJ() {
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [X.08GA, X.08GC, java.lang.Object] */
        @Override // X.C08GH
        public final Pair<C08GC, Boolean> LIZIZ(int i, Choreographer choreographer) {
            boolean zLIZJ;
            SystemClock.uptimeMillis();
            ?? r1 = new C08GC(this, choreographer) { // from class: X.08GA
                public HandlerBridge LJI;
                public final boolean LJII;

                @Override // X.C08GC
                public final void LIZ() {
                    C1960307m5.LIZIZ(this.LJFF, this.LIZJ, this.LJI);
                    this.LJ = true;
                }

                public final boolean LIZJ() {
                    try {
                        Field fieldLIZ = C1958807lq.LIZ(Choreographer.class, "mHandler");
                        if (fieldLIZ == null) {
                            this.LIZLLL = false;
                            return false;
                        }
                        Object obj = null;
                        try {
                            obj = fieldLIZ.get(this.LIZJ);
                        } catch (IllegalAccessException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        Handler handler = (Handler) obj;
                        if (handler == null || !TextUtils.equals(handler.getClass().getName(), "android.view.Choreographer$FrameHandler")) {
                            this.LIZLLL = false;
                            return false;
                        }
                        Choreographer choreographer2 = this.LIZJ;
                        Field fieldLIZ2 = C1958807lq.LIZ(choreographer2.getClass(), "mDisplayEventReceiver");
                        if (fieldLIZ2 != null) {
                            try {
                                Object obj2 = fieldLIZ2.get(choreographer2);
                                if (obj2 != null) {
                                    this.LJFF = C1960307m5.LIZ(C1958807lq.LIZ(Choreographer.class, "mHandler"));
                                    this.LJI = new HandlerBridge(Looper.getMainLooper(), this, handler, obj2);
                                    if (this.LJII && Build.VERSION.SDK_INT > 30) {
                                        System.currentTimeMillis();
                                        MethodDeOptimize.LIZ();
                                    }
                                    this.LIZLLL = true;
                                }
                            } catch (IllegalAccessException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                        }
                        this.LIZLLL = false;
                        return false;
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        this.LIZLLL = false;
                    }
                    return this.LIZLLL;
                }

                {
                    super(1, choreographer, this);
                    this.LJII = this.LIZIZ;
                }
            };
            if (r1.LIZLLL) {
                zLIZJ = false;
            } else {
                zLIZJ = r1.LIZJ();
            }
            Pair<C08GC, Boolean> pair = new Pair<>(r1, Boolean.valueOf(zLIZJ));
            if (!((Boolean) pair.second).booleanValue()) {
                this.LIZLLL = 3;
                if (!this.LIZJ.isEmpty()) {
                    C786410Ut5.LJLIIL(0L, C08GF.LIZ().LIZ, new ARunnableS103S0100000_3(this, i, 2, false, 162));
                }
            }
            return pair;
        }
    };

    public static C08GF LIZ() {
        if (LJ == null) {
            synchronized (C08GF.class) {
                try {
                    if (LJ == null) {
                        LJ = new C08GF();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJ;
    }
}

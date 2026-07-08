package X;

import android.os.Handler;
import com.ss.pusher.core.engine.AdaptiveController;
import com.ss.pusher.core.utils.SafeHandlerThread;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0jNx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1278910jNx {
    public final Handler LIZ;
    public final Handler LIZIZ;
    public final C1277590jLp LIZJ;
    public C1277760jM6 LIZLLL;
    public WeakReference<C1277960jMQ> LJ;
    public WeakReference<C1278760jNi> LJFF;
    public WeakReference<C1278740jNg> LJI;
    public WeakReference<C1278950jO1> LJII;
    public WeakReference<C1279000jO6> LJIIIIZZ;
    public WeakReference<Object> LJIIIZ;
    public WeakReference<Object> LJIIJ;
    public WeakReference<Object> LJIIJJI;
    public WeakReference<Object> LJIIL;
    public WeakReference<Object> LJIILIIL;
    public WeakReference<Object> LJIILJJIL;
    public WeakReference<Object> LJIILL;
    public WeakReference<Object> LJIILLIIL;
    public WeakReference<Object> LJIIZILJ;
    public WeakReference<AdaptiveController> LJIJ;

    public final AdaptiveController LIZ() {
        WeakReference<AdaptiveController> weakReference = this.LJIJ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final C1278760jNi LIZIZ() {
        WeakReference<C1278760jNi> weakReference = this.LJFF;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final C1279000jO6 LIZJ() {
        C1279000jO6 c1279000jO6;
        WeakReference<C1279000jO6> weakReference = this.LJIIIIZZ;
        return (weakReference == null || (c1279000jO6 = weakReference.get()) == null) ? new C1279000jO6() : c1279000jO6;
    }

    public final <T> T LIZLLL() {
        T t;
        WeakReference<Object> weakReference = this.LJIILLIIL;
        if (weakReference == null || (t = (T) weakReference.get()) == null) {
            return null;
        }
        return t;
    }

    public final C1278950jO1 LJ() {
        C1278950jO1 c1278950jO1;
        WeakReference<C1278950jO1> weakReference = this.LJII;
        return (weakReference == null || (c1278950jO1 = weakReference.get()) == null) ? new C1278950jO1() : c1278950jO1;
    }

    public final <T> T LJFF() {
        WeakReference<Object> weakReference = this.LJIIIZ;
        if (weakReference == null) {
            return null;
        }
        return (T) weakReference.get();
    }

    public final <T> T LJI() {
        T t;
        WeakReference<Object> weakReference = this.LJIIL;
        if (weakReference == null || (t = (T) weakReference.get()) == null) {
            return null;
        }
        return t;
    }

    public C1278910jNx(SafeHandlerThread.SafeHandler safeHandler, SafeHandlerThread.SafeHandler safeHandler2, C1277590jLp c1277590jLp) {
        this.LIZ = safeHandler;
        this.LIZIZ = safeHandler2;
        this.LIZJ = c1277590jLp;
    }
}

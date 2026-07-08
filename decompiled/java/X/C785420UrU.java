package X;

import Y.ARunnableS112S0100000_12;
import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0UrU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C785420UrU {
    public final WeakReference<Activity> LIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public double LJIIIZ;
    public ARunnableS112S0100000_12 LJIIJ;
    public ARunnableS112S0100000_12 LJIIJJI;
    public final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public final double LJIIIIZZ = 0.95d;

    public final void LIZLLL() {
        if (C739670Szt.LIZ) {
            if (this.LIZLLL) {
                ARunnableS112S0100000_12 aRunnableS112S0100000_12 = this.LJIIJ;
                if (aRunnableS112S0100000_12 != null) {
                    this.LIZIZ.removeCallbacks(aRunnableS112S0100000_12);
                }
                ARunnableS112S0100000_12 aRunnableS112S0100000_122 = new ARunnableS112S0100000_12(this, 399);
                this.LJIIJ = aRunnableS112S0100000_122;
                C786410Ut5.LJLIIL(3000L, this.LIZIZ, aRunnableS112S0100000_122);
            }
            if (this.LIZJ) {
                ARunnableS112S0100000_12 aRunnableS112S0100000_123 = this.LJIIJJI;
                if (aRunnableS112S0100000_123 != null) {
                    this.LIZIZ.removeCallbacks(aRunnableS112S0100000_123);
                }
                ARunnableS112S0100000_12 aRunnableS112S0100000_124 = new ARunnableS112S0100000_12(this, 398);
                this.LJIIJJI = aRunnableS112S0100000_124;
                C786410Ut5.LJLIIL(3000L, this.LIZIZ, aRunnableS112S0100000_124);
            }
        }
    }

    public final void LJ() {
        if (C739670Szt.LIZ) {
            this.LIZJ = false;
            Activity activity = this.LIZ.get();
            if (activity != null && this.LIZLLL) {
                activity.getWindow().clearFlags(8192);
                this.LIZLLL = false;
            }
        }
    }

    public C785420UrU(C19EG c19eg) {
        this.LIZ = new WeakReference<>(c19eg);
    }

    public static boolean LIZJ(C19EG c19eg) {
        try {
            int iN3 = C786410Ut5.n3(c19eg.getResources(), "config_navBarInteractionMode", "integer", "android");
            if (iN3 > 0) {
                if (c19eg.getResources().getInteger(iN3) == 2) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public final void LIZ(MotionEvent motionEvent) {
        Activity activity;
        if (C739670Szt.LIZ && (activity = this.LIZ.get()) != null && motionEvent != null) {
            if (!this.LIZLLL && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && motionEvent.getY() > this.LJIIIZ && motionEvent.getX() > this.LJI && motionEvent.getX() < this.LJII)) {
                activity.getWindow().addFlags(8192);
                this.LIZLLL = true;
            }
            if (this.LIZLLL && motionEvent.getAction() == 3) {
                ARunnableS112S0100000_12 aRunnableS112S0100000_12 = this.LJIIJ;
                if (aRunnableS112S0100000_12 != null) {
                    this.LIZIZ.removeCallbacks(aRunnableS112S0100000_12);
                }
                ARunnableS112S0100000_12 aRunnableS112S0100000_122 = new ARunnableS112S0100000_12(this, 399);
                this.LJIIJ = aRunnableS112S0100000_122;
                C786410Ut5.LJLIIL(6000L, this.LIZIZ, aRunnableS112S0100000_122);
            }
        }
    }

    public final void LIZIZ(C19EG c19eg) {
        if (!C739670Szt.LIZ) {
            return;
        }
        WindowManager windowManager = c19eg.getWindowManager();
        if (Build.VERSION.SDK_INT >= 30) {
            Rect bounds = C2204961BRm.LLILZ(windowManager, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5Yo2Rd7j/xaP3wGqYFE+VSEv/xaCvTN4cbo1voxfg452M5ZHBcY42MdOc=", null)).getBounds();
            this.LJ = bounds.height();
            this.LJFF = bounds.width();
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5Yo2Rd7j/xaP3wGqYFE+VSEv/xaCvTN4cbo1voxfg452M5ZHBcY42MdOc=", null)).getRealMetrics(displayMetrics);
            this.LJ = displayMetrics.heightPixels;
            this.LJFF = displayMetrics.widthPixels;
        }
        int i = this.LJFF;
        this.LJI = i / 3;
        this.LJII = (i * 2) / 3;
        this.LJIIIZ = ((double) this.LJ) * this.LJIIIIZZ;
    }
}

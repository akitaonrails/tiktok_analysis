package X;

import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: X.0rrH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1604610rrH {
    public final C1604620rrI LIZ;
    public final int LIZIZ;

    public abstract boolean LIZ();

    public abstract boolean LIZIZ(MotionEvent motionEvent);

    public void LIZJ() {
    }

    public void LIZLLL() {
    }

    public abstract boolean LJ(MotionEvent motionEvent);

    public boolean LJFF(MotionEvent motionEvent) {
        return true;
    }

    public AbstractC1604610rrH(C1604620rrI c1604620rrI) {
        this.LIZ = c1604620rrI;
        this.LIZIZ = ViewConfiguration.get(c1604620rrI.getContext()).getScaledTouchSlop();
    }
}

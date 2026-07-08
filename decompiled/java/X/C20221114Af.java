package X;

import Y.ARunnableS130S0100000_30;
import android.view.MotionEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.14Af, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20221114Af {
    public final List<C20221314Ah> LIZ = new ArrayList();
    public volatile boolean LIZIZ = false;
    public final int LIZJ;

    public final void LIZIZ() {
        try {
            C145R.LIZ.LIZ(new ARunnableS130S0100000_30(this, 22));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C20221114Af(int i) {
        this.LIZJ = 6000;
        if (i > 6000) {
            this.LIZJ = i;
        }
    }

    public final void LIZ(MotionEvent motionEvent) {
        int action;
        if (!this.LIZIZ) {
            try {
                if (((ArrayList) this.LIZ).size() < this.LIZJ) {
                    action = motionEvent.getAction();
                    try {
                        C20221314Ah c20221314Ah = new C20221314Ah();
                        c20221314Ah.LIZ = motionEvent.getPressure();
                        c20221314Ah.LIZIZ = motionEvent.getTouchMajor();
                        c20221314Ah.LIZJ = motionEvent.getX();
                        c20221314Ah.LIZLLL = motionEvent.getY();
                        c20221314Ah.LJ = motionEvent.getEventTime();
                        c20221314Ah.LJFF = motionEvent.getAction();
                        ((ArrayList) this.LIZ).add(c20221314Ah);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("events : ");
                        sbLIZ.append(((ArrayList) this.LIZ).size());
                        C2188811AlT.LIZIZ(sbLIZ);
                        if (action != 1) {
                            return;
                        }
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        if (action != 1) {
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                break;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        if (action == 1) {
                            this.LIZIZ = true;
                            LIZIZ();
                        }
                        throw th;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                action = 1;
            } catch (Throwable th3) {
                th = th3;
                action = 1;
            }
            this.LIZIZ = true;
            LIZIZ();
        }
    }
}

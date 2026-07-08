package X;

import Y.ARunnableS130S0100000_30;
import android.view.MotionEvent;
import com.bytedance.bdturing.VerifyTaskHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.14Ae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20221014Ae {
    public final List<C20221214Ag> LIZ = new ArrayList();
    public volatile boolean LIZIZ = false;
    public final int LIZJ;

    public final void LIZIZ() {
        try {
            VerifyTaskHandler verifyTaskHandler = C145S.LIZ;
            ARunnableS130S0100000_30 aRunnableS130S0100000_30 = new ARunnableS130S0100000_30(this, 28);
            VerifyTaskHandler.MessageHandler messageHandler = verifyTaskHandler.LIZIZ;
            if (messageHandler != null) {
                messageHandler.post(aRunnableS130S0100000_30);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C20221014Ae(int i) {
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
                        C20221214Ag c20221214Ag = new C20221214Ag();
                        c20221214Ag.LIZ = motionEvent.getPressure();
                        c20221214Ag.LIZIZ = motionEvent.getTouchMajor();
                        c20221214Ag.LIZJ = motionEvent.getX();
                        c20221214Ag.LIZLLL = motionEvent.getY();
                        c20221214Ag.LJ = motionEvent.getEventTime();
                        c20221214Ag.LJFF = motionEvent.getAction();
                        ((ArrayList) this.LIZ).add(c20221214Ag);
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

package X;

import android.view.MotionEvent;

/* JADX INFO: renamed from: X.0mSG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1396900mSG {
    public InterfaceC1397010mSR LIZ;

    public final boolean LIZ(MotionEvent motionEvent, C1396840mSA c1396840mSA) {
        int action = motionEvent.getAction();
        boolean zOnTouchEvent = false;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        this.LIZ = null;
                    }
                    return false;
                }
                InterfaceC1397010mSR interfaceC1397010mSR = this.LIZ;
                if (interfaceC1397010mSR == null) {
                    return false;
                }
                return interfaceC1397010mSR.onTouchEvent(motionEvent);
            }
            InterfaceC1397010mSR interfaceC1397010mSR2 = this.LIZ;
            if (interfaceC1397010mSR2 != null) {
                zOnTouchEvent = interfaceC1397010mSR2.onTouchEvent(motionEvent);
            }
            this.LIZ = null;
            return zOnTouchEvent;
        }
        InterfaceC1397010mSR interfaceC1397010mSRLIZLLL = c1396840mSA.LIZLLL(motionEvent);
        if (interfaceC1397010mSRLIZLLL == null) {
            return false;
        }
        this.LIZ = interfaceC1397010mSRLIZLLL;
        return true;
    }
}

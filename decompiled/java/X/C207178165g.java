package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* JADX INFO: renamed from: X.165g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207178165g extends C207179165h {
    public float LLILZ;
    public float LLILZIL;

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onTouchEvent event: ");
        if (motionEvent != null) {
            numValueOf = Integer.valueOf(motionEvent.getAction());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append('}');
        C2188811AlT.LIZIZ(sbLIZ);
        if (motionEvent == null) {
            return true;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && C207179165h.LIZ(this.LLILZ, this.LLILZIL, x, y)) {
                if (getCoreAreaXRange().LIZJ(Double.valueOf(this.LLILZ)) && getCoreAreaYRange().LIZJ(Double.valueOf(this.LLILZIL))) {
                    InterfaceC207180165i interactiveListener = getInteractiveListener();
                    if (interactiveListener != null) {
                        interactiveListener.LIZJ();
                    }
                } else {
                    InterfaceC207180165i interactiveListener2 = getInteractiveListener();
                    if (interactiveListener2 != null) {
                        interactiveListener2.m();
                        return false;
                    }
                }
            }
            return false;
        }
        this.LLILZ = x;
        this.LLILZIL = y;
        return true;
    }

    public C207178165g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}

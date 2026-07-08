package X;

import Y.AObjectS360S0100000_17;
import android.content.Context;
import android.view.MotionEvent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eA3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1078090eA3 extends C1082200eGg {
    public final AbstractC1082160eGc LJIIIZ;
    public final Function1<MotionEvent, Boolean> LJIIJ;

    @Override // X.C1082200eGg
    public final boolean LIZ(MotionEvent motionEvent) {
        if (!this.LJIIJ.invoke(motionEvent).booleanValue()) {
            return false;
        }
        if (this.LJIIIZ.LIZJ(motionEvent)) {
            this.LJIIIZ.getClass();
            if (!(r0 instanceof C1082150eGb)) {
                return super.LIZ(motionEvent);
            }
            super.LIZ(motionEvent);
            return true;
        }
        if (motionEvent.getPointerCount() >= 2 && motionEvent.getActionMasked() == 2) {
            return false;
        }
        if (motionEvent.getPointerCount() < 2) {
            if (motionEvent.getAction() != 2) {
                super.LIZ(motionEvent);
            }
            return false;
        }
        super.LIZ(motionEvent);
        return false;
    }

    public C1078090eA3(Context context, AbstractC1082160eGc abstractC1082160eGc, AObjectS360S0100000_17 aObjectS360S0100000_17) {
        super(context, abstractC1082160eGc);
        this.LJIIIZ = abstractC1082160eGc;
        this.LJIIJ = aObjectS360S0100000_17;
    }
}

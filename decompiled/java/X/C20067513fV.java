package X;

import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.13fV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20067513fV {
    public static final void LIZ(C20067313fT c20067313fT, long j, Function1<? super MotionEvent, Unit> function1, boolean z) {
        MotionEvent motionEventLIZ = c20067313fT.LIZ();
        if (motionEventLIZ != null) {
            int action = motionEventLIZ.getAction();
            if (z) {
                motionEventLIZ.setAction(3);
            }
            int i = (int) (j >> 32);
            int i2 = (int) (j & 4294967295L);
            motionEventLIZ.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
            function1.invoke(motionEventLIZ);
            motionEventLIZ.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
            motionEventLIZ.setAction(action);
            return;
        }
        "The PointerEvent receiver cannot have a null MotionEvent.".toString();
        throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
    }
}

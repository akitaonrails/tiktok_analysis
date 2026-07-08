package X;

import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS228S0000000_1;

/* JADX INFO: renamed from: X.03EQ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03EQ implements C03BH {
    public Function1<? super MotionEvent, Unit> LIZ = AFwS228S0000000_1.get$arr$(31);

    @Override // X.C03BH
    public final void LIZ(MotionEvent motionEvent) {
        Integer numValueOf;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null && numValueOf.intValue() == 0) {
            this.LIZ.invoke(motionEvent);
        }
    }
}

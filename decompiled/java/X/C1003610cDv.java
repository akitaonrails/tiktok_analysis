package X;

import Y.ATListenerS449S0100000_16;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.ss.android.ugc.aweme.component.gestureupcomponent.AnoleGestureContextModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS452S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0cDv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1003610cDv {
    public final Context LIZ;
    public final AnoleGestureContextModel LIZIZ;
    public final Function2<Float, Float, Unit> LIZJ;
    public final InterfaceC1631630sYr<String, Float, Float, Float, Unit> LIZLLL;
    public boolean LJ;
    public final C1003620cDw LJFF = new GestureDetector.SimpleOnGestureListener() { // from class: X.0cDw
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            boolean z;
            boolean z2 = false;
            this.LL.LJ = false;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onDown reset consumed=false, down=(");
            sbLIZ.append(motionEvent.getRawX());
            sbLIZ.append(',');
            sbLIZ.append(motionEvent.getRawY());
            sbLIZ.append("), tapEnable=");
            if (this.LL.LIZIZ.getTapContext() != null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            sbLIZ.append(", slideEnable=");
            if (this.LL.LIZIZ.getSlideContext() != null) {
                z2 = true;
            }
            sbLIZ.append(z2);
            C2188811AlT.LIZIZ(sbLIZ);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            C1003610cDv c1003610cDv = this.LL;
            if (c1003610cDv.LJ || c1003610cDv.LIZIZ.getTapContext() == null) {
                return false;
            }
            this.LL.LJ = true;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onSingleTapUp HIT -> fire tap at (");
            sbLIZ.append(motionEvent.getRawX());
            sbLIZ.append(',');
            sbLIZ.append(motionEvent.getRawY());
            sbLIZ.append(')');
            C2188811AlT.LIZIZ(sbLIZ);
            this.LL.LIZJ.invoke(Float.valueOf(motionEvent.getRawX()), Float.valueOf(motionEvent.getRawY()));
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x0106  */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean onScroll(android.view.MotionEvent r12, android.view.MotionEvent r13, float r14, float r15) {
            /*
                Method dump skipped, instruction units count: 377
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1003620cDw.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
        }
    };
    public final C01GW LJI = C452501pT.LIZIZ(new AwS560S0100000_16(this, 742));
    public final ATListenerS449S0100000_16 LJII = new ATListenerS449S0100000_16(this, 12);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0cDw] */
    public C1003610cDv(Context context, AnoleGestureContextModel anoleGestureContextModel, AwS452S0200000_16 awS452S0200000_16, C1003580cDs c1003580cDs) {
        this.LIZ = context;
        this.LIZIZ = anoleGestureContextModel;
        this.LIZJ = awS452S0200000_16;
        this.LIZLLL = c1003580cDs;
    }
}

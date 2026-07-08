package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import zoo.b;

/* JADX INFO: renamed from: X.19bl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21573119bl {
    public final InterfaceC21573319bn LIZ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public final GestureDetectorOnDoubleTapListenerC21573519bp LIZIZ = new GestureDetector.OnDoubleTapListener() { // from class: X.19bp
        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            this.LL.LIZ.onDoubleTap(motionEvent);
            return true;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            this.LL.LIZ.LIZIZ();
            return true;
        }
    };
    public final C21573419bo LIZJ = new InterfaceC21572919bj() { // from class: X.19bo
        @Override // X.InterfaceC21572919bj
        public final void LIZ(C21572719bh c21572719bh) {
            this.LIZ.LIZ.onScaleEnd();
        }

        @Override // X.InterfaceC21572919bj
        public final boolean LIZIZ(C21572719bh c21572719bh) {
            return this.LIZ.LIZ.onScaleBegin();
        }

        @Override // X.InterfaceC21572919bj
        public final boolean LJFF(C21572719bh c21572719bh) {
            return this.LIZ.LIZ.LJFF(c21572719bh);
        }
    };
    public final GestureDetectorOnGestureListenerC21573219bm LIZLLL = new GestureDetector.OnGestureListener() { // from class: X.19bm
        @Override // android.view.GestureDetector.OnGestureListener
        public final void onShowPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return this.LL.LIZ.onDown(motionEvent);
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            this.LL.LIZ.LIZ();
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            this.LL.LIZ.LIZJ(f, f2);
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return this.LL.LIZ.LJ(motionEvent2, f, f2);
        }
    };
    public final C21573619bq LJ = new InterfaceC21645219nO() { // from class: X.19bq
        @Override // X.InterfaceC21645219nO
        public final void LLLLLLLLL(b bVar, float f, float f2) {
        }

        @Override // X.InterfaceC21645219nO
        public final boolean LLLZLZ(b bVar) {
            return true;
        }

        @Override // X.InterfaceC21645219nO
        public final void LJFF(b bVar) {
            this.LIZ.LIZ.LIZLLL();
        }
    };
    public final C01GW LJII = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3898));

    /* JADX WARN: Type inference failed for: r0v0, types: [X.19bp] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.19bo] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.19bm] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.19bq] */
    public C21573119bl(Context context, C21572619bg c21572619bg) {
        this.LIZ = c21572619bg;
        this.LJFF = C452501pT.LIZIZ(new AwS434S0200000_33(context, this, 159));
        this.LJI = C452501pT.LIZIZ(new AwS434S0200000_33(context, this, 160));
    }
}

package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import zoo.b;

/* JADX INFO: renamed from: X.19c4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21575019c4 {
    public final InterfaceC21575319c7 LIZ;
    public final C01GW LJ;
    public final C01GW LJFF;
    public final C21575419c8 LIZIZ = new InterfaceC21574919c3() { // from class: X.19c8
        @Override // X.InterfaceC21574919c3
        public final void LIZ(C21574619c0 c21574619c0) {
            this.LIZ.LIZ.onScaleEnd();
        }

        @Override // X.InterfaceC21574919c3
        public final boolean LIZIZ(C21574619c0 c21574619c0) {
            return this.LIZ.LIZ.onScaleBegin();
        }

        @Override // X.InterfaceC21574919c3
        public final boolean LJFF(C21574619c0 c21574619c0) {
            return this.LIZ.LIZ.LJFF(c21574619c0);
        }
    };
    public final GestureDetectorOnGestureListenerC21575119c5 LIZJ = new GestureDetector.OnGestureListener() { // from class: X.19c5
        @Override // android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
        }

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
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            this.LL.LIZ.LIZJ();
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return this.LL.LIZ.LJ(motionEvent2, f, f2);
        }
    };
    public final C21575219c6 LIZLLL = new InterfaceC21645219nO() { // from class: X.19c6
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
    public final C01GW LJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3854));

    /* JADX WARN: Type inference failed for: r0v0, types: [X.19c8] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.19c5] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.19c6] */
    public C21575019c4(Context context, C21574519bz c21574519bz) {
        this.LIZ = c21574519bz;
        this.LJ = C452501pT.LIZIZ(new AwS434S0200000_33(context, this, 151));
        this.LJFF = C452501pT.LIZIZ(new AwS434S0200000_33(context, this, 152));
    }
}

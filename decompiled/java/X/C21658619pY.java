package X;

import android.view.MotionEvent;

/* JADX INFO: renamed from: X.19pY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21658619pY extends C21648719nx {
    public static final C21658619pY LL = new C21658619pY();
    public static C21658719pZ LLILLJJLI;

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C21658719pZ c21658719pZ;
        boolean z;
        if (f2 > 0.0f && (c21658719pZ = LLILLJJLI) != null) {
            c21658719pZ.LIZIZ.set(Float.valueOf(f2));
            if (c21658719pZ.LIZIZ.get().floatValue() >= 500) {
                z = true;
            } else {
                z = false;
            }
            InterfaceC21659019pc interfaceC21659019pc = c21658719pZ.LIZ;
            if (interfaceC21659019pc != null) {
                interfaceC21659019pc.LIZ(z);
            }
            c21658719pZ.LIZIZ.set(Float.valueOf(0.0f));
        }
        return false;
    }
}

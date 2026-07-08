package X;

import android.content.Context;
import android.view.ScaleGestureDetector;
import com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener;
import zoo.b;

/* JADX INFO: renamed from: X.0FEI, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FEI implements C0EOM {
    public GestureLayout$OnGestureListener LIZ;

    public C0FEI(Context context) {
        new ScaleGestureDetector(context, new ScaleGestureDetector.OnScaleGestureListener() { // from class: X.0FEG
            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                GestureLayout$OnGestureListener gestureLayout$OnGestureListener = this.LL.LIZ;
                if (gestureLayout$OnGestureListener != null) {
                    gestureLayout$OnGestureListener.onScale(scaleGestureDetector);
                    return true;
                }
                return true;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                GestureLayout$OnGestureListener gestureLayout$OnGestureListener = this.LL.LIZ;
                if (gestureLayout$OnGestureListener != null) {
                    gestureLayout$OnGestureListener.onScaleBegin(scaleGestureDetector);
                    return true;
                }
                return true;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
                GestureLayout$OnGestureListener gestureLayout$OnGestureListener = this.LL.LIZ;
                if (gestureLayout$OnGestureListener != null) {
                    gestureLayout$OnGestureListener.LLLLJI(scaleGestureDetector.getScaleFactor());
                }
            }
        });
        new C21645419nQ(context, new InterfaceC21645519nR() { // from class: X.0FEJ
            @Override // X.InterfaceC21645519nR
            public final void LIZ(C21645419nQ c21645419nQ) {
                GestureLayout$OnGestureListener gestureLayout$OnGestureListener = this.LIZ.LIZ;
                if (gestureLayout$OnGestureListener != null) {
                    gestureLayout$OnGestureListener.LJIIIZ(c21645419nQ.LJI());
                }
            }

            @Override // X.InterfaceC21645519nR
            public final boolean LIZIZ(C21645419nQ c21645419nQ) {
                GestureLayout$OnGestureListener gestureLayout$OnGestureListener = this.LIZ.LIZ;
                if (gestureLayout$OnGestureListener != null) {
                    gestureLayout$OnGestureListener.LJJLIIIJLJLI(c21645419nQ.LJI());
                    return true;
                }
                return true;
            }

            @Override // X.InterfaceC21645519nR
            public final void LIZJ(C21645419nQ c21645419nQ) {
                GestureLayout$OnGestureListener gestureLayout$OnGestureListener = this.LIZ.LIZ;
                if (gestureLayout$OnGestureListener != null) {
                    gestureLayout$OnGestureListener.E2(c21645419nQ);
                }
            }
        });
        new b(context, new InterfaceC21645219nO() { // from class: X.0FEH
            @Override // X.InterfaceC21645219nO
            public final void LJFF(b bVar) {
                GestureLayout$OnGestureListener gestureLayout$OnGestureListener = this.LIZ.LIZ;
                if (gestureLayout$OnGestureListener != null) {
                    gestureLayout$OnGestureListener.LJFF(bVar);
                }
            }

            @Override // X.InterfaceC21645219nO
            public final boolean LLLZLZ(b bVar) {
                GestureLayout$OnGestureListener gestureLayout$OnGestureListener = this.LIZ.LIZ;
                if (gestureLayout$OnGestureListener != null) {
                    gestureLayout$OnGestureListener.LLLZLZ(bVar);
                    return true;
                }
                return true;
            }

            @Override // X.InterfaceC21645219nO
            public final void LLLLLLLLL(b bVar, float f, float f2) {
                GestureLayout$OnGestureListener gestureLayout$OnGestureListener = this.LIZ.LIZ;
                if (gestureLayout$OnGestureListener != null) {
                    gestureLayout$OnGestureListener.LLLLLLLLL(bVar, f, f2);
                }
            }
        });
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
    }
}

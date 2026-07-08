package X;

import android.util.Size;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import java.util.ArrayList;
import zoo.b;

/* JADX INFO: renamed from: X.0FUP, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FUP {
    public final C0FUL LIZ;
    public MotionEvent LIZIZ;
    public final ScaleGestureDetector LIZJ;
    public final C21645419nQ LIZLLL;
    public final b LJ;

    public C0FUP(C0FUL c0ful) {
        this.LIZ = c0ful;
        this.LIZJ = new ScaleGestureDetector(c0ful.LL.requireSceneContext(), new ScaleGestureDetector.SimpleOnScaleGestureListener() { // from class: X.0FUR
            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                AbstractC385780FAq abstractC385780FAq = this.LL.LIZ.LLILZIL;
                if (abstractC385780FAq == null || !abstractC385780FAq.LJJIJIL()) {
                    return false;
                }
                abstractC385780FAq.onScale(scaleGestureDetector);
                return true;
            }
        });
        C21645419nQ c21645419nQ = new C21645419nQ(c0ful.LL.requireSceneContext(), new C0FEV() { // from class: X.0FUO
            @Override // X.InterfaceC21645519nR
            public final boolean LIZIZ(C21645419nQ c21645419nQ2) {
                AbstractC385780FAq abstractC385780FAq = this.LIZ.LIZ.LLILZLL;
                if (abstractC385780FAq == null || !abstractC385780FAq.LJJIJIL()) {
                    return false;
                }
                abstractC385780FAq.LJJLIIIJLJLI(c21645419nQ2.LJI());
                return true;
            }
        });
        c21645419nQ.LJIILLIIL = false;
        this.LIZLLL = c21645419nQ;
        b bVar = new b(c0ful.LL.requireSceneContext(), new InterfaceC21645219nO() { // from class: X.0FUQ
            @Override // X.InterfaceC21645219nO
            public final void LJFF(b bVar2) {
            }

            @Override // X.InterfaceC21645219nO
            public final void LLLLLLLLL(b bVar2, float f, float f2) {
            }

            @Override // X.InterfaceC21645219nO
            public final boolean LLLZLZ(b bVar2) {
                AbstractC385780FAq abstractC385780FAq = this.LIZ.LIZ.LLIZ;
                if (abstractC385780FAq == null || !abstractC385780FAq.LJJIJIL()) {
                    return false;
                }
                abstractC385780FAq.LLLZLZ(bVar2);
                return true;
            }
        });
        bVar.LJIIJ = C354870Dvh.LIZ(2);
        this.LJ = bVar;
    }

    public final MotionEvent LIZ(MotionEvent motionEvent) {
        C385730FAl c385730FAl = this.LIZ.LLILLJJLI.LIZ;
        Size size = c385730FAl.LIZLLL;
        Size size2 = c385730FAl.LIZIZ;
        Size size3 = c385730FAl.LIZ;
        if (size != null && size2 != null && size3 != null && !C363770ENz.LIZJ(size, size2, size3)) {
            float height = size3.getHeight() / size.getHeight();
            float width = (size3.getWidth() - size2.getWidth()) / 2.0f;
            MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[motionEvent.getPointerCount()];
            ArrayList arrayList = new ArrayList();
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 0; i < pointerCount; i++) {
                MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
                motionEvent.getPointerCoords(i, pointerCoords);
                pointerCoords.x = (pointerCoords.x - width) / height;
                pointerCoords.y /= height;
                pointerCoordsArr[i] = pointerCoords;
                MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
                motionEvent.getPointerProperties(i, pointerProperties);
                arrayList.add(pointerProperties);
            }
            return MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), (MotionEvent.PointerProperties[]) arrayList.toArray(new MotionEvent.PointerProperties[0]), pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        }
        return null;
    }

    public final MotionEvent LIZIZ(MotionEvent motionEvent, AbstractC385780FAq abstractC385780FAq) {
        MotionEvent motionEvent2 = this.LIZIZ;
        if (motionEvent2 != null && abstractC385780FAq.LJJIJIL()) {
            return motionEvent2;
        }
        return motionEvent;
    }
}

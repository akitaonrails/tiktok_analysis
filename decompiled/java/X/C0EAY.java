package X;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;
import zoo.b;

/* JADX INFO: renamed from: X.0EAY, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EAY {
    public final C360040E9q LIZ;
    public final C0EB6 LIZIZ;
    public final InterfaceC361710EGb LIZJ;
    public final C0EOK LIZLLL;
    public final Function0<C0E48> LJ;
    public final InterfaceC360220EAi LJFF;
    public float[] LJI;
    public final C01GW LJII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 585));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 586));
    public final C0EAZ LJIIIZ = new AbstractC385780FAq() { // from class: X.0EAZ
        public final int LL = Integer.MAX_VALUE;
        public int LLILLJJLI;

        @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
        public final boolean E2(C21645419nQ c21645419nQ) {
            return true;
        }

        @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
        public final boolean LLLLLLLLL(b bVar, float f, float f2) {
            return true;
        }

        @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        @Override // X.AbstractC385780FAq
        public final int getPriority() {
            return this.LL;
        }

        @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
        public final boolean LLLZLZ(b bVar) {
            PointF pointF;
            C0E55 player;
            float[] fArrLLJLLIL;
            C0E55 player2;
            if (bVar != null && (pointF = bVar.LJIIJJI) != null) {
                C0EAY c0eay = this.LLILLL;
                C0E48 c0e48Invoke = c0eay.LJ.invoke();
                if (c0e48Invoke != null && (player = c0e48Invoke.getPlayer()) != null && (fArrLLJLLIL = player.LLJLLIL()) != null) {
                    float f = fArrLLJLLIL[0] - pointF.x;
                    float f2 = fArrLLJLLIL[1] + pointF.y;
                    float f3 = fArrLLJLLIL[2];
                    float f4 = fArrLLJLLIL[3];
                    C0E48 c0e48Invoke2 = c0eay.LJ.invoke();
                    if (c0e48Invoke2 != null && (player2 = c0e48Invoke2.getPlayer()) != null) {
                        player2.LJIILJJIL(f, f2, f3, f4, null);
                    }
                }
                int i = this.LLILLJJLI;
                if ((i & 1) == 0) {
                    this.LLILLJJLI = i | 1;
                    C0EAE c0eae = C0EAE.LIZ;
                    C0EAE.LIZLLL(c0eay.LJFF.LJJJLIIL(), EnumC360140EAa.MOVE);
                }
            }
            return true;
        }

        @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            C0E55 player;
            float[] fArrLLJLLIL;
            C0E55 player2;
            if (scaleGestureDetector == null) {
                return false;
            }
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            C0E48 c0e48Invoke = this.LLILLL.LJ.invoke();
            if (c0e48Invoke != null && (player = c0e48Invoke.getPlayer()) != null && (fArrLLJLLIL = player.LLJLLIL()) != null) {
                C0EAY c0eay = this.LLILLL;
                float f = fArrLLJLLIL[0];
                float f2 = fArrLLJLLIL[1];
                float f3 = fArrLLJLLIL[2];
                float f4 = fArrLLJLLIL[3];
                float f5 = 2;
                float f6 = f + (f3 / f5);
                float f7 = f2 + (f4 / f5);
                float f8 = f3 * scaleFactor;
                float f9 = f4 * scaleFactor;
                float f10 = f6 - (f8 / f5);
                float f11 = f7 - (f9 / f5);
                C0E48 c0e48Invoke2 = c0eay.LJ.invoke();
                if (c0e48Invoke2 != null && (player2 = c0e48Invoke2.getPlayer()) != null) {
                    player2.LJIILJJIL(f10, f11, f8, f9, null);
                }
                if (scaleFactor > 1.0f) {
                    int i = this.LLILLJJLI;
                    if ((i & 4) == 0) {
                        this.LLILLJJLI = i | 4;
                        C0EAE c0eae = C0EAE.LIZ;
                        C0EAE.LIZLLL(c0eay.LJFF.LJJJLIIL(), EnumC360140EAa.ZOOM_OUT);
                    }
                } else {
                    int i2 = this.LLILLJJLI;
                    if ((i2 & 2) == 0) {
                        this.LLILLJJLI = i2 | 2;
                        C0EAE c0eae2 = C0EAE.LIZ;
                        C0EAE.LIZLLL(c0eay.LJFF.LJJJLIIL(), EnumC360140EAa.ZOOM_IN);
                        return true;
                    }
                }
            }
            return true;
        }

        @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
        public final boolean onUp(MotionEvent motionEvent) {
            this.LLILLJJLI = 0;
            return false;
        }
    };

    public final void LIZ() {
        C0E55 player;
        C0E48 c0e48Invoke = this.LJ.invoke();
        this.LJI = (c0e48Invoke == null || (player = c0e48Invoke.getPlayer()) == null) ? null : player.LLJLLIL();
    }

    public final void LIZIZ() {
        C0E48 c0e48Invoke;
        C0E55 player;
        float[] fArr = this.LJI;
        if (fArr == null || (c0e48Invoke = this.LJ.invoke()) == null || (player = c0e48Invoke.getPlayer()) == null) {
            return;
        }
        player.LJIILJJIL(fArr[0], fArr[1], fArr[2], fArr[3], null);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0EAZ] */
    public C0EAY(C360040E9q c360040E9q, C0EB6 c0eb6, InterfaceC361710EGb interfaceC361710EGb, C0EOK c0eok, AwS549S0100000_5 awS549S0100000_5, C360170EAd c360170EAd) {
        this.LIZ = c360040E9q;
        this.LIZIZ = c0eb6;
        this.LIZJ = interfaceC361710EGb;
        this.LIZLLL = c0eok;
        this.LJ = awS549S0100000_5;
        this.LJFF = c360170EAd;
    }
}

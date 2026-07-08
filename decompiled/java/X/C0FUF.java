package X;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel;
import kotlin.jvm.internal.AwS214S0300000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import zoo.b;

/* JADX INFO: renamed from: X.0FUF, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FUF extends C0FUE {
    public final C0FEL LLJJ;
    public final C390420FSm LLJJI;
    public final C1664680tQA<LyricStickerModel> LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final int LLJJJ;
    public PointF LLJJJIL;
    public final float LLJJJJ;
    public boolean LLJJJJJIL;
    public final boolean LLJJJJLIIL;

    @Override // X.C0FUE
    public final boolean LJJIZ() {
        return false;
    }

    @Override // X.C0FUE
    public final C1664680tQA<BaseStickerModel> LJJJIL() {
        return this.LLJJ.LJJIJ();
    }

    public final C0FUI LJJJLIIL() {
        return ((InterfaceC388760FMc) this.LLJJI.LIZIZ(C13LE.LIZ(InterfaceC388760FMc.class))).w();
    }

    @Override // X.C0FUE
    public final boolean LJJIL() {
        C0FUI c0fuiLJJJLIIL = LJJJLIIL();
        return c0fuiLJJJLIIL != null && c0fuiLJJJLIIL.LIZIZ(this.LLJJIII.LIZ.getId()) && LJJJLL();
    }

    @Override // X.C0FUE
    public final boolean LJJJJ() {
        C0FUI c0fuiLJJJLIIL = LJJJLIIL();
        if ((c0fuiLJJJLIIL == null || !c0fuiLJJJLIIL.LIZIZ(this.LLJJIII.LIZ.getId())) && !C0EKF.LIZ(this.LLJJIII.LIZ, false)) {
            return false;
        }
        return LJJJLL();
    }

    public final void LJJJJZ() {
        Integer numLIZJ;
        C0FUI c0fuiLJJJLIIL;
        Integer numLIZLLL;
        C0FUI c0fuiLJJJLIIL2 = LJJJLIIL();
        if (c0fuiLJJJLIIL2 == null || (numLIZJ = c0fuiLJJJLIIL2.LIZJ()) == null) {
            return;
        }
        if (LJJJIL().LIZ.getZIndex() >= numLIZJ.intValue() || (c0fuiLJJJLIIL = LJJJLIIL()) == null || (numLIZLLL = c0fuiLJJJLIIL.LIZLLL()) == null) {
            return;
        }
        LJJJJLL(numLIZLLL.intValue());
    }

    public final void LJJJJZI() {
        if (LJJJJ()) {
            this.LLJJ.LJJIL().LIZIZ();
        }
    }

    public final boolean LJJJLL() {
        C0FUI c0fuiLJJJLIIL = LJJJLIIL();
        if (c0fuiLJJJLIIL != null && c0fuiLJJJLIIL.LIZ(this.LLJJIII.LIZ.getId(), this.LLJJJJJIL)) {
            return false;
        }
        InterfaceC386690FEd interfaceC386690FEdLIZIZ = ((InterfaceC388760FMc) this.LLJJI.LIZIZ(C13LE.LIZ(InterfaceC388760FMc.class))).LIZIZ();
        int iLLL = interfaceC386690FEdLIZIZ != null ? interfaceC386690FEdLIZIZ.LLL() : 0;
        if (LJJJIL().LIZ.getVisible()) {
            return iLLL <= ((int) LJJJIL().LIZ.getEndTime()) && ((int) LJJJIL().LIZ.getStartTime()) <= iLLL;
        }
        return false;
    }

    @Override // X.C0FUE
    public final boolean LJJJ() {
        return this.LLJJJJLIIL;
    }

    @Override // X.C0FUE
    public final float LJJJI() {
        return this.LLJJJJ;
    }

    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean E2(C21645419nQ c21645419nQ) {
        boolean z;
        LJJJJZI();
        if (!LJJJJ()) {
            this.LLJJIJIL = false;
            return false;
        }
        RectF visibleRectWithoutRotation = LJJJIL().LIZ.getVisibleRectWithoutRotation();
        MotionEvent motionEvent = this.LLIZLLLIL;
        if (motionEvent != null && (LJJIL() || C121Q.LIZ(motionEvent.getX(), motionEvent.getY(), LJJJIL().LIZ.getRotation(), visibleRectWithoutRotation, 0.0f))) {
            z = true;
        } else {
            z = false;
        }
        if (!LJJIL() && !C121Q.LIZ(c21645419nQ.LJIILJJIL, c21645419nQ.LJIILL, LJJJIL().LIZ.getRotation(), visibleRectWithoutRotation, C418440Gaw.LIZIZ(3)) && !z) {
            this.LLJJIJIL = false;
            return false;
        }
        LJJJJL(new AwS584S0100000_5(this, 930));
        LJJJJZ();
        this.LLJJIJIL = true;
        return true;
    }

    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LIZIZ(MotionEvent motionEvent) {
        this.LLJJJJJIL = true;
        LJJJJZI();
        boolean zLIZIZ = super.LIZIZ(motionEvent);
        this.LLJJJJJIL = false;
        return zLIZIZ;
    }

    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final void LJFF(b bVar) {
        if ((this.LLJJ.LJJIL() instanceof C362870EKn) && this.LLJJIJI) {
            this.LLJJIJI = false;
            LJJJJL(new AwS584S0100000_5(this, 929));
        } else {
            super.LJFF(bVar);
        }
    }

    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LJIIIZ(float f) {
        if ((this.LLJJ.LJJIL() instanceof C362870EKn) && this.LLJJIJIL) {
            this.LLJJIJIL = false;
            LJJJJJL(new AwS549S0100000_5(this, 1134));
            return true;
        }
        return super.LJIIIZ(f);
    }

    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LLLLJI(float f) {
        if ((this.LLJJ.LJJIL() instanceof C362870EKn) && this.LLJJIJIIJIL) {
            this.LLJJIJIIJIL = false;
            LJJJJJL(new AwS549S0100000_5(this, 1135));
            return true;
        }
        return super.LLLLJI(f);
    }

    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LLLZLZ(b bVar) {
        if (Math.abs(bVar.LJI() - this.LLJJJIL.x) <= this.LLJJJ && Math.abs(bVar.LJI() - this.LLJJJIL.x) <= this.LLJJJ) {
            return true;
        }
        return super.LLLZLZ(bVar);
    }

    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (LJJJJ() && motionEvent != null) {
            LJJJJZI();
            super.onDown(motionEvent);
        }
        return false;
    }

    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        boolean z;
        LJJJJZI();
        if (!LJJJJ()) {
            this.LLJJIJIIJIL = false;
            return false;
        }
        RectF visibleRectWithoutRotation = LJJJIL().LIZ.getVisibleRectWithoutRotation();
        MotionEvent motionEvent = this.LLIZLLLIL;
        if (motionEvent != null && (LJJIL() || C121Q.LIZ(motionEvent.getX(), motionEvent.getY(), LJJJIL().LIZ.getRotation(), visibleRectWithoutRotation, 0.0f))) {
            z = true;
        } else {
            z = false;
        }
        if (!LJJIL() && !C121Q.LIZ(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), LJJJIL().LIZ.getRotation(), visibleRectWithoutRotation, C418440Gaw.LIZIZ(3)) && !z) {
            this.LLJJIJIIJIL = false;
            return false;
        }
        LJJJJL(new AwS584S0100000_5(this, 931));
        LJJJJZ();
        this.LLJJIJIIJIL = true;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, android.graphics.RectF] */
    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.LLJJJJJIL = true;
        LJJJJZI();
        C259800zU c259800zU = new C259800zU();
        ?? visibleRectWithoutRotation = LJJJIL().LIZ.getVisibleRectWithoutRotation();
        c259800zU.element = visibleRectWithoutRotation;
        if (C121Q.LIZ(motionEvent.getX(), motionEvent.getY(), LJJJIL().LIZ.getRotation(), visibleRectWithoutRotation, 0.0f)) {
            if (!LJJJJ()) {
                LJJJJL(new AwS584S0100000_5(this, 932));
                this.LLJJJJJIL = false;
                return false;
            }
            for (C0FUD c0fud : this.LLILZ) {
                int id = LJJJIL().LIZ.getId();
                LJJJIL().LIZ.getType();
                motionEvent.getX();
                motionEvent.getY();
                new RectF((RectF) c259800zU.element);
                if (c0fud.LJJIIJ(id)) {
                    this.LLJJJJJIL = false;
                    return true;
                }
            }
            LJJJJL(new AwS214S0300000_5(this, (C0FUF) motionEvent, (MotionEvent) c259800zU, (C259800zU<RectF>) 32));
            this.LLJJJJJIL = false;
            return true;
        }
        this.LLJJJJJIL = false;
        return false;
    }

    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onUp(MotionEvent motionEvent) {
        if (motionEvent == null || !LJJJJ()) {
            return false;
        }
        this.LLIZLLLIL = null;
        LJJJJJL(new AwS406S0200000_5(this, motionEvent, 111));
        return false;
    }

    public C0FUF(C0FEL c0fel, C390420FSm c390420FSm, C1664680tQA<LyricStickerModel> c1664680tQA) {
        super(c0fel.LJJIJ(), c390420FSm);
        this.LLJJ = c0fel;
        this.LLJJI = c390420FSm;
        this.LLJJIII = c1664680tQA;
        this.LLJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        this.LLJJJIL = new PointF();
        this.LLJJJJ = C418440Gaw.LIZIZ(8);
        this.LLJJJJLIIL = true;
    }

    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LLLLLLLLL(b bVar, float f, float f2) {
        LJJJJZI();
        boolean zLLLLLLLLL = super.LLLLLLLLL(bVar, f, f2);
        this.LLJJIJI = zLLLLLLLLL;
        if (zLLLLLLLLL) {
            LJJJJZ();
            this.LLJJJIL = new PointF(f, f2);
        }
        return this.LLJJIJI;
    }
}

package X;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.info.InfoStickerModel;
import kotlin.jvm.internal.AwS214S0300000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import zoo.b;

/* JADX INFO: renamed from: X.0FTt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C390750FTt extends C0FUE {
    public final C0FFP LLJJ;
    public final C1664680tQA<BaseStickerModel> LLJJI;
    public final C390420FSm LLJJIII;
    public final C1664680tQA<C0FFO> LLJJIJI;
    public final C0EPF LLJJIJIIJIL;
    public final C1664680tQA<InfoStickerModel> LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;

    @Override // X.C0FUE
    public final boolean LJJIL() {
        C0FEQ c0feqLJFF = ((InterfaceC388760FMc) this.LLJJIII.LIZIZ(C13LE.LIZ(InterfaceC388760FMc.class))).LJFF();
        return c0feqLJFF != null && c0feqLJFF.LIZIZ(this.LLJJIJIL.LIZ.getBaseStickerModel().getId()) && LJJJJ();
    }

    @Override // X.C0FUE
    public final boolean LJJJ() {
        C0EPF c0epf = this.LLJJIJIIJIL;
        return c0epf != null && c0epf.LIZJ;
    }

    @Override // X.C0FUE
    public final boolean LJJJJ() {
        C0FEQ c0feqLJFF;
        if (this.LLJJIJIL.LIZ.getEnableGesture() && ((c0feqLJFF = ((InterfaceC388760FMc) this.LLJJIII.LIZIZ(C13LE.LIZ(InterfaceC388760FMc.class))).LJFF()) == null || !c0feqLJFF.LIZ(this.LLJJIJIL.LIZ.getBaseStickerModel().getId(), this.LLJJJJJIL))) {
            InterfaceC386690FEd interfaceC386690FEdLIZIZ = ((InterfaceC388760FMc) this.LLJJIII.LIZIZ(C13LE.LIZ(InterfaceC388760FMc.class))).LIZIZ();
            int iLLL = interfaceC386690FEdLIZIZ != null ? interfaceC386690FEdLIZIZ.LLL() : 0;
            if (this.LLJJI.LIZ.getVisible()) {
                int startTime = (int) this.LLJJI.LIZ.getStartTime();
                if (iLLL <= ((int) this.LLJJI.LIZ.getEndTime()) && startTime <= iLLL && !this.LLJJIJIL.LIZ.isPinning()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void LJJJJZ() {
        C363850EOh c363850EOh;
        if (this.LLJJIJI.LIZ.LJIILIIL && (this.LLJJ instanceof C363850EOh) && LJJJJ()) {
            C0FFP c0ffp = this.LLJJ;
            if (!(c0ffp instanceof C363850EOh) || (c363850EOh = (C363850EOh) c0ffp) == null) {
                return;
            }
            c363850EOh.LJIILIIL(false);
        }
    }

    @Override // X.C0FUE
    public final C1664680tQA<BaseStickerModel> LJJJIL() {
        return this.LLJJI;
    }

    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean E2(C21645419nQ c21645419nQ) {
        LJJJJZ();
        boolean zE2 = super.E2(c21645419nQ);
        this.LLJJJJ = zE2;
        return zE2;
    }

    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LIZIZ(MotionEvent motionEvent) {
        this.LLJJJJJIL = true;
        LJJJJZ();
        boolean zLIZIZ = super.LIZIZ(motionEvent);
        this.LLJJJJJIL = false;
        return zLIZIZ;
    }

    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final void LJFF(b bVar) {
        if ((this.LLJJ instanceof C363850EOh) && this.LLJJJ) {
            this.LLJJJ = false;
            LJJJJL(new AwS584S0100000_5(this, 1186));
        } else {
            super.LJFF(bVar);
        }
    }

    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LJIIIZ(float f) {
        if ((this.LLJJ instanceof C363850EOh) && this.LLJJJJ) {
            this.LLJJJJ = false;
            LJJJJJL(new AwS549S0100000_5(this, 1656));
            return true;
        }
        return super.LJIIIZ(f);
    }

    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LLLLJI(float f) {
        if ((this.LLJJ instanceof C363850EOh) && this.LLJJJIL) {
            this.LLJJJIL = false;
            LJJJJJL(new AwS549S0100000_5(this, 1657));
            return true;
        }
        return super.LLLLJI(f);
    }

    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (LJJJJ() && motionEvent != null) {
            LJJJJZ();
            super.onDown(motionEvent);
        }
        return false;
    }

    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        LJJJJZ();
        boolean zOnScaleBegin = super.onScaleBegin(scaleGestureDetector);
        this.LLJJJIL = zOnScaleBegin;
        return zOnScaleBegin;
    }

    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.LLJJJJJIL = true;
        LJJJJZ();
        RectF visibleRectWithoutRotation = this.LLJJI.LIZ.getVisibleRectWithoutRotation();
        if (C121Q.LIZ(motionEvent.getX(), motionEvent.getY(), this.LLJJI.LIZ.getRotation(), visibleRectWithoutRotation, 0.0f)) {
            if (!LJJJJ()) {
                LJJJJL(new AwS584S0100000_5(this, 1187));
                this.LLJJJJJIL = false;
                return false;
            }
            for (C0FUD c0fud : this.LLILZ) {
                int id = this.LLJJI.LIZ.getId();
                this.LLJJI.LIZ.getType();
                motionEvent.getX();
                motionEvent.getY();
                new RectF(visibleRectWithoutRotation);
                if (c0fud.LJJIIJ(id)) {
                    this.LLJJJJJIL = false;
                    return true;
                }
            }
            LJJJJL(new AwS214S0300000_5(this, motionEvent, visibleRectWithoutRotation, 39));
            this.LLJJJJJIL = false;
            return true;
        }
        this.LLJJJJJIL = false;
        return false;
    }

    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onUp(MotionEvent motionEvent) {
        super.onUp(motionEvent);
        return false;
    }

    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LLLLLLLLL(b bVar, float f, float f2) {
        LJJJJZ();
        boolean zLLLLLLLLL = super.LLLLLLLLL(bVar, f, f2);
        this.LLJJJ = zLLLLLLLLL;
        return zLLLLLLLLL;
    }

    public C390750FTt(C0FFP c0ffp, C1664680tQA c1664680tQA, C390420FSm c390420FSm, C1664680tQA c1664680tQA2, C0EPF c0epf, C1664680tQA c1664680tQA3) {
        super(c1664680tQA, c390420FSm);
        this.LLJJ = c0ffp;
        this.LLJJI = c1664680tQA;
        this.LLJJIII = c390420FSm;
        this.LLJJIJI = c1664680tQA2;
        this.LLJJIJIIJIL = c0epf;
        this.LLJJIJIL = c1664680tQA3;
    }
}

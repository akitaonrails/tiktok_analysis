package X;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.bytedance.ies.cutsame.util.Size;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import zoo.b;

/* JADX INFO: renamed from: X.0nxD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1454530nxD extends C0FUM {
    public final C1454190nwf LL;
    public final NLEEditor LLILLJJLI;
    public final InterfaceC1454560nxG LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZLLLIL;
    public int LLIZ = -1;
    public int LLJ = -1;

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final void LJFF(b bVar) {
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LIZLLL() {
        C1454250nwl.LIZ("CollageGestureController", "onPointerUp");
        return false;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LJ() {
        C1454250nwl.LIZ("CollageGestureController", "onPointerDown");
        return false;
    }

    public final NLETrackSlot LJJIJL() {
        C1454420nx2 c1454420nx2;
        NLETrack nLETrack;
        VecNLETrackSlotSPtr slots;
        int i = this.LLIZ;
        if (i < 0 || (c1454420nx2 = (C1454420nx2) C13LP.LJJJLZIJ(i, this.LL.LIZJ)) == null || (nLETrack = c1454420nx2.LIZIZ) == null || (slots = nLETrack.getSlots()) == null) {
            return null;
        }
        return (NLETrackSlot) C13LP.LJJJLZIJ(0, slots);
    }

    public final void LJJIJIL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("commitThrottled() editor=");
        sbLIZ.append(this.LLILLJJLI != null);
        C1454250nwl.LIZ("CollageGestureController", C2188811AlT.LIZIZ(sbLIZ));
        NLEEditor nLEEditor = this.LLILLJJLI;
        if (nLEEditor != null) {
            nLEEditor.commit();
        }
        NLEEditor nLEEditor2 = this.LLILLJJLI;
        if (nLEEditor2 != null) {
            nLEEditor2.done();
        }
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean E2(C21645419nQ c21645419nQ) {
        boolean z = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRotationBegin ok=");
        sbLIZ.append(z);
        C1454250nwl.LIZ("CollageGestureController", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            this.LLILLL.LJI();
        }
        return z;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LIZIZ(MotionEvent motionEvent) {
        int iLJJIJLIJ = LJJIJLIJ(motionEvent.getX(), motionEvent.getY());
        LJJIL(iLJJIJLIJ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDoubleClick x=");
        sbLIZ.append(motionEvent.getX());
        sbLIZ.append(" y=");
        sbLIZ.append(motionEvent.getY());
        sbLIZ.append(" select idx=");
        sbLIZ.append(iLJJIJLIJ);
        C1454250nwl.LIZ("CollageGestureController", C2188811AlT.LIZIZ(sbLIZ));
        if (iLJJIJLIJ >= 0) {
            return true;
        }
        return false;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LJIIIZ(float f) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRotationEnd delta=");
        sbLIZ.append(f);
        C1454250nwl.LIZ("CollageGestureController", C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }

    public final void LJJIL(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("select index=");
        sbLIZ.append(i);
        C1454250nwl.LIZ("CollageGestureController", C2188811AlT.LIZIZ(sbLIZ));
        this.LLIZ = i;
        if (i >= 0) {
            LJJIZ(i);
        } else {
            C1454250nwl.LIZ("CollageGestureController", "clearHighlight");
            this.LLILLL.LJII();
        }
    }

    public final void LJJIZ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showHighlight index=");
        sbLIZ.append(i);
        sbLIZ.append(" rect=");
        sbLIZ.append(C13LP.LJJJLZIJ(i, this.LL.LIZIZ));
        C1454250nwl.LIZ("CollageGestureController", C2188811AlT.LIZIZ(sbLIZ));
        RectF rectF = (RectF) C13LP.LJJJLZIJ(i, this.LL.LIZIZ);
        if (rectF != null) {
            this.LLILLL.LJFF(rectF, i);
        }
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LJJLIIIJLJLI(float f) {
        if (!this.LLILZIL) {
            C1454250nwl.LIZ("CollageGestureController", "onScale skipped: no startGesture");
            return false;
        }
        NLETrackSlot nLETrackSlotLJJIJL = LJJIJL();
        if (nLETrackSlotLJJIJL == null) {
            C1454250nwl.LIZ("CollageGestureController", "onRotation skipped: no selectedSlot");
            return false;
        }
        float rotation = nLETrackSlotLJJIJL.getRotation();
        float degrees = (float) Math.toDegrees(f);
        if (Math.abs(degrees) > 10.0f) {
            degrees = 0.0f;
        }
        nLETrackSlotLJJIJL.setRotation(rotation + degrees);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRotation delta=");
        sbLIZ.append(f);
        sbLIZ.append(" degree");
        sbLIZ.append(degrees);
        sbLIZ.append(" old=");
        sbLIZ.append(rotation);
        sbLIZ.append(" new=");
        sbLIZ.append(nLETrackSlotLJJIJL.getRotation());
        C1454250nwl.LIZ("CollageGestureController", C2188811AlT.LIZIZ(sbLIZ));
        LJJIJIL();
        return true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LLLLJI(float f) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onScaleEnd factor=");
        sbLIZ.append(f);
        C1454250nwl.LIZ("CollageGestureController", C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LLLZLZ(b bVar) {
        float x;
        boolean z;
        boolean z2;
        boolean z3;
        if (!this.LLILZIL) {
            C1454250nwl.LIZ("CollageGestureController", "onMove skipped: no startGesture");
            return false;
        }
        NLETrackSlot nLETrackSlotLJJIJL = LJJIJL();
        if (nLETrackSlotLJJIJL == null) {
            C1454250nwl.LIZ("CollageGestureController", "onMove skipped: no selectedSlot");
            return false;
        }
        this.LLILZ = true;
        float f = bVar.LJIIJJI.x;
        MotionEvent motionEvent = bVar.LIZIZ;
        float y = -1.0f;
        if (motionEvent == null) {
            x = -1.0f;
        } else {
            x = motionEvent.getX();
        }
        float f2 = f + x;
        float f3 = bVar.LJIIJJI.y;
        MotionEvent motionEvent2 = bVar.LIZIZ;
        if (motionEvent2 != null) {
            y = motionEvent2.getY();
        }
        float f4 = f3 + y;
        int iLJJIJLIJ = LJJIJLIJ(f2, f4);
        if (bVar.LJIIL > 1) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMove swapMode ");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", pointer=(");
        sbLIZ.append(f2);
        sbLIZ.append(',');
        sbLIZ.append(f4);
        sbLIZ.append(") target=");
        sbLIZ.append(iLJJIJLIJ);
        sbLIZ.append(" isTwoFinger=");
        sbLIZ.append(z);
        C1454250nwl.LIZ("CollageGestureController", C2188811AlT.LIZIZ(sbLIZ));
        int i = this.LLIZ;
        if (iLJJIJLIJ != i && !z && this.LLILZLL) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (iLJJIJLIJ == i && !z) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LLILZLL = z3;
        if (!this.LLIZLLLIL && z2) {
            this.LLJ = i;
            this.LLILLL.LIZLLL(i);
            NLETrackSlot nLETrackSlotLJJIJL2 = LJJIJL();
            if (nLETrackSlotLJJIJL2 != null) {
                C351220Dpo.LLLLLILLIL(nLETrackSlotLJJIJL2, 0.0f);
            }
            LJJIJIL();
            this.LLIZLLLIL = true;
        }
        if (this.LLIZLLLIL) {
            if (iLJJIJLIJ >= 0) {
                this.LLJ = iLJJIJLIJ;
            }
            int i2 = this.LLJ;
            if (i2 >= 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("showSwapTarget index=");
                sbLIZ2.append(i2);
                sbLIZ2.append(" rect=");
                sbLIZ2.append(C13LP.LJJJLZIJ(i2, this.LL.LIZIZ));
                C1454250nwl.LIZ("CollageGestureController", C2188811AlT.LIZIZ(sbLIZ2));
                RectF rectF = (RectF) C13LP.LJJJLZIJ(i2, this.LL.LIZIZ);
                if (rectF != null) {
                    this.LLILLL.LJFF(rectF, i2);
                }
                this.LLILLL.LIZ(false);
            }
            this.LLILLL.LJ(f2, f4);
            return true;
        }
        PointF pointF = bVar.LJIIJJI;
        float f5 = pointF.x;
        float f6 = pointF.y;
        Size size = this.LL.LIZ;
        float f7 = f5 / size.width;
        float f8 = (-(-f6)) / size.height;
        nLETrackSlotLJJIJL.setTransformX(nLETrackSlotLJJIJL.getTransformX() + f7);
        nLETrackSlotLJJIJL.setTransformY(nLETrackSlotLJJIJL.getTransformY() + f8);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("onMove dx=");
        sbLIZ3.append(f5);
        sbLIZ3.append(" dy=");
        sbLIZ3.append(f6);
        sbLIZ3.append(" -> trans+=(");
        sbLIZ3.append(f7);
        sbLIZ3.append(',');
        sbLIZ3.append(f8);
        sbLIZ3.append(") new=(");
        sbLIZ3.append(nLETrackSlotLJJIJL.getTransformX());
        sbLIZ3.append(',');
        sbLIZ3.append(nLETrackSlotLJJIJL.getTransformY());
        sbLIZ3.append(')');
        C1454250nwl.LIZ("CollageGestureController", C2188811AlT.LIZIZ(sbLIZ3));
        LJJIJIL();
        return true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        boolean z;
        int iLJJIJLIJ = LJJIJLIJ(motionEvent.getX(), motionEvent.getY());
        int i = this.LLIZ;
        if (i >= 0 && i == iLJJIJLIJ) {
            z = true;
            this.LLILLL.LIZ(false);
        } else {
            z = false;
        }
        this.LLILZIL = z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDown x=");
        sbLIZ.append(motionEvent.getX());
        sbLIZ.append(" y=");
        sbLIZ.append(motionEvent.getY());
        sbLIZ.append(" startGesture=");
        sbLIZ.append(this.LLILZIL);
        C1454250nwl.LIZ("CollageGestureController", C2188811AlT.LIZIZ(sbLIZ));
        return true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        Float fLJIIIIZZ;
        if (!this.LLILZIL) {
            C1454250nwl.LIZ("CollageGestureController", "onScale skipped: no startGesture");
            return false;
        }
        NLETrackSlot nLETrackSlotLJJIJL = LJJIJL();
        if (nLETrackSlotLJJIJL == null) {
            C1454250nwl.LIZ("CollageGestureController", "onScale skipped: no selectedSlot");
            return false;
        }
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float scale = nLETrackSlotLJJIJL.getScale();
        float f = scale * scaleFactor;
        String extra = nLETrackSlotLJJIJL.getExtra("collage_min_scale");
        Float fLJIIIIZZ2 = null;
        if (extra != null) {
            fLJIIIIZZ = C2327809Ae.LJIIIIZZ(extra);
        } else {
            fLJIIIIZZ = null;
        }
        String extra2 = nLETrackSlotLJJIJL.getExtra("collage_max_scale");
        if (extra2 != null) {
            fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ(extra2);
        }
        if (fLJIIIIZZ != null && fLJIIIIZZ2 != null) {
            if (f < fLJIIIIZZ.floatValue() || f > fLJIIIIZZ2.floatValue()) {
                C1454250nwl.LIZ("CollageGestureController", "onScale skipped: scale out of range");
                return false;
            }
        } else {
            C1454250nwl.LIZ("CollageGestureController", "onScale skipped: no minScale or maxScale");
        }
        nLETrackSlotLJJIJL.setScale(f);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onScale factor=");
        sbLIZ.append(scaleFactor);
        sbLIZ.append(" old=");
        sbLIZ.append(scale);
        sbLIZ.append(" new=");
        sbLIZ.append(nLETrackSlotLJJIJL.getScale());
        sbLIZ.append(" focus=(");
        sbLIZ.append(scaleGestureDetector.getFocusX());
        sbLIZ.append(',');
        sbLIZ.append(scaleGestureDetector.getFocusY());
        sbLIZ.append(')');
        C1454250nwl.LIZ("CollageGestureController", C2188811AlT.LIZIZ(sbLIZ));
        LJJIJIL();
        return true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        boolean z = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onScaleBegin ok=");
        sbLIZ.append(z);
        sbLIZ.append(" focus=(");
        sbLIZ.append(scaleGestureDetector.getFocusX());
        sbLIZ.append(',');
        sbLIZ.append(scaleGestureDetector.getFocusY());
        sbLIZ.append(')');
        C1454250nwl.LIZ("CollageGestureController", C2188811AlT.LIZIZ(sbLIZ));
        return z;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        int iLJJIJLIJ = LJJIJLIJ(motionEvent.getX(), motionEvent.getY());
        LJJIL(iLJJIJLIJ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSingleTapConfirmed select idx=");
        sbLIZ.append(iLJJIJLIJ);
        C1454250nwl.LIZ("CollageGestureController", C2188811AlT.LIZIZ(sbLIZ));
        if (iLJJIJLIJ >= 0) {
            return true;
        }
        return false;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSingleTapUp x=");
        sbLIZ.append(motionEvent.getX());
        sbLIZ.append(" y=");
        sbLIZ.append(motionEvent.getY());
        C1454250nwl.LIZ("CollageGestureController", C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onUp(MotionEvent motionEvent) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUp x=");
        sbLIZ.append(motionEvent.getX());
        sbLIZ.append(" y=");
        sbLIZ.append(motionEvent.getY());
        sbLIZ.append(" inSwapMode=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(" selected=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(" candidate=");
        sbLIZ.append(this.LLJ);
        C1454250nwl.LIZ("CollageGestureController", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLIZLLLIL) {
            this.LLILLL.LIZJ();
            NLETrackSlot nLETrackSlotLJJIJL = LJJIJL();
            if (nLETrackSlotLJJIJL != null) {
                C351220Dpo.LLLLLILLIL(nLETrackSlotLJJIJL, 1.0f);
            }
            this.LLIZLLLIL = false;
            int i = this.LLIZ;
            int i2 = this.LLJ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("swapByIndex a=");
            sbLIZ2.append(i);
            sbLIZ2.append(" b=");
            sbLIZ2.append(i2);
            C1454250nwl.LIZ("CollageGestureController", C2188811AlT.LIZIZ(sbLIZ2));
            this.LLILLL.LIZIZ(i, i2);
            this.LLIZ = this.LLJ;
        }
        this.LLJ = -1;
        int i3 = this.LLIZ;
        if (i3 >= 0) {
            LJJIZ(i3);
        } else {
            C1454250nwl.LIZ("CollageGestureController", "clearHighlight");
            this.LLILLL.LJII();
        }
        this.LLILLL.LIZ(true);
        this.LLILZ = false;
        return true;
    }

    public final int LJJIJLIJ(float f, float f2) {
        C1454190nwf c1454190nwf = this.LL;
        int iLJIIJ = C1697810uHb.LJIIJ(c1454190nwf.LIZIZ);
        while (true) {
            if (-1 < iLJIIJ) {
                RectF rectF = (RectF) ListProtector.get(c1454190nwf.LIZIZ, iLJIIJ);
                if (rectF != null && rectF.contains(f, f2)) {
                    break;
                }
                iLJIIJ--;
            } else {
                iLJIIJ = -1;
                break;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hitIndex x=");
        sbLIZ.append(f);
        sbLIZ.append(" y=");
        sbLIZ.append(f2);
        sbLIZ.append(" -> idx=");
        sbLIZ.append(iLJIIJ);
        C1454250nwl.LIZ("CollageGestureController", C2188811AlT.LIZIZ(sbLIZ));
        return iLJIIJ;
    }

    public C1454530nxD(C1454190nwf c1454190nwf, NLEEditor nLEEditor, InterfaceC1454560nxG interfaceC1454560nxG) {
        this.LL = c1454190nwf;
        this.LLILLJJLI = nLEEditor;
        this.LLILLL = interfaceC1454560nxG;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LLLLLLLLL(b bVar, float f, float f2) {
        boolean z = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMoveBegin downX=");
        sbLIZ.append(f);
        sbLIZ.append(" downY=");
        sbLIZ.append(f2);
        sbLIZ.append(" selected=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(" enable=");
        sbLIZ.append(z);
        C1454250nwl.LIZ("CollageGestureController", C2188811AlT.LIZIZ(sbLIZ));
        return z;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFling vx=");
        sbLIZ.append(f);
        sbLIZ.append(" vy=");
        sbLIZ.append(f2);
        C1454250nwl.LIZ("CollageGestureController", C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onScroll distanceX=");
        sbLIZ.append(f);
        sbLIZ.append(" distanceY=");
        sbLIZ.append(f2);
        C1454250nwl.LIZ("CollageGestureController", C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }
}

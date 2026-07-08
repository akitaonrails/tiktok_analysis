package X;

import Y.ACListenerS167S0100000_33;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS129S0100000_29;
import Y.ARunnableS133S0100000_33;
import Y.ATListenerS340S0200000_16;
import Y.ATListenerS465S0100000_33;
import Y.AUListenerS11S0600000_33;
import Y.AUListenerS265S0100000_16;
import Y.AUListenerS280S0100000_33;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.createx.editor.gesture.GestureInteractItem;
import com.bytedance.ies.cutsame.util.Size;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.image.thumbnail.CenterLinearLayoutManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS116S1200000_33;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.AwS87S0500000_33;
import kotlin.jvm.internal.Intrinsics;
import zoo.b;

/* JADX INFO: renamed from: X.19qd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21665319qd extends AbstractC1664490tPr<C21665619qg, C12QU> {
    public View LLJLL;
    public TuxIconView LLJLLIL;
    public TuxIconView LLJLLL;
    public TuxIconView LLJZ;
    public View LLJZIJLIL;
    public View LLL;
    public RecyclerView LLLF;
    public boolean LLLI;
    public float LLLII;
    public float LLLIIII;
    public C1077050e8N LLLIIIIL;
    public ValueAnimator LLLILZJ;
    public final ValueAnimator LLLILZLLLI;
    public final SafeHandler LLLIZZ;
    public boolean LLLJ;
    public boolean LLLJIL;
    public boolean LLLJL;
    public final C21664119qR LLLL;
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3653));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3654));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3665));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3658));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3659));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3655));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3663));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3661));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 618));
    public boolean LLLFF = true;
    public int LLLFFI = -1;
    public final C21665919qj LLLFZ = new C21665919qj();
    public final C01GW LLLIIIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3656));
    public final C01GW LLLIIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3657));
    public final C01GW LLLIILIL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(521));
    public final C01GW LLLIL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(520));
    public final C01GW LLLILZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 619));

    public final void LLLLLJLJLL() {
        this.LLLIZZ.removeCallbacksAndMessages(null);
        this.LLLILZLLLI.cancel();
        this.LLLIZZ.postDelayed(new ARunnableS133S0100000_33(this, 76), 50L);
        this.LLLIZZ.postDelayed(new ARunnableS129S0100000_29(this, 105), 150L);
    }

    public final View LLLLLLIL() {
        return (View) this.LLJJJJ.getValue();
    }

    public final int LLLLLLJ() {
        return ((Number) this.LLLIIIL.getValue()).intValue();
    }

    public final int LLLLLLL() {
        return ((Number) this.LLLIIL.getValue()).intValue();
    }

    public final C1450520nqk LLLLLLLLL() {
        float f;
        this.LLLFZ.getClass();
        float f2 = 0.0f;
        List listLIZIZ = C19LC.LIZIZ(C21628919kl.LIZJ(new RectF(LLLLLLLZIL().getRect())), new RectF(0.0f, 0.0f, r3.LIZJ, r3.LIZLLL), LLLLLLZZ().getImageMatrix());
        float f3 = 360;
        float f4 = C19LC.LIZLLL(LLLLLLZZ().getImageMatrix()).LIZIZ % f3;
        float f5 = -1.0f;
        if (this.LLLI) {
            Matrix matrix = new Matrix(LLLLLLZZ().getImageMatrix());
            matrix.postScale(-1.0f, 1.0f, LLLLLLJ(), LLLLLLL());
            f4 = (-C19LC.LIZLLL(matrix).LIZIZ) % f3;
        }
        float f6 = -f4;
        RectF rectFLIZIZ = C21628919kl.LIZIZ(LLLLLLZZ(), f6, LLLLLLJ(), LLLLLLL());
        C21665919qj c21665919qj = this.LLLFZ;
        c21665919qj.getClass();
        RectF rectF = new RectF(0.0f, 0.0f, c21665919qj.LIZJ, c21665919qj.LIZLLL);
        c21665919qj.LIZ.mapRect(rectF, rectF);
        C21666819qs c21666819qsLJ = C21664919qZ.LJ(rectF, rectFLIZIZ);
        Size size = LLLLILI().LIZ.LIZLLL;
        float fLIZJ = size != null ? C21664919qZ.LIZJ(new RectF(LLLLLLLZIL().getRect()), rectFLIZIZ, size) : 1.0f;
        Size size2 = LLLLILI().LIZ.LIZLLL;
        C21666819qs c21666819qsLIZLLL = size2 != null ? C21664919qZ.LIZLLL(new RectF(LLLLLLLZIL().getRect()), C21628919kl.LIZ(LLLLLLZZ()), size2) : null;
        boolean z = (this.LLLFFI == 5 && LLLLLLLZIL().getCurrentRatio() == this.LLLFZ.LIZ()) ? false : true;
        int i = this.LLLFFI;
        float currentRatio = LLLLLLLZIL().getCurrentRatio();
        float f7 = this.LLLIIII;
        Matrix matrix2 = new Matrix(LLLLLLZZ().getImageMatrix());
        float f8 = this.LLLII;
        boolean z2 = this.LLLI;
        if (c21666819qsLIZLLL != null) {
            f2 = c21666819qsLIZLLL.LIZJ;
            f = c21666819qsLIZLLL.LIZLLL;
        } else {
            f = 0.0f;
        }
        float f9 = c21666819qsLJ.LIZ;
        if (f9 < 1.0f) {
            f9 = 1.0f;
        }
        float cropRectMaxWidth = c21666819qsLJ.LIZJ / LLLLLLLZIL().getCropRectMaxWidth();
        if (cropRectMaxWidth < -1.0f) {
            cropRectMaxWidth = -1.0f;
        } else if (cropRectMaxWidth > 1.0f) {
            cropRectMaxWidth = 1.0f;
        }
        float cropRectMaxHeight = c21666819qsLJ.LIZLLL / LLLLLLLZIL().getCropRectMaxHeight();
        if (cropRectMaxHeight >= -1.0f) {
            f5 = cropRectMaxHeight;
            if (f5 > 1.0f) {
                f5 = 1.0f;
            }
        }
        return new C1450520nqk(listLIZIZ, i, currentRatio, f7, matrix2, f8, z2, f6, fLIZJ, f2, f, f9, cropRectMaxWidth, f5, z);
    }

    public final C1561420qjc LLLLLLLLLL() {
        C1561420qjc c1561420qjc = new C1561420qjc();
        c1561420qjc.LIZ = LLLLILI().LIZ.LJ ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(222)) : LLLLILI().LIZ.LJFF ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(226)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(158));
        return c1561420qjc;
    }

    public final C389830FQf LLLLLLLZIL() {
        return (C389830FQf) this.LLJJJJLIIL.getValue();
    }

    public final C340070DUv LLLLLLZ() {
        return (C340070DUv) this.LLLIL.getValue();
    }

    public final ImageView LLLLLLZZ() {
        return (ImageView) this.LLJLIL.getValue();
    }

    public final C416080GTe LLLLLZL() {
        return (C416080GTe) this.LLLIILIL.getValue();
    }

    public final boolean LLLLZ() {
        return !this.LLLFF || this.LLLJL;
    }

    public final void LLLLZLLIL() {
        if (this.LLLJ && this.LLLJIL) {
            C337180DJs.LIZJ(LLLLLLZZ());
            C337180DJs.LIZJ((View) this.LLJJJIL.getValue());
            C337180DJs.LIZJ(LLLLLLLZIL());
        }
    }

    public final void LLLLZLLLI() {
        this.LLLIZZ.removeCallbacksAndMessages(null);
        this.LLLILZLLLI.cancel();
        LLLLLZL().LJFF = true;
        LLLLLZL().LJ = C157B.LIZ(0.5f);
        LLLLLLIL().setBackgroundColor(C157B.LIZ(0.5f));
        LLLLLLLZIL().invalidate();
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [X.19qR] */
    public C21665319qd() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.5f, 1.0f);
        this.LLLILZLLLI = valueAnimatorOfFloat;
        this.LLLIZZ = new SafeHandler(this);
        this.LLLJ = true;
        this.LLLJIL = true;
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS280S0100000_33(this, 26));
        this.LLLL = new C0FUM() { // from class: X.19qR
            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LLLZLZ(b bVar) {
                PointF pointF;
                if (bVar != null && (pointF = bVar.LJIIJJI) != null) {
                    C21665319qd c21665319qd = this.LL;
                    float f = (int) pointF.x;
                    float f2 = (int) pointF.y;
                    c21665319qd.getClass();
                    Matrix matrix = new Matrix(c21665319qd.LLLLLLZZ().getImageMatrix());
                    matrix.postTranslate(f, f2);
                    c21665319qd.LLLLLLZZ().setImageMatrix(matrix);
                }
                C21665319qd c21665319qd2 = this.LL;
                c21665319qd2.LLLJL = true;
                c21665319qd2.LLLLLL(false);
                return true;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                if (scaleGestureDetector == null) {
                    return false;
                }
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                RectF rectFLIZ = C21628919kl.LIZ(this.LL.LLLLLLZZ());
                C21665319qd c21665319qd = this.LL;
                if (rectFLIZ.width() / ((InterfaceC21664319qT) c21665319qd.LLJJL.getValue()).LIZ().width() >= 0.8f && rectFLIZ.height() / ((InterfaceC21664319qT) c21665319qd.LLJJL.getValue()).LIZ().height() >= 0.8f) {
                    if (C295760BiY.LIZ() && scaleFactor > 1.0f) {
                        Rect rectLIZ = ((InterfaceC21664319qT) c21665319qd.LLJJL.getValue()).LIZ();
                        float fWidth = rectLIZ.width() / (rectFLIZ.width() * scaleFactor);
                        float fHeight = rectLIZ.height() / (rectFLIZ.height() * scaleFactor);
                        if (fWidth < 0.1f || fHeight < 0.1f) {
                            return true;
                        }
                    }
                    c21665319qd.LLLLZLL(scaleFactor, focusX, focusY);
                }
                return true;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                this.LL.LLLLZLLLI();
                return true;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onUp(MotionEvent motionEvent) {
                C21665319qd c21665319qd = this.LL;
                if (c21665319qd.LLLIIII == 0.0f) {
                    c21665319qd.LLLLZIL();
                    C21665319qd c21665319qd2 = this.LL;
                    c21665319qd2.LLLJL = false;
                    c21665319qd2.LLLLLL(true);
                    this.LL.LLLLLJLJLL();
                    return true;
                }
                AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c21665319qd, 3660);
                List listLJFF = C21664919qZ.LJFF(new RectF(c21665319qd.LLLLLLLZIL().getRect()), c21665319qd.LLLIIII);
                if (C21664919qZ.LJI(listLJFF, C21628919kl.LIZIZ(c21665319qd.LLLLLLZZ(), c21665319qd.LLLIIII, c21665319qd.LLLLLLJ(), c21665319qd.LLLLLLL()))) {
                    RectF rectFLIZ = C21628919kl.LIZ(c21665319qd.LLLLLLZZ());
                    float fLLLLLLJ = c21665319qd.LLLLLLJ() - rectFLIZ.centerX();
                    float fLLLLLLL = c21665319qd.LLLLLLL() - rectFLIZ.centerY();
                    Matrix matrix = new Matrix(c21665319qd.LLLLLLZZ().getImageMatrix());
                    matrix.postTranslate(fLLLLLLJ, fLLLLLLL);
                    c21665319qd.LLLLLLZZ().setImageMatrix(matrix);
                    c21665319qd.LLLLZLL(C21664919qZ.LIZIZ(listLJFF, C21628919kl.LIZIZ(c21665319qd.LLLLLLZZ(), c21665319qd.LLLIIII, c21665319qd.LLLLLLJ(), c21665319qd.LLLLLLL()), c21665319qd.LLLLLLJ(), c21665319qd.LLLLLLL()), c21665319qd.LLLLLLJ(), c21665319qd.LLLLLLL());
                }
                awS577S0100000_33.invoke();
                return true;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LLLLLLLLL(b bVar, float f, float f2) {
                this.LL.LLLLZLLLI();
                return true;
            }
        };
    }

    public final void LLLLLJIL() {
        C21665819qi c21665819qi;
        exit();
        if (LLLLILI().LIZ.LJ) {
            C1402680mba c1402680mba = C1402680mba.LIZ;
            VideoPublishEditModel videoPublishEditModelLLLLLZ = LLLLLZ();
            c1402680mba.getClass();
            C0LAB c0labLIZIZ = C1402680mba.LIZIZ(videoPublishEditModelLLLLLZ);
            C1402680mba.LIZ(videoPublishEditModelLLLLLZ, c0labLIZIZ);
            C20684815ws.LJIILLIIL("click_cancel_cropping", c0labLIZIZ.LIZ);
            return;
        }
        C375830EoP<C21665819qi> c375830EoP = LLLLILI().LIZ.LJII;
        if (c375830EoP == null || (c21665819qi = c375830EoP.LIZ) == null) {
            C1402680mba c1402680mba2 = C1402680mba.LIZ;
            VideoPublishEditModel videoPublishEditModelLLLLLZ2 = LLLLLZ();
            c1402680mba2.getClass();
            C1402680mba.LIZLLL(videoPublishEditModelLLLLLZ2, "click_cancel_cropping", "", false, false, false, false);
            return;
        }
        Float f = c21665819qi.LIZJ;
        boolean z = (c21665819qi.LIZIZ == 5 && (f != null ? f.floatValue() : this.LLLFZ.LIZ()) == this.LLLFZ.LIZ()) ? false : true;
        C1402680mba c1402680mba3 = C1402680mba.LIZ;
        VideoPublishEditModel videoPublishEditModelLLLLLZ3 = LLLLLZ();
        boolean z2 = !(c21665819qi.LIZLLL == 0.0f);
        boolean z3 = c21665819qi.LJI;
        boolean z4 = c21665819qi.LJFF % ((float) 360) == 0.0f;
        String strLIZ = C1447420nlk.LIZ(c21665819qi.LIZIZ);
        c1402680mba3.getClass();
        C1402680mba.LIZLLL(videoPublishEditModelLLLLLZ3, "click_cancel_cropping", strLIZ, z, z2, z3, !z4);
    }

    public final VideoPublishEditModel LLLLLZ() {
        return LLLLILI().LIZ.LIZ;
    }

    public final void LLLLZIL() {
        RectF rectF = new RectF(LLLLLLLZIL().getRect());
        RectF rectFLIZ = C21628919kl.LIZ(LLLLLLZZ());
        if (rectFLIZ.contains(rectF)) {
            return;
        }
        Matrix matrixLIZJ = C19LC.LIZJ(LLLLLLZZ().getImageMatrix(), rectFLIZ, rectF);
        Matrix imageMatrix = LLLLLLZZ().getImageMatrix();
        Matrix matrix = new Matrix();
        imageMatrix.invert(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setConcat(matrixLIZJ, matrix);
        C19LC.LIZLLL(matrix2);
        LLLLLL(false);
        C21511519Gn.LIZ(LLLLLLZZ(), new Matrix(LLLLLLZZ().getImageMatrix()), matrixLIZJ, 0L, new AwS577S0100000_33(this, 3662), 24);
    }

    public final void exit() {
        View viewLLLLLLIL;
        if (C1428470nHB.LJJZZI(LLLLLZ())) {
            C337180DJs.LIZIZ(LLLLLLZZ());
            C337180DJs.LIZIZ((View) this.LLJJJIL.getValue());
            C337180DJs.LIZIZ(LLLLLLLZIL());
            viewLLLLLLIL = LLLLLLIL();
        } else {
            viewLLLLLLIL = (View) this.LLJJJJJIL.getValue();
        }
        LLLLIL().LIZ.invoke();
        C12C5.LJ(viewLLLLLLIL, 0L, LLLLLLIL().getHeight(), C1619980sG4.LJIILIIL(), new AwS573S0100000_29(this, 617), 9);
    }

    public final void LLLLLL(boolean z) {
        this.LLLFF = z;
        LLLLIL().LJ.invoke(Boolean.valueOf(z));
    }

    public final void LLLZ(boolean z) {
        if (z) {
            TuxIconView tuxIconView = this.LLJLLIL;
            if (tuxIconView != null) {
                C157B.LIZIZ(tuxIconView, true);
            }
            C1402680mba c1402680mba = C1402680mba.LIZ;
            VideoPublishEditModel videoPublishEditModelLLLLLZ = LLLLLZ();
            c1402680mba.getClass();
            C0LAB c0labLIZIZ = C1402680mba.LIZIZ(videoPublishEditModelLLLLLZ);
            c0labLIZIZ.LIZ(1, "if_on");
            C20684815ws.LJIILLIIL("click_angle_icon", c0labLIZIZ.LIZ);
            RecyclerView recyclerView = this.LLLF;
            if (recyclerView != null) {
                C12C5.LIZJ(recyclerView, 150L, C1619980sG4.LJIILIIL(), null, 10);
            }
            View view = this.LLJZIJLIL;
            if (view != null) {
                C12C5.LIZIZ(view, 150L, 0.0f, C1619980sG4.LJIILIIL(), 2);
                return;
            }
            return;
        }
        TuxIconView tuxIconView2 = this.LLJLLIL;
        if (tuxIconView2 != null) {
            C157B.LIZIZ(tuxIconView2, false);
        }
        C1402680mba c1402680mba2 = C1402680mba.LIZ;
        VideoPublishEditModel videoPublishEditModelLLLLLZ2 = LLLLLZ();
        c1402680mba2.getClass();
        C0LAB c0labLIZIZ2 = C1402680mba.LIZIZ(videoPublishEditModelLLLLLZ2);
        c0labLIZIZ2.LIZ(0, "if_on");
        C20684815ws.LJIILLIIL("click_angle_icon", c0labLIZIZ2.LIZ);
        RecyclerView recyclerView2 = this.LLLF;
        if (recyclerView2 != null) {
            C12C5.LIZIZ(recyclerView2, 150L, 0.0f, C1619980sG4.LJIILIIL(), 2);
        }
        View view2 = this.LLJZIJLIL;
        if (view2 == null) {
            return;
        }
        C12C5.LIZJ(view2, 150L, C1619980sG4.LJIILIIL(), new AwS577S0100000_33(this, 3664), 2);
    }

    public final void LLLZI(C21665819qi c21665819qi) {
        Object c098200Yq;
        if (this.mView == null) {
            return;
        }
        try {
            this.LLLJ = false;
            String str = c21665819qi.LIZ;
            int i = c21665819qi.LIZIZ;
            EnumC375190EnN enumC375190EnNLIZ = C375130EnH.LIZ(i);
            Float f = c21665819qi.LIZJ;
            Matrix matrix = c21665819qi.LJ;
            LLLLLLZ().LLLFZ(i);
            this.LLLFFI = i;
            this.LLLI = c21665819qi.LJI;
            this.LLLII = c21665819qi.LJFF;
            float f2 = c21665819qi.LIZLLL;
            this.LLLIIII = f2;
            C1077050e8N c1077050e8N = this.LLLIIIIL;
            if (c1077050e8N != null) {
                c1077050e8N.LIZIZ(f2);
            }
            AwS87S0500000_33 awS87S0500000_33 = new AwS87S0500000_33(matrix, this, c21665819qi, enumC375190EnNLIZ, f, 0);
            if (this.mView != null) {
                if (str.length() == 0 || Intrinsics.LJFF(str, this.LLLFZ.LIZIZ)) {
                    awS87S0500000_33.invoke();
                } else {
                    C574070MfN.LJI(str, C1453540nvc.LIZ(), C1453540nvc.LIZ(), null, new AwS116S1200000_33(awS87S0500000_33, this, str, 1), 8);
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1AF0.LJFF(thM5exceptionOrNullimpl, "CropScene updateDataByCropInput");
        }
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [X.0e8M] */
    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        int iLIZIZ;
        View viewLJLLLL;
        View viewLJLLLL2;
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.tsc);
        Context contextRequireSceneContext = requireSceneContext();
        C372580EjA c372580EjA = new C372580EjA(contextRequireSceneContext);
        boolean z = true;
        c372580EjA.LJII = true;
        c372580EjA.LIZIZ = EnumC372850Ejb.NO_NAV_BAR;
        c372580EjA.LJFF = C786410Ut5.Td(C786410Ut5.ne(contextRequireSceneContext), R.layout.d5k, viewGroup, false);
        c372580EjA.LIZLLL = C1697810uHb.LJIILJJIL(new C372880Eje(LLLLLLLLLL().LIZ, 2));
        c372580EjA.LJI = C786410Ut5.Td(C786410Ut5.ne(contextRequireSceneContext), R.layout.d5i, viewGroup, false);
        C372830EjZ c372830EjZ = new C372830EjZ(c372580EjA);
        if (viewGroup != null) {
            viewGroup.addView(c372830EjZ, -1, -1);
        }
        this.LLJLL = findViewById(R.id.f5u);
        LLLLLLIL().setOnTouchListener(new View.OnTouchListener() { // from class: X.19qu
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return true;
            }
        });
        LLLLLLIL().setBackgroundColor(C157B.LIZ(1.0f));
        C337180DJs.LIZ(findViewById(R.id.o0x));
        this.LLL = findViewById(R.id.ssa);
        this.LLLF = (RecyclerView) findViewById(R.id.ssb);
        View view2 = this.LLJLL;
        if (view2 != null) {
            view2.setOnTouchListener(new ATListenerS465S0100000_33(this, 4));
        }
        C786410Ut5.I7(new ACListenerS167S0100000_33(this, 64), (View) this.LLJL.getValue());
        C786410Ut5.I7(new ACListenerS167S0100000_33(this, 65), (View) this.LLJJLIIIJLLLLLLLZ.getValue());
        final C389830FQf c389830FQfLLLLLLLZIL = LLLLLLLZIL();
        C389850FQh c389850FQh = new C389850FQh();
        c389850FQh.LIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(27));
        c389850FQh.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(27));
        c389850FQh.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)) + ((Number) this.LLLILZ.getValue()).intValue();
        int i = 32;
        if (LLLLILI().LIZ.LJ || LLLLILI().LIZ.LJFF) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        }
        c389850FQh.LIZLLL = iLIZIZ;
        c389850FQh.LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        c389850FQh.LJFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        c389850FQh.LJI = 150L;
        c389850FQh.LJII = 300L;
        c389850FQh.LJIIIIZZ = C1619980sG4.LJIILIIL();
        c389830FQfLLLLLLLZIL.setCropViewConfig(c389850FQh);
        c389830FQfLLLLLLLZIL.setPainter(LLLLLZL());
        c389830FQfLLLLLLLZIL.setCropListener(new InterfaceC389870FQj() { // from class: X.19qP
            public Rect LIZ = new Rect();
            public Matrix LIZIZ;
            public final C389910FQn LIZJ;
            public float LIZLLL;

            @Override // X.InterfaceC389870FQj
            public final void LIZ() {
                this.LIZ = c389830FQfLLLLLLLZIL.getRect();
                c389830FQfLLLLLLLZIL.getRect();
                this.LIZIZ = new Matrix(this.LLLLLLZZ().getImageMatrix());
            }

            @Override // X.InterfaceC389870FQj
            public final void LIZJ() {
                this.LLLLLL(true);
                this.LLLLLJLJLL();
            }

            @Override // X.InterfaceC389870FQj
            public final void LJ() {
                RectF rectF = new RectF(c389830FQfLLLLLLLZIL.getRect());
                Matrix matrix = new Matrix(this.LIZIZ);
                matrix.postScale(rectF.width() / this.LIZ.width(), rectF.height() / this.LIZ.height(), this.LIZ.centerX(), this.LIZ.centerY());
                matrix.postTranslate(rectF.centerX() - this.LIZ.centerX(), rectF.centerY() - this.LIZ.centerY());
                this.LLLLLLZZ().setImageMatrix(matrix);
            }

            @Override // X.InterfaceC389870FQj
            public final void LJFF() {
                this.LLLLLL(true);
                this.LLLLLJLJLL();
            }

            @Override // X.InterfaceC389870FQj
            public final void LIZIZ(EnumC389840FQg enumC389840FQg) {
                if (this.LIZLLL != 0.0f) {
                    this.LLLLLLLZIL().setRect(new RectF(this.LIZJ.LIZ(c389830FQfLLLLLLLZIL.getRect(), enumC389840FQg)));
                }
            }

            @Override // X.InterfaceC389870FQj
            public final void LIZLLL(boolean z2) {
                Rect rect;
                if (z2) {
                    this.LLLLLL(false);
                    C389830FQf c389830FQf = c389830FQfLLLLLLLZIL;
                    C21665319qd c21665319qd = this;
                    c21665319qd.getClass();
                    if (!((Boolean) C272940Amq.LIZ.getValue()).booleanValue()) {
                        rect = C06K5.LIZ(C21628919kl.LIZ(c21665319qd.LLLLLLZZ()));
                        int i2 = rect.left;
                        int i3 = (int) C416080GTe.LJIILL;
                        rect.left = Math.max(i2, i3);
                        rect.right = Math.min(rect.right, c21665319qd.LLLLLLLZIL().getWidth() - i3);
                        rect.top = Math.max(rect.top, i3);
                        rect.bottom = Math.min(rect.bottom, c21665319qd.LLLLLLLZIL().getHeight() - i3);
                    } else {
                        int i4 = (int) C416080GTe.LJIILL;
                        int width = c21665319qd.LLLLLLLZIL().getWidth();
                        int height = c21665319qd.LLLLLLLZIL().getHeight();
                        if (width > 0 && height > 0) {
                            RectF rectFLIZ = C21628919kl.LIZ(c21665319qd.LLLLLLZZ());
                            if (Math.abs(rectFLIZ.left) <= Float.MAX_VALUE && Math.abs(rectFLIZ.top) <= Float.MAX_VALUE && Math.abs(rectFLIZ.right) <= Float.MAX_VALUE && Math.abs(rectFLIZ.bottom) <= Float.MAX_VALUE) {
                                rect = C06K5.LIZ(rectFLIZ);
                                rect.left = Math.max(rect.left, i4);
                                rect.right = Math.min(rect.right, width - i4);
                                rect.top = Math.max(rect.top, i4);
                                rect.bottom = Math.min(rect.bottom, height - i4);
                            } else {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("CropScene getLimitRect: bitmap display rect is not finite: ");
                                sbLIZ.append(rectFLIZ);
                                C1AF0.LJFF(new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ)), "CropScene getLimitRect");
                                rect = new Rect(i4, i4, Math.max(i4, width - i4), Math.max(i4, height - i4));
                            }
                        } else {
                            rect = new Rect();
                        }
                    }
                    c389830FQf.setLimitRect(rect);
                    if (C295760BiY.LIZ()) {
                        C21665319qd c21665319qd2 = this;
                        RectF rectFLIZ2 = C21628919kl.LIZ(c21665319qd2.LLLLLLZZ());
                        if (rectFLIZ2.width() > 0.0f && rectFLIZ2.height() > 0.0f) {
                            int iWidth = (int) (rectFLIZ2.width() * 0.1f);
                            int iHeight = (int) (rectFLIZ2.height() * 0.1f);
                            C389830FQf c389830FQfLLLLLLLZIL2 = c21665319qd2.LLLLLLLZIL();
                            int iMax = Math.max(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)), iWidth);
                            int iMax2 = Math.max(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)), iHeight);
                            C389850FQh c389850FQh2 = c389830FQfLLLLLLLZIL2.LLJJL;
                            c389850FQh2.LJ = iMax;
                            c389850FQh2.LJFF = iMax2;
                            c389830FQfLLLLLLLZIL2.LIZ();
                        }
                    }
                    C21665319qd c21665319qd3 = this;
                    float f = c21665319qd3.LLLIIII;
                    this.LIZLLL = f;
                    if (f != 0.0f) {
                        RectF rectFLIZIZ = C21628919kl.LIZIZ(c21665319qd3.LLLLLLZZ(), this.LIZLLL, 0.0f, 0.0f);
                        C389910FQn c389910FQn = this.LIZJ;
                        float f2 = this.LIZLLL;
                        c389910FQn.LIZJ = rectFLIZIZ;
                        c389910FQn.LIZLLL.reset();
                        c389910FQn.LIZLLL.setRotate(f2, 0.0f, 0.0f);
                        c389910FQn.LJ.reset();
                        c389910FQn.LIZLLL.invert(c389910FQn.LJ);
                    }
                    this.LLLLZLLLI();
                }
            }

            {
                new Rect();
                this.LIZIZ = new Matrix();
                this.LIZJ = new C389910FQn();
            }
        });
        C337180DJs.LIZJ(c389830FQfLLLLLLLZIL);
        RecyclerView recyclerView = this.LLLF;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new CenterLinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(LLLLLLZ());
        }
        C340070DUv c340070DUvLLLLLLZ = LLLLLLZ();
        List listLIZ = C340110DUz.LIZ();
        c340070DUvLLLLLLZ.getClass();
        c340070DUvLLLLLLZ.LL = new ArrayList(listLIZ);
        c340070DUvLLLLLLZ.notifyDataSetChanged();
        c340070DUvLLLLLLZ.LLILZ = new C0DV0() { // from class: X.19qb
            @Override // X.C0DV0
            public final void M2(int i2) {
                RecyclerView recyclerView2 = this.LIZ.LLLF;
                if (recyclerView2 != null) {
                    recyclerView2.smoothScrollToPosition(i2);
                }
            }

            @Override // X.C0DV0
            public final void LIZ(C340090DUx c340090DUx, int i2) {
                if (this.LIZ.LLLLZ()) {
                    return;
                }
                C21665319qd c21665319qd = this.LIZ;
                int i3 = c340090DUx.LIZ;
                if (c21665319qd.LLLFFI != i3) {
                    c21665319qd.LLLFFI = i3;
                    if (i3 == 5) {
                        c21665319qd.LLLLLLLZIL().setCropMode(C375130EnH.LIZ(i3));
                    } else {
                        EnumC375190EnN enumC375190EnNLIZ = C375130EnH.LIZ(i3);
                        c21665319qd.LLLLLL(false);
                        Rect rect = c21665319qd.LLLLLLLZIL().getRect();
                        C389830FQf c389830FQfLLLLLLLZIL2 = c21665319qd.LLLLLLLZIL();
                        RectF rectFLIZIZ = c389830FQfLLLLLLLZIL2.LIZIZ(c389830FQfLLLLLLLZIL2.LIZJ(enumC375190EnNLIZ));
                        Matrix matrix = new Matrix(c21665319qd.LLLLLLZZ().getImageMatrix());
                        RectF rectFLIZ = C21628919kl.LIZ(c21665319qd.LLLLLLZZ());
                        Matrix matrix2 = new Matrix(c21665319qd.LLLLLLZZ().getImageMatrix());
                        float fMax = Math.max(rectFLIZIZ.width() / rectFLIZ.width(), rectFLIZIZ.height() / rectFLIZ.height());
                        float f = c21665319qd.LLLIIII;
                        if (f != 0.0f) {
                            List listLJFF = C21664919qZ.LJFF(rectFLIZIZ, f);
                            RectF rectFLIZIZ2 = C21628919kl.LIZIZ(c21665319qd.LLLLLLZZ(), c21665319qd.LLLIIII, c21665319qd.LLLLLLJ(), c21665319qd.LLLLLLL());
                            Matrix matrix3 = new Matrix();
                            matrix3.postScale(fMax, fMax, rectFLIZIZ2.centerX(), rectFLIZIZ2.centerY());
                            matrix3.postTranslate(c21665319qd.LLLLLLJ() - rectFLIZIZ2.centerX(), c21665319qd.LLLLLLL() - rectFLIZIZ2.centerY());
                            matrix3.mapRect(rectFLIZIZ2, rectFLIZIZ2);
                            if (C21664919qZ.LJI(listLJFF, rectFLIZIZ2)) {
                                fMax *= C21664919qZ.LIZIZ(listLJFF, rectFLIZIZ2, c21665319qd.LLLLLLJ(), c21665319qd.LLLLLLL());
                            }
                        }
                        matrix2.postScale(fMax, fMax, rectFLIZ.centerX(), rectFLIZ.centerY());
                        matrix2.postTranslate(rectFLIZIZ.centerX() - rectFLIZ.centerX(), rectFLIZIZ.centerY() - rectFLIZ.centerY());
                        ValueAnimator valueAnimator = c21665319qd.LLLILZJ;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        c21665319qd.LLLILZJ = valueAnimatorOfFloat;
                        if (valueAnimatorOfFloat != null) {
                            valueAnimatorOfFloat.setDuration(300L);
                        }
                        ValueAnimator valueAnimator2 = c21665319qd.LLLILZJ;
                        if (valueAnimator2 != null) {
                            valueAnimator2.addUpdateListener(new AUListenerS11S0600000_33(rectFLIZIZ, rect, c21665319qd, matrix, matrix2, enumC375190EnNLIZ, 1));
                        }
                        ValueAnimator valueAnimator3 = c21665319qd.LLLILZJ;
                        if (valueAnimator3 != null) {
                            valueAnimator3.start();
                        }
                    }
                }
                RecyclerView recyclerView2 = this.LIZ.LLLF;
                if (recyclerView2 != null) {
                    recyclerView2.smoothScrollToPosition(i2);
                }
                C1402680mba c1402680mba = C1402680mba.LIZ;
                VideoPublishEditModel videoPublishEditModelLLLLLZ = this.LIZ.LLLLLZ();
                String strLIZ = C1447420nlk.LIZ(c340090DUx.LIZ);
                c1402680mba.getClass();
                C0LAB c0labLIZIZ = C1402680mba.LIZIZ(videoPublishEditModelLLLLLZ);
                c0labLIZIZ.LJ("size_name", strLIZ);
                C20684815ws.LJIILLIIL("click_size_adjust_bar", c0labLIZIZ.LIZ);
            }
        };
        ViewStub viewStub = (ViewStub) findViewById(R.id.wc4);
        if (viewStub != null && (viewLJLLLL2 = C786410Ut5.LJLLLL(viewStub)) != null) {
            C426750GoL.LJIIIZ(viewLJLLLL2, null, Integer.valueOf(((Number) this.LLLILZ.getValue()).intValue()), null, null, false, 29);
        }
        this.LLJLLL = (TuxIconView) findViewById(R.id.oh4);
        this.LLJZ = (TuxIconView) findViewById(R.id.tsj);
        this.LLJLLIL = (TuxIconView) findViewById(R.id.vkj);
        TuxIconView tuxIconView = this.LLJLLL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS167S0100000_33(this, 66));
        }
        TuxIconView tuxIconView2 = this.LLJZ;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS167S0100000_33(this, 67));
        }
        TuxIconView tuxIconView3 = this.LLJLLIL;
        if (tuxIconView3 != null) {
            C786410Ut5.a9(tuxIconView3, new ACListenerS167S0100000_33(this, 68));
        }
        if (LLLLILI().LIZ.LJFF) {
            C337180DJs.LIZ(this.LLJLLIL);
            ViewStub viewStub2 = (ViewStub) findViewById(R.id.wce);
            if (viewStub2 != null) {
                C786410Ut5.LJLLLL(viewStub2);
            }
        } else {
            ViewStub viewStub3 = (ViewStub) findViewById(R.id.wcf);
            if (viewStub3 != null) {
                viewLJLLLL = C786410Ut5.LJLLLL(viewStub3);
            } else {
                viewLJLLLL = null;
            }
            this.LLJZIJLIL = viewLJLLLL;
            C337180DJs.LIZIZ(viewLJLLLL);
        }
        View viewLLLLLLIL = LLLLLLIL();
        final C1077050e8N c1077050e8N = new C1077050e8N(viewLLLLLLIL, C11VU.LJ(LLLLLLIL().getContext()), this);
        this.LLLIIIIL = c1077050e8N;
        AwS608S0100000_29 awS608S0100000_29 = new AwS608S0100000_29(this, 356);
        final AwS612S0100000_33 awS612S0100000_33 = new AwS612S0100000_33(this, 107);
        final C013C c013c = new C013C();
        c013c.element = true;
        c1077050e8N.LIZLLL = (LinearLayout) viewLLLLLLIL.findViewById(R.id.l38);
        c1077050e8N.LJ = viewLLLLLLIL.findViewById(R.id.ax6);
        c1077050e8N.LJFF = (HorizontalScrollView) viewLLLLLLIL.findViewById(R.id.u3o);
        c1077050e8N.LJI = viewLLLLLLIL.findViewById(R.id.h5a);
        c1077050e8N.LJII = (TuxTextView) viewLLLLLLIL.findViewById(R.id.tsl);
        c1077050e8N.LJIIIIZZ = viewLLLLLLIL.findViewById(R.id.g7z);
        final C118300cf c118300cf = new C118300cf();
        final AwS417S0200000_16 awS417S0200000_16 = new AwS417S0200000_16(c118300cf, c1077050e8N, 104);
        float f = viewLLLLLLIL.getContext().getResources().getDisplayMetrics().density * 1;
        int i2 = 0;
        for (Object obj : C1697810uHb.LJIIJJI(0, 1, 2, 3, 4, 5)) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                ((Number) obj).intValue();
                C0GTN c0gtn = new C0GTN(c1077050e8N.LIZ.getContext());
                c0gtn.setEnableCropOpt(z);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(c1077050e8N.LIZIZ / 6, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))));
                if (i2 == 0) {
                    layoutParams.setMarginStart((int) (c1077050e8N.LIZIZ / 2.0f));
                }
                if (i2 == r17.size() - 1) {
                    View view3 = c1077050e8N.LJI;
                    if (view3 == null) {
                        view3 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                    marginLayoutParams.setMarginEnd((int) ((c1077050e8N.LIZIZ / 2.0f) - f));
                    View view4 = c1077050e8N.LJI;
                    if (view4 == null) {
                        view4 = null;
                    }
                    C786410Ut5.W5(view4, marginLayoutParams);
                }
                if (C444960Hcc.LIZIZ()) {
                    z = true;
                    if (i2 == 2) {
                        c0gtn.setZero(true);
                    } else if (i2 == 3) {
                        c0gtn.setBeforeZero(true);
                    }
                } else {
                    z = true;
                    if (i2 == 2) {
                        c0gtn.setBeforeZero(true);
                    } else if (i2 == 3) {
                        c0gtn.setZero(true);
                    }
                }
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gtn);
                c0gtn.setLayoutParams(layoutParams);
                LinearLayout linearLayout = c1077050e8N.LIZLLL;
                if (linearLayout == null) {
                    linearLayout = null;
                }
                linearLayout.addView(c0gtn);
                i2 = i3;
                i = 32;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        c1077050e8N.LIZIZ(0.0f);
        c1077050e8N.LJIILJJIL = new ViewTreeObserver.OnScrollChangedListener() { // from class: X.0e8M
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                HorizontalScrollView horizontalScrollView = c1077050e8N.LJFF;
                if (horizontalScrollView == null) {
                    horizontalScrollView = null;
                }
                int scrollX = horizontalScrollView.getScrollX();
                C1077050e8N c1077050e8N2 = c1077050e8N;
                boolean z2 = scrollX > c1077050e8N2.LJIIJJI;
                HorizontalScrollView horizontalScrollView2 = c1077050e8N2.LJFF;
                if (horizontalScrollView2 == null) {
                    horizontalScrollView2 = null;
                }
                int scrollX2 = horizontalScrollView2.getScrollX();
                C1077050e8N c1077050e8N3 = c1077050e8N;
                c1077050e8N3.LJIIJJI = scrollX2;
                float f2 = ((scrollX2 / c1077050e8N3.LIZIZ) * 90.0f) - 45.0f;
                if (f2 < -45.0f) {
                    f2 = -45.0f;
                } else if (f2 > 45.0f) {
                    f2 = 45.0f;
                }
                C013C c013c2 = c013c;
                if (c013c2.element) {
                    c013c2.element = false;
                    return;
                }
                LinearLayout linearLayout2 = c1077050e8N3.LIZLLL;
                if (linearLayout2 == null) {
                    linearLayout2 = null;
                }
                Iterator it2 = new C1077420e8y(linearLayout2, 40).iterator();
                while (true) {
                    C1077410e8x c1077410e8x = (C1077410e8x) it2;
                    if (!c1077410e8x.hasNext()) {
                        break;
                    }
                    View view5 = (View) c1077410e8x.next();
                    if (view5 instanceof C0GTN) {
                        C0GTN c0gtn2 = (C0GTN) view5;
                        if (c0gtn2.LLILZ || c0gtn2.LLILLL) {
                            boolean z3 = f2 < -3.0f || f2 > 3.0f;
                            if (z3 != c0gtn2.getShouldDrawDot()) {
                                c0gtn2.setShouldDrawDot(z3);
                                view5.invalidate();
                            }
                        }
                    }
                }
                TuxTextView tuxTextView = c1077050e8N.LJII;
                if (tuxTextView == null) {
                    tuxTextView = null;
                }
                tuxTextView.setText(C1077050e8N.LIZ(f2));
                TuxTextView tuxTextView2 = c1077050e8N.LJII;
                if (tuxTextView2 == null) {
                    tuxTextView2 = null;
                }
                C786410Ut5.LLLLZLL(tuxTextView2, 0);
                C1077050e8N c1077050e8N4 = c1077050e8N;
                if (c1077050e8N4.LJIILIIL) {
                    return;
                }
                TuxTextView tuxTextView3 = c1077050e8N4.LJII;
                if (tuxTextView3 == null) {
                    tuxTextView3 = null;
                }
                tuxTextView3.setText(C1077050e8N.LIZ(f2));
                TuxTextView tuxTextView4 = c1077050e8N.LJII;
                if (tuxTextView4 == null) {
                    tuxTextView4 = null;
                }
                C786410Ut5.LLLLZLL(tuxTextView4, 0);
                c1077050e8N.LJIIIZ.removeCallbacksAndMessages(null);
                c118300cf.element = scrollX2;
                c1077050e8N.LJIIIZ.removeCallbacksAndMessages(null);
                c1077050e8N.LJIIIZ.postDelayed(new ARunnableS106S0100000_6((Function0) awS417S0200000_16, 281), 100L);
                int i4 = ((int) f2) % 3;
                awS612S0100000_33.invoke(Float.valueOf(-f2));
                if (c1077050e8N.LJIIL.isRunning()) {
                    return;
                }
                C1077050e8N c1077050e8N5 = c1077050e8N;
                if (c1077050e8N5.LJIIJ) {
                    if (z2) {
                        if (f2 >= 0.0f || f2 <= -3.0f) {
                            return;
                        }
                    } else if (f2 <= 0.0f || f2 >= 3.0f) {
                        return;
                    }
                    float f3 = c1077050e8N5.LIZIZ;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(((f2 + 45.0f) / 90.0f) * f3, f3 * 0.5f);
                    c1077050e8N5.LJIIL = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.setDuration(50L);
                    c1077050e8N5.LJIIL.setInterpolator(C1619980sG4.LJIILIIL());
                    c1077050e8N5.LJIIL.addUpdateListener(new AUListenerS265S0100000_16(c1077050e8N5, 54));
                    c1077050e8N5.LJIIL.start();
                }
            }
        };
        HorizontalScrollView horizontalScrollView = c1077050e8N.LJFF;
        if (horizontalScrollView == null) {
            horizontalScrollView = null;
        }
        C786410Ut5.z3(horizontalScrollView.getViewTreeObserver(), c1077050e8N.LJIILJJIL);
        TuxTextView tuxTextView = c1077050e8N.LJII;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        C786410Ut5.LLLLZLL(tuxTextView, 0);
        TuxTextView tuxTextView2 = c1077050e8N.LJII;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        tuxTextView2.setTextColorRes(R.attr.zk);
        HorizontalScrollView horizontalScrollView2 = c1077050e8N.LJFF;
        if (horizontalScrollView2 == null) {
            horizontalScrollView2 = null;
        }
        horizontalScrollView2.setOnTouchListener(new ATListenerS340S0200000_16(c1077050e8N, awS608S0100000_29, 1));
        ((InterfaceC1461390o8H) this.LLJLILLLLZIIL.getValue()).LIZIZ(new GestureInteractItem(0, this.LLLL));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.19qm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C21665619qg) obj2).LIZJ;
            }
        }, new AwS612S0100000_33(this, 103));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.19qo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C21665619qg) obj2).LJII;
            }
        }, new AwS612S0100000_33(this, 104));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.19qr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C21665619qg) obj2).LJI;
            }
        }, new AwS612S0100000_33(this, 105));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.19qq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C21665619qg) obj2).LJIIIIZZ;
            }
        }, new AwS612S0100000_33(this, 106));
    }

    public final void LLLLZLL(float f, float f2, float f3) {
        Matrix matrix = new Matrix(LLLLLLZZ().getImageMatrix());
        matrix.postScale(f, f, f2, f3);
        LLLLLLZZ().setImageMatrix(matrix);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setTheme(R.style.y0);
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.enb, viewGroup, false);
    }
}

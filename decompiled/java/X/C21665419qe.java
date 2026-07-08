package X;

import Y.ACListenerS167S0100000_33;
import Y.ARunnableS129S0100000_29;
import Y.ARunnableS133S0100000_33;
import Y.ATListenerS465S0100000_33;
import Y.AUListenerS11S0600000_33;
import Y.AUListenerS280S0100000_33;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
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
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.createx.editor.gesture.GestureInteractItem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.image.thumbnail.CenterLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS116S1200000_33;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import zoo.b;

/* JADX INFO: renamed from: X.19qe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21665419qe extends AbstractC1664490tPr<C21665519qf, C1451730nsh> {
    public View LLJLILLLLZIIL;
    public TuxIconView LLJLL;
    public View LLJLLIL;
    public RecyclerView LLJLLL;
    public boolean LLLF;
    public float LLLFF;
    public float LLLFFI;
    public ValueAnimator LLLIIIL;
    public final ValueAnimator LLLIIL;
    public final SafeHandler LLLIILIL;
    public boolean LLLIL;
    public boolean LLLILZ;
    public boolean LLLILZJ;
    public boolean LLLILZLLLI;
    public final C21664219qS LLLIZZ;
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 398));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 399));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 410));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 403));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 404));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 400));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 409));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 407));
    public boolean LLJZ = true;
    public int LLJZIJLIL = -1;
    public final C21666019qk LLL = new C21666019qk();
    public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 401));
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 402));
    public final C01GW LLLII = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(88));
    public final C01GW LLLIIII = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(87));
    public final C01GW LLLIIIIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 73));

    static {
        int i = C1451140nrk.LIZ;
        Math.min(1920, ((Number) C1451140nrk.LJI.getValue()).intValue());
    }

    public final void LLLLLJIL() {
        this.LLLIILIL.removeCallbacksAndMessages(null);
        this.LLLIIL.cancel();
        this.LLLIILIL.postDelayed(new ARunnableS133S0100000_33(this, 39), 50L);
        this.LLLIILIL.postDelayed(new ARunnableS129S0100000_29(this, 22), 150L);
    }

    public final View LLLLLJLJLL() {
        return (View) this.LLJJJJ.getValue();
    }

    public final int LLLLLL() {
        return ((Number) this.LLLFZ.getValue()).intValue();
    }

    public final int LLLLLLIL() {
        return ((Number) this.LLLI.getValue()).intValue();
    }

    public final C1561420qjc LLLLLLJ() {
        C1561420qjc c1561420qjc = new C1561420qjc();
        c1561420qjc.LIZ = LLLLILI().LIZ.LIZLLL ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(222)) : LLLLILI().LIZ.LJ ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(226)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(158));
        return c1561420qjc;
    }

    public final C389830FQf LLLLLLL() {
        return (C389830FQf) this.LLJJJJLIIL.getValue();
    }

    public final C340070DUv LLLLLLLLL() {
        return (C340070DUv) this.LLLIIII.getValue();
    }

    public final ImageView LLLLLLLLLL() {
        return (ImageView) this.LLJLIL.getValue();
    }

    public final C416080GTe LLLLLLLZIL() {
        return (C416080GTe) this.LLLII.getValue();
    }

    public final boolean LLLLLLZ() {
        return !this.LLJZ || this.LLLILZLLLI;
    }

    public final void LLLLLZ() {
        if (this.LLLIL && this.LLLILZ) {
            C337180DJs.LIZJ(LLLLLLLLLL());
            C337180DJs.LIZJ((View) this.LLJJJIL.getValue());
            C337180DJs.LIZJ(LLLLLLL());
        }
    }

    public final void LLLLLZL() {
        this.LLLIILIL.removeCallbacksAndMessages(null);
        this.LLLIIL.cancel();
        LLLLLLLZIL().LJFF = true;
        LLLLLLLZIL().LJ = C157B.LIZ(0.5f);
        LLLLLJLJLL().setBackgroundColor(C157B.LIZ(0.5f));
        LLLLLLL().invalidate();
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [X.19qS] */
    public C21665419qe() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.5f, 1.0f);
        this.LLLIIL = valueAnimatorOfFloat;
        this.LLLIILIL = new SafeHandler(this);
        this.LLLIL = true;
        this.LLLILZ = true;
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS280S0100000_33(this, 16));
        this.LLLIZZ = new C0FUM() { // from class: X.19qS
            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LLLZLZ(b bVar) {
                PointF pointF;
                if (bVar != null && (pointF = bVar.LJIIJJI) != null) {
                    C21665419qe c21665419qe = this.LL;
                    float f = (int) pointF.x;
                    float f2 = (int) pointF.y;
                    c21665419qe.getClass();
                    Matrix matrix = new Matrix(c21665419qe.LLLLLLLLLL().getImageMatrix());
                    matrix.postTranslate(f, f2);
                    c21665419qe.LLLLLLLLLL().setImageMatrix(matrix);
                }
                C21665419qe c21665419qe2 = this.LL;
                c21665419qe2.LLLILZLLLI = true;
                c21665419qe2.LLJZ = false;
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
                RectF rectFLIZ = C21628919kl.LIZ(this.LL.LLLLLLLLLL());
                C21665419qe c21665419qe = this.LL;
                if (rectFLIZ.width() / ((InterfaceC21664319qT) c21665419qe.LLJJL.getValue()).LIZ().width() >= 0.8f && rectFLIZ.height() / ((InterfaceC21664319qT) c21665419qe.LLJJL.getValue()).LIZ().height() >= 0.8f) {
                    Matrix matrix = new Matrix(c21665419qe.LLLLLLLLLL().getImageMatrix());
                    matrix.postScale(scaleFactor, scaleFactor, focusX, focusY);
                    c21665419qe.LLLLLLLLLL().setImageMatrix(matrix);
                    return true;
                }
                return true;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                this.LL.LLLLLZL();
                return true;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onUp(MotionEvent motionEvent) {
                C21665419qe c21665419qe = this.LL;
                if (c21665419qe.LLLFFI == 0.0f) {
                    c21665419qe.LLLLLLZZ();
                    C21665419qe c21665419qe2 = this.LL;
                    c21665419qe2.LLLILZLLLI = false;
                    c21665419qe2.LLJZ = true;
                    c21665419qe2.LLLLLJIL();
                    return true;
                }
                AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c21665419qe, 406);
                List listLJFF = C21664919qZ.LJFF(new RectF(c21665419qe.LLLLLLL().getRect()), c21665419qe.LLLFFI);
                if (C21664919qZ.LJI(listLJFF, C21628919kl.LIZIZ(c21665419qe.LLLLLLLLLL(), c21665419qe.LLLFFI, c21665419qe.LLLLLL(), c21665419qe.LLLLLLIL()))) {
                    RectF rectFLIZ = C21628919kl.LIZ(c21665419qe.LLLLLLLLLL());
                    float fLLLLLL = c21665419qe.LLLLLL() - rectFLIZ.centerX();
                    float fLLLLLLIL = c21665419qe.LLLLLLIL() - rectFLIZ.centerY();
                    Matrix matrix = new Matrix(c21665419qe.LLLLLLLLLL().getImageMatrix());
                    matrix.postTranslate(fLLLLLL, fLLLLLLIL);
                    c21665419qe.LLLLLLLLLL().setImageMatrix(matrix);
                    float fLIZIZ = C21664919qZ.LIZIZ(listLJFF, C21628919kl.LIZIZ(c21665419qe.LLLLLLLLLL(), c21665419qe.LLLFFI, c21665419qe.LLLLLL(), c21665419qe.LLLLLLIL()), c21665419qe.LLLLLL(), c21665419qe.LLLLLLIL());
                    float fLLLLLL2 = c21665419qe.LLLLLL();
                    float fLLLLLLIL2 = c21665419qe.LLLLLLIL();
                    Matrix matrix2 = new Matrix(c21665419qe.LLLLLLLLLL().getImageMatrix());
                    matrix2.postScale(fLIZIZ, fLIZIZ, fLLLLLL2, fLLLLLLIL2);
                    c21665419qe.LLLLLLLLLL().setImageMatrix(matrix2);
                }
                awS577S0100000_33.invoke();
                return true;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LLLLLLLLL(b bVar, float f, float f2) {
                this.LL.LLLLLZL();
                return true;
            }
        };
    }

    public final void LLLLLLZZ() {
        RectF rectF = new RectF(LLLLLLL().getRect());
        RectF rectFLIZ = C21628919kl.LIZ(LLLLLLLLLL());
        if (rectFLIZ.contains(rectF)) {
            return;
        }
        Matrix matrixLIZJ = C19LC.LIZJ(LLLLLLLLLL().getImageMatrix(), rectFLIZ, rectF);
        Matrix imageMatrix = LLLLLLLLLL().getImageMatrix();
        Matrix matrix = new Matrix();
        imageMatrix.invert(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setConcat(matrixLIZJ, matrix);
        C19LC.LIZLLL(matrix2);
        this.LLJZ = false;
        C21511519Gn.LIZ(LLLLLLLLLL(), new Matrix(LLLLLLLLLL().getImageMatrix()), matrixLIZJ, 0L, new AwS577S0100000_33(this, 408), 24);
    }

    public final void exit() {
        C337180DJs.LIZIZ(LLLLLLLLLL());
        C337180DJs.LIZIZ((View) this.LLJJJIL.getValue());
        C337180DJs.LIZIZ(LLLLLLL());
        View viewLLLLLJLJLL = LLLLLJLJLL();
        LLLLIL().LIZ.invoke();
        C337180DJs.LIZ(this.LLJLL);
        C12C5.LJ(viewLLLLLJLJLL, 0L, LLLLLJLJLL().getHeight(), C1619980sG4.LJIILIIL(), new AwS577S0100000_33(this, 405), 9);
    }

    public final void LLLLZ(String str, Function0<Unit> function0) {
        if (this.mView == null) {
            return;
        }
        if (str != null && str.length() == 0) {
            ((C21665219qc) function0).invoke();
            return;
        }
        if (Intrinsics.LJFF(str, this.LLL.LIZIZ)) {
            ((C21665219qc) function0).invoke();
            return;
        }
        if (str != null) {
            int iIntValue = ((Number) C473380IhM.LIZ(this.mActivity).getFirst()).intValue();
            int iIntValue2 = ((Number) C473380IhM.LIZ(this.mActivity).getSecond()).intValue();
            AwS116S1200000_33 awS116S1200000_33 = new AwS116S1200000_33((C21665219qc) function0, this, str, 0);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(new C0VSJ(str));
            c1331670kl3LJII.LIZLLL = true;
            c1331670kl3LJII.LJIL = config;
            c1331670kl3LJII.LJIIIIZZ = iIntValue;
            c1331670kl3LJII.LJIIIZ = iIntValue2;
            c1331670kl3LJII.LJJII(new C2189441AmU(awS116S1200000_33, 1));
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        int iLIZIZ;
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.tsc);
        Context contextRequireSceneContext = requireSceneContext();
        C372580EjA c372580EjA = new C372580EjA(contextRequireSceneContext);
        c372580EjA.LJII = true;
        c372580EjA.LIZIZ = EnumC372850Ejb.NO_NAV_BAR;
        c372580EjA.LJFF = C786410Ut5.Td(C786410Ut5.ne(contextRequireSceneContext), R.layout.d2j, viewGroup, false);
        c372580EjA.LIZLLL = C1697810uHb.LJIILJJIL(new C372880Eje(LLLLLLJ().LIZ, 2));
        c372580EjA.LJI = C786410Ut5.Td(C786410Ut5.ne(contextRequireSceneContext), R.layout.d2i, viewGroup, false);
        C372830EjZ c372830EjZ = new C372830EjZ(c372580EjA);
        if (viewGroup != null) {
            viewGroup.addView(c372830EjZ, -1, -1);
        }
        this.LLJLILLLLZIIL = findViewById(R.id.f5u);
        LLLLLJLJLL().setOnTouchListener(new View.OnTouchListener() { // from class: X.19qt
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return true;
            }
        });
        LLLLLJLJLL().setBackgroundColor(C157B.LIZ(1.0f));
        C337180DJs.LIZ(findViewById(R.id.o0x));
        this.LLJLLIL = findViewById(R.id.ssa);
        this.LLJLLL = (RecyclerView) findViewById(R.id.ssb);
        View view2 = this.LLJLILLLLZIIL;
        if (view2 != null) {
            view2.setOnTouchListener(new ATListenerS465S0100000_33(this, 0));
        }
        C786410Ut5.I7(new ACListenerS167S0100000_33(this, 24), (View) this.LLJL.getValue());
        C786410Ut5.I7(new ACListenerS167S0100000_33(this, 25), (View) this.LLJJLIIIJLLLLLLLZ.getValue());
        final C389830FQf c389830FQfLLLLLLL = LLLLLLL();
        C389850FQh c389850FQh = new C389850FQh();
        c389850FQh.LIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(27));
        c389850FQh.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(27));
        c389850FQh.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)) + ((Number) this.LLLIIIIL.getValue()).intValue();
        if (LLLLILI().LIZ.LIZLLL || LLLLILI().LIZ.LJ) {
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
        c389830FQfLLLLLLL.setCropViewConfig(c389850FQh);
        c389830FQfLLLLLLL.setPainter(LLLLLLLZIL());
        c389830FQfLLLLLLL.setCropListener(new InterfaceC389870FQj() { // from class: X.19qQ
            public Rect LIZ = new Rect();
            public Matrix LIZIZ;
            public final C389910FQn LIZJ;
            public float LIZLLL;

            @Override // X.InterfaceC389870FQj
            public final void LIZ() {
                this.LIZ = c389830FQfLLLLLLL.getRect();
                c389830FQfLLLLLLL.getRect();
                this.LIZIZ = new Matrix(this.LLLLLLLLLL().getImageMatrix());
            }

            @Override // X.InterfaceC389870FQj
            public final void LIZJ() {
                C21665419qe c21665419qe = this;
                c21665419qe.LLJZ = true;
                c21665419qe.LLLLLJIL();
                if (Intrinsics.LJFF(c389830FQfLLLLLLL.getRect(), this.LIZ)) {
                    return;
                }
                this.LLLILZJ = true;
            }

            @Override // X.InterfaceC389870FQj
            public final void LJ() {
                RectF rectF = new RectF(c389830FQfLLLLLLL.getRect());
                Matrix matrix = new Matrix(this.LIZIZ);
                matrix.postScale(rectF.width() / this.LIZ.width(), rectF.height() / this.LIZ.height(), this.LIZ.centerX(), this.LIZ.centerY());
                matrix.postTranslate(rectF.centerX() - this.LIZ.centerX(), rectF.centerY() - this.LIZ.centerY());
                this.LLLLLLLLLL().setImageMatrix(matrix);
            }

            @Override // X.InterfaceC389870FQj
            public final void LJFF() {
                C21665419qe c21665419qe = this;
                c21665419qe.LLJZ = true;
                c21665419qe.LLLLLJIL();
            }

            @Override // X.InterfaceC389870FQj
            public final void LIZIZ(EnumC389840FQg enumC389840FQg) {
                if (this.LIZLLL != 0.0f) {
                    this.LLLLLLL().setRect(new RectF(this.LIZJ.LIZ(c389830FQfLLLLLLL.getRect(), enumC389840FQg)));
                    this.LLLILZJ = true;
                }
            }

            @Override // X.InterfaceC389870FQj
            public final void LIZLLL(boolean z) {
                if (z) {
                    C21665419qe c21665419qe = this;
                    c21665419qe.LLJZ = false;
                    C389830FQf c389830FQf = c389830FQfLLLLLLL;
                    RectF rectFLIZ = C21628919kl.LIZ(c21665419qe.LLLLLLLLLL());
                    Rect rect = new Rect();
                    rectFLIZ.roundOut(rect);
                    int i = rect.left;
                    int i2 = (int) C416080GTe.LJIILL;
                    rect.left = Math.max(i, i2);
                    rect.right = Math.min(rect.right, c21665419qe.LLLLLLL().getWidth() - i2);
                    rect.top = Math.max(rect.top, i2);
                    rect.bottom = Math.min(rect.bottom, c21665419qe.LLLLLLL().getHeight() - i2);
                    c389830FQf.setLimitRect(rect);
                    C21665419qe c21665419qe2 = this;
                    float f = c21665419qe2.LLLFFI;
                    this.LIZLLL = f;
                    if (f != 0.0f) {
                        RectF rectFLIZIZ = C21628919kl.LIZIZ(c21665419qe2.LLLLLLLLLL(), this.LIZLLL, 0.0f, 0.0f);
                        C389910FQn c389910FQn = this.LIZJ;
                        float f2 = this.LIZLLL;
                        c389910FQn.LIZJ = rectFLIZIZ;
                        c389910FQn.LIZLLL.reset();
                        c389910FQn.LIZLLL.setRotate(f2, 0.0f, 0.0f);
                        c389910FQn.LJ.reset();
                        c389910FQn.LIZLLL.invert(c389910FQn.LJ);
                    }
                    this.LLLLLZL();
                }
            }

            {
                new Rect();
                this.LIZIZ = new Matrix();
                this.LIZJ = new C389910FQn();
            }
        });
        C337180DJs.LIZJ(c389830FQfLLLLLLL);
        RecyclerView recyclerView = this.LLJLLL;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new CenterLinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(LLLLLLLLL());
        }
        C340070DUv c340070DUvLLLLLLLLL = LLLLLLLLL();
        List listLIZ = C340110DUz.LIZ();
        c340070DUvLLLLLLLLL.getClass();
        c340070DUvLLLLLLLLL.LL = new ArrayList(listLIZ);
        c340070DUvLLLLLLLLL.notifyDataSetChanged();
        c340070DUvLLLLLLLLL.LLILZ = new C0DV0() { // from class: X.19qa
            @Override // X.C0DV0
            public final void M2(int i) {
                RecyclerView recyclerView2 = this.LIZ.LLJLLL;
                if (recyclerView2 != null) {
                    recyclerView2.smoothScrollToPosition(i);
                }
            }

            @Override // X.C0DV0
            public final void LIZ(C340090DUx c340090DUx, int i) {
                if (this.LIZ.LLLLLLZ()) {
                    return;
                }
                if (c340090DUx.LIZ == 5) {
                    C1451970nt5.LIZ(C1451970nt5.LIZ, "crop", "freedom", "click", this.LIZ.LLLLILI().LIZ.LJIIIZ, false, 16);
                } else {
                    C1451970nt5.LIZ(C1451970nt5.LIZ, "crop", "size", "click", this.LIZ.LLLLILI().LIZ.LJIIIZ, false, 16);
                }
                C21665419qe c21665419qe = this.LIZ;
                int i2 = c340090DUx.LIZ;
                if (c21665419qe.LLJZIJLIL != i2) {
                    c21665419qe.LLJZIJLIL = i2;
                    if (i2 == 5) {
                        c21665419qe.LLLLLLL().setCropMode(C375130EnH.LIZ(i2));
                        c21665419qe.LLLILZJ = true;
                    } else {
                        EnumC375190EnN enumC375190EnNLIZ = C375130EnH.LIZ(i2);
                        c21665419qe.LLJZ = false;
                        Rect rect = c21665419qe.LLLLLLL().getRect();
                        C389830FQf c389830FQfLLLLLLL2 = c21665419qe.LLLLLLL();
                        RectF rectFLIZIZ = c389830FQfLLLLLLL2.LIZIZ(c389830FQfLLLLLLL2.LIZJ(enumC375190EnNLIZ));
                        Matrix matrix = new Matrix(c21665419qe.LLLLLLLLLL().getImageMatrix());
                        RectF rectFLIZ = C21628919kl.LIZ(c21665419qe.LLLLLLLLLL());
                        Matrix matrix2 = new Matrix(c21665419qe.LLLLLLLLLL().getImageMatrix());
                        float fMax = Math.max(rectFLIZIZ.width() / rectFLIZ.width(), rectFLIZIZ.height() / rectFLIZ.height());
                        float f = c21665419qe.LLLFFI;
                        if (f != 0.0f) {
                            List listLJFF = C21664919qZ.LJFF(rectFLIZIZ, f);
                            RectF rectFLIZIZ2 = C21628919kl.LIZIZ(c21665419qe.LLLLLLLLLL(), c21665419qe.LLLFFI, c21665419qe.LLLLLL(), c21665419qe.LLLLLLIL());
                            Matrix matrix3 = new Matrix();
                            matrix3.postScale(fMax, fMax, rectFLIZIZ2.centerX(), rectFLIZIZ2.centerY());
                            matrix3.postTranslate(c21665419qe.LLLLLL() - rectFLIZIZ2.centerX(), c21665419qe.LLLLLLIL() - rectFLIZIZ2.centerY());
                            matrix3.mapRect(rectFLIZIZ2, rectFLIZIZ2);
                            if (C21664919qZ.LJI(listLJFF, rectFLIZIZ2)) {
                                fMax *= C21664919qZ.LIZIZ(listLJFF, rectFLIZIZ2, c21665419qe.LLLLLL(), c21665419qe.LLLLLLIL());
                            }
                        }
                        matrix2.postScale(fMax, fMax, rectFLIZ.centerX(), rectFLIZ.centerY());
                        matrix2.postTranslate(rectFLIZIZ.centerX() - rectFLIZ.centerX(), rectFLIZIZ.centerY() - rectFLIZ.centerY());
                        ValueAnimator valueAnimator = c21665419qe.LLLIIIL;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        c21665419qe.LLLIIIL = valueAnimatorOfFloat;
                        if (valueAnimatorOfFloat != null) {
                            valueAnimatorOfFloat.setDuration(300L);
                        }
                        ValueAnimator valueAnimator2 = c21665419qe.LLLIIIL;
                        if (valueAnimator2 != null) {
                            valueAnimator2.addUpdateListener(new AUListenerS11S0600000_33(rectFLIZIZ, rect, c21665419qe, matrix, matrix2, enumC375190EnNLIZ, 0));
                        }
                        ValueAnimator valueAnimator3 = c21665419qe.LLLIIIL;
                        if (valueAnimator3 != null) {
                            valueAnimator3.start();
                        }
                    }
                }
                RecyclerView recyclerView2 = this.LIZ.LLJLLL;
                if (recyclerView2 != null) {
                    recyclerView2.smoothScrollToPosition(i);
                }
            }
        };
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.tsj);
        this.LLJLL = tuxIconView;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS167S0100000_33(this, 26));
        }
        InterfaceC1461390o8H interfaceC1461390o8H = LLLLILI().LIZ.LJFF;
        if (interfaceC1461390o8H != null) {
            interfaceC1461390o8H.LIZIZ(new GestureInteractItem(0, this.LLLIZZ));
        }
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.19ql
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C21665519qf) obj).LIZIZ;
            }
        }, new AwS612S0100000_33(this, 45));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.19qn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C21665519qf) obj).LJI;
            }
        }, new AwS612S0100000_33(this, 46));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.19qp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C21665519qf) obj).LJII;
            }
        }, new AwS612S0100000_33(this, 47));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setTheme(R.style.y0);
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.en3, viewGroup, false);
    }
}

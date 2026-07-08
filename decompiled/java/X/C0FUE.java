package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS0S0000002_5;
import kotlin.jvm.internal.AwS20S0001000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS3S0000001_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import zoo.b;

/* JADX INFO: renamed from: X.0FUE, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public class C0FUE extends C0FUM {
    public final C1664680tQA<BaseStickerModel> LL;
    public final C390420FSm LLILLJJLI;
    public C0FUJ<Pair<Float, Float>> LLILZIL;
    public C0FUJ<Pair<Float, Float>> LLILZLL;
    public C0FUJ<Pair<Float, Float>> LLIZ;
    public MotionEvent LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJILJILJ;
    public final ArrayList<C0FUG> LLILLL = new ArrayList<>();
    public final ArrayList<C0FUD> LLILZ = new ArrayList<>();
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 991));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 990));
    public int LLJILJIL = 10;
    public final boolean LLJILLL = true;

    public float LJJIJIL(float f) {
        return f;
    }

    public boolean LJJIL() {
        return false;
    }

    public boolean LJJJ() {
        return false;
    }

    public float LJJJI() {
        return 0.0f;
    }

    public final void LJJIJLIJ() {
        int i = this.LLJILJIL;
        if (i < 1) {
            return;
        }
        this.LLJILJIL = i - 1;
        RectF visibleRectWithoutRotationInContainer = LJJJIL().LIZ.getVisibleRectWithoutRotationInContainer();
        for (C0FUD c0fud : this.LLILZ) {
            if (c0fud instanceof C21637819mC) {
                C21637819mC c21637819mC = (C21637819mC) c0fud;
                if (c21637819mC != null) {
                    int id = LJJJIL().LIZ.getId();
                    float rotation = LJJJIL().LIZ.getRotation();
                    C0FTJ c0ftjLIZ = C0FKU.LIZ(id, c21637819mC.LJJJJI());
                    if (c0ftjLIZ == null || !c0ftjLIZ.LIZLLL()) {
                        return;
                    }
                    Matrix matrix = new Matrix();
                    matrix.postRotate(rotation, visibleRectWithoutRotationInContainer.centerX(), visibleRectWithoutRotationInContainer.centerY());
                    matrix.mapRect(visibleRectWithoutRotationInContainer);
                    if (new RectF(c21637819mC.LJJIZ() + c21637819mC.LJJIJIL(), c21637819mC.LJJJJIZL() + c21637819mC.LJJIJIL(), c21637819mC.LJJJI() - c21637819mC.LJJIJIL(), c21637819mC.LJIJJ() - c21637819mC.LJJIJIL()).contains(visibleRectWithoutRotationInContainer)) {
                        LJJJIL().LIZLLL(AFwS234S0000000_5.get$arr$(397), true);
                        if (this.LLJILJIL == 0) {
                            LJJJIL().LIZLLL(AFwS234S0000000_5.get$arr$(398), true);
                        }
                        LJJIJLIJ();
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    public final RectF LJJJJI() {
        C390420FSm c390420FSm = this.LLILLJJLI;
        return (c390420FSm == null || !C390410FSl.LIZIZ(c390420FSm).LJIILIIL) ? LJJJIL().LIZ.getVisibleRectWithoutRotation() : LJJJIL().LIZ.getVisibleRectWithoutRotationInContainer();
    }

    public boolean LJJJJ() {
        return LJJJIL().LIZ.getVisible();
    }

    public final int LJJJJIZL() {
        return LJJJIL().LIZ.getZIndex();
    }

    public boolean LJJIZ() {
        return this.LLJILLL;
    }

    public C1664680tQA<BaseStickerModel> LJJJIL() {
        return this.LL;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public boolean E2(C21645419nQ c21645419nQ) {
        boolean z;
        if (!LJJJJ()) {
            return false;
        }
        RectF rectFLJJJJI = LJJJJI();
        MotionEvent motionEvent = this.LLIZLLLIL;
        if (motionEvent != null && (LJJIL() || C121Q.LIZ(motionEvent.getX(), motionEvent.getY(), LJJJIL().LIZ.getRotation(), rectFLJJJJI, 0.0f))) {
            z = true;
        } else {
            z = false;
        }
        if (!LJJIL() && !C121Q.LIZ(c21645419nQ.LJIILJJIL, c21645419nQ.LJIILL, LJJJIL().LIZ.getRotation(), rectFLJJJJI, 0.0f) && !z) {
            return false;
        }
        this.LLIZ = new C0FUJ<>(new Pair(Float.valueOf(c21645419nQ.LJIILJJIL), Float.valueOf(c21645419nQ.LJIILL)));
        LJJJJL(new AwS584S0100000_5(this, 822));
        return true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public boolean LIZIZ(MotionEvent motionEvent) {
        if (!LJJJJ()) {
            return false;
        }
        if (!C121Q.LIZ(motionEvent.getX(), motionEvent.getY(), LJJJIL().LIZ.getRotation(), LJJJJI(), LJJJI())) {
            return false;
        }
        for (C0FUD c0fud : this.LLILZ) {
            int id = LJJJIL().LIZ.getId();
            LJJJIL().LIZ.getType();
            motionEvent.getX();
            motionEvent.getY();
            if (c0fud.LJIILJJIL(id)) {
                return true;
            }
        }
        LJJJJL(new AwS371S0200000_5(this, motionEvent, 194));
        return true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public void LJFF(b bVar) {
        if (!LJJJJ()) {
            C0FUJ<Pair<Float, Float>> c0fuj = this.LLILZIL;
            if (c0fuj != null && c0fuj.LIZ != null) {
                c0fuj.LIZ = null;
            } else {
                return;
            }
        }
        LJJJJL(new AwS584S0100000_5(this, 820));
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public boolean LJIIIZ(float f) {
        if (!LJJJJ()) {
            C0FUJ<Pair<Float, Float>> c0fuj = this.LLIZ;
            if (c0fuj == null || c0fuj.LIZ == null) {
                return false;
            }
            c0fuj.LIZ = null;
        }
        LJJJJJL(new AwS549S0100000_5(this, 992));
        return LJJJJ();
    }

    public float LJJIJL(ScaleGestureDetector scaleGestureDetector) {
        return LJJJIL().LIZ.getScale() * scaleGestureDetector.getScaleFactor();
    }

    public final boolean LJJJJJ(MotionEvent motionEvent) {
        if (!LJJJJ()) {
            return false;
        }
        if (!C121Q.LIZ(motionEvent.getX(), motionEvent.getY(), LJJJIL().LIZ.getRotation(), LJJJJI(), LJJJI())) {
            return false;
        }
        return true;
    }

    public final void LJJJJJL(Function0<Unit> function0) {
        boolean z;
        List list;
        C0FTJ c0ftjLIZ;
        C391140FVg c391140FVgLJ;
        C0FTH c0fth = (C0FTH) this.LLJIJIL.getValue();
        if (c0fth != null && (c391140FVgLJ = c0fth.LJ()) != null && c391140FVgLJ.LLIZ) {
            z = true;
        } else {
            z = false;
        }
        if (this.LLJ && (((list = (List) this.LLJI.getValue()) != null && (c0ftjLIZ = C0FKU.LIZ(LJJJIL().LIZ.getId(), list)) != null && c0ftjLIZ.LJIIIZ()) || z)) {
            Iterator<C0FUD> it2 = this.LLILZ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C0FUD next = it2.next();
                if (next instanceof C21637819mC) {
                    C21637819mC c21637819mC = (C21637819mC) next;
                    if (c21637819mC != null) {
                        C19591311kt.LJIIJ(C19591311kt.LIZ, c21637819mC.LIZLLL(LJJJIL().LIZ), LJJJIL(), 0L, new AwS549S0100000_5(function0, (Function0<Unit>) 994), 28);
                    }
                }
            }
        } else {
            function0.invoke();
        }
        this.LLJ = false;
    }

    public final void LJJJJL(Function1<? super C0FUG, Unit> function1) {
        ArrayList<C0FUG> arrayList = this.LLILLL;
        AwS584S0100000_5 awS584S0100000_5 = new AwS584S0100000_5(function1, (Function1<? super NLETrackSlot, Unit>) 828);
        try {
            Iterator<C0FUG> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                awS584S0100000_5.invoke(it2.next());
            }
        } catch (ConcurrentModificationException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public void LJJJJLI(float f) {
        LJJJIL().LIZLLL(new AwS3S0000001_5(f, 14), true);
    }

    public final void LJJJJLL(int i) {
        LJJJIL().LIZLLL(new AwS20S0001000_5(i, 31), true);
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LJJLIIIJLJLI(float f) {
        if (!LJJJJ()) {
            return false;
        }
        float rotation = LJJJIL().LIZ.getRotation() - ((float) Math.toDegrees(f));
        Iterator<C0FUD> it2 = this.LLILZ.iterator();
        while (true) {
            boolean z = true;
            if (it2.hasNext()) {
                C0FUD next = it2.next();
                boolean zLJJIFFI = next.LJJIFFI(rotation, LJJJIL().LIZ.getId(), LJJJIL().LIZ.getVisibleRectWithoutRotationInContainer());
                if (!next.LJIILIIL()) {
                    if (!zLJJIFFI && !this.LLJ) {
                        z = false;
                    }
                    this.LLJ = z;
                } else if (zLJJIFFI) {
                    return true;
                }
            } else {
                LJJJIL().LIZLLL(new AwS3S0000001_5(rotation, 13), true);
                LJJJJL(new AwS584S0100000_5(this, 821));
                return true;
            }
        }
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public boolean LLLLJI(float f) {
        if (!LJJJJ()) {
            C0FUJ<Pair<Float, Float>> c0fuj = this.LLILZLL;
            if (c0fuj == null || c0fuj.LIZ == null) {
                return false;
            }
            c0fuj.LIZ = null;
        }
        LJJJJJL(new AwS549S0100000_5(this, 993));
        return LJJJJ();
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public boolean LLLZLZ(b bVar) {
        boolean z;
        if (!LJJJJ()) {
            return false;
        }
        this.LLJILJILJ = true;
        this.LLJILJIL = 10;
        float translateX = LJJJIL().LIZ.getTranslateX() + bVar.LJIIJJI.x;
        float translateY = LJJJIL().LIZ.getTranslateY() + bVar.LJIIJJI.y;
        for (C0FUD c0fud : this.LLILZ) {
            RectF visibleRectWithoutRotationInContainer = BaseStickerModel.copy$default(LJJJIL().LIZ, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, translateX, translateY, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -6291457, 15, null).getVisibleRectWithoutRotationInContainer();
            boolean zLJJII = c0fud.LJJII(LJJJIL().LIZ.getRotation(), LJJJIL().LIZ.getId(), visibleRectWithoutRotationInContainer);
            if (!c0fud.LJIILIIL()) {
                if (!zLJJII && !this.LLJ) {
                    z = false;
                } else {
                    z = true;
                }
                this.LLJ = z;
            } else if (zLJJII) {
                return true;
            }
        }
        LJJJIL().LIZLLL(new AwS0S0000002_5(translateX, translateY, 1), true);
        LJJJJL(new AwS371S0200000_5(this, bVar, 196));
        return true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null || !LJJJJ()) {
            return false;
        }
        this.LLJ = false;
        this.LLJILJILJ = false;
        this.LLIZLLLIL = motionEvent;
        if (C121Q.LIZ(motionEvent.getX(), motionEvent.getY(), LJJJIL().LIZ.getRotation(), LJJJJI(), 0.0f)) {
            LJJJJL(new AwS371S0200000_5(this, motionEvent, 195));
        }
        return false;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scale;
        boolean z;
        if (!LJJJJ()) {
            return false;
        }
        if (C0FM7.LIZ()) {
            scale = LJJIJL(scaleGestureDetector);
        } else {
            scale = LJJJIL().LIZ.getScale() * scaleGestureDetector.getScaleFactor();
        }
        float fLJJIJIL = LJJIJIL(scale);
        for (C0FUD c0fud : this.LLILZ) {
            RectF visibleRectWithoutRotationInContainer = BaseStickerModel.copy$default(LJJJIL().LIZ, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, fLJJIJIL, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -8388609, 15, null).getVisibleRectWithoutRotationInContainer();
            boolean zLJIJJLI = c0fud.LJIJJLI(fLJJIJIL, LJJJIL().LIZ.getRotation(), LJJJIL().LIZ.getId(), visibleRectWithoutRotationInContainer, LJJJIL().LIZ.getType());
            if (!c0fud.LJIILIIL()) {
                if (!zLJIJJLI && !this.LLJ) {
                    z = false;
                } else {
                    z = true;
                }
                this.LLJ = z;
            } else if (zLJIJJLI) {
                return true;
            }
        }
        LJJJJLI(fLJJIJIL);
        LJJJJL(new AwS584S0100000_5(this, 823));
        return true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        boolean z;
        if (!LJJJJ()) {
            return false;
        }
        RectF rectFLJJJJI = LJJJJI();
        MotionEvent motionEvent = this.LLIZLLLIL;
        if (motionEvent != null && (LJJIL() || C121Q.LIZ(motionEvent.getX(), motionEvent.getY(), LJJJIL().LIZ.getRotation(), rectFLJJJJI, 0.0f))) {
            z = true;
        } else {
            z = false;
        }
        if (!LJJIL() && !C121Q.LIZ(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), LJJJIL().LIZ.getRotation(), rectFLJJJJI, 0.0f) && !z) {
            return false;
        }
        this.LLILZLL = new C0FUJ<>(new Pair(Float.valueOf(scaleGestureDetector.getFocusX()), Float.valueOf(scaleGestureDetector.getFocusY())));
        LJJJJL(new AwS584S0100000_5(this, 824));
        return true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (C121Q.LIZ(motionEvent.getX(), motionEvent.getY(), LJJJIL().LIZ.getRotation(), LJJJJI(), LJJJI())) {
            if (!LJJJJ()) {
                LJJJJL(new AwS584S0100000_5(this, 826));
            }
            for (C0FUD c0fud : this.LLILZ) {
                int id = LJJJIL().LIZ.getId();
                LJJJIL().LIZ.getType();
                motionEvent.getX();
                motionEvent.getY();
                if (c0fud.LJJIIJ(id)) {
                    return true;
                }
            }
            LJJJJL(new AwS371S0200000_5(this, motionEvent, 197));
            return true;
        }
        return false;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final void onTouchEvent(MotionEvent motionEvent) {
        LJJJJL(new AwS584S0100000_5(motionEvent, 827));
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public boolean onUp(MotionEvent motionEvent) {
        if (motionEvent == null || !LJJJJ()) {
            return false;
        }
        this.LLIZLLLIL = null;
        LJJJJJL(new AwS406S0200000_5(this, motionEvent, 97));
        return false;
    }

    public C0FUE(C1664680tQA<BaseStickerModel> c1664680tQA, C390420FSm c390420FSm) {
        this.LL = c1664680tQA;
        this.LLILLJJLI = c390420FSm;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public boolean LLLLLLLLL(b bVar, float f, float f2) {
        boolean z;
        RectF rectFLJJJJI = LJJJJI();
        if (!LJJIL() && !C121Q.LIZ(f, f2, LJJJIL().LIZ.getRotation(), rectFLJJJJI, 0.0f)) {
            z = false;
        } else {
            z = true;
        }
        if (!LJJJJ()) {
            if (z) {
                LJJJJL(new AwS584S0100000_5(this, 818));
            }
            return false;
        }
        if (!z) {
            return false;
        }
        this.LLILZIL = new C0FUJ<>(new Pair(Float.valueOf(f), Float.valueOf(f2)));
        LJJJJL(new AwS584S0100000_5(this, 819));
        return true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!LJJJJ() || motionEvent == null || motionEvent2 == null) {
            return false;
        }
        RectF rectFLJJJJI = LJJJJI();
        if (C121Q.LIZ(motionEvent2.getX(), motionEvent2.getY(), LJJJIL().LIZ.getRotation(), rectFLJJJJI, 0.0f)) {
            LJJJJL(new AwS584S0100000_5(this, motionEvent, motionEvent2, f, f2, 817));
            return true;
        }
        if (C121Q.LIZ(motionEvent.getX(), motionEvent.getY(), LJJJIL().LIZ.getRotation(), rectFLJJJJI, 0.0f) || this.LLJILJILJ) {
            return true;
        }
        this.LLJILJILJ = false;
        return false;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!LJJJJ() || motionEvent == null || motionEvent2 == null) {
            return false;
        }
        if (C121Q.LIZ(motionEvent2.getX(), motionEvent2.getY(), LJJJIL().LIZ.getRotation(), LJJJJI(), 0.0f)) {
            LJJJJL(new AwS584S0100000_5(this, motionEvent, motionEvent2, f, f2, 825));
            return true;
        }
        if (!this.LLJILJILJ) {
            return false;
        }
        return true;
    }
}

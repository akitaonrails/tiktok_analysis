package X;

import Y.AComparatorS24S0000000_5;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.Intrinsics;
import zoo.b;

/* JADX INFO: renamed from: X.0FUK, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FUK extends C0FUM {
    public C0FUE LLILLJJLI;
    public C0FUE LLILLL;
    public C0FUE LLILZ;
    public boolean LLILZLL;
    public final ArrayList<C0FUE> LL = new ArrayList<>();
    public final ArrayList<GestureLayout$OnGestureListener> LLILZIL = new ArrayList<>();
    public boolean LLIZ = true;

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean E2(C21645419nQ c21645419nQ) {
        if (!this.LLIZ) {
            return this instanceof C1417630mzh;
        }
        ArrayList<C0FUE> arrayList = this.LL;
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS24S0000000_5(54));
        }
        int i = 0;
        for (C0FUE c0fue : this.LL) {
            int i2 = i + 1;
            if (i >= 0) {
                C0FUE c0fue2 = c0fue;
                if (c0fue2.E2(c21645419nQ)) {
                    if (!c0fue2.LJJJ() && i != 0) {
                        c0fue2.LJJJJLL(((C0FUE) C13LP.LJJJJZI(this.LL)).LJJJJIZL() + 1);
                    }
                    this.LLILZ = c0fue2;
                    return true;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        Iterator<GestureLayout$OnGestureListener> it2 = this.LLILZIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().E2(c21645419nQ)) {
                return true;
            }
        }
        return this instanceof C1417630mzh;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LIZIZ(MotionEvent motionEvent) {
        if (!this.LLIZ) {
            return this instanceof C1417630mzh;
        }
        ArrayList<C0FUE> arrayList = this.LL;
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS24S0000000_5(51));
        }
        int i = 0;
        for (C0FUE c0fue : this.LL) {
            int i2 = i + 1;
            if (i >= 0) {
                C0FUE c0fue2 = c0fue;
                if (c0fue2.LIZIZ(motionEvent)) {
                    if (!c0fue2.LJJJ() && i != 0) {
                        c0fue2.LJJJJLL(((C0FUE) C13LP.LJJJJZI(this.LL)).LJJJJIZL() + 1);
                    }
                    return true;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        Iterator<GestureLayout$OnGestureListener> it2 = this.LLILZIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().LIZIZ(motionEvent)) {
                return true;
            }
        }
        return this instanceof C1417630mzh;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final void LJFF(b bVar) {
        if (!this.LLIZ) {
            return;
        }
        C0FUE c0fue = this.LLILLJJLI;
        if (c0fue != null) {
            c0fue.LJFF(bVar);
        }
        this.LLILLJJLI = null;
        if (this.LLILZLL) {
            Iterator<GestureLayout$OnGestureListener> it2 = this.LLILZIL.iterator();
            while (it2.hasNext()) {
                it2.next().LJFF(bVar);
            }
            this.LLILZLL = false;
        }
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LJIIIZ(float f) {
        if (!this.LLIZ) {
            return this instanceof C1417630mzh;
        }
        C0FUE c0fue = this.LLILZ;
        if (c0fue != null) {
            c0fue.LJIIIZ(f);
        }
        this.LLILZ = null;
        Iterator<GestureLayout$OnGestureListener> it2 = this.LLILZIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().LJIIIZ(f)) {
                return true;
            }
        }
        return this instanceof C1417630mzh;
    }

    public final void LJJIJIL(C0FUE c0fue) {
        C01TT.LIZLLL(new AwS406S0200000_5(this, c0fue, 99));
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LJJLIIIJLJLI(float f) {
        if (!this.LLIZ) {
            return this instanceof C1417630mzh;
        }
        C0FUE c0fue = this.LLILZ;
        if (c0fue != null) {
            c0fue.LJJLIIIJLJLI(f);
            return true;
        }
        Iterator<GestureLayout$OnGestureListener> it2 = this.LLILZIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().LJJLIIIJLJLI(f)) {
                return true;
            }
        }
        return this instanceof C1417630mzh;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LLLLJI(float f) {
        if (!this.LLIZ) {
            return this instanceof C1417630mzh;
        }
        C0FUE c0fue = this.LLILLL;
        if (c0fue != null) {
            c0fue.LLLLJI(f);
        }
        this.LLILLL = null;
        Iterator<GestureLayout$OnGestureListener> it2 = this.LLILZIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().LLLLJI(f)) {
                return true;
            }
        }
        return this instanceof C1417630mzh;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LLLZLZ(b bVar) {
        if (!this.LLIZ) {
            return this instanceof C1417630mzh;
        }
        C0FUE c0fue = this.LLILLJJLI;
        if (c0fue != null) {
            c0fue.LLLZLZ(bVar);
            return true;
        }
        Iterator<GestureLayout$OnGestureListener> it2 = this.LLILZIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().LLLZLZ(bVar)) {
                return true;
            }
        }
        return this instanceof C1417630mzh;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (!this.LLIZ) {
            return this instanceof C1417630mzh;
        }
        Iterator<GestureLayout$OnGestureListener> it2 = this.LLILZIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().onDown(motionEvent)) {
                this.LLILZLL = true;
                return true;
            }
        }
        if (motionEvent != null) {
            for (C0FUE c0fue : this.LL) {
                c0fue.onDown(motionEvent);
                if (c0fue.LJJJJJ(motionEvent)) {
                    this.LLILZLL = true;
                    return true;
                }
            }
        }
        return this instanceof C1417630mzh;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (!this.LLIZ) {
            return this instanceof C1417630mzh;
        }
        C0FUE c0fue = this.LLILLL;
        if (c0fue != null) {
            c0fue.onScale(scaleGestureDetector);
            return true;
        }
        Iterator<GestureLayout$OnGestureListener> it2 = this.LLILZIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().onScale(scaleGestureDetector)) {
                return true;
            }
        }
        return this instanceof C1417630mzh;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (!this.LLIZ) {
            return this instanceof C1417630mzh;
        }
        ArrayList<C0FUE> arrayList = this.LL;
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS24S0000000_5(55));
        }
        int i = 0;
        for (C0FUE c0fue : this.LL) {
            int i2 = i + 1;
            if (i >= 0) {
                C0FUE c0fue2 = c0fue;
                if (c0fue2.onScaleBegin(scaleGestureDetector)) {
                    if (!c0fue2.LJJJ() && i != 0) {
                        c0fue2.LJJJJLL(((C0FUE) C13LP.LJJJJZI(this.LL)).LJJJJIZL() + 1);
                    }
                    this.LLILLL = c0fue2;
                    return true;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        Iterator<GestureLayout$OnGestureListener> it2 = this.LLILZIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().onScaleBegin(scaleGestureDetector)) {
                return true;
            }
        }
        return this instanceof C1417630mzh;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C0FUE c0fue;
        if (!this.LLIZ) {
            return this instanceof C1417630mzh;
        }
        ArrayList<C0FUE> arrayList = this.LL;
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS24S0000000_5(57));
        }
        int i = 0;
        for (C0FUE c0fue2 : this.LL) {
            int i2 = i + 1;
            if (i >= 0) {
                C0FUE c0fue3 = c0fue2;
                if (c0fue3.onSingleTapConfirmed(motionEvent)) {
                    if (!c0fue3.LJJJ() && i != 0 && (c0fue = (C0FUE) C13LP.LJJJLL(this.LL)) != null) {
                        c0fue3.LJJJJLL(c0fue.LJJJJIZL() + 1);
                    }
                    return true;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        Iterator<GestureLayout$OnGestureListener> it2 = this.LLILZIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().onSingleTapConfirmed(motionEvent)) {
                return true;
            }
        }
        return this instanceof C1417630mzh;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final void onTouchEvent(MotionEvent motionEvent) {
        if (!this.LLIZ) {
            return;
        }
        ArrayList<C0FUE> arrayList = this.LL;
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS24S0000000_5(58));
        }
        Iterator<C0FUE> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().onTouchEvent(motionEvent);
        }
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onUp(MotionEvent motionEvent) {
        Boolean boolValueOf;
        if (this.LLILZLL) {
            Iterator<GestureLayout$OnGestureListener> it2 = this.LLILZIL.iterator();
            while (it2.hasNext()) {
                if (it2.next().onUp(motionEvent)) {
                    return true;
                }
            }
            if (motionEvent != null) {
                for (C0FUE c0fue : this.LL) {
                    c0fue.onUp(motionEvent);
                    if (c0fue.LJJJJJ(motionEvent)) {
                        return true;
                    }
                }
            }
            this.LLILZLL = false;
        }
        C0FUE c0fue2 = this.LLILLJJLI;
        if (c0fue2 != null) {
            c0fue2.onUp(motionEvent);
        }
        if (motionEvent != null) {
            C0FUE c0fue3 = this.LLILLL;
            if (c0fue3 != null) {
                boolValueOf = Boolean.valueOf(c0fue3.LJJJJJ(motionEvent));
            } else {
                boolValueOf = null;
            }
            if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LLLLLLLLL(b bVar, float f, float f2) {
        if (!this.LLIZ) {
            return this instanceof C1451440nsE;
        }
        ArrayList<C0FUE> arrayList = this.LL;
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS24S0000000_5(53));
        }
        int i = 0;
        for (C0FUE c0fue : this.LL) {
            int i2 = i + 1;
            if (i >= 0) {
                C0FUE c0fue2 = c0fue;
                if (c0fue2.LLLLLLLLL(bVar, f, f2)) {
                    if (!c0fue2.LJJJ() && i != 0) {
                        c0fue2.LJJJJLL(((C0FUE) C13LP.LJJJJZI(this.LL)).LJJJJIZL() + 1);
                    }
                    this.LLILLJJLI = c0fue2;
                    return true;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        Iterator<GestureLayout$OnGestureListener> it2 = this.LLILZIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().LLLLLLLLL(bVar, f, f2)) {
                return true;
            }
        }
        return this instanceof C1451440nsE;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.LLIZ) {
            return this instanceof C1417630mzh;
        }
        ArrayList<C0FUE> arrayList = this.LL;
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS24S0000000_5(52));
        }
        for (C0FUE c0fue : this.LL) {
            if (c0fue.onScroll(motionEvent, motionEvent2, f, f) || c0fue.onFling(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
        }
        return this instanceof C1417630mzh;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.LLIZ) {
            return this instanceof C1417630mzh;
        }
        ArrayList<C0FUE> arrayList = this.LL;
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS24S0000000_5(56));
        }
        Iterator<C0FUE> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            if (it2.next().onScroll(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
        }
        return this instanceof C1417630mzh;
    }
}

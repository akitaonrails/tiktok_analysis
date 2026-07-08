package X;

import Y.AComparatorS39S0000000_20;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI;
import com.bytedance.sdui.render.tasm.behavior.ui.utils.BackgroundDrawable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.0kHk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1313500kHk<T extends ViewGroup> extends AbstractC1313520kHm<T> implements InterfaceC1314190kIr {
    public static final WeakHashMap<View, Integer> LLLLLZ = new WeakHashMap<>();
    public static final PointF LLLLLZIL = new PointF();
    public static final float[] LLLLLZL = new float[2];
    public static final Matrix LLLLZ = new Matrix();
    public SDUIBaseUI LLLLLLLZIL;
    public C1314510kJN LLLLLLZ;
    public boolean LLLLLLZZ;

    public AbstractC1313500kHk() {
        throw null;
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final boolean LJJJZ() {
        return false;
    }

    public final void LJLLLL() {
        for (int i = 0; i < ((ArrayList) this.LLIZLLLIL).size(); i++) {
            SDUIBaseUI sDUIBaseUI = (SDUIBaseUI) ListProtector.get(this.LLIZLLLIL, i);
            if (sDUIBaseUI.LJJJLIIL()) {
                sDUIBaseUI.LJJIII();
                sDUIBaseUI.LJJIIJ();
            } else {
                ((AbstractC1313520kHm) sDUIBaseUI).LJLJLJ();
            }
        }
    }

    @Override // X.InterfaceC1314190kIr
    public final void afterDispatchDraw(Canvas canvas) {
    }

    @Override // X.InterfaceC1314190kIr
    public final void afterDrawChild(Canvas canvas, View view, long j) {
    }

    @Override // X.AbstractC1313520kHm, com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public void LJJJLZIJ() {
        if (this.LLLLLILLIL.isLayoutRequested()) {
            LJLLLLLL();
            super.LJJJLZIJ();
        }
    }

    @Override // X.AbstractC1313520kHm
    public void LJLJLJ() {
        if (this.LLLLLILLIL.isLayoutRequested()) {
            LJLJJLL();
            LJLLLL();
        }
    }

    public final void LJLL() {
        Iterator it2 = ((ArrayList) this.LLIZLLLIL).iterator();
        while (it2.hasNext()) {
            ((SDUIBaseUI) it2.next()).LJJLIIIIJ();
        }
    }

    public final void LJLLI() {
        Iterator it2 = ((ArrayList) this.LLIZLLLIL).iterator();
        while (it2.hasNext()) {
            ((SDUIBaseUI) it2.next()).LJJLIIIJJI();
        }
    }

    public final void LJLLLLLL() {
        Iterator it2 = ((ArrayList) this.LLIZLLLIL).iterator();
        while (it2.hasNext()) {
            ((SDUIBaseUI) it2.next()).LJJJLZIJ();
        }
    }

    @Override // X.AbstractC1313520kHm, com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public void LJIIJ() {
        super.LJIIJ();
        Iterator it2 = ((ArrayList) this.LLIZLLLIL).iterator();
        while (it2.hasNext()) {
            ((SDUIBaseUI) it2.next()).LJIIJ();
        }
    }

    @Override // X.AbstractC1313520kHm, com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public void LJJJJLI() {
        super.LJJJJLI();
        T t = this.LLLLLILLIL;
        this.LLLLLLZ = new C1314510kJN((ViewGroup) t);
        if (t instanceof InterfaceC1314700kJg) {
            ((InterfaceC1314700kJg) t).bindDrawChildHook(this);
        }
    }

    @Override // X.AbstractC1313520kHm, com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJJLIIIIJ() {
        super.LJJLIIIIJ();
        LJLL();
    }

    @Override // X.AbstractC1313520kHm, com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJJLIIIJJI() {
        super.LJJLIIIJJI();
        LJLLI();
    }

    @Override // X.InterfaceC1314190kIr
    public final boolean hasOverlappingRendering() {
        return this.LLLLLLL;
    }

    @Override // X.InterfaceC1314190kIr
    public final void performLayoutChildrenUI() {
        LJLLLL();
    }

    @Override // X.InterfaceC1314190kIr
    public final void performMeasureChildrenUI() {
        LJLLLLLL();
    }

    public AbstractC1313500kHk(AbstractC1317090kNX abstractC1317090kNX) {
        super(abstractC1317090kNX);
        this.LLLLLLLZIL = this.LLLLLLLLL;
        new Rect();
        this.LLLLLLZZ = false;
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public SDUIBaseUI LJIILJJIL(int i) {
        return (SDUIBaseUI) ListProtector.get(this.LLIZLLLIL, i);
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final int LJIJJ(SDUIBaseUI sDUIBaseUI) {
        return ((ArrayList) this.LLIZLLLIL).indexOf(sDUIBaseUI);
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public void LJJLIIJ(SDUIBaseUI sDUIBaseUI) {
        if (((ArrayList) this.LLIZLLLIL).remove(sDUIBaseUI)) {
            sDUIBaseUI.LJJZZI(null);
            LJLZ(sDUIBaseUI);
        }
    }

    public void LJLLL(AbstractC1313520kHm abstractC1313520kHm) {
        int i = -1;
        for (SDUIBaseUI sDUIBaseUI = this.LLLLLLLLL; sDUIBaseUI != null; sDUIBaseUI = sDUIBaseUI.LLILLJJLI) {
            if (sDUIBaseUI instanceof AbstractC1313520kHm) {
                i++;
            }
            if (sDUIBaseUI == abstractC1313520kHm) {
                break;
            }
        }
        if (abstractC1313520kHm.LLLLLILLIL.getParent() != null && (abstractC1313520kHm.LLLLLILLIL.getParent() instanceof ViewGroup)) {
            C786410Ut5.LJJJLZIJ(abstractC1313520kHm.LLLLLILLIL, (ViewGroup) abstractC1313520kHm.LLLLLILLIL.getParent());
        }
        ((ViewGroup) this.LLLLLILLIL).addView(abstractC1313520kHm.LLLLLILLIL, i);
    }

    public void LJLZ(SDUIBaseUI sDUIBaseUI) {
        if (sDUIBaseUI instanceof AbstractC1313520kHm) {
            C786410Ut5.LJJJLZIJ(((AbstractC1313520kHm) sDUIBaseUI).LLLLLILLIL, (ViewGroup) this.LLLLLILLIL);
        } else {
            LJJJJZ();
        }
    }

    @Override // X.InterfaceC1314190kIr
    public final void beforeDispatchDraw(Canvas canvas) {
        boolean z;
        BackgroundDrawable backgroundDrawable;
        C1313640kHy c1313640kHy;
        Path path;
        this.LLLLLLLZIL = this.LLLLLLLLL;
        if (this.LLLILZJ == 0.0f && this.LLLILZLLLI == 0.0f) {
            z = false;
        } else {
            z = true;
        }
        if (!this.LLLFZ) {
            this.LLILZ.getClass();
            return;
        }
        C1313690kI3 c1313690kI3 = this.LLJ;
        if (c1313690kI3 == null || (backgroundDrawable = c1313690kI3.LIZIZ) == null) {
            return;
        }
        if (backgroundDrawable.LJIL != null && backgroundDrawable.LJIILLIIL() && (c1313640kHy = backgroundDrawable.LJI) != null && (path = c1313640kHy.LIZJ) != null) {
            canvas.clipPath(path);
        } else {
            if (!z) {
                return;
            }
            canvas.clipRect(LJIILLIIL());
        }
    }

    @Override // X.InterfaceC1314190kIr
    public final void beforeDraw(Canvas canvas) {
        canvas.skew(this.LLLILZJ, this.LLLILZLLLI);
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public void LJJJJLL(SDUIBaseUI sDUIBaseUI, int i) {
        int[] iArrLJJII = LJJII();
        sDUIBaseUI.getClass();
        sDUIBaseUI.LLLLIL = new WeakReference<>(iArrLJJII);
        ListProtector.add(this.LLIZLLLIL, i, sDUIBaseUI);
        sDUIBaseUI.LJJZZI(this);
        this.LLLLLLZZ = true;
    }

    @Override // X.InterfaceC1314190kIr
    public final int getChildDrawingOrder(int i, int i2) {
        C1314510kJN c1314510kJN = this.LLLLLLZ;
        if (c1314510kJN != null) {
            if (c1314510kJN.LIZIZ == null) {
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < i; i3++) {
                    arrayList.add(c1314510kJN.LIZ.getChildAt(i3));
                }
                Collections.sort(arrayList, new AComparatorS39S0000000_20(4));
                c1314510kJN.LIZIZ = new int[i];
                for (int i4 = 0; i4 < i; i4++) {
                    c1314510kJN.LIZIZ[i4] = c1314510kJN.LIZ.indexOfChild((View) ListProtector.get(arrayList, i4));
                }
            }
            return c1314510kJN.LIZIZ[i2];
        }
        return i2;
    }

    public final AbstractC1313520kHm LJLLILLLL(float[] fArr, ViewGroup viewGroup, Map<View, AbstractC1313520kHm> map) {
        char c = 1;
        int childCount = viewGroup.getChildCount() - 1;
        AbstractC1313520kHm abstractC1313520kHmLJLLILLLL = null;
        while (childCount >= 0) {
            View childAt = viewGroup.getChildAt(childCount);
            if (this.LLILZ.LLJILJIL) {
                float[] fArrLJJIJL = LJJIJL(fArr[0], fArr[c], viewGroup.getScrollX(), viewGroup.getScrollY(), new Rect(childAt.getLeft(), childAt.getTop(), 0, 0), childAt.getMatrix());
                float f = fArrLJJIJL[0];
                float[] fArr2 = {f, fArrLJJIJL[1]};
                if (f >= 0.0f && f < childAt.getRight() - childAt.getLeft()) {
                    float f2 = fArr2[1];
                    if (f2 >= 0.0f && f2 < childAt.getBottom() - childAt.getTop()) {
                        HashMap map2 = (HashMap) map;
                        if (map2.containsKey(childAt)) {
                            abstractC1313520kHmLJLLILLLL = (AbstractC1313520kHm) map2.get(childAt);
                            fArr[0] = fArr2[0];
                            fArr[1] = fArr2[1];
                            if (abstractC1313520kHmLJLLILLLL != null) {
                                return abstractC1313520kHmLJLLILLLL;
                            }
                        } else if ((childAt instanceof ViewGroup) && (abstractC1313520kHmLJLLILLLL = LJLLILLLL(fArr2, (ViewGroup) childAt, map)) != null) {
                            fArr[0] = fArr2[0];
                            fArr[1] = fArr2[1];
                            return abstractC1313520kHmLJLLILLLL;
                        }
                    }
                }
            } else {
                PointF pointF = LLLLLZIL;
                float f3 = fArr[0];
                float scrollX = (f3 + viewGroup.getScrollX()) - childAt.getLeft();
                float scrollY = (fArr[1] + viewGroup.getScrollY()) - childAt.getTop();
                Matrix matrix = childAt.getMatrix();
                if (!matrix.isIdentity()) {
                    float[] fArr3 = LLLLLZL;
                    fArr3[0] = scrollX;
                    fArr3[1] = scrollY;
                    Matrix matrix2 = LLLLZ;
                    matrix.invert(matrix2);
                    matrix2.mapPoints(fArr3);
                    scrollX = fArr3[0];
                    scrollY = fArr3[1];
                }
                if (scrollX >= 0.0f && scrollX < childAt.getRight() - childAt.getLeft() && scrollY >= 0.0f && scrollY < childAt.getBottom() - childAt.getTop()) {
                    pointF.set(scrollX, scrollY);
                    float f4 = fArr[0];
                    float f5 = fArr[1];
                    fArr[0] = pointF.x;
                    fArr[1] = pointF.y;
                    HashMap map3 = (HashMap) map;
                    if (map3.containsKey(childAt)) {
                        abstractC1313520kHmLJLLILLLL = (AbstractC1313520kHm) map3.get(childAt);
                    } else {
                        if (childAt instanceof ViewGroup) {
                            abstractC1313520kHmLJLLILLLL = LJLLILLLL(fArr, (ViewGroup) childAt, map);
                        }
                        fArr[0] = f4;
                        fArr[1] = f5;
                    }
                    if (abstractC1313520kHmLJLLILLLL != null) {
                        return abstractC1313520kHmLJLLILLLL;
                    }
                    fArr[0] = f4;
                    fArr[1] = f5;
                }
            }
            childCount--;
            c = 1;
        }
        return abstractC1313520kHmLJLLILLLL;
    }

    public final InterfaceC1317060kNU LJLLJ(float f, float f2, AbstractC1313500kHk abstractC1313500kHk) {
        HashMap map = new HashMap();
        for (int size = ((ArrayList) abstractC1313500kHk.LLIZLLLIL).size() - 1; size >= 0; size--) {
            SDUIBaseUI sDUIBaseUILJIILJJIL = abstractC1313500kHk.LJIILJJIL(size);
            if (sDUIBaseUILJIILJJIL instanceof C1313490kHj) {
                sDUIBaseUILJIILJJIL = ((C1313490kHj) sDUIBaseUILJIILJJIL).LLLLZI;
            }
            if (sDUIBaseUILJIILJJIL instanceof AbstractC1313520kHm) {
                AbstractC1313520kHm abstractC1313520kHm = (AbstractC1313520kHm) sDUIBaseUILJIILJJIL;
                map.put(abstractC1313520kHm.LLLLLILLIL, abstractC1313520kHm);
            } else {
                C1314420kJE.LIZIZ(new RuntimeException("ui that need custom layout should not have flatten child!"));
                throw null;
            }
        }
        float[] fArr = {f, f2};
        AbstractC1313520kHm abstractC1313520kHmLJLLILLLL = LJLLILLLL(fArr, (ViewGroup) abstractC1313500kHk.LLLLLILLIL, map);
        if (abstractC1313520kHmLJLLILLLL != null) {
            if (abstractC1313520kHmLJLLILLLL.LJJJZ() && (abstractC1313520kHmLJLLILLLL instanceof AbstractC1313500kHk)) {
                AbstractC1313500kHk abstractC1313500kHk2 = (AbstractC1313500kHk) abstractC1313520kHmLJLLILLLL;
                return abstractC1313500kHk2.LJLLJ(fArr[0], fArr[1], abstractC1313500kHk2);
            }
            if (this.LLILZ.LLJILJIL) {
                return abstractC1313520kHmLJLLILLLL.LJJJJJ(fArr[0], fArr[1]);
            }
            float f3 = 0;
            return abstractC1313520kHmLJLLILLLL.LJJJJJ(fArr[0] + f3, fArr[1] + f3);
        }
        return abstractC1313500kHk;
    }

    @Override // X.InterfaceC1314190kIr
    public final Rect beforeDrawChild(Canvas canvas, View view, long j) {
        for (SDUIBaseUI sDUIBaseUI = this.LLLLLLLZIL; sDUIBaseUI != null; sDUIBaseUI = sDUIBaseUI.LLILLJJLI) {
            if (!sDUIBaseUI.LJJJLIIL()) {
                if (((AbstractC1313520kHm) sDUIBaseUI).LLLLLILLIL == view) {
                    Rect rectLJIIL = sDUIBaseUI.LJIIL();
                    this.LLLLLLLZIL = sDUIBaseUI.LLILLJJLI;
                    return rectLJIIL;
                }
            } else if (sDUIBaseUI.LJJJLIIL()) {
                Rect rect = sDUIBaseUI.LLJJIII;
                canvas.save();
                if (rect != null) {
                    canvas.clipRect(rect);
                }
                canvas.restore();
            }
        }
        return null;
    }
}

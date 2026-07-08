package X;

import Y.ARunnableS110S0100000_10;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS49S0110000_31;
import Y.ARunnableS64S0300000_31;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.arch.MixStickyLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS645S0100000_31;

/* JADX INFO: renamed from: X.15WQ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15WQ {
    public final C0HA4 LIZ;
    public final LinearLayout LIZIZ;
    public final MixStickyLayoutManager LIZJ;
    public final List<Integer> LIZLLL = new ArrayList();
    public final List<Integer> LJ = new ArrayList();
    public final List<Integer> LJFF = new ArrayList();
    public final List<Integer> LJI = new ArrayList();
    public final List<Integer> LJII = new ArrayList();
    public final List<Integer> LJIIIIZZ = new ArrayList();
    public final Map<Integer, Integer> LJIIIZ = new LinkedHashMap();
    public final Map<Integer, Integer> LJIIJ = new LinkedHashMap();
    public final Map<Integer, FrameLayout> LJIIJJI = new LinkedHashMap();
    public final Map<Integer, FrameLayout> LJIIL = new LinkedHashMap();
    public int LJIILIIL = -1;
    public final Map<Integer, Integer> LJIILJJIL = new LinkedHashMap();
    public int LJIILL = -1;
    public final C01GW LJIILLIIL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(790));
    public final C790480Uze LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e A[Catch: all -> 0x00a5, PHI: r1
      0x003e: PHI (r1v12 java.lang.Integer) = (r1v9 java.lang.Integer), (r1v5 java.lang.Integer) binds: [B:26:0x0087, B:11:0x003c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x00a5, blocks: (B:3:0x0001, B:4:0x000a, B:6:0x0010, B:8:0x0028, B:10:0x0038, B:12:0x003e, B:13:0x0042, B:15:0x0052, B:16:0x0056, B:20:0x0061, B:22:0x0067, B:23:0x0075, B:25:0x0079, B:28:0x008b, B:30:0x009b, B:32:0x00a1), top: B:37:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZJ() {
        /*
            r7 = this;
            r2 = 0
            java.util.List<java.lang.Integer> r0 = r7.LJIIIIZZ     // Catch: java.lang.Throwable -> La5
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> La5
            java.util.Iterator r6 = r0.iterator()     // Catch: java.lang.Throwable -> La5
            r5 = 0
        La:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> La5
            if (r0 == 0) goto La4
            java.lang.Object r0 = r6.next()     // Catch: java.lang.Throwable -> La5
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> La5
            int r4 = r0.intValue()     // Catch: java.lang.Throwable -> La5
            java.util.List<java.lang.Integer> r1 = r7.LJI     // Catch: java.lang.Throwable -> La5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> La5
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> La5
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> La5
            if (r0 == 0) goto L8b
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r7.LJIIIZ     // Catch: java.lang.Throwable -> La5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> La5
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> La5
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> La5
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> La5
            if (r1 == 0) goto L79
            int r0 = r1.intValue()     // Catch: java.lang.Throwable -> La5
            if (r0 <= 0) goto L79
        L3e:
            int r3 = r1.intValue()     // Catch: java.lang.Throwable -> La5
        L42:
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r7.LJIIJ     // Catch: java.lang.Throwable -> La5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> La5
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> La5
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> La5
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> La5
            if (r0 == 0) goto L77
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> La5
        L56:
            int r0 = X.C13LZ.LJ(r0, r2, r3)     // Catch: java.lang.Throwable -> La5
            int r3 = r3 - r0
            if (r3 >= 0) goto L5f
            r3 = 0
            goto L61
        L5f:
            if (r3 > 0) goto L75
        L61:
            boolean r0 = r7.LJIILJJIL(r4)     // Catch: java.lang.Throwable -> La5
            if (r0 == 0) goto L75
            r0 = 8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> La5
            float r0 = X.C418440Gaw.LIZIZ(r0)     // Catch: java.lang.Throwable -> La5
            int r3 = X.C814420VxA.LIZIZ(r0)     // Catch: java.lang.Throwable -> La5
        L75:
            int r5 = r5 + r3
            goto La
        L77:
            r0 = 0
            goto L56
        L79:
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r7.LJIILJJIL     // Catch: java.lang.Throwable -> La5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> La5
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> La5
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> La5
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> La5
            if (r1 != 0) goto L3e
            r3 = 0
            goto L42
        L8b:
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r7.LJIILJJIL     // Catch: java.lang.Throwable -> La5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> La5
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> La5
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> La5
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> La5
            if (r0 == 0) goto La0
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> La5
            goto La1
        La0:
            r0 = 0
        La1:
            int r5 = r5 + r0
            goto La
        La4:
            return r5
        La5:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15WQ.LIZJ():int");
    }

    public final boolean LJIILIIL() {
        try {
            if (!((ArrayList) this.LJII).isEmpty() && !((ArrayList) this.LJIIIIZZ).isEmpty()) {
                int iIntValue = ((Number) C13LP.LJJLJ(this.LJII)).intValue();
                View viewFindViewByPosition = this.LIZJ.findViewByPosition(iIntValue + 1);
                if (viewFindViewByPosition != null && this.LIZJ.findViewByPosition(iIntValue) != null) {
                    if (Math.abs(viewFindViewByPosition.getTop() - this.LIZIZ.getHeight()) <= 20) {
                        return true;
                    }
                    if (viewFindViewByPosition.getTop() > this.LIZIZ.getHeight()) {
                        return true;
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return false;
    }

    public final void LIZLLL() {
        if (((Boolean) C136600fc.LIZ.getValue()).booleanValue()) {
            this.LJIJI = true;
            try {
                List<Integer> list = this.LJIIIIZZ;
                ArrayList arrayList = new ArrayList();
                for (Integer num : list) {
                    int iIntValue = num.intValue();
                    if (((ArrayList) this.LJI).contains(Integer.valueOf(iIntValue))) {
                        arrayList.add(num);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    int iIntValue2 = ((Number) it2.next()).intValue();
                    Integer num2 = (Integer) ((LinkedHashMap) this.LJIIJ).get(Integer.valueOf(iIntValue2));
                    if (num2 != null && num2.intValue() != 0) {
                        this.LJIIJ.put(Integer.valueOf(iIntValue2), 0);
                        LJIIJ(iIntValue2);
                    }
                }
                this.LIZIZ.requestLayout();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            HandlerHook.viewPostDelay(this.LIZ, new ARunnableS110S0100000_10(this, 96), 200L);
        }
    }

    public final void LJII() {
        int iIntValue;
        FrameLayout frameLayoutLJFF;
        FrameLayout frameLayout;
        View childAt;
        try {
            int size = ((ArrayList) this.LJIIIIZZ).size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    if (size < this.LIZIZ.getChildCount() && (frameLayoutLJFF = LJFF((iIntValue = ((Number) ((ArrayList) this.LJIIIIZZ).get(size)).intValue()))) != null) {
                        if (frameLayoutLJFF.getChildCount() > 0) {
                            C786410Ut5.LJJJJIZL(frameLayoutLJFF);
                        }
                        View childAt2 = this.LIZIZ.getChildAt(size);
                        if ((childAt2 instanceof FrameLayout) && (frameLayout = (FrameLayout) childAt2) != null && (childAt = frameLayout.getChildAt(0)) != null) {
                            Integer num = (Integer) ((LinkedHashMap) this.LJIIIZ).get(Integer.valueOf(iIntValue));
                            int iIntValue2 = num != null ? num.intValue() : 0;
                            Integer num2 = (Integer) ((LinkedHashMap) this.LJIIJ).get(Integer.valueOf(iIntValue));
                            int iIntValue3 = num2 != null ? num2.intValue() : 0;
                            int height = childAt.getHeight();
                            int iMax = Math.max(iIntValue2, (1 > height || height >= iIntValue2) ? childAt.getHeight() : childAt.getHeight() + iIntValue3);
                            if (iMax < 0) {
                                iMax = 0;
                            }
                            C786410Ut5.ed(childAt, 0.0f);
                            childAt.setClipBounds(null);
                            C786410Ut5.LJJJZ(childAt, frameLayout);
                            C786410Ut5.LJJL(frameLayout, this.LIZIZ);
                            frameLayoutLJFF.addView(childAt, new FrameLayout.LayoutParams(-1, iMax));
                            C786410Ut5.LJZ(0, frameLayoutLJFF);
                            ViewGroup.LayoutParams layoutParams = frameLayoutLJFF.getLayoutParams();
                            if (layoutParams != null) {
                                layoutParams.height = iMax;
                            }
                            HandlerHook.viewPost(frameLayoutLJFF, new ARunnableS64S0300000_31(childAt, this, frameLayoutLJFF, 7));
                            this.LJIIJJI.remove(Integer.valueOf(iIntValue));
                            this.LJIIL.remove(Integer.valueOf(iIntValue));
                            this.LJIIIZ.remove(Integer.valueOf(iIntValue));
                            this.LJIIJ.remove(Integer.valueOf(iIntValue));
                            ((ArrayList) this.LJIIIIZZ).remove(size);
                        }
                    }
                    if (i < 0) {
                        break;
                    } else {
                        size = i;
                    }
                }
            }
            if (this.LIZIZ.getVisibility() == 0) {
                C786410Ut5.LJZL(4, this.LIZIZ);
            }
            LIZIZ(0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJIIIZ() {
        List listLJLLJ = C13LP.LJLLJ(C13LP.LJJJJI(C13LP.LJLIL(this.LJ, this.LJFF)));
        List listLJLLJ2 = C13LP.LJLLJ(C13LP.LJJJJI(C13LP.LJLIL(listLJLLJ, this.LIZLLL)));
        ((ArrayList) this.LJI).clear();
        ((ArrayList) this.LJI).addAll(listLJLLJ);
        ((ArrayList) this.LJII).clear();
        ((ArrayList) this.LJII).addAll(listLJLLJ2);
    }

    public final void LJIIL() {
        try {
            int i = this.LJIILIIL;
            ((ArrayList) this.LIZLLL).clear();
            ((ArrayList) this.LJ).clear();
            ((ArrayList) this.LJFF).clear();
            ((ArrayList) this.LJII).clear();
            ((ArrayList) this.LJI).clear();
            ((ArrayList) this.LJIIIIZZ).clear();
            ((LinkedHashMap) this.LJIIIZ).clear();
            ((LinkedHashMap) this.LJIIJ).clear();
            ((LinkedHashMap) this.LJIIJJI).clear();
            ((LinkedHashMap) this.LJIIL).clear();
            ((LinkedHashMap) this.LJIILJJIL).clear();
            this.LJIJ = false;
            this.LJIJI = false;
            C790480Uze c790480Uze = this.LJIIZILJ;
            c790480Uze.LJ = null;
            c790480Uze.LJFF = false;
            c790480Uze.LIZLLL = 0L;
            c790480Uze.LJI++;
            C786410Ut5.LJJJJJL(this.LIZIZ);
            C786410Ut5.LJZL(4, this.LIZIZ);
            if (i >= 0) {
                C0HA4 c0ha4 = this.LIZ;
                c0ha4.setPadding(c0ha4.getPaddingLeft(), i, getPaddingRight(), getPaddingBottom());
            }
            this.LJIILIIL = -1;
            this.LJIILL = -1;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZIZ(int i) {
        int i2;
        try {
            if (this.LJIILIIL < 0) {
                this.LJIILIIL = getPaddingTop();
            }
            boolean z = false;
            if (i < 0) {
                i2 = 0;
            } else {
                i2 = i;
            }
            int i3 = this.LJIILIIL + i2;
            int paddingTop = getPaddingTop();
            if (this.LJIILL == i3 && paddingTop == i3) {
                return;
            }
            if (i3 < paddingTop) {
                z = true;
            }
            if (this.LJIIZILJ.LIZ(i, i3, paddingTop, z)) {
                return;
            }
            this.LJIIZILJ.LJ = null;
            this.LJIILL = i3;
            C0HA4 c0ha4 = this.LIZ;
            c0ha4.setPadding(c0ha4.getPaddingLeft(), i3, getPaddingRight(), getPaddingBottom());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final int LJ(int i) {
        try {
            int iLJJJJZI = C13LQ.LJJJJZI(this.LIZJ.LJIJ(null));
            if (getPaddingTop() != 0) {
                AwS645S0100000_31 awS645S0100000_31 = new AwS645S0100000_31(this, 85);
                if (i > 0 && iLJJJJZI > 0) {
                    int height = this.LIZIZ.getHeight();
                    int i2 = 0;
                    if (!C0C64.LJIILLIIL().LJIIIZ(31744, "ec_shop_search_follow_finger_sticky_fix", true, false)) {
                        int i3 = iLJJJJZI;
                        do {
                            Integer num = (Integer) awS645S0100000_31.invoke(Integer.valueOf(i3), Integer.valueOf(height));
                            if (num != null) {
                                return num.intValue();
                            }
                            i3--;
                        } while (-1 < i3);
                    } else {
                        do {
                            Integer num2 = (Integer) awS645S0100000_31.invoke(Integer.valueOf(i2), Integer.valueOf(height));
                            if (num2 != null) {
                                return num2.intValue();
                            }
                            i2++;
                        } while (i2 < iLJJJJZI);
                    }
                    return iLJJJJZI;
                }
            }
            return iLJJJJZI;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return -1;
        }
    }

    public final FrameLayout LJFF(int i) {
        View view;
        try {
            FrameLayout frameLayout = (FrameLayout) ((LinkedHashMap) this.LJIIL).get(Integer.valueOf(i));
            if (frameLayout == null) {
                View viewFindViewByPosition = this.LIZJ.findViewByPosition(i);
                if (viewFindViewByPosition instanceof FrameLayout) {
                    frameLayout = (FrameLayout) viewFindViewByPosition;
                } else {
                    frameLayout = null;
                }
                if (frameLayout == null) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(i);
                    if (viewHolderFindViewHolderForAdapterPosition != null) {
                        view = viewHolderFindViewHolderForAdapterPosition.itemView;
                    } else {
                        view = null;
                    }
                    if (!(view instanceof FrameLayout)) {
                        return null;
                    }
                    return (FrameLayout) view;
                }
            }
            return frameLayout;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public final void LJI(List<Integer> list) {
        try {
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) list) {
                if (((Number) obj).intValue() >= 0) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            ((ArrayList) this.LJFF).clear();
            ((ArrayList) this.LJFF).addAll(arrayList);
            LJIIIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJIIIIZZ(C21673319rv c21673319rv) {
        try {
            Iterator it2 = ((ArrayList) this.LJII).iterator();
            while (it2.hasNext()) {
                LJIILL(((Number) it2.next()).intValue(), c21673319rv);
            }
            if (this.LIZIZ.getVisibility() != 0) {
                C786410Ut5.LJZL(0, this.LIZIZ);
            }
            HandlerHook.viewPost(this.LIZIZ, new ARunnableS112S0100000_12(this, 232));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJIIJ(int i) {
        View childAt;
        int iIntValue;
        int iIntValue2;
        int width;
        try {
            FrameLayout frameLayout = (FrameLayout) ((LinkedHashMap) this.LJIIJJI).get(Integer.valueOf(i));
            if (frameLayout == null || (childAt = frameLayout.getChildAt(0)) == null) {
                return;
            }
            Rect rect = null;
            if (!((ArrayList) this.LJI).contains(Integer.valueOf(i))) {
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                layoutParams.height = -2;
                C786410Ut5.a6(frameLayout, layoutParams);
                C786410Ut5.ed(childAt, 0.0f);
                childAt.setClipBounds(null);
                return;
            }
            Integer numValueOf = (Integer) ((LinkedHashMap) this.LJIIIZ).get(Integer.valueOf(i));
            if (numValueOf == null || numValueOf.intValue() <= 0) {
                numValueOf = Integer.valueOf(childAt.getHeight());
                if (numValueOf.intValue() <= 0) {
                    return;
                }
            }
            int iIntValue3 = numValueOf.intValue();
            Integer num = (Integer) ((LinkedHashMap) this.LJIIIZ).get(Integer.valueOf(i));
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            if (iIntValue3 > iIntValue) {
                this.LJIIIZ.put(Integer.valueOf(i), Integer.valueOf(iIntValue3));
            }
            Integer num2 = (Integer) ((LinkedHashMap) this.LJIIJ).get(Integer.valueOf(i));
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = 0;
            }
            int iLJ = C13LZ.LJ(iIntValue2, 0, iIntValue3);
            this.LJIIJ.put(Integer.valueOf(i), Integer.valueOf(iLJ));
            int iLIZIZ = iIntValue3 - iLJ;
            if (iLIZIZ <= 0) {
                if (LJIILJJIL(i)) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                } else if (iLIZIZ < 0) {
                    iLIZIZ = 0;
                }
            }
            ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
            layoutParams2.height = iLIZIZ;
            C786410Ut5.a6(frameLayout, layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
            if (layoutParams3 != null && layoutParams3.height != iIntValue3) {
                layoutParams3.height = iIntValue3;
                C786410Ut5.W5(childAt, layoutParams3);
            }
            C786410Ut5.ed(childAt, -iLJ);
            int iMax = Math.max(frameLayout.getHeight(), iLIZIZ);
            if (childAt.getWidth() > 0) {
                width = childAt.getWidth();
            } else {
                width = frameLayout.getWidth();
            }
            if (width > 0) {
                int i2 = iMax + iLJ;
                if (i2 <= iIntValue3) {
                    iIntValue3 = i2;
                }
                rect = new Rect(0, iLJ, width, iIntValue3);
            }
            childAt.setClipBounds(rect);
            frameLayout.requestLayout();
            frameLayout.invalidate();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJIIJJI(boolean z) {
        if (this.LJIJ) {
            return;
        }
        this.LJIJ = true;
        try {
            HandlerHook.viewPost(this.LIZ, new ARunnableS49S0110000_31(this, z, 2));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJIJ = false;
        }
    }

    public final boolean LJIILJJIL(int i) {
        Integer num;
        try {
            if (!((ArrayList) this.LJI).contains(Integer.valueOf(i))) {
                return false;
            }
            List<Integer> list = this.LJIIIIZZ;
            ArrayList arrayList = new ArrayList();
            for (Integer num2 : list) {
                if (((ArrayList) this.LJI).contains(Integer.valueOf(num2.intValue()))) {
                    arrayList.add(num2);
                }
            }
            if (arrayList.size() < 2 || (num = (Integer) C13LP.LJJLIIIJLJLI(arrayList)) == null || i != num.intValue()) {
                return false;
            }
            List<Integer> list2 = this.LJIIIIZZ;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            Iterator<Integer> it2 = list2.iterator();
            while (it2.hasNext()) {
                int iIntValue = it2.next().intValue();
                if (iIntValue > i) {
                    if (!((ArrayList) this.LJI).contains(Integer.valueOf(iIntValue))) {
                        return true;
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15WQ.LIZ(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006f A[Catch: all -> 0x0168, PHI: r1
      0x006f: PHI (r1v4 java.lang.Integer) = (r1v3 java.lang.Integer), (r1v24 java.lang.Integer) binds: [B:24:0x004c, B:26:0x005a] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0168, blocks: (B:2:0x0000, B:5:0x000f, B:7:0x0018, B:12:0x0021, B:16:0x002a, B:18:0x002e, B:20:0x0032, B:23:0x0039, B:25:0x004e, B:27:0x005c, B:29:0x006a, B:32:0x0075, B:34:0x0085, B:36:0x008b, B:37:0x0098, B:40:0x00d9, B:42:0x00e9, B:44:0x00ef, B:45:0x00fc, B:47:0x010a, B:49:0x0116, B:52:0x0127, B:57:0x0160, B:53:0x0136, B:55:0x0145, B:56:0x014a, B:30:0x006f), top: B:62:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(int r11, X.C21673319rv r12) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15WQ.LJIILL(int, X.19rv):void");
    }

    public final void LJIILLIIL(List<Integer> list, List<Integer> list2) {
        try {
            ((ArrayList) this.LIZLLL).clear();
            ((ArrayList) this.LIZLLL).addAll(list);
            ((ArrayList) this.LJ).clear();
            ((ArrayList) this.LJ).addAll(list2);
            LJIIIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public C15WQ(C0HA4 c0ha4, LinearLayout linearLayout, MixStickyLayoutManager mixStickyLayoutManager) {
        this.LIZ = c0ha4;
        this.LIZIZ = linearLayout;
        this.LIZJ = mixStickyLayoutManager;
        this.LJIIZILJ = new C790480Uze(c0ha4, new C1452405mM(this), new C1450505m3(this));
    }
}

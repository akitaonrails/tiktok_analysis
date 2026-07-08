package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0Rza, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC714000Rza extends PagerAdapter {
    public final LinkedList<View>[] LLILLJJLI;
    public final Context LLILLL;
    public final int LLILZ;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        return view == obj;
    }

    public boolean LJJIJIL() {
        return this instanceof C714340S0i;
    }

    public abstract String LJJIJL();

    public abstract Fragment LJJIJLIJ(View view);

    public abstract int LJJIL(int i);

    public abstract int LJJIZ(View view);

    public abstract View LJJJI(int i, View view, ViewGroup viewGroup);

    public boolean LJJJIL(int i, View view) {
        return false;
    }

    public void LJJJJ(int i, View view) {
    }

    public void LJJJJI(View view) {
    }

    public int LJJJ(int i) {
        int iLJJIL = LJJIL(i);
        if (iLJJIL >= 0 && iLJJIL < this.LLILZ) {
            return iLJJIL;
        }
        C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getItemViewType must return a number which is form 0 to ");
        sbLIZ.append(this.LLILZ - 1);
        c2276411E8h.LIZIZ("common_feed", new Exception(C2188811AlT.LIZIZ(sbLIZ)));
        return 0;
    }

    public AbstractC714000Rza(Context context, int i) {
        this.LLILLL = context;
        this.LLILZ = i;
        LinkedList<View>[] linkedListArr = new LinkedList[i];
        for (int i2 = 0; i2 < i; i2++) {
            linkedListArr[i2] = new LinkedList<>();
        }
        this.LLILLJJLI = linkedListArr;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        View viewRemoveFirst;
        int iLJJJ = LJJJ(i);
        if (!this.LLILLJJLI[iLJJJ].isEmpty()) {
            viewRemoveFirst = this.LLILLJJLI[iLJJJ].removeFirst();
        } else {
            viewRemoveFirst = null;
        }
        View viewLJJJI = LJJJI(i, viewRemoveFirst, viewGroup);
        if (viewLJJJI.getParent() != null) {
            try {
                C786410Ut5.LJJJLZIJ(viewLJJJI, (ViewGroup) viewLJJJI.getParent());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
                C2276411E8h.LIZIZ.LIZIZ("common_feed", e);
            }
        }
        if (viewLJJJI.getParent() != viewGroup) {
            viewGroup.addView(viewLJJJI);
        }
        LJJJJ(iLJJJ, viewLJJJI);
        return viewLJJJI;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    @Override // androidx.viewpager.widget.PagerAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(android.view.ViewGroup r10, int r11, java.lang.Object r12) {
        /*
            r9 = this;
            if (r12 != 0) goto L3
            return
        L3:
            android.view.View r12 = (android.view.View) r12
            X.C786410Ut5.LJJJLZIJ(r12, r10)     // Catch: java.lang.Exception -> L9
            goto L14
        L9:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.1E8h r1 = X.C2276411E8h.LIZIZ
            java.lang.String r0 = "common_feed"
            r1.LIZIZ(r0, r2)
        L14:
            int r5 = r9.LJJIZ(r12)
            r4 = 0
            r6 = 2
            if (r6 != r5) goto L9e
            X.0Tl6 r3 = X.C755980Tl6.LIZ()
            androidx.fragment.app.Fragment r2 = r9.LJJIJLIJ(r12)
            java.lang.String r7 = r9.LJJIJL()
            r3.getClass()
            boolean r0 = X.C293750BfJ.LIZ()
            r8 = 1
            if (r0 == 0) goto L5a
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.LJIIIIZZ
            if (r0 != 0) goto L43
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r3.LJIIIIZZ = r0
        L43:
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.LJIIIIZZ
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r0 = r0.get(r7)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L8c
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r3.LJIIIIZZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            r1.put(r7, r0)
        L5a:
            boolean r0 = X.C07IN.LIZ()
            if (r0 == 0) goto L9e
            if (r2 == 0) goto L88
            java.util.Map<androidx.fragment.app.Fragment, java.util.LinkedList<android.view.View>> r0 = r3.LJII
            if (r0 != 0) goto L6d
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>(r6)
            r3.LJII = r0
        L6d:
            java.util.Map<androidx.fragment.app.Fragment, java.util.LinkedList<android.view.View>> r0 = r3.LJII
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r1 = r0.get(r2)
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            if (r1 != 0) goto L85
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            java.util.Map<androidx.fragment.app.Fragment, java.util.LinkedList<android.view.View>> r0 = r3.LJII
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            r0.put(r2, r1)
        L85:
            r1.add(r12)
        L88:
            r9.LJJJJI(r12)
            return
        L8c:
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r3.LJIIIIZZ
            int r0 = r0.intValue()
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            r1.put(r7, r0)
            goto L5a
        L9e:
            boolean r0 = r9.LJJJIL(r5, r12)
            if (r0 != 0) goto L88
            boolean r0 = r9.LJJIJIL()
            if (r0 == 0) goto Lb2
            java.util.LinkedList<android.view.View>[] r0 = r9.LLILLJJLI
            r0 = r0[r5]
            r0.add(r4, r12)
            goto L88
        Lb2:
            java.util.LinkedList<android.view.View>[] r0 = r9.LLILLJJLI
            r0 = r0[r5]
            r0.add(r12)
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC714000Rza.LJIIZILJ(android.view.ViewGroup, int, java.lang.Object):void");
    }
}

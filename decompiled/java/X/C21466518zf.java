package X;

import Y.ARunnableS101S0200000_32;
import Y.ARunnableS124S0100000_24;
import Y.ARunnableS130S0100000_30;
import Y.ARunnableS65S0300000_32;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS159S0400000_32;
import kotlin.jvm.internal.AwS276S0300000_32;

/* JADX INFO: renamed from: X.18zf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21466518zf extends C21467618zq {
    public final List<C21467318zn> LIZJ;
    public final C21468018zu LIZLLL;
    public final C21468018zu LJ;
    public final AbstractC21466418ze LJFF;
    public final Object LJI;
    public final ArrayList<View> LJII;
    public final ArrayList<View> LJIIIIZZ;
    public final C830490Whz<String, String> LJIIIZ;
    public final ArrayList<String> LJIIJ;
    public final ArrayList<String> LJIIJJI;
    public final C830490Whz<String, View> LJIIL;
    public final C830490Whz<String, View> LJIILIIL;
    public final boolean LJIILJJIL;
    public final C20148513sZ LJIILL = new C20148513sZ();
    public Object LJIILLIIL;
    public boolean LJIIZILJ;

    @Override // X.C21467618zq
    public final boolean LIZ() {
        Object obj;
        if (!this.LJFF.isSeekingSupported()) {
            return false;
        }
        List<C21467318zn> list = this.LIZJ;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C21467318zn c21467318zn : list) {
                if (Build.VERSION.SDK_INT < 34 || (obj = c21467318zn.LIZIZ) == null || !this.LJFF.isSeekingSupported(obj)) {
                    return false;
                }
            }
        }
        Object obj2 = this.LJI;
        return obj2 == null || this.LJFF.isSeekingSupported(obj2);
    }

    public final boolean LJII() {
        List<C21467318zn> list = this.LIZJ;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<C21467318zn> it2 = list.iterator();
            while (it2.hasNext()) {
                if (!it2.next().LIZ.LIZJ.mTransitioning) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // X.C21467618zq
    public final void LIZIZ(ViewGroup viewGroup) {
        this.LJIILL.LIZ();
    }

    @Override // X.C21467618zq
    public final void LIZJ(ViewGroup viewGroup) {
        if (viewGroup.isLaidOut() && !this.LJIIZILJ) {
            Object obj = this.LJIILLIIL;
            if (obj != null) {
                this.LJFF.animateToEnd(obj);
                return;
            }
            Pair<ArrayList<View>, Object> pairLJI = LJI(viewGroup, this.LJ, this.LIZLLL);
            ArrayList<View> first = pairLJI.getFirst();
            Object second = pairLJI.getSecond();
            List<C21467318zn> list = this.LIZJ;
            ArrayList<C21468018zu> arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C21467318zn> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LIZ);
            }
            for (C21468018zu c21468018zu : arrayList) {
                this.LJFF.setListenerForTransitionEnd(c21468018zu.LIZJ, second, this.LJIILL, new ARunnableS101S0200000_32(c21468018zu, this, 4));
            }
            LJIIIIZZ(first, viewGroup, new AwS276S0300000_32(viewGroup, this, second, 0));
            return;
        }
        Iterator<C21467318zn> it3 = this.LIZJ.iterator();
        while (it3.hasNext()) {
            it3.next().LIZ.LIZJ(this);
        }
        this.LJIIZILJ = false;
    }

    @Override // X.C21467618zq
    public final void LIZLLL(C1776540wKa c1776540wKa) {
        Object obj = this.LJIILLIIL;
        if (obj != null) {
            this.LJFF.setCurrentPlayTime(obj, c1776540wKa.LIZJ);
        }
    }

    @Override // X.C21467618zq
    public final void LJ(ViewGroup viewGroup) {
        if (!viewGroup.isLaidOut()) {
            for (C21467318zn c21467318zn : this.LIZJ) {
            }
            return;
        }
        if (LJII() && this.LJI != null) {
            LIZ();
        }
        if (LIZ() && LJII()) {
            C259800zU c259800zU = new C259800zU();
            Pair<ArrayList<View>, Object> pairLJI = LJI(viewGroup, this.LJ, this.LIZLLL);
            ArrayList<View> first = pairLJI.getFirst();
            Object second = pairLJI.getSecond();
            List<C21467318zn> list = this.LIZJ;
            ArrayList<C21468018zu> arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C21467318zn> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LIZ);
            }
            for (C21468018zu c21468018zu : arrayList) {
                this.LJFF.setListenerForTransitionEnd(c21468018zu.LIZJ, second, this.LJIILL, new ARunnableS124S0100000_24(c259800zU, 3), new ARunnableS101S0200000_32(c21468018zu, this, 6));
            }
            LJIIIIZZ(first, viewGroup, new AwS159S0400000_32(this, (C21466518zf) viewGroup, (ViewGroup) second, (Object) c259800zU, (C259800zU<Function0<Unit>>) 0));
        }
    }

    public static void LJFF(View view, ArrayList arrayList) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (C20085313iN.LIZIZ(viewGroup)) {
                if (!arrayList.contains(view)) {
                    arrayList.add(view);
                    return;
                }
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    LJFF(childAt, arrayList);
                }
            }
            return;
        }
        if (arrayList.contains(view)) {
            return;
        }
        arrayList.add(view);
    }

    public final Pair<ArrayList<View>, Object> LJI(ViewGroup viewGroup, C21468018zu c21468018zu, C21468018zu c21468018zu2) {
        View view = new View(viewGroup.getContext());
        Rect rect = new Rect();
        Iterator<C21467318zn> it2 = this.LIZJ.iterator();
        boolean z = false;
        View view2 = null;
        while (it2.hasNext()) {
            if (it2.next().LIZLLL != null && c21468018zu2 != null && c21468018zu != null && (!this.LJIIIZ.isEmpty()) && this.LJI != null) {
                C20302914cN.LIZ(c21468018zu.LIZJ, c21468018zu2.LIZJ, this.LJIILJJIL, this.LJIIL);
                ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(viewGroup, new ARunnableS65S0300000_32(c21468018zu, c21468018zu2, this, 2));
                this.LJII.addAll(this.LJIIL.values());
                if (!this.LJIIJJI.isEmpty()) {
                    view2 = this.LJIIL.get((String) ListProtector.get(this.LJIIJJI, 0));
                    this.LJFF.setEpicenter(this.LJI, view2);
                }
                this.LJIIIIZZ.addAll(this.LJIILIIL.values());
                if (!this.LJIIJ.isEmpty()) {
                    View view3 = this.LJIILIIL.get((String) ListProtector.get(this.LJIIJ, 0));
                    if (view3 != null) {
                        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(viewGroup, new ARunnableS65S0300000_32(this.LJFF, view3, rect, 3));
                        z = true;
                    }
                }
                this.LJFF.setSharedElementTargets(this.LJI, view, this.LJII);
                AbstractC21466418ze abstractC21466418ze = this.LJFF;
                Object obj = this.LJI;
                abstractC21466418ze.scheduleRemoveTargets(obj, null, null, null, null, obj, this.LJIIIIZZ);
            }
        }
        ArrayList arrayList = new ArrayList();
        Object objMergeTransitionsTogether = null;
        Object objMergeTransitionsTogether2 = null;
        for (C21467318zn c21467318zn : this.LIZJ) {
            C21468018zu c21468018zu3 = c21467318zn.LIZ;
            Object objCloneTransition = this.LJFF.cloneTransition(c21467318zn.LIZIZ);
            if (objCloneTransition != null) {
                ArrayList<View> arrayList2 = new ArrayList<>();
                LJFF(c21468018zu3.LIZJ.mView, arrayList2);
                if (this.LJI != null && (c21468018zu3 == c21468018zu2 || c21468018zu3 == c21468018zu)) {
                    if (c21468018zu3 == c21468018zu2) {
                        arrayList2.removeAll(C13LP.LLIIJI(this.LJII));
                    } else {
                        arrayList2.removeAll(C13LP.LLIIJI(this.LJIIIIZZ));
                    }
                }
                if (arrayList2.isEmpty()) {
                    this.LJFF.addTarget(objCloneTransition, view);
                } else {
                    this.LJFF.addTargets(objCloneTransition, arrayList2);
                    this.LJFF.scheduleRemoveTargets(objCloneTransition, objCloneTransition, arrayList2, null, null, null, null);
                    if (c21468018zu3.LIZ == EnumC21467818zs.GONE) {
                        c21468018zu3.LJIIIIZZ = false;
                        ArrayList<View> arrayList3 = new ArrayList<>(arrayList2);
                        arrayList3.remove(c21468018zu3.LIZJ.mView);
                        this.LJFF.scheduleHideFragmentView(objCloneTransition, c21468018zu3.LIZJ.mView, arrayList3);
                        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(viewGroup, new ARunnableS130S0100000_30(arrayList2, 5));
                    }
                }
                if (c21468018zu3.LIZ == EnumC21467818zs.VISIBLE) {
                    arrayList.addAll(arrayList2);
                    if (z) {
                        this.LJFF.setEpicenter(objCloneTransition, rect);
                    }
                    if (FragmentManager.LJLI()) {
                        Iterator<View> it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            it3.next();
                        }
                    }
                } else {
                    this.LJFF.setEpicenter(objCloneTransition, view2);
                    if (FragmentManager.LJLI()) {
                        Iterator<View> it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            it4.next();
                        }
                    }
                }
                if (c21467318zn.LIZJ) {
                    objMergeTransitionsTogether = this.LJFF.mergeTransitionsTogether(objMergeTransitionsTogether, objCloneTransition, null);
                } else {
                    objMergeTransitionsTogether2 = this.LJFF.mergeTransitionsTogether(objMergeTransitionsTogether2, objCloneTransition, null);
                }
            }
        }
        return new Pair<>(arrayList, this.LJFF.mergeTransitionsInSequence(objMergeTransitionsTogether, objMergeTransitionsTogether2, this.LJI));
    }

    public final void LJIIIIZZ(ArrayList<View> arrayList, ViewGroup viewGroup, Function0<Unit> function0) {
        C20302914cN.LIZJ(4, arrayList);
        ArrayList<String> arrayListPrepareSetNameOverridesReordered = this.LJFF.prepareSetNameOverridesReordered(this.LJIIIIZZ);
        if (FragmentManager.LJLI()) {
            Iterator<View> it2 = this.LJII.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            Iterator<View> it3 = this.LJIIIIZZ.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
        function0.invoke();
        this.LJFF.setNameOverridesReordered(viewGroup, this.LJII, this.LJIIIIZZ, arrayListPrepareSetNameOverridesReordered, this.LJIIIZ);
        C20302914cN.LIZJ(0, arrayList);
        this.LJFF.swapSharedElementTargets(this.LJI, this.LJII, this.LJIIIIZZ);
    }

    public C21466518zf(List<C21467318zn> list, C21468018zu c21468018zu, C21468018zu c21468018zu2, AbstractC21466418ze abstractC21466418ze, Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2, C830490Whz<String, String> c830490Whz, ArrayList<String> arrayList3, ArrayList<String> arrayList4, C830490Whz<String, View> c830490Whz2, C830490Whz<String, View> c830490Whz3, boolean z) {
        this.LIZJ = list;
        this.LIZLLL = c21468018zu;
        this.LJ = c21468018zu2;
        this.LJFF = abstractC21466418ze;
        this.LJI = obj;
        this.LJII = arrayList;
        this.LJIIIIZZ = arrayList2;
        this.LJIIIZ = c830490Whz;
        this.LJIIJ = arrayList3;
        this.LJIIJJI = arrayList4;
        this.LJIIL = c830490Whz2;
        this.LJIILIIL = c830490Whz3;
        this.LJIILJJIL = z;
    }
}

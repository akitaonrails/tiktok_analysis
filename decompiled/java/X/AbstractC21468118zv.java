package X;

import Y.ARunnableS101S0200000_32;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18zv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21468118zv {
    public static final /* synthetic */ int LJI = 0;
    public final ViewGroup LIZ;
    public final List<C21468018zu> LIZIZ = new ArrayList();
    public final List<C21468018zu> LIZJ = new ArrayList();
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    public abstract void LIZIZ(List<C21468018zu> list, boolean z);

    public final void LJ() {
        boolean z;
        if (this.LJFF) {
            return;
        }
        if (!this.LIZ.isAttachedToWindow()) {
            LJII();
            this.LJ = false;
            return;
        }
        synchronized (this.LIZIZ) {
            try {
                ArrayList<C21468018zu> arrayList = new ArrayList(this.LIZJ);
                ((ArrayList) this.LIZJ).clear();
                Iterator it2 = arrayList.iterator();
                while (true) {
                    z = true;
                    if (!it2.hasNext()) {
                        break;
                    }
                    C21468018zu c21468018zu = (C21468018zu) it2.next();
                    if (!(!((ArrayList) this.LIZIZ).isEmpty()) || !c21468018zu.LIZJ.mTransitioning) {
                        z = false;
                    }
                    c21468018zu.LJI = z;
                }
                for (C21468018zu c21468018zu2 : arrayList) {
                    if (this.LIZLLL) {
                        c21468018zu2.LIZIZ();
                    } else {
                        c21468018zu2.LIZ(this.LIZ);
                    }
                    this.LIZLLL = false;
                    if (!c21468018zu2.LJFF) {
                        ((ArrayList) this.LIZJ).add(c21468018zu2);
                    }
                }
                if (!((ArrayList) this.LIZIZ).isEmpty()) {
                    LJIIL();
                    ArrayList arrayList2 = new ArrayList(this.LIZIZ);
                    if (arrayList2.isEmpty()) {
                        return;
                    }
                    ((ArrayList) this.LIZIZ).clear();
                    ((ArrayList) this.LIZJ).addAll(arrayList2);
                    LIZIZ(arrayList2, this.LJ);
                    boolean zLJIIIZ = LJIIIZ(arrayList2);
                    Iterator it3 = arrayList2.iterator();
                    boolean z2 = true;
                    while (it3.hasNext()) {
                        if (!((C21468018zu) it3.next()).LIZJ.mTransitioning) {
                            z2 = false;
                        }
                    }
                    if (!z2 || zLJIIIZ) {
                        z = false;
                    }
                    this.LIZLLL = z;
                    if (!z2) {
                        LJIIJJI(arrayList2);
                        LIZJ(arrayList2);
                    } else if (zLJIIIZ) {
                        LJIIJJI(arrayList2);
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            LIZ((C21468018zu) arrayList2.get(i));
                        }
                    }
                    this.LJ = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJII() {
        boolean zIsAttachedToWindow = this.LIZ.isAttachedToWindow();
        synchronized (this.LIZIZ) {
            try {
                LJIIL();
                LJIIJJI(this.LIZIZ);
                ArrayList<C21468018zu> arrayList = new ArrayList(this.LIZJ);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((C21468018zu) it2.next()).LJI = false;
                }
                for (C21468018zu c21468018zu : arrayList) {
                    if (FragmentManager.LJLI() && !zIsAttachedToWindow) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Container ");
                        sbLIZ.append(this.LIZ);
                        sbLIZ.append(" is not attached to window. ");
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                    c21468018zu.LIZ(this.LIZ);
                }
                ArrayList<C21468018zu> arrayList2 = new ArrayList(this.LIZIZ);
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    ((C21468018zu) it3.next()).LJI = false;
                }
                for (C21468018zu c21468018zu2 : arrayList2) {
                    if (FragmentManager.LJLI() && !zIsAttachedToWindow) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Container ");
                        sbLIZ2.append(this.LIZ);
                        sbLIZ2.append(" is not attached to window. ");
                        C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    c21468018zu2.LIZ(this.LIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIJ() {
        boolean zIsPostponed;
        Object objPrevious;
        Fragment fragment;
        synchronized (this.LIZIZ) {
            try {
                LJIIL();
                ArrayList arrayList = (ArrayList) this.LIZIZ;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    zIsPostponed = false;
                    objPrevious = null;
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    objPrevious = listIterator.previous();
                    C21468018zu c21468018zu = (C21468018zu) objPrevious;
                    C21467718zr c21467718zr = EnumC21467818zs.Companion;
                    View view = c21468018zu.LIZJ.mView;
                    c21467718zr.getClass();
                    EnumC21467818zs enumC21467818zsLIZ = C21467718zr.LIZ(view);
                    EnumC21467818zs enumC21467818zs = c21468018zu.LIZ;
                    EnumC21467818zs enumC21467818zs2 = EnumC21467818zs.VISIBLE;
                    if (enumC21467818zs == enumC21467818zs2 && enumC21467818zsLIZ != enumC21467818zs2) {
                        break;
                    }
                }
                C21468018zu c21468018zu2 = (C21468018zu) objPrevious;
                if (c21468018zu2 != null && (fragment = c21468018zu2.LIZJ) != null) {
                    zIsPostponed = fragment.isPostponed();
                }
                this.LJFF = zIsPostponed;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIL() {
        for (C21468018zu c21468018zu : (ArrayList) this.LIZIZ) {
            if (c21468018zu.LIZIZ == EnumC21468418zy.ADDING) {
                View viewRequireView = c21468018zu.LIZJ.requireView();
                C21467718zr c21467718zr = EnumC21467818zs.Companion;
                int visibility = viewRequireView.getVisibility();
                c21467718zr.getClass();
                c21468018zu.LIZLLL(C21467718zr.LIZIZ(visibility), EnumC21468418zy.NONE);
            }
        }
    }

    public AbstractC21468118zv(ViewGroup viewGroup) {
        this.LIZ = viewGroup;
    }

    public static boolean LJIIIZ(List list) {
        boolean z;
        ArrayList<C21468018zu> arrayList = (ArrayList) list;
        loop0: while (true) {
            z = true;
            for (C21468018zu c21468018zu : arrayList) {
                if (!((ArrayList) c21468018zu.LJIIJ).isEmpty()) {
                    List<C21467618zq> list2 = c21468018zu.LJIIJ;
                    if (!(list2 instanceof Collection) || !((ArrayList) list2).isEmpty()) {
                        Iterator it2 = ((ArrayList) list2).iterator();
                        while (it2.hasNext()) {
                            if (!((C21467618zq) it2.next()).LIZ()) {
                                break;
                            }
                        }
                    }
                }
                z = false;
            }
            break loop0;
        }
        if (z) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C19719612Di.LJJI(((C21468018zu) it3.next()).LJIIJ, arrayList2);
            }
            if (!arrayList2.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void LIZ(C21468018zu c21468018zu) {
        if (c21468018zu.LJIIIIZZ) {
            c21468018zu.LIZ.applyState(c21468018zu.LIZJ.requireView(), this.LIZ);
            c21468018zu.LJIIIIZZ = false;
        }
    }

    public final void LIZJ(List<C21468018zu> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) list;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((C21468018zu) it2.next()).LJIIJ, arrayList);
        }
        List listLLIIII = C13LP.LLIIII(C13LP.LLIIJI(arrayList));
        int size = listLLIIII.size();
        for (int i = 0; i < size; i++) {
            ((C21467618zq) ListProtector.get(listLLIIII, i)).LIZJ(this.LIZ);
        }
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            LIZ((C21468018zu) ListProtector.get(arrayList2, i2));
        }
        List listLLIIII2 = C13LP.LLIIII(arrayList2);
        int size3 = listLLIIII2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            C21468018zu c21468018zu = (C21468018zu) ListProtector.get(listLLIIII2, i3);
            if (((ArrayList) c21468018zu.LJIIJ).isEmpty()) {
                c21468018zu.LIZIZ();
            }
        }
    }

    public final C21468018zu LJFF(Fragment fragment) {
        C21468018zu next;
        Iterator<C21468018zu> it2 = this.LIZIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                C21468018zu c21468018zu = next;
                if (Intrinsics.LJFF(c21468018zu.LIZJ, fragment) && !c21468018zu.LJ) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    public final C21468018zu LJI(Fragment fragment) {
        C21468018zu next;
        Iterator<C21468018zu> it2 = this.LIZJ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                C21468018zu c21468018zu = next;
                if (Intrinsics.LJFF(c21468018zu.LIZJ, fragment) && !c21468018zu.LJ) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    public final void LJIIJJI(List<C21468018zu> list) {
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C21468018zu) ListProtector.get(arrayList, i)).LJ();
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((C21468018zu) it2.next()).LJIIJ, arrayList2);
        }
        List listLLIIII = C13LP.LLIIII(C13LP.LLIIJI(arrayList2));
        int size2 = listLLIIII.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C21467618zq c21467618zq = (C21467618zq) ListProtector.get(listLLIIII, i2);
            ViewGroup viewGroup = this.LIZ;
            if (!c21467618zq.LIZ) {
                c21467618zq.LJ(viewGroup);
            }
            c21467618zq.LIZ = true;
        }
    }

    public static final AbstractC21468118zv LJIIIIZZ(ViewGroup viewGroup, FragmentManager fragmentManager) {
        AnonymousClass1902 anonymousClass1902LJJLJLI = fragmentManager.LJJLJLI();
        Object tag = viewGroup.getTag(R.id.vte);
        if (tag instanceof AbstractC21468118zv) {
            return (AbstractC21468118zv) tag;
        }
        anonymousClass1902LJJLJLI.getClass();
        C21467218zm c21467218zm = new C21467218zm(viewGroup);
        viewGroup.setTag(R.id.vte, c21467218zm);
        return c21467218zm;
    }

    public final void LIZLLL(final EnumC21467818zs enumC21467818zs, final EnumC21468418zy enumC21468418zy, final C19EC c19ec) {
        synchronized (this.LIZIZ) {
            try {
                C21468018zu c21468018zuLJFF = LJFF(c19ec.LIZJ);
                if (c21468018zuLJFF == null) {
                    Fragment fragment = c19ec.LIZJ;
                    if ((!fragment.mTransitioning && !fragment.mRemoving) || (c21468018zuLJFF = LJI(fragment)) == null) {
                        C21468018zu c21468018zu = new C21468018zu(enumC21467818zs, enumC21468418zy, c19ec) { // from class: X.18zw
                            public final C19EC LJIIJJI;

                            @Override // X.C21468018zu
                            public final void LJ() {
                                if (this.LJII) {
                                    return;
                                }
                                this.LJII = true;
                                EnumC21468418zy enumC21468418zy2 = this.LIZIZ;
                                if (enumC21468418zy2 != EnumC21468418zy.ADDING) {
                                    if (enumC21468418zy2 == EnumC21468418zy.REMOVING) {
                                        this.LJIIJJI.LIZJ.requireView().clearFocus();
                                        return;
                                    }
                                    return;
                                }
                                Fragment fragment2 = this.LJIIJJI.LIZJ;
                                View viewFindFocus = fragment2.mView.findFocus();
                                if (viewFindFocus != null) {
                                    fragment2.setFocusedView(viewFindFocus);
                                }
                                View viewRequireView = this.LIZJ.requireView();
                                if (viewRequireView.getParent() == null) {
                                    this.LJIIJJI.LIZ();
                                    C786410Ut5.T4(viewRequireView, 0.0f);
                                }
                                if (viewRequireView.getAlpha() == 0.0f && viewRequireView.getVisibility() == 0) {
                                    C786410Ut5.LJLLLLLL(4, viewRequireView);
                                }
                                C786410Ut5.T4(viewRequireView, fragment2.getPostOnViewCreatedAlpha());
                            }

                            @Override // X.C21468018zu
                            public final void LIZIZ() {
                                super.LIZIZ();
                                this.LIZJ.mTransitioning = false;
                                try {
                                    this.LJIIJJI.LJIIIZ();
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    C1AF0.LJ(new RuntimeException("FragmentStateManager moveToExpectedState exception ---> "));
                                }
                            }

                            {
                                Fragment fragment2 = c19ec.LIZJ;
                                this.LJIIJJI = c19ec;
                            }
                        };
                        ((ArrayList) this.LIZIZ).add(c21468018zu);
                        ((ArrayList) c21468018zu.LIZLLL).add(new ARunnableS101S0200000_32(this, c21468018zu, 5));
                        ((ArrayList) c21468018zu.LIZLLL).add(new ARunnableS101S0200000_32(this, c21468018zu, 7));
                        return;
                    }
                }
                c21468018zuLJFF.LIZLLL(enumC21467818zs, enumC21468418zy);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}

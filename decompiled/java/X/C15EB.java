package X;

import Y.AComparatorS50S0000000_31;
import Y.ALAdapterS5S0400000_31;
import Y.ARunnableS100S0200000_31;
import Y.ARunnableS131S0100000_31;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsAuthCell;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.FixedCell;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.TitleAreaCell;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15EB, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15EB extends AbstractC21674919sB {
    public static final C01GW<AccelerateDecelerateInterpolator> LLJJJJ = C447550Hgn.LJII(AFwS221S0000000_31.get$arr$(14));
    public static final C01GW<Interpolator> LLJJJJJIL = C447550Hgn.LJII(AFwS221S0000000_31.get$arr$(15));
    public static final C01GW<LinearInterpolator> LLJJJJLIIL = C447550Hgn.LJII(AFwS221S0000000_31.get$arr$(13));
    public final Function0<Unit> LLIZLLLIL;
    public final Map<String, Boolean> LLJ;
    public final ArrayList<RecyclerView.ViewHolder> LLJI;
    public final ArrayList<RecyclerView.ViewHolder> LLJIJIL;
    public final ArrayList<C15EH> LLJILJIL;
    public final ArrayList<C15EC> LLJILJILJ;
    public final ArrayList<ArrayList<RecyclerView.ViewHolder>> LLJILLL;
    public final ArrayList<ArrayList<C15EH>> LLJJ;
    public final ArrayList<ArrayList<C15EC>> LLJJI;
    public final ArrayList<RecyclerView.ViewHolder> LLJJIII;
    public final ArrayList<RecyclerView.ViewHolder> LLJJIJI;
    public final ArrayList<RecyclerView.ViewHolder> LLJJIJIIJIL;
    public final ArrayList<RecyclerView.ViewHolder> LLJJIJIL;
    public final Map<RecyclerView.ViewHolder, C15EE> LLJJJ;
    public final Map<RecyclerView.ViewHolder, C15EG> LLJJJIL;

    public C15EB() {
        this(AFwS221S0000000_31.get$arr$(12));
    }

    @Override // X.AbstractC21673719rz
    public final void LJIIL() {
        for (int size = this.LLJILJIL.size() - 1; -1 < size; size--) {
            C15EH c15eh = (C15EH) ListProtector.get(this.LLJILJIL, size);
            View view = c15eh.LIZ.itemView;
            C786410Ut5.ed(view, 0.0f);
            view.setTranslationZ(0.0f);
            C786410Ut5.Jc(view, 0.0f);
            LJIIIZ(c15eh.LIZ);
            ListProtector.remove(this.LLJILJIL, size);
        }
        for (int size2 = this.LLJI.size() - 1; -1 < size2; size2--) {
            LJIIIZ((RecyclerView.ViewHolder) ListProtector.get(this.LLJI, size2));
            ListProtector.remove(this.LLJI, size2);
        }
        for (int size3 = this.LLJIJIL.size() - 1; -1 < size3; size3--) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) ListProtector.get(this.LLJIJIL, size3);
            LJJIIZI(viewHolder.itemView);
            LJJIIJ(viewHolder);
            ListProtector.remove(this.LLJIJIL, size3);
        }
        for (int size4 = this.LLJILJILJ.size() - 1; -1 < size4; size4--) {
            C15EC c15ec = (C15EC) ListProtector.get(this.LLJILJILJ, size4);
            RecyclerView.ViewHolder viewHolder2 = c15ec.LIZ;
            if (viewHolder2 != null) {
                LJJIJL(c15ec, viewHolder2);
            }
            RecyclerView.ViewHolder viewHolder3 = c15ec.LIZIZ;
            if (viewHolder3 != null) {
                LJJIJL(c15ec, viewHolder3);
            }
        }
        this.LLJILJILJ.clear();
        if (LJIIZILJ()) {
            for (int size5 = this.LLJJ.size() - 1; -1 < size5; size5--) {
                ArrayList arrayList = (ArrayList) ListProtector.get(this.LLJJ, size5);
                for (int size6 = arrayList.size() - 1; -1 < size6; size6--) {
                    C15EH c15eh2 = (C15EH) ListProtector.get(arrayList, size6);
                    View view2 = c15eh2.LIZ.itemView;
                    C786410Ut5.ed(view2, 0.0f);
                    C786410Ut5.Jc(view2, 0.0f);
                    LJIIIZ(c15eh2.LIZ);
                    ListProtector.remove(arrayList, size6);
                    if (arrayList.isEmpty()) {
                        this.LLJJ.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.LLJILLL.size() - 1; -1 < size7; size7--) {
                ArrayList arrayList2 = (ArrayList) ListProtector.get(this.LLJILLL, size7);
                for (int size8 = arrayList2.size() - 1; -1 < size8; size8--) {
                    RecyclerView.ViewHolder viewHolder4 = (RecyclerView.ViewHolder) ListProtector.get(arrayList2, size8);
                    LJJIIZI(viewHolder4.itemView);
                    LJJIIJ(viewHolder4);
                    ListProtector.remove(arrayList2, size8);
                    if (arrayList2.isEmpty()) {
                        this.LLJILLL.remove(arrayList2);
                    }
                }
            }
            Iterator it2 = C13LP.LLIIII(((LinkedHashMap) this.LLJJJ).keySet()).iterator();
            while (it2.hasNext()) {
                LJJIJ((RecyclerView.ViewHolder) it2.next(), true, false);
            }
            Iterator it3 = C13LP.LLIIII(((LinkedHashMap) this.LLJJJIL).keySet()).iterator();
            while (it3.hasNext()) {
                LJJIJIIJI((RecyclerView.ViewHolder) it3.next(), true, false);
            }
            for (int size9 = this.LLJJI.size() - 1; -1 < size9; size9--) {
                ArrayList arrayList3 = (ArrayList) ListProtector.get(this.LLJJI, size9);
                for (int size10 = arrayList3.size() - 1; -1 < size10; size10--) {
                    C15EC c15ec2 = (C15EC) ListProtector.get(arrayList3, size10);
                    RecyclerView.ViewHolder viewHolder5 = c15ec2.LIZ;
                    if (viewHolder5 != null) {
                        LJJIJL(c15ec2, viewHolder5);
                    }
                    RecyclerView.ViewHolder viewHolder6 = c15ec2.LIZIZ;
                    if (viewHolder6 != null) {
                        LJJIJL(c15ec2, viewHolder6);
                    }
                    if (arrayList3.isEmpty()) {
                        this.LLJJI.remove(arrayList3);
                    }
                }
            }
            LJJIIZ(this.LLJJIJIIJIL);
            LJJIIZ(this.LLJJIJI);
            LJJIIZ(this.LLJJIII);
            LJJIIZ(this.LLJJIJIL);
            LJIIJ();
        }
    }

    @Override // X.AbstractC21673719rz
    public final boolean LJIIZILJ() {
        return (this.LLJIJIL.isEmpty() && this.LLJILJILJ.isEmpty() && this.LLJILJIL.isEmpty() && this.LLJI.isEmpty() && this.LLJJIJI.isEmpty() && this.LLJJIJIIJIL.isEmpty() && this.LLJJIII.isEmpty() && this.LLJJIJIL.isEmpty() && !(this.LLJJJ.isEmpty() ^ true) && !(this.LLJJJIL.isEmpty() ^ true) && this.LLJJ.isEmpty() && this.LLJILLL.isEmpty() && this.LLJJI.isEmpty()) ? false : true;
    }

    @Override // X.AbstractC21673719rz
    public final void LJIJI() {
        View view;
        boolean z = true;
        boolean z2 = !this.LLJI.isEmpty();
        boolean z3 = !this.LLJILJIL.isEmpty();
        boolean z4 = !this.LLJILJILJ.isEmpty();
        boolean z5 = !this.LLJIJIL.isEmpty();
        if (z2 || z3 || z5 || z4) {
            for (RecyclerView.ViewHolder viewHolder : this.LLJI) {
                View view2 = viewHolder.itemView;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                this.LLJJIJIIJIL.add(viewHolder);
                viewPropertyAnimatorAnimate.setDuration(this.LLILZ).alpha(0.0f).setListener(new ALAdapterS5S0400000_31(view2, viewPropertyAnimatorAnimate, viewHolder, this, 3)).start();
            }
            this.LLJI.clear();
            if (z3) {
                ArrayList<C15EH> arrayList = new ArrayList<>();
                arrayList.addAll(this.LLJILJIL);
                this.LLJJ.add(arrayList);
                this.LLJILJIL.clear();
                ARunnableS100S0200000_31 aRunnableS100S0200000_31 = new ARunnableS100S0200000_31(arrayList, this, 2);
                if (z2) {
                    HandlerHook.viewPost(((C15EH) ListProtector.get(arrayList, 0)).LIZ.itemView, new ARunnableS131S0100000_31(aRunnableS100S0200000_31, 3));
                } else {
                    aRunnableS100S0200000_31.run();
                }
            }
            if (z4) {
                ArrayList<C15EC> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.LLJILJILJ);
                this.LLJJI.add(arrayList2);
                this.LLJILJILJ.clear();
                ARunnableS100S0200000_31 aRunnableS100S0200000_312 = new ARunnableS100S0200000_31(arrayList2, this, 1);
                if (z2) {
                    RecyclerView.ViewHolder viewHolder2 = ((C15EC) ListProtector.get(arrayList2, 0)).LIZ;
                    if (viewHolder2 != null && (view = viewHolder2.itemView) != null) {
                        HandlerHook.viewPost(view, new ARunnableS131S0100000_31(aRunnableS100S0200000_312, 4));
                    }
                } else {
                    aRunnableS100S0200000_312.run();
                }
            }
            if (z5) {
                ArrayList<RecyclerView.ViewHolder> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.LLJIJIL);
                this.LLJILLL.add(arrayList3);
                this.LLJIJIL.clear();
                if (arrayList3.size() > 1) {
                    C08XD.LJJ(arrayList3, new AComparatorS50S0000000_31(1));
                }
                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                Iterator<RecyclerView.ViewHolder> it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(Integer.valueOf(it2.next().getLayoutPosition()));
                }
                ARunnableS100S0200000_31 aRunnableS100S0200000_313 = new ARunnableS100S0200000_31(arrayList3, this, 0);
                if (!z2 && !z3 && !z4) {
                    aRunnableS100S0200000_313.run();
                    return;
                }
                if (arrayList3.isEmpty()) {
                    z = false;
                } else {
                    Iterator<RecyclerView.ViewHolder> it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        if (LJJJIL(it3.next())) {
                            break;
                        }
                    }
                    z = false;
                }
                if (Math.max((z || !z3) ? 0L : this.LLILZIL, z4 ? this.LLILZLL : 0L) == 0) {
                    aRunnableS100S0200000_313.run();
                } else {
                    HandlerHook.viewPost(((RecyclerView.ViewHolder) ListProtector.get(arrayList3, 0)).itemView, new ARunnableS131S0100000_31(aRunnableS100S0200000_313, 5));
                }
            }
        }
    }

    public final void LJJIJIIJIL() {
        if (LJIIZILJ()) {
            return;
        }
        LJIIJ();
    }

    public C15EB(Function0<Unit> function0) {
        this.LLIZLLLIL = function0;
        this.LLJ = new LinkedHashMap();
        this.LLILZIL = 350L;
        this.LLILLL = 350L;
        this.LLJI = new ArrayList<>();
        this.LLJIJIL = new ArrayList<>();
        this.LLJILJIL = new ArrayList<>();
        this.LLJILJILJ = new ArrayList<>();
        this.LLJILLL = new ArrayList<>();
        this.LLJJ = new ArrayList<>();
        this.LLJJI = new ArrayList<>();
        this.LLJJIII = new ArrayList<>();
        this.LLJJIJI = new ArrayList<>();
        this.LLJJIJIIJIL = new ArrayList<>();
        this.LLJJIJIL = new ArrayList<>();
        this.LLJJJ = new LinkedHashMap();
        this.LLJJJIL = new LinkedHashMap();
    }

    public static final void LJJIIZ(List<? extends RecyclerView.ViewHolder> list) {
        View view;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) ListProtector.get(list, size);
            if (viewHolder != null && (view = viewHolder.itemView) != null && (viewPropertyAnimatorAnimate = view.animate()) != null) {
                viewPropertyAnimatorAnimate.cancel();
            }
            if (i >= 0) {
                size = i;
            } else {
                return;
            }
        }
    }

    public static void LJJIIZI(View view) {
        C786410Ut5.T4(view, 1.0f);
        C786410Ut5.Jc(view, 0.0f);
        C786410Ut5.ed(view, 0.0f);
        view.setTranslationZ(0.0f);
    }

    @Override // X.AbstractC21673719rz
    public final void LJIIJJI(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        LJJIJ(viewHolder, true, false);
        LJJIJIIJI(viewHolder, true, false);
        view.animate().cancel();
        int size = this.LLJILJIL.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                if (((C15EH) ListProtector.get(this.LLJILJIL, size)).LIZ == viewHolder) {
                    C786410Ut5.ed(view, 0.0f);
                    C786410Ut5.Jc(view, 0.0f);
                    LJIIIZ(viewHolder);
                    ListProtector.remove(this.LLJILJIL, size);
                }
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        LJJIJIL(viewHolder, this.LLJILJILJ);
        if (this.LLJI.remove(viewHolder)) {
            C786410Ut5.T4(view, 1.0f);
            C786410Ut5.ed(view, 0.0f);
            view.setTranslationZ(0.0f);
            C786410Ut5.Jc(view, 0.0f);
            LJIIIZ(viewHolder);
        }
        if (this.LLJIJIL.remove(viewHolder)) {
            LJJIIZI(view);
            LJJIIJ(viewHolder);
        }
        int size2 = this.LLJJI.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                ArrayList arrayList = (ArrayList) ListProtector.get(this.LLJJI, size2);
                LJJIJIL(viewHolder, arrayList);
                if (arrayList.isEmpty()) {
                    ListProtector.remove(this.LLJJI, size2);
                }
                if (i2 < 0) {
                    break;
                } else {
                    size2 = i2;
                }
            }
        }
        int size3 = this.LLJJ.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i3 = size3 - 1;
                ArrayList arrayList2 = (ArrayList) ListProtector.get(this.LLJJ, size3);
                int size4 = arrayList2.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i4 = size4 - 1;
                        if (((C15EH) ListProtector.get(arrayList2, size4)).LIZ == viewHolder) {
                            C786410Ut5.ed(view, 0.0f);
                            C786410Ut5.Jc(view, 0.0f);
                            LJIIIZ(viewHolder);
                            ListProtector.remove(arrayList2, size4);
                            if (arrayList2.isEmpty()) {
                                ListProtector.remove(this.LLJJ, size3);
                            }
                        } else if (i4 < 0) {
                            break;
                        } else {
                            size4 = i4;
                        }
                    }
                }
                if (i3 < 0) {
                    break;
                } else {
                    size3 = i3;
                }
            }
        }
        int size5 = this.LLJILLL.size() - 1;
        if (size5 >= 0) {
            while (true) {
                int i5 = size5 - 1;
                ArrayList arrayList3 = (ArrayList) ListProtector.get(this.LLJILLL, size5);
                if (arrayList3.remove(viewHolder)) {
                    LJJIIZI(view);
                    LJJIIJ(viewHolder);
                    if (arrayList3.isEmpty()) {
                        ListProtector.remove(this.LLJILLL, size5);
                    }
                }
                if (i5 < 0) {
                    break;
                } else {
                    size5 = i5;
                }
            }
        }
        this.LLJJIJIIJIL.remove(viewHolder);
        this.LLJJIII.remove(viewHolder);
        this.LLJJIJIL.remove(viewHolder);
        this.LLJJIJI.remove(viewHolder);
        LJJIJIIJIL();
    }

    @Override // X.AbstractC21674919sB
    public final boolean LJJI(RecyclerView.ViewHolder viewHolder) {
        LJJJI(viewHolder);
        C786410Ut5.T4(viewHolder.itemView, 0.0f);
        if (LJJJIL(viewHolder)) {
            C786410Ut5.ed(viewHolder.itemView, C418440Gaw.LIZIZ(-20));
            viewHolder.itemView.setTranslationZ(C418440Gaw.LIZIZ(1));
        } else {
            viewHolder.itemView.setTranslationZ(0.0f);
        }
        this.LLJIJIL.add(viewHolder);
        return true;
    }

    @Override // X.AbstractC21674919sB
    public final boolean LJJIII(RecyclerView.ViewHolder viewHolder) {
        LJJJI(viewHolder);
        this.LLJI.add(viewHolder);
        return true;
    }

    public final void LJJIL(RecyclerView.ViewHolder viewHolder) {
        C15EE c15ee = (C15EE) ((LinkedHashMap) this.LLJJJ).get(viewHolder);
        if (c15ee != null && !c15ee.LJ && c15ee.LIZJ && c15ee.LIZLLL) {
            LJJIJ(viewHolder, false, true);
        }
    }

    public final void LJJIZ(RecyclerView.ViewHolder viewHolder) {
        C15EG c15eg = (C15EG) ((LinkedHashMap) this.LLJJJIL).get(viewHolder);
        if (c15eg == null || c15eg.LJFF) {
            return;
        }
        if (c15eg.LIZIZ && !c15eg.LIZLLL) {
            return;
        }
        if (c15eg.LIZJ && !c15eg.LJ) {
            return;
        }
        LJJIJIIJI(viewHolder, false, true);
    }

    public final void LJJJI(RecyclerView.ViewHolder viewHolder) {
        boolean z;
        if (!(viewHolder instanceof AbsRecUserCell) && !(viewHolder instanceof AbsAuthCell) && !(viewHolder instanceof FixedCell)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            viewHolder.itemView.animate().setInterpolator(LLJJJJJIL.getValue()).setStartDelay(0L);
        } else {
            viewHolder.itemView.animate().setInterpolator(LLJJJJ.getValue()).setStartDelay(0L);
        }
        LJIIJJI(viewHolder);
    }

    public final boolean LJJJIL(RecyclerView.ViewHolder viewHolder) {
        C1261650iw7 c1261650iw7;
        AbstractC1262180iwy abstractC1262180iwy;
        PowerCell powerCell;
        C1262040iwk c1262040iwk;
        PowerCell powerCell2 = null;
        if (C304890BxH.LIZLLL()) {
            if ((viewHolder instanceof TitleAreaCell) && (powerCell = (PowerCell) viewHolder) != null && (c1262040iwk = (C1262040iwk) powerCell.getItem()) != null) {
                abstractC1262180iwy = c1262040iwk.LLILLJJLI;
            } else {
                abstractC1262180iwy = null;
            }
            if (abstractC1262180iwy instanceof C1262060iwm) {
                return true;
            }
        }
        if (viewHolder instanceof AbsRecUserCell) {
            powerCell2 = (PowerCell) viewHolder;
        }
        if (powerCell2 == null || (c1261650iw7 = (C1261650iw7) powerCell2.getItem()) == null || !c1261650iw7.LIZLLL()) {
            return false;
        }
        return !Intrinsics.LJFF(((LinkedHashMap) this.LLJ).get(c1261650iw7.LLILZIL.getElementId()), Boolean.TRUE);
    }

    public final void LJJJJ(RecyclerView.ViewHolder viewHolder) {
        PowerCell powerCell;
        C1261650iw7 c1261650iw7;
        if ((viewHolder instanceof AbsRecUserCell) && (powerCell = (PowerCell) viewHolder) != null && (c1261650iw7 = (C1261650iw7) powerCell.getItem()) != null) {
            this.LLJ.put(c1261650iw7.LLILZIL.getElementId(), Boolean.TRUE);
        }
    }

    @Override // X.AbstractC21673719rz
    public final boolean LJIIIIZZ(RecyclerView.ViewHolder viewHolder, List<? extends Object> list) {
        if (list.isEmpty() && !LJII(viewHolder)) {
            return false;
        }
        return true;
    }

    public final void LJJIJIL(RecyclerView.ViewHolder viewHolder, List list) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            C15EC c15ec = (C15EC) ListProtector.get(list, size);
            if (LJJIJL(c15ec, viewHolder) && c15ec.LIZ == null && c15ec.LIZIZ == null) {
                list.remove(c15ec);
            }
            if (i >= 0) {
                size = i;
            } else {
                return;
            }
        }
    }

    public final boolean LJJIJL(C15EC c15ec, RecyclerView.ViewHolder viewHolder) {
        if (viewHolder == null) {
            return false;
        }
        if (c15ec.LIZIZ == viewHolder) {
            c15ec.LIZIZ = null;
        } else {
            if (c15ec.LIZ != viewHolder) {
                return false;
            }
            c15ec.LIZ = null;
        }
        C786410Ut5.T4(viewHolder.itemView, 1.0f);
        C786410Ut5.Jc(viewHolder.itemView, 0.0f);
        C786410Ut5.ed(viewHolder.itemView, 0.0f);
        LJIIIZ(viewHolder);
        return true;
    }

    public final void LJJIJ(RecyclerView.ViewHolder viewHolder, boolean z, boolean z2) {
        C15EE c15ee = (C15EE) ((LinkedHashMap) this.LLJJJ).get(viewHolder);
        if (c15ee == null || c15ee.LJ) {
            return;
        }
        c15ee.LJ = true;
        this.LLJJJ.remove(viewHolder);
        if (z) {
            c15ee.LIZ.LIZ();
            c15ee.LIZIZ.setListener(null);
            c15ee.LIZIZ.cancel();
        }
        LJJIIZI(viewHolder.itemView);
        LJJIIJ(viewHolder);
        this.LLJJIII.remove(viewHolder);
        if (z2) {
            LJJIJIIJIL();
        }
    }

    public final void LJJIJIIJI(RecyclerView.ViewHolder viewHolder, boolean z, boolean z2) {
        C15EG c15eg = (C15EG) ((LinkedHashMap) this.LLJJJIL).get(viewHolder);
        if (c15eg == null || c15eg.LJFF) {
            return;
        }
        c15eg.LJFF = true;
        this.LLJJJIL.remove(viewHolder);
        if (z) {
            c15eg.LIZ.LIZ();
        }
        C786410Ut5.Jc(viewHolder.itemView, 0.0f);
        C786410Ut5.ed(viewHolder.itemView, 0.0f);
        LJIIIZ(viewHolder);
        this.LLJJIJI.remove(viewHolder);
        if (z2) {
            LJJIJIIJIL();
        }
    }

    @Override // X.AbstractC21674919sB
    public final boolean LJJII(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        View view = viewHolder.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) viewHolder.itemView.getTranslationY());
        LJJJI(viewHolder);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0) {
            if (i6 == 0) {
                LJIIIZ(viewHolder);
                return false;
            }
        } else {
            C786410Ut5.Jc(view, -i5);
            if (i6 != 0) {
            }
            this.LLJILJIL.add(new C15EH(viewHolder, translationX, translationY, i3, i4));
            return true;
        }
        C786410Ut5.ed(view, -i6);
        this.LLJILJIL.add(new C15EH(viewHolder, translationX, translationY, i3, i4));
        return true;
    }

    @Override // X.AbstractC21674919sB
    public final boolean LJJIFFI(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        if (viewHolder == viewHolder2) {
            return LJJII(viewHolder, i, i2, i3, i4);
        }
        float translationX = viewHolder.itemView.getTranslationX();
        float translationY = viewHolder.itemView.getTranslationY();
        float alpha = viewHolder.itemView.getAlpha();
        LJJJI(viewHolder);
        C786410Ut5.Jc(viewHolder.itemView, translationX);
        C786410Ut5.ed(viewHolder.itemView, translationY);
        C786410Ut5.T4(viewHolder.itemView, alpha);
        LJJJI(viewHolder2);
        C786410Ut5.Jc(viewHolder2.itemView, -((int) ((i3 - i) - translationX)));
        C786410Ut5.ed(viewHolder2.itemView, -((int) ((i4 - i2) - translationY)));
        C786410Ut5.T4(viewHolder2.itemView, 0.0f);
        this.LLJILJILJ.add(new C15EC(viewHolder, viewHolder2, i, i2, i3, i4));
        return true;
    }
}

package X;

import Y.ALAdapterS5S0400000_31;
import Y.ARunnableS100S0200000_31;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.PathInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.15EQ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15EQ extends AbstractC21674919sB {
    public final TimeInterpolator LLIZLLLIL = new AccelerateDecelerateInterpolator();
    public final PathInterpolator LLJ = new PathInterpolator(0.4f, 0.8f, 0.74f, 1.0f);
    public final ArrayList<RecyclerView.ViewHolder> LLJI = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LLJIJIL = new ArrayList<>();
    public final ArrayList<C15ER> LLJILJIL = new ArrayList<>();
    public final ArrayList<C15EM> LLJILJILJ = new ArrayList<>();
    public final ArrayList<ArrayList<RecyclerView.ViewHolder>> LLJILLL = new ArrayList<>();
    public final ArrayList<ArrayList<C15ER>> LLJJ = new ArrayList<>();
    public final ArrayList<ArrayList<C15EM>> LLJJI = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LLJJIII = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LLJJIJI = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LLJJIJIIJIL = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LLJJIJIL = new ArrayList<>();
    public final long LLJJJ = 120;
    public final long LLJJJIL = 120;
    public final long LLJJJJ = 240;
    public final long LLJJJJJIL = 240;
    public final long LLJJJJLIIL = 240;
    public final long LLJJL = 240;
    public final long LLJJLIIIJLLLLLLLZ = 240;
    public final AFwS221S0000000_31 LLJL = AFwS221S0000000_31.get$arr$(366);

    @Override // X.AbstractC21673719rz
    public final void LJIJI() {
        long j;
        boolean z = !this.LLJI.isEmpty();
        boolean z2 = !this.LLJILJIL.isEmpty();
        boolean z3 = !this.LLJILJILJ.isEmpty();
        boolean z4 = !this.LLJIJIL.isEmpty();
        if (z || z2 || z4 || z3) {
            for (RecyclerView.ViewHolder viewHolder : this.LLJI) {
                View view = viewHolder.itemView;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                this.LLJJIJIIJIL.add(viewHolder);
                viewPropertyAnimatorAnimate.setDuration(this.LLILZ).alpha(0.0f).setListener(new ALAdapterS5S0400000_31(view, viewPropertyAnimatorAnimate, viewHolder, this, 13)).start();
            }
            this.LLJI.clear();
            if (z2) {
                ArrayList<C15ER> arrayList = new ArrayList<>();
                arrayList.addAll(this.LLJILJIL);
                this.LLJJ.add(arrayList);
                this.LLJILJIL.clear();
                ARunnableS100S0200000_31 aRunnableS100S0200000_31 = new ARunnableS100S0200000_31(arrayList, this, 53);
                if (z) {
                    ((C15ER) ListProtector.get(arrayList, 0)).LIZ.itemView.postOnAnimationDelayed(aRunnableS100S0200000_31, this.LLILZ);
                } else {
                    aRunnableS100S0200000_31.run();
                }
            }
            if (z3) {
                ArrayList<C15EM> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.LLJILJILJ);
                this.LLJJI.add(arrayList2);
                this.LLJILJILJ.clear();
                ARunnableS100S0200000_31 aRunnableS100S0200000_312 = new ARunnableS100S0200000_31(arrayList2, this, 52);
                if (z) {
                    RecyclerView.ViewHolder viewHolder2 = ((C15EM) ListProtector.get(arrayList2, 0)).LIZ;
                    if (viewHolder2 != null) {
                        viewHolder2.itemView.postOnAnimationDelayed(aRunnableS100S0200000_312, this.LLILZ);
                    }
                } else {
                    aRunnableS100S0200000_312.run();
                }
            }
            if (z4) {
                ArrayList<RecyclerView.ViewHolder> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.LLJIJIL);
                this.LLJILLL.add(arrayList3);
                this.LLJIJIL.clear();
                ARunnableS100S0200000_31 aRunnableS100S0200000_313 = new ARunnableS100S0200000_31(arrayList3, this, 51);
                if (z) {
                    j = this.LLILZ;
                } else {
                    if (!z2 && !z3) {
                        aRunnableS100S0200000_313.run();
                        return;
                    }
                    j = 0;
                }
                ((RecyclerView.ViewHolder) ListProtector.get(arrayList3, 0)).itemView.postOnAnimationDelayed(aRunnableS100S0200000_313, j);
            }
        }
    }

    @Override // X.AbstractC21673719rz
    public final void LJIIL() {
        for (int size = this.LLJILJIL.size() - 1; -1 < size; size--) {
            C15ER c15er = (C15ER) ListProtector.get(this.LLJILJIL, size);
            View view = c15er.LIZ.itemView;
            C786410Ut5.ed(view, 0.0f);
            C786410Ut5.Jc(view, 0.0f);
            LJIIIZ(c15er.LIZ);
            ListProtector.remove(this.LLJILJIL, size);
        }
        for (int size2 = this.LLJI.size() - 1; -1 < size2; size2--) {
            LJIIIZ((RecyclerView.ViewHolder) ListProtector.get(this.LLJI, size2));
            ListProtector.remove(this.LLJI, size2);
        }
        for (int size3 = this.LLJIJIL.size() - 1; -1 < size3; size3--) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) ListProtector.get(this.LLJIJIL, size3);
            C786410Ut5.ed(viewHolder.itemView, 0.0f);
            LJJIIJ(viewHolder);
            ListProtector.remove(this.LLJIJIL, size3);
        }
        for (int size4 = this.LLJILJILJ.size() - 1; -1 < size4; size4--) {
            C15EM c15em = (C15EM) ListProtector.get(this.LLJILJILJ, size4);
            RecyclerView.ViewHolder viewHolder2 = c15em.LIZ;
            if (viewHolder2 != null) {
                LJJIJIIJI(c15em, viewHolder2);
            }
            RecyclerView.ViewHolder viewHolder3 = c15em.LIZIZ;
            if (viewHolder3 != null) {
                LJJIJIIJI(c15em, viewHolder3);
            }
        }
        this.LLJILJILJ.clear();
        if (LJIIZILJ()) {
            for (int size5 = this.LLJJ.size() - 1; -1 < size5; size5--) {
                ArrayList arrayList = (ArrayList) ListProtector.get(this.LLJJ, size5);
                for (int size6 = arrayList.size() - 1; -1 < size6; size6--) {
                    C15ER c15er2 = (C15ER) ListProtector.get(arrayList, size6);
                    View view2 = c15er2.LIZ.itemView;
                    C786410Ut5.ed(view2, 0.0f);
                    C786410Ut5.Jc(view2, 0.0f);
                    LJIIIZ(c15er2.LIZ);
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
                    C786410Ut5.ed(viewHolder4.itemView, 0.0f);
                    LJJIIJ(viewHolder4);
                    ListProtector.remove(arrayList2, size8);
                    if (arrayList2.isEmpty()) {
                        this.LLJILLL.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.LLJJI.size() - 1; -1 < size9; size9--) {
                ArrayList arrayList3 = (ArrayList) ListProtector.get(this.LLJJI, size9);
                for (int size10 = arrayList3.size() - 1; -1 < size10; size10--) {
                    C15EM c15em2 = (C15EM) ListProtector.get(arrayList3, size10);
                    RecyclerView.ViewHolder viewHolder5 = c15em2.LIZ;
                    if (viewHolder5 != null) {
                        LJJIJIIJI(c15em2, viewHolder5);
                    }
                    RecyclerView.ViewHolder viewHolder6 = c15em2.LIZIZ;
                    if (viewHolder6 != null) {
                        LJJIJIIJI(c15em2, viewHolder6);
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
        return (this.LLJIJIL.isEmpty() ^ true) || (this.LLJILJILJ.isEmpty() ^ true) || (this.LLJILJIL.isEmpty() ^ true) || (this.LLJI.isEmpty() ^ true) || (this.LLJJIJI.isEmpty() ^ true) || (this.LLJJIJIIJIL.isEmpty() ^ true) || (this.LLJJIII.isEmpty() ^ true) || (this.LLJJIJIL.isEmpty() ^ true) || (this.LLJJ.isEmpty() ^ true) || (this.LLJILLL.isEmpty() ^ true) || (this.LLJJI.isEmpty() ^ true);
    }

    public final void LJJIIZI() {
        if (LJIIZILJ()) {
            return;
        }
        LJIIJ();
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

    @Override // X.AbstractC21673719rz
    public final void LJIIJJI(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        view.animate().cancel();
        int size = this.LLJILJIL.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                if (((C15ER) ListProtector.get(this.LLJILJIL, size)).LIZ == viewHolder) {
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
        LJJIJ(viewHolder, this.LLJILJILJ);
        if (this.LLJI.remove(viewHolder)) {
            C786410Ut5.T4(view, 1.0f);
            LJIIIZ(viewHolder);
        }
        if (this.LLJIJIL.remove(viewHolder)) {
            C786410Ut5.ed(view, 0.0f);
            LJJIIJ(viewHolder);
        }
        int size2 = this.LLJJI.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                ArrayList arrayList = (ArrayList) ListProtector.get(this.LLJJI, size2);
                LJJIJ(viewHolder, arrayList);
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
                        if (((C15ER) ListProtector.get(arrayList2, size4)).LIZ == viewHolder) {
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
                    C786410Ut5.ed(view, 0.0f);
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
        LJJIIZI();
    }

    @Override // X.AbstractC21674919sB
    public final boolean LJJI(RecyclerView.ViewHolder viewHolder) {
        LJJIJIIJIL(viewHolder);
        C786410Ut5.T4(viewHolder.itemView, 0.0f);
        this.LLJIJIL.add(viewHolder);
        return true;
    }

    @Override // X.AbstractC21674919sB
    public final boolean LJJIII(RecyclerView.ViewHolder viewHolder) {
        LJJIJIIJIL(viewHolder);
        this.LLJI.add(viewHolder);
        return true;
    }

    @Override // X.AbstractC21674919sB
    public final void LJJIIJZLJL(RecyclerView.ViewHolder viewHolder) {
        this.LLJL.getClass();
    }

    public final void LJJIJIIJIL(RecyclerView.ViewHolder viewHolder) {
        viewHolder.itemView.animate().setInterpolator(this.LLIZLLLIL);
        LJIIJJI(viewHolder);
    }

    @Override // X.AbstractC21673719rz
    public final boolean LJIIIIZZ(RecyclerView.ViewHolder viewHolder, List<? extends Object> list) {
        if ((!list.isEmpty()) || LJII(viewHolder)) {
            return true;
        }
        return false;
    }

    public final void LJJIJ(RecyclerView.ViewHolder viewHolder, List list) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            C15EM c15em = (C15EM) ListProtector.get(list, size);
            if (LJJIJIIJI(c15em, viewHolder) && c15em.LIZ == null && c15em.LIZIZ == null) {
                list.remove(c15em);
            }
            if (i >= 0) {
                size = i;
            } else {
                return;
            }
        }
    }

    public final boolean LJJIJIIJI(C15EM c15em, RecyclerView.ViewHolder viewHolder) {
        if (c15em.LIZIZ == viewHolder) {
            c15em.LIZIZ = null;
        } else if (c15em.LIZ == viewHolder) {
            c15em.LIZ = null;
        } else {
            return false;
        }
        if (viewHolder != null) {
            View view = viewHolder.itemView;
            if (view != null) {
                C786410Ut5.T4(view, 1.0f);
            }
            if (viewHolder != null) {
                View view2 = viewHolder.itemView;
                if (view2 != null) {
                    C786410Ut5.Jc(view2, 0.0f);
                }
                View view3 = viewHolder.itemView;
                if (view3 != null) {
                    C786410Ut5.ed(view3, 0.0f);
                }
            }
        }
        LJIIIZ(viewHolder);
        return true;
    }

    @Override // X.AbstractC21674919sB
    public final boolean LJJII(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        View view = viewHolder.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) viewHolder.itemView.getTranslationY());
        LJJIJIIJIL(viewHolder);
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
            this.LLJILJIL.add(new C15ER(viewHolder, translationX, translationY, i3, i4));
            return true;
        }
        C786410Ut5.ed(view, -i6);
        this.LLJILJIL.add(new C15ER(viewHolder, translationX, translationY, i3, i4));
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
        LJJIJIIJIL(viewHolder);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        C786410Ut5.Jc(viewHolder.itemView, translationX);
        C786410Ut5.ed(viewHolder.itemView, translationY);
        C786410Ut5.T4(viewHolder.itemView, alpha);
        if (viewHolder2 != null) {
            LJJIJIIJIL(viewHolder2);
            C786410Ut5.Jc(viewHolder2.itemView, -i5);
            C786410Ut5.ed(viewHolder2.itemView, -i6);
            C786410Ut5.T4(viewHolder2.itemView, 0.0f);
        }
        this.LLJILJILJ.add(new C15EM(viewHolder, viewHolder2, i, i2, i3, i4));
        return true;
    }
}

package X;

import Y.ALAdapterS0S0400000_6;
import Y.ARunnableS75S0200000_6;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Gkj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C424510Gkj extends AbstractC21674919sB {
    public static TimeInterpolator LLJJIJIIJIL;
    public final ArrayList<RecyclerView.ViewHolder> LLIZLLLIL = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LLJ = new ArrayList<>();
    public final ArrayList<C424490Gkh> LLJI = new ArrayList<>();
    public final ArrayList<C424520Gkk> LLJIJIL = new ArrayList<>();
    public final ArrayList<ArrayList<RecyclerView.ViewHolder>> LLJILJIL = new ArrayList<>();
    public final ArrayList<ArrayList<C424490Gkh>> LLJILJILJ = new ArrayList<>();
    public final ArrayList<ArrayList<C424520Gkk>> LLJILLL = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LLJJ = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LLJJI = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LLJJIII = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LLJJIJI = new ArrayList<>();

    @Override // X.AbstractC21673719rz
    public final void LJIIL() {
        for (int size = this.LLJI.size() - 1; -1 < size; size--) {
            C424490Gkh c424490Gkh = (C424490Gkh) ListProtector.get(this.LLJI, size);
            View view = c424490Gkh.LIZ.itemView;
            C786410Ut5.ed(view, 0.0f);
            C786410Ut5.Jc(view, 0.0f);
            LJIIIZ(c424490Gkh.LIZ);
            ListProtector.remove(this.LLJI, size);
        }
        for (int size2 = this.LLIZLLLIL.size() - 1; -1 < size2; size2--) {
            LJIIIZ((RecyclerView.ViewHolder) ListProtector.get(this.LLIZLLLIL, size2));
            ListProtector.remove(this.LLIZLLLIL, size2);
        }
        for (int size3 = this.LLJ.size() - 1; -1 < size3; size3--) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) ListProtector.get(this.LLJ, size3);
            C786410Ut5.T4(viewHolder.itemView, 1.0f);
            LJJIIJ(viewHolder);
            ListProtector.remove(this.LLJ, size3);
        }
        for (int size4 = this.LLJIJIL.size() - 1; -1 < size4; size4--) {
            C424520Gkk c424520Gkk = (C424520Gkk) ListProtector.get(this.LLJIJIL, size4);
            RecyclerView.ViewHolder viewHolder2 = c424520Gkk.LIZ;
            if (viewHolder2 != null) {
                LJJIJIIJI(c424520Gkk, viewHolder2);
            }
            RecyclerView.ViewHolder viewHolder3 = c424520Gkk.LIZIZ;
            if (viewHolder3 != null) {
                LJJIJIIJI(c424520Gkk, viewHolder3);
            }
        }
        this.LLJIJIL.clear();
        if (LJIIZILJ()) {
            for (int size5 = this.LLJILJILJ.size() - 1; -1 < size5; size5--) {
                ArrayList arrayList = (ArrayList) ListProtector.get(this.LLJILJILJ, size5);
                for (int size6 = arrayList.size() - 1; -1 < size6; size6--) {
                    C424490Gkh c424490Gkh2 = (C424490Gkh) ListProtector.get(arrayList, size6);
                    View view2 = c424490Gkh2.LIZ.itemView;
                    C786410Ut5.ed(view2, 0.0f);
                    C786410Ut5.Jc(view2, 0.0f);
                    LJIIIZ(c424490Gkh2.LIZ);
                    ListProtector.remove(arrayList, size6);
                    if (arrayList.isEmpty()) {
                        this.LLJILJILJ.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.LLJILJIL.size() - 1; -1 < size7; size7--) {
                ArrayList arrayList2 = (ArrayList) ListProtector.get(this.LLJILJIL, size7);
                for (int size8 = arrayList2.size() - 1; -1 < size8; size8--) {
                    RecyclerView.ViewHolder viewHolder4 = (RecyclerView.ViewHolder) ListProtector.get(arrayList2, size8);
                    C786410Ut5.T4(viewHolder4.itemView, 1.0f);
                    LJJIIJ(viewHolder4);
                    ListProtector.remove(arrayList2, size8);
                    if (arrayList2.isEmpty()) {
                        this.LLJILJIL.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.LLJILLL.size() - 1; -1 < size9; size9--) {
                ArrayList arrayList3 = (ArrayList) ListProtector.get(this.LLJILLL, size9);
                for (int size10 = arrayList3.size() - 1; -1 < size10; size10--) {
                    C424520Gkk c424520Gkk2 = (C424520Gkk) ListProtector.get(arrayList3, size10);
                    RecyclerView.ViewHolder viewHolder5 = c424520Gkk2.LIZ;
                    if (viewHolder5 != null) {
                        LJJIJIIJI(c424520Gkk2, viewHolder5);
                    }
                    RecyclerView.ViewHolder viewHolder6 = c424520Gkk2.LIZIZ;
                    if (viewHolder6 != null) {
                        LJJIJIIJI(c424520Gkk2, viewHolder6);
                    }
                    if (arrayList3.isEmpty()) {
                        this.LLJILLL.remove(arrayList3);
                    }
                }
            }
            LJJIIZ(this.LLJJIII);
            LJJIIZ(this.LLJJI);
            LJJIIZ(this.LLJJ);
            LJJIIZ(this.LLJJIJI);
            LJIIJ();
        }
    }

    @Override // X.AbstractC21673719rz
    public final boolean LJIIZILJ() {
        return (this.LLJ.isEmpty() && this.LLJIJIL.isEmpty() && this.LLJI.isEmpty() && this.LLIZLLLIL.isEmpty() && this.LLJJI.isEmpty() && this.LLJJIII.isEmpty() && this.LLJJ.isEmpty() && this.LLJJIJI.isEmpty() && this.LLJILJILJ.isEmpty() && this.LLJILJIL.isEmpty() && this.LLJILLL.isEmpty()) ? false : true;
    }

    @Override // X.AbstractC21673719rz
    public final void LJIJI() {
        boolean z = !this.LLIZLLLIL.isEmpty();
        boolean z2 = !this.LLJI.isEmpty();
        boolean z3 = !this.LLJIJIL.isEmpty();
        boolean z4 = !this.LLJ.isEmpty();
        if (z || z2 || z4 || z3) {
            for (RecyclerView.ViewHolder viewHolder : this.LLIZLLLIL) {
                C20441214yg.LIZIZ("BaseAnimator", "animateRemoveImpl");
                View view = viewHolder.itemView;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                this.LLJJIII.add(viewHolder);
                viewPropertyAnimatorAnimate.setDuration(this.LLILZ).alpha(0.0f).setListener(new ALAdapterS0S0400000_6(view, viewPropertyAnimatorAnimate, viewHolder, this, 13)).start();
            }
            this.LLIZLLLIL.clear();
            if (z2) {
                ArrayList<C424490Gkh> arrayList = new ArrayList<>();
                arrayList.addAll(this.LLJI);
                this.LLJILJILJ.add(arrayList);
                this.LLJI.clear();
                ARunnableS75S0200000_6 aRunnableS75S0200000_6 = new ARunnableS75S0200000_6(arrayList, this, 142);
                if (z) {
                    ((C424490Gkh) ListProtector.get(arrayList, 0)).LIZ.itemView.postOnAnimationDelayed(aRunnableS75S0200000_6, this.LLILZ);
                } else {
                    aRunnableS75S0200000_6.run();
                }
            }
            if (z3) {
                ArrayList<C424520Gkk> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.LLJIJIL);
                this.LLJILLL.add(arrayList2);
                this.LLJIJIL.clear();
                ARunnableS75S0200000_6 aRunnableS75S0200000_62 = new ARunnableS75S0200000_6(arrayList2, this, 141);
                if (z) {
                    ((C424520Gkk) ListProtector.get(arrayList2, 0)).LIZ.itemView.postOnAnimationDelayed(aRunnableS75S0200000_62, this.LLILZ);
                } else {
                    aRunnableS75S0200000_62.run();
                }
            }
            if (z4) {
                ArrayList<RecyclerView.ViewHolder> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.LLJ);
                this.LLJILJIL.add(arrayList3);
                this.LLJ.clear();
                ARunnableS75S0200000_6 aRunnableS75S0200000_63 = new ARunnableS75S0200000_6(arrayList3, this, 140);
                if (z || z2 || z3) {
                    ((RecyclerView.ViewHolder) ListProtector.get(arrayList3, 0)).itemView.postOnAnimationDelayed(aRunnableS75S0200000_63, (z ? this.LLILZ : 0L) + Math.max(z2 ? this.LLILZIL : 0L, z3 ? this.LLILZLL : 0L));
                } else {
                    aRunnableS75S0200000_63.run();
                }
            }
        }
    }

    public final void LJJIIZI() {
        if (LJIIZILJ()) {
            return;
        }
        LJIIJ();
    }

    public static final void LJJIIZ(List<? extends RecyclerView.ViewHolder> list) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            ((RecyclerView.ViewHolder) ListProtector.get(list, size)).itemView.animate().cancel();
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
        int size = this.LLJI.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                if (((C424490Gkh) ListProtector.get(this.LLJI, size)).LIZ == viewHolder) {
                    C786410Ut5.ed(view, 0.0f);
                    C786410Ut5.Jc(view, 0.0f);
                    LJIIIZ(viewHolder);
                    ListProtector.remove(this.LLJI, size);
                }
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        LJJIJ(viewHolder, this.LLJIJIL);
        if (this.LLIZLLLIL.remove(viewHolder)) {
            C786410Ut5.T4(view, 1.0f);
            LJIIIZ(viewHolder);
        }
        if (this.LLJ.remove(viewHolder)) {
            C786410Ut5.T4(view, 1.0f);
            LJJIIJ(viewHolder);
        }
        int size2 = this.LLJILLL.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                ArrayList arrayList = (ArrayList) ListProtector.get(this.LLJILLL, size2);
                LJJIJ(viewHolder, arrayList);
                if (arrayList.isEmpty()) {
                    ListProtector.remove(this.LLJILLL, size2);
                }
                if (i2 < 0) {
                    break;
                } else {
                    size2 = i2;
                }
            }
        }
        int size3 = this.LLJILJILJ.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i3 = size3 - 1;
                ArrayList arrayList2 = (ArrayList) ListProtector.get(this.LLJILJILJ, size3);
                int size4 = arrayList2.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i4 = size4 - 1;
                        if (((C424490Gkh) ListProtector.get(arrayList2, size4)).LIZ == viewHolder) {
                            C786410Ut5.ed(view, 0.0f);
                            C786410Ut5.Jc(view, 0.0f);
                            LJIIIZ(viewHolder);
                            ListProtector.remove(arrayList2, size4);
                            if (arrayList2.isEmpty()) {
                                ListProtector.remove(this.LLJILJILJ, size3);
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
        int size5 = this.LLJILJIL.size() - 1;
        if (size5 >= 0) {
            while (true) {
                int i5 = size5 - 1;
                ArrayList arrayList3 = (ArrayList) ListProtector.get(this.LLJILJIL, size5);
                if (arrayList3.remove(viewHolder)) {
                    C786410Ut5.T4(view, 1.0f);
                    LJJIIJ(viewHolder);
                    if (arrayList3.isEmpty()) {
                        ListProtector.remove(this.LLJILJIL, size5);
                    }
                }
                if (i5 < 0) {
                    break;
                } else {
                    size5 = i5;
                }
            }
        }
        this.LLJJIII.remove(viewHolder);
        this.LLJJ.remove(viewHolder);
        this.LLJJIJI.remove(viewHolder);
        this.LLJJI.remove(viewHolder);
        LJJIIZI();
    }

    @Override // X.AbstractC21674919sB
    public final boolean LJJI(RecyclerView.ViewHolder viewHolder) {
        LJJIJIIJIL(viewHolder);
        C786410Ut5.T4(viewHolder.itemView, 0.0f);
        this.LLJ.add(viewHolder);
        return true;
    }

    @Override // X.AbstractC21674919sB
    public final boolean LJJIII(RecyclerView.ViewHolder viewHolder) {
        LJJIJIIJIL(viewHolder);
        this.LLIZLLLIL.add(viewHolder);
        return true;
    }

    public final void LJJIJIIJIL(RecyclerView.ViewHolder viewHolder) {
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = new ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(LLJJIJIIJIL);
        LJIIJJI(viewHolder);
    }

    @Override // X.AbstractC21673719rz
    public final boolean LJIIIIZZ(RecyclerView.ViewHolder viewHolder, List<? extends Object> list) {
        if (list.isEmpty() && !LJII(viewHolder)) {
            return false;
        }
        return true;
    }

    public final void LJJIJ(RecyclerView.ViewHolder viewHolder, List list) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            C424520Gkk c424520Gkk = (C424520Gkk) ListProtector.get(list, size);
            if (LJJIJIIJI(c424520Gkk, viewHolder) && c424520Gkk.LIZ == null && c424520Gkk.LIZIZ == null) {
                list.remove(c424520Gkk);
            }
            if (i >= 0) {
                size = i;
            } else {
                return;
            }
        }
    }

    public final boolean LJJIJIIJI(C424520Gkk c424520Gkk, RecyclerView.ViewHolder viewHolder) {
        if (c424520Gkk.LIZIZ == viewHolder) {
            c424520Gkk.LIZIZ = null;
        } else if (c424520Gkk.LIZ == viewHolder) {
            c424520Gkk.LIZ = null;
        } else {
            return false;
        }
        C786410Ut5.T4(viewHolder.itemView, 1.0f);
        C786410Ut5.Jc(viewHolder.itemView, 0.0f);
        C786410Ut5.ed(viewHolder.itemView, 0.0f);
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
            this.LLJI.add(new C424490Gkh(viewHolder, translationX, translationY, i3, i4));
            return true;
        }
        C786410Ut5.ed(view, -i6);
        this.LLJI.add(new C424490Gkh(viewHolder, translationX, translationY, i3, i4));
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
        C786410Ut5.Jc(viewHolder.itemView, translationX);
        C786410Ut5.ed(viewHolder.itemView, translationY);
        C786410Ut5.T4(viewHolder.itemView, alpha);
        LJJIJIIJIL(viewHolder2);
        C786410Ut5.Jc(viewHolder2.itemView, -((int) ((i3 - i) - translationX)));
        C786410Ut5.ed(viewHolder2.itemView, -((int) ((i4 - i2) - translationY)));
        C786410Ut5.T4(viewHolder2.itemView, 0.0f);
        this.LLJIJIL.add(new C424520Gkk(viewHolder, viewHolder2, i, i2, i3, i4));
        return true;
    }
}

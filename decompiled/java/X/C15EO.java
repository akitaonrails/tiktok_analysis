package X;

import Y.ALAdapterS5S0400000_31;
import Y.ARunnableS100S0200000_31;
import Y.ARunnableS96S0200000_27;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.image.TakoAnswerImageCell;
import com.ss.android.ugc.aweme.tako.botpage.cards.sug.TakoSugListCardCell;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.15EO, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15EO extends AbstractC21674919sB {
    public final boolean LLIZLLLIL;
    public TimeInterpolator LLJI;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1339));
    public final ArrayList<RecyclerView.ViewHolder> LLJIJIL = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LLJILJIL = new ArrayList<>();
    public final ArrayList<C15EP> LLJILJILJ = new ArrayList<>();
    public final ArrayList<C15EN> LLJILLL = new ArrayList<>();
    public final ArrayList<ArrayList<RecyclerView.ViewHolder>> LLJJ = new ArrayList<>();
    public final ArrayList<ArrayList<C15EP>> LLJJI = new ArrayList<>();
    public final ArrayList<ArrayList<C15EN>> LLJJIII = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LLJJIJI = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LLJJIJIIJIL = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LLJJIJIL = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LLJJJ = new ArrayList<>();
    public final float LLJJJIL = 60.0f;

    @Override // X.AbstractC21673719rz
    public final void LJIIL() {
        for (int size = this.LLJILJILJ.size() - 1; -1 < size; size--) {
            C15EP c15ep = (C15EP) ListProtector.get(this.LLJILJILJ, size);
            View view = c15ep.LIZ.itemView;
            C786410Ut5.ed(view, 0.0f);
            C786410Ut5.Jc(view, 0.0f);
            LJIIIZ(c15ep.LIZ);
            ListProtector.remove(this.LLJILJILJ, size);
        }
        for (int size2 = this.LLJIJIL.size() - 1; -1 < size2; size2--) {
            LJIIIZ((RecyclerView.ViewHolder) ListProtector.get(this.LLJIJIL, size2));
            ListProtector.remove(this.LLJIJIL, size2);
        }
        for (int size3 = this.LLJILJIL.size() - 1; -1 < size3; size3--) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) ListProtector.get(this.LLJILJIL, size3);
            C786410Ut5.T4(viewHolder.itemView, 1.0f);
            LJJIIJ(viewHolder);
            ListProtector.remove(this.LLJILJIL, size3);
        }
        for (int size4 = this.LLJILLL.size() - 1; -1 < size4; size4--) {
            C15EN c15en = (C15EN) ListProtector.get(this.LLJILLL, size4);
            RecyclerView.ViewHolder viewHolder2 = c15en.LIZ;
            if (viewHolder2 != null) {
                LJJIJIIJI(c15en, viewHolder2);
            }
            RecyclerView.ViewHolder viewHolder3 = c15en.LIZIZ;
            if (viewHolder3 != null) {
                LJJIJIIJI(c15en, viewHolder3);
            }
        }
        this.LLJILLL.clear();
        if (LJIIZILJ()) {
            for (int size5 = this.LLJJI.size() - 1; -1 < size5; size5--) {
                ArrayList arrayList = (ArrayList) ListProtector.get(this.LLJJI, size5);
                for (int size6 = arrayList.size() - 1; -1 < size6; size6--) {
                    C15EP c15ep2 = (C15EP) ListProtector.get(arrayList, size6);
                    View view2 = c15ep2.LIZ.itemView;
                    C786410Ut5.ed(view2, 0.0f);
                    C786410Ut5.Jc(view2, 0.0f);
                    LJIIIZ(c15ep2.LIZ);
                    ListProtector.remove(arrayList, size6);
                    if (arrayList.isEmpty()) {
                        this.LLJJI.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.LLJJ.size() - 1; -1 < size7; size7--) {
                ArrayList arrayList2 = (ArrayList) ListProtector.get(this.LLJJ, size7);
                for (int size8 = arrayList2.size() - 1; -1 < size8; size8--) {
                    RecyclerView.ViewHolder viewHolder4 = (RecyclerView.ViewHolder) ListProtector.get(arrayList2, size8);
                    C786410Ut5.T4(viewHolder4.itemView, 1.0f);
                    LJJIIJ(viewHolder4);
                    ListProtector.remove(arrayList2, size8);
                    if (arrayList2.isEmpty()) {
                        this.LLJJ.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.LLJJIII.size() - 1; -1 < size9; size9--) {
                ArrayList arrayList3 = (ArrayList) ListProtector.get(this.LLJJIII, size9);
                for (int size10 = arrayList3.size() - 1; -1 < size10; size10--) {
                    C15EN c15en2 = (C15EN) ListProtector.get(arrayList3, size10);
                    RecyclerView.ViewHolder viewHolder5 = c15en2.LIZ;
                    if (viewHolder5 != null) {
                        LJJIJIIJI(c15en2, viewHolder5);
                    }
                    RecyclerView.ViewHolder viewHolder6 = c15en2.LIZIZ;
                    if (viewHolder6 != null) {
                        LJJIJIIJI(c15en2, viewHolder6);
                    }
                    if (arrayList3.isEmpty()) {
                        this.LLJJIII.remove(arrayList3);
                    }
                }
            }
            LJJIIZ(this.LLJJIJIL);
            LJJIIZ(this.LLJJIJIIJIL);
            LJJIIZ(this.LLJJIJI);
            LJJIIZ(this.LLJJJ);
            LJIIJ();
        }
    }

    @Override // X.AbstractC21673719rz
    public final boolean LJIIZILJ() {
        return (this.LLJILJIL.isEmpty() && this.LLJILLL.isEmpty() && this.LLJILJILJ.isEmpty() && this.LLJIJIL.isEmpty() && this.LLJJIJIIJIL.isEmpty() && this.LLJJIJIL.isEmpty() && this.LLJJIJI.isEmpty() && this.LLJJJ.isEmpty() && this.LLJJI.isEmpty() && this.LLJJ.isEmpty() && this.LLJJIII.isEmpty()) ? false : true;
    }

    @Override // X.AbstractC21673719rz
    public final void LJIJI() {
        View view;
        boolean z = !this.LLJIJIL.isEmpty();
        boolean z2 = !this.LLJILJILJ.isEmpty();
        boolean z3 = !this.LLJILLL.isEmpty();
        boolean z4 = !this.LLJILJIL.isEmpty();
        if (z || z2 || z4 || z3) {
            for (RecyclerView.ViewHolder viewHolder : this.LLJIJIL) {
                View view2 = viewHolder.itemView;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                this.LLJJIJIL.add(viewHolder);
                viewPropertyAnimatorAnimate.setDuration(this.LLILZ).alpha(0.0f).setListener(new ALAdapterS5S0400000_31(this, viewHolder, viewPropertyAnimatorAnimate, view2, 9)).start();
            }
            this.LLJIJIL.clear();
            if (z2) {
                ArrayList<C15EP> arrayList = new ArrayList<>();
                arrayList.addAll(this.LLJILJILJ);
                this.LLJJI.add(arrayList);
                this.LLJILJILJ.clear();
                ARunnableS100S0200000_31 aRunnableS100S0200000_31 = new ARunnableS100S0200000_31(arrayList, this, 47);
                if (z) {
                    ((C15EP) ListProtector.get(arrayList, 0)).LIZ.itemView.postOnAnimationDelayed(aRunnableS100S0200000_31, this.LLILZ);
                } else {
                    aRunnableS100S0200000_31.run();
                }
            }
            if (z3) {
                ArrayList<C15EN> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.LLJILLL);
                this.LLJJIII.add(arrayList2);
                this.LLJILLL.clear();
                ARunnableS100S0200000_31 aRunnableS100S0200000_312 = new ARunnableS100S0200000_31(arrayList2, this, 46);
                if (z) {
                    RecyclerView.ViewHolder viewHolder2 = ((C15EN) ListProtector.get(arrayList2, 0)).LIZ;
                    if (viewHolder2 != null && (view = viewHolder2.itemView) != null) {
                        view.postOnAnimationDelayed(aRunnableS100S0200000_312, this.LLILZ);
                    }
                } else {
                    aRunnableS100S0200000_312.run();
                }
            }
            if (z4) {
                ArrayList<RecyclerView.ViewHolder> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.LLJILJIL);
                this.LLJJ.add(arrayList3);
                this.LLJILJIL.clear();
                ARunnableS96S0200000_27 aRunnableS96S0200000_27 = new ARunnableS96S0200000_27(arrayList3, this, 17);
                if (z || z2 || z3) {
                    ((RecyclerView.ViewHolder) ListProtector.get(arrayList3, 0)).itemView.postOnAnimationDelayed(aRunnableS96S0200000_27, (z ? this.LLILZ : 0L) + Math.max(z2 ? this.LLILZIL : 0L, z3 ? this.LLILZLL : 0L));
                } else {
                    aRunnableS96S0200000_27.run();
                }
            }
        }
    }

    public final boolean LJJIJIIJIL() {
        return ((Boolean) this.LLJ.getValue()).booleanValue();
    }

    public final void LJJIIZI() {
        if (LJIIZILJ()) {
            return;
        }
        LJIIJ();
    }

    public C15EO(boolean z) {
        this.LLIZLLLIL = z;
        this.LLIZ = false;
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
        int size = this.LLJILJILJ.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                if (((C15EP) ListProtector.get(this.LLJILJILJ, size)).LIZ == viewHolder) {
                    C786410Ut5.ed(view, 0.0f);
                    C786410Ut5.Jc(view, 0.0f);
                    LJIIIZ(viewHolder);
                    ListProtector.remove(this.LLJILJILJ, size);
                }
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        LJJIJ(viewHolder, this.LLJILLL);
        if (this.LLJIJIL.remove(viewHolder)) {
            C786410Ut5.T4(view, 1.0f);
            LJIIIZ(viewHolder);
        }
        if (this.LLJILJIL.remove(viewHolder)) {
            C786410Ut5.T4(view, 1.0f);
            LJJIIJ(viewHolder);
        }
        int size2 = this.LLJJIII.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                ArrayList arrayList = (ArrayList) ListProtector.get(this.LLJJIII, size2);
                LJJIJ(viewHolder, arrayList);
                if (arrayList.isEmpty()) {
                    ListProtector.remove(this.LLJJIII, size2);
                }
                if (i2 < 0) {
                    break;
                } else {
                    size2 = i2;
                }
            }
        }
        int size3 = this.LLJJI.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i3 = size3 - 1;
                ArrayList arrayList2 = (ArrayList) ListProtector.get(this.LLJJI, size3);
                int size4 = arrayList2.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i4 = size4 - 1;
                        if (((C15EP) ListProtector.get(arrayList2, size4)).LIZ == viewHolder) {
                            C786410Ut5.ed(view, 0.0f);
                            C786410Ut5.Jc(view, 0.0f);
                            LJIIIZ(viewHolder);
                            ListProtector.remove(arrayList2, size4);
                            if (arrayList2.isEmpty()) {
                                ListProtector.remove(this.LLJJI, size3);
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
        int size5 = this.LLJJ.size() - 1;
        if (size5 >= 0) {
            while (true) {
                int i5 = size5 - 1;
                ArrayList arrayList3 = (ArrayList) ListProtector.get(this.LLJJ, size5);
                if (arrayList3.remove(viewHolder)) {
                    C786410Ut5.T4(view, 1.0f);
                    LJJIIJ(viewHolder);
                    if (arrayList3.isEmpty()) {
                        ListProtector.remove(this.LLJJ, size5);
                    }
                }
                if (i5 < 0) {
                    break;
                } else {
                    size5 = i5;
                }
            }
        }
        this.LLJJIJIL.remove(viewHolder);
        this.LLJJIJI.remove(viewHolder);
        this.LLJJJ.remove(viewHolder);
        this.LLJJIJIIJIL.remove(viewHolder);
        LJJIIZI();
    }

    @Override // X.AbstractC21674919sB
    public final boolean LJJI(RecyclerView.ViewHolder viewHolder) {
        if (LJJIJIIJIL() && !(viewHolder instanceof TakoSugListCardCell)) {
            C786410Ut5.T4(viewHolder.itemView, 1.0f);
            C786410Ut5.Jc(viewHolder.itemView, 0.0f);
            C786410Ut5.ed(viewHolder.itemView, 0.0f);
            LJJIIJ(viewHolder);
            return false;
        }
        LJJIJIL(viewHolder);
        C786410Ut5.T4(viewHolder.itemView, 0.0f);
        this.LLJILJIL.add(viewHolder);
        return true;
    }

    @Override // X.AbstractC21674919sB
    public final boolean LJJIII(RecyclerView.ViewHolder viewHolder) {
        if (LJJIJIIJIL()) {
            LJIIIZ(viewHolder);
            return false;
        }
        if (viewHolder instanceof TakoAnswerImageCell) {
            LJIIIZ(viewHolder);
            return false;
        }
        LJJIJIL(viewHolder);
        this.LLJIJIL.add(viewHolder);
        return true;
    }

    public final void LJJIJIL(RecyclerView.ViewHolder viewHolder) {
        if (this.LLJI == null) {
            this.LLJI = new ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(this.LLJI);
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
            C15EN c15en = (C15EN) ListProtector.get(list, size);
            if (LJJIJIIJI(c15en, viewHolder) && c15en.LIZ == null && c15en.LIZIZ == null) {
                list.remove(c15en);
            }
            if (i >= 0) {
                size = i;
            } else {
                return;
            }
        }
    }

    public final boolean LJJIJIIJI(C15EN c15en, RecyclerView.ViewHolder viewHolder) {
        if (c15en.LIZIZ == viewHolder) {
            c15en.LIZIZ = null;
        } else if (c15en.LIZ == viewHolder) {
            c15en.LIZ = null;
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
        if (LJJIJIIJIL()) {
            C786410Ut5.T4(viewHolder.itemView, 1.0f);
            C786410Ut5.Jc(viewHolder.itemView, 0.0f);
            C786410Ut5.ed(viewHolder.itemView, 0.0f);
            LJIIIZ(viewHolder);
            return false;
        }
        View view = viewHolder.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) viewHolder.itemView.getTranslationY());
        LJJIJIL(viewHolder);
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
            this.LLJILJILJ.add(new C15EP(viewHolder, translationX, translationY, i3, i4));
            return true;
        }
        C786410Ut5.ed(view, -i6);
        this.LLJILJILJ.add(new C15EP(viewHolder, translationX, translationY, i3, i4));
        return true;
    }

    @Override // X.AbstractC21674919sB
    public final boolean LJJIFFI(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        if (LJJIJIIJIL()) {
            C786410Ut5.T4(viewHolder.itemView, 1.0f);
            C786410Ut5.Jc(viewHolder.itemView, 0.0f);
            C786410Ut5.ed(viewHolder.itemView, 0.0f);
            LJIIIZ(viewHolder);
            if (viewHolder2 != null) {
                C786410Ut5.T4(viewHolder2.itemView, 1.0f);
                C786410Ut5.Jc(viewHolder2.itemView, 0.0f);
                C786410Ut5.ed(viewHolder2.itemView, 0.0f);
                LJIIIZ(viewHolder2);
                return false;
            }
            return false;
        }
        if (viewHolder == viewHolder2) {
            return LJJII(viewHolder, i, i2, i3, i4);
        }
        float translationX = viewHolder.itemView.getTranslationX();
        float translationY = viewHolder.itemView.getTranslationY();
        float alpha = viewHolder.itemView.getAlpha();
        LJJIJIL(viewHolder);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        C786410Ut5.Jc(viewHolder.itemView, translationX);
        C786410Ut5.ed(viewHolder.itemView, translationY);
        C786410Ut5.T4(viewHolder.itemView, alpha);
        if (viewHolder2 != null) {
            LJJIJIL(viewHolder2);
            C786410Ut5.Jc(viewHolder2.itemView, -i5);
            C786410Ut5.ed(viewHolder2.itemView, -i6);
            C786410Ut5.T4(viewHolder2.itemView, 0.0f);
        }
        this.LLJILLL.add(new C15EN(viewHolder, viewHolder2, i, i2, i3, i4));
        return true;
    }
}

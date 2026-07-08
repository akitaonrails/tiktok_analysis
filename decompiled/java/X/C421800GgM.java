package X;

import Y.ALAdapterS1S0300000_6;
import Y.ARunnableS75S0200000_6;
import Y.AUListenerS255S0100000_5;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeGalleryLayoutManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0GgM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421800GgM extends AbstractC21674919sB {
    public static TimeInterpolator LLJJIJIL;
    public final ArrayList<RecyclerView.ViewHolder> LLIZLLLIL = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LLJ = new ArrayList<>();
    public final ArrayList<C421060GfA> LLJI = new ArrayList<>();
    public final ArrayList<C421790GgL> LLJIJIL = new ArrayList<>();
    public final ArrayList<ArrayList<RecyclerView.ViewHolder>> LLJILJIL = new ArrayList<>();
    public final ArrayList<ArrayList<C421060GfA>> LLJILJILJ = new ArrayList<>();
    public final ArrayList<ArrayList<C421790GgL>> LLJILLL = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LLJJ = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LLJJI = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LLJJIII = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LLJJIJI = new ArrayList<>();
    public final RecyclerView LLJJIJIIJIL;

    @Override // X.AbstractC21673719rz
    public final void LJIIL() {
        int size = this.LLJI.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C421060GfA c421060GfA = (C421060GfA) ListProtector.get(this.LLJI, size);
            View view = c421060GfA.LIZ.itemView;
            C786410Ut5.ed(view, 0.0f);
            C786410Ut5.Jc(view, 0.0f);
            LJIIIZ(c421060GfA.LIZ);
            ListProtector.remove(this.LLJI, size);
        }
        int size2 = this.LLIZLLLIL.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            LJIIIZ((RecyclerView.ViewHolder) ListProtector.get(this.LLIZLLLIL, size2));
            ListProtector.remove(this.LLIZLLLIL, size2);
        }
        int size3 = this.LLJ.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) ListProtector.get(this.LLJ, size3);
            C786410Ut5.T4(viewHolder.itemView, 1.0f);
            LJJIIJ(viewHolder);
            ListProtector.remove(this.LLJ, size3);
        }
        int size4 = this.LLJIJIL.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            C421790GgL c421790GgL = (C421790GgL) ListProtector.get(this.LLJIJIL, size4);
            RecyclerView.ViewHolder viewHolder2 = c421790GgL.LIZ;
            if (viewHolder2 != null) {
                LJJIJIIJI(c421790GgL, viewHolder2);
            }
            RecyclerView.ViewHolder viewHolder3 = c421790GgL.LIZIZ;
            if (viewHolder3 != null) {
                LJJIJIIJI(c421790GgL, viewHolder3);
            }
        }
        this.LLJIJIL.clear();
        if (!LJIIZILJ()) {
            return;
        }
        int size5 = this.LLJILJILJ.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList arrayList = (ArrayList) ListProtector.get(this.LLJILJILJ, size5);
            int size6 = arrayList.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    C421060GfA c421060GfA2 = (C421060GfA) ListProtector.get(arrayList, size6);
                    View view2 = c421060GfA2.LIZ.itemView;
                    C786410Ut5.ed(view2, 0.0f);
                    C786410Ut5.Jc(view2, 0.0f);
                    LJIIIZ(c421060GfA2.LIZ);
                    ListProtector.remove(arrayList, size6);
                    if (arrayList.isEmpty()) {
                        this.LLJILJILJ.remove(arrayList);
                    }
                }
            }
        }
        int size7 = this.LLJILJIL.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) ListProtector.get(this.LLJILJIL, size7);
            int size8 = arrayList2.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    RecyclerView.ViewHolder viewHolder4 = (RecyclerView.ViewHolder) ListProtector.get(arrayList2, size8);
                    C786410Ut5.T4(viewHolder4.itemView, 1.0f);
                    LJJIIJ(viewHolder4);
                    ListProtector.remove(arrayList2, size8);
                    if (arrayList2.isEmpty()) {
                        this.LLJILJIL.remove(arrayList2);
                    }
                }
            }
        }
        int size9 = this.LLJILLL.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                LJJIIZ(this.LLJJIII);
                LJJIIZ(this.LLJJI);
                LJJIIZ(this.LLJJ);
                LJJIIZ(this.LLJJIJI);
                LJIIJ();
                return;
            }
            ArrayList arrayList3 = (ArrayList) ListProtector.get(this.LLJILLL, size9);
            int size10 = arrayList3.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    C421790GgL c421790GgL2 = (C421790GgL) ListProtector.get(arrayList3, size10);
                    RecyclerView.ViewHolder viewHolder5 = c421790GgL2.LIZ;
                    if (viewHolder5 != null) {
                        LJJIJIIJI(c421790GgL2, viewHolder5);
                    }
                    RecyclerView.ViewHolder viewHolder6 = c421790GgL2.LIZIZ;
                    if (viewHolder6 != null) {
                        LJJIJIIJI(c421790GgL2, viewHolder6);
                    }
                    if (arrayList3.isEmpty()) {
                        this.LLJILLL.remove(arrayList3);
                    }
                }
            }
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
                this.LLJJIII.add(viewHolder);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setDuration(300L);
                valueAnimatorOfFloat.addUpdateListener(new AUListenerS255S0100000_5(viewHolder, 37));
                valueAnimatorOfFloat.addListener(new ALAdapterS1S0300000_6(viewHolder, valueAnimatorOfFloat, this, 13));
                valueAnimatorOfFloat.start();
            }
            this.LLIZLLLIL.clear();
            if (z2) {
                ArrayList<C421060GfA> arrayList = new ArrayList<>();
                arrayList.addAll(this.LLJI);
                this.LLJILJILJ.add(arrayList);
                this.LLJI.clear();
                ARunnableS75S0200000_6 aRunnableS75S0200000_6 = new ARunnableS75S0200000_6(arrayList, this, 128);
                if (z) {
                    ((C421060GfA) ListProtector.get(arrayList, 0)).LIZ.itemView.postOnAnimationDelayed(aRunnableS75S0200000_6, this.LLILZ);
                } else {
                    aRunnableS75S0200000_6.run();
                }
            }
            if (z3) {
                ArrayList<C421790GgL> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.LLJIJIL);
                this.LLJILLL.add(arrayList2);
                this.LLJIJIL.clear();
                ARunnableS75S0200000_6 aRunnableS75S0200000_62 = new ARunnableS75S0200000_6(arrayList2, this, 129);
                if (z) {
                    ((C421790GgL) ListProtector.get(arrayList2, 0)).LIZ.itemView.postOnAnimationDelayed(aRunnableS75S0200000_62, this.LLILZ);
                } else {
                    aRunnableS75S0200000_62.run();
                }
            }
            if (z4) {
                ArrayList<RecyclerView.ViewHolder> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.LLJ);
                this.LLJILJIL.add(arrayList3);
                this.LLJ.clear();
                ARunnableS75S0200000_6 aRunnableS75S0200000_63 = new ARunnableS75S0200000_6(arrayList3, this, 130);
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

    public C421800GgM(RecyclerView recyclerView) {
        this.LLJJIJIIJIL = recyclerView;
    }

    public static final void LJJIIZ(List<RecyclerView.ViewHolder> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.ViewHolder) ListProtector.get(list, size)).itemView.animate().cancel();
        }
    }

    @Override // X.AbstractC21673719rz
    public final void LJIIJJI(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        view.animate().cancel();
        for (int size = this.LLJI.size() - 1; size >= 0; size--) {
            if (((C421060GfA) ListProtector.get(this.LLJI, size)).LIZ == viewHolder) {
                C786410Ut5.ed(view, 0.0f);
                C786410Ut5.Jc(view, 0.0f);
                LJIIIZ(viewHolder);
                ListProtector.remove(this.LLJI, size);
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
        for (int size2 = this.LLJILLL.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) ListProtector.get(this.LLJILLL, size2);
            LJJIJ(viewHolder, arrayList);
            if (arrayList.isEmpty()) {
                ListProtector.remove(this.LLJILLL, size2);
            }
        }
        for (int size3 = this.LLJILJILJ.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) ListProtector.get(this.LLJILJILJ, size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C421060GfA) ListProtector.get(arrayList2, size4)).LIZ == viewHolder) {
                    C786410Ut5.ed(view, 0.0f);
                    C786410Ut5.Jc(view, 0.0f);
                    LJIIIZ(viewHolder);
                    ListProtector.remove(arrayList2, size4);
                    if (arrayList2.isEmpty()) {
                        ListProtector.remove(this.LLJILJILJ, size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.LLJILJIL.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) ListProtector.get(this.LLJILJIL, size5);
            if (arrayList3.remove(viewHolder)) {
                C786410Ut5.T4(view, 1.0f);
                LJJIIJ(viewHolder);
                if (arrayList3.isEmpty()) {
                    ListProtector.remove(this.LLJILJIL, size5);
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
        int i;
        LJJIJIIJIL(viewHolder);
        C786410Ut5.T4(viewHolder.itemView, 0.34f);
        RecyclerView.LayoutManager layoutManager = this.LLJJIJIIJIL.getLayoutManager();
        if (layoutManager instanceof RecSwipeGalleryLayoutManager) {
            i = ((RecSwipeGalleryLayoutManager) layoutManager).LLILZIL;
        } else {
            i = ((GalleryLayoutManager) layoutManager).LLILZ;
        }
        if (viewHolder.getAdapterPosition() > i) {
            C786410Ut5.Jc(viewHolder.itemView, this.LLJJIJIIJIL.getWidth());
        } else {
            C786410Ut5.Jc(viewHolder.itemView, -this.LLJJIJIIJIL.getWidth());
        }
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
        if (LLJJIJIL == null) {
            LLJJIJIL = new ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(LLJJIJIL);
        LJIIJJI(viewHolder);
    }

    @Override // X.AbstractC21673719rz
    public final boolean LJIIIIZZ(RecyclerView.ViewHolder viewHolder, List<Object> list) {
        if (list.isEmpty() && !LJII(viewHolder)) {
            return false;
        }
        return true;
    }

    public final void LJJIJ(RecyclerView.ViewHolder viewHolder, List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                C421790GgL c421790GgL = (C421790GgL) ListProtector.get(list, size);
                if (LJJIJIIJI(c421790GgL, viewHolder) && c421790GgL.LIZ == null && c421790GgL.LIZIZ == null) {
                    list.remove(c421790GgL);
                }
            } else {
                return;
            }
        }
    }

    public final boolean LJJIJIIJI(C421790GgL c421790GgL, RecyclerView.ViewHolder viewHolder) {
        if (c421790GgL.LIZIZ == viewHolder) {
            c421790GgL.LIZIZ = null;
        } else if (c421790GgL.LIZ == viewHolder) {
            c421790GgL.LIZ = null;
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
        int i5 = i - i3;
        C786410Ut5.Jc(viewHolder.itemView, i5);
        C786410Ut5.T4(viewHolder.itemView, 0.34f);
        C786410Ut5.Ob(viewHolder.itemView, 0.9f);
        C786410Ut5.pc(viewHolder.itemView, 0.9f);
        View view = viewHolder.itemView;
        float fLIZJ = 12.0f;
        if (view.getContext() != null) {
            fLIZJ = C12ES.LIZJ(12.0f, viewHolder.itemView.getContext());
        }
        C786410Ut5.ed(view, fLIZJ);
        if (Math.abs(i5) >= viewHolder.itemView.getWidth() / 2) {
            this.LLJI.add(new C421060GfA(viewHolder, i, i2, i3, i4));
            return true;
        }
        if (C296570Bjr.LIZIZ()) {
            C786410Ut5.Jc(viewHolder.itemView, 0.0f);
            C786410Ut5.T4(viewHolder.itemView, 1.0f);
            C786410Ut5.ed(viewHolder.itemView, 0.0f);
        }
        LJIIIZ(viewHolder);
        return true;
    }

    @Override // X.AbstractC21674919sB
    public final boolean LJJIFFI(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        if (viewHolder == viewHolder2) {
            LJJII(viewHolder, i, i2, i3, i4);
            return true;
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
        this.LLJIJIL.add(new C421790GgL(viewHolder, viewHolder2, i, i2, i3, i4));
        return true;
    }
}

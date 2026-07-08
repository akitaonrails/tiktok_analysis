package X;

import Y.ACListenerS152S0100000_17;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS698S0100000_17;

/* JADX INFO: renamed from: X.0f7h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1115070f7h extends PagerAdapter {
    public final List<AbstractC1115080f7i> LLILLJJLI;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLILLJJLI.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1115070f7h(List<? extends AbstractC1115080f7i> list) {
        this.LLILLJJLI = list;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        AbstractC1115080f7i abstractC1115080f7i = (AbstractC1115080f7i) ListProtector.get(this.LLILLJJLI, i);
        View view = null;
        if (abstractC1115080f7i.LIZLLL == null) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.h3_, viewGroup, false);
            abstractC1115080f7i.LIZLLL = viewTd;
            if (abstractC1115080f7i.LJIIJJI && abstractC1115080f7i.LIZIZ == EnumC584890Mwp.COMMENT) {
                if (viewTd == null) {
                    viewTd = null;
                }
                LiveIconView liveIconView = (LiveIconView) viewTd.findViewById(R.id.ks3);
                abstractC1115080f7i.LJI = liveIconView;
                if (liveIconView != null) {
                    C0GS9 c0gs9 = new C0GS9();
                    c0gs9.LJFF = C20736316Cj.LIZIZ(R.attr.c63, viewGroup.getContext());
                    c0gs9.LJ = C497740JfY.LIZIZ(6);
                    c0gs9.LIZIZ = C497740JfY.LIZIZ(8);
                    c0gs9.LIZJ = C20736316Cj.LIZIZ(R.attr.ev1, viewGroup.getContext());
                    c0gs9.LIZLLL = C497740JfY.LIZIZ(2);
                    liveIconView.setIconBackground(c0gs9);
                }
                View view2 = abstractC1115080f7i.LIZLLL;
                if (view2 == null) {
                    view2 = null;
                }
                View viewFindViewById = view2.findViewById(R.id.d7n);
                abstractC1115080f7i.LJII = viewFindViewById;
                C500260Jjc.LLFFF(viewFindViewById);
                View view3 = abstractC1115080f7i.LIZLLL;
                if (view3 == null) {
                    view3 = null;
                }
                C500260Jjc.LJIILIIL(view3.findViewById(R.id.ks4));
                View view4 = abstractC1115080f7i.LIZLLL;
                if (view4 == null) {
                    view4 = null;
                }
                abstractC1115080f7i.LJIIIIZZ = (C16FS) view4.findViewById(R.id.up_);
                View view5 = abstractC1115080f7i.LIZLLL;
                if (view5 == null) {
                    view5 = null;
                }
                View viewFindViewById2 = view5.findViewById(R.id.upb);
                if (viewFindViewById2 != null) {
                    C0GS9 c0gs92 = new C0GS9();
                    c0gs92.LJFF = C20736316Cj.LIZIZ(R.attr.c63, viewGroup.getContext());
                    c0gs92.LJ = C497740JfY.LIZIZ(6);
                    c0gs92.LIZIZ = C497740JfY.LIZIZ(8);
                    c0gs92.LIZJ = C20736316Cj.LIZIZ(R.attr.ev1, viewGroup.getContext());
                    c0gs92.LIZLLL = C497740JfY.LIZIZ(2);
                    viewFindViewById2.setBackground(c0gs92);
                    C500260Jjc.LLFFF(viewFindViewById2);
                    C786410Ut5.I7(new AbS698S0100000_17(abstractC1115080f7i, 5, 42), viewFindViewById2);
                }
            } else {
                if (viewTd == null) {
                    viewTd = null;
                }
                abstractC1115080f7i.LJI = (LiveIconView) viewTd.findViewById(R.id.pkf);
                View view6 = abstractC1115080f7i.LIZLLL;
                if (view6 == null) {
                    view6 = null;
                }
                View viewFindViewById3 = view6.findViewById(R.id.ks4);
                abstractC1115080f7i.LJII = viewFindViewById3;
                C500260Jjc.LLFFF(viewFindViewById3);
                View view7 = abstractC1115080f7i.LIZLLL;
                if (view7 == null) {
                    view7 = null;
                }
                C500260Jjc.LJIILIIL(view7.findViewById(R.id.d7n));
            }
            LiveIconView liveIconView2 = abstractC1115080f7i.LJI;
            if (liveIconView2 != null) {
                C786410Ut5.g8(liveIconView2, new ACListenerS152S0100000_17(abstractC1115080f7i, 93));
            }
            View view8 = abstractC1115080f7i.LIZLLL;
            if (view8 == null) {
                view8 = null;
            }
            ((ViewGroup) view8.findViewById(R.id.ks2)).addView(abstractC1115080f7i.LIZIZ(), -1, -1);
        }
        View view9 = abstractC1115080f7i.LIZLLL;
        if (view9 != null) {
            view = view9;
        }
        viewGroup.addView(view, -1, -1);
        return view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        return Intrinsics.LJFF(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        View view;
        if ((obj instanceof View) && (view = (View) obj) != null) {
            C786410Ut5.LJJJLZIJ(view, viewGroup);
        }
    }
}

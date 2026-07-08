package X;

import Y.AObserverS231S0100000_29;
import Y.ATListenerS461S0100000_29;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.VideoLayoutManager;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;

/* JADX INFO: renamed from: X.12W9, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12W9 {
    public final Context LIZ;
    public final LifecycleOwner LIZIZ;
    public final VideoEditViewModel LIZJ;
    public final CutMultiVideoViewModel LIZLLL;
    public long LJ;
    public int LJFF = 1;
    public ValueAnimator LJI;
    public C12W6 LJII;
    public RecyclerView LJIIIIZZ;
    public View LJIIIZ;

    public C12W9(Context context, LifecycleOwner lifecycleOwner, VideoEditViewModel videoEditViewModel, CutMultiVideoViewModel cutMultiVideoViewModel) {
        this.LIZ = context;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = videoEditViewModel;
        this.LIZLLL = cutMultiVideoViewModel;
        videoEditViewModel.LLILLJJLI.observe(this.LIZIZ, new AObserverS231S0100000_29(this, 228));
        cutMultiVideoViewModel.LL.observe(this.LIZIZ, new AObserverS231S0100000_29(this, 229));
    }

    public final void LIZ(RecyclerView recyclerView, View view, C12WE c12we, InterfaceC19767112Vp interfaceC19767112Vp) {
        C12W6 c12w6;
        C12WC c12wc;
        this.LJIIIIZZ = recyclerView;
        this.LJIIIZ = view;
        if (c12we.LIZ) {
            VideoEditViewModel videoEditViewModel = this.LIZJ;
            C12W5 c12w5 = new C12W5(videoEditViewModel, this.LIZLLL, videoEditViewModel.DQ2());
            c12w5.LLJI = c12we.LIZJ;
            c12w5.notifyDataSetChanged();
            c12w6 = c12w5;
        } else {
            VideoEditViewModel videoEditViewModel2 = this.LIZJ;
            c12w6 = new C12W6(videoEditViewModel2, this.LIZLLL, videoEditViewModel2.DQ2());
        }
        this.LJII = c12w6;
        c12w6.LLILLL = interfaceC19767112Vp;
        c12w6.LLIZLLLIL = c12we.LIZIZ;
        C12W6 c12w62 = null;
        if (c12we.LIZ) {
            final C12W6 c12w63 = this.LJII;
            if (c12w63 == null) {
                c12w63 = null;
            }
            c12wc = new C12WC(c12w63) { // from class: X.12WB
                @Override // X.C12WC, X.AbstractC21688119uJ
                public final int LJFF(RecyclerView recyclerView2, RecyclerView.ViewHolder viewHolder) {
                    if ((viewHolder instanceof C420990Gf3) || (viewHolder instanceof C995270c0T)) {
                        return 0;
                    }
                    return super.LJFF(recyclerView2, viewHolder);
                }

                @Override // X.C12WC, X.AbstractC21688119uJ
                public final boolean LJIIL(RecyclerView recyclerView2, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                    if ((viewHolder2 instanceof C420990Gf3) || (viewHolder2 instanceof C995270c0T)) {
                        return false;
                    }
                    super.LJIIL(recyclerView2, viewHolder, viewHolder2);
                    return true;
                }
            };
        } else {
            C12W6 c12w64 = this.LJII;
            if (c12w64 == null) {
                c12w64 = null;
            }
            c12wc = new C12WC(c12w64);
        }
        C21688219uK c21688219uK = new C21688219uK(c12wc);
        RecyclerView recyclerView2 = this.LJIIIIZZ;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        c21688219uK.LJ(recyclerView2);
        RecyclerView recyclerView3 = this.LJIIIIZZ;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        recyclerView3.setLayoutManager(new VideoLayoutManager(this.LIZ));
        RecyclerView recyclerView4 = this.LJIIIIZZ;
        if (recyclerView4 == null) {
            recyclerView4 = null;
        }
        C12W6 c12w65 = this.LJII;
        if (c12w65 == null) {
            c12w65 = null;
        }
        recyclerView4.setAdapter(c12w65);
        RecyclerView recyclerView5 = this.LJIIIIZZ;
        if (recyclerView5 == null) {
            recyclerView5 = null;
        }
        C423520Gj8 c423520Gj8 = new C423520Gj8();
        c423520Gj8.LLILZ = 300L;
        c423520Gj8.LLILZLL = 300L;
        c423520Gj8.LLILZIL = 300L;
        c423520Gj8.LLILLL = 300L;
        recyclerView5.setItemAnimator(c423520Gj8);
        RecyclerView recyclerView6 = this.LJIIIIZZ;
        if (recyclerView6 == null) {
            recyclerView6 = null;
        }
        C786410Ut5.y3(recyclerView6.getViewTreeObserver(), new C12YR(this, 2));
        RecyclerView recyclerView7 = this.LJIIIIZZ;
        if (recyclerView7 == null) {
            recyclerView7 = null;
        }
        recyclerView7.setOnTouchListener(new ATListenerS461S0100000_29(this, 24));
        C12W6 c12w66 = this.LJII;
        if (c12w66 != null) {
            c12w62 = c12w66;
        }
        c12w62.notifyDataSetChanged();
    }
}

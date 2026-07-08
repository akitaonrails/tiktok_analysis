package Y;

import X.AbstractC21673619ry;
import X.AnonymousClass1214;
import X.C0KW6;
import X.C113E;
import X.C113H;
import X.C121R;
import X.C1233040iBy;
import X.C12UW;
import X.C12UY;
import X.C1324800kZy;
import X.C1390380mHk;
import X.C1450070nq1;
import X.C196871120v;
import X.C196878121c;
import X.C196899121x;
import X.C19726412Fy;
import X.C1C7U;
import X.C2188811AlT;
import X.C785410UrT;
import X.C786410Ut5;
import X.DialogC848920XRy;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;

/* JADX INFO: loaded from: classes30.dex */
public class ARunnableS48S0110000_29 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (((C19726412Fy) this.l0).LIZJ.getParent() == null) {
            return;
        }
        int width = this.z1 ? C19726412Fy.LJIIJJI : ((C19726412Fy) this.l0).LIZJ.getWidth();
        int i = C19726412Fy.LJIIL + width + C19726412Fy.LJIILIIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateRecyclerViewMargin rvOffset = ");
        sbLIZ.append(((C19726412Fy) this.l0).LJIIIIZZ);
        sbLIZ.append(" currentStart = ");
        sbLIZ.append(i);
        sbLIZ.append(" recyclerViewMarinStart = ");
        sbLIZ.append(C19726412Fy.LJIILJJIL);
        C1450070nq1.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C19726412Fy.LJIILJJIL = i;
        C19726412Fy c19726412Fy = (C19726412Fy) this.l0;
        c19726412Fy.LJII = c19726412Fy.LJI - width;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateRecyclerViewMargin rvOffset = ");
        sbLIZ2.append(((C19726412Fy) this.l0).LJIIIIZZ);
        sbLIZ2.append(" fixToSecondLeftPx = ");
        sbLIZ2.append(((C19726412Fy) this.l0).LJII);
        C1450070nq1.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        ViewGroup.LayoutParams layoutParams = ((C19726412Fy) this.l0).LIZLLL.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginStart(C19726412Fy.LJIILJJIL);
            }
        } else {
            marginLayoutParams = null;
        }
        C786410Ut5.p6(((C19726412Fy) this.l0).LIZLLL, marginLayoutParams);
        AbstractC21673619ry adapter = ((C19726412Fy) this.l0).LIZLLL.getAdapter();
        if (adapter != null) {
            adapter.notifyItemChanged(0);
        }
        ((C19726412Fy) this.l0).LIZIZ();
    }

    public final void LIZ$1() {
        LinearLayoutManager linearLayoutManager;
        C1324800kZy c1324800kZy;
        RecyclerView recyclerView = ((C113E) this.l0).LLJJIJIIJIL;
        if (recyclerView == null) {
            recyclerView = null;
        }
        if (recyclerView.getParent() == null) {
            return;
        }
        RecyclerView recyclerView2 = ((C113E) this.l0).LLJJIJIIJIL;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
        if (!(layoutManager instanceof GridLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return;
        }
        C113E c113e = (C113E) this.l0;
        boolean z = this.z1;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return;
        }
        while (true) {
            RecyclerView recyclerView3 = c113e.LLJJIJIIJIL;
            if (recyclerView3 == null) {
                recyclerView3 = null;
            }
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView3.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
            if ((viewHolderFindViewHolderForAdapterPosition instanceof C113H) && (c1324800kZy = ((C113H) viewHolderFindViewHolderForAdapterPosition).LLJ) != null) {
                c1324800kZy.LIZJ(z);
            }
            if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                return;
            } else {
                iFindFirstVisibleItemPosition++;
            }
        }
    }

    public static final void run$0(ARunnableS48S0110000_29 aRunnableS48S0110000_29) {
        boolean zLIZ;
        C1C7U.LIZ("OverlayHeaderSync@e8a.updateRecyclerViewMargin$1");
        try {
            aRunnableS48S0110000_29.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OverlayHeaderSync@e8a.updateRecyclerViewMargin$1");
    }

    public static final void run$1(ARunnableS48S0110000_29 aRunnableS48S0110000_29) {
        C0KW6 c0kw6;
        C196899121x c196899121x = (C196899121x) aRunnableS48S0110000_29.l0;
        boolean z = aRunnableS48S0110000_29.z1;
        c196899121x.getClass();
        C1C7U.LIZ("FTCInfoStickerHelper@ec40.initPinHelper$1$onError$1L");
        C196878121c c196878121c = c196899121x.LIZ.LLLFZ;
        C0KW6 c0kw62 = c196878121c.LJIIIZ;
        if (c0kw62 != null && c0kw62.isShowing() && (c0kw6 = c196878121c.LJIIIZ) != null) {
            c0kw6.dismiss();
            C785410UrT.LIZ(c0kw6);
        }
        c196899121x.LIZ.LJIIJ(true);
        c196899121x.LIZ.LIZIZ();
        c196899121x.LIZ.LLILLL.invalidate();
        if (z) {
            C1233040iBy c1233040iBy = new C1233040iBy(c196899121x.LIZ.LLJILJIL.getContext());
            c1233040iBy.LIZIZ(2131834205);
            c1233040iBy.LIZLLL();
        }
        C1C7U.LIZIZ("FTCInfoStickerHelper@ec40.initPinHelper$1$onError$1L");
    }

    public static final void run$2(ARunnableS48S0110000_29 aRunnableS48S0110000_29) {
        DialogC848920XRy dialogC848920XRy;
        DialogC848920XRy dialogC848920XRy2;
        C121R c121r = (C121R) aRunnableS48S0110000_29.l0;
        boolean z = aRunnableS48S0110000_29.z1;
        c121r.getClass();
        C1C7U.LIZ("InfoStickerHelper@8ef8.initPinHelper$1$onError$1L");
        AnonymousClass1214 anonymousClass1214 = c121r.LIZ.LLLIIL;
        if (anonymousClass1214 != null && (dialogC848920XRy = anonymousClass1214.LJIIJ) != null && dialogC848920XRy.isShowing() && (dialogC848920XRy2 = anonymousClass1214.LJIIJ) != null) {
            dialogC848920XRy2.dismiss();
            C785410UrT.LIZ(dialogC848920XRy2);
        }
        c121r.LIZ.LJIJ(true);
        c121r.LIZ.LIZLLL();
        C196871120v c196871120v = c121r.LIZ.LLILLL;
        if (c196871120v != null) {
            c196871120v.invalidate();
            if (z) {
                View view = c121r.LIZ.LLJILJIL;
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131834205);
                creativeToastBuilder.isTuxToastLegacy(true);
                C1390380mHk.LIZLLL(view, 5006, creativeToastBuilder);
            }
        }
        C1C7U.LIZIZ("InfoStickerHelper@8ef8.initPinHelper$1$onError$1L");
    }

    public static final void run$3(ARunnableS48S0110000_29 aRunnableS48S0110000_29) {
        boolean zLIZ;
        C1C7U.LIZ("EditEffectPageView@b66d.enableGifAnim$1$1");
        try {
            aRunnableS48S0110000_29.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditEffectPageView@b66d.enableGifAnim$1$1");
    }

    public static final void run$4(ARunnableS48S0110000_29 aRunnableS48S0110000_29) {
        C12UW c12uw = (C12UW) aRunnableS48S0110000_29.l0;
        if (aRunnableS48S0110000_29.z1) {
            c12uw.setCurPointerContainerStartX(c12uw.LLJIJIL.getStartX() + C12UY.LIZJ);
        }
        c12uw.LJIL();
        c12uw.LJIJJ();
        c12uw.LJIJI();
    }

    public ARunnableS48S0110000_29(C121R c121r, int i) {
        this.$t = i;
        this.l0 = c121r;
        this.z1 = true;
    }

    public ARunnableS48S0110000_29(C196899121x c196899121x, int i) {
        this.$t = i;
        this.l0 = c196899121x;
        this.z1 = true;
    }

    public ARunnableS48S0110000_29(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}

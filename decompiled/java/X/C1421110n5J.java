package X;

import Y.ARunnableS122S0100000_22;
import Y.AsS49S0100000_22;
import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import irm.AkS90S0100000_22;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0n5J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1421110n5J extends RelativeLayout {
    public View LL;
    public View LLILLJJLI;
    public View LLILLL;
    public C425240Glu LLILZ;
    public View LLILZIL;
    public View LLILZLL;
    public TuxTextView LLIZ;
    public View LLIZLLLIL;
    public TuxTextView LLJ;
    public C1421140n5M LLJI;
    public InterfaceC1421120n5K LLJIJIL;
    public boolean LLJILJIL;
    public final BPEAHandler LLJILJILJ;
    public final Map<Integer, Integer> LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public TuxTextView LLJJIII;
    public final List<Integer> LLJJIJI;
    public final List<String> LLJJIJIIJIL;
    public final ARunnableS122S0100000_22 LLJJIJIL;

    public final void LIZ() {
        this.LLJJI = 0;
        C391040FUw.LIZ.getClass();
        Keva keva = C391040FUw.LIZIZ;
        keva.storeInt("text_pov_loading_tips_index", keva.getInt("text_pov_loading_tips_index", 0) + 1);
        this.LLJILJILJ.removeCallbacks(this.LLJJIJIL);
    }

    public final boolean getSelectState() {
        C1421140n5M c1421140n5M = this.LLJI;
        return (c1421140n5M == null || c1421140n5M.LL == -1) ? false : true;
    }

    public final Map<Integer, Integer> getItemColumnMap() {
        return this.LLJILLL;
    }

    public final int getLoadingCharIndex() {
        return this.LLJJI;
    }

    public final int getLoadingResIndex() {
        return this.LLJJ;
    }

    public final InterfaceC1421120n5K getPovPanelClickListener() {
        return this.LLJIJIL;
    }

    private final void setLoadMoreEnable(boolean z) {
        this.LLJILJIL = z;
        C1421570n63 c1421570n63 = C1421570n63.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("canLoadMore:");
        sbLIZ.append(z);
        C201955140j.LIZJ(c1421570n63, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void setData(List<C1421170n5P> list) {
        C1421140n5M c1421140n5M = this.LLJI;
        if (c1421140n5M != null) {
            c1421140n5M.LLILLJJLI = list;
            c1421140n5M.notifyDataSetChanged();
        }
    }

    public final void setLoadingCharIndex(int i) {
        this.LLJJI = i;
    }

    public final void setLoadingResIndex(int i) {
        this.LLJJ = i;
    }

    public final void setPovPanelClickListener(InterfaceC1421120n5K interfaceC1421120n5K) {
        this.LLJIJIL = interfaceC1421120n5K;
    }

    public C1421110n5J(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJILJIL = true;
        this.LLJILJILJ = new BPEAHandler(Looper.getMainLooper());
        this.LLJILLL = new LinkedHashMap();
        this.LLJJIJI = C1697810uHb.LJIIJJI(2131829765, 2131829767, 2131829766, 2131829764);
        this.LLJJIJIIJIL = C1697810uHb.LJIIJJI(e3.d, "..", "...");
        this.LLJJIJIL = new ARunnableS122S0100000_22(this, 75);
        setBackgroundColor(0);
        View viewSd = C786410Ut5.Sd(R.layout.eol, C786410Ut5.ne(context), this);
        this.LL = viewSd;
        if (viewSd != null) {
            C786410Ut5.I7(new AkS90S0100000_22(this, 12), viewSd);
        }
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.rmw);
        this.LLJJIII = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.setText("Point of View");
        }
        TuxTextView tuxTextView2 = this.LLJJIII;
        if (tuxTextView2 != null) {
            tuxTextView2.setTypeface(C1697580uHE.LIZIZ(0.0f, OppoPermissionPopupMaskDelayExp.DEFAULT, 0.0f, 100.0f, Float.valueOf(17.0f), 0.0f, 0, null, 224));
        }
        findViewById(R.id.evm);
        C425240Glu c425240Glu = (C425240Glu) findViewById(R.id.rmp);
        this.LLILZ = c425240Glu;
        if (c425240Glu != null) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
            staggeredGridLayoutManager.LJJIL(0);
            c425240Glu.setLayoutManager(staggeredGridLayoutManager);
        }
        this.LLILZIL = findViewById(R.id.hc7);
        this.LLILZLL = findViewById(R.id.teh);
        this.LLIZ = (TuxTextView) findViewById(R.id.rmh);
        View view = this.LLILZLL;
        if (view != null) {
            C786410Ut5.I7(new AkS90S0100000_22(this, 13), view);
        }
        this.LLIZLLLIL = findViewById(R.id.nlo);
        this.LLJ = (TuxTextView) findViewById(R.id.nnn);
        View viewFindViewById = findViewById(R.id.lpx);
        this.LLILLJJLI = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AkS90S0100000_22(this, 14), viewFindViewById);
        }
        View viewFindViewById2 = findViewById(R.id.lf3);
        this.LLILLL = viewFindViewById2;
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new AkS90S0100000_22(this, 15), viewFindViewById2);
        }
        C425240Glu c425240Glu2 = this.LLILZ;
        if (c425240Glu2 != null) {
            final int iLIZ = C354870Dvh.LIZ(2);
            final int iLIZ2 = C354870Dvh.LIZ(12);
            c425240Glu2.addItemDecoration(new C0DXR(iLIZ, iLIZ2) { // from class: X.0DXn
                public final int LLILLJJLI;
                public final int LLILLL;
                public final int LL = 2;
                public final boolean LLILZ = true;

                {
                    this.LLILLJJLI = iLIZ;
                    this.LLILLL = iLIZ2;
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
                    int i = this.LL;
                    int i2 = childAdapterPosition % i;
                    if (this.LLILZ) {
                        int i3 = this.LLILLL;
                        rect.left = i3 - ((i2 * i3) / i);
                        rect.right = ((i2 + 1) * i3) / i;
                        if (childAdapterPosition < i) {
                            rect.top = this.LLILLJJLI;
                        }
                        rect.bottom = this.LLILLJJLI;
                        return;
                    }
                    int i4 = this.LLILLL;
                    rect.left = (i2 * i4) / i;
                    rect.right = i4 - (((i2 + 1) * i4) / i);
                    if (childAdapterPosition < i) {
                        return;
                    }
                    rect.top = this.LLILLJJLI;
                }
            });
        }
        C1421140n5M c1421140n5M = new C1421140n5M(this);
        this.LLJI = c1421140n5M;
        C425240Glu c425240Glu3 = this.LLILZ;
        if (c425240Glu3 != null) {
            c425240Glu3.setAdapter(c1421140n5M);
        }
        C425240Glu c425240Glu4 = this.LLILZ;
        if (c425240Glu4 != null) {
            c425240Glu4.addOnScrollListener(new AsS49S0100000_22(this, 6));
        }
    }

    public final void LIZIZ(List<C1421170n5P> list, boolean z, boolean z2) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorTranslationY;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator interpolator;
        LIZ();
        View view = this.LLILZIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LLIZLLLIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        C425240Glu c425240Glu = this.LLILZ;
        if (c425240Glu != null) {
            C786410Ut5.f1(c425240Glu, 0);
        }
        setLoadMoreEnable(z);
        setData(list);
        if (z2) {
            C425240Glu c425240Glu2 = this.LLILZ;
            if (c425240Glu2 != null) {
                float fLIZIZ = C354870Dvh.LIZIZ() * 355.0f;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c425240Glu2);
                c425240Glu2.setTranslationY(fLIZIZ);
            }
            C425240Glu c425240Glu3 = this.LLILZ;
            if (c425240Glu3 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c425240Glu3);
                c425240Glu3.setAlpha(0.0f);
            }
            C425240Glu c425240Glu4 = this.LLILZ;
            if (c425240Glu4 != null && (viewPropertyAnimatorAnimate = c425240Glu4.animate()) != null && (viewPropertyAnimatorTranslationY = viewPropertyAnimatorAnimate.translationY(0.0f)) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorTranslationY.alpha(1.0f)) != null && (duration = viewPropertyAnimatorAlpha.setDuration(400L)) != null && (interpolator = duration.setInterpolator(new DecelerateInterpolator())) != null) {
                interpolator.start();
            }
        }
    }

    public final void LIZJ(List<C1421170n5P> list, boolean z, boolean z2) {
        setLoadMoreEnable(z);
        if (z2) {
            C1421140n5M c1421140n5M = this.LLJI;
            if (c1421140n5M != null) {
                boolean z3 = c1421140n5M.LLILLL;
                c1421140n5M.LLILLL = false;
                if (z3) {
                    c1421140n5M.notifyItemRemoved(c1421140n5M.LLILLJJLI.size());
                    return;
                }
                return;
            }
            return;
        }
        C1421140n5M c1421140n5M2 = this.LLJI;
        if (c1421140n5M2 != null) {
            c1421140n5M2.LLILLL = false;
            c1421140n5M2.LLILLJJLI = C13LP.LJLIL(list, c1421140n5M2.LLILLJJLI);
            c1421140n5M2.notifyDataSetChanged();
        }
    }
}

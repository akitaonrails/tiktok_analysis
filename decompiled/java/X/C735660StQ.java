package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.commercialize.utils.video.VideoPlayTaskManager;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0StQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735660StQ implements InterfaceC990580bsu {
    public final Aweme LIZ;
    public final IVideoPlayTaskManager LIZIZ;
    public final Fragment LIZJ;
    public final View LIZLLL;
    public final ViewGroup LJ;
    public View LJFF;
    public boolean LJI;
    public final C735670StR LJII;

    public final View LJJII() {
        ViewParent parent;
        if (!this.LJI) {
            View viewFindViewById = this.LIZLLL.findViewById(R.id.ow0);
            ViewParent parent2 = (viewFindViewById == null || (parent = viewFindViewById.getParent()) == null) ? null : parent.getParent();
            this.LJFF = parent2 instanceof View ? (View) parent2 : null;
            this.LJI = true;
        }
        return this.LJFF;
    }

    @Override // X.InterfaceC1000860c9U
    public final Context getContext() {
        return getFragment().getContext();
    }

    @Override // X.InterfaceC988560bpe
    public final IVideoPlayTaskManager LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC990580bsu
    public final C735670StR LJIILLIIL() {
        return this.LJII;
    }

    @Override // X.InterfaceC990580bsu
    public final ViewGroup LJIJI() {
        return this.LJ;
    }

    @Override // X.InterfaceC998290c5L
    public final ViewModelStoreOwner LLIIIILZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC988550bpd
    public final Aweme getAweme() {
        return this.LIZ;
    }

    @Override // X.InterfaceC998380c5U
    public final Fragment getFragment() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC998380c5U, X.InterfaceC20507615Mk
    public final LifecycleOwner getLifecycleOwner() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1065900dqO
    public final void LJIIIZ(InterfaceC856250XiR interfaceC856250XiR) {
        C1065890dqN.LIZ(this, interfaceC856250XiR);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0StR] */
    public C735660StQ(View view, Fragment fragment, VideoPlayTaskManager videoPlayTaskManager, C0RAE c0rae, Aweme aweme) {
        ViewGroup viewGroup;
        this.LIZ = aweme;
        this.LIZIZ = videoPlayTaskManager;
        this.LIZJ = fragment;
        this.LIZLLL = view;
        View viewLLZZ = c0rae.LLZZ("ad_bottom_area_layout");
        ViewGroup viewGroup2 = null;
        if ((viewLLZZ instanceof ViewGroup) && (viewGroup = (ViewGroup) viewLLZZ) != null) {
            HandlerHook.viewPost(viewGroup, new RunnableC514801zW(viewGroup, 17));
            if (viewGroup.getChildCount() == 0) {
                viewGroup.addView(C786410Ut5.Td(C786410Ut5.ne(view.getContext()), R.layout.l0, viewGroup, false));
            }
            viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.egn);
        }
        this.LJ = viewGroup2;
        this.LJII = new C0T9Q() { // from class: X.0StR
            @Override // X.C0T9Q
            public final int LIZLLL() {
                C01GW<Integer> c01gw = ConstraintSizeVM.LL;
                return C693770RJf.LIZIZ();
            }

            @Override // X.C0T9Q
            public final void LIZIZ(float f) {
                View viewLJJII = this.LIZ.LJJII();
                if (viewLJJII != null) {
                    C786410Ut5.T4(viewLJJII, f);
                }
            }

            @Override // X.C0T9Q
            public final void LIZJ(int i) {
                ViewGroup.LayoutParams layoutParams;
                ViewGroup.MarginLayoutParams marginLayoutParams;
                View viewLJJII = this.LIZ.LJJII();
                ViewGroup.LayoutParams layoutParams2 = null;
                if (viewLJJII != null) {
                    layoutParams = viewLJJII.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.bottomMargin = i;
                }
                View viewLJJII2 = this.LIZ.LJJII();
                if (viewLJJII2 != null) {
                    View viewLJJII3 = this.LIZ.LJJII();
                    if (viewLJJII3 != null) {
                        layoutParams2 = viewLJJII3.getLayoutParams();
                    }
                    C786410Ut5.W5(viewLJJII2, layoutParams2);
                }
            }

            @Override // X.C0T9Q
            public final void LJFF(int i) {
                View viewLJJII = this.LIZ.LJJII();
                if (viewLJJII != null) {
                    C786410Ut5.LJLLLLLL(i, viewLJJII);
                }
            }
        };
    }
}

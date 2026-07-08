package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SAFTikTokFragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.ui.activity.PostModeDetailActivity;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.ui.feed.photos.PostModeFullPageViewModel;
import com.ss.android.ugc.aweme.ui.fragment.PostModeDetailRootFragment;
import com.ss.android.ugc.aweme.viewmodel.PostModeFavoriteViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModePageViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeShareViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeTimeLoggerViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS10S0002000_11;
import kotlin.jvm.internal.AwS26S0010000_11;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0SRL, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SRL {
    public final Fragment LIZ;
    public final C19EG LIZIZ;
    public final Aweme LIZJ;
    public final ViewGroup LIZLLL;
    public ViewGroup LJ;
    public ViewGroup LJFF;
    public WeakReference<Fragment> LJI;
    public final PostModeDetailParams LJII;
    public final PostModePageViewModel LJIIIIZZ;
    public final PostModeFullPageViewModel LJIIIZ;
    public final PostModeTimeLoggerViewModel LJIIJ;
    public final ViewGroup LJIIJJI;
    public final C0SM1 LJIIL;
    public final C0SQW LJIILIIL;
    public final PostModeFavoriteViewModel LJIILJJIL;
    public final PostModeShareViewModel LJIILL;
    public final WeakReference<SAFTikTokFragment> LJIILLIIL;
    public boolean LJIIZILJ;
    public String LJIJ;
    public ViewGroup LJIJI;
    public RecyclerView LJIJJ;
    public final C01GW LJIJJLI;

    public C0SRL() {
        throw null;
    }

    public final void LIZIZ() {
        if (this.LJIIZILJ) {
            SAFTikTokFragment sAFTikTokFragmentLJIILLIIL = LJIILLIIL();
            if (sAFTikTokFragmentLJIILLIIL != null) {
                sAFTikTokFragmentLJIILLIIL.finish();
                return;
            } else {
                this.LIZIZ.finishAfterTransition();
                return;
            }
        }
        SAFTikTokFragment sAFTikTokFragmentLJIILLIIL2 = LJIILLIIL();
        if (sAFTikTokFragmentLJIILLIIL2 != null) {
            sAFTikTokFragmentLJIILLIIL2.finish();
        } else {
            this.LIZIZ.finish();
        }
    }

    public final C0SOM LJFF() {
        if (this.LJIIZILJ) {
            ViewGroup viewGroupLJIIJJI = LJIIJJI();
            if (viewGroupLJIIJJI != null) {
                return (C0SOM) viewGroupLJIIJJI.findViewById(R.id.qex);
            }
            return null;
        }
        ViewGroup viewGroup = this.LJ;
        if (viewGroup != null) {
            return (C0SOM) viewGroup.findViewById(R.id.qex);
        }
        return null;
    }

    public final TuxIconView LJI() {
        if (this.LJIIZILJ) {
            ViewGroup viewGroupLJIIJJI = LJIIJJI();
            if (viewGroupLJIIJJI != null) {
                return (TuxIconView) viewGroupLJIIJJI.findViewById(R.id.rlm);
            }
            return null;
        }
        ViewGroup viewGroup = this.LJ;
        if (viewGroup != null) {
            return (TuxIconView) viewGroup.findViewById(R.id.rlm);
        }
        return null;
    }

    public final ViewGroup LJIIIIZZ() {
        if (this.LJIIZILJ) {
            return this.LJ;
        }
        ViewGroup viewGroup = this.LJ;
        if (viewGroup != null) {
            return (ViewGroup) viewGroup.findViewById(R.id.jio);
        }
        return null;
    }

    public final ViewGroup LJIIIZ() {
        ViewGroup viewGroup = this.LIZLLL;
        if (viewGroup != null) {
            return (ViewGroup) viewGroup.findViewById(R.id.qee);
        }
        return null;
    }

    public final ViewGroup LJIIJJI() {
        ViewGroup viewGroup = this.LIZLLL;
        if (viewGroup != null) {
            return (ViewGroup) viewGroup.findViewById(R.id.rl3);
        }
        return null;
    }

    public final Fragment LJIILL() {
        WeakReference<Fragment> weakReference = this.LJI;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final SAFTikTokFragment LJIILLIIL() {
        WeakReference<SAFTikTokFragment> weakReference = this.LJIILLIIL;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final boolean LJIIZILJ() {
        PostModeDetailParams postModeDetailParams = this.LJII;
        return postModeDetailParams != null && postModeDetailParams.enableAnimDegrade;
    }

    public final boolean LJIJ() {
        return ((Boolean) this.LJIJJLI.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ() {
        /*
            r4 = this;
            androidx.fragment.app.SAFTikTokFragment r1 = r4.LJIILLIIL()
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.ui.fragment.PostModeDetailRootFragment
            r3 = 0
            if (r0 == 0) goto L2d
            if (r1 == 0) goto L2d
            X.1991 r1 = X.C1800490wxD.LIZIZ(r1)
            boolean r0 = r1 instanceof X.AnonymousClass1993
            if (r0 == 0) goto L2b
            X.1993 r1 = (X.AnonymousClass1993) r1
            if (r1 == 0) goto L2b
            X.0SRg r0 = r1.LJJII
            if (r0 == 0) goto L2b
            boolean r1 = r0.LIZ
            r0 = 1
            if (r1 != r0) goto L2b
        L20:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
        L24:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            return r0
        L2b:
            r0 = 0
            goto L20
        L2d:
            X.19EG r1 = r4.LIZIZ
            boolean r0 = r1 instanceof com.bytedance.ies.foundation.activity.BaseActivity
            if (r0 == 0) goto L24
            com.bytedance.ies.foundation.activity.BaseActivity r1 = (com.bytedance.ies.foundation.activity.BaseActivity) r1
            if (r1 == 0) goto L24
            com.bytedance.ies.foundation.activity.BaseActivityViewModel r0 = r1.getViewModel()
            if (r0 == 0) goto L24
            X.17q5 r0 = r0.vQ2()
            if (r0 == 0) goto L24
            java.util.List r0 = r0.LIZ()
            java.util.Iterator r2 = r0.iterator()
        L4b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L69
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C721340SRg
            if (r0 == 0) goto L4b
        L59:
            boolean r0 = r1 instanceof X.C721340SRg
            if (r0 != 0) goto L5e
            r1 = r3
        L5e:
            X.0SRg r1 = (X.C721340SRg) r1
            if (r1 == 0) goto L24
            boolean r0 = r1.LIZ
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            goto L24
        L69:
            r1 = r3
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SRL.LIZJ():boolean");
    }

    public final Context LIZLLL() {
        SAFFragmentRootScene sAFFragmentRootSceneIb;
        Context sceneContext;
        SAFTikTokFragment sAFTikTokFragmentLJIILLIIL = LJIILLIIL();
        return (sAFTikTokFragmentLJIILLIIL == null || (sAFFragmentRootSceneIb = sAFTikTokFragmentLJIILLIIL.ib()) == null || (sceneContext = sAFFragmentRootSceneIb.getSceneContext()) == null) ? this.LIZIZ : sceneContext;
    }

    public final TuxIconView LJ() {
        ViewGroup viewGroupLJIIIZ = LJIIIZ();
        if (viewGroupLJIIIZ != null) {
            return (TuxIconView) viewGroupLJIIIZ.findViewById(R.id.rln);
        }
        return null;
    }

    public final int LJII() {
        SAFTikTokFragment sAFTikTokFragmentLJIILLIIL = LJIILLIIL();
        return sAFTikTokFragmentLJIILLIIL != null ? sAFTikTokFragmentLJIILLIIL.hashCode() : this.LIZIZ.hashCode();
    }

    public final C415520GRa LJIIJ() {
        ViewGroup viewGroupLJIIJJI = LJIIJJI();
        if (viewGroupLJIIJJI != null) {
            return (C415520GRa) viewGroupLJIIJJI.findViewById(R.id.qew);
        }
        return null;
    }

    public final Lifecycle LJIIL() {
        Lifecycle lifecycle;
        SAFTikTokFragment sAFTikTokFragmentLJIILLIIL = LJIILLIIL();
        return (sAFTikTokFragmentLJIILLIIL == null || (lifecycle = sAFTikTokFragmentLJIILLIIL.getLifecycle()) == null) ? this.LIZIZ.getLifecycle() : lifecycle;
    }

    public final LifecycleOwner LJIILIIL() {
        SAFTikTokFragment sAFTikTokFragmentLJIILLIIL = LJIILLIIL();
        return sAFTikTokFragmentLJIILLIIL == null ? this.LIZIZ : sAFTikTokFragmentLJIILLIIL;
    }

    public final LifecycleCoroutineScope LJIILJJIL() {
        LifecycleCoroutineScope lifecycleScope;
        SAFTikTokFragment sAFTikTokFragmentLJIILLIIL = LJIILLIIL();
        return (sAFTikTokFragmentLJIILLIIL == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(sAFTikTokFragmentLJIILLIIL)) == null) ? LifecycleOwnerKt.getLifecycleScope(this.LIZIZ) : lifecycleScope;
    }

    public final void LJIJJLI() {
        BaseActivity baseActivity;
        SAFTikTokFragment sAFTikTokFragmentLJIILLIIL = LJIILLIIL();
        if ((sAFTikTokFragmentLJIILLIIL instanceof PostModeDetailRootFragment) && sAFTikTokFragmentLJIILLIIL != null) {
            sAFTikTokFragmentLJIILLIIL.aS(new AwS26S0010000_11(7));
            return;
        }
        C19EG c19eg = this.LIZIZ;
        if (!(c19eg instanceof BaseActivity) || (baseActivity = (BaseActivity) c19eg) == null) {
            return;
        }
        baseActivity.activityConfiguration(AFwS243S0000000_11.get$arr$(618));
    }

    public final <T extends View> T LIZ(int i) {
        View view;
        T t;
        SAFTikTokFragment sAFTikTokFragmentLJIILLIIL = LJIILLIIL();
        if (sAFTikTokFragmentLJIILLIIL == null || (view = sAFTikTokFragmentLJIILLIIL.getView()) == null || (t = (T) view.findViewById(i)) == null) {
            return (T) this.LIZIZ.findViewById(i);
        }
        return t;
    }

    public final void LJIJI(String str) {
        PostModeDetailActivity postModeDetailActivity;
        PostModeDetailRootFragment postModeDetailRootFragment;
        SAFTikTokFragment sAFTikTokFragmentLJIILLIIL = LJIILLIIL();
        if ((sAFTikTokFragmentLJIILLIIL instanceof PostModeDetailRootFragment) && (postModeDetailRootFragment = (PostModeDetailRootFragment) sAFTikTokFragmentLJIILLIIL) != null) {
            C0SRW.LIZLLL(postModeDetailRootFragment, this.LIZJ, this.LJII, str, this.LJIJ);
            return;
        }
        C19EG c19eg = this.LIZIZ;
        if (!(c19eg instanceof PostModeDetailActivity) || (postModeDetailActivity = (PostModeDetailActivity) c19eg) == null) {
            return;
        }
        C0SRW.LIZLLL(postModeDetailActivity, this.LIZJ, this.LJII, str, this.LJIJ);
    }

    public final void LJIJJ(int i, int i2) {
        SAFTikTokFragment sAFTikTokFragmentLJIILLIIL = LJIILLIIL();
        if ((sAFTikTokFragmentLJIILLIIL instanceof PostModeDetailRootFragment) && sAFTikTokFragmentLJIILLIIL != null) {
            sAFTikTokFragmentLJIILLIIL.aS(new AwS10S0002000_11(i, i2, 1));
        } else {
            C786410Ut5.ce(this.LIZIZ, i, i2);
        }
    }

    public C0SRL(Fragment fragment, C19EG c19eg, PostModeDetailRootFragment postModeDetailRootFragment, Aweme aweme, ViewGroup viewGroup, PostModeDetailParams postModeDetailParams, PostModePageViewModel postModePageViewModel, PostModeFullPageViewModel postModeFullPageViewModel, PostModeTimeLoggerViewModel postModeTimeLoggerViewModel, ViewGroup viewGroup2, PhotoSharedViewModel photoSharedViewModel, PostModeFavoriteViewModel postModeFavoriteViewModel, PostModeShareViewModel postModeShareViewModel) {
        C0SQW c0sqw = new C0SQW();
        this.LIZ = fragment;
        this.LIZIZ = c19eg;
        this.LIZJ = aweme;
        this.LIZLLL = viewGroup;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = null;
        this.LJII = postModeDetailParams;
        this.LJIIIIZZ = postModePageViewModel;
        this.LJIIIZ = postModeFullPageViewModel;
        this.LJIIJ = postModeTimeLoggerViewModel;
        this.LJIIJJI = viewGroup2;
        this.LJIIL = photoSharedViewModel;
        this.LJIILIIL = c0sqw;
        this.LJIILJJIL = postModeFavoriteViewModel;
        this.LJIILL = postModeShareViewModel;
        this.LJIILLIIL = postModeDetailRootFragment != null ? new WeakReference<>(postModeDetailRootFragment) : null;
        this.LJIJ = "graphic_full_page";
        this.LJIJJLI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1128));
    }
}

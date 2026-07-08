package Y;

import X.AbstractC21673719rz;
import X.C098200Yq;
import X.C1043010dFT;
import X.C1174080ges;
import X.C1200480hLS;
import X.C1208660hYe;
import X.C1389890mGx;
import X.C1558360qeg;
import X.C1558520qew;
import X.C189200o6;
import X.C1C7U;
import X.C724240Sb0;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.hybrid.spark.raven.component.builtin.status.ContainerEventDispatcher$RefreshActionCallBackAbility;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.favorites.business.music.raven.RavenMusicCollectionFragment;
import com.ss.android.ugc.aweme.poi.albummix.assem.PoiAlbumMixPageListAssem;
import com.ss.android.ugc.aweme.poi.detail.container.slash.PoiDetailSlashFragment;
import com.ss.android.ugc.aweme.slash.component.navigation.QuickNavigationContext;
import kotlin.Unit;
import kotlin.jvm.internal.AwS102S1000000_18;
import kotlin.jvm.internal.AwS151S1100000_2;
import kotlin.jvm.internal.AwS167S1100000_18;

/* JADX INFO: loaded from: classes19.dex */
public class ARunnableS23S1100000_18 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

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
        Fragment fragmentLJI;
        ContainerEventDispatcher$RefreshActionCallBackAbility containerEventDispatcher$RefreshActionCallBackAbility;
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenFragment", new AwS151S1100000_2((RavenFragment) this.l1, this.s0, 3));
        RavenFragment ravenFragment = (RavenFragment) this.l1;
        ravenFragment.getClass();
        if (!(ravenFragment instanceof RavenMusicCollectionFragment) && (fragmentLJI = C724240Sb0.LJI((RavenFragment) this.l1)) != null && (containerEventDispatcher$RefreshActionCallBackAbility = (ContainerEventDispatcher$RefreshActionCallBackAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), ContainerEventDispatcher$RefreshActionCallBackAbility.class, null)) != null) {
            containerEventDispatcher$RefreshActionCallBackAbility.t0();
        }
        ((RavenFragment) this.l1).IT(this.s0);
        ((RavenFragment) this.l1).ZS();
    }

    public final void LIZ$1() {
        C1174080ges c1174080gesUJ0;
        PoiDetailSlashFragment poiDetailSlashFragment = (PoiDetailSlashFragment) this.l1;
        String str = this.s0;
        try {
            QuickNavigationContext quickNavigationContext = (QuickNavigationContext) C1558520qew.LIZ(C1558360qeg.LJFF(poiDetailSlashFragment, null), QuickNavigationContext.class, null);
            poiDetailSlashFragment.K40(str, (quickNavigationContext == null || (c1174080gesUJ0 = quickNavigationContext.UJ0(str)) == null || !c1174080gesUJ0.LIZIZ) ? 0 : c1174080gesUJ0.LIZ);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LIZ$2() {
        int iOp;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        RecyclerView.LayoutManager layoutManager;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = ((PoiAlbumMixPageListAssem) this.l1).LLJLLL;
        if (viewOnAttachStateChangeListenerC20604515jv2 == null || viewOnAttachStateChangeListenerC20604515jv2.getParent() == null || (iOp = ((PoiAlbumMixPageListAssem) this.l1).op(this.s0)) < 0 || (viewOnAttachStateChangeListenerC20604515jv = ((PoiAlbumMixPageListAssem) this.l1).LLJLLL) == null || (layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager()) == null) {
            return;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = ((PoiAlbumMixPageListAssem) this.l1).LLJLLL;
        C1208660hYe c1208660hYe = new C1208660hYe(viewOnAttachStateChangeListenerC20604515jv3 != null ? viewOnAttachStateChangeListenerC20604515jv3.getContext() : null, 2);
        c1208660hYe.LIZ = iOp;
        layoutManager.startSmoothScroll(c1208660hYe);
    }

    public final void LIZ$3() {
        RavenFragment ravenFragment = (RavenFragment) this.l1;
        int i = ravenFragment.LLLIIL;
        if (i <= 0) {
            new C1043010dFT();
            C1043010dFT.LIZIZ("RavenFragment", new AwS102S1000000_18(this.s0, 25));
            return;
        }
        ravenFragment.LLLIIL = i - 1;
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenFragment", new AwS167S1100000_18(ravenFragment, this.s0, 25));
        RavenFragment ravenFragment2 = (RavenFragment) this.l1;
        if (ravenFragment2.LLLIIL == 0) {
            ravenFragment2.sS(this.s0);
        }
    }

    public static final void run$0(ARunnableS23S1100000_18 aRunnableS23S1100000_18) {
        boolean zLIZ;
        C1C7U.LIZ("RavenFragment@d0e1.maybeRestoreBodyVisibility$restoreUi$1");
        try {
            aRunnableS23S1100000_18.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RavenFragment@d0e1.maybeRestoreBodyVisibility$restoreUi$1");
    }

    public static final void run$1(ARunnableS23S1100000_18 aRunnableS23S1100000_18) {
        boolean zLIZ;
        C1C7U.LIZ("PoiDetailSlashFragment@9df6.handleScrollToTargetComponent$1");
        try {
            aRunnableS23S1100000_18.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiDetailSlashFragment@9df6.handleScrollToTargetComponent$1");
    }

    public static final void run$2(ARunnableS23S1100000_18 aRunnableS23S1100000_18) {
        boolean zLIZ;
        C1C7U.LIZ("PoiAlbumMixPageListAssem@5f29.scrollToTarget$1");
        try {
            aRunnableS23S1100000_18.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiAlbumMixPageListAssem@5f29.scrollToTarget$1");
    }

    public static final void run$3(ARunnableS23S1100000_18 aRunnableS23S1100000_18) {
        boolean zLIZ;
        C1C7U.LIZ("PoiEditPostPublishExtension@c841.onExtensionEnable$2");
        try {
            View view = ((C1200480hLS) aRunnableS23S1100000_18.l1).LLILZIL;
            if (view == null) {
                view = null;
            }
            C1389890mGx c1389890mGx = new C1389890mGx(view);
            c1389890mGx.LJIIJ(aRunnableS23S1100000_18.s0);
            c1389890mGx.LJIIJJI();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiEditPostPublishExtension@c841.onExtensionEnable$2");
    }

    public static final void run$4(ARunnableS23S1100000_18 aRunnableS23S1100000_18) {
        boolean zLIZ;
        C1C7U.LIZ("RavenFragment@d0e1.endLoadMoreCommitInFlightAfterFlush$1");
        try {
            aRunnableS23S1100000_18.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RavenFragment@d0e1.endLoadMoreCommitInFlightAfterFlush$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS23S1100000_18(Object obj, RavenFragment<Object> ravenFragment, String str) {
        this.$t = str;
        this.l1 = obj;
        this.s0 = ravenFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS23S1100000_18(RavenFragment ravenFragment, RavenFragment<CONTEXT> ravenFragment2, String str, AbstractC21673719rz abstractC21673719rz) {
        this.$t = abstractC21673719rz;
        this.l1 = ravenFragment;
        this.s0 = ravenFragment2;
    }
}

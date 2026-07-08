package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.explore.assem.ExploreDetailReturnTracker$registerOneShotDetailReturn$1;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.0ipF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1257390ipF {
    public static final C1257390ipF LIZ = new C1257390ipF();

    /* JADX WARN: Type inference failed for: r2v1, types: [X.0ipE, X.1BlQ] */
    public static void LIZ(SmartRoute smartRoute, LifecycleOwner lifecycleOwner, final Fragment fragment) {
        IDetailFeedSafService iDetailFeedSafService;
        final AFwS221S0000000_31 aFwS221S0000000_31 = AFwS221S0000000_31.get$arr$(475);
        if (((Number) C1817807Aa.LIZ.getValue()).intValue() == 1 && (iDetailFeedSafService = (IDetailFeedSafService) C583400MuQ.LIZ.getValue()) != null && iDetailFeedSafService.LJ() && ((Number) AnonymousClass0765.LIZ.getValue()).intValue() == 1) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ?? r2 = new InterfaceC2214261BlQ() { // from class: X.0ipE
                public Fragment LIZ;

                @Override // X.InterfaceC2214261BlQ
                public final void LIZIZ(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LIZJ(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LIZLLL(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJFF(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJI(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJII(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIIIIZZ(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIIIZ(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIIJ(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIIJJI(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIIL(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIILIIL(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIILJJIL(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIILL(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIILLIIL(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIJ(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIJI(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIJJ(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIJJLI(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIL(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJJ(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJ(AbstractC1387200mCc abstractC1387200mCc) {
                    if (abstractC1387200mCc.LIZLLL() != null && abstractC1387200mCc.LIZLLL() == this.LIZ) {
                        if (atomicBoolean.compareAndSet(false, true)) {
                            aFwS221S0000000_31.invoke();
                        }
                        SAFExtensionKt.LJJIIJ(this);
                    }
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIIZILJ(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                    Fragment fragmentLIZLLL;
                    if (this.LIZ != null || (fragmentLIZLLL = abstractC1387200mCc.LIZLLL()) == null) {
                        return;
                    }
                    Fragment fragment2 = fragment;
                    if (fragment2 != null && fragmentLIZLLL == fragment2) {
                        return;
                    }
                    this.LIZ = fragmentLIZLLL;
                }
            };
            SAFExtensionKt.LJIJI(r2);
            lifecycleOwner.getLifecycle().addObserver(new ExploreDetailReturnTracker$registerOneShotDetailReturn$1(atomicBoolean, r2));
            smartRoute.open();
            return;
        }
        smartRoute.open(12345, new C1266040j3C(aFwS221S0000000_31, 3));
    }
}

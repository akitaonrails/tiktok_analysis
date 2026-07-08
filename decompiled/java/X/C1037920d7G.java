package X;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.commercialize.service.ICommercializeFeedService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.minis.api.IMinisApiService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0d7G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1037920d7G implements InterfaceC1038230d7l {
    public final Fragment LIZIZ;
    public FragmentManager LIZLLL;
    public InterfaceC1008670cM5 LJ;
    public FrameLayout LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LIZJ = true;
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(337));

    public final IMinisApiService LIZ() {
        return (IMinisApiService) this.LJIIIIZZ.getValue();
    }

    @Override // X.InterfaceC1038230d7l
    public final void l1() {
        Context context;
        IMinisApiService iMinisApiServiceLIZ;
        if (this.LJII) {
            return;
        }
        this.LJII = true;
        if (((Boolean) C260980AKq.LIZ.getValue()).booleanValue() && (iMinisApiServiceLIZ = LIZ()) != null) {
            iMinisApiServiceLIZ.LJIJI(this.LIZIZ);
        }
        IMinisApiService iMinisApiServiceLIZ2 = LIZ();
        if (iMinisApiServiceLIZ2 != null) {
            iMinisApiServiceLIZ2.LJI(this.LIZIZ, true);
        }
        if (this.LJ == null) {
            FrameLayout frameLayout = this.LJFF;
            Activity activityLIZ = (frameLayout == null || (context = frameLayout.getContext()) == null) ? null : C1388190mED.LIZ(context);
            if (!(activityLIZ instanceof InterfaceC655270Pn3)) {
                return;
            }
            ICommercializeFeedService iCommercializeFeedService = (ICommercializeFeedService) PluggableExtentionKt.pluggableSpi$default(ICommercializeFeedService.class, false, false, false, 14, null);
            this.LJ = iCommercializeFeedService != null ? iCommercializeFeedService.LJFF(activityLIZ, this.LIZIZ, new InterfaceC1399350mWD() { // from class: X.0d7H
                @Override // X.InterfaceC1399350mWD
                public final /* synthetic */ boolean Fi() {
                    return false;
                }

                @Override // X.InterfaceC1399350mWD
                public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                    if (i != 4) {
                        return false;
                    }
                    C1037920d7G c1037920d7G = this.LL;
                    if (!c1037920d7G.LJI) {
                        return false;
                    }
                    IMinisApiService iMinisApiServiceLIZ3 = c1037920d7G.LIZ();
                    if (iMinisApiServiceLIZ3 == null || !iMinisApiServiceLIZ3.LJFF(this.LL.LIZIZ)) {
                        this.LL.remove();
                    }
                    return true;
                }
            }) : null;
        }
        InterfaceC1008670cM5 interfaceC1008670cM5 = this.LJ;
        if (interfaceC1008670cM5 != null) {
            interfaceC1008670cM5.enable(true);
        }
    }

    @Override // X.InterfaceC1038230d7l
    public final void remove() {
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Fragment fragmentLIZLLL;
        if (this.LJI) {
            IMinisApiService iMinisApiServiceLIZ = LIZ();
            if (iMinisApiServiceLIZ != null) {
                iMinisApiServiceLIZ.LJI(this.LIZIZ, false);
            }
            IMinisApiService iMinisApiServiceLIZ2 = LIZ();
            if (iMinisApiServiceLIZ2 != null) {
                iMinisApiServiceLIZ2.LJIJJLI(this.LIZIZ);
            }
            if (this.LJI && (abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ()) != null && (fragmentLIZLLL = abstractC1387200mCcLIZIZ.LIZLLL()) != null) {
                TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(fragmentLIZLLL);
                tuxImmersionBarLIZLLL.LIZ(true);
                if (this.LJII) {
                    tuxImmersionBarLIZLLL.LJIIIIZZ(R.attr.bx);
                    tuxImmersionBarLIZLLL.LJ(R.attr.bx);
                } else {
                    tuxImmersionBarLIZLLL.LJIIL();
                    tuxImmersionBarLIZLLL.LJ(R.attr.e1);
                }
                tuxImmersionBarLIZLLL.LIZLLL();
            }
        }
        InterfaceC1008670cM5 interfaceC1008670cM5 = this.LJ;
        if (interfaceC1008670cM5 != null) {
            interfaceC1008670cM5.enable(false);
        }
        FragmentManager fragmentManager = this.LIZLLL;
        if (fragmentManager != null && fragmentManager.LJJLIIIJL().contains(this.LIZIZ)) {
            try {
                C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
                if (((Boolean) C275640ArC.LIZ.getValue()).booleanValue()) {
                    c19ehLJIIJ.LJIJJ(0, R.anim.fy);
                }
                c19ehLJIIJ.LJIIZILJ(this.LIZIZ);
                C189200o6.m2constructorimpl(Integer.valueOf(c19ehLJIIJ.LJIIJ()));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        this.LJI = false;
        this.LJII = false;
        this.LJFF = null;
        this.LIZJ = true;
        this.LJ = null;
    }

    public C1037920d7G(Fragment fragment) {
        this.LIZIZ = fragment;
    }

    @Override // X.InterfaceC1038230d7l
    public final void LIZIZ(String str) {
        remove();
    }

    @Override // X.InterfaceC1038230d7l
    public final boolean LIZJ(FrameLayout frameLayout, FragmentManager fragmentManager) {
        IMinisApiService iMinisApiServiceLIZ;
        if (LIZ() == null) {
            return false;
        }
        this.LJI = true;
        if (!this.LIZJ) {
            return true;
        }
        this.LJFF = frameLayout;
        Integer numValueOf = null;
        if (fragmentManager == null) {
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null) {
                fragmentManager = abstractC1387200mCcLIZIZ.LJ();
            } else {
                fragmentManager = null;
            }
        }
        this.LIZLLL = fragmentManager;
        if (fragmentManager != null) {
            try {
                C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
                if (c19ehLJIIJ != null) {
                    c19ehLJIIJ.LIZIZ(frameLayout.getId(), this.LIZIZ);
                    numValueOf = Integer.valueOf(c19ehLJIIJ.LJIIJ());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        C189200o6.m2constructorimpl(numValueOf);
        if (!((Boolean) C260980AKq.LIZ.getValue()).booleanValue() && (iMinisApiServiceLIZ = LIZ()) != null) {
            iMinisApiServiceLIZ.LJIJI(this.LIZIZ);
        }
        this.LIZJ = false;
        return true;
    }
}

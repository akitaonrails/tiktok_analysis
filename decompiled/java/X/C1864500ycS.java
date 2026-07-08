package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.rank.impl.entrance.widget.RankEntranceManager;
import com.ss.android.ugc.aweme.tako.multipletemplate.TakoTemplateActivity;
import com.ss.android.ugc.aweme.tako.multipletemplate.previewphoto.PreviewPhotoFragment;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ycS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864500ycS extends AbstractC813200VvC {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC813200VvC
    public final void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        switch (this.$t) {
            case 0:
                onFragmentDestroyed$0(this, fragmentManager, fragment);
                break;
            case 1:
                onFragmentDestroyed$1(this, fragmentManager, fragment);
                break;
            default:
                super.onFragmentDestroyed(fragmentManager, fragment);
                break;
        }
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        if (1 - this.$t != 0) {
            super.onFragmentResumed(fragmentManager, fragment);
        } else {
            onFragmentResumed$0(this, fragmentManager, fragment);
        }
    }

    public C1864500ycS(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFragmentDestroyed$0(C1864500ycS c1864500ycS, FragmentManager fragmentManager, Fragment fragment) {
        String simpleName;
        InterfaceC1842780y3Q interfaceC1842780y3Q;
        String simpleName2;
        InterfaceC1842870y3Z interfaceC1842870y3Z;
        String simpleName3;
        InterfaceC1842820y3U interfaceC1842820y3U;
        C20441214yg.LIZIZ("Ranking Entrance Unification", "RankEntranceManager - onFragmentDestroyed");
        super.onFragmentDestroyed(fragmentManager, fragment);
        if (Intrinsics.LJFF(((RankEntranceManager) c1864500ycS.l0).LL, fragment)) {
            C1842440y2s c1842440y2s = ((RankEntranceManager) c1864500ycS.l0).LLIZLLLIL;
            AnonymousClass0956 anonymousClass0956 = c1842440y2s.LJIIIIZZ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            c1842440y2s.LJIIIIZZ = null;
            Iterator<InterfaceC1842770y3P> it2 = ((RankEntranceManager) c1864500ycS.l0).LLILZLL.iterator();
            while (it2.hasNext()) {
                it2.next().onDestroy();
            }
            C1842460y2u c1842460y2u = C1842460y2u.LJ;
            if (c1842460y2u != null) {
                for (EnumC1842500y2y enumC1842500y2y : C13LP.LLIIII(c1842460y2u.LIZJ.keySet())) {
                    Object objRemove = c1842460y2u.LIZJ.remove(enumC1842500y2y);
                    int i = C1842560y34.LIZ[enumC1842500y2y.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Release method not implemented for ");
                                sbLIZ.append(enumC1842500y2y.name());
                                C20441214yg.LJIIL("RankingServiceRegistryImpl", C2188811AlT.LIZIZ(sbLIZ));
                            } else if ((objRemove instanceof InterfaceC1842780y3Q) && (interfaceC1842780y3Q = (InterfaceC1842780y3Q) objRemove) != null) {
                                interfaceC1842780y3Q.release();
                            } else {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("Mock animation service type mismatch: expected MockAnimationService, got ");
                                if (objRemove != null) {
                                    simpleName = objRemove.getClass().getSimpleName();
                                } else {
                                    simpleName = null;
                                }
                                sbLIZ2.append(simpleName);
                                C20441214yg.LJIIL("RankingServiceRegistryImpl", C2188811AlT.LIZIZ(sbLIZ2));
                            }
                        } else if ((objRemove instanceof InterfaceC1842870y3Z) && (interfaceC1842870y3Z = (InterfaceC1842870y3Z) objRemove) != null) {
                            interfaceC1842870y3Z.release();
                        } else {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("Capsule service type mismatch: expected RankingCapsuleService, got ");
                            if (objRemove != null) {
                                simpleName2 = objRemove.getClass().getSimpleName();
                            } else {
                                simpleName2 = null;
                            }
                            sbLIZ3.append(simpleName2);
                            C20441214yg.LJIIL("RankingServiceRegistryImpl", C2188811AlT.LIZIZ(sbLIZ3));
                        }
                    } else if ((objRemove instanceof InterfaceC1842820y3U) && (interfaceC1842820y3U = (InterfaceC1842820y3U) objRemove) != null) {
                        interfaceC1842820y3U.release();
                    } else {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("Downgrade service type mismatch: expected IDowngradeService, got ");
                        if (objRemove != null) {
                            simpleName3 = objRemove.getClass().getSimpleName();
                        } else {
                            simpleName3 = null;
                        }
                        sbLIZ4.append(simpleName3);
                        C20441214yg.LJIIL("RankingServiceRegistryImpl", C2188811AlT.LIZIZ(sbLIZ4));
                    }
                }
                c1842460y2u.LIZJ.clear();
                C20441214yg.LIZIZ("RankingServiceRegistryImpl", "All services released");
                C1842460y2u.LJ = null;
                C20441214yg.LIZIZ("RankingServiceRegistryImpl", "Singleton instance released");
            }
            RankEntranceManager rankEntranceManager = (RankEntranceManager) c1864500ycS.l0;
            rankEntranceManager.LLJILJILJ = null;
            C1078960eBS c1078960eBS = rankEntranceManager.LLJ;
            ((LinkedHashMap) c1078960eBS.LIZIZ).clear();
            CountDownTimerC1811820xFU countDownTimerC1811820xFU = c1078960eBS.LIZJ;
            if (countDownTimerC1811820xFU != null) {
                countDownTimerC1811820xFU.cancel();
            }
            c1078960eBS.LIZJ = null;
            ((RankEntranceManager) c1864500ycS.l0).LJ();
            ((RankEntranceManager) c1864500ycS.l0).getClass();
            C1811840xFW.LIZ = false;
            C1811840xFW.LIZIZ = "";
            C1811840xFW.LIZJ = 0L;
            C1811840xFW.LIZLLL = 0L;
            C1811840xFW.LJ = 0L;
            C1811840xFW.LJFF.clear();
            C1811840xFW.LJI.clear();
            C1811840xFW.LJII = 0L;
            C1811840xFW.LJIIJJI = 0L;
            C1811840xFW.LJIIL = 0;
            C1811840xFW.LJIILIIL = 0;
            C1811840xFW.LJIILJJIL = 0;
            C1811840xFW.LJIILL = 0;
            C1811840xFW.LJIILLIIL = 0;
            C1811840xFW.LJIIZILJ = 0;
            ((LinkedHashMap) C1811840xFW.LJIIIIZZ).clear();
            C1811840xFW.LJIIIZ = 0L;
            C1811840xFW.LJIIJ = 0L;
            AnonymousClass0956 anonymousClass09562 = ((RankEntranceManager) c1864500ycS.l0).LLJJJIL;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
            ((RankEntranceManager) c1864500ycS.l0).LL.requireFragmentManager().LLIILZL(c1864500ycS);
        }
    }

    public static final void onFragmentDestroyed$1(C1864500ycS c1864500ycS, FragmentManager fragmentManager, Fragment fragment) {
        if (fragment instanceof PreviewPhotoFragment) {
            ((TakoTemplateActivity) c1864500ycS.l0).LLLLZI().vQ2(32);
        }
    }

    public static final void onFragmentResumed$0(C1864500ycS c1864500ycS, FragmentManager fragmentManager, Fragment fragment) {
        if (fragment instanceof PreviewPhotoFragment) {
            ((TakoTemplateActivity) c1864500ycS.l0).LLLLZI().vQ2(16);
        }
    }
}

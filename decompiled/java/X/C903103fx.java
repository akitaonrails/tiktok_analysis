package X;

import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.CombinedSkuOrderSubmitActivity;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.MiniOspActivity;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitActivity;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03fx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C903103fx {
    public static final C903103fx LIZ = new C903103fx();
    public static Map<Integer, Integer> LIZIZ;

    public static AbstractActivityC1743740vTg LIZLLL() {
        int i;
        IECommerceHostService iECommerceHostService;
        InterfaceC911603hK rootPageMonitor;
        C928103jz[] c928103jzArrLIZ;
        CombinedSkuOrderSubmitActivity combinedSkuOrderSubmitActivity;
        OrderSubmitActivity orderSubmitActivity;
        MiniOspActivity miniOspActivity;
        try {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                Object service = ServiceManager.get().getService(IApplicationDependencyService.class);
                IECommerceHostService iECommerceHostService2 = (IECommerceHostService) service;
                C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService2 != null ? iECommerceHostService2.getClass().getName() : null, iECommerceHostService2 != null);
                iECommerceHostService = (IECommerceHostService) service;
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (rootPageMonitor == null || (c928103jzArrLIZ = rootPageMonitor.LIZ()) == null) {
            return null;
        }
        for (C928103jz c928103jz : c928103jzArrLIZ) {
            Object obj = c928103jz.LIZLLL;
            if ((obj instanceof MiniOspActivity) && (miniOspActivity = (MiniOspActivity) obj) != null) {
                return miniOspActivity;
            }
            if ((obj instanceof OrderSubmitActivity) && (orderSubmitActivity = (OrderSubmitActivity) obj) != null) {
                return orderSubmitActivity;
            }
            if ((obj instanceof CombinedSkuOrderSubmitActivity) && (combinedSkuOrderSubmitActivity = (CombinedSkuOrderSubmitActivity) obj) != null) {
                return combinedSkuOrderSubmitActivity;
            }
        }
        return null;
    }

    public static CCDCAddCardHalfFragment LIZ(FragmentManager fragmentManager) {
        try {
            for (Fragment fragment : fragmentManager.LJJLIIIJL()) {
                if (Intrinsics.LJFF(fragment.getTag(), "ccdc_add_card_half_fragment")) {
                    if (!(fragment instanceof CCDCAddCardHalfFragment)) {
                        return null;
                    }
                    return (CCDCAddCardHalfFragment) fragment;
                }
                C903103fx c903103fx = LIZ;
                FragmentManager childFragmentManager = fragment.getChildFragmentManager();
                c903103fx.getClass();
                CCDCAddCardHalfFragment cCDCAddCardHalfFragmentLIZ = LIZ(childFragmentManager);
                if (cCDCAddCardHalfFragmentLIZ != null) {
                    return cCDCAddCardHalfFragmentLIZ;
                }
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return null;
    }

    public static TuxSheet LIZIZ(AbstractActivityC1743740vTg abstractActivityC1743740vTg) {
        try {
            for (Fragment fragment : abstractActivityC1743740vTg.getSupportFragmentManager().LJJLIIIJL()) {
                if (Intrinsics.LJFF(fragment.getTag(), "address_edit_fragment")) {
                    if (!(fragment instanceof TuxSheet)) {
                        return null;
                    }
                    return (TuxSheet) fragment;
                }
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return null;
    }

    public static AddressEditFragment LIZJ(TuxSheet tuxSheet) {
        List<Fragment> listLJJLIIIJL;
        try {
            FragmentManager childFragmentManager = tuxSheet.getChildFragmentManager();
            if (childFragmentManager != null && (listLJJLIIIJL = childFragmentManager.LJJLIIIJL()) != null) {
                for (Fragment fragment : listLJJLIIIJL) {
                    if (fragment instanceof AddressEditFragment) {
                        return (AddressEditFragment) fragment;
                    }
                }
                return null;
            }
            return null;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static boolean LJ(C03OX c03ox) {
        Integer num;
        Map<Integer, Integer> map = LIZIZ;
        if (map == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Integer num2 = (Integer) linkedHashMap.get(Integer.valueOf(C03OX.TOTAL.getScene()));
        if (num2 == null || num2.intValue() <= 0 || (num = (Integer) linkedHashMap.get(Integer.valueOf(c03ox.getScene()))) == null || num.intValue() <= 0) {
            return false;
        }
        return true;
    }
}

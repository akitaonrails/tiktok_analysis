package X;

import Y.ARunnableS126S0100000_26;
import Y.ARunnableS35S0300000_2;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommercebase.preload.ECAsyncInflaterV2;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0uNR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1701430uNR {
    public static boolean LIZIZ() {
        IECommerceHostService iECommerceHostService;
        IECommerceHostService iECommerceHostService2;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            return true;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime2, 1, IApplicationDependencyService.class.getName(), iECommerceHostService2 != null ? iECommerceHostService2.getClass().getName() : null, iECommerceHostService2 != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        return ((IApplicationDependencyService) iECommerceHostService2).isRegressionTest();
    }

    public static void LIZLLL(Activity activity) {
        LIZIZ();
        ECAsyncInflaterV2 eCAsyncInflaterV2Remove = ECAsyncInflaterV2.LLILZLL.remove(activity);
        if (eCAsyncInflaterV2Remove != null) {
            eCAsyncInflaterV2Remove.LLILZ = true;
            RunnableC2486009og runnableC2486009og = eCAsyncInflaterV2Remove.LLILZIL;
            if (runnableC2486009og != null) {
                C0CFQ.LIZ.removeCallbacks(runnableC2486009og);
            }
            ConcurrentHashMap<Integer, LinkedList<SoftReference<View>>> concurrentHashMap = eCAsyncInflaterV2Remove.LLILLJJLI;
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [T, com.ss.android.ugc.aweme.ecommercebase.preload.ECAsyncInflaterV2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static void LIZJ(Activity activity, List list, Long l) {
        EnumC1153500g7g enumC1153500g7g = EnumC1153500g7g.HANDLE_THREAD;
        if ((activity instanceof LifecycleOwner) && list != null && !list.isEmpty()) {
            Lifecycle lifecycle = ((LifecycleOwner) activity).getLifecycle();
            C259800zU c259800zU = new C259800zU();
            ConcurrentHashMap<Context, ECAsyncInflaterV2> concurrentHashMap = ECAsyncInflaterV2.LLILZLL;
            ?? r0 = concurrentHashMap.get(activity);
            c259800zU.element = r0;
            if (r0 == 0) {
                ?? eCAsyncInflaterV2 = new ECAsyncInflaterV2(activity);
                c259800zU.element = eCAsyncInflaterV2;
                concurrentHashMap.put(activity, (ECAsyncInflaterV2) eCAsyncInflaterV2);
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS35S0300000_2((Object) activity, (Activity) c259800zU, (C259800zU<ECAsyncInflaterV2>) lifecycle, (Lifecycle) 0));
            }
            ECAsyncInflaterV2 eCAsyncInflaterV22 = (ECAsyncInflaterV2) c259800zU.element;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Pair pair = (Pair) it2.next();
                eCAsyncInflaterV22.LLILLL.put((Integer) pair.getFirst(), (Integer) pair.getSecond());
            }
            eCAsyncInflaterV22.getClass();
            C1701390uNN c1701390uNN = new C1701390uNN(eCAsyncInflaterV22.LL, eCAsyncInflaterV22, enumC1153500g7g, l);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                Pair pair2 = (Pair) it3.next();
                int iIntValue = ((Number) pair2.getFirst()).intValue();
                int iIntValue2 = ((Number) pair2.getSecond()).intValue();
                ((ArrayList) c1701390uNN.LJFF).add(new Pair(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)));
            }
            ECAsyncInflaterV2 eCAsyncInflaterV23 = c1701390uNN.LIZIZ;
            LayoutInflater layoutInflater = (LayoutInflater) c1701390uNN.LJ.getValue();
            eCAsyncInflaterV23.getClass();
            ARunnableS126S0100000_26 aRunnableS126S0100000_26 = new ARunnableS126S0100000_26(new C1701400uNO(eCAsyncInflaterV23, c1701390uNN, new C118300cf(), layoutInflater), 47);
            int i = C1153510g7h.LIZ[c1701390uNN.LIZJ.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    C21394318o1.LIZ(new AwS570S0100000_26(aRunnableS126S0100000_26, 1327));
                    return;
                }
                throw new C1954807lC();
            }
            C786410Ut5.LJJZZIII(C0CFQ.LIZ, aRunnableS126S0100000_26);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.view.View LIZ(android.content.Context r6, int r7, android.view.ViewGroup r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1701430uNR.LIZ(android.content.Context, int, android.view.ViewGroup, boolean):android.view.View");
    }
}

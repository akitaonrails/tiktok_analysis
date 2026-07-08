package X;

import Y.AfS171S0100000_2;
import Y.AfS195S0100000_26;
import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.router.AbsOpenResultCallback;
import com.bytedance.router.RouteManager;
import com.bytedance.router.saf.SAFNavigationRoute;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13tF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20152713tF {
    public static final C20152713tF LIZ = new C20152713tF();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [T] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v27, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static void LIZ() {
        C20152913tH.LIZLLL.getClass();
        if (C20153113tJ.LIZ()) {
            return;
        }
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        Application applicationLIZ = C1BWL.LIZ();
        C20151513t3 c20151513t3 = new C20151513t3(applicationLIZ);
        c20151513t3.LIZJ = AFwS218S0000000_29.get$arr$(96);
        c20151513t3.LIZIZ.LIZ = iRetrofitFactory;
        c20151513t3.LIZ = false;
        c20151513t3.LIZLLL.put(AbstractC19484711Kz.class, new InterfaceC1726320v1a<AbstractC19484711Kz<?>>() { // from class: X.11Tl
            @Override // X.InterfaceC1726320v1a
            public final void LIZ(AbstractC19484711Kz<?> abstractC19484711Kz, InterfaceC1726310v1Z interfaceC1726310v1Z) {
                ExecutorService executorServiceLIZLLL = C823050WQl.LIZLLL();
                C11RO c11ro = C11S5.LIZ;
                abstractC19484711Kz.LJJ(new C19501611Rm(executorServiceLIZLLL)).LJJIIZ(new AfS171S0100000_2(interfaceC1726310v1Z, 16), new AfS195S0100000_26(interfaceC1726310v1Z, 2));
            }
        });
        c20151513t3.LIZLLL.put(Future.class, new InterfaceC1726320v1a<Future<?>>() { // from class: X.11Tm
            @Override // X.InterfaceC1726320v1a
            public final void LIZ(Future<?> future, InterfaceC1726310v1Z interfaceC1726310v1Z) throws ExecutionException, InterruptedException {
                Object obj = future.get();
                if (interfaceC1726310v1Z != null) {
                    interfaceC1726310v1Z.onSuccess(obj);
                }
            }
        });
        c20151513t3.LIZLLL.put(C11NZ.class, new InterfaceC1726320v1a<C11NZ<?>>() { // from class: X.0v1W
            @Override // X.InterfaceC1726320v1a
            public final void LIZ(C11NZ<?> c11nz, InterfaceC1726310v1Z interfaceC1726310v1Z) {
                c11nz.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS171S0100000_2(interfaceC1726310v1Z, 17), new AfS195S0100000_26(interfaceC1726310v1Z, 3));
            }
        });
        c20151513t3.LIZLLL.put(C0X9S.class, new InterfaceC1726320v1a<C0X9S<?>>() { // from class: X.0v1Y
            @Override // X.InterfaceC1726320v1a
            public final void LIZ(C0X9S<?> c0x9s, InterfaceC1726310v1Z interfaceC1726310v1Z) {
                C0X52<?> c0x52Execute = c0x9s.execute();
                if (interfaceC1726310v1Z != null) {
                    interfaceC1726310v1Z.onSuccess(c0x52Execute);
                }
            }
        });
        c20151513t3.LIZLLL.put(AnonymousClass0957.class, new InterfaceC1726320v1a<AnonymousClass0957<?>>() { // from class: X.0v1X
            @Override // X.InterfaceC1726320v1a
            public final void LIZ(AnonymousClass0957<?> anonymousClass0957, InterfaceC1726310v1Z interfaceC1726310v1Z) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1392205ce(anonymousClass0957, interfaceC1726310v1Z, null), 3);
            }
        });
        if (c20151513t3.LIZJ == null) {
            c20151513t3.LIZJ = AFwS219S0000000_30.get$arr$(217);
        }
        boolean z = c20151513t3.LIZ;
        C20151013sy c20151013sy = c20151513t3.LIZIZ;
        Function0<? extends ExecutorService> function0 = c20151513t3.LIZJ;
        if (function0 == null) {
            Intrinsics.LJIIL();
        }
        C20151413t2 c20151413t2 = new C20151413t2(applicationLIZ, z, c20151013sy, function0, c20151513t3.LIZLLL);
        C20152813tG c20152813tG = new C20152813tG(new AwS609S0100000_30(c20151413t2, 133));
        ?? r0 = c20152813tG.LIZIZ;
        if (r0 == 0) {
            synchronized (c20152813tG) {
                try {
                    Object obj = c20152813tG.LIZIZ;
                    if (obj != null) {
                        c20152813tG.LIZ = null;
                        r0 = obj;
                    } else {
                        Function1 function1 = c20152813tG.LIZ;
                        if (function1 == null) {
                            Intrinsics.LJIIL();
                        }
                        ?? Invoke = function1.invoke(c20151413t2);
                        c20152813tG.LIZIZ = Invoke;
                        c20152813tG.LIZ = null;
                        r0 = Invoke;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C20152913tH.LIZIZ = (C20152913tH) r0;
        function0.invoke().execute(new Runnable() { // from class: X.13tI
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("Preloader$Companion@9254.init$2");
                try {
                    Iterator<InterfaceC20153213tK> it2 = C20152913tH.LIZJ.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZ(C1524605y0.LIZ());
                    }
                    C20152913tH.LIZJ.clear();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("Preloader$Companion@9254.init$2");
            }
        });
        C20151213t0.LLJ = C0C64.LJIILLIIL().LJIIIZ(31744, "power_preload_preload_key_opt", true, false);
        C1499780p8C.LIZLLL = new C1499790p8D();
        RouteManager.getInstance().addGlobalResultCallback(new AbsOpenResultCallback() { // from class: X.0hFc
            @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
            public final void onOpen(Intent intent) throws Throwable {
                C1951107kb.LIZIZ(this, intent);
                if (intent != null) {
                    C20152713tF.LIZ.getClass();
                    C20152713tF.LIZIZ(intent, false);
                }
            }
        });
        C1074030e3V.LJ.add(new InterfaceC1074040e3W() { // from class: X.0hFb
            @Override // X.InterfaceC1074040e3W
            public final void onOpen(Intent intent) throws Throwable {
                C20152713tF.LIZ.getClass();
                C20152713tF.LIZIZ(intent, true);
            }
        });
        SAFNavigationRoute.Companion.addRouteStartListeners(C1209050hZH.get$arr$(0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(Intent intent, boolean z) throws Throwable {
        ComponentName component;
        String strLJJIJIIJIL;
        intent.putExtra("EXTRA_PRELOAD_PAGE_START_TIME", SystemClock.elapsedRealtime());
        if (C297190Bkr.LIZ()) {
            if (z) {
                Object c098200Yq = null;
                Bundle extras = null;
                try {
                    String stringExtra = intent.getStringExtra("POWER_FRAGMENT_CLASS_NAME");
                    if (stringExtra != null && (component = intent.getComponent()) != null && (strLJJIJIIJIL = C2204961BRm.LJJIJIIJIL(component, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOatZJDn0SIS/ow8O7C1WP6f4we8CmxO7IL0xjGRDLM5BiVP", null))) != null) {
                        try {
                            C20152913tH.LIZLLL.getClass();
                            C20152113t9 c20152113t9LIZIZ = C20153113tJ.LIZIZ();
                            if (c20152113t9LIZIZ != 0) {
                                String dataString = intent.getDataString();
                                if (dataString == null) {
                                    dataString = "";
                                }
                                Class<?> cls = Class.forName(strLJJIJIIJIL);
                                Class<?> cls2 = Class.forName(stringExtra);
                                try {
                                    extras = intent.getExtras();
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                                c20152113t9LIZIZ.LJ(dataString, cls, cls2, extras);
                                c098200Yq = Unit.LIZ;
                            }
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        C189200o6.m1boximpl(c098200Yq);
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    return;
                }
            }
            C20152913tH.LIZLLL.getClass();
            C20152113t9 c20152113t9LIZIZ2 = C20153113tJ.LIZIZ();
            if (c20152113t9LIZIZ2 != null) {
                c20152113t9LIZIZ2.LIZIZ(intent);
            }
        }
    }
}

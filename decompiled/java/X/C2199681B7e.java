package X;

import Y.ARunnableS103S0000000_30;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.OkHttp3Instrumentation;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.IDownloadNetworkHandler;
import com.ss.android.socialbase.downloader.impls.DownloadHandleService;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService;
import com.ss.android.socialbase.downloader.service.IDownloadIdGeneratorService;
import com.ss.android.socialbase.downloader.service.IDownloadMultiProcService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1B7e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2199681B7e {
    public static volatile Context LIZ;
    public static volatile C1B5Z LIZIZ;
    public static volatile C1B7J LIZJ;
    public static volatile C1B75 LIZLLL;
    public static volatile C1B73 LJ;
    public static volatile InterfaceC2199191B5h LJFF;
    public static volatile InterfaceC1500070p8f LJI;
    public static volatile InterfaceC1498660p6O LJII;
    public static volatile C1498630p6L LJIIIIZZ;
    public static volatile C1498640p6M LJIIIZ;
    public static volatile ExecutorService LJIIJ;
    public static volatile ExecutorService LJIIJJI;
    public static volatile ExecutorService LJIIL;
    public static volatile ExecutorService LJIILIIL;
    public static volatile ExecutorService LJIILJJIL;
    public static volatile ExecutorService LJIILL;
    public static volatile ExecutorService LJIILLIIL;
    public static volatile C822650WOx LJIIZILJ;
    public static volatile ExecutorService LJIJ;
    public static volatile C822660WOy LJIJI;
    public static volatile C822650WOx LJIJJ;
    public static volatile C1490920otu LJIJJLI;
    public static volatile C2199981B8i LJIL;
    public static volatile C1B67 LJJ;
    public static volatile InterfaceC2199971B8h LJJI;
    public static volatile C1B8U LJJIIJ;
    public static volatile InterfaceC1498840p6g LJJIIJZLJL;
    public static volatile IDownloadNetworkHandler LJJIIZI;
    public static int LJJIJIIJI;
    public static final int LJJIJIIJIL;
    public static final int LJJIJIL;
    public static final int LJJIJL;
    public static final int LJJIJLIJ;
    public static int LJJIL;
    public static boolean LJJIZ;
    public static final List<InterfaceC2199961B8g> LJJJ;
    public static final List<InterfaceC2199951B8f> LJJJI;
    public static boolean LJJJIL;
    public static final boolean LJJJJ;
    public static C2200021B8m LJJJJI;
    public static volatile boolean LJJJJIZL;
    public static volatile List<InterfaceC2199571B6t> LJJIFFI = new CopyOnWriteArrayList();
    public static volatile boolean LJJII = false;
    public static volatile C1495520p1K LJJIII = null;
    public static final List<InterfaceC2199361B5y> LJJIIZ = new ArrayList();
    public static boolean LJJIJ = false;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors() + 1;
        LJJIJIIJIL = iAvailableProcessors;
        LJJIJIL = (Runtime.getRuntime().availableProcessors() * 2) + 1;
        LJJIJL = iAvailableProcessors;
        LJJIJLIJ = iAvailableProcessors;
        String str = C1490880otq.LIZ;
        LJJIL = 32768;
        LJJJ = new ArrayList();
        LJJJI = new ArrayList();
        LJJJIL = true;
        LJJJJ = true;
        LJJJJIZL = false;
        IDownloadMultiProcService iDownloadMultiProcService = (IDownloadMultiProcService) C1B82.LIZ(IDownloadMultiProcService.class);
        if (iDownloadMultiProcService != null) {
            iDownloadMultiProcService.registerIndependentServiceCreator();
        }
    }

    public static C1495510p1J LIZ() {
        C1495510p1J c1495510p1J = new C1495510p1J();
        int iOptInt = C2199751B7l.LIZIZ().optInt("connect_timeout", 30000);
        int iOptInt2 = C2199751B7l.LIZIZ().optInt("io_timeout", 30000);
        long j = iOptInt;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c1495510p1J.connectTimeout(j, timeUnit);
        long j2 = iOptInt2;
        c1495510p1J.readTimeout(j2, timeUnit);
        c1495510p1J.writeTimeout(j2, timeUnit);
        c1495510p1J.retryOnConnectionFailure(true);
        c1495510p1J.followRedirects(true);
        c1495510p1J.protocols(Collections.singletonList(EnumC847200XLi.HTTP_1_1));
        if (LJIJ != null) {
            c1495510p1J.dispatcher(new C1495530p1L(LJIJ));
        }
        return c1495510p1J;
    }

    public static synchronized Context LJFF() {
        return LIZ;
    }

    public static ExecutorService LJI() {
        if (LJIIJ == null) {
            synchronized (C2199681B7e.class) {
                try {
                    if (LJIIJ == null) {
                        int i = LJJIJIIJIL;
                        C822650WOx c822650WOx = new C822650WOx(i, i, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C08UL("DownloadThreadPool-cpu-fixed"));
                        try {
                            c822650WOx.allowCoreThreadTimeOut(true);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                        LJIIJ = c822650WOx;
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        return LJIIJ;
    }

    public static ExecutorService LJII() {
        if (LJIILL == null) {
            synchronized (C2199681B7e.class) {
                try {
                    if (LJIILL == null) {
                        int i = LJJIJLIJ;
                        C822650WOx c822650WOx = new C822650WOx(i, i, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C08UL("DownloadThreadPool-db-fixed"));
                        try {
                            c822650WOx.allowCoreThreadTimeOut(true);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                        LJIILL = c822650WOx;
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        return LJIILL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.1B8U] */
    public static InterfaceC2200091B8t LJIIIIZZ() {
        if (LJJIIJ == null) {
            synchronized (C2199681B7e.class) {
                try {
                    if (LJJIIJ == null) {
                        LJJIIJ = new InterfaceC2200091B8t() { // from class: X.1B8U
                        };
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJJIIJ;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0p6M] */
    public static InterfaceC1498660p6O LJIIIZ() {
        if (LJIIIZ == null) {
            synchronized (C2199681B7e.class) {
                try {
                    if (LJIIIZ == null) {
                        LJIIIZ = new InterfaceC1498660p6O() { // from class: X.0p6M
                            @Override // X.InterfaceC1498660p6O
                            /* JADX INFO: renamed from: LIZ */
                            public final InterfaceC2199921B8c mo53LIZ(String str, List<HttpHeader> list) throws Throwable {
                                C1495520p1K c1495520p1KLJIIL = C2199681B7e.LJIIL();
                                if (c1495520p1KLJIIL != null) {
                                    C0X33 c0x33 = new C0X33();
                                    c0x33.LJII(str);
                                    c0x33.LIZLLL("HEAD", null);
                                    if (list != null && list.size() > 0) {
                                        for (HttpHeader httpHeader : list) {
                                            if (!"x-ttnet-req-biz-id".equals(httpHeader.name) && !"x-ttnet-req-biz-ver".equals(httpHeader.name)) {
                                                c0x33.LIZ(httpHeader.name, C2199671B7d.LJIIJJI(httpHeader.value));
                                            }
                                        }
                                    }
                                    final C1495500p1I c1495500p1ILIZJ = C1495500p1I.LIZJ(c1495520p1KLJIIL, c0x33.LIZIZ(), false);
                                    final C0XLY c0xlyJ0 = C2204961BRm.j0(c1495500p1ILIZJ, new C0WZX("dzBzEhEpEcvSUUUuTBbKdVdkPAc7AINPwUsIcwZX0WGmMfisofPP81MBTCNFTmGW6FaIciUIHGye7lBlAnLjcU/DGkDgbo5kIA==", null));
                                    if (c0xlyJ0 != null) {
                                        c0xlyJ0.close();
                                        return new InterfaceC2199921B8c() { // from class: X.0p6N
                                            @Override // X.InterfaceC2199921B8c
                                            public final int LIZ() {
                                                return c0xlyJ0.LLILLL;
                                            }

                                            @Override // X.InterfaceC2199921B8c
                                            public final void cancel() {
                                                InterfaceC1495580p1Q interfaceC1495580p1Q = c1495500p1ILIZJ;
                                                if (interfaceC1495580p1Q == null || interfaceC1495580p1Q.isCanceled()) {
                                                    return;
                                                }
                                                c1495500p1ILIZJ.cancel();
                                            }

                                            @Override // X.InterfaceC2199921B8c
                                            public final String LIZIZ(String str2) {
                                                return c0xlyJ0.LIZ(str2, null);
                                            }
                                        };
                                    }
                                    throw new IOException("can't get response");
                                }
                                throw new IOException("can't get httpClient");
                            }
                        };
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJIIIZ;
    }

    public static InterfaceC1500070p8f LJIIJ() {
        if (LJIIIIZZ == null) {
            synchronized (C2199681B7e.class) {
                try {
                    if (LJIIIIZZ == null) {
                        LJIIIIZZ = new C1498630p6L();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJIIIIZZ;
    }

    public static InterfaceC2199141B5c LJIIJJI() {
        if (LIZIZ == null) {
            synchronized (C2199681B7e.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C1B5Z();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public static C1495520p1K LJIIL() {
        if (LJJIII == null) {
            synchronized (C2199681B7e.class) {
                try {
                    if (LJJIII == null) {
                        LJJIII = OkHttp3Instrumentation.build(LIZ());
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJJIII;
    }

    public static C1B7G LJIILIIL() {
        if (LIZJ == null) {
            synchronized (C2199681B7e.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C1B7J();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public static synchronized void LJIILL() {
    }

    public static C1B7F LJIIZILJ() {
        if (LIZLLL == null) {
            synchronized (C2199681B7e.class) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = new C1B75();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    public static C1B7F LJIJ() {
        if (LJ == null) {
            synchronized (C2199681B7e.class) {
                try {
                    if (LJ == null) {
                        ((C1B7L) LJFF).getClass();
                        LJ = new C1B73();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJ;
    }

    public static ExecutorService LJIJI() {
        if (LJIIL == null) {
            synchronized (C2199681B7e.class) {
                try {
                    if (LJIIL == null) {
                        int i = LJJIJL;
                        C822650WOx c822650WOx = new C822650WOx(i, i, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C08UL("DownloadThreadPool-mix-fixed"));
                        try {
                            c822650WOx.allowCoreThreadTimeOut(true);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                        LJIIL = c822650WOx;
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        return LJIIL;
    }

    public static ExecutorService LJIJJ() {
        if (LJIIZILJ == null) {
            synchronized (C2199681B7e.class) {
                try {
                    if (LJIIZILJ == null) {
                        C822650WOx c822650WOx = new C822650WOx(1, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C08UL("DownloadThreadPool-segment-fixed"));
                        try {
                            c822650WOx.allowCoreThreadTimeOut(true);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                        LJIIZILJ = c822650WOx;
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        return LJIIZILJ;
    }

    public static InterfaceC1498840p6g LJIJJLI() {
        if (LJJIIJZLJL == null) {
            synchronized (C2199681B7e.class) {
                try {
                    if (LJJIIJZLJL == null) {
                        LJJIIJZLJL = new C1498830p6f();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJJIIJZLJL;
    }

    public static synchronized int LJIL() {
        return LJJIL;
    }

    public static synchronized void LJJIIJ() {
        if (LJJII || LJFF == null) {
            return;
        }
        try {
            Intent intent = new Intent(LJFF(), (Class<?>) DownloadHandleService.class);
            intent.setAction("com.ss.android.downloader.action.MULTI_PROCESS_NOTIFY");
            C786410Ut5.s3(LJFF(), intent);
            if (!C2199661B7c.LJIIL()) {
                LJJIJ(new ARunnableS103S0000000_30(0));
            }
            LJJII = true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static int[] LJIILLIIL(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 5) {
                        return new int[]{1, 0};
                    }
                    return new int[]{2};
                }
                return new int[]{0, 1};
            }
            return new int[]{1};
        }
        return new int[]{0};
    }

    public static void LJJ(EnumC1152910g6j enumC1152910g6j) {
        List<InterfaceC2199961B8g> list = LJJJ;
        synchronized (list) {
            try {
                for (InterfaceC2199961B8g interfaceC2199961B8g : (ArrayList) list) {
                    if (interfaceC2199961B8g != null) {
                        if (enumC1152910g6j == EnumC1152910g6j.SYNC_START) {
                            interfaceC2199961B8g.onStart();
                        } else if (enumC1152910g6j == EnumC1152910g6j.SYNC_SUCCESS) {
                            interfaceC2199961B8g.onSuccess();
                        }
                    }
                }
                if (enumC1152910g6j == EnumC1152910g6j.SYNC_SUCCESS) {
                    ((ArrayList) LJJJ).clear();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJJI(DownloadTask downloadTask) {
        List<InterfaceC2199951B8f> list = LJJJI;
        synchronized (list) {
            try {
                for (InterfaceC2199951B8f interfaceC2199951B8f : (ArrayList) list) {
                    if (interfaceC2199951B8f != null) {
                        interfaceC2199951B8f.LIZLLL();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static synchronized void LJJIFFI(Context context) {
        if (context != null) {
            if (LIZ == null) {
                LIZ = C786410Ut5.N3(context);
                C1490860oto.LIZ.LIZIZ(LIZ);
            }
        }
    }

    public static void LJJII(C1B84 c1b84) {
        boolean z;
        if (c1b84 != null) {
            Context context = c1b84.LIZ;
            if (context != null) {
                LJJIFFI(context);
            }
            InterfaceC1500070p8f interfaceC1500070p8f = c1b84.LIZIZ;
            boolean z2 = true;
            if (interfaceC1500070p8f != null) {
                LJI = interfaceC1500070p8f;
                if (LJI != null) {
                    z = true;
                } else {
                    z = false;
                }
                LJJIZ = z;
            }
            ExecutorService executorService = c1b84.LJFF;
            if (executorService != null) {
                LJIIJ = executorService;
            }
            ExecutorService executorService2 = c1b84.LJI;
            if (executorService2 != null) {
                LJIIJJI = executorService2;
            }
            ExecutorService executorService3 = c1b84.LJII;
            if (executorService3 != null) {
                LJIIL = executorService3;
            }
            ExecutorService executorService4 = c1b84.LJIIIIZZ;
            if (executorService4 != null) {
                LJIILIIL = executorService4;
            }
            ExecutorService executorService5 = c1b84.LJIIIZ;
            if (executorService5 != null) {
                LJIILJJIL = executorService5;
            }
            ExecutorService executorService6 = c1b84.LJIIJ;
            if (executorService6 != null) {
                LJIILL = executorService6;
            }
            ExecutorService executorService7 = c1b84.LJIIJJI;
            if (executorService7 != null) {
                LJIILLIIL = executorService7;
            }
            ExecutorService executorService8 = c1b84.LJIIL;
            if (executorService8 != null) {
                LJIJ = executorService8;
            }
            if (!((ArrayList) c1b84.LIZLLL).isEmpty()) {
                LJJIII(c1b84.LIZLLL);
            }
            InterfaceC2199971B8h interfaceC2199971B8h = c1b84.LJ;
            if (interfaceC2199971B8h != null) {
                LJJI = interfaceC2199971B8h;
                C2199751B7l.LIZJ();
            }
            InterfaceC1498840p6g interfaceC1498840p6g = c1b84.LJIILIIL;
            if (interfaceC1498840p6g != null) {
                LJJIIJZLJL = interfaceC1498840p6g;
                if (LJJIIJZLJL.LIZIZ()) {
                    InterfaceC1500070p8f tTNetDownloadHttpService = LJJIIJZLJL.getTTNetDownloadHttpService();
                    if (tTNetDownloadHttpService != null) {
                        LJI = tTNetDownloadHttpService;
                    }
                    if (LJI == null) {
                        z2 = false;
                    }
                    LJJIZ = z2;
                    InterfaceC1498660p6O interfaceC1498660p6OLIZJ = LJJIIJZLJL.LIZJ();
                    if (interfaceC1498660p6OLIZJ != null) {
                        LJII = interfaceC1498660p6OLIZJ;
                    }
                } else {
                    InterfaceC1500070p8f interfaceC1500070p8fLJIIJ = LJIIJ();
                    if (interfaceC1500070p8fLJIIJ != null) {
                        LJI = interfaceC1500070p8fLJIIJ;
                    }
                    if (LJI == null) {
                        z2 = false;
                    }
                    LJJIZ = z2;
                    InterfaceC1498660p6O interfaceC1498660p6OLJIIIZ = LJIIIZ();
                    if (interfaceC1498660p6OLJIIIZ != null) {
                        LJII = interfaceC1498660p6OLJIIIZ;
                    }
                }
            }
            LJJJIL = c1b84.LJIILJJIL;
            C1B67 c1b67 = c1b84.LIZJ;
            if (c1b67 != null) {
                LJJ = c1b67;
            }
        }
    }

    public static void LJJIII(List<InterfaceC2199361B5y> list) {
        List<InterfaceC2199361B5y> list2 = LJJIIZ;
        if (((ArrayList) list2).isEmpty()) {
            synchronized (list2) {
                try {
                    ((ArrayList) list2).addAll(list);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static void LJJIIJZLJL(C1B7L c1b7l) {
        if (C1490830otl.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Creator: ");
            sbLIZ.append(c1b7l);
            C1490830otl.LIZIZ("DownloadComponentManager", "setIndependentServiceCreator", C2188811AlT.LIZIZ(sbLIZ));
        }
        LJFF = c1b7l;
    }

    public static void LJJIIZ(Runnable runnable) {
        LJI().execute(runnable);
    }

    public static void LJJIIZI(Runnable runnable) {
        if (!C2199671B7d.LJIJJLI()) {
            runnable.run();
        } else {
            LJII().execute(runnable);
        }
    }

    public static void LJJIJ(Runnable runnable) {
        ExecutorService executorServiceLJI;
        if (LJIIJJI != null) {
            executorServiceLJI = LJIIJJI;
        } else {
            executorServiceLJI = LJI();
        }
        executorServiceLJI.execute(runnable);
    }

    public static void LJJIJIIJIL(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (LJIJJ == null) {
            synchronized (C2199681B7e.class) {
                try {
                    if (LJIJJ == null) {
                        LJIJJ = new C822650WOx(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C08UL("DownloadThreadPool-Single"));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        LJIJJ.execute(runnable);
    }

    public static int LJIILJJIL(String str, String str2) {
        return ((IDownloadIdGeneratorService) C1B82.LIZ(IDownloadIdGeneratorService.class)).generate(str, str2);
    }

    public static void LJJIJIIJI(Runnable runnable, long j, TimeUnit timeUnit) {
        if (LJIJI == null) {
            synchronized (C2199681B7e.class) {
                try {
                    if (LJIJI == null) {
                        LJIJI = new C822660WOy(1, new C08UL("DownloadThreadPool-Schedule"));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        LJIJI.schedule(runnable, j, timeUnit);
    }

    public static InterfaceC2199921B8c LIZLLL(String str, List<HttpHeader> list, int i, boolean z, DownloadInfo downloadInfo) throws Exception {
        InterfaceC2199921B8c interfaceC2199921B8cLJ;
        if (LJJIIZI != null) {
            String strHandle = LJJIIZI.handle(str, list);
            if (!TextUtils.isEmpty(strHandle)) {
                str = strHandle;
            }
        }
        Exception e = null;
        for (int i2 : LJIILLIIL(i)) {
            try {
                interfaceC2199921B8cLJ = LJ(str, list, i2, z, downloadInfo);
            } catch (Exception e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
            }
            if (interfaceC2199921B8cLJ != null) {
                return interfaceC2199921B8cLJ;
            }
        }
        if (e == null) {
            return null;
        }
        throw e;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.InterfaceC2199921B8c LJ(java.lang.String r17, java.util.List<com.ss.android.socialbase.downloader.model.HttpHeader> r18, int r19, boolean r20, com.ss.android.socialbase.downloader.model.DownloadInfo r21) throws java.lang.Throwable {
        /*
            r0 = 2
            r9 = r19
            if (r0 != r9) goto L2c
            X.0p6O r0 = X.C2199681B7e.LJII
            if (r0 != 0) goto L37
            X.0p6O r0 = LJIIIZ()
        Ld:
            if (r0 != 0) goto L37
            com.ss.android.socialbase.downloader.exception.BaseException r3 = new com.ss.android.socialbase.downloader.exception.BaseException
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "httpService not exist, netLib = "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            r0 = 1022(0x3fe, float:1.432E-42)
            r3.<init>(r0, r2)
            throw r3
        L2c:
            r0 = 1
            if (r9 != r0) goto L32
            X.0p6O r0 = X.C2199681B7e.LJII
            goto Ld
        L32:
            X.0p6O r0 = LJIIIZ()
            goto Ld
        L37:
            r12 = 0
            r5 = 0
            r1 = 0
            r11 = r21
            r4 = r17
            if (r20 == 0) goto L45
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> L59 java.lang.Throwable -> L60
        L45:
            r3 = r18
            X.1B8c r3 = r0.mo53LIZ(r4, r3)     // Catch: java.io.IOException -> L59 java.lang.Throwable -> L60
            if (r20 == 0) goto L58
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r1
            java.lang.String r8 = "head"
            r10 = r5
            X.C2199691B7f.LIZIZ(r3, r4, r5, r6, r8, r9, r10, r11)
        L58:
            return r3
        L59:
            r19 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r19)     // Catch: java.lang.Throwable -> L60
            throw r19     // Catch: java.lang.Throwable -> L5e
        L5e:
            r0 = move-exception
            goto L63
        L60:
            r0 = move-exception
            r19 = r12
        L63:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L67
            goto L69
        L67:
            r0 = move-exception
            goto L63
        L69:
            if (r20 == 0) goto L7b
            long r15 = java.lang.System.currentTimeMillis()
            long r15 = r15 - r1
            java.lang.String r17 = "head"
            r13 = r4
            r14 = r12
            r18 = r9
            r20 = r11
            X.C2199691B7f.LIZIZ(r12, r13, r14, r15, r17, r18, r19, r20)
        L7b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2199681B7e.LJ(java.lang.String, java.util.List, int, boolean, com.ss.android.socialbase.downloader.model.DownloadInfo):X.1B8c");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(9:4|(1:6)|14|44|(6:48|16|46|19|(1:21)|22)(4:46|19|(0)|22)|52|(5:32|39|33|51|29)|(1:37)|38)(2:10|(1:12)(1:13))|(2:8|9)|14|44|(0)(0)|52|(5:32|39|33|51|29)|(0)|38|(2:(0)|(1:42))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x006c, code lost:
    
        r19 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0049 A[EXC_TOP_SPLITTER, PHI: r1
      0x0049: PHI (r1v7 long) = (r1v0 long), (r1v5 long) binds: [B:15:0x0040, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1B8V LIZJ(int r15, java.lang.String r16, java.lang.String r17, java.util.List<com.ss.android.socialbase.downloader.model.HttpHeader> r18, int r19, boolean r20, com.ss.android.socialbase.downloader.model.DownloadInfo r21) throws java.lang.Throwable {
        /*
            r0 = 2
            r9 = r19
            if (r0 != r9) goto L2c
            X.0p8f r0 = X.C2199681B7e.LJI
            if (r0 != 0) goto L37
            X.0p8f r0 = LJIIJ()
        Ld:
            if (r0 != 0) goto L37
            com.ss.android.socialbase.downloader.exception.BaseException r3 = new com.ss.android.socialbase.downloader.exception.BaseException
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "httpService not exist, netLib = "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            r0 = 1022(0x3fe, float:1.432E-42)
            r3.<init>(r0, r2)
            throw r3
        L2c:
            r0 = 1
            if (r9 != r0) goto L32
            X.0p8f r0 = X.C2199681B7e.LJI
            goto Ld
        L32:
            X.0p8f r0 = LJIIJ()
            goto Ld
        L37:
            r10 = 0
            r1 = 0
            r5 = r17
            r11 = r21
            r4 = r16
            if (r20 == 0) goto L49
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> L47 java.lang.Throwable -> L67
            goto L49
        L47:
            r19 = move-exception
            goto L5d
        L49:
            r3 = r18
            X.1B8V r3 = r0.LIZ(r4, r3)     // Catch: java.io.IOException -> L5c java.lang.Throwable -> L63
            if (r20 == 0) goto L5b
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r1
            java.lang.String r8 = "get"
            X.C2199691B7f.LIZIZ(r3, r4, r5, r6, r8, r9, r10, r11)
        L5b:
            return r3
        L5c:
            r19 = move-exception
        L5d:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r19)     // Catch: java.lang.Throwable -> L63
            throw r19     // Catch: java.lang.Throwable -> L61
        L61:
            r0 = move-exception
            goto L6c
        L63:
            r0 = move-exception
        L64:
            r19 = r10
            goto L6c
        L67:
            r0 = move-exception
            r1 = 0
            r19 = r10
        L6c:
            r12 = 0
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L71
            goto L75
        L71:
            r0 = move-exception
            r10 = r19
            goto L64
        L75:
            if (r20 == 0) goto L87
            long r15 = java.lang.System.currentTimeMillis()
            long r15 = r15 - r1
            java.lang.String r17 = "get"
            r13 = r4
            r14 = r5
            r18 = r9
            r20 = r11
            X.C2199691B7f.LIZIZ(r12, r13, r14, r15, r17, r18, r19, r20)
        L87:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2199681B7e.LIZJ(int, java.lang.String, java.lang.String, java.util.List, int, boolean, com.ss.android.socialbase.downloader.model.DownloadInfo):X.1B8V");
    }

    public static C1B8V LIZIZ(boolean z, int i, String str, String str2, List<HttpHeader> list, int i2, boolean z2, DownloadInfo downloadInfo) throws Exception {
        C1B8V c1b8vLIZJ;
        JSONObject jSONObjectLJIIIZ;
        if (LJJIIZI != null) {
            String strHandle = LJJIIZI.handle(str, list);
            if (!TextUtils.isEmpty(strHandle)) {
                str = strHandle;
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            list.add(new HttpHeader("ss_d_request_host_ip_114", str2));
            if (downloadInfo == null || (jSONObjectLJIIIZ = C2199751B7l.LJFF(downloadInfo.getId(), null).LJIIIZ("segment_config")) == null || jSONObjectLJIIIZ.optInt("enable_ttnet_ip_request", 0) <= 0) {
                i2 = 1;
            }
        } else if (!z) {
            i2 = 2;
        }
        Exception e = null;
        for (int i3 : LJIILLIIL(i2)) {
            try {
                c1b8vLIZJ = LIZJ(i, str, str2, list, i3, z2, downloadInfo);
            } catch (Exception e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                if (downloadInfo != null && downloadInfo.isExpiredRedownload() && ((IDownloadComponentManagerService) C1B82.LIZ(IDownloadComponentManagerService.class)).getTTNetHandler().LIZLLL(e) == 304) {
                    if (C2199671B7d.LJIIZILJ(list)) {
                        throw e;
                    }
                } else {
                    continue;
                }
            }
            if (c1b8vLIZJ != null) {
                return c1b8vLIZJ;
            }
        }
        if (e == null) {
            return null;
        }
        throw e;
    }
}

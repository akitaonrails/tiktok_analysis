package X;

import android.os.SystemClock;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.13zX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20191713zX {
    public static final C20191713zX LIZ = new C20191713zX();
    public static final FutureC199556136c LIZIZ = new FutureC199556136c();
    public static final Keva LIZJ = Keva.getRepo("ship_repo");
    public static final C199557136d LIZLLL = C199557136d.LIZ;

    public static boolean LIZ() {
        synchronized (LIZLLL) {
            if (C199557136d.LIZLLL == 0) {
                C199557136d.LIZLLL = SystemClock.elapsedRealtime();
                C199557136d.LJ = 2;
            }
        }
        return ((IPluginService) ServiceManager.get().getService(IPluginService.class)).checkPluginInstalled("com.bytedance.tiktok.ship");
    }

    public final void LIZJ() {
        if (((IPluginService) ServiceManager.get().getService(IPluginService.class)).checkPluginInstalled("com.bytedance.tiktok.ship")) {
            LIZIZ.LLILLJJLI.set(4);
            return;
        }
        synchronized (this) {
            try {
                FutureC199556136c futureC199556136c = LIZIZ;
                if (futureC199556136c.LLILLJJLI.get() == 4 || futureC199556136c.LLILLJJLI.get() == 2) {
                    return;
                }
                futureC199556136c.LL.acquire();
                futureC199556136c.LLILLJJLI.set(2);
                LIZLLL.getClass();
                C199557136d.LIZJ = SystemClock.elapsedRealtime();
                IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
                C844020X9c c844020X9c = new C844020X9c();
                c844020X9c.LIZ = "com.bytedance.tiktok.ship";
                c844020X9c.LIZIZ = true;
                AnonymousClass1403 anonymousClass1403 = new AnonymousClass1403();
                anonymousClass1403.LIZ = false;
                anonymousClass1403.LIZIZ();
                anonymousClass1403.LIZJ = false;
                anonymousClass1403.LIZLLL = false;
                anonymousClass1403.LJFF = true;
                c844020X9c.LJ = new AnonymousClass1405(anonymousClass1403);
                c844020X9c.LIZLLL = new InterfaceC842850X4p() { // from class: X.13zY
                    @Override // X.InterfaceC842850X4p
                    public final void LIZJ(String str, boolean z) {
                        C20191713zX.LIZ.getClass();
                        C20191713zX.LIZIZ(0);
                    }

                    @Override // X.InterfaceC842850X4p
                    public final void LIZ(int i, String str, boolean z) {
                        C20191713zX.LIZ.getClass();
                        C20191713zX.LIZIZ(i);
                    }
                };
                iPluginService.LJJI(new C202068144s(c844020X9c));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZIZ(int i) {
        LIZLLL.getClass();
        C199557136d.LIZIZ = SystemClock.elapsedRealtime();
        Keva keva = LIZJ;
        boolean z = false;
        int i2 = keva.getInt("try_times", 0) + 1;
        if (i == 0) {
            z = true;
        }
        FutureC199556136c futureC199556136c = LIZIZ;
        if (z) {
            futureC199556136c.LLILLJJLI.set(4);
        } else {
            futureC199556136c.LLILLJJLI.set(3);
        }
        futureC199556136c.LL.release();
        keva.storeInt("try_times", i2);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, "prepare_result");
        c2344009Gk.LIZLLL(C199557136d.LIZIZ - C199557136d.LIZJ, "prepare_till_end");
        c2344009Gk.LIZJ(i2, "try_times");
        if (i == 0) {
            if (C199557136d.LIZIZ >= C199557136d.LIZLLL) {
                c2344009Gk.LJFF("first_access_till_success", String.valueOf(C199557136d.LIZIZ - C199557136d.LIZLLL));
                c2344009Gk.LIZJ(C199557136d.LJ, "access_type");
            } else {
                c2344009Gk.LJFF("first_access_till_success", CardStruct.IStatusCode.DEFAULT);
                c2344009Gk.LIZJ(1, "access_type");
            }
        }
        C20684815ws.LJIILLIIL("prf_ship_plugin", c2344009Gk.LIZ);
    }
}

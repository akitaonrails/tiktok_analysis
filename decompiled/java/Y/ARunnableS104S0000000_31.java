package Y;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C07A2;
import X.C0XQ7;
import X.C1083900eJQ;
import X.C1119400fEg;
import X.C1270304y5;
import X.C157U;
import X.C1C7U;
import X.C20629915o1;
import X.C20673215v0;
import X.C2115808Qq;
import X.C2116508Qx;
import X.C2116608Qy;
import X.C212350188e;
import X.C2126108Up;
import X.C21278818Pa;
import X.C21279318Pf;
import X.C2187451AjH;
import X.C2214201BlK;
import X.C2517109th;
import X.C476400ImE;
import X.C488600JEc;
import X.C587580N2u;
import X.C786410Ut5;
import X.C823050WQl;
import X.C844120X9m;
import X.C844470XAv;
import X.ExecutorC1592406Li;
import X.InterfaceC20622815ms;
import X.InterfaceC214897198d;
import android.content.ComponentCallbacks2;
import android.os.Looper;
import android.os.MessageQueue;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.internal.bind.GsonBoundFieldsPreloader;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.account.prompt.IAccountShowBindPromptApi;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.services.edit.IReplaceMusicService;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import pgo.c0;
import pgo.z1;

/* JADX INFO: loaded from: classes32.dex */
public class ARunnableS104S0000000_31 implements Runnable {
    public final int $t;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                C2187451AjH.LJIIJJI();
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
            case 5:
                run$5(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public ARunnableS104S0000000_31(int i) {
        this.$t = i;
    }

    public static final void run$0(ARunnableS104S0000000_31 aRunnableS104S0000000_31) {
        C1C7U.LIZ("SearchPreloadLancet@a104.asyncRace$1L");
        try {
            Class.forName("com.ss.android.ugc.aweme.creative.taskscheduler.scheduler.g");
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        z1.LIZ.getClass();
        z1.LIZJ.getValue();
        c0.LIZJ.getValue();
        C1C7U.LIZIZ("SearchPreloadLancet@a104.asyncRace$1L");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    public static final void run$2(ARunnableS104S0000000_31 aRunnableS104S0000000_31) {
        IAccountShowBindPromptApi iAccountShowBindPromptApi;
        C1C7U.LIZ("StartupJankOptEntry@3e83.onStartupJankStart$1L");
        if (!C07A2.LIZLLL) {
            int i = C2116508Qx.LIZ;
            if ((i & 1) == 1 && (i & 2) != 2) {
                C844470XAv.LIZ.getClass();
                if (!"local_test".equals(C844470XAv.LJIILL)) {
                    C786410Ut5.LJIIZILJ(Looper.getMainLooper(), null);
                }
            }
        }
        if ((C2115808Qq.LIZIZ(false) & 65536) == 65536 && ((Number) C2116608Qy.LIZ.getValue()).intValue() == 0) {
            GsonBoundFieldsPreloader.LIZLLL();
            GsonBoundFieldsPreloader.LIZJ = false;
            ((ConcurrentHashMap) GsonBoundFieldsPreloader.LJ).clear();
        }
        if (C844120X9m.LIZ.LIZ(false, true)) {
            if ((C2517109th.LIZ & 256) == 256) {
                ComponentCallbacks2 componentCallbacks2LJFF = C2214201BlK.LJFF();
                boolean z = componentCallbacks2LJFF instanceof InterfaceC214897198d;
                ?? r8 = componentCallbacks2LJFF;
                if (z) {
                    Object objLIZ = C20629915o1.LIZ((InterfaceC20622815ms) componentCallbacks2LJFF);
                    r8 = componentCallbacks2LJFF;
                    if (objLIZ instanceof Fragment) {
                        C488600JEc c488600JEcLJIILIIL = SAFExtensionKt.LJIILIIL((Fragment) objLIZ);
                        r8 = componentCallbacks2LJFF;
                        if (c488600JEcLJIILIIL != null) {
                            r8 = c488600JEcLJIILIIL;
                        }
                    }
                }
                String[] strArr = {"homepage_common_view_algo_refresh", "common_feed_anchor_multi_anchor"};
                int i2 = 0;
                do {
                    String str = strArr[i2];
                    if (!C20673215v0.LIZIZ(r8, str)) {
                        C20673215v0.LJII(r8, str);
                    }
                    i2++;
                } while (i2 < 2);
            }
            if ((C2517109th.LIZ & 8) == 8) {
                try {
                    Class.forName("com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.expirement.AdPitayaReRankClientAb").getMethod("get", new Class[0]).invoke(null, new Object[0]);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            int i3 = C2517109th.LIZ;
            if ((i3 & 16) == 16) {
                C1270304y5.LIZ(IReplaceMusicService.class);
            }
            if ((i3 & 32) == 32) {
                try {
                    C1270304y5.LIZ(Class.forName("com.ss.android.ugc.aweme.tools.sticker.core.article.IArticleStickerComponentService"));
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
            int i4 = C2517109th.LIZ;
            if ((i4 & 1) == 1) {
                ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
            }
            if ((i4 & 2) == 2 && (iAccountShowBindPromptApi = (IAccountShowBindPromptApi) C1270304y5.LIZ(IAccountShowBindPromptApi.class)) != null) {
                iAccountShowBindPromptApi.LIZ();
            }
            if ((i4 & 4) == 4) {
                C1270304y5.LIZ(IIMService.class);
            }
            if ((i4 & 64) == 64) {
                try {
                    Class<?> cls = Class.forName("com.bytedance.android.livesdk.userservice.UserService");
                    cls.getDeclaredMethod("user", new Class[0]).invoke(cls.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]), new Object[0]);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                }
            }
            if ((C2517109th.LIZ & 128) == 128) {
                C786410Ut5.f3(new MessageQueue.IdleHandler() { // from class: X.0Uw0
                    @Override // android.os.MessageQueue.IdleHandler
                    public final boolean queueIdle() {
                        Runnable runnable;
                        WeakReference<Runnable> weakReference = C844120X9m.LIZIZ;
                        if (weakReference == null || (runnable = weakReference.get()) == null) {
                            return false;
                        }
                        C823050WQl.LIZIZ().submit(runnable);
                        return false;
                    }
                }, Looper.getMainLooper().getQueue());
            }
        }
        if (((Boolean) C587580N2u.LJFF.getValue()).booleanValue()) {
            C212350188e c212350188eLIZJ = C212350188e.LIZJ();
            C844470XAv.LIZ.getClass();
            c212350188eLIZJ.LIZIZ(C844470XAv.LJIIJ);
        }
        C1C7U.LIZIZ("StartupJankOptEntry@3e83.onStartupJankStart$1L");
    }

    public static final void run$3(ARunnableS104S0000000_31 aRunnableS104S0000000_31) {
        boolean zLIZ;
        C1C7U.LIZ("EcUgVSAManager@aafd.recordShopBottomTabShow$$inlined$runOnWorkerThread$1");
        try {
            C01GW c01gw = C21278818Pa.LIZ;
            C21279318Pf c21279318PfLIZJ = C21278818Pa.LIZJ(C21278818Pa.LIZIZ, null);
            if (c21279318PfLIZJ != null && !c21279318PfLIZJ.LJIIL) {
                c21279318PfLIZJ.LJIIL = true;
                try {
                    ExecutorC1592406Li.LLILLJJLI.execute(new ARunnableS89S0000000_10(3));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcUgVSAManager@aafd.recordShopBottomTabShow$$inlined$runOnWorkerThread$1");
    }

    public static final void run$4(ARunnableS104S0000000_31 aRunnableS104S0000000_31) {
        boolean zLIZ;
        C1C7U.LIZ("TTLiveSDK@e12b.initP2Task$2");
        try {
            C1119400fEg.LIZIZ().getClass();
            if (SettingsManager.isOptKevaSave()) {
                ScheduledExecutorService scheduledExecutorServiceLJ = C823050WQl.LJ();
                SettingsManager settingsManager = SettingsManager.INSTANCE;
                Objects.requireNonNull(settingsManager);
                scheduledExecutorServiceLJ.schedule(new ARunnableS131S0100000_31(settingsManager, 152), 0L, TimeUnit.MILLISECONDS);
            }
            C1119400fEg.LIZIZ().getClass();
            SettingsManager.INSTANCE.init(new C476400ImE(), new C1083900eJQ(), C823050WQl.LIZIZ());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TTLiveSDK@e12b.initP2Task$2");
    }

    public static final void run$5(ARunnableS104S0000000_31 aRunnableS104S0000000_31) {
        boolean zLIZ;
        C1C7U.LIZ("LiveHarService@8248.harPredictRunnable$1");
        try {
            C157U.LIZ.LJIIL();
            C157U.LJI = C2126108Up.LIZLLL.schedule(aRunnableS104S0000000_31, C157U.LIZLLL.timerTriggerInterval, TimeUnit.MILLISECONDS);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveHarService@8248.harPredictRunnable$1");
    }
}

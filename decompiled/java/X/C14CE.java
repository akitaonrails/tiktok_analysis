package X;

import Y.ARunnableS115S0100000_15;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicFYPCardPerformanceOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicFeedUniqueCardSchema;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.AwS396S0200000_30;

/* JADX INFO: renamed from: X.14CE, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14CE {
    public static WeakReference<AbstractC914750Zub> LIZIZ;
    public static ScheduledFuture<?> LIZLLL;
    public static final C14CE LIZ = new C14CE();
    public static final AtomicReference<SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB> LIZJ = new AtomicReference<>(null);
    public static final AtomicBoolean LJ = new AtomicBoolean(false);

    public static void LIZLLL() {
        try {
            ScheduledFuture<?> scheduledFuture = LIZLLL;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            LIZLLL = C823050WQl.LJ().schedule(new Runnable() { // from class: X.14C5
                public static void LIZ() {
                    C20441214yg.LIZIZ("CoverViewHandler", "updateExpireTime run expire");
                    C14CE.LIZLLL = null;
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB andSet = C14CE.LIZJ.getAndSet(null);
                    if (andSet != null) {
                        try {
                            C189200o6.m2constructorimpl(Boolean.valueOf(andSet.LJJ(true)));
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("CoverViewHandler@b390.updateExpireTime$1$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("CoverViewHandler@b390.updateExpireTime$1$1");
                }
            }, LinkMicFYPCardPerformanceOptSetting.INSTANCE.getCacheExpireTime(), TimeUnit.SECONDS);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LIZ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
        C20441214yg.LJIIIZ("CoverViewHandler", "cacheSparkView");
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB andSet = LIZJ.getAndSet(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        LIZLLL();
        if (andSet != null) {
            try {
                C189200o6.m2constructorimpl(Boolean.valueOf(andSet.LJJ(true)));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public static void LIZIZ(Integer num) {
        Object c098200Yq;
        if (LIZJ.get() != null) {
            LIZLLL();
            return;
        }
        if (LJ.getAndSet(false)) {
            return;
        }
        String schema = LinkMicFeedUniqueCardSchema.getSchema();
        C013C c013c = new C013C();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1 = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).DU1(C786410Ut5.N3(C497740JfY.LJII()), schema, null, true, new AwS396S0200000_30(num, c013c, 46));
        if (c013c.element) {
            LIZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1);
            return;
        }
        try {
            c098200Yq = Boolean.valueOf(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1.LJJ(true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m1boximpl(c098200Yq);
    }

    public static void LIZJ(Integer num) {
        LinkMicFYPCardPerformanceOptSetting linkMicFYPCardPerformanceOptSetting = LinkMicFYPCardPerformanceOptSetting.INSTANCE;
        if (linkMicFYPCardPerformanceOptSetting.preloadOptEnable()) {
            if (LIZJ.get() != null) {
                LIZLLL();
                return;
            }
            LJ.set(false);
            if (linkMicFYPCardPerformanceOptSetting.asyncPreloadOptEnable()) {
                if (num != null && num.intValue() == 7) {
                    C823050WQl.LIZIZ().submit(new ARunnableS115S0100000_15(num, 153));
                    return;
                } else {
                    C786410Ut5.f3(new C987040bnC(num, 1), C473410IhP.LIZ().getLooper().getQueue());
                    return;
                }
            }
            C786410Ut5.f3(new C987040bnC(num, 2), C473410IhP.LIZ().getLooper().getQueue());
        }
    }
}

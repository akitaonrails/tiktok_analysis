package X;

import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fpn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.live.publicscreen.api.badge.UserBadgeCacheManager$release$3", f = "UserBadgeCacheManager.kt", l = {}, m = "invokeSuspend")
public final class C1142410fpn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1142400fpm LL;
    public final /* synthetic */ C1142440fpq LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1142410fpn(C1142400fpm c1142400fpm, C1142440fpq c1142440fpq, InterfaceC1364105Vn<? super C1142410fpn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1142400fpm;
        this.LLILLJJLI = c1142440fpq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1142410fpn(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int readHoldCount;
        float f;
        C1C7U.LIZ("UserBadgeCacheManager@610c.release$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1142400fpm c1142400fpm = this.LL;
        ReentrantReadWriteLock reentrantReadWriteLock = c1142400fpm.LJII;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            readHoldCount = reentrantReadWriteLock.getReadHoldCount();
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock.unlock();
            }
        } else {
            readHoldCount = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            Iterator<Map.Entry<String, C1142430fpp>> it2 = c1142400fpm.LJI.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue().LJFF = true;
            }
            c1142400fpm.LJI.clear();
            c1142400fpm.LJIIIIZZ.clear();
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            Iterator<Map.Entry<String, C1142430fpp>> it3 = this.LL.LJIIL.entrySet().iterator();
            while (it3.hasNext()) {
                it3.next().getValue().LJFF = true;
            }
            this.LL.LJIIL.clear();
            C1142400fpm c1142400fpm2 = this.LL;
            synchronized (c1142400fpm2.LJIIZILJ) {
                try {
                    c1142400fpm2.LJIILJJIL = null;
                    c1142400fpm2.LJIILL = 0L;
                    c1142400fpm2.LJIILLIIL = 0L;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C1142400fpm c1142400fpm3 = this.LL;
            synchronized (c1142400fpm3.LJIIJJI) {
                try {
                    c1142400fpm3.LJIIIZ.clear();
                    c1142400fpm3.LJIIJ.clear();
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
            C1142400fpm c1142400fpm4 = this.LL;
            C1142440fpq c1142440fpq = this.LLILLJJLI;
            c1142400fpm4.getClass();
            try {
                C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_badge_statistics", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_10()));
                c474500IjALIZIZ.LJJII(Long.valueOf(c1142440fpq.LIZIZ), "badge_list_hit_count");
                c474500IjALIZIZ.LJJII(Long.valueOf(c1142440fpq.LIZJ), "badge_list_miss_count");
                long j = c1142440fpq.LIZIZ;
                long j2 = c1142440fpq.LIZJ + j;
                float f2 = 0.0f;
                if (j2 > 0) {
                    f = j / j2;
                } else {
                    f = 0.0f;
                }
                c474500IjALIZIZ.LJJIFFI(Float.valueOf(f), "badge_list_hit_rate");
                c474500IjALIZIZ.LJJII(Long.valueOf(c1142440fpq.LIZLLL), "badge_list_evict_count");
                c474500IjALIZIZ.LJJII(Integer.valueOf(c1142440fpq.LJ), "badge_list_cache_size");
                c474500IjALIZIZ.LJJII(Long.valueOf(c1142440fpq.LJFF), "self_badge_list_cache_hit_count");
                c474500IjALIZIZ.LJJII(Long.valueOf(c1142440fpq.LJI), "self_badge_list_cache_miss_count");
                long j3 = c1142440fpq.LJFF;
                long j4 = c1142440fpq.LJI + j3;
                if (j4 > 0) {
                    f2 = j3 / j4;
                }
                c474500IjALIZIZ.LJJIFFI(Float.valueOf(f2), "self_badge_list_cache_hit_rate");
                c474500IjALIZIZ.LJJII(Integer.valueOf(c1142440fpq.LJII), "self_badge_list_cache_size");
                c474500IjALIZIZ.LJJII(Long.valueOf(c1142440fpq.LJIIIZ), "badge_display_count");
                c474500IjALIZIZ.LJJII(Long.valueOf(c1142440fpq.LJIIIIZZ), "badge_content_changed_count");
                c474500IjALIZIZ.LJJII(Long.valueOf(c1142440fpq.LJIIJJI), "session_duration_ms");
                c474500IjALIZIZ.LJJII(Boolean.valueOf(c1142440fpq.LJIIL), "deep_optimization_enabled");
                c474500IjALIZIZ.LJJII(Long.valueOf(c1142440fpq.LJIILIIL), "badge_list_cleared_count");
                c474500IjALIZIZ.LJJII(Long.valueOf(c1142440fpq.LJIILJJIL), "expired_cleanup_count");
                c474500IjALIZIZ.LJJII(Integer.valueOf(c1142440fpq.LJIIJ), "peak_cache_size");
                c474500IjALIZIZ.LJJII(Integer.valueOf(c1142440fpq.LIZ), "current_cache_size");
                c474500IjALIZIZ.LJIL();
                c474500IjALIZIZ.LIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("UserBadgeCacheManager@610c.release$3");
            return unit;
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

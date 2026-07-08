package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0osU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1490040osU {
    public String LIZ;
    public final Set<Request> LIZIZ = new CopyOnWriteArraySet();
    public int LIZJ = -1;
    public final Lock LIZLLL;
    public final Condition LJ;
    public final Set<Request> LJFF;
    public int LJI;
    public final Lock LJII;
    public final Map<Runnable, Executor> LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;

    public final void LIZJ() {
        ((ReentrantLock) this.LIZLLL).lock();
        try {
            this.LJ.signalAll();
            ((ReentrantLock) this.LIZLLL).unlock();
            this.LJII.lock();
            try {
                final int iLIZ = 0;
                for (Map.Entry entry : ((ConcurrentHashMap) this.LJIIIIZZ).entrySet()) {
                    final Runnable runnable = (Runnable) entry.getKey();
                    final Executor executor = (Executor) entry.getValue();
                    int i = this.LJIIJJI;
                    iLIZ = i <= 0 ? LIZ() : iLIZ + i;
                    final long j = iLIZ;
                    C1490010osR.LIZ(EnumC1490030osT.NETWORK).LIZIZ(new AbstractRunnableC1490020osS(j) { // from class: X.0osW
                        public final void LIZ() {
                            this.LLILZ.LJII.lock();
                            try {
                                if (((ConcurrentHashMap) this.LLILZ.LJIIIIZZ).containsKey(runnable)) {
                                    Runnable runnable2 = runnable;
                                    if (runnable2 instanceof InterfaceRunnableC1490390ot3) {
                                        C1494570ozn c1494570oznLJJJZ = ((InterfaceRunnableC1490390ot3) runnable2).LJJJZ();
                                        c1494570oznLJJJZ.LJJII = System.currentTimeMillis() - c1494570oznLJJJZ.LJJIIJZLJL;
                                        c1494570oznLJJJZ.LJJIIZ = iLIZ;
                                    }
                                    executor.execute(runnable);
                                    ((ConcurrentHashMap) this.LLILZ.LJIIIIZZ).remove(runnable);
                                }
                                this.LLILZ.LJII.unlock();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LLILZ.LJII.unlock();
                                throw th;
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("RequestDelayController@e527.releaseAllDelayedRequests$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("RequestDelayController@e527.releaseAllDelayedRequests$1");
                        }
                    });
                }
                this.LJII.unlock();
                ((CopyOnWriteArraySet) this.LJFF).clear();
                ((CopyOnWriteArraySet) this.LIZIZ).clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LJII.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            ((ReentrantLock) this.LIZLLL).unlock();
            throw th2;
        }
    }

    public final int LIZ() {
        int i = this.LJIIIZ;
        if (i <= 0) {
            i = 500;
        }
        int i2 = this.LJIIJ;
        if (i2 <= 0) {
            i2 = LivePreCreateNextRoomPlayer.ENABLE;
        }
        if (i < i2 && ((CopyOnWriteArraySet) this.LJFF).size() + ((CopyOnWriteArraySet) this.LIZIZ).size() > 8) {
            return new Random().nextInt((i2 - i) + 1) + i;
        }
        return 0;
    }

    public C1490040osU() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.LIZLLL = reentrantLock;
        this.LJ = reentrantLock.newCondition();
        this.LJFF = new CopyOnWriteArraySet();
        this.LJI = -1;
        this.LJII = new ReentrantReadWriteLock().writeLock();
        this.LJIIIIZZ = new ConcurrentHashMap();
        this.LJIIIZ = 500;
        this.LJIIJ = LivePreCreateNextRoomPlayer.ENABLE;
        this.LJIIJJI = 100;
    }

    public final void LIZIZ(String str, JSONObject jSONObject) {
        this.LIZJ = jSONObject.optInt("sync_req_delay_max_count", -1);
        this.LJI = jSONObject.optInt("async_req_delay_max_count", -1);
        this.LJIIIZ = jSONObject.optInt("random_send_lbound_ms", 500);
        this.LJIIJ = jSONObject.optInt("random_send_ubound_ms", LivePreCreateNextRoomPlayer.ENABLE);
        this.LJIIJJI = jSONObject.optInt("sparse_send_interval_ms", 100);
        this.LIZ = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c A[Catch: Exception -> 0x006b, all -> 0x0070, TryCatch #1 {Exception -> 0x006b, blocks: (B:5:0x000f, B:8:0x001c, B:10:0x004e, B:12:0x0054, B:13:0x0058, B:14:0x005f), top: B:24:0x000f, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.bytedance.retrofit2.client.Request r7, boolean r8, boolean r9, long r10) {
        /*
            r6 = this;
            java.util.concurrent.locks.Lock r0 = r6.LIZLLL
            java.util.concurrent.locks.ReentrantLock r0 = (java.util.concurrent.locks.ReentrantLock) r0
            r0.lock()
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L7c
            if (r8 != 0) goto L1c
            java.util.Set<com.bytedance.retrofit2.client.Request> r0 = r6.LIZIZ     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L70
            java.util.concurrent.CopyOnWriteArraySet r0 = (java.util.concurrent.CopyOnWriteArraySet) r0     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L70
            int r1 = r0.size()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L70
            int r0 = r6.LIZJ     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L70
            if (r1 < r0) goto L1c
            goto L7c
        L1c:
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L70
            java.util.Set<com.bytedance.retrofit2.client.Request> r0 = r6.LIZIZ     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L70
            java.util.concurrent.CopyOnWriteArraySet r0 = (java.util.concurrent.CopyOnWriteArraySet) r0     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L70
            r0.add(r7)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L70
            X.0ozn r2 = r7.getMetrics()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L70
            java.util.Set<com.bytedance.retrofit2.client.Request> r0 = r6.LIZIZ     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L70
            java.util.concurrent.CopyOnWriteArraySet r0 = (java.util.concurrent.CopyOnWriteArraySet) r0     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L70
            int r0 = r0.size()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L70
            long r0 = (long) r0     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L70
            r2.LJJIII = r0     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L70
            X.0ozn r1 = r7.getMetrics()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L70
            java.lang.String r0 = r6.LIZ     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L70
            r1.LJJI = r0     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L70
            X.0ozn r1 = r7.getMetrics()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L70
            r0 = 1
            r1.LJJIFFI = r0     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L70
            java.util.concurrent.locks.Condition r1 = r6.LJ     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L70
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L70
            r1.await(r10, r0)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L70
            if (r9 == 0) goto L5f
            int r3 = r6.LIZ()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L70
            if (r3 <= 0) goto L58
            long r0 = (long) r3     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L70
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L70
        L58:
            X.0ozn r2 = r7.getMetrics()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L70
            long r0 = (long) r3     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L70
            r2.LJJIIZ = r0     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L70
        L5f:
            X.0ozn r2 = r7.getMetrics()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L70
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L70
            long r0 = r0 - r4
            r2.LJJII = r0     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L70
            goto L7c
        L6b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L70
            goto L7c
        L70:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L70
            java.util.concurrent.locks.Lock r0 = r6.LIZLLL
            java.util.concurrent.locks.ReentrantLock r0 = (java.util.concurrent.locks.ReentrantLock) r0
            r0.unlock()
            throw r1
        L7c:
            java.util.concurrent.locks.Lock r0 = r6.LIZLLL
            java.util.concurrent.locks.ReentrantLock r0 = (java.util.concurrent.locks.ReentrantLock) r0
            r0.unlock()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1490040osU.LJ(com.bytedance.retrofit2.client.Request, boolean, boolean, long):void");
    }

    public final boolean LIZLLL(final Request request, boolean z, final long j, final C1494560ozm c1494560ozm, final Executor executor) {
        if (j > 0) {
            if (!z && ((CopyOnWriteArraySet) this.LJFF).size() >= this.LJI) {
                return false;
            }
            ((ConcurrentHashMap) this.LJIIIIZZ).put(c1494560ozm, executor);
            ((CopyOnWriteArraySet) this.LJFF).add(request);
            request.getMetrics().LJJIIJZLJL = SystemClock.uptimeMillis();
            request.getMetrics().LJJI = this.LIZ;
            request.getMetrics().LJJIIJ = ((CopyOnWriteArraySet) this.LJFF).size();
            request.getMetrics().LJJIFFI = true;
            C1490010osR.LIZ(EnumC1490030osT.NETWORK).LIZIZ(new AbstractRunnableC1490020osS(j) { // from class: X.0osV
                public final void LIZ() {
                    this.LLILZ.LJII.lock();
                    try {
                        if (((ConcurrentHashMap) this.LLILZ.LJIIIIZZ).containsKey(c1494560ozm)) {
                            executor.execute(c1494560ozm);
                            ((ConcurrentHashMap) this.LLILZ.LJIIIIZZ).remove(c1494560ozm);
                            request.getMetrics().LJJII = SystemClock.uptimeMillis() - request.getMetrics().LJJIIJZLJL;
                        }
                        this.LLILZ.LJII.unlock();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        this.LLILZ.LJII.unlock();
                        throw th;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("RequestDelayController@e527.requestAsyncDelay$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("RequestDelayController@e527.requestAsyncDelay$1");
                }
            });
            return true;
        }
        return false;
    }
}

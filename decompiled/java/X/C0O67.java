package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.0O67, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O67 extends C0O6C {
    public final C01GW LIZ = C452501pT.LIZIZ(new C319570Cfr());

    @Override // X.C0O6C
    public final C0O68 LIZ() {
        return LJ(C036E.LIZ.LIZJ);
    }

    @Override // X.C0O6C
    public final C0O3U LIZIZ() {
        return (C0O3U) this.LIZ.getValue();
    }

    @Override // X.C0O6C
    public final void LIZJ() {
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(new InterfaceC586170Myt() { // from class: X.0O66
            @Override // X.InterfaceC586170Myt
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                int readHoldCount;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MotaMemoryCache.onAccountResult success: ");
                sbLIZ.append(z);
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("Mota", C2188811AlT.LIZIZ(sbLIZ));
                if (z) {
                    ReentrantReadWriteLock reentrantReadWriteLock = C0O65.LIZ;
                    ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                    int i3 = 0;
                    if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                        readHoldCount = reentrantReadWriteLock.getReadHoldCount();
                        for (int i4 = 0; i4 < readHoldCount; i4++) {
                            lock.unlock();
                        }
                    } else {
                        readHoldCount = 0;
                    }
                    ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                    writeLock.lock();
                    try {
                        C0O65.LIZIZ.evictAll();
                        while (i3 < readHoldCount) {
                            lock.lock();
                            i3++;
                        }
                        writeLock.unlock();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        while (i3 < readHoldCount) {
                            lock.lock();
                            i3++;
                        }
                        writeLock.unlock();
                        throw th;
                    }
                }
            }
        });
    }

    public static C0O68 LJ(C0O0L c0o0l) {
        int i = C0O0M.LIZ[c0o0l.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return C0O68.UNKNOWN;
                    }
                    return C0O68.UNKNOWN;
                }
                return C0O68.NOT_AVAILABLE;
            }
            return C0O68.FAKE;
        }
        return C0O68.AVAILABLE;
    }

    @Override // X.C0O6C
    public final void LIZLLL(final C0O6V c0o6v) {
        C036E.LIZ.LIZ(new C0H62() { // from class: X.0O69
            @Override // X.C0H62
            public final void onChange(C0O0L c0o0l, C0O0L c0o0l2) {
                if (c0o0l2 != null) {
                    this.LL.getClass();
                    C0O68 c0o68LJ = C0O67.LJ(c0o0l2);
                    if (c0o68LJ != null) {
                        c0o6v.invoke(c0o68LJ);
                    }
                }
            }
        });
    }
}

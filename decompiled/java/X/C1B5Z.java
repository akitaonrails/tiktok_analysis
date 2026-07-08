package X;

import Y.ARunnableS134S0100000_34;
import android.database.sqlite.SQLiteException;
import android.os.Looper;
import android.util.SparseArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.thread.WeakDownloadHandler;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.1B5Z, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B5Z implements InterfaceC2199141B5c {
    public static final AtomicBoolean LLIZ = new AtomicBoolean(false);
    public final C1B5X LL;
    public C1B5Y LLILLJJLI;
    public volatile boolean LLILLL;
    public volatile boolean LLILZ;
    public final C2199131B5b LLILZIL = new C2199131B5b(this);
    public final WeakDownloadHandler LLILZLL;

    @Override // X.InterfaceC2199141B5c
    public final boolean LJL() {
        if (this.LLILLL) {
            return true;
        }
        if (this.LL.LLILLL) {
            LIZ();
            return this.LLILLL;
        }
        synchronized (this) {
            try {
                if (!this.LLILLL) {
                    if (C1490830otl.LIZ()) {
                        C1490830otl.LIZIZ("DefaultDownloadCache", "ensureDownloadCacheSyncSuccess", "Waiting start");
                    }
                    try {
                        wait(Mp4ScreenVideoLoadTimeout.CONTROL);
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (C1490830otl.LIZ()) {
                        C1490830otl.LIZIZ("DefaultDownloadCache", "ensureDownloadCacheSyncSuccess", "Waiting end");
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return this.LLILLL;
    }

    @Override // X.InterfaceC2199141B5c
    public final void clearData() {
        try {
            this.LL.clearData();
        } catch (SQLiteException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!C2199661B7c.LJIJ()) {
            this.LLILLJJLI.clearData();
            return;
        }
        InterfaceC2199641B7a interfaceC2199641B7aLIZ = C1B7E.LIZ(true);
        if (interfaceC2199641B7aLIZ != null) {
            interfaceC2199641B7aLIZ.clearData();
        } else {
            this.LLILLJJLI.clearData();
        }
    }

    @Override // X.InterfaceC2199141B5c
    public final List<DownloadInfo> getAllDownloadInfo() {
        return this.LL.getAllDownloadInfo();
    }

    public C1B5Z() {
        this.LLILZLL = null;
        C2199751B7l c2199751B7l = C2199751B7l.LJFF;
        if (!c2199751B7l.LJI("fix_sigbus_downloader_db", false) || C2199661B7c.LJIILJJIL() || C2199681B7e.LJFF == null) {
            this.LLILLJJLI = new C1B58();
        } else {
            InterfaceC2199191B5h interfaceC2199191B5h = C2199681B7e.LJFF;
            C2199151B5d c2199151B5d = new C2199151B5d(this);
            interfaceC2199191B5h.getClass();
            ServiceConnectionC2199161B5e serviceConnectionC2199161B5e = new ServiceConnectionC2199161B5e();
            serviceConnectionC2199161B5e.LLILZ = c2199151B5d;
            this.LLILLJJLI = serviceConnectionC2199161B5e;
        }
        this.LLILLL = false;
        this.LLILZLL = new WeakDownloadHandler(Looper.getMainLooper(), this.LLILZIL);
        if (C2199751B7l.LIZIZ().optInt("lru_download_info_cache_enable", 0) > 0) {
            this.LL = new C1B5W(this.LLILLJJLI);
        } else {
            this.LL = new C1B5X();
        }
        ARunnableS134S0100000_34 aRunnableS134S0100000_34 = new ARunnableS134S0100000_34(this, 62);
        long jLJIIJ = c2199751B7l.LJIIJ("delay_init_download_cache_ms", 0L);
        if (jLJIIJ > 0) {
            C2199681B7e.LJJIJIIJI(aRunnableS134S0100000_34, jLJIIJ, TimeUnit.MILLISECONDS);
        } else {
            aRunnableS134S0100000_34.run();
        }
    }

    public final void LIZ() {
        C1B7G c1b7gLJIILIIL = C2199681B7e.LJIILIIL();
        synchronized (c1b7gLJIILIIL) {
            try {
                if (!this.LLILLL) {
                    if (C1490830otl.LIZ()) {
                        C1490830otl.LIZIZ("DefaultDownloadCache", "newEnsureDownloadCacheSyncSuccess", "Waiting start");
                    }
                    LLLIIL();
                    try {
                        c1b7gLJIILIIL.wait(Mp4ScreenVideoLoadTimeout.CONTROL);
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (C1490830otl.LIZ()) {
                        C1490830otl.LIZIZ("DefaultDownloadCache", "newEnsureDownloadCacheSyncSuccess", "Waiting end");
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZIZ() {
        C1B7G c1b7gLJIILIIL = C2199681B7e.LJIILIIL();
        synchronized (c1b7gLJIILIIL) {
            try {
                this.LLILLL = true;
                c1b7gLJIILIIL.notifyAll();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC2199141B5c
    public final void LLLIIL() {
        if (C1490830otl.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Run isRunInit:");
            sbLIZ.append(LLIZ.get());
            C1490830otl.LIZIZ("DefaultDownloadCache", "initImmediately", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (LLIZ.compareAndSet(false, true)) {
            if (C1490830otl.LIZ()) {
                C1490830otl.LIZIZ("DefaultDownloadCache", "init", "Run");
            }
            C2199681B7e.LJJ(EnumC1152910g6j.SYNC_START);
            SparseArray sparseArray = new SparseArray();
            for (Map.Entry entry : ((ConcurrentHashMap) this.LL.LL).entrySet()) {
                if (((Integer) entry.getKey()).intValue() != 0 && entry.getValue() != null) {
                    sparseArray.put(((Integer) entry.getKey()).intValue(), entry.getValue());
                }
            }
            this.LLILLJJLI.m0(sparseArray, this.LL.LIZLLL(), this.LL.LIZIZ(), this.LL.LIZJ(), new C2199121B5a(this, sparseArray));
        }
    }

    @Override // X.InterfaceC2199141B5c
    public final boolean isDownloadCacheSyncSuccess() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC2199141B5c
    public final boolean LJIIIIZZ(int i) {
        InterfaceC2199641B7a interfaceC2199641B7aLIZ;
        if (C2199661B7c.LJIJ() && (interfaceC2199641B7aLIZ = C1B7E.LIZ(true)) != null) {
            interfaceC2199641B7aLIZ.LJIIIIZZ(i);
        } else {
            this.LLILLJJLI.LJIIIIZZ(i);
        }
        return this.LL.LJIIIIZZ(i);
    }

    @Override // X.InterfaceC2199141B5c
    public final void LJIIIZ(int i) {
        try {
            updateDownloadInfo(this.LL.getDownloadInfo(i));
            if (C2199661B7c.LJIJ()) {
                InterfaceC2199641B7a interfaceC2199641B7aLIZ = C1B7E.LIZ(true);
                if (interfaceC2199641B7aLIZ != null) {
                    interfaceC2199641B7aLIZ.LJIIIZ(i);
                    return;
                } else {
                    this.LLILLJJLI.LJIIIZ(i);
                    return;
                }
            }
            this.LLILLJJLI.LJIIIZ(i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC2199141B5c
    public final boolean LJIILLIIL(int i) {
        InterfaceC2199641B7a interfaceC2199641B7aLIZ;
        try {
            if (C2199661B7c.LJIJ() && (interfaceC2199641B7aLIZ = C1B7E.LIZ(true)) != null) {
                interfaceC2199641B7aLIZ.LJIILLIIL(i);
            } else {
                this.LLILLJJLI.LJIILLIIL(i);
            }
        } catch (SQLiteException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return this.LL.LJIILLIIL(i);
    }

    @Override // X.InterfaceC2199141B5c
    public final void LJIJI(DownloadInfo downloadInfo) {
        this.LL.updateDownloadInfo(downloadInfo);
    }

    @Override // X.InterfaceC2199141B5c
    public final DownloadInfo LJJIIJ(int i) {
        DownloadInfo downloadInfoLJJIIJ = this.LL.LJJIIJ(i);
        LIZJ(downloadInfoLJJIIJ, true);
        return downloadInfoLJJIIJ;
    }

    @Override // X.InterfaceC2199141B5c
    public final DownloadInfo LJJIJ(int i) {
        DownloadInfo downloadInfoLJJIJ = this.LL.LJJIJ(i);
        LIZJ(downloadInfoLJJIJ, true);
        return downloadInfoLJJIJ;
    }

    @Override // X.InterfaceC2199141B5c
    public final DownloadInfo LJJIJL(int i) {
        DownloadInfo downloadInfoLJJIJL = this.LL.LJJIJL(i);
        LIZJ(downloadInfoLJJIJL, true);
        return downloadInfoLJJIJL;
    }

    @Override // X.InterfaceC2199141B5c
    public final DownloadInfo LJJJJ(int i) {
        DownloadInfo downloadInfoLJJJJ = this.LL.LJJJJ(i);
        LIZJ(downloadInfoLJJJJ, true);
        return downloadInfoLJJJJ;
    }

    @Override // X.InterfaceC2199141B5c
    public final void LJJJZ(int i) {
        this.LL.LJJJZ(i);
        this.LLILLJJLI.LJJJZ(i);
    }

    @Override // X.InterfaceC2199141B5c
    public final List<C2199811B7r> LLILLIZIL(int i) {
        List<C2199811B7r> listLLILLIZIL = this.LL.LLILLIZIL(i);
        if (listLLILLIZIL == null || listLLILLIZIL.size() == 0) {
            return this.LLILLJJLI.LLILLIZIL(i);
        }
        return listLLILLIZIL;
    }

    @Override // X.InterfaceC2199141B5c
    public final void clearMemoryCacheData(double d) {
        try {
            this.LL.clearMemoryCacheData(d);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.InterfaceC2199141B5c
    public final DownloadInfo getDownloadInfo(int i) {
        return this.LL.getDownloadInfo(i);
    }

    @Override // X.InterfaceC2199141B5c
    public final List<DownloadInfo> getDownloadInfoList(String str) {
        return this.LL.getDownloadInfoList(str);
    }

    @Override // X.InterfaceC2199141B5c
    public final List<DownloadInfo> getDownloadInfosByFileExtension(String str) {
        return this.LL.getDownloadInfosByFileExtension(str);
    }

    @Override // X.InterfaceC2199141B5c
    public final List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        return this.LL.getSuccessedDownloadInfosWithMimeType(str);
    }

    @Override // X.InterfaceC2199141B5c
    public final List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        return this.LL.getUnCompletedDownloadInfosWithMimeType(str);
    }

    @Override // X.InterfaceC2199141B5c
    public final boolean updateDownloadInfo(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return false;
        }
        boolean zUpdateDownloadInfo = this.LL.updateDownloadInfo(downloadInfo);
        LIZJ(downloadInfo, true);
        return zUpdateDownloadInfo;
    }

    @Override // X.InterfaceC2199141B5c
    public final Map<Long, C2199811B7r> x(int i) {
        Map<Long, C2199811B7r> mapX = this.LL.x(i);
        if (mapX == null || mapX.isEmpty()) {
            Map<Long, C2199811B7r> mapX2 = this.LLILLJJLI.x(i);
            this.LL.LLLLII(i, mapX2);
            return mapX2;
        }
        return mapX;
    }

    public final void LIZJ(DownloadInfo downloadInfo, boolean z) {
        if (downloadInfo == null) {
            return;
        }
        if (C2199661B7c.LJIJ()) {
            if (z) {
                InterfaceC2199641B7a interfaceC2199641B7aLIZ = C1B7E.LIZ(true);
                if (interfaceC2199641B7aLIZ != null) {
                    interfaceC2199641B7aLIZ.updateDownloadInfo(downloadInfo);
                    return;
                } else {
                    this.LLILLJJLI.updateDownloadInfo(downloadInfo);
                    return;
                }
            }
            return;
        }
        this.LLILLJJLI.updateDownloadInfo(downloadInfo);
    }

    @Override // X.InterfaceC2199141B5c
    public final DownloadInfo LJJIJIIJI(int i, long j) {
        DownloadInfo downloadInfoLJJIJIIJI = this.LL.LJJIJIIJI(i, j);
        LJIIIZ(i);
        return downloadInfoLJJIJIIJI;
    }

    @Override // X.InterfaceC2199141B5c
    public final DownloadInfo LJJJ(int i, long j) {
        DownloadInfo downloadInfoLJJJ = this.LL.LJJJ(i, j);
        LJIIIZ(i);
        return downloadInfoLJJJ;
    }

    @Override // X.InterfaceC2199141B5c
    public final DownloadInfo LJJLIIIJLLLLLLLZ(int i, long j) {
        DownloadInfo downloadInfoLJJLIIIJLLLLLLLZ = this.LL.LJJLIIIJLLLLLLLZ(i, j);
        LJIIIZ(i);
        return downloadInfoLJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC2199141B5c
    public final DownloadInfo LJJZZI(int i, long j) {
        DownloadInfo downloadInfoLJJZZI = this.LL.LJJZZI(i, j);
        LIZJ(downloadInfoLJJZZI, false);
        return downloadInfoLJJZZI;
    }

    @Override // X.InterfaceC2199141B5c
    public final boolean LLLLII(int i, Map<Long, C2199811B7r> map) {
        this.LL.LLLLII(i, map);
        this.LLILLJJLI.LLLLII(i, map);
        return false;
    }

    @Override // X.InterfaceC2199141B5c
    public final DownloadInfo LJJJI(int i, String str, long j, String str2) {
        DownloadInfo downloadInfoLJJJI = this.LL.LJJJI(i, str, j, str2);
        LIZJ(downloadInfoLJJJI, true);
        return downloadInfoLJJJI;
    }
}

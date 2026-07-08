package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1B5W, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B5W extends C1B5X {
    public final C1B5Y LLIZ;
    public final SparseArray<Map<Long, C2199811B7r>> LLILZ = new SparseArray<>();
    public final HashMap<Integer, Integer> LLILZIL = new HashMap<>();
    public final List<DownloadInfo> LLILZLL = new ArrayList();
    public final C1B5I LLIZLLLIL = new LinkedHashMap<Integer, DownloadInfo>() { // from class: X.1B5I
        {
            super(0, 0.75f, true);
        }

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<Integer, DownloadInfo> entry) {
            if (size() > C1B58.LLIZ && C1B58.LLIZLLLIL == null) {
                if (C1490830otl.LIZ()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Will delete eldest key=");
                    sbLIZ.append(entry.getKey());
                    C1490830otl.LIZIZ("LruDownloadCache", "removeEldestEntry", C2188811AlT.LIZIZ(sbLIZ));
                }
                C1B5W c1b5w = this.LL;
                Integer key = entry.getKey();
                if (C1490830otl.LIZ()) {
                    c1b5w.getClass();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Key: ");
                    sbLIZ2.append(key);
                    C1490830otl.LIZIZ("LruDownloadCache", "addToUnreadMap", C2188811AlT.LIZIZ(sbLIZ2));
                }
                synchronized (c1b5w.LLILZIL) {
                    try {
                        c1b5w.LLILZIL.put(key, 0);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return true;
            }
            if (C1490830otl.LIZ()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Will add new to tail key=");
                sbLIZ3.append(entry.getKey());
                C1490830otl.LIZIZ("LruDownloadCache", "removeEldestEntry", C2188811AlT.LIZIZ(sbLIZ3));
            }
            return false;
        }
    };

    @Override // X.C1B5X
    public final List<String> LIZJ() {
        Context context = C2199681B7e.LIZ;
        synchronized (C2199681B7e.class) {
        }
        return null;
    }

    public final void LJII() {
        synchronized (this.LLILZ) {
            try {
                this.LLILZ.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIJ() {
        synchronized (this.LLILZIL) {
            try {
                this.LLILZIL.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C1B5X, X.InterfaceC2199141B5c
    public final void clearData() {
        LJ();
        synchronized (this.LLIZLLLIL) {
            try {
                clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LJIIJ();
        LJII();
    }

    @Override // X.C1B5X, X.InterfaceC2199141B5c
    public final List<DownloadInfo> getAllDownloadInfo() {
        LJ();
        return this.LLIZ.getAllDownloadInfo();
    }

    @Override // X.C1B5X
    public final List<DownloadInfo> LIZIZ() {
        return this.LLILZLL;
    }

    @Override // X.C1B5X
    public final HashMap<Integer, Integer> LIZLLL() {
        return this.LLILZIL;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.1B5I] */
    public C1B5W(C1B5Y c1b5y) {
        this.LLIZ = c1b5y;
    }

    @Override // X.C1B5X
    public final void LIZ(DownloadInfo downloadInfo) {
        LJFF(Integer.valueOf(downloadInfo.getId()), downloadInfo);
        LJIIL(Integer.valueOf(downloadInfo.getId()));
    }

    @Override // X.C1B5X, X.InterfaceC2199141B5c
    public final boolean LJIIIIZZ(int i) {
        LJIILLIIL(i);
        LJJJZ(i);
        LJIIL(Integer.valueOf(i));
        return true;
    }

    public final boolean LJIIJJI(Integer num) {
        boolean zContainsKey;
        if (num.intValue() == 0) {
            return false;
        }
        synchronized (this.LLILZIL) {
            try {
                zContainsKey = this.LLILZIL.containsKey(num);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zContainsKey;
    }

    public final void LJIIL(Integer num) {
        if (C1490830otl.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Key: ");
            sbLIZ.append(num);
            C1490830otl.LIZIZ("LruDownloadCache", "removeFromUnreadMap", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (num.intValue() == 0) {
            return;
        }
        synchronized (this.LLILZIL) {
            try {
                this.LLILZIL.remove(num);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C1B5X, X.InterfaceC2199141B5c
    public final boolean LJIILLIIL(int i) {
        LJ();
        Integer numValueOf = Integer.valueOf(i);
        synchronized (this.LLIZLLLIL) {
            try {
                remove(numValueOf);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LJIIL(Integer.valueOf(i));
        return true;
    }

    @Override // X.C1B5X, X.InterfaceC2199141B5c
    public final void LJIJI(DownloadInfo downloadInfo) {
        updateDownloadInfo(downloadInfo);
    }

    @Override // X.C1B5X, X.InterfaceC2199141B5c
    public final DownloadInfo LJJIIJ(int i) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setStatus(-7);
        }
        return downloadInfo;
    }

    @Override // X.C1B5X, X.InterfaceC2199141B5c
    public final DownloadInfo LJJIJ(int i) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setStatus(1);
        }
        return downloadInfo;
    }

    @Override // X.C1B5X, X.InterfaceC2199141B5c
    public final DownloadInfo LJJIJL(int i) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setStatus(2);
        }
        return downloadInfo;
    }

    @Override // X.C1B5X, X.InterfaceC2199141B5c
    public final DownloadInfo LJJJJ(int i) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setStatus(5);
            downloadInfo.setFirstDownload(false);
        }
        return downloadInfo;
    }

    @Override // X.C1B5X, X.InterfaceC2199141B5c
    public final void LJJJZ(int i) {
        Integer numValueOf = Integer.valueOf(i);
        synchronized (this.LLILZ) {
            try {
                this.LLILZ.remove(numValueOf.intValue());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C1B5X, X.InterfaceC2199141B5c
    public final List<C2199811B7r> LLILLIZIL(int i) {
        Map<Long, C2199811B7r> mapX = x(i);
        if (mapX == null) {
            return null;
        }
        return new ArrayList(mapX.values());
    }

    @Override // X.C1B5X, X.InterfaceC2199141B5c
    public final void clearMemoryCacheData(double d) {
        LJ();
        if (d > 0.0d && d <= 1.0d) {
            synchronized (this.LLIZLLLIL) {
                try {
                    int size = (int) (((double) size()) * d);
                    if (C1490830otl.LIZ()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Before LruDownloadInfoMap Size:");
                        sbLIZ.append(size());
                        sbLIZ.append(" ClearSize:");
                        sbLIZ.append(size);
                        C1490830otl.LIZIZ("LruDownloadCache", "clearMemoryCacheData", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    Iterator<Map.Entry<Integer, DownloadInfo>> it2 = entrySet().iterator();
                    for (int i = 0; it2.hasNext() && i < size; i++) {
                        if (!C2199681B7e.LJIILIIL().LJIILJJIL(it2.next().getKey().intValue())) {
                            it2.remove();
                        }
                    }
                    if (C1490830otl.LIZ()) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("End LruDownloadInfoMap Size:");
                        sbLIZ2.append(size());
                        C1490830otl.LIZIZ("LruDownloadCache", "clearMemoryCacheData", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.C1B5X, X.InterfaceC2199141B5c
    public final DownloadInfo getDownloadInfo(int i) {
        DownloadInfo downloadInfo;
        LJ();
        try {
            Integer numValueOf = Integer.valueOf(i);
            synchronized (this.LLIZLLLIL) {
                try {
                    downloadInfo = get(numValueOf);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (downloadInfo == null) {
                try {
                    if (LJIIJJI(Integer.valueOf(i))) {
                        DownloadInfo downloadInfo2 = this.LLIZ.getDownloadInfo(i);
                        if (downloadInfo2 != null) {
                            LJFF(Integer.valueOf(i), downloadInfo2);
                        }
                        LJIIL(Integer.valueOf(i));
                        return downloadInfo2;
                    }
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        } catch (Exception e2) {
            e = e2;
            downloadInfo = null;
        }
        return downloadInfo;
    }

    @Override // X.C1B5X, X.InterfaceC2199141B5c
    public final List<DownloadInfo> getDownloadInfoList(String str) {
        LJ();
        try {
            return this.LLIZ.getDownloadInfoList(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.C1B5X, X.InterfaceC2199141B5c
    public final List<DownloadInfo> getDownloadInfosByFileExtension(String str) {
        LJ();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.LLIZ.getDownloadInfosByFileExtension(str);
    }

    @Override // X.C1B5X, X.InterfaceC2199141B5c
    public final List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        LJ();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.LLIZ.getSuccessedDownloadInfosWithMimeType(str);
    }

    @Override // X.C1B5X, X.InterfaceC2199141B5c
    public final List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        LJ();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.LLIZ.getUnCompletedDownloadInfosWithMimeType(str);
    }

    @Override // X.C1B5X, X.InterfaceC2199141B5c
    public final boolean updateDownloadInfo(DownloadInfo downloadInfo) {
        LJ();
        boolean z = true;
        if (downloadInfo == null) {
            return true;
        }
        if (getDownloadInfo(downloadInfo.getId()) == null) {
            z = false;
        }
        LJFF(Integer.valueOf(downloadInfo.getId()), downloadInfo);
        LJIIL(Integer.valueOf(downloadInfo.getId()));
        return z;
    }

    @Override // X.C1B5X, X.InterfaceC2199141B5c
    public final Map<Long, C2199811B7r> x(int i) {
        Map<Long, C2199811B7r> mapX;
        Integer numValueOf = Integer.valueOf(i);
        synchronized (this.LLILZ) {
            try {
                mapX = this.LLILZ.get(numValueOf.intValue());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (mapX == null) {
            mapX = this.LLIZ.x(i);
            if (mapX == null) {
                return null;
            }
            LJI(i, mapX);
        }
        return mapX;
    }

    public final void LJFF(Integer num, DownloadInfo downloadInfo) {
        if (num.intValue() == 0) {
            return;
        }
        synchronized (this.LLIZLLLIL) {
            try {
                put(num, downloadInfo);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJI(int i, Map<Long, C2199811B7r> map) {
        if (C1490830otl.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Key: ");
            sbLIZ.append(i);
            C1490830otl.LIZIZ("LruDownloadCache", "addToLruSegmentListMap", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (i == 0) {
            return;
        }
        synchronized (this.LLILZ) {
            try {
                this.LLILZ.put(i, map);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C1B5X, X.InterfaceC2199141B5c
    public final DownloadInfo LJJIJIIJI(int i, long j) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setCurBytes(j, false);
            downloadInfo.setStatus(-2);
        }
        return downloadInfo;
    }

    @Override // X.C1B5X, X.InterfaceC2199141B5c
    public final DownloadInfo LJJJ(int i, long j) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setCurBytes(j, false);
            downloadInfo.setStatus(-1);
            downloadInfo.setFirstDownload(false);
        }
        return downloadInfo;
    }

    @Override // X.C1B5X, X.InterfaceC2199141B5c
    public final DownloadInfo LJJLIIIJLLLLLLLZ(int i, long j) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setCurBytes(j, false);
            downloadInfo.setStatus(-3);
            downloadInfo.setFirstDownload(false);
            downloadInfo.setFirstSuccess(false);
        }
        return downloadInfo;
    }

    @Override // X.C1B5X, X.InterfaceC2199141B5c
    public final DownloadInfo LJJZZI(int i, long j) {
        int status;
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setCurBytes(j, false);
            if (downloadInfo.getStatus() != -3 && downloadInfo.getStatus() != -2 && (status = downloadInfo.getStatus()) != -1 && status != -7 && downloadInfo.getStatus() != -4) {
                downloadInfo.setStatus(4);
            }
        }
        return downloadInfo;
    }

    @Override // X.C1B5X, X.InterfaceC2199141B5c
    public final boolean LLLLII(int i, Map<Long, C2199811B7r> map) {
        LJI(i, map);
        return true;
    }

    @Override // X.C1B5X, X.InterfaceC2199141B5c
    public final DownloadInfo LJJJI(int i, String str, long j, String str2) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setTotalBytes(j);
            downloadInfo.seteTag(str);
            if (TextUtils.isEmpty(downloadInfo.getName()) && !TextUtils.isEmpty(str2)) {
                downloadInfo.setName(str2);
            }
            downloadInfo.setStatus(3);
        }
        return downloadInfo;
    }
}

package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.1B5X, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1B5X implements InterfaceC2199141B5c {
    public final Map<Integer, DownloadInfo> LL = new ConcurrentHashMap();
    public final Map<Integer, Map<Long, C2199811B7r>> LLILLJJLI = new ConcurrentHashMap();
    public final boolean LLILLL;

    public List<String> LIZJ() {
        return null;
    }

    public HashMap<Integer, Integer> LIZLLL() {
        return null;
    }

    @Override // X.InterfaceC2199141B5c
    public final void LJIIIZ(int i) {
    }

    @Override // X.InterfaceC2199141B5c
    public boolean LJL() {
        return false;
    }

    @Override // X.InterfaceC2199141B5c
    public final void LLLIIL() {
    }

    @Override // X.InterfaceC2199141B5c
    public boolean isDownloadCacheSyncSuccess() {
        return false;
    }

    public List<DownloadInfo> LIZIZ() {
        DownloadInfo downloadInfo;
        Context context = C2199681B7e.LIZ;
        synchronized (C2199681B7e.class) {
        }
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : ((ConcurrentHashMap) this.LL).entrySet()) {
            if (((Integer) entry.getKey()).intValue() != 0 && entry.getValue() != null) {
                sparseArray.put(((Integer) entry.getKey()).intValue(), entry.getValue());
            }
        }
        if (sparseArray.size() == 0) {
            return null;
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            int iKeyAt = sparseArray.keyAt(i);
            if (iKeyAt != 0 && (downloadInfo = (DownloadInfo) sparseArray.get(iKeyAt)) != null) {
                downloadInfo.getRealStatus();
                int statusAtDbInit = downloadInfo.getStatusAtDbInit();
                if (statusAtDbInit >= 1 && statusAtDbInit <= 11) {
                    C2199691B7f.LJII(C2199681B7e.LJJ, downloadInfo, null, -5);
                }
            }
        }
        return null;
    }

    public final void LJ() {
        Context context = C2199681B7e.LIZ;
        if (!this.LLILLL || C2199671B7d.LJIJJLI()) {
            return;
        }
        C2199681B7e.LJIIJJI().LJL();
    }

    public C1B5X() {
        this.LLILLL = false;
        this.LLILLL = C2199751B7l.LIZIZ().optInt("active_load_download_cache") > 0;
    }

    @Override // X.InterfaceC2199141B5c
    public void clearData() {
        LJ();
        ((ConcurrentHashMap) this.LL).clear();
    }

    @Override // X.InterfaceC2199141B5c
    public List<DownloadInfo> getAllDownloadInfo() {
        LJ();
        if (((ConcurrentHashMap) this.LL).isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ConcurrentHashMap) this.LL).values().iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }

    public void LIZ(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return;
        }
        ((ConcurrentHashMap) this.LL).put(Integer.valueOf(downloadInfo.getId()), downloadInfo);
    }

    @Override // X.InterfaceC2199141B5c
    public boolean LJIIIIZZ(int i) {
        LJIILLIIL(i);
        LJJJZ(i);
        return true;
    }

    @Override // X.InterfaceC2199141B5c
    public boolean LJIILLIIL(int i) {
        LJ();
        ((ConcurrentHashMap) this.LL).remove(Integer.valueOf(i));
        return true;
    }

    @Override // X.InterfaceC2199141B5c
    public void LJIJI(DownloadInfo downloadInfo) {
        updateDownloadInfo(downloadInfo);
    }

    @Override // X.InterfaceC2199141B5c
    public DownloadInfo LJJIIJ(int i) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setStatus(-7);
        }
        return downloadInfo;
    }

    @Override // X.InterfaceC2199141B5c
    public DownloadInfo LJJIJ(int i) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setStatus(1);
        }
        return downloadInfo;
    }

    @Override // X.InterfaceC2199141B5c
    public DownloadInfo LJJIJL(int i) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setStatus(2);
        }
        return downloadInfo;
    }

    @Override // X.InterfaceC2199141B5c
    public DownloadInfo LJJJJ(int i) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setStatus(5);
            downloadInfo.setFirstDownload(false);
        }
        return downloadInfo;
    }

    @Override // X.InterfaceC2199141B5c
    public void LJJJZ(int i) {
        ((ConcurrentHashMap) this.LLILLJJLI).remove(Integer.valueOf(i));
    }

    @Override // X.InterfaceC2199141B5c
    public List<C2199811B7r> LLILLIZIL(int i) {
        Map map = (Map) ((ConcurrentHashMap) this.LLILLJJLI).get(Integer.valueOf(i));
        if (map != null && !map.isEmpty()) {
            return new ArrayList(map.values());
        }
        return null;
    }

    @Override // X.InterfaceC2199141B5c
    public void clearMemoryCacheData(double d) {
        LJ();
        if (d > 0.0d && d <= 1.0d) {
            int size = (int) (((double) ((ConcurrentHashMap) this.LL).size()) * d);
            if (C1490830otl.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Before DownloadInfoMap Size:");
                sbLIZ.append(((ConcurrentHashMap) this.LL).size());
                sbLIZ.append(" ClearSize:");
                sbLIZ.append(size);
                C1490830otl.LIZIZ("DownloadCache", "clearMemoryCacheData", C2188811AlT.LIZIZ(sbLIZ));
            }
            Iterator it2 = ((ConcurrentHashMap) this.LL).entrySet().iterator();
            int i = 0;
            while (it2.hasNext() && i < size) {
                if (!C2199681B7e.LJIILIIL().LJIILJJIL(((Integer) ((Map.Entry) it2.next()).getKey()).intValue())) {
                    it2.remove();
                    i++;
                }
            }
            if (C1490830otl.LIZ()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("End DownloadInfoMap Size:");
                sbLIZ2.append(((ConcurrentHashMap) this.LL).size());
                C1490830otl.LIZIZ("DownloadCache", "clearMemoryCacheData", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }

    @Override // X.InterfaceC2199141B5c
    public DownloadInfo getDownloadInfo(int i) {
        LJ();
        return (DownloadInfo) ((ConcurrentHashMap) this.LL).get(Integer.valueOf(i));
    }

    @Override // X.InterfaceC2199141B5c
    public List<DownloadInfo> getDownloadInfoList(String str) {
        LJ();
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        for (DownloadInfo downloadInfo : ((ConcurrentHashMap) this.LL).values()) {
            if (str.equals(downloadInfo.getUrl())) {
                arrayList.add(downloadInfo);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC2199141B5c
    public List<DownloadInfo> getDownloadInfosByFileExtension(String str) {
        LJ();
        if (!TextUtils.isEmpty(str) && !((ConcurrentHashMap) this.LL).isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (DownloadInfo downloadInfo : ((ConcurrentHashMap) this.LL).values()) {
                if (downloadInfo != null && !TextUtils.isEmpty(downloadInfo.getName()) && downloadInfo.getName().endsWith(str)) {
                    arrayList.add(downloadInfo);
                }
            }
            return arrayList;
        }
        return null;
    }

    @Override // X.InterfaceC2199141B5c
    public List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        LJ();
        if (!TextUtils.isEmpty(str) && !((ConcurrentHashMap) this.LL).isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (DownloadInfo downloadInfo : ((ConcurrentHashMap) this.LL).values()) {
                if (!TextUtils.isEmpty(downloadInfo.getMimeType()) && downloadInfo.getMimeType().equals(str) && downloadInfo.getStatus() == -3) {
                    arrayList.add(downloadInfo);
                }
            }
            return arrayList;
        }
        return null;
    }

    @Override // X.InterfaceC2199141B5c
    public List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        int status;
        LJ();
        if (!TextUtils.isEmpty(str) && !((ConcurrentHashMap) this.LL).isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (DownloadInfo downloadInfo : ((ConcurrentHashMap) this.LL).values()) {
                if (downloadInfo != null && !TextUtils.isEmpty(downloadInfo.getMimeType()) && downloadInfo.getMimeType().equals(str) && ((status = downloadInfo.getStatus()) == -1 || status == -2 || status == -7 || status == -4 || status == -5)) {
                    arrayList.add(downloadInfo);
                }
            }
            return arrayList;
        }
        return null;
    }

    @Override // X.InterfaceC2199141B5c
    public boolean updateDownloadInfo(DownloadInfo downloadInfo) {
        LJ();
        boolean z = true;
        if (downloadInfo == null) {
            return true;
        }
        if (((ConcurrentHashMap) this.LL).get(Integer.valueOf(downloadInfo.getId())) == null) {
            z = false;
        }
        ((ConcurrentHashMap) this.LL).put(Integer.valueOf(downloadInfo.getId()), downloadInfo);
        return z;
    }

    @Override // X.InterfaceC2199141B5c
    public Map<Long, C2199811B7r> x(int i) {
        return (Map) ((ConcurrentHashMap) this.LLILLJJLI).get(Integer.valueOf(i));
    }

    @Override // X.InterfaceC2199141B5c
    public DownloadInfo LJJIJIIJI(int i, long j) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setCurBytes(j, false);
            downloadInfo.setStatus(-2);
        }
        return downloadInfo;
    }

    @Override // X.InterfaceC2199141B5c
    public DownloadInfo LJJJ(int i, long j) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setCurBytes(j, false);
            downloadInfo.setStatus(-1);
            downloadInfo.setFirstDownload(false);
        }
        return downloadInfo;
    }

    @Override // X.InterfaceC2199141B5c
    public DownloadInfo LJJLIIIJLLLLLLLZ(int i, long j) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setCurBytes(j, false);
            downloadInfo.setStatus(-3);
            downloadInfo.setFirstDownload(false);
            downloadInfo.setFirstSuccess(false);
        }
        return downloadInfo;
    }

    @Override // X.InterfaceC2199141B5c
    public DownloadInfo LJJZZI(int i, long j) {
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

    @Override // X.InterfaceC2199141B5c
    public boolean LLLLII(int i, Map<Long, C2199811B7r> map) {
        if (map != null) {
            ((ConcurrentHashMap) this.LLILLJJLI).put(Integer.valueOf(i), map);
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC2199141B5c
    public DownloadInfo LJJJI(int i, String str, long j, String str2) {
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

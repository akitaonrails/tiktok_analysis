package X;

import android.content.Intent;
import android.util.SparseArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.impls.DownloadHandleService;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.1B7M, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B7M {
    public static volatile C1B7M LIZJ;
    public volatile SparseArray<Boolean> LIZ = new SparseArray<>();
    public volatile List<C1B76> LIZIZ = new ArrayList();

    public static C1B7M LJ() {
        if (LIZJ == null) {
            synchronized (C1B7M.class) {
                try {
                    LIZJ = new C1B7M();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public final InterfaceC2199641B7a LIZIZ(int i) {
        boolean z = true;
        if (LIZJ(i) != 1 || C2199661B7c.LJIIL()) {
            z = false;
        }
        return C1B7E.LIZ(z);
    }

    public final int LIZJ(int i) {
        if (C2199681B7e.LJFF != null) {
            if (!C2199661B7c.LJIIL() && C1B7E.LIZ(true).LIZLLL()) {
                return C1B7E.LIZ(true).LJJLIIIJL(i);
            }
            return LIZLLL(i);
        }
        return -1;
    }

    public final synchronized int LIZLLL(int i) {
        if (this.LIZ.get(i) == null) {
            return -1;
        }
        return this.LIZ.get(i).booleanValue() ? 1 : 0;
    }

    public final synchronized void LJII(int i, boolean z) {
        Boolean bool;
        SparseArray<Boolean> sparseArray = this.LIZ;
        if (z) {
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        sparseArray.put(i, bool);
    }

    public final void LJIIIIZZ(int i, boolean z) {
        boolean z2;
        LJII(i, z);
        if (C2199681B7e.LJFF != null && !C2199661B7c.LJIIL() && C1B7E.LIZ(true).LIZLLL()) {
            C1B7E.LIZ(true).LJJLIIIJLJLI(i, z);
        }
        synchronized (C2199681B7e.class) {
            z2 = C2199681B7e.LJJII;
        }
        if (!z2 && !C2199661B7c.LJIIL() && !C2199661B7c.LJIILJJIL()) {
            try {
                Intent intent = new Intent(C2199681B7e.LJFF(), (Class<?>) DownloadHandleService.class);
                intent.setAction("com.ss.android.downloader.action.PROCESS_NOTIFY");
                intent.putExtra("extra_download_id", i);
                C786410Ut5.s3(C2199681B7e.LJFF(), intent);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static List LJFF(List list, List list2, SparseArray sparseArray) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                DownloadInfo downloadInfo = (DownloadInfo) it2.next();
                if (downloadInfo != null && sparseArray.get(downloadInfo.getId()) == null) {
                    sparseArray.put(downloadInfo.getId(), downloadInfo);
                }
            }
        }
        if (list2 != null) {
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                DownloadInfo downloadInfo2 = (DownloadInfo) it3.next();
                if (downloadInfo2 != null && sparseArray.get(downloadInfo2.getId()) == null) {
                    sparseArray.put(downloadInfo2.getId(), downloadInfo2);
                }
            }
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            arrayList.add(sparseArray.get(sparseArray.keyAt(i)));
        }
        return arrayList;
    }

    public final void LIZ(int i, IDownloadListener iDownloadListener, C1B72 c1b72, boolean z) {
        InterfaceC2199641B7a interfaceC2199641B7aLIZIZ = LIZIZ(i);
        if (interfaceC2199641B7aLIZIZ == null) {
            return;
        }
        interfaceC2199641B7aLIZIZ.LIZJ(i, iDownloadListener.hashCode(), iDownloadListener, c1b72, z);
    }

    public final void LJI(int i, IDownloadListener iDownloadListener, C1B72 c1b72, boolean z) {
        int iHashCode;
        InterfaceC2199641B7a interfaceC2199641B7aLIZIZ = LIZIZ(i);
        if (interfaceC2199641B7aLIZIZ == null) {
            return;
        }
        if (iDownloadListener == null) {
            iHashCode = 0;
        } else {
            iHashCode = iDownloadListener.hashCode();
        }
        interfaceC2199641B7aLIZIZ.LJ(i, iHashCode, iDownloadListener, c1b72, z);
    }
}

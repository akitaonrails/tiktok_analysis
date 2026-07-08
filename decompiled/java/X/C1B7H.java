package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1B7H, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B7H {
    public final Map<Integer, RunnableC2199651B7b> LIZ = new ConcurrentHashMap();
    public final AtomicInteger LIZIZ = new AtomicInteger(0);

    public final void LIZIZ() {
        Iterator it2 = ((ConcurrentHashMap) this.LIZ).entrySet().iterator();
        while (it2.hasNext()) {
            if (!((RunnableC2199651B7b) ((Map.Entry) it2.next()).getValue()).LLJ.get()) {
                it2.remove();
            }
        }
    }

    public static void LIZJ(RunnableC2199651B7b runnableC2199651B7b) {
        int id;
        Future future;
        try {
            ExecutorService executorServiceLJIJI = C2199681B7e.LJIJI();
            DownloadTask downloadTask = runnableC2199651B7b.LLILLJJLI;
            if (downloadTask != null && downloadTask.getDownloadInfo() != null) {
                int executorGroup = downloadTask.getDownloadInfo().getExecutorGroup();
                if (executorGroup != 3) {
                    if (executorGroup == 4) {
                        executorServiceLJIJI = C2199681B7e.LJIILJJIL != null ? C2199681B7e.LJIILJJIL : C2199681B7e.LJIJI();
                    }
                } else {
                    executorServiceLJIJI = C2199681B7e.LJIILIIL != null ? C2199681B7e.LJIILIIL : C2199681B7e.LJIJI();
                }
            }
            if (executorServiceLJIJI != null && (executorServiceLJIJI instanceof ThreadPoolExecutor)) {
                ((ThreadPoolExecutor) executorServiceLJIJI).remove(runnableC2199651B7b);
                DownloadInfo downloadInfo = runnableC2199651B7b.LLJILJIL;
                if (downloadInfo != null) {
                    id = downloadInfo.getId();
                } else {
                    id = 0;
                }
                if (C2199751B7l.LJFF(id, null).LJI("pause_with_interrupt", false) && (future = runnableC2199651B7b.LL) != null) {
                    future.cancel(true);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static boolean LIZ(DownloadInfo downloadInfo, RunnableC2199651B7b runnableC2199651B7b) {
        JSONObject jSONObjectLJIIIZ;
        if (downloadInfo.getExpectFileLength() > 0 && (jSONObjectLJIIIZ = C2199751B7l.LJFF(downloadInfo.getId(), null).LJIIIZ("segment_config")) != null) {
            long jOptLong = jSONObjectLJIIIZ.optLong("expect_min_download_size");
            if (jOptLong >= 104857600) {
                if (downloadInfo.getExpectFileLength() > jOptLong) {
                    return true;
                }
                runnableC2199651B7b.LLJLILLLLZIIL = false;
                return false;
            }
        }
        return false;
    }
}

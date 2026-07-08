package X;

import Y.ARunnableS4S1001000_14;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.jvm.internal.AwS99S1000000_14;

/* JADX INFO: renamed from: X.0ZBu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C895680ZBu {
    public static ExecutorService LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static boolean LJI;
    public static boolean LJII;
    public static boolean LJIIIIZZ;
    public static ARunnableS4S1001000_14 LJIIIZ;
    public static RunnableC895670ZBt LJIIL;
    public static final C895680ZBu LIZ = new C895680ZBu();
    public static final Map<String, RunnableC895670ZBt> LIZIZ = new LinkedHashMap();
    public static final Map<String, List<InterfaceC856150XiH>> LIZJ = new LinkedHashMap();
    public static final BPEAHandler LJIIJ = new BPEAHandler(Looper.getMainLooper());
    public static long LJIIJJI = System.currentTimeMillis();

    public static void LIZ() {
        ARunnableS4S1001000_14 aRunnableS4S1001000_14 = LJIIIZ;
        if (aRunnableS4S1001000_14 != null) {
            LJIIJ.removeCallbacks(aRunnableS4S1001000_14);
        }
        LJIIIZ = null;
    }

    public static boolean LIZJ() {
        return !LJI;
    }

    public static final boolean LIZLLL(String str) {
        if (((LinkedHashMap) LIZIZ).get(str) != null || LJIIIZ != null) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(int i, String str) {
        Map<String, RunnableC895670ZBt> map = LIZIZ;
        RunnableC895670ZBt runnableC895670ZBt = (RunnableC895670ZBt) ((LinkedHashMap) map).get(str);
        if (runnableC895670ZBt != null && runnableC895670ZBt.LLILLJJLI != i) {
            Future<?> future = runnableC895670ZBt.LLILZLL;
            if (future != null) {
                future.cancel(true);
            }
            map.remove(str);
        }
        LIZ();
    }

    public static final void LJ(String str, InterfaceC856150XiH interfaceC856150XiH) {
        Map<String, List<InterfaceC856150XiH>> map = LIZJ;
        if (((LinkedHashMap) map).get(str) == null) {
            map.put(str, C1697810uHb.LJIILJJIL(interfaceC856150XiH));
            return;
        }
        List list = (List) ((LinkedHashMap) map).get(str);
        if (list == null) {
            return;
        }
        list.add(interfaceC856150XiH);
    }

    public static void LJFF(VideoPublishEditModel videoPublishEditModel, int i, ArrayList arrayList, InterfaceC895730ZBz interfaceC895730ZBz) {
        Future<?> futureSubmit;
        Future<?> future;
        if (LIZLLL == null) {
            LIZLLL = (ExecutorService) C19551411eS.LIZ.getValue();
        }
        String creationId = videoPublishEditModel.getCreationId();
        LIZ();
        Map<String, RunnableC895670ZBt> map = LIZIZ;
        RunnableC895670ZBt runnableC895670ZBt = (RunnableC895670ZBt) ((LinkedHashMap) map).get(creationId);
        if (runnableC895670ZBt != null && (future = runnableC895670ZBt.LLILZLL) != null) {
            future.cancel(true);
        }
        map.remove(creationId);
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("stage", 0);
        C1637890six.LJ("creative_tool_audio_copyright_detect", 0, c543670LTx.LJ());
        C895690ZBv.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        C538990LBx.LIZ(c2344009Gk, videoPublishEditModel);
        c2344009Gk.LIZJ(0, "stage");
        C20684815ws.LJIILLIIL("sound_copyright_detect", c2344009Gk.LIZ);
        RunnableC895670ZBt runnableC895670ZBt2 = new RunnableC895670ZBt(interfaceC895730ZBz, i, videoPublishEditModel, arrayList, new AwS99S1000000_14(creationId, 1));
        map.put(creationId, runnableC895670ZBt2);
        ExecutorService executorService = LIZLLL;
        if (executorService != null) {
            futureSubmit = executorService.submit(runnableC895670ZBt2);
        } else {
            futureSubmit = null;
        }
        runnableC895670ZBt2.LLILZLL = futureSubmit;
    }
}

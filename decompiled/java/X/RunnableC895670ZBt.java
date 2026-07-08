package X;

import Y.ARunnableS4S1001000_14;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.audio.copyrightdetect.PreCheckResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Future;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS99S1000000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZBt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class RunnableC895670ZBt implements Runnable {
    public final InterfaceC895730ZBz LL;
    public final int LLILLJJLI;
    public final VideoPublishEditModel LLILLL;
    public final ArrayList<Integer> LLILZ;
    public final Function0<Unit> LLILZIL;
    public Future<?> LLILZLL;

    public final void LIZ() {
        C895680ZBu c895680ZBu = C895680ZBu.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c895680ZBu.getClass();
        C895680ZBu.LJIIJJI = jCurrentTimeMillis;
        C895680ZBu.LJIIL = this;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            LIZIZ(0, 102, "", null);
            C895680ZBu.LJIIIIZZ = false;
            String creationId = this.LLILLL.getCreationId();
            int i = this.LLILLJJLI;
            C895680ZBu.LIZ();
            ARunnableS4S1001000_14 aRunnableS4S1001000_14 = new ARunnableS4S1001000_14(i, creationId, 0);
            C786410Ut5.LJLIIL(15000L, C895680ZBu.LJIIJ, aRunnableS4S1001000_14);
            C895680ZBu.LJIIIZ = aRunnableS4S1001000_14;
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            String strLIZ = this.LL.LIZ();
            linkedHashMap.put("extract_audio", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
            if (strLIZ.length() != 0) {
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                C1851780yHw c1851780yHw = C1851780yHw.LIZ;
                String parent = new C0VSJ(strLIZ).getParent();
                if (parent == null) {
                    parent = "";
                }
                C895660ZBs c895660ZBs = new C895660ZBs(linkedHashMap, jCurrentTimeMillis3, this);
                c1851780yHw.getClass();
                C1851780yHw.LIZ(strLIZ, parent, c895660ZBs);
                return;
            }
            LIZIZ(1, -100, "", null);
            C543670LTx c543670LTx = new C543670LTx();
            c543670LTx.LIZ.put("stage", 1);
            c543670LTx.LIZ.put("result", -100);
            C1637890six.LJ("creative_tool_audio_copyright_detect", -100, c543670LTx.LJ());
            long jCurrentTimeMillis4 = System.currentTimeMillis() - C895680ZBu.LJIIJJI;
            C895690ZBv c895690ZBv = C895690ZBv.LIZ;
            VideoPublishEditModel videoPublishEditModel = this.LLILLL;
            EnumC895720ZBy enumC895720ZBy = EnumC895720ZBy.RESULT_GET_AUDIO_FAIL;
            EnumC895700ZBw enumC895700ZBw = EnumC895700ZBw.PROCESS_NOT_STARTED;
            c895690ZBv.getClass();
            C895690ZBv.LIZ(videoPublishEditModel, enumC895720ZBy, jCurrentTimeMillis4, linkedHashMap, enumC895700ZBw, "extra audio fail", 0, 0);
            this.LLILZIL.invoke();
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_audio_copyright_detect_bugfix", true) == 1) {
                C895690ZBv c895690ZBv2 = C895690ZBv.LIZ;
                VideoPublishEditModel videoPublishEditModel2 = this.LLILLL;
                EnumC895720ZBy enumC895720ZBy2 = EnumC895720ZBy.RESULT_PROCESS_CANCELED;
                long jCurrentTimeMillis5 = System.currentTimeMillis();
                C895680ZBu.LIZ.getClass();
                long j = jCurrentTimeMillis5 - C895680ZBu.LJIIJJI;
                EnumC895710ZBx enumC895710ZBx = EnumC895710ZBx.PROCESS_CANCEL;
                c895690ZBv2.getClass();
                EnumC895700ZBw enumC895700ZBwLIZIZ = C895690ZBv.LIZIZ(enumC895710ZBx);
                String message = e.getMessage();
                if (message == null) {
                    message = "copyright detect canceled";
                }
                C895690ZBv.LIZ(videoPublishEditModel2, enumC895720ZBy2, j, linkedHashMap, enumC895700ZBwLIZIZ, message, -2, 0);
                this.LLILZIL.invoke();
                LIZIZ(1, -200, "", null);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("AudioCopyrightDetectProcessManager$InnerDetectProcess@d4d6.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AudioCopyrightDetectProcessManager$InnerDetectProcess@d4d6.run");
    }

    public final void LIZIZ(int i, int i2, String str, HashMap<Integer, PreCheckResult> map) {
        if (i != 0 && Intrinsics.LJFF(this, C895680ZBu.LJIIL)) {
            C895680ZBu.LIZ.getClass();
            C895680ZBu.LIZ();
        }
        List list = (List) ((LinkedHashMap) C895680ZBu.LIZJ).get(this.LLILLL.getCreationId());
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((InterfaceC856150XiH) it2.next()).LIZ(i, map, i2, this.LLILLJJLI);
            }
        }
    }

    public RunnableC895670ZBt(InterfaceC895730ZBz interfaceC895730ZBz, int i, VideoPublishEditModel videoPublishEditModel, ArrayList arrayList, AwS99S1000000_14 awS99S1000000_14) {
        this.LL = interfaceC895730ZBz;
        this.LLILLJJLI = i;
        this.LLILLL = videoPublishEditModel;
        this.LLILZ = arrayList;
        this.LLILZIL = awS99S1000000_14;
    }
}

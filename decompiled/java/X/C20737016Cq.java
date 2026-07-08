package X;

import Y.ARunnableS104S0000000_31;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.boost.CpusetManager;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.16Cq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20737016Cq {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LIZ(String[] strArr, long j, int i) {
        if ((i & 2) != 0) {
            j = 2000;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (String str : strArr) {
            switch (str.hashCode()) {
                case -1641276893:
                    if (str.equals("start_boot_finish")) {
                        C2187451AjH.LJ(j);
                    }
                    break;
                case -1574044000:
                    if (str.equals("start_jit_compile_opt")) {
                        C2187451AjH.LJJIJIIJIL(j);
                    }
                    break;
                case -1534296074:
                    if (str.equals("start_do_frame")) {
                        C0N5P.LIZ.LIZLLL("Comment", new C0N5R(16L, 30L));
                    }
                    break;
                case -1147420370:
                    if (str.equals("play_thread_priority")) {
                        Iterator it2 = ((LinkedHashMap) C1845907Kv.LIZ).entrySet().iterator();
                        while (it2.hasNext()) {
                            JatoXL.setPriority(((Number) ((Map.Entry) it2.next()).getValue()).intValue(), 10);
                        }
                    }
                    break;
                case -987889088:
                    if (str.equals("stop_jit_compile_opt")) {
                        int i2 = C2187451AjH.LIZ;
                        C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS104S0000000_31(1));
                    }
                    break;
                case -873534013:
                    if (str.equals("stop_boot_finish")) {
                        int i3 = C2187451AjH.LIZ;
                        C799900VZk.LIZ.getClass();
                        C799900VZk.LIZIZ();
                    }
                    break;
                case -787384802:
                    if (str.equals("reset_play_thread_priority")) {
                        Iterator it3 = ((LinkedHashMap) C1845907Kv.LIZ).entrySet().iterator();
                        while (it3.hasNext()) {
                            JatoXL.resetPriority(((Number) ((Map.Entry) it3.next()).getValue()).intValue());
                        }
                    }
                    break;
                case -609840717:
                    if (str.equals("main_thread_priority")) {
                        JatoXL.setPriority(Process.myTid(), -20);
                        JatoXL.boostRenderThread(C1BWL.LIZ(), -20);
                    }
                    break;
                case -249805149:
                    if (str.equals("reset_main_thread_priority")) {
                        JatoXL.resetPriority(Process.myTid());
                        JatoXL.resetRenderThread();
                    }
                    break;
                case -181369264:
                    if (str.equals("reset_bind_big_core")) {
                        CpusetManager.resetCoreBind();
                        Iterator it4 = ((LinkedHashMap) C1845907Kv.LIZ).entrySet().iterator();
                        while (it4.hasNext()) {
                            CpusetManager.resetCoreBind(((Number) ((Map.Entry) it4.next()).getValue()).intValue());
                        }
                    }
                    break;
                case 237866304:
                    if (str.equals("bind_big_core")) {
                        CpusetManager.bindBigCore();
                        Iterator it5 = ((LinkedHashMap) C1845907Kv.LIZ).entrySet().iterator();
                        while (it5.hasNext()) {
                            CpusetManager.bindLittleCore(((Number) ((Map.Entry) it5.next()).getValue()).intValue());
                        }
                    }
                    break;
                case 696939573:
                    if (str.equals("start_log_block")) {
                        C2187451AjH.LJII(j, true);
                    }
                    break;
                case 858632149:
                    if (str.equals("stop_log_block")) {
                        C2187451AjH.LJJIIZ();
                    }
                    break;
                case 1097567046:
                    if (str.equals("start_jit_block")) {
                        int i4 = C2187451AjH.LIZ;
                    }
                    break;
                case 1103319126:
                    if (str.equals("stop_do_frame")) {
                        C0N5P c0n5p = C0N5P.LIZ;
                        C0N5P.LJ("Comment");
                    }
                    break;
                case 1259259622:
                    if (str.equals("stop_jit_block")) {
                        int i5 = C2187451AjH.LIZ;
                    }
                    break;
                case 1277320647:
                    str.equals("rv_cache");
                    break;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("boost: ");
        sbLIZ.append(C13LQ.LJLI(strArr));
        sbLIZ.append(", use time ");
        sbLIZ.append(SystemClock.uptimeMillis() - jUptimeMillis);
        C1344030l4z.LIZJ("CommentBoostHelper", C2188811AlT.LIZIZ(sbLIZ));
    }
}

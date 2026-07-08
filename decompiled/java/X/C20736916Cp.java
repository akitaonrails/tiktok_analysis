package X;

import android.os.Process;
import android.os.SystemClock;
import com.bytedance.common.jato.JatoXL;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.16Cp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20736916Cp {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LIZ(List list) {
        SystemClock.uptimeMillis();
        for (String str : (ArrayList) list) {
            switch (str.hashCode()) {
                case -1641276893:
                    if (str.equals("start_boot_finish")) {
                        C2187451AjH.LJ(1000L);
                    }
                    break;
                case -1534296074:
                    if (str.equals("start_do_frame")) {
                        C0N5P.LIZ.LIZLLL("Inbox", new C0N5R(16L, 30L));
                    }
                    break;
                case 696939573:
                    if (str.equals("start_log_block")) {
                        C2187451AjH.LJII(3000L, true);
                    }
                    break;
                case 1097567046:
                    if (str.equals("start_jit_block")) {
                        int i = C2187451AjH.LIZ;
                    }
                    break;
                case 1346029625:
                    if (str.equals("thread_priority")) {
                        JatoXL.setPriority(Process.myTid(), -20);
                        JatoXL.boostRenderThread(C1BWL.LIZ(), -20);
                    }
                    break;
                case 1630165671:
                    if (str.equals("start_gc_block")) {
                        C2187451AjH.LJFF(3000L);
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LIZIZ(List list) {
        SystemClock.uptimeMillis();
        for (String str : (ArrayList) list) {
            switch (str.hashCode()) {
                case -2107392695:
                    if (str.equals("reset_thread_priority")) {
                        JatoXL.resetPriority(Process.myTid());
                        JatoXL.resetRenderThread();
                    }
                    break;
                case -873534013:
                    if (str.equals("stop_boot_finish")) {
                        int i = C2187451AjH.LIZ;
                        C799900VZk.LIZ.getClass();
                        C799900VZk.LIZIZ();
                    }
                    break;
                case -27186425:
                    if (str.equals("stop_gc_block")) {
                        C2187451AjH.LJJIIJZLJL();
                    }
                    break;
                case 858632149:
                    if (str.equals("stop_log_block")) {
                        C2187451AjH.LJJIIZ();
                    }
                    break;
                case 1259259622:
                    if (str.equals("stop_jit_block")) {
                        int i2 = C2187451AjH.LIZ;
                    }
                    break;
            }
        }
    }
}

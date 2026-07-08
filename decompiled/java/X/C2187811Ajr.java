package X;

import android.os.Process;
import com.bytedance.common.jato.JatoXL;
import kotlin.jvm.internal.AFwS224S0000000_33;

/* JADX INFO: renamed from: X.1Ajr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2187811Ajr {
    public static void LIZ() {
        if (!((Boolean) C2187821Ajs.LIZ.getValue()).booleanValue()) {
            C2187801Ajq.LJFF();
            return;
        }
        if (!C584360Mvy.LIZJ()) {
            if (C2187821Ajs.LIZJ() || C2187821Ajs.LIZLLL()) {
                JatoXL.resetPriority(Process.myTid());
                return;
            }
            return;
        }
        if (!C104100aN.LIZ().isNewUser()) {
            C2187841Aju.LIZ.getClass();
            int iLIZ = C2187841Aju.LIZ();
            int i = C2187841Aju.LJIIIZ;
            if ((iLIZ & i) != i) {
                return;
            }
        } else if (!C104100aN.LIZ().LJJIJ(AFwS224S0000000_33.get$arr$(665))) {
            return;
        }
        C2187801Ajq.LJFF();
    }

    public static void LIZIZ() {
        if (!((Boolean) C2187821Ajs.LIZ.getValue()).booleanValue()) {
            C2187801Ajq.LJ();
            return;
        }
        if (!C584360Mvy.LIZJ()) {
            if (C2187821Ajs.LIZJ()) {
                JatoXL.setPriority(Process.myTid(), -12);
                return;
            } else {
                if (C2187821Ajs.LIZLLL()) {
                    JatoXL.setPriority(Process.myTid(), -16);
                    return;
                }
                return;
            }
        }
        if (!C104100aN.LIZ().isNewUser()) {
            C2187841Aju.LIZ.getClass();
            int iLIZ = C2187841Aju.LIZ();
            int i = C2187841Aju.LJIIIZ;
            if ((iLIZ & i) != i) {
                return;
            }
        } else if (!C104100aN.LIZ().LJJIJ(AFwS224S0000000_33.get$arr$(665))) {
            return;
        }
        C2187801Ajq.LJ();
    }
}

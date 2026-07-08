package X;

import Y.ARunnableS7S1100000_1;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.03Ev, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C811103Ev {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());

    public static final void LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdHybridLog");
        sbLIZ.append(' ');
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LIZIZ(Context context, String str) {
        if (context == null) {
            return;
        }
        try {
            if (((Boolean) C811203Ew.LIZ.getValue()).booleanValue()) {
                C786410Ut5.LJJZZIII(LIZ, new ARunnableS7S1100000_1(context, str, 4));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}

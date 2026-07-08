package X;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTextViewOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTextViewViewInitWarmUpOpt;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.internal.x;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0fEc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1119360fEc {
    public static void LIZ() {
        C1119390fEf.LIZIZ[0] = SystemClock.uptimeMillis();
        C1119850fFP c1119850fFP = C011Z.LIZ;
        if (c1119850fFP.LJJI == null) {
            C0URJ c0urj = new C0URJ();
            if (c1119850fFP.LJJI == null) {
                c1119850fFP.LJJI = c0urj;
            }
        }
        Executor executorC4 = C786410Ut5.c4(new C08UK());
        C1119380fEe c1119380fEe = new C1119380fEe();
        if (executorC4 == null) {
            executorC4 = C1119370fEd.LIZJ;
        }
        c1119380fEe.LIZ = executorC4;
        C1119370fEd c1119370fEdLIZIZ = C1119370fEd.LIZIZ();
        c1119370fEdLIZIZ.getClass();
        c1119370fEdLIZIZ.LIZIZ = c1119380fEe.LIZ;
        new BPEAHandler(Looper.getMainLooper());
        c1119370fEdLIZIZ.LIZ = true;
        boolean zEnable = LiveTextViewOptSetting.enable();
        C1114110f69.LIZ = zEnable;
        if (zEnable && LiveTextViewViewInitWarmUpOpt.getEnable()) {
            Context context = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context();
            ConcurrentHashSet<Integer> concurrentHashSet = C1105280eru.LIZ;
            if (context != null) {
                try {
                    ConcurrentHashSet<Integer> concurrentHashSet2 = C1105280eru.LIZ;
                    C1105280eru.LJ = ((Boolean) C1105280eru.LIZJ(View.class, (TextView) ((x) C1105280eru.LIZIZ.getValue()).LIZJ(TextView.class), context, null).getFirst()).booleanValue();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1105280eru.LJ = false;
                    C1CC2.LIZ("SimpleLiveTextView warmUp error", th);
                }
            }
        }
        C1119390fEf.LIZJ[0] = SystemClock.uptimeMillis();
    }
}

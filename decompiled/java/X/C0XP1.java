package X;

import Y.ARunnableS46S0300000_13;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.sdk.account.idv.model.IDVDecisionConf;
import java.lang.ref.WeakReference;
import java.util.concurrent.Semaphore;

/* JADX INFO: renamed from: X.0XP1, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XP1 {
    public static final C0XP1 LIZ = new C0XP1();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0XP4());
    public static final Semaphore LIZJ = new Semaphore(1);
    public static WeakReference<Activity> LIZLLL = new WeakReference<>(null);

    public static void LIZ(Context context, C0XP6 c0xp6, IDVDecisionConf iDVDecisionConf) {
        C0XO0.LIZLLL(context).LJII(new C0XGH(3));
        Activity activity = LIZLLL.get();
        if (activity != null) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS46S0300000_13(activity, c0xp6, iDVDecisionConf, 17));
        } else {
            new C0XP9(context, c0xp6, iDVDecisionConf).LIZ();
        }
    }
}

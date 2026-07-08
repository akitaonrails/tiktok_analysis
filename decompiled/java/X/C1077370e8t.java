package X;

import android.os.MessageQueue;
import com.ss.android.ugc.aweme.ad.experiment.AdLandPageResourceOptimizeExperiment;
import com.ss.android.ugc.aweme.ad.network.SingletonWebViewTasks;
import com.ss.android.ugc.aweme.ad.preload.network.SingletonWebView;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0e8t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1077370e8t implements MessageQueue.IdleHandler {
    public final int $t;
    public Object l0;

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        switch (this.$t) {
            case 0:
                return queueIdle$0(this);
            case 1:
                return queueIdle$1(this);
            default:
                return false;
        }
    }

    public static final boolean queueIdle$0(C1077370e8t c1077370e8t) {
        ((SingletonWebViewTasks) c1077370e8t.l0).getClass();
        if (AdLandPageResourceOptimizeExperiment.LIZ().enableNewWebviewOnLaunch) {
            SingletonWebView.INSTANCE.initWebivew();
            return false;
        }
        return false;
    }

    public static final boolean queueIdle$1(C1077370e8t c1077370e8t) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1077370e8t.l0;
        Unit unit = Unit.LIZ;
        C189200o6.m2constructorimpl(unit);
        interfaceC20236714Gf.resumeWith(unit);
        return false;
    }

    public C1077370e8t(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}

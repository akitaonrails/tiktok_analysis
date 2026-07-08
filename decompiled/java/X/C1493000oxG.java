package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.net.mutli.network.SpeedModeServiceImpl;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0oxG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1493000oxG extends C09AY implements Function0<C1493010oxH> {
    public final /* synthetic */ SpeedModeServiceImpl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1493000oxG(SpeedModeServiceImpl speedModeServiceImpl) {
        super(0);
        this.LL = speedModeServiceImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1493010oxH invoke() {
        C1493010oxH c1493010oxH = C1493120oxS.LIZ;
        Object value = this.LL.LJII.getValue();
        if (value == null) {
            c1493010oxH.getClass();
            throw new NullPointerException("observer == null");
        }
        synchronized (c1493010oxH) {
            try {
                if (!((HashMap) c1493010oxH.LIZIZ).containsKey(value)) {
                    ((HashMap) c1493010oxH.LIZIZ).put(value, new BPEAHandler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c1493010oxH;
    }
}

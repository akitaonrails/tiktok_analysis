package X;

import android.os.Looper;
import com.bytedance.android.livesdk.game.broadcast.setting.MobileHighPingOptimizeInfo;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0UhL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C779130UhL implements C0UWD {
    public static final int LIZLLL;
    public static final int LJ;
    public static final int LJFF;
    public final ArrayBlockingQueue<Long> LIZ = new ArrayBlockingQueue<>(LIZLLL);
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());

    static {
        MobileHighPingOptimizeInfo mobileHighPingOptimizeInfo = MobileHighPingOptimizeInfo.INSTANCE;
        LIZLLL = mobileHighPingOptimizeInfo.getValue().getValid_high_ping_reference_count();
        LJ = mobileHighPingOptimizeInfo.getValue().getHigh_ping_tips_trigger_count();
        LJFF = mobileHighPingOptimizeInfo.getValue().getHigh_ping_value();
    }

    @Override // X.C0UWD
    public final void LIZ() {
        this.LIZ.clear();
    }

    @Override // X.C0UWD
    public final void LIZIZ() {
        this.LIZIZ.set(false);
        this.LIZ.clear();
    }
}

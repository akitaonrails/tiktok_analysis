package X;

import Y.ARunnableS107S0100000_7;
import android.os.Looper;
import com.bytedance.android.livesdk.livefinishcard.LiveEndPageOptSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0IHO, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IHO {
    public C0IHQ LIZ;
    public boolean LIZLLL;
    public final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public final HashMap<Long, Long> LIZJ = new HashMap<>();
    public final long LJ = LiveEndPageOptSetting.INSTANCE.getAutoRemoveTimeMs();
    public final ARunnableS107S0100000_7 LJFF = new ARunnableS107S0100000_7(this, 244);
}

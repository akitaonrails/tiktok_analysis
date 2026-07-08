package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.gift.LiveDebugtoolApiHistorySetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IiM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C474000IiM {
    public static final MutableLiveData<List<Map<String, Object>>> LIZ = new MutableLiveData<>(C13BV.INSTANCE);
    public static final boolean LIZIZ;
    public static final List<String> LIZJ;

    static {
        LiveDebugtoolApiHistorySetting liveDebugtoolApiHistorySetting = LiveDebugtoolApiHistorySetting.INSTANCE;
        boolean z = false;
        if (liveDebugtoolApiHistorySetting.isEnabled()) {
            IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
            if (Intrinsics.LJFF(iHostAppContext.getChannel(), "local_test") || iHostAppContext.isRegressionTest()) {
                z = true;
            }
        }
        LIZIZ = z;
        LIZJ = liveDebugtoolApiHistorySetting.getAllowlist();
    }
}

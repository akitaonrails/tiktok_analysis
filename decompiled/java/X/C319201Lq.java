package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.01Lq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C319201Lq {
    public static final C319201Lq LIZ = new C319201Lq();
    public static WeakReference<Observer<String>> LIZIZ;
    public static Long LIZJ;

    public static Long LIZ() {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        Long l = LIZJ;
        if (l != null) {
            long jLongValue = l.longValue();
            ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
            if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null) {
                long jLJJJJZI = interfaceC20673515v3K4.LJJJJZI();
                if (jLJJJJZI <= 0) {
                    return null;
                }
                long j = jLJJJJZI - jLongValue;
                if (j < 0) {
                    return null;
                }
                return Long.valueOf(j);
            }
        }
        return null;
    }
}

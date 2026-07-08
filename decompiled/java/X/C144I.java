package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.signal.ITakoSignalService;

/* JADX INFO: renamed from: X.144I, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C144I {
    public static final ITakoContextAbility LIZ() {
        return ((ITakoSignalService) ServiceManager.get().getService(ITakoSignalService.class)).LIZ();
    }

    public static final ITakoContextAbility LIZIZ() {
        return ((ITakoSignalService) ServiceManager.get().getService(ITakoSignalService.class)).LIZJ();
    }
}

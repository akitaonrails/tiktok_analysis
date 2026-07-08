package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.hometab.base.spi.ITabProcessManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rLr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1585130rLr extends C09AY implements Function0<C1585230rM1> {
    public C1585130rLr() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1585230rM1 invoke() {
        C1585230rM1 c1585230rM1LIZIZ = C1585140rLs.LIZIZ;
        C1585140rLs.LIZIZ = null;
        if (c1585230rM1LIZIZ == null) {
            c1585230rM1LIZIZ = ((ITabProcessManager) ServiceManager.get().getService(ITabProcessManager.class)).LIZIZ();
        }
        c1585230rM1LIZIZ.LJI = C08TU.LIZ();
        return c1585230rM1LIZIZ;
    }
}

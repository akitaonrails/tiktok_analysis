package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yvt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C890070Yvt {
    public String LIZ = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId();
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C890060Yvs());

    public final ConcurrentHashMap<String, Object> LIZ() {
        String curUserId = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId();
        if (!Intrinsics.LJFF(curUserId, this.LIZ)) {
            this.LIZ = curUserId;
            ((ConcurrentHashMap) this.LIZIZ.getValue()).clear();
        }
        return (ConcurrentHashMap) this.LIZIZ.getValue();
    }
}

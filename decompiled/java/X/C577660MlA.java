package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.property.CanvasDurationConfig;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0MlA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C577660MlA {
    public static final C577660MlA LIZ = new C577660MlA();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(524));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(523));

    public static CanvasDurationConfig LIZ() {
        return ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LJI() ? C571540MbI.LIZ : new CanvasDurationConfig(10000, 10000, 10000);
    }
}

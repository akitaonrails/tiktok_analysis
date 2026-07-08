package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.strategy.api.IStrategyApi;

/* JADX INFO: renamed from: X.0pQT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1511110pQT {
    public static final C1511110pQT LIZ = new C1511110pQT();

    public static boolean LIZ() {
        C1511130pQV.LIZ.getClass();
        if (C070Q.LIZ() && ((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).LJJIJIL()) {
            return ((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).LJFF() || C1511130pQV.LIZ() == 2 || C1511130pQV.LIZ() == 3;
        }
        return false;
    }
}

package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.service.downgrade.DefaultLocalTestImpl;

/* JADX INFO: renamed from: X.10ae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@InterfaceC1294060jmO
public final class C19273010ae {
    public static final /* synthetic */ int LIZIZ = 0;
    public final LocalTestApi LIZ = (LocalTestApi) ServiceManager.get().getService(LocalTestApi.class);

    public static final boolean LIZIZ() {
        C19273210ag.LIZ.getClass();
        return !(C19273210ag.LIZIZ.LIZ == null ? true : r0 instanceof DefaultLocalTestImpl);
    }
}

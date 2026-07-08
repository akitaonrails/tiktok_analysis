package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10OW, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10OW extends AbstractC1878307Xh {
    public static final C10OW LIZ = new C10OW();
    public static Boolean LIZIZ;

    @Override // X.InterfaceC1878707Xl
    public final String getName() {
        return "is_preinstall";
    }

    @Override // X.AbstractC1878307Xh
    public final boolean LIZLLL() {
        if (LIZIZ == null) {
            LIZIZ = Boolean.valueOf(((IAppsflyerApi) ServiceManager.get().getService(IAppsflyerApi.class)).LIZJ().length() > 0);
        }
        return Intrinsics.LJFF(LIZIZ, Boolean.TRUE);
    }
}

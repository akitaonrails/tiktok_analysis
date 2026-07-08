package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zq8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1911420zq8 extends C09AY implements Function0<INewUserDebugService> {
    public C1911420zq8() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final INewUserDebugService invoke() {
        return ServiceManager.get().getService(INewUserDebugService.class);
    }
}

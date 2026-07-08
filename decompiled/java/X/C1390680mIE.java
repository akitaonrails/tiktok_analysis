package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.newusermode.INewUserModeService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mIE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1390680mIE extends C09AY implements Function0<INewUserModeService> {
    public C1390680mIE() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.service.newusermode.INewUserModeService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final INewUserModeService invoke() {
        return ServiceManager.get().getService(INewUserModeService.class);
    }
}

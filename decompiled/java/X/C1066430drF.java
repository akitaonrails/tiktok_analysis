package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IAnchorService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0drF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1066430drF extends C09AY implements Function0<IAnchorService> {
    public C1066430drF() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final IAnchorService invoke() {
        return ((IExternalService) ServiceManager.get().getService(IExternalService.class)).anchorService();
    }
}

package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0lxW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1377840lxW extends C09AY implements Function0<String> {
    public C1377840lxW() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        C1377830lxV.LIZ.getClass();
        return new C0VSJ(((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().cacheConfig().cacheDir(), "gif").getPath();
    }
}

package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ShY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C728300ShY extends C09AY implements Function0<Long> {
    public C728300ShY() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().avsettingsConfig().longVideoThresholdWithTolerance());
    }
}

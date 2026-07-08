package X;

import com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0boC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C987660boC extends C09AY implements Function0<ITcmService> {
    public C987660boC() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ITcmService invoke() {
        return ServiceManager.get().getService(ITcmService.class);
    }
}

package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.161J, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C161J extends C09AY implements Function0<ISettingService> {
    public C161J() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.setting.services.ISettingService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ISettingService invoke() {
        return ServiceManager.get().getService(ISettingService.class);
    }
}

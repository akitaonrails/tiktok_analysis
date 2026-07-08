package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15ic, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20596415ic extends C09AY implements Function0<Boolean> {
    public C20596415ic() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        ISettingService iSettingService = (ISettingService) ServiceManager.get().getService(ISettingService.class);
        return Boolean.valueOf(iSettingService != null ? iSettingService.shouldUseFasterPaging() : ((Boolean) C303340Bum.LIZJ.getValue()).booleanValue());
    }
}

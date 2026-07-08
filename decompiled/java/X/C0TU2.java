package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.services.ISettingDependService;

/* JADX INFO: renamed from: X.0TU2, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TU2 implements ISettingDependService {
    public static final C0TU2 LIZIZ = new C0TU2();
    public final /* synthetic */ ISettingDependService LIZ = (ISettingDependService) ServiceManager.get().getService(ISettingDependService.class);

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingDependService
    public final String LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingDependService
    public final void LIZIZ(Context context, Aweme aweme) {
        this.LIZ.LIZIZ(context, aweme);
    }
}

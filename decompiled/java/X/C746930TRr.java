package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0TRr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C746930TRr extends C09AY implements Function0<String> {
    public C746930TRr() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        try {
            return ((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage().toLowerCase(Locale.getDefault());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "en";
        }
    }
}

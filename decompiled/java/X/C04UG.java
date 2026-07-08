package X;

import com.ss.android.ugc.aweme.IGuestModeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04UG, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04UG extends C09AY implements Function0<Boolean> {
    public C04UG() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((IGuestModeService) ServiceManager.get().getService(IGuestModeService.class)).isGuestMode());
    }
}

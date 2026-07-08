package X;

import com.ss.android.ugc.aweme.IGuestModeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04UH, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04UH extends C09AY implements Function0<Object> {
    public C04UH() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Boolean.valueOf(((IGuestModeService) ServiceManager.get().getService(IGuestModeService.class)).isGuestMode());
    }
}

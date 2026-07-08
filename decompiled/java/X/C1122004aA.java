package X;

import com.ss.android.ugc.aweme.IGuestModeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04aA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1122004aA extends C09AY implements Function0<Object> {
    public C1122004aA() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Long.valueOf(((IGuestModeService) ServiceManager.get().getService(IGuestModeService.class)).isGuestMode() ? 1L : 0L);
    }
}

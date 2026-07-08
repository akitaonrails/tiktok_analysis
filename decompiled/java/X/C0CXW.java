package X;

import com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CXW, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CXW extends C09AY implements Function0<Boolean> {
    public C0CXW() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((IProtectionService) ServiceManager.get().getService(IProtectionService.class)).LJJJJZI());
    }
}

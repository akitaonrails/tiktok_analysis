package X;

import com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CXX, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CXX extends C09AY implements Function0<Object> {
    public C0CXX() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Boolean.valueOf(((IProtectionService) ServiceManager.get().getService(IProtectionService.class)).LJJJJZI());
    }
}

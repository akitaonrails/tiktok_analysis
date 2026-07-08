package X;

import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0XIk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C846440XIk extends C09AY implements Function0<Integer> {
    public C846440XIk() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        ((IAccountUserService) ServiceManager.get().getService(IAccountUserService.class)).LIZIZ();
        return 3;
    }
}

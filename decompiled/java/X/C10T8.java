package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10T8, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10T8 extends C09AY implements Function0<IAccountService> {
    public C10T8() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.IAccountService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IAccountService invoke() {
        return PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
    }
}

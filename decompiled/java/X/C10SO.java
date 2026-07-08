package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10SO, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10SO extends C09AY implements Function0<INewUserDebugService> {
    public C10SO() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final INewUserDebugService invoke() {
        return PluggableExtentionKt.pluggableSpi$default(INewUserDebugService.class, false, false, false, 14, null);
    }
}

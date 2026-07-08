package X;

import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05NC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05NC extends C09AY implements Function0<String> {
    public C05NC() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        User currentUser;
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null) {
            return null;
        }
        return currentUser.getUid();
    }
}

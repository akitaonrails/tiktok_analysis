package X;

import com.ss.android.ugc.aweme.experiment.FollowFeedCombineOptimizeExpObject;
import com.ss.android.ugc.aweme.experiment.INewUserDefaultGroup;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07Js, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1843007Js extends C09AY implements Function0<Boolean> {
    public C1843007Js() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z = true;
        if (!((INewUserDefaultGroup) ServiceManager.get().getService(INewUserDefaultGroup.class)).LIZ() && C0C64.LJIILLIIL().LJIIIZ(31744, "follow_feed_combine_opt_exp", true, false) != FollowFeedCombineOptimizeExpObject.INSTANCE.getV1()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

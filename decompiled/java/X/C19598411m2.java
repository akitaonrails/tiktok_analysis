package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.socialavatar.api.ISocialAvatarStoryPostService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.11m2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19598411m2 extends C09AY implements Function0<Boolean> {
    public C19598411m2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z = false;
        ISocialAvatarStoryPostService iSocialAvatarStoryPostService = (ISocialAvatarStoryPostService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarStoryPostService.class, false, false, false, 14, null);
        if (iSocialAvatarStoryPostService != null && iSocialAvatarStoryPostService.enable()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

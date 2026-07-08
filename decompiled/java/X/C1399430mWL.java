package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mWL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1399430mWL extends C09AY implements Function0<ISocialAvatarCreationStatusService> {
    public C1399430mWL() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ISocialAvatarCreationStatusService invoke() {
        return PluggableExtentionKt.pluggableSpi$default(ISocialAvatarCreationStatusService.class, false, false, false, 14, null);
    }
}

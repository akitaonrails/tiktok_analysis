package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarAccess;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0j12, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1264700j12 extends C09AY implements Function0<SocialAvatarAccess> {
    public C1264700j12() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.ur.socialavatar.SocialAvatarAccess, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final SocialAvatarAccess invoke() {
        return ServiceManager.get().getService(SocialAvatarAccess.class);
    }
}

package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.push.api.IMPushApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0W5k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C817580W5k extends C09AY implements Function0<IMPushApi> {
    public C817580W5k() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.push.api.IMPushApi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IMPushApi invoke() {
        return ServiceManager.get().getService(IMPushApi.class);
    }
}

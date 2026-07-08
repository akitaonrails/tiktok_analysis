package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rjM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1599700rjM extends C09AY implements Function0<IMSharePanelApi> {
    public C1599700rjM() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IMSharePanelApi invoke() {
        return ServiceManager.get().getService(IMSharePanelApi.class);
    }
}

package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.069Q, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C069Q extends C09AY implements Function0<IMContactApi> {
    public C069Q() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.contacts.api.IMContactApi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IMContactApi invoke() {
        return ServiceManager.get().getService(IMContactApi.class);
    }
}

package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.api.activestatus.IMSaasActiveStatusApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ZIf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C897350ZIf extends C09AY implements Function0<IMSaasActiveStatusApi> {
    public C897350ZIf() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.saas.api.activestatus.IMSaasActiveStatusApi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IMSaasActiveStatusApi invoke() {
        return PluggableExtentionKt.pluggableSpi$default(IMSaasActiveStatusApi.class, false, false, false, 14, null);
    }
}

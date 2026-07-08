package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.im.contact.ISaasUserUpdateMonitor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ZJ2, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZJ2 extends C09AY implements Function0<ISaasUserUpdateMonitor> {
    public C0ZJ2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.im.saas.host.api.im.contact.ISaasUserUpdateMonitor, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ISaasUserUpdateMonitor invoke() {
        ISaasUserUpdateMonitor.LIZ.getClass();
        return PluggableExtentionKt.pluggableSpiForReal(ISaasUserUpdateMonitor.class);
    }
}

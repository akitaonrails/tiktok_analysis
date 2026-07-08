package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.api.privacy.IIMSaasUnder16Proxy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Nbm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C597320Nbm extends C09AY implements Function0<IIMSaasUnder16Proxy> {
    public C597320Nbm() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.saas.api.privacy.IIMSaasUnder16Proxy, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IIMSaasUnder16Proxy invoke() {
        return PluggableExtentionKt.pluggableSpi$default(IIMSaasUnder16Proxy.class, false, false, false, 14, null);
    }
}

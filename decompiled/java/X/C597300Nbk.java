package X;

import com.ss.android.ugc.aweme.im.saas.api.privacy.IIMSaasUnder16Proxy;
import com.ss.android.ugc.aweme.im.saas.host.api.im.callback.IIMUnder16Proxy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Nbk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C597300Nbk extends C09AY implements Function0<IIMUnder16Proxy> {
    public C597300Nbk() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.ss.android.ugc.aweme.im.saas.api.privacy.IIMSaasUnder16Proxy, com.ss.android.ugc.aweme.im.saas.host.api.im.callback.IIMUnder16Proxy] */
    @Override // kotlin.jvm.functions.Function0
    public final IIMUnder16Proxy invoke() {
        IIMSaasUnder16Proxy.LIZ.getClass();
        IIMSaasUnder16Proxy value = C597310Nbl.LIZIZ.getValue();
        if (value instanceof IIMUnder16Proxy) {
            return value;
        }
        return null;
    }
}

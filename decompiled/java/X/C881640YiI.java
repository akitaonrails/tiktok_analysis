package X;

import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YiI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C881640YiI extends C09AY implements Function0<InterfaceC881630YiH> {
    public C881640YiI() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC881630YiH invoke() {
        C0YHX c0yhxLIZ;
        IIMCoreProxyService iIMCoreProxyService = (IIMCoreProxyService) PluggableExtentionKt.pluggableSpiForReal(IIMCoreProxyService.class);
        if (iIMCoreProxyService == null || (c0yhxLIZ = iIMCoreProxyService.LIZ(C0YM2.TIKTOK_SOCIAL_IM)) == null) {
            return null;
        }
        return c0yhxLIZ.LJIIIIZZ();
    }
}

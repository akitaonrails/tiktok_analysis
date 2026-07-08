package X;

import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YVx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C875430YVx extends C09AY implements Function0<IIMCoreProxyService> {
    public C875430YVx() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IIMCoreProxyService invoke() {
        return PluggableExtentionKt.pluggableSpiForReal(IIMCoreProxyService.class);
    }
}

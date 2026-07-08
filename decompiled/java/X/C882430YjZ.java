package X;

import com.bytedance.ies.im.core.api.proxy.IIMCoreDependProxyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YjZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C882430YjZ extends C09AY implements Function0<IIMCoreDependProxyService> {
    public C882430YjZ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.ies.im.core.api.proxy.IIMCoreDependProxyService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IIMCoreDependProxyService invoke() {
        return PluggableExtentionKt.pluggableSpiForReal(IIMCoreDependProxyService.class);
    }
}

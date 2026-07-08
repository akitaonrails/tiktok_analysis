package X;

import com.bytedance.ies.im.core.api.service.IGlobalActionExecutor;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Z5r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C894090Z5r extends C09AY implements Function0<IGlobalActionExecutor> {
    public C894090Z5r() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.ies.im.core.api.service.IGlobalActionExecutor, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IGlobalActionExecutor invoke() {
        return PluggableExtentionKt.pluggableSpiForReal(IGlobalActionExecutor.class);
    }
}

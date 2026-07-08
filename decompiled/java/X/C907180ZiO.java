package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ZiO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C907180ZiO extends C09AY implements Function0<IIMChatPerfLogger> {
    public C907180ZiO() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IIMChatPerfLogger invoke() {
        return PluggableExtentionKt.pluggableSpiForReal(IIMChatPerfLogger.class);
    }
}

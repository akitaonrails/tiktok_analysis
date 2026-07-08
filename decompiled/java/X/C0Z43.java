package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IIMHostApiWebSocket;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Z43, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z43 extends C09AY implements Function0<IIMHostApiWebSocket> {
    public C0Z43() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.saas.host.api.im.IIMHostApiWebSocket, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IIMHostApiWebSocket invoke() {
        return PluggableExtentionKt.pluggableSpiForReal(IIMHostApiWebSocket.class);
    }
}

package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareSendingEventApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Zsh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C913570Zsh extends C09AY implements Function0<IMShareSendingEventApi> {
    public C913570Zsh() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareSendingEventApi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IMShareSendingEventApi invoke() {
        IMShareSendingEventApi.LIZ.getClass();
        return PluggableExtentionKt.pluggableSpiForReal(IMShareSendingEventApi.class);
    }
}

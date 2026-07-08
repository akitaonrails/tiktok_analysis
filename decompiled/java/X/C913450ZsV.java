package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareCompleteEventApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ZsV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C913450ZsV extends C09AY implements Function0<IMShareCompleteEventApi> {
    public C913450ZsV() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareCompleteEventApi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IMShareCompleteEventApi invoke() {
        IMShareCompleteEventApi.LIZ.getClass();
        return PluggableExtentionKt.pluggableSpiForReal(IMShareCompleteEventApi.class);
    }
}

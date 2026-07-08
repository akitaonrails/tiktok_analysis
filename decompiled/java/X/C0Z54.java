package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMALogApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Z54, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z54 extends C09AY implements Function0<IMALogApi> {
    public C0Z54() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMALogApi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IMALogApi invoke() {
        return PluggableExtentionKt.pluggableSpi$default(IMALogApi.class, false, false, false, 14, null);
    }
}

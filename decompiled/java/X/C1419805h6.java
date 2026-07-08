package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05h6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1419805h6 extends C09AY implements Function0<IMHostApi> {
    public C1419805h6() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IMHostApi invoke() {
        return PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
    }
}

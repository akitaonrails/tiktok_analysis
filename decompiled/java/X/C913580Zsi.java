package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareUndoEventApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Zsi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C913580Zsi extends C09AY implements Function0<IMShareUndoEventApi> {
    public C913580Zsi() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareUndoEventApi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IMShareUndoEventApi invoke() {
        IMShareUndoEventApi.LIZ.getClass();
        return PluggableExtentionKt.pluggableSpiForReal(IMShareUndoEventApi.class);
    }
}

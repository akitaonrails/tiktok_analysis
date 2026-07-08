package X;

import com.ss.android.ugc.aweme.IHomeTabService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0J6Z, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J6Z extends C09AY implements Function0<IHomeTabService> {
    public C0J6Z() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.IHomeTabService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IHomeTabService invoke() {
        return PluggableExtentionKt.pluggableSpi$default(IHomeTabService.class, false, false, false, 14, null);
    }
}

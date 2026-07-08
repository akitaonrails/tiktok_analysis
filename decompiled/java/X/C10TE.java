package X;

import com.ss.android.ugc.aweme.IGuestModeService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10TE, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10TE extends C09AY implements Function0<IGuestModeService> {
    public C10TE() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.IGuestModeService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IGuestModeService invoke() {
        return PluggableExtentionKt.pluggableSpi$default(IGuestModeService.class, false, false, false, 14, null);
    }
}

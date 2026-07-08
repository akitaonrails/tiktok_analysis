package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IMainService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15OZ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15OZ extends C09AY implements Function0<IMainService> {
    public C15OZ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.services.IMainService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IMainService invoke() {
        return PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null);
    }
}

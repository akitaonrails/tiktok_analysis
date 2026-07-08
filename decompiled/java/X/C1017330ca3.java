package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IMainService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ca3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017330ca3 extends C09AY implements Function0<IMainService> {
    public C1017330ca3() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.services.IMainService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IMainService invoke() {
        return PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null);
    }
}

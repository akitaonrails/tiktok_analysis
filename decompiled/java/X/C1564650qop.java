package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.service.ISearchIconOutService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qop, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1564650qop extends C09AY implements Function0<ISearchIconOutService> {
    public C1564650qop() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.search.service.ISearchIconOutService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ISearchIconOutService invoke() {
        return PluggableExtentionKt.pluggableSpi$default(ISearchIconOutService.class, false, false, false, 14, null);
    }
}

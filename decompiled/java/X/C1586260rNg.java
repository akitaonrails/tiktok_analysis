package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.ISearchServiceLowEnd;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rNg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1586260rNg extends C09AY implements Function0<InterfaceC1355760lNu> {
    public C1586260rNg() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0lNu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0lNu, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1355760lNu invoke() {
        return C1157804fw.LIZ() ? ServiceManager.get().getService(ISearchServiceLowEnd.class) : ServiceManager.get().getService(ISearchService.class);
    }
}

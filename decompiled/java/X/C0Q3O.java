package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.ISearchService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Q3O, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q3O extends C09AY implements Function0<C0Q3P> {
    public C0Q3O() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0Q3P invoke() {
        ISearchService iSearchService = (ISearchService) PluggableExtentionKt.pluggableSpi$default(ISearchService.class, false, false, false, 14, null);
        if (iSearchService != null) {
            return iSearchService.LLLZLZ();
        }
        return null;
    }
}

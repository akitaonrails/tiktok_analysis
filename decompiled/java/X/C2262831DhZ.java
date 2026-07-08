package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.services.IAVFilterService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1DhZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2262831DhZ extends C09AY implements Function0<C2262821DhY> {
    public C2262831DhZ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1DhY] */
    @Override // kotlin.jvm.functions.Function0
    public final C2262821DhY invoke() {
        return new IAVFilterService() { // from class: X.1DhY
            @Override // com.ss.android.ugc.aweme.services.IAVFilterService
            public final String getFilterFolder(FilterBean filterBean) {
                return filterBean.getFilterFolder();
            }

            @Override // com.ss.android.ugc.aweme.services.IAVFilterService
            public final void setFilterFolder(FilterBean filterBean, String str) {
                filterBean.setFilterFolder(str);
            }
        };
    }
}

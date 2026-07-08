package X;

import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePanelComponentTempHelper;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qqh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1565810qqh extends C09AY implements Function0<ILoadMoreAbility> {
    public final /* synthetic */ LoadMorePanelComponentTempHelper LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1565810qqh(LoadMorePanelComponentTempHelper loadMorePanelComponentTempHelper) {
        super(0);
        this.LL = loadMorePanelComponentTempHelper;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.01wD, com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final ILoadMoreAbility invoke() {
        InterfaceC665370Q7z interfaceC665370Q7zLJ = C1578630rBN.LJ(this.LL.LL);
        if (interfaceC665370Q7zLJ != null) {
            return C1558520qew.LIZ(interfaceC665370Q7zLJ, ILoadMoreAbility.class, null);
        }
        return null;
    }
}

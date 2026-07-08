package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.IConversationBizCacheService;

/* JADX INFO: renamed from: X.0Z51, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z51 implements IConversationBizCacheService {
    public static final C0Z51 LIZIZ = new C0Z51();
    public final /* synthetic */ IConversationBizCacheService LIZ;

    @Override // com.ss.android.ugc.aweme.im.service.IConversationBizCacheService
    public final void initService() {
        this.LIZ.initService();
    }

    public C0Z51() {
        IConversationBizCacheService iConversationBizCacheService = (IConversationBizCacheService) PluggableExtentionKt.pluggableSpiForReal(IConversationBizCacheService.class);
        this.LIZ = iConversationBizCacheService == null ? new IConversationBizCacheService() { // from class: X.0Z52
            @Override // com.ss.android.ugc.aweme.im.service.IConversationBizCacheService
            public final void initService() {
            }
        } : iConversationBizCacheService;
    }
}

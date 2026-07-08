package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky.data.api.RiskyKeywordsService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05rp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1486305rp extends C09AY implements Function0<RiskyKeywordsService> {
    public C1486305rp() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky.data.api.RiskyKeywordsService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final RiskyKeywordsService invoke() {
        return ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C1477305qN.LIZJ).create(RiskyKeywordsService.class);
    }
}

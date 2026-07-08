package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RVe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C696880RVe extends C09AY implements Function1<C696930RVj<Object>, C696930RVj<Object>> {
    public final /* synthetic */ Object LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C696880RVe(BaseCellContentComponent baseCellContentComponent) {
        super(1);
        this.LL = baseCellContentComponent;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.assem.arch.reused.ReusedAssem, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final C696930RVj<Object> invoke(C696930RVj<Object> c696930RVj) {
        IFeedDebugService iFeedDebugService;
        Aweme aweme;
        C696930RVj<Object> c696930RVj2 = c696930RVj;
        if (C696920RVi.LIZ[c696930RVj2.LIZ.ordinal()] == 1 && (iFeedDebugService = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false)) != null) {
            VideoItemParams videoItemParams = (VideoItemParams) this.LL.bo();
            if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
                aweme.getAid();
            }
            iFeedDebugService.LJIIJJI();
        }
        return c696930RVj2;
    }
}

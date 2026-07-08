package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.topic.review.api.TopicReviewApi;

/* JADX INFO: renamed from: X.0Oi4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C626700Oi4 implements InterfaceC736910SvR<Object> {
    public final TopicReviewApi LL;
    public final C626720Oi6 LLILLJJLI;

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    public C626700Oi4() {
        TopicReviewApi.LIZ.getClass();
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(C844470XAv.LJIIIIZZ.LIZ);
        this.LL = (TopicReviewApi) iRetrofitFactory.LIZ(C2188811AlT.LIZIZ(sbLIZ)).create(TopicReviewApi.class);
        this.LLILLJJLI = new C626720Oi6(this);
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LLILLJJLI;
    }
}

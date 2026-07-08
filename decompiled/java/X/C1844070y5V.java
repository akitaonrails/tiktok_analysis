package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.vm.ICommerceAppReviewsApi;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0y5V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1844070y5V {
    public static final /* synthetic */ C1844070y5V LIZ = new C1844070y5V();
    public static final ICommerceAppReviewsApi LIZIZ = (ICommerceAppReviewsApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder("https://ad-format-sg.tiktokv.com").build().retrofit.LIZ(ICommerceAppReviewsApi.class);
}

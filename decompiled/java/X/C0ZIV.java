package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.api.VideoInfoFromURLResponse;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0ZIV, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZIV implements C0ZIW {
    public static final C0ZIV LIZIZ = new C0ZIV();
    public final /* synthetic */ C0ZIW LIZ = (C0ZIW) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZIZ).create(C0ZIW.class);

    @Override // X.C0ZIW
    @InterfaceC1501200pAU("/tiktok/v1/video/query_url/v2")
    public final AbstractC19484711Kz<VideoInfoFromURLResponse> LIZ(@InterfaceC1501120pAM("video_url") String str, @InterfaceC1501120pAM("video_id") long j) {
        return this.LIZ.LIZ(str, j);
    }
}

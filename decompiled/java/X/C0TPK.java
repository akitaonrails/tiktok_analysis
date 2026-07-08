package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.donation.token.DonationTokenCreateApi;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0TPK, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TPK {
    public static final /* synthetic */ C0TPK LIZ = new C0TPK();

    public static DonationTokenCreateApi LIZ() {
        return (DonationTokenCreateApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C2222691Bz1.LJIIIIZZ() ? "https://webcast.tiktokv.com" : "https://webcast-va.tiktokv.com").build().retrofit.LIZ(DonationTokenCreateApi.class);
    }

    public static DonationTokenCreateApi LIZIZ() {
        return (DonationTokenCreateApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(DonationTokenCreateApi.class);
    }
}

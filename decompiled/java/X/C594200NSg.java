package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.api.VoucherApi;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0NSg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C594200NSg {
    public static final /* synthetic */ C594200NSg LIZ = new C594200NSg();
    public static final InterfaceC2661011f LIZIZ = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder("https://oec-api.tiktokv.com").build();

    public static Object LIZ(C594200NSg c594200NSg, String str, long j, boolean z, String str2, int i, String str3, AbstractC23140094w abstractC23140094w) {
        c594200NSg.getClass();
        return ((VoucherApi) LIZIZ.create(VoucherApi.class)).claimVoucher(new VoucherApi.ClaimVoucherRequest(str, j, 1, z, 1, i, str2, str3), abstractC23140094w);
    }
}

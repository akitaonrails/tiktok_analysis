package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.tag.api.MentionCheckResponse;
import com.ss.android.ugc.aweme.tag.api.MentionRecentContactResponse;
import com.ss.android.ugc.aweme.tag.api.TagUpdateResponse;

/* JADX INFO: renamed from: X.15Nm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20510415Nm implements InterfaceC20510315Nl {
    public static final C20510415Nm LIZJ = new C20510415Nm();
    public final /* synthetic */ InterfaceC20510315Nl LIZIZ = (InterfaceC20510315Nl) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(InterfaceC20510315Nl.class);

    @Override // X.InterfaceC20510315Nl
    @InterfaceC1501200pAU("/tiktok/interaction/mention/general/check/v1")
    public final C11NZ<MentionCheckResponse> LJ(@InterfaceC1501120pAM("uids") String str, @InterfaceC1501120pAM("mention_type") String str2, @InterfaceC1501120pAM("is_check_aweme") boolean z, @InterfaceC1501120pAM("aweme_id") long j) {
        return this.LIZIZ.LJ(str, str2, z, j);
    }

    @Override // X.InterfaceC20510315Nl
    @InterfaceC1501200pAU("/tiktok/interaction/mention/general/aweme/check/v1")
    public final C11NZ<MentionCheckResponse> LJFF(@InterfaceC1501120pAM("aweme_id") long j) {
        return this.LIZIZ.LJFF(j);
    }

    @Override // X.InterfaceC20510315Nl
    @InterfaceC1501240pAY("/tiktok/interaction/mention/tag/update/v1")
    @InterfaceC1485505rh
    public final C11NZ<TagUpdateResponse> LJIIIZ(@InterfaceC1501100pAK("add_uids") String str, @InterfaceC1501100pAK("remove_uids") String str2, @InterfaceC1501100pAK("aweme_id") long j) {
        return this.LIZIZ.LJIIIZ(str, str2, j);
    }

    @Override // X.InterfaceC20510315Nl
    @InterfaceC1501200pAU("/tiktok/interaction/mention/recent/contact/query/v1")
    public final C0X9S<MentionRecentContactResponse> LJIIJ(@InterfaceC1501120pAM("mention_type") int i, @InterfaceC1501120pAM("aweme_id") long j, @InterfaceC1501120pAM("is_check_aweme") boolean z) {
        return this.LIZIZ.LJIIJ(i, j, z);
    }
}

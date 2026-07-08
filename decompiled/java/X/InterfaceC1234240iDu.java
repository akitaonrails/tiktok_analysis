package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.ExposeSharerData;
import com.ss.android.ugc.aweme.friends.model.ShortenUrlModel;
import com.ss.android.ugc.aweme.relation.model.LinkPrivacyPopupStatusResponse;
import com.ss.android.ugc.aweme.relation.model.SmgSettingsModel;

/* JADX INFO: renamed from: X.0iDu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public interface InterfaceC1234240iDu {
    @InterfaceC1501240pAY("/tiktok/privacy/setting/suggestion/update/v1")
    @InterfaceC1485505rh
    AbstractC19484711Kz<BaseResponse> LIZ(@InterfaceC1501100pAK("field") String str, @InterfaceC1501100pAK("value") int i);

    @InterfaceC1501200pAU("/tiktok/v1/link/privacy/popup/status/")
    AbstractC19484711Kz<LinkPrivacyPopupStatusResponse> LIZIZ();

    @InterfaceC1501240pAY("/ug/social/invite/msg/short_url/")
    @InterfaceC1485505rh
    AbstractC19484711Kz<ShortenUrlModel> LIZJ(@InterfaceC1501100pAK("url") String str);

    @InterfaceC1501200pAU("/ug/social/invite/msg/settings/")
    AbstractC19484711Kz<SmgSettingsModel> LIZLLL();

    @InterfaceC1501240pAY("/tiktok/v1/link/privacy/popup/status/update/")
    @InterfaceC1485505rh
    AbstractC19484711Kz<BaseResponse> LJ(@InterfaceC1501100pAK("displayed") boolean z);

    @InterfaceC1501200pAU("/tiktok/v1/sharer/info/")
    C11NZ<ExposeSharerData> LJFF(@InterfaceC1501120pAM("link_id") String str, @InterfaceC1501120pAM("share_type") int i, @InterfaceC1501120pAM("share_source") String str2, @InterfaceC1501120pAM("from_uid") String str3, @InterfaceC1501120pAM("sec_from_uid") String str4, @InterfaceC1501120pAM("item_id") String str5, @InterfaceC1501120pAM("checksum") String str6, @InterfaceC1501120pAM("timestamp") String str7, @InterfaceC1501120pAM("invitation_scene") String str8, @InterfaceC1501120pAM("share_url") String str9, @InterfaceC1501120pAM("share_link_mode") int i2, @InterfaceC1501120pAM("live_link_relation_ab") Integer num);
}

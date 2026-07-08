package X;

import com.ss.android.ugc.aweme.tag.api.MentionCheckResponse;
import com.ss.android.ugc.aweme.tag.api.MentionRecentContactResponse;
import com.ss.android.ugc.aweme.tag.api.TagUpdateResponse;

/* JADX INFO: renamed from: X.15Nl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public interface InterfaceC20510315Nl {
    public static final C737540SwS LIZ = C737540SwS.LIZ;

    @InterfaceC1501200pAU("/tiktok/interaction/mention/general/check/v1")
    C11NZ<MentionCheckResponse> LJ(@InterfaceC1501120pAM("uids") String str, @InterfaceC1501120pAM("mention_type") String str2, @InterfaceC1501120pAM("is_check_aweme") boolean z, @InterfaceC1501120pAM("aweme_id") long j);

    @InterfaceC1501200pAU("/tiktok/interaction/mention/general/aweme/check/v1")
    C11NZ<MentionCheckResponse> LJFF(@InterfaceC1501120pAM("aweme_id") long j);

    @InterfaceC1501240pAY("/tiktok/interaction/mention/tag/update/v1")
    @InterfaceC1485505rh
    C11NZ<TagUpdateResponse> LJIIIZ(@InterfaceC1501100pAK("add_uids") String str, @InterfaceC1501100pAK("remove_uids") String str2, @InterfaceC1501100pAK("aweme_id") long j);

    @InterfaceC1501200pAU("/tiktok/interaction/mention/recent/contact/query/v1")
    C0X9S<MentionRecentContactResponse> LJIIJ(@InterfaceC1501120pAM("mention_type") int i, @InterfaceC1501120pAM("aweme_id") long j, @InterfaceC1501120pAM("is_check_aweme") boolean z);
}

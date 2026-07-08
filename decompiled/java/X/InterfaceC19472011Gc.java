package X;

import com.ss.android.ugc.aweme.commercialize.advideo.VideoAuthorizationResponse;

/* JADX INFO: renamed from: X.11Gc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public interface InterfaceC19472011Gc {
    public static final C19472111Gd LIZ = C19472111Gd.LIZ;

    @InterfaceC1501240pAY("/tiktok/v1/ad/tagging/invitation/update/")
    C11NZ<VideoAuthorizationResponse> LIZ(@InterfaceC1501120pAM("ba_uid") String str, @InterfaceC1501120pAM("item_id") String str2, @InterfaceC1501120pAM("apply_type") int i, @InterfaceC1501120pAM("action") int i2, @InterfaceC1501120pAM("send_notice_time") long j);

    @InterfaceC1501200pAU("/tiktok/v1/ad/tagging/invitation/get/")
    C11NZ<VideoAuthorizationResponse> LIZIZ(@InterfaceC1501120pAM("ba_uid") String str, @InterfaceC1501120pAM("item_id") String str2, @InterfaceC1501120pAM("apply_type") int i, @InterfaceC1501120pAM("send_notice_time") long j);
}

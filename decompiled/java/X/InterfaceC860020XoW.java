package X;

import com.ss.android.ugc.aweme.api.AnchorAutoSelectionResponse;

/* JADX INFO: renamed from: X.0XoW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public interface InterfaceC860020XoW {
    public static final C312890COh LIZ = C312890COh.LIZ;

    @InterfaceC1501200pAU("/tiktok/v1/anchor/auto/selection/")
    C15O7<AnchorAutoSelectionResponse> LIZ(@InterfaceC1501120pAM("open_platform_client_key") String str, @InterfaceC1501120pAM("open_platform_extra") String str2, @InterfaceC1501120pAM("anchor_source_type") String str3, @InterfaceC1501120pAM("add_from") Integer num, @InterfaceC1501120pAM("open_platform_share_id") String str4);
}

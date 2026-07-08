package X;

import com.ss.android.ugc.tiktok.ban.UserBanAppealStatusResponse;
import com.ss.android.ugc.tiktok.ban.UserBanAppealTicketResponse;

/* JADX INFO: renamed from: X.1004, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public interface AnonymousClass1004 {
    @InterfaceC1501200pAU("/aweme/v2/appeal/status/")
    C11NZ<UserBanAppealStatusResponse> LIZ(@InterfaceC1501120pAM("object_type") String str, @InterfaceC1501120pAM("object_id") String str2, @InterfaceC1501120pAM("source") int i);

    @InterfaceC1501240pAY("/passport/user/appeal_ticket/")
    C11NZ<UserBanAppealTicketResponse> LIZIZ();
}

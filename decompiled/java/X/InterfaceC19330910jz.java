package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.innerpush.model.GetMessageListResponse;
import com.ss.android.ugc.aweme.innerpush.model.PushCheckResponse;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.10jz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC19330910jz {
    @InterfaceC1501200pAU("/tiktok/in_app_push/get/v1/")
    C11NZ<GetMessageListResponse> LIZ(@InterfaceC1501120pAM("protocol") int i, @InterfaceC1501120pAM("version") int i2, @InterfaceC1501120pAM("last_message_create_time") long j, @InterfaceC1501120pAM("trigger_extra") String str, @InterfaceC1501120pAM("scenario") int i3, @InterfaceC1501120pAM("freq_strategies_info") String str2, @InterfaceC1501120pAM("setting_filter_types") String str3);

    @InterfaceC1501240pAY("/tiktok/in_app_push/status/update/v1/")
    @InterfaceC1485505rh
    C11NZ<BaseResponse> LIZIZ(@InterfaceC1501100pAK(FollowStatusChangeMethod.PARAM_UID) long j, @InterfaceC1501100pAK(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS) int i, @InterfaceC1501100pAK("push_history_info") String str);

    @InterfaceC1501240pAY("/tiktok/in_app_push/local_allowed/v1/")
    @InterfaceC1485505rh
    C11NZ<PushCheckResponse> LIZJ(@InterfaceC1501100pAK("item_type") String str);
}

package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.account.loginsetting.BoolData;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: renamed from: X.0iRj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public interface InterfaceC1242810iRj {
    @InterfaceC1501200pAU("/aweme/v1/ad/ba/quit/")
    ListenableFuture<BaseResponse> LIZ();

    @InterfaceC1501240pAY("/passport/mobile/can_send_voice_code/")
    @InterfaceC1485505rh
    C15O7<BoolData> LIZIZ(@InterfaceC1501100pAK("mobile") String str, @InterfaceC1501100pAK("mix_mode") String str2);

    @InterfaceC1501240pAY("/aweme/v1/user/proaccount/setting/")
    @InterfaceC1485505rh
    ListenableFuture<BaseResponse> LIZJ(@InterfaceC1501100pAK("action_type") int i, @InterfaceC1501100pAK("category_name") String str, @InterfaceC1501100pAK("category_id") String str2, @InterfaceC1501100pAK("pro_g") int i2);

    @InterfaceC1501240pAY("/aweme/v1/ad/ba/on/")
    @InterfaceC1485505rh
    ListenableFuture<BaseResponse> LIZLLL(@InterfaceC1501100pAK("category_name") String str);
}

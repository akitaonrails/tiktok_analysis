package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.common.model.BlockResponse;
import com.ss.android.ugc.aweme.im.common.model.FeedbackRequest;

/* JADX INFO: renamed from: X.06ZX, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public interface C06ZX {
    @InterfaceC1501200pAU("user/block/")
    Object LIZ(@InterfaceC1501120pAM("user_id") String str, @InterfaceC1501120pAM("sec_user_id") String str2, @InterfaceC1501120pAM("block_type") int i, InterfaceC1364105Vn<? super BlockResponse> interfaceC1364105Vn);

    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501240pAY("im/msg/feedback/")
    Object LIZIZ(@C040I FeedbackRequest feedbackRequest, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);
}

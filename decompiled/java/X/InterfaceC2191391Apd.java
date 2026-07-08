package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.AutoReplyStatusResponse;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.MsgSwitchResponse;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.SuggestedQuestionsResponse;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.WelMsgStatusResponse;

/* JADX INFO: renamed from: X.1Apd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public interface InterfaceC2191391Apd {
    public static final C1487620ooa LIZ = C1487620ooa.LIZ;

    @InterfaceC1501200pAU("/aweme/v1/ad/ba/suggested_question/")
    ListenableFuture<SuggestedQuestionsResponse> LIZ();

    @InterfaceC1501240pAY("/tiktok/v1/ba/set/auto_reply/")
    @InterfaceC1485505rh
    ListenableFuture<BaseResponse> LIZIZ(@InterfaceC1501100pAK("operation_type") int i, @InterfaceC1501100pAK("auto_reply_struct") String str);

    @InterfaceC1501200pAU("/tiktok/v1/ba/auto_reply/get/review_status/")
    ListenableFuture<AutoReplyStatusResponse> LIZJ();

    @InterfaceC1501240pAY("/tiktok/v1/ba/set/message_switch/")
    ListenableFuture<WelMsgStatusResponse> LIZLLL(@InterfaceC1501120pAM("message_type") int i, @InterfaceC1501120pAM("message_switch") int i2);

    @InterfaceC1501200pAU("/tiktok/v1/ba/get/message_switch/")
    ListenableFuture<MsgSwitchResponse> LJ();

    @InterfaceC1501200pAU("/tiktok/v1/ba/wel_message/get/review_status/")
    ListenableFuture<WelMsgStatusResponse> LJFF();

    @InterfaceC1501240pAY("/tiktok/v1/ba/set/wel_message/")
    ListenableFuture<BaseResponse> LJI(@InterfaceC1501120pAM("operation_type") int i, @InterfaceC1501120pAM("content") String str, @InterfaceC1501120pAM("message_id") Long l);
}

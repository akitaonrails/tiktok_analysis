package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioAppendRequest;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioCreationRequest;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioCreationResponse;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioStatusResponse;

/* JADX INFO: renamed from: X.0HSs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC441440HSs {
    Object LIZ(InterfaceC1364105Vn<? super MixStudioStatusResponse> interfaceC1364105Vn);

    Object LIZIZ(String str, C441410HSp c441410HSp);

    Object LIZJ(Integer num, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    Object LIZLLL(MixStudioAppendRequest mixStudioAppendRequest, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    Object generate(MixStudioCreationRequest mixStudioCreationRequest, InterfaceC1364105Vn<? super MixStudioCreationResponse> interfaceC1364105Vn);
}

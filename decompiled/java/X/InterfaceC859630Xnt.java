package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: renamed from: X.0Xnt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public interface InterfaceC859630Xnt {
    public static final C859620Xns LIZ = C859620Xns.LIZ;

    @InterfaceC1501240pAY("/aweme/v1/twitter/bind/")
    @InterfaceC1485505rh
    Object LIZ(@InterfaceC1501100pAK("twitter_id") String str, @InterfaceC1501100pAK("twitter_name") String str2, @InterfaceC1501100pAK("access_token") String str3, @InterfaceC1501100pAK("secret_token") String str4, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501200pAU("/aweme/v1/twitter/unbind/")
    Object LIZIZ(InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);
}

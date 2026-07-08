package X;

import com.ss.android.ugc.aweme.authorize.model.CopyRightResponse;
import com.ss.android.ugc.aweme.share.ClientScopeResponse;

/* JADX INFO: renamed from: X.1Au3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public interface InterfaceC2194131Au3 {
    @InterfaceC1501240pAY("/oauth/get_client_scopes/")
    @InterfaceC1485505rh
    Object LIZ(@InterfaceC1501100pAK("client_key") String str, @InterfaceC1501100pAK("app_identity") String str2, @InterfaceC1501100pAK("certificate") String str3, @InterfaceC1501100pAK("sdk_name") String str4, @InterfaceC1501100pAK("need_version_control") int i, InterfaceC1364105Vn<? super ClientScopeResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/tiktok/music/dsp_to_tt/message/create/v1")
    @InterfaceC1485505rh
    Object LIZIZ(@InterfaceC1501100pAK("share_url") String str, @InterfaceC1501100pAK("entity_uri") String str2, InterfaceC1364105Vn<? super CopyRightResponse> interfaceC1364105Vn);
}

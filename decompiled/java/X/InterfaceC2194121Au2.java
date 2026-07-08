package X;

import com.ss.android.ugc.aweme.share.ClientScopeResponse;

/* JADX INFO: renamed from: X.1Au2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public interface InterfaceC2194121Au2 {
    public static final C2194111Au1 LIZ = C2194111Au1.LIZ;

    @InterfaceC1501240pAY("/oauth/get_client_scopes/")
    @InterfaceC1485505rh
    Object LIZ(@InterfaceC1501100pAK("client_key") String str, @InterfaceC1501100pAK("app_identity") String str2, @InterfaceC1501100pAK("certificate") String str3, @InterfaceC1501100pAK("sdk_name") String str4, @InterfaceC1501100pAK("need_version_control") int i, @InterfaceC1501100pAK("share_url") String str5, @InterfaceC1501100pAK("content_type") String str6, InterfaceC1364105Vn<? super ClientScopeResponse> interfaceC1364105Vn);
}

package X;

import com.ss.android.ugc.aweme.authorize.network.OAuthPageDetailApiRequest;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthCodeResponse;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthPage;
import com.ss.android.ugc.aweme.openauthorize.entity.ScanCommonResponse;
import com.ss.android.ugc.aweme.openauthorize.entity.WebAuthV2Response;

/* JADX INFO: renamed from: X.1B39, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public interface C1B39 {
    @InterfaceC1501240pAY("/passport/open/confirm_qrcode/")
    @InterfaceC1485505rh
    AbstractC19484711Kz<ScanCommonResponse> LIZ(@InterfaceC1501100pAK("token") String str, @InterfaceC1501100pAK("scopes") String str2);

    @InterfaceC1501240pAY("passport/open/auth/v2/")
    @InterfaceC1485505rh
    Object LIZIZ(@InterfaceC1501100pAK("client_key") String str, @InterfaceC1501100pAK("response_type") String str2, @InterfaceC1501100pAK("scope") String str3, @InterfaceC1501100pAK("source") String str4, @InterfaceC1501100pAK("from") String str5, @InterfaceC1501100pAK("state") String str6, @InterfaceC1501100pAK("redirect_uri") String str7, @InterfaceC1501100pAK("app_identity") String str8, @InterfaceC1501100pAK("certificate") String str9, @InterfaceC1501100pAK("sign") String str10, @InterfaceC1501100pAK("sdk_name") String str11, @InterfaceC1501100pAK("code_challenge") String str12, @InterfaceC1501100pAK("code_challenge_method") String str13, InterfaceC1364105Vn<? super AuthCodeResponse> interfaceC1364105Vn);

    @InterfaceC1501200pAU("/passport/open/scan_qrcode/")
    AbstractC19484711Kz<ScanCommonResponse> LIZJ(@InterfaceC1501120pAM("ticket") String str, @InterfaceC1501120pAM("token") String str2, @InterfaceC1501120pAM("auth_type") Integer num, @InterfaceC1501120pAM("client_key") String str3, @InterfaceC1501120pAM("client_ticket") String str4, @InterfaceC1501120pAM("scope") String str5, @InterfaceC1501120pAM("next_url") String str6);

    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501240pAY("/tiktok/v2/oauth/page/detail/")
    AbstractC19484711Kz<OAuthPage> LIZLLL(@C040I OAuthPageDetailApiRequest oAuthPageDetailApiRequest);

    @InterfaceC1501240pAY("/passport/open/web/auth/v2/")
    @InterfaceC1485505rh
    AbstractC19484711Kz<WebAuthV2Response> LJ(@InterfaceC1501100pAK("client_key") String str, @InterfaceC1501100pAK("scope") String str2, @InterfaceC1501100pAK("source") String str3, @InterfaceC1501100pAK("response_type") String str4, @InterfaceC1501100pAK("initiate_url") String str5, @InterfaceC1501100pAK("state") String str6, @InterfaceC1501100pAK("redirect_uri") String str7);
}

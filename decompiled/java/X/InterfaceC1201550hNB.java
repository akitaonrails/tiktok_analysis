package X;

import com.ss.android.ugc.aweme.poi_api.model.AutoFillCertificateResp;
import com.ss.android.ugc.aweme.poi_api.model.AutoFillHostResp;

/* JADX INFO: renamed from: X.0hNB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public interface InterfaceC1201550hNB {
    public static final C1201520hN8 LIZ = C1201520hN8.LIZ;

    @InterfaceC1501200pAU("/tiktok/ls/trade/pay/get_autofill_certificate")
    Object LIZ(@InterfaceC1501120pAM("biz_info") String str, InterfaceC1364105Vn<? super AutoFillCertificateResp> interfaceC1364105Vn);

    @InterfaceC1501200pAU("/tiktok/ls/trade/pay/get_autofill_host")
    Object LIZIZ(@InterfaceC1501120pAM("biz_info") String str, InterfaceC1364105Vn<? super AutoFillHostResp> interfaceC1364105Vn);
}

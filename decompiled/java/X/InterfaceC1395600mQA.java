package X;

import com.ss.android.ugc.aweme.minis.report.api.MinisCreateReportResponse;
import com.ss.android.ugc.aweme.minis.report.api.MinisReportGetAuthTokenResponse;
import com.ss.android.ugc.aweme.minis.report.api.MinisUpdateReportRequestV2;
import com.ss.android.ugc.aweme.minis.report.api.MinisUpdateReportResponse;
import com.ss.android.ugc.aweme.minis.report.report.MinisReportRequest;
import com.ss.android.ugc.aweme.minis.report.report.MinisUpdateReportRequest;

/* JADX INFO: renamed from: X.0mQA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public interface InterfaceC1395600mQA {
    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501240pAY("/tiktok/minis/report")
    AbstractC19484711Kz<MinisCreateReportResponse> LIZ(@C040I MinisReportRequest minisReportRequest);

    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501240pAY("/tiktok/minis/report/update")
    AbstractC19484711Kz<MinisUpdateReportResponse> LIZIZ(@C040I MinisUpdateReportRequest minisUpdateReportRequest);

    @InterfaceC1501200pAU("/tiktok/minis/authkey/material")
    AbstractC19484711Kz<MinisReportGetAuthTokenResponse> LIZJ();

    @InterfaceC1501200pAU("/tiktok/minis/authkey")
    AbstractC19484711Kz<MinisReportGetAuthTokenResponse> LIZLLL();

    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501240pAY("/tiktok/minis/report/update")
    AbstractC19484711Kz<MinisUpdateReportResponse> LJ(@C040I MinisUpdateReportRequestV2 minisUpdateReportRequestV2);
}

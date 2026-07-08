package X;

import android.content.Context;
import android.net.Uri;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.report.IReportService;

/* JADX INFO: renamed from: X.0dHj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1044410dHj implements InterfaceC1010530cP5 {
    public final InterfaceC1044420dHk LL;

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    public final void LIZ() {
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().appendQueryParameter("report_type", this.LL.getReportType()).appendQueryParameter("object_id", this.LL.LIZ()).appendQueryParameter("category", this.LL.getCategory()).appendQueryParameter("website", this.LL.LIZIZ()).appendQueryParameter("country_id", C2222691Bz1.LIZ()).appendQueryParameter("pixel_id", this.LL.LIZJ()).appendQueryParameter("item_id", this.LL.getItemId());
        IReportService iReportServiceLJJ = ComplianceServiceProvider.LJJ();
        Context context = this.LL.getContext();
        iReportServiceLJJ.LIZJ(context != null ? C0J3A.LIZJ(context) : null, builderAppendQueryParameter);
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ Object Mh() {
        return this.LL;
    }

    public C1044410dHj(InterfaceC1044420dHk interfaceC1044420dHk) {
        this.LL = interfaceC1044420dHk;
    }
}

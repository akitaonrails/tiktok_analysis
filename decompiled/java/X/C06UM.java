package X;

import com.ss.android.ugc.tiktok.report.ReportServiceImpl;
import com.ss.android.ugc.tiktok.report.interfaces.IReportService;

/* JADX INFO: renamed from: X.06UM, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06UM {
    public static final /* synthetic */ C06UM LIZ = new C06UM();

    public static IReportService LIZ() {
        Object objLIZ = C04TD.LIZ(IReportService.class, false);
        if (objLIZ != null) {
            return (IReportService) objLIZ;
        }
        if (C04TD.c7 == null) {
            synchronized (IReportService.class) {
                if (C04TD.c7 == null) {
                    C04TD.c7 = new ReportServiceImpl();
                }
            }
        }
        return C04TD.c7;
    }
}

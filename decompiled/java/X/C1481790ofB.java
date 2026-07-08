package X;

import com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService;

/* JADX INFO: renamed from: X.0ofB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1481790ofB {
    public static final /* synthetic */ C1481790ofB LIZ = new C1481790ofB();

    public static IPlayerEventReportService LIZ(EnumC1481830ofF enumC1481830ofF) {
        int i = C1481820ofE.LIZ[enumC1481830ofF.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return (IPlayerEventReportService) C1126604au.LIZ("com.ss.android.ugc.aweme.playereventreporter.service.PlayerReportServiceWrapper");
                }
                throw new C1954807lC();
            }
            return (IPlayerEventReportService) C1126604au.LIZ("com.ss.android.ugc.aweme.simreporterconvia.ConviaReportService");
        }
        return (IPlayerEventReportService) C1126604au.LIZ("com.ss.android.ugc.aweme.simreporterdt.SimDtReportServiceV2");
    }
}

package X;

import com.ss.android.ugc.aweme.shortvideo.ui.publishprogress.PublishProgressDialogAddHelper;
import com.ss.android.ugc.aweme.wavepublish.gate.IPublishGateService;
import com.ss.android.ugc.aweme.wavepublish.gate.IPublishTelemetry;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nPt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1433870nPt {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(C1433500nPI c1433500nPI, final C1433880nPu c1433880nPu, Boolean bool) {
        String strLJ = C1433730nPf.LJ(c1433500nPI, false);
        c1433880nPu.LIZ = strLJ;
        PublishProgressDialogAddHelper.LIZ.getClass();
        PublishProgressDialogAddHelper.LIZJ(strLJ);
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            c1433880nPu.LIZIZ = new InterfaceC1433890nPv() { // from class: X.0nPz
                @Override // X.InterfaceC1433890nPv
                public final void LIZ(String str) {
                    if (!c1433880nPu.isCanceled()) {
                        C1433730nPf.LJJII();
                        C1439040nYE.LIZ.getClass();
                        C1439040nYE.LIZIZ(str);
                    }
                    c1433880nPu.end();
                    IPublishGateService iPublishGateService = (IPublishGateService) C1433260nOu.LIZ.getValue();
                    if (iPublishGateService != null) {
                        iPublishGateService.LIZJ(str);
                    }
                    IPublishTelemetry iPublishTelemetry = (IPublishTelemetry) C1433940nQ0.LIZ.getValue();
                    if (iPublishTelemetry != null) {
                        iPublishTelemetry.LIZ(str);
                    }
                }
            };
            c1433880nPu.LIZLLL(C571860Mbo.LIZ.delayAfterClickPublishMs);
        }
        return strLJ;
    }
}

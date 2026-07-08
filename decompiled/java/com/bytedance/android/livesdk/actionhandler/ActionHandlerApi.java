package com.bytedance.android.livesdk.actionhandler;

import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.livesdkapi.depend.model.report.ReportCommitData;

/* JADX INFO: loaded from: classes.dex */
public interface ActionHandlerApi {
    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.REPORT)
    @InterfaceC1501170pAR("/webcast/user/report/commit/")
    C11NZ<C470590Icr<ReportCommitData>> postReportReasons(@InterfaceC1501050pAF("target_room_id") long j, @InterfaceC1501050pAF("target_anchor_id") long j2, @InterfaceC1501050pAF("reason") long j3, @InterfaceC1501050pAF("report_record_extra") String str);
}

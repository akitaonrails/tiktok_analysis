package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.report.OutreachFlowReportItem;
import java.util.List;

/* JADX INFO: renamed from: X.15vT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20676115vT {
    public static final C20676115vT LIZ = new C20676115vT();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C20676215vU());

    public static Keva LIZIZ() {
        return (Keva) LIZIZ.getValue();
    }

    public final synchronized void LIZ(List<OutreachFlowReportItem> list) {
        Keva kevaLIZIZ = LIZIZ();
        C1227904rF.LIZ.getClass();
        kevaLIZIZ.storeString("outreach_record_flow_report_cache", GsonProtectorUtils.toJson(C1227904rF.LIZLLL(), list));
        C20571615ec.LIZ.getClass();
        C20571615ec.LIZLLL("OutreachRecordCache: disk cache flush done!");
    }
}

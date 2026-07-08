package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.api.PcsApi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import webcast.api.sub.LeadsEventReportRequest;

/* JADX INFO: renamed from: X.0eum, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1107060eum {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, int i, int i2, Room room, int i3) {
        long id;
        EnumC993070bwv enumC993070bwv;
        C480460Ism.LIZ().getClass();
        PcsApi pcsApi = (PcsApi) C480460Ism.LIZLLL(PcsApi.class);
        LeadsEventReportRequest leadsEventReportRequest = new LeadsEventReportRequest();
        leadsEventReportRequest.secAnchorId = str;
        leadsEventReportRequest.reportType = i;
        leadsEventReportRequest.action = i2;
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        leadsEventReportRequest.roomId = id;
        if (C1083940eJU.LIZIZ(room)) {
            enumC993070bwv = EnumC993070bwv.SERVICE_PLUS;
        } else {
            enumC993070bwv = EnumC993070bwv.DEFAULT;
        }
        leadsEventReportRequest.scene = enumC993070bwv.getValue();
        leadsEventReportRequest.source = i3;
        C1808280x9m.LJFF(pcsApi.leadsEventReport(leadsEventReportRequest).LJIILIIL(new C0UO0()), null, "/sub/leads/event/report/", null, 13).LJJLL(new C09JN() { // from class: X.0euk
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("LeadsEventReportUtil@8ee.reportLeadsEvent$2");
                C1C7U.LIZIZ("LeadsEventReportUtil@8ee.reportLeadsEvent$2");
            }
        }, new C09JN() { // from class: X.0eul
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("LeadsEventReportUtil@8ee.reportLeadsEvent$3");
                C1C7U.LIZIZ("LeadsEventReportUtil@8ee.reportLeadsEvent$3");
            }
        });
    }
}

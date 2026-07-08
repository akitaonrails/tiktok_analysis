package X;

import com.ss.android.ugc.aweme.geofencing.api.GeoFencingHistoryApi;
import com.ss.android.ugc.aweme.geofencing.data.HistoryEntry;
import com.ss.android.ugc.aweme.geofencing.data.HistoryRegionGroup;
import com.ss.android.ugc.aweme.geofencing.data.HistoryUpdateRequest;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0105, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0105 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(361));
    public static volatile List<HistoryEntry> LIZIZ;

    public static void LIZ(List list) {
        if (list.isEmpty()) {
            return;
        }
        HistoryUpdateRequest historyUpdateRequest = new HistoryUpdateRequest(Collections.singletonList(new HistoryRegionGroup(list, "app")));
        C11NJ c11nj = (C11NJ) LIZ.getValue();
        GeoFencingHistoryApi.LIZ.getClass();
        c11nj.LIZ(C010E.LIZIZ.getValue().updateHistory(historyUpdateRequest).LJJIJIIJI(C11S5.LIZ()).LJJIIZ(new C09JN() { // from class: X.00O9
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("GeoFencingHistoryDataSource@c205.update$1");
                C1C7U.LIZIZ("GeoFencingHistoryDataSource@c205.update$1");
            }
        }, new C09JN() { // from class: X.0106
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GeoFencingHistoryDataSource@c205.update$2");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("history/update/ failed: ");
                sbLIZ.append(((Throwable) obj).getMessage());
                C201955140j.LJFF("GeoFencingHistory", C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("GeoFencingHistoryDataSource@c205.update$2");
            }
        }));
    }
}

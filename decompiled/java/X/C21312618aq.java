package X;

import Y.ARunnableS30S1100000_26;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.consume.playnum.UserPlayData;
import com.ss.android.ugc.aweme.localservice.model.PoiFeedPlayNumModel;
import java.util.Calendar;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.18aq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21312618aq {
    public final C01GW LIZ = C452501pT.LIZIZ(new C18JP());

    public final UserPlayData LIZ(String str) {
        String string;
        try {
            Keva keva = (Keva) this.LIZ.getValue();
            if (keva != null && (string = keva.getString(str, "")) != null && string.length() != 0) {
                UserPlayData userPlayData = new UserPlayData(str, (PoiFeedPlayNumModel) C1058250de3.LIZ(string, PoiFeedPlayNumModel.class));
                int i = Calendar.getInstance().get(6);
                PoiFeedPlayNumModel poiFeedPlayNumModel = userPlayData.model;
                if (i != poiFeedPlayNumModel.date) {
                    poiFeedPlayNumModel.setPlayNum(0);
                    userPlayData.model.setBatchNum(0);
                    userPlayData.model.setDate(Calendar.getInstance().get(6));
                }
                return userPlayData;
            }
            return new UserPlayData(str, new PoiFeedPlayNumModel(0, 0, 0, 0, Calendar.getInstance().get(6)));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C21312918at.LIZ(EnumC1205980hUK.POI_REALTIME_FEATURE, "get_poi_play_num", new LinkedHashMap(), e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get poi play num error ");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
            try {
                new ARunnableS30S1100000_26(this, str, 2).run();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C21312918at.LIZ(EnumC1205980hUK.POI_REALTIME_FEATURE, "remove_poi_play_num", new LinkedHashMap(), e2);
            }
            return new UserPlayData(str, new PoiFeedPlayNumModel(0, 0, 0, 0, Calendar.getInstance().get(6)));
        }
    }

    public final void LIZIZ(UserPlayData userPlayData) {
        try {
            String strLIZLLL = C1058250de3.LIZLLL(userPlayData.model);
            Keva keva = (Keva) this.LIZ.getValue();
            if (keva != null) {
                keva.storeString(userPlayData.uid, strLIZLLL);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C21312918at.LIZ(EnumC1205980hUK.POI_REALTIME_FEATURE, "store_poi_play_num", new LinkedHashMap(), e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("store poi play num error ");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}

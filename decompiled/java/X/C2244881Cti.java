package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.anchor.sensor.ExposureRecord;
import com.ss.android.ugc.aweme.poi.anchor.sensor.UserGlobalControl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1Cti, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2244881Cti implements InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>, InterfaceC842703Qz {
    @Override // X.InterfaceC1631620sYq
    public final Object invoke(VideoItemParams videoItemParams, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super AbstractC1387105bp> interfaceC1364105Vn) {
        Aweme aweme;
        PoiDataStruct poiDataStruct;
        String str;
        int iIntValue;
        long jLongValue;
        VideoItemParams videoItemParams2 = videoItemParams;
        if (videoItemParams2 != null && (aweme = videoItemParams2.getAweme()) != null && (poiDataStruct = aweme.getPoiDataStruct()) != null && (str = poiDataStruct.poiId) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onExposure poi id=");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            ExposureRecord exposureRecord = new ExposureRecord(str, C2286608xc.LJFF(System.currentTimeMillis()));
            int i = C2244891Ctj.LIZ;
            String exposureRecordSerializableResult = exposureRecord.getExposureRecordSerializableResult();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("encouraging_posting_exposure_record_");
            String str2 = C2244891Ctj.LJII;
            sbLIZ2.append(str2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            int iIntValue2 = 0;
            List listLJLI = C13LQ.LJLI(C2244891Ctj.LIZ().getStringArray(strLIZIZ, new String[0]));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("[Before] recordExposureRecord jsonString=");
            sbLIZ3.append(exposureRecordSerializableResult);
            sbLIZ3.append(", list size=");
            ArrayList arrayList = (ArrayList) listLJLI;
            sbLIZ3.append(arrayList.size());
            sbLIZ3.append(", list=");
            sbLIZ3.append(listLJLI);
            C2188811AlT.LIZIZ(sbLIZ3);
            if (arrayList.size() >= C2244891Ctj.LIZIZ) {
                ListProtector.remove(listLJLI, 0);
            }
            arrayList.add(exposureRecordSerializableResult);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("[After] recordExposureRecord, list size=");
            sbLIZ4.append(arrayList.size());
            sbLIZ4.append(", list=");
            sbLIZ4.append(listLJLI);
            C2188811AlT.LIZIZ(sbLIZ4);
            long jCurrentTimeMillis = System.currentTimeMillis();
            UserGlobalControl userGlobalControlLIZIZ = C2244891Ctj.LIZIZ();
            Integer num = userGlobalControlLIZIZ.exposureTimesIn24Hour;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            Long l = userGlobalControlLIZIZ.firstExposureTimeIn24Hour;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("[Before] recordExposureRecord exposureTimesIn24Hour=");
            sbLIZ5.append(iIntValue);
            sbLIZ5.append(", firstExposureTimeIn24Hour=");
            sbLIZ5.append(jLongValue);
            C2188811AlT.LIZIZ(sbLIZ5);
            if (jLongValue != 0) {
                jCurrentTimeMillis = jLongValue;
            }
            int i2 = iIntValue + 1;
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("[After] recordExposureRecord exposureTimesIn24Hour=");
            sbLIZ6.append(i2);
            sbLIZ6.append(", firstExposureTimeIn24Hour=");
            sbLIZ6.append(jCurrentTimeMillis);
            C2188811AlT.LIZIZ(sbLIZ6);
            C2244891Ctj.LIZJ(i2, jCurrentTimeMillis);
            C2244891Ctj.LIZ().storeStringArray(strLIZIZ, (String[]) arrayList.toArray(new String[0]));
            UserGlobalControl userGlobalControlLIZIZ2 = C2244891Ctj.LIZIZ();
            Integer num2 = userGlobalControlLIZIZ2.consecutiveNoClickCount;
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            }
            Long l2 = userGlobalControlLIZIZ2.cacheLastNoClickTime;
            Long lValueOf = userGlobalControlLIZIZ2.lastNoClickTime;
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("[Before] dealWithClickCountWhenExposure consecutiveNoClickCount=");
            sbLIZ7.append(iIntValue2);
            sbLIZ7.append(", cacheLastNoClickTime=");
            sbLIZ7.append(l2);
            sbLIZ7.append(", lastNoClickTime=");
            sbLIZ7.append(lValueOf);
            C2188811AlT.LIZIZ(sbLIZ7);
            int i3 = iIntValue2 + 1;
            if (i3 >= C2244891Ctj.LIZJ) {
                l2 = lValueOf;
                lValueOf = Long.valueOf(System.currentTimeMillis());
            }
            UserGlobalControl userGlobalControlLIZ = UserGlobalControl.LIZ(userGlobalControlLIZIZ2, Integer.valueOf(i3), l2, lValueOf, null, null, 24);
            Keva kevaLIZ = C2244891Ctj.LIZ();
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("encouraging_posting_user_guide_control_");
            sbLIZ8.append(str2);
            kevaLIZ.storeString(C2188811AlT.LIZIZ(sbLIZ8), userGlobalControlLIZ.LIZIZ());
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append("[After] dealWithClickCountWhenExposure consecutiveNoClickCount=");
            sbLIZ9.append(i3);
            sbLIZ9.append(", cacheLastNoClickTime=");
            sbLIZ9.append(l2);
            sbLIZ9.append(", lastNoClickTime=");
            sbLIZ9.append(lValueOf);
            C2188811AlT.LIZIZ(sbLIZ9);
            return new C1387205bq(null);
        }
        return C1387305br.LIZIZ;
    }
}

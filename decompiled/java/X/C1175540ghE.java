package X;

import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import com.ss.android.ugc.aweme.poi.mapmode.model.Location;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0ghE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1175540ghE {
    public static final List<PoiGeneralCard> LIZ(List<PoiGeneralCard> list, C1176580giu c1176580giu, Float f) {
        double dDoubleValue;
        double dDoubleValue2;
        float fFloatValue;
        if ((!((Boolean) C262240APm.LIZ.getValue()).booleanValue()) && list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (PoiGeneralCard poiGeneralCard : list) {
                Location location = poiGeneralCard.getLocation();
                if (location != null && c1176580giu != null) {
                    Double d = location.lat;
                    if (d != null) {
                        dDoubleValue = d.doubleValue();
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    Double d2 = location.lng;
                    if (d2 != null) {
                        dDoubleValue2 = d2.doubleValue();
                    } else {
                        dDoubleValue2 = 0.0d;
                    }
                    if (f != null) {
                        fFloatValue = f.floatValue();
                    } else {
                        fFloatValue = 0.0f;
                    }
                    if (c1176580giu.contains(dDoubleValue, dDoubleValue2, fFloatValue, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)))) {
                        arrayList.add(poiGeneralCard);
                    }
                }
            }
            return arrayList;
        }
        return list;
    }
}

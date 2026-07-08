package X;

import android.text.Editable;
import com.ss.android.ugc.aweme.feed.model.upvote.CarrierType;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0lPa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1356800lPa {
    public static final HashMap<String, Editable> LIZ = new HashMap<>();
    public static int LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(110));
    public static final Map<String, Editable> LIZJ = new LinkedHashMap();

    public static String LIZ(String str, CarrierType carrierType, String str2) {
        boolean z;
        if (str == null) {
            return null;
        }
        if (carrierType == null) {
            carrierType = CarrierType.ITEM;
        }
        int value = carrierType.getValue();
        if (str2 != null && str2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(value);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append('_');
        sbLIZ2.append(value);
        sbLIZ2.append('_');
        sbLIZ2.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}

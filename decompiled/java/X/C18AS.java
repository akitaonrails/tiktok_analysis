package X;

import com.bytedance.android.bcm.api.model.BcmParams;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.18AS, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18AS implements C18AN {
    public static List<String> LIZ = C13BV.INSTANCE;

    @Override // X.C18AN
    public final List LIZ(C18AO c18ao, C18AY c18ay, boolean z) {
        Map<String, Object> map;
        boolean z2;
        BcmParams bcmParams = c18ao.getBcmParams();
        if (bcmParams != null && (map = bcmParams.toMap()) != null) {
            ArrayList arrayList = new ArrayList();
            for (C18AX c18ax : c18ay.LIZ) {
                Object obj = map.get(c18ax.LIZ());
                if (obj != null && !LIZ.contains(c18ax.LIZ())) {
                    int i = C18AV.LIZ[c18ax.LIZLLL().ordinal()];
                    if (i != 1) {
                        if (i == 2 && !(obj instanceof Integer) && !(obj instanceof Long)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                    } else {
                        z2 = obj instanceof String;
                    }
                    String strLJJLIIIJ = null;
                    if (!z2) {
                        arrayList.add(C18AG.LIZ(c18ax.LIZ(), C18AF.TYPE_ERROR, null, obj));
                    } else {
                        List<Object> listLIZIZ = c18ax.LIZIZ();
                        if (listLIZIZ != null && !listLIZIZ.isEmpty() && !listLIZIZ.contains(obj)) {
                            String strLIZ = c18ax.LIZ();
                            C18AF c18af = C18AF.VALUE_ERROR;
                            List<Object> listLIZIZ2 = c18ax.LIZIZ();
                            if (listLIZIZ2 != null) {
                                strLJJLIIIJ = C13LP.LJJLIIIJ(listLIZIZ2, null, null, null, 0, null, null, 63);
                            }
                            arrayList.add(C18AG.LIZ(strLIZ, c18af, strLJJLIIIJ, obj));
                        }
                    }
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }
}

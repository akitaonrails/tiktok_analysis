package X;

import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0QOz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C669790QOz {
    public static final List<EnumC669620QOi> LIZJ = (List) C0QP1.LIZIZ.getValue();
    public final List<EnumC669620QOi> LIZ;
    public final Map<EnumC669620QOi, Boolean> LIZIZ;

    public C669790QOz(C0QER c0qer) {
        ECSearchEntranceData ecSearchEntranceData;
        String stringOrNullStrategy;
        ArrayList arrayList = new ArrayList();
        this.LIZ = arrayList;
        new ArrayList();
        this.LIZIZ = new LinkedHashMap();
        if (c0qer != null && (ecSearchEntranceData = c0qer.getEcSearchEntranceData()) != null && (stringOrNullStrategy = ecSearchEntranceData.getStringOrNullStrategy("single_tab_type")) != null && C703302op.LIZ(stringOrNullStrategy)) {
            EnumC669620QOi.Companion.getClass();
            EnumC669620QOi enumC669620QOiLIZ = C669650QOl.LIZ(stringOrNullStrategy);
            if (enumC669620QOiLIZ != null && Boolean.valueOf(arrayList.add(enumC669620QOiLIZ)) != null) {
                return;
            }
        }
        List<EnumC669620QOi> list = LIZJ;
        ArrayList arrayList2 = new ArrayList();
        for (EnumC669620QOi enumC669620QOi : list) {
            int i = C0QP0.LIZ[enumC669620QOi.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            C669760QOw.LIZ.getClass();
                            if (C669760QOw.LIZ().enableVideoTab == 1) {
                            }
                        }
                    } else if (((Number) C275060AqG.LIZ.getValue()).intValue() == 1) {
                    }
                } else if (C293700BfE.LIZ() != 2) {
                }
            }
            arrayList2.add(enumC669620QOi);
        }
        for (Object obj : arrayList2) {
            ((ArrayList) this.LIZ).add(obj);
            this.LIZIZ.put((EnumC669620QOi) obj, Boolean.FALSE);
        }
    }

    public final int LIZ(EnumC669620QOi enumC669620QOi) {
        int iIndexOf = ((ArrayList) this.LIZ).indexOf(enumC669620QOi);
        if (iIndexOf < 0) {
            return 0;
        }
        return iIndexOf;
    }

    public final EnumC669620QOi LIZIZ(int i) {
        if (i >= 0 && i < ((ArrayList) this.LIZ).size()) {
            return (EnumC669620QOi) C13LP.LJJJLZIJ(i, this.LIZ);
        }
        return null;
    }
}

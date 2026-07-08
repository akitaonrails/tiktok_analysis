package X;

import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0QOu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@InterfaceC1294060jmO
public final class C669740QOu {
    public static final List<EnumC669620QOi> LIZ = C1697810uHb.LJIIJJI(EnumC669620QOi.SHOP, EnumC669620QOi.ECOM_LIVE, EnumC669620QOi.STORE, EnumC669620QOi.ECOM_VIDEO);
    public static final List<EnumC669620QOi> LIZIZ = new ArrayList(LIZ(null));

    public static final int LJ() {
        return ((ArrayList) LIZIZ).indexOf(EnumC669620QOi.SHOP);
    }

    public static List LIZ(SearchResultParam searchResultParam) {
        List<EnumC669620QOi> list = LIZ;
        List list2 = list;
        if (searchResultParam != null) {
            String singleTabType = searchResultParam.getSingleTabType();
            list2 = list;
            if (singleTabType != null) {
                list2 = list;
                if (C703302op.LIZ(singleTabType)) {
                    ArrayList arrayList = new ArrayList();
                    EnumC669620QOi.Companion.getClass();
                    EnumC669620QOi enumC669620QOiLIZ = C669650QOl.LIZ(singleTabType);
                    list2 = arrayList;
                    if (enumC669620QOiLIZ != null) {
                        arrayList.add(enumC669620QOiLIZ);
                        list2 = arrayList;
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            int i = C669720QOs.LIZ[((EnumC669620QOi) obj).ordinal()];
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
            arrayList2.add(obj);
        }
        if (arrayList2.isEmpty()) {
            return Collections.singletonList(EnumC669620QOi.SHOP);
        }
        return arrayList2;
    }

    public static final int LIZIZ(EnumC669620QOi enumC669620QOi) {
        return ((ArrayList) LIZIZ).indexOf(enumC669620QOi);
    }

    public static final int LIZJ(String str) {
        List<EnumC669620QOi> list = LIZIZ;
        EnumC669620QOi.Companion.getClass();
        return ((ArrayList) list).indexOf(C669650QOl.LIZ(str));
    }

    public static final String LIZLLL(int i) {
        EnumC669620QOi enumC669620QOi;
        String tabName;
        if (i >= 0) {
            List<EnumC669620QOi> list = LIZIZ;
            if (i < ((ArrayList) list).size() && (enumC669620QOi = (EnumC669620QOi) C13LP.LJJJLZIJ(i, list)) != null && (tabName = enumC669620QOi.getTabName()) != null) {
                return tabName;
            }
        }
        return "";
    }

    public static void LJFF(SearchResultParam searchResultParam) {
        ArrayList arrayList = (ArrayList) LIZIZ;
        arrayList.clear();
        arrayList.addAll(LIZ(searchResultParam));
    }
}

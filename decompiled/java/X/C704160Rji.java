package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Rji, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C704160Rji {
    public static final List<C699770Rcd> LIZ(List<AnchorCommonStruct> list) {
        if (list == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (AnchorCommonStruct anchorCommonStruct : list) {
            if (anchorCommonStruct != null) {
                arrayList.add(new C699770Rcd(anchorCommonStruct.getComponentKey()));
            }
        }
        return arrayList;
    }

    public static C204664156o LIZJ(List list, String str, EnumC204669156t enumC204669156t) {
        return LIZIZ(enumC204669156t, str, list, C13BV.INSTANCE);
    }

    public static final C204664156o LIZIZ(EnumC204669156t enumC204669156t, String str, List list, List list2) {
        String componentKey;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (AnchorCommonStruct anchorCommonStruct : list) {
            if (anchorCommonStruct == null || (componentKey = anchorCommonStruct.getComponentKey()) == null) {
                componentKey = "";
            }
            arrayList.add(componentKey);
        }
        return new C204664156o(enumC204669156t, str, arrayList, list2);
    }
}

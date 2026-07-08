package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wRs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781060wRs {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(List list, List list2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tabsEquals enter a=");
        sbLIZ.append(list.size());
        sbLIZ.append(" b=");
        sbLIZ.append(list2.size());
        C20441214yg.LIZIZ("CreatorRankingTabMetaReducer", C2188811AlT.LIZIZ(sbLIZ));
        if (list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C1779500wPM c1779500wPM = (C1779500wPM) ListProtector.get(list, i);
            C1779500wPM c1779500wPM2 = (C1779500wPM) ListProtector.get(list2, i);
            if (c1779500wPM.LIZ != c1779500wPM2.LIZ || !Intrinsics.LJFF(c1779500wPM.LIZIZ, c1779500wPM2.LIZIZ)) {
                return false;
            }
        }
        return true;
    }
}

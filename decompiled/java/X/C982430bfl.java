package X;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0bfl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982430bfl {
    public static void LIZ(String str, List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C982390bfh c982390bfh = (C982390bfh) it2.next();
            long j = c982390bfh.LIZJ;
            long j2 = c982390bfh.LIZIZ;
            List<C982710bgD> list2 = c982390bfh.LJI;
            StringBuilder sb = new StringBuilder("uid=");
            Iterator<C982710bgD> it3 = list2.iterator();
            while (it3.hasNext()) {
                sb.append(it3.next().LIZ);
                sb.append(", ");
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TeamInfo. ");
            sbLIZ.append((Object) sb);
            sbLIZ.append("rank=");
            sbLIZ.append(j);
            sbLIZ.append(", score=");
            sbLIZ.append(j2);
            sbLIZ.append(". Set by=");
            sbLIZ.append(str);
            C20441214yg.LIZIZ("TakeTheStageWindowComponent", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}

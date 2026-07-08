package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.07fO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1918807fO {
    public static List<String> LIZ = new ArrayList();

    public static void LIZ(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        LIZ = arrayList;
        C2119208Ry.LIZIZ(null, "vids_count", null, C2097908Jt.LIZJ(new Pair("vids_count", Integer.valueOf(((ArrayList) LIZ).size()))));
    }
}

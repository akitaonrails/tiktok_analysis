package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.07li, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1958007li {
    public static final ArrayList<String> LIZ = new ArrayList<>();

    public static ArrayList<String> LIZ() {
        String strLIZIZ = "";
        for (String str : LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(str);
            sbLIZ.append(" , ");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(LIZ);
        arrayList.addAll(C2232308or.LIZIZ().LIZ());
        return arrayList;
    }
}

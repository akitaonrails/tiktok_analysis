package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.0yB4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1847520yB4 {
    public static final C1847520yB4 LIZ = new C1847520yB4();

    public static String[] LIZ(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        C0VSJ c0vsj = new C0VSJ(str);
        if (c0vsj.exists() && c0vsj.isDirectory()) {
            long length = c0vsj.length();
            for (long j = 0; j < length; j++) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append(j);
                sbLIZ.append(".png");
                C0VSJ c0vsj2 = new C0VSJ(str, C2188811AlT.LIZIZ(sbLIZ));
                if (c0vsj2.exists()) {
                    arrayList.add(c0vsj2.getPath());
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static String[] LIZIZ(C438740HIi[] c438740HIiArr, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        int length = c438740HIiArr.length;
        for (int i = 0; i < length; i++) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(i);
            sbLIZ.append(".png");
            String path = new C0VSJ(str, C2188811AlT.LIZIZ(sbLIZ)).getPath();
            if (c438740HIiArr[i].LJFF(path)) {
                arrayList.add(path);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}

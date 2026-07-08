package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.00cz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C120300cz {
    public static final String LIZ(List list) {
        String string;
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                if (obj == null) {
                    string = "";
                } else {
                    string = obj.toString();
                }
                sb.append(string);
                if (string.length() > 0 && i != arrayList.size() - 1) {
                    sb.append(";");
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return sb.toString();
    }
}

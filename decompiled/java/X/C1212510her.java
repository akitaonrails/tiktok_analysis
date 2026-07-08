package X;

import java.util.List;

/* JADX INFO: renamed from: X.0her, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1212510her {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(List list) {
        if (list == null) {
            return "no item!";
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                sb.append(((InterfaceC19526611aS) obj).LJJ());
                if (i != size - 1) {
                    sb.append(",");
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

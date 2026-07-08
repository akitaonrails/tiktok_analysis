package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.14Zt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20287514Zt {
    public static final C1566110qrB<String> LIZ = new C1566110qrB<>(16);

    public static EnumC20290114aJ LIZ(int i) {
        List<EnumC20290114aJ> list;
        if (i > 16 || i <= 0) {
            return null;
        }
        C1566110qrB<String> c1566110qrB = LIZ;
        if (c1566110qrB.LIZIZ.size() <= i) {
            return null;
        }
        ArrayList<String> arrayListLIZ = c1566110qrB.LIZ(i + 1);
        ArrayList<List> arrayList = new ArrayList(C15438062q.LJIJJ(arrayListLIZ, 10));
        for (String str : arrayListLIZ) {
            C20289814aG.LIZ.getClass();
            C2252061DCq c2252061DCqLIZ = C20287614Zu.LIZ("homepage_hot", str, null);
            if (c2252061DCqLIZ != null) {
                list = c2252061DCqLIZ.LJJJLL;
            } else {
                list = null;
            }
            arrayList.add(list);
        }
        if (!arrayList.isEmpty()) {
            for (List list2 : arrayList) {
                if (list2 == null || !list2.contains(EnumC20290114aJ.SKIP)) {
                    return null;
                }
            }
        }
        return EnumC20290114aJ.MULTI_SKIP;
    }
}

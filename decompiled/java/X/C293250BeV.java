package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.0BeV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C293250BeV {
    public static String LIZ() {
        ArrayList arrayList = new ArrayList();
        C01GW c01gw = C288370BRz.LIZ;
        if (C123100dR.LIZ((String) c01gw.getValue())) {
            arrayList.add(c01gw.getValue());
        }
        arrayList.add("combine");
        arrayList.add(C288350BRx.LIZ.getValue());
        if (C0BJD.LIZ()) {
            arrayList.add("translation_reverse");
        }
        if (!C293260BeW.LIZ()) {
            arrayList.add("caption_reverse");
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
    }
}

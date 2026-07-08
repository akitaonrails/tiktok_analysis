package X;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: X.0XLA, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XLA {
    public static InterfaceC847030XKr LIZIZ;
    public static int LIZJ;
    public C1495520p1K LIZ;

    public static void LIZ(C1495510p1J c1495510p1J) {
        ArrayList arrayList = new ArrayList();
        int i = LIZJ;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    arrayList.add(EnumC847200XLi.HTTP_2);
                    arrayList.add(EnumC847200XLi.SPDY_3);
                }
            } else {
                arrayList.add(EnumC847200XLi.SPDY_3);
            }
        } else {
            arrayList.add(EnumC847200XLi.HTTP_2);
        }
        LIZJ = 4;
        arrayList.add(EnumC847200XLi.HTTP_1_1);
        c1495510p1J.protocols(Collections.unmodifiableList(arrayList));
    }
}

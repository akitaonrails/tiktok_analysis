package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.04m4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1195804m4 {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(int i, int i2, int i3, boolean z) {
        int i4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (i2 != 0 && i3 != 0) {
            int i5 = 0;
            if (z) {
                while (i5 < i2) {
                    linkedHashMap.put(Integer.valueOf(i5), Integer.valueOf(i5));
                    i5++;
                }
            } else {
                while (i5 < i2) {
                    if (i5 == i) {
                        i4 = i3;
                    } else if (i5 < i) {
                        i4 = i5;
                    } else {
                        i4 = i5 - 1;
                    }
                    linkedHashMap.put(Integer.valueOf(i5), Integer.valueOf(i4));
                    i5++;
                }
            }
        }
        return linkedHashMap;
    }
}

package X;

import java.util.ArrayList;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Hf0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C446440Hf0 {
    public static final Pair<String[], int[]> LIZ(C0HWO... c0hwoArr) {
        int i;
        ArrayList arrayList = new ArrayList(c0hwoArr.length);
        for (C0HWO c0hwo : c0hwoArr) {
            arrayList.add(c0hwo.LIZ);
        }
        Object[] array = arrayList.toArray(new String[0]);
        ArrayList arrayList2 = new ArrayList(c0hwoArr.length);
        for (C0HWO c0hwo2 : c0hwoArr) {
            if (c0hwo2.LIZIZ == EnumC442280HVy.GRANTED) {
                i = 0;
            } else {
                i = -1;
            }
            arrayList2.add(Integer.valueOf(i));
        }
        return new Pair<>(array, C13LP.LLII(arrayList2));
    }
}

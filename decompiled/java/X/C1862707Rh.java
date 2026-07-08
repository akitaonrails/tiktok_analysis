package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.07Rh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1862707Rh {
    public static final HashMap<String, Integer> LIZ = new HashMap<>();

    public static int LIZ(String str) {
        Integer num = LIZ.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }
}

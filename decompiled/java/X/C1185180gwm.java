package X;

import android.util.LruCache;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: renamed from: X.0gwm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1185180gwm {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(821));

    public static C1185160gwk LIZIZ(String str) {
        if (str == null) {
            return null;
        }
        return (C1185160gwk) ((LruCache) LIZ.getValue()).get(str);
    }

    public static void LIZ(String str, C1185160gwk c1185160gwk) {
        if (str == null) {
            return;
        }
        ((LruCache) LIZ.getValue()).put(str, c1185160gwk);
    }
}

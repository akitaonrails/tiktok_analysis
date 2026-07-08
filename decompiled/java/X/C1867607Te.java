package X;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Te, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1867607Te {
    public static final boolean LIZ(String str) {
        ArrayList arrayListLJ = C1697810uHb.LJ("speed_curve_edit_panel");
        if (arrayListLJ.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayListLJ.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next(), str)) {
                return true;
            }
        }
        return false;
    }
}

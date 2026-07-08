package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0raD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1594030raD {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(609));

    public static C1592040rX0 LIZIZ() {
        return (C1592040rX0) LIZ.getValue();
    }

    public static boolean LIZ(String str, boolean z, List list) {
        boolean z2 = false;
        if (C086I.LIZIZ(list)) {
            return false;
        }
        ArrayList arrayList = (ArrayList) list;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            String str2 = (String) ListProtector.get(list, size);
            if (TextUtils.equals(str2, "zh-hant")) {
                ListProtector.set(list, size, "zh-Hant");
            }
            if (u.LJIJI(str2, str, true)) {
                if (z) {
                    arrayList.remove(str2);
                }
                z2 = true;
            }
        }
        return z2;
    }
}

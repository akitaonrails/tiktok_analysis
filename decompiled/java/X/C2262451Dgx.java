package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.u;

/* JADX INFO: renamed from: X.1Dgx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2262451Dgx {
    public static final List<String> LIZ;

    static {
        ArrayList arrayList = new ArrayList();
        LIZ = arrayList;
        arrayList.add("TCP_HIT");
        arrayList.add("TCP_MISS");
        arrayList.add("HIT, HIT");
        arrayList.add("HIT, MISS");
        arrayList.add("MISS, HIT");
        arrayList.add("MISS, MISS");
        arrayList.add("HIT");
        arrayList.add("MISS");
        arrayList.add("TCP_MEM_HIT");
        arrayList.add("TCP_REFRESH_HIT");
        arrayList.add("TCP_REFRESH_MISS");
        arrayList.add("TCP_REFRESH_FAIL_HIT");
        arrayList.add("TCP_IMS_HIT");
        arrayList.add("TCP_NEGATIVE_HIT");
    }

    public static int LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        for (String str2 : (ArrayList) LIZ) {
            if (u.LJJIIJZLJL(str, str2, false)) {
                return ((ArrayList) LIZ).indexOf(str2) + 1;
            }
        }
        return 0;
    }
}

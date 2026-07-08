package X;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15TE, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15TE {
    public static final void LIZ(List<C20526015Tm> list, Set<String> set, Long l, String str, String str2, String str3, String str4, String str5, String str6) {
        boolean z;
        if (l != null) {
            z = true;
        } else {
            z = false;
        }
        if (str2 == null || set == null || set.isEmpty()) {
            set = C08CX.INSTANCE;
        }
        for (C20526015Tm c20526015Tm : list) {
            String aid = c20526015Tm.LL.getAid();
            if (z) {
                c20526015Tm.LLJIJIL = l;
                c20526015Tm.LLJILJIL = str;
                c20526015Tm.LLJJ = str4;
            }
            if (aid != null && set.contains(aid)) {
                c20526015Tm.LLJILJILJ = str2;
                c20526015Tm.LLJILLL = str3;
                c20526015Tm.LLJJI = str5;
            }
            if (str6 != null && Intrinsics.LJFF(aid, str6)) {
                c20526015Tm.LLJJIII = true;
            }
        }
    }
}

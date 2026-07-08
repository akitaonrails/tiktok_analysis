package X;

import java.util.List;

/* JADX INFO: renamed from: X.0bWo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976880bWo {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(List list, List list2) {
        if (list != null && list2 != null && list.size() == list2.size() && list.containsAll(list2)) {
            return true;
        }
        return false;
    }
}

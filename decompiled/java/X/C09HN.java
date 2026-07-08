package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.09HN, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09HN {
    public static final C09HM LIZ = C09HM.LL;

    public static final <T> ArrayList<T> LIZ(List<? extends T> list) {
        if (list != null && !(list instanceof ArrayList)) {
            return new ArrayList<>(list);
        }
        return (ArrayList) list;
    }
}

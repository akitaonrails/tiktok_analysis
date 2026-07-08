package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: X.08V7, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C08V7 {
    public static /* synthetic */ List LIZ() {
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{"live_gift_guide"}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return Collections.unmodifiableList(arrayList);
    }
}

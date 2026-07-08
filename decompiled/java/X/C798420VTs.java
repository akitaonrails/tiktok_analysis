package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VTs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C798420VTs {
    public final ConcurrentHashMap<String, Object> LIZ = new ConcurrentHashMap<>();

    public final void LIZ(Object obj, String str) {
        if (str != null && obj != null) {
            if (!(obj instanceof Integer) && !Intrinsics.LJFF(obj, C2340809Fe.LIZ) && !Intrinsics.LJFF(obj, C778860Ugu.LIZ)) {
                this.LIZ.put(str, obj.toString());
            } else {
                this.LIZ.put(str, obj);
            }
        }
    }
}

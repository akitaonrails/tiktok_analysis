package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0V4z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C791990V4z extends WeakReference<Object> {
    public final String LIZ;

    public static void LIZ(Object obj, String str) {
        if (obj != null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" must not be null");
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C791990V4z(Object obj, String str, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        LIZ(obj, "referent");
        LIZ(referenceQueue, "referenceQueue");
        LIZ(str, "key");
        this.LIZ = str;
    }
}

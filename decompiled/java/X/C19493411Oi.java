package X;

import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.11Oi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19493411Oi<T> {
    public static final C19493411Oi<Object> LIZIZ = new C19493411Oi<>(null);
    public final Object LIZ;

    public final int hashCode() {
        Object obj = this.LIZ;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.LIZ;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (C11PO.isError(obj)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("OnErrorNotification[");
            sbLIZ.append(C11PO.getError(obj));
            sbLIZ.append(e3.f);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("OnNextNotification[");
        sbLIZ2.append(this.LIZ);
        sbLIZ2.append(e3.f);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public C19493411Oi(Object obj) {
        this.LIZ = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19493411Oi)) {
            return false;
        }
        Object obj2 = this.LIZ;
        Object obj3 = ((C19493411Oi) obj).LIZ;
        if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
            return false;
        }
        return true;
    }
}

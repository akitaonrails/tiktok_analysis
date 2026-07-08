package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NKD, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public abstract class C0NKD {
    public final C0NKA LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public C0NKD(C0NKA c0nka) {
        this.LIZ = c0nka;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (Intrinsics.LJFF(cls2, cls) && this.LIZ == ((C0NKD) obj).LIZ) {
            return true;
        }
        return false;
    }
}

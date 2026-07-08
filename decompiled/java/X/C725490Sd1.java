package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sd1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C725490Sd1 {
    public final AbstractC725500Sd2<?> LIZ;
    public final String LIZIZ;

    public final int hashCode() {
        return (this.LIZ.LIZ().hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(C725490Sd1.class, cls)) {
            return false;
        }
        C725490Sd1 c725490Sd1 = (C725490Sd1) obj;
        if (Intrinsics.LJFF(this.LIZ, c725490Sd1.LIZ) && Intrinsics.LJFF(this.LIZIZ, c725490Sd1.LIZIZ)) {
            return true;
        }
        return false;
    }

    public C725490Sd1(AbstractC725510Sd3 abstractC725510Sd3, String str) {
        this.LIZ = abstractC725510Sd3;
        this.LIZIZ = str;
    }
}

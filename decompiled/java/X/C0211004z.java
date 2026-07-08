package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.004z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0211004z {
    public final String LIZ;
    public int LIZIZ;

    public C0211004z() {
        this(0);
    }

    public final int hashCode() {
        if (this.LIZIZ == 0) {
            this.LIZIZ = this.LIZ.hashCode();
        }
        return this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectCacheKey(resource_id='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("')");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0211004z(int i) {
        this("");
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
        if (Intrinsics.LJFF(C0211004z.class, cls) && Intrinsics.LJFF(this.LIZ, ((C0211004z) obj).LIZ)) {
            return true;
        }
        return false;
    }

    public C0211004z(String str) {
        this.LIZ = str;
    }
}

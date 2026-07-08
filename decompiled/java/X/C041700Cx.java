package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Cx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C041700Cx {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C041700Cx)) {
            return false;
        }
        C041700Cx c041700Cx = (C041700Cx) obj;
        return Intrinsics.LJFF(this.LIZ, c041700Cx.LIZ) && Intrinsics.LJFF(this.LIZIZ, c041700Cx.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RenderError(componentName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C041700Cx(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}

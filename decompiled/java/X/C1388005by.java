package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05by, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1388005by extends C0M8P {
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1388005by) && Intrinsics.LJFF(this.LIZIZ, ((C1388005by) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClearAllSelectItems(from=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1388005by(String str) {
        super(false);
        this.LIZIZ = str;
    }
}

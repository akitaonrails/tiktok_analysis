package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M8c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C563480M8c extends C0M8P {
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C563480M8c) && Intrinsics.LJFF(this.LIZIZ, ((C563480M8c) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnEntranceShow(entranceKey=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C563480M8c(String str) {
        super(false);
        this.LIZIZ = str;
    }
}

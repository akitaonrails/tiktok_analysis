package X;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hdj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1211810hdj {
    public final int LIZ;
    public final View.OnClickListener LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1211810hdj)) {
            return false;
        }
        C1211810hdj c1211810hdj = (C1211810hdj) obj;
        return this.LIZ == c1211810hdj.LIZ && Intrinsics.LJFF(this.LIZIZ, c1211810hdj.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BindMethodOption(textRes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1211810hdj(int i, View.OnClickListener onClickListener) {
        this.LIZ = i;
        this.LIZIZ = onClickListener;
    }
}

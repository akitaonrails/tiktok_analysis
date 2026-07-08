package X;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bsF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C990170bsF {
    public static final /* synthetic */ int LIZJ = 0;
    public final int LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C990170bsF)) {
            return false;
        }
        C990170bsF c990170bsF = (C990170bsF) obj;
        return this.LIZ == c990170bsF.LIZ && Intrinsics.LJFF(this.LIZIZ, c990170bsF.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PanelText(resId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", arg=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZ(Context context) {
        String string;
        String str = this.LIZIZ;
        if (str == null || (string = context.getString(this.LIZ, str)) == null) {
            return context.getString(this.LIZ);
        }
        return string;
    }

    public C990170bsF(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}

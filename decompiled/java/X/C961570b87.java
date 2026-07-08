package X;

import android.text.Spannable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0b87, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C961570b87 {
    public final Spannable LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C961570b87)) {
            return false;
        }
        C961570b87 c961570b87 = (C961570b87) obj;
        return Intrinsics.LJFF(this.LIZ, c961570b87.LIZ) && Intrinsics.LJFF(this.LIZIZ, c961570b87.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c961570b87.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c961570b87.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CountdownTimerViewModel(description=");
        sbLIZ.append((Object) this.LIZ);
        sbLIZ.append(", hour=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", minute=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", second=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C961570b87(Spannable spannable, String str, String str2, String str3) {
        this.LIZ = spannable;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}

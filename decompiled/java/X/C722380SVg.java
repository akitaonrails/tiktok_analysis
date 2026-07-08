package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SVg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C722380SVg implements C07XH {
    public final C722300SUy LIZ;
    public final CharSequence LIZIZ;
    public final Function1<View, Unit> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C722380SVg)) {
            return false;
        }
        C722380SVg c722380SVg = (C722380SVg) obj;
        return Intrinsics.LJFF(this.LIZ, c722380SVg.LIZ) && Intrinsics.LJFF(this.LIZIZ, c722380SVg.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c722380SVg.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        Function1<View, Unit> function1 = this.LIZJ;
        return iHashCode + (function1 == null ? 0 : function1.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SCMTagModel(headIcon=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", title=");
        sbLIZ.append((Object) this.LIZIZ);
        sbLIZ.append(", actionBlock=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C722380SVg(C722300SUy c722300SUy, CharSequence charSequence, AwS377S0200000_11 awS377S0200000_11) {
        this.LIZ = c722300SUy;
        this.LIZIZ = charSequence;
        this.LIZJ = awS377S0200000_11;
    }
}

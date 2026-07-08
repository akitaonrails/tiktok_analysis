package X;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.005E, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C005E {
    public final CharSequence LIZ;
    public final View LIZIZ;

    public C005E() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C005E)) {
            return false;
        }
        C005E c005e = (C005E) obj;
        return Intrinsics.LJFF(this.LIZ, c005e.LIZ) && Intrinsics.LJFF(this.LIZIZ, c005e.LIZIZ);
    }

    public final int hashCode() {
        CharSequence charSequence = this.LIZ;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        View view = this.LIZIZ;
        return iHashCode + (view != null ? view.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TopPinnedTuxContent(title=");
        sbLIZ.append((Object) this.LIZ);
        sbLIZ.append(", iconView=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C005E(View view, CharSequence charSequence) {
        this.LIZ = charSequence;
        this.LIZIZ = view;
    }
}

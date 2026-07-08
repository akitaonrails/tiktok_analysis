package X;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0V0P, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V0P extends C0V0O {
    public final CharSequence LIZ;
    public final Drawable LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0V0P)) {
            return false;
        }
        C0V0P c0v0p = (C0V0P) obj;
        return Intrinsics.LJFF(this.LIZ, c0v0p.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0v0p.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unfold(text=");
        sbLIZ.append((Object) this.LIZ);
        sbLIZ.append(", background=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0V0P(CharSequence charSequence, Drawable drawable) {
        this.LIZ = charSequence;
        this.LIZIZ = drawable;
    }
}

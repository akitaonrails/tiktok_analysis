package X;

import android.graphics.Typeface;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13rb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20142513rb {
    public final Typeface LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20142513rb) && Intrinsics.LJFF(this.LIZ, ((C20142513rb) obj).LIZ);
    }

    public final int hashCode() {
        Typeface typeface = this.LIZ;
        if (typeface == null) {
            return 0;
        }
        return typeface.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TypefaceSlot(typeface=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20142513rb(Typeface typeface) {
        this.LIZ = typeface;
    }
}

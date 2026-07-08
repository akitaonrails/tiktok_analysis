package X;

import android.graphics.drawable.Animatable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fR8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1127120fR8 extends AbstractC1127100fR6 {
    public final Animatable LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1127120fR8) && Intrinsics.LJFF(this.LIZ, ((C1127120fR8) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageLoadHandleAnimatable(animatable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1127120fR8(Animatable animatable) {
        this.LIZ = animatable;
    }
}

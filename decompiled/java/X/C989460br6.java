package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0br6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989460br6 implements InterfaceC1670580tZg {
    public final Drawable LIZ;
    public final InterfaceC1320380kSq LIZIZ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C989460br6)) {
            return false;
        }
        C989460br6 c989460br6 = (C989460br6) obj;
        return Intrinsics.LJFF(this.LIZ, c989460br6.LIZ) && Intrinsics.LJFF(this.LIZIZ, c989460br6.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        InterfaceC1320380kSq interfaceC1320380kSq = this.LIZIZ;
        return iHashCode + (interfaceC1320380kSq == null ? 0 : interfaceC1320380kSq.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalDrawable(drawable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", scaleType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1670580tZg
    public final InterfaceC1320380kSq LIZ() {
        return this.LIZIZ;
    }

    public C989460br6(Drawable drawable) {
        this.LIZ = drawable;
    }

    @Override // X.InterfaceC1670580tZg
    public final Drawable LIZJ(Context context) {
        return this.LIZ;
    }
}

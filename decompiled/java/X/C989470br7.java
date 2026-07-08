package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0br7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989470br7 implements InterfaceC1670580tZg {
    public final int LIZ;
    public final InterfaceC1320380kSq LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C989470br7)) {
            return false;
        }
        C989470br7 c989470br7 = (C989470br7) obj;
        return this.LIZ == c989470br7.LIZ && Intrinsics.LJFF(this.LIZIZ, c989470br7.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        InterfaceC1320380kSq interfaceC1320380kSq = this.LIZIZ;
        return i + (interfaceC1320380kSq == null ? 0 : interfaceC1320380kSq.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalResource(resourceId=");
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

    @Override // X.InterfaceC1670580tZg
    public final Drawable LIZJ(Context context) {
        return C800330VaR.LIZIZ(context, this.LIZ);
    }

    public C989470br7(int i, InterfaceC1320380kSq interfaceC1320380kSq) {
        this.LIZ = i;
        this.LIZIZ = interfaceC1320380kSq;
    }
}

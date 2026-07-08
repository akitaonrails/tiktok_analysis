package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tZd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1670550tZd implements InterfaceC1670580tZg {
    public final long LIZ;
    public final InterfaceC1320380kSq LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1670550tZd)) {
            return false;
        }
        C1670550tZd c1670550tZd = (C1670550tZd) obj;
        return C1685910tyP.LJ(this.LIZ, c1670550tZd.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1670550tZd.LIZIZ);
    }

    public final int hashCode() {
        int iLJIIJ = C1685910tyP.LJIIJ(this.LIZ) * 31;
        InterfaceC1320380kSq interfaceC1320380kSq = this.LIZIZ;
        return iLJIIJ + (interfaceC1320380kSq == null ? 0 : interfaceC1320380kSq.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalColor(color=");
        sbLIZ.append((Object) C1685910tyP.LJIIJJI(this.LIZ));
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
        return new ColorDrawable(C1685850tyJ.LJIIIZ(this.LIZ));
    }

    public C1670550tZd(long j, InterfaceC1320380kSq interfaceC1320380kSq) {
        this.LIZ = j;
        this.LIZIZ = interfaceC1320380kSq;
    }
}

package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YOo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C873520YOo {
    public final List<C0YP5> LIZ;
    public final C0Y3I LIZIZ;
    public final boolean LIZJ;

    public C873520YOo() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C873520YOo)) {
            return false;
        }
        C873520YOo c873520YOo = (C873520YOo) obj;
        return Intrinsics.LJFF(this.LIZ, c873520YOo.LIZ) && Intrinsics.LJFF(this.LIZIZ, c873520YOo.LIZIZ) && this.LIZJ == c873520YOo.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Ordered(paramsList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tracer=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", disableAutoResend=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C873520YOo(List list, boolean z) {
        C0Y3I c0y3i = new C0Y3I("send msg pipeline ordered");
        this.LIZ = list;
        this.LIZIZ = c0y3i;
        this.LIZJ = z;
    }
}

package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YOp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C873530YOp {
    public final InterfaceC873710YPh LIZ;
    public final C0Y3I LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C873530YOp)) {
            return false;
        }
        C873530YOp c873530YOp = (C873530YOp) obj;
        return Intrinsics.LJFF(this.LIZ, c873530YOp.LIZ) && Intrinsics.LJFF(this.LIZIZ, c873530YOp.LIZIZ) && this.LIZJ == c873530YOp.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Single(msgSource=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tracer=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", disableAutoResend=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C873530YOp(C0YP4 c0yp4, boolean z) {
        this(c0yp4, new C0Y3I("send msg pipeline"), z);
    }

    public C873530YOp(C0YP4 c0yp4, C0Y3I c0y3i, boolean z) {
        this.LIZ = c0yp4;
        this.LIZIZ = c0y3i;
        this.LIZJ = z;
    }
}

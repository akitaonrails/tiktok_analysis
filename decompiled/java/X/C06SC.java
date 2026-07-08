package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06SC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06SC extends C06S9 implements InterfaceC904740ZeS {
    public final C0Y3I LIZ;
    public final int LIZIZ;
    public final C0YA6 LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C06SC)) {
            return false;
        }
        C06SC c06sc = (C06SC) obj;
        return Intrinsics.LJFF(this.LIZ, c06sc.LIZ) && this.LIZIZ == c06sc.LIZIZ && Intrinsics.LJFF(this.LIZJ, c06sc.LIZJ);
    }

    @Override // X.InterfaceC904740ZeS
    public final String getName() {
        return "OnSendModifyPropertyMsgEvent";
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnSendModifyPropertyMsgEvent(tracer=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", modifyMsgPropertyMsg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C06SC(C0Y3I c0y3i, int i, C0YA6 c0ya6) {
        this.LIZ = c0y3i;
        this.LIZIZ = i;
        this.LIZJ = c0ya6;
    }
}

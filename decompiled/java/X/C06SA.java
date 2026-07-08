package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06SA, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06SA extends C06S9 implements InterfaceC904740ZeS {
    public final C0Y3I LIZ;
    public final int LIZIZ;
    public final C869590Y9l LIZJ;
    public final C0YC9 LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C06SA)) {
            return false;
        }
        C06SA c06sa = (C06SA) obj;
        return Intrinsics.LJFF(this.LIZ, c06sa.LIZ) && this.LIZIZ == c06sa.LIZIZ && Intrinsics.LJFF(this.LIZJ, c06sa.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c06sa.LIZLLL);
    }

    @Override // X.InterfaceC904740ZeS
    public final String getName() {
        return "OnSendMessageEvent";
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31;
        C0YC9 c0yc9 = this.LIZLLL;
        return iHashCode + (c0yc9 == null ? 0 : c0yc9.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnSendMessageEvent(tracer=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", metrics=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C06SA(C0Y3I c0y3i, int i, C869590Y9l c869590Y9l, C0YC9 c0yc9) {
        this.LIZ = c0y3i;
        this.LIZIZ = i;
        this.LIZJ = c869590Y9l;
        this.LIZLLL = c0yc9;
    }
}

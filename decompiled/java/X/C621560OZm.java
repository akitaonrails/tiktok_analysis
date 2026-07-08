package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OZm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C621560OZm implements InterfaceC19745512Nh {
    public final C1342130l1v LIZ;
    public final C1342130l1v LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C621560OZm)) {
            return false;
        }
        C621560OZm c621560OZm = (C621560OZm) obj;
        return Intrinsics.LJFF(this.LIZ, c621560OZm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c621560OZm.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PopSpringParam(bounciness=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", speed=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C621560OZm(C1342130l1v c1342130l1v, C1342130l1v c1342130l1v2) {
        this.LIZ = c1342130l1v;
        this.LIZIZ = c1342130l1v2;
    }
}

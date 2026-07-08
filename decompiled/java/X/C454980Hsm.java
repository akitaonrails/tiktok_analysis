package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hsm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C454980Hsm implements InterfaceC454990Hsn {
    public final C869590Y9l LIZ;
    public final C0I3C LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C454980Hsm)) {
            return false;
        }
        C454980Hsm c454980Hsm = (C454980Hsm) obj;
        return Intrinsics.LJFF(this.LIZ, c454980Hsm.LIZ) && this.LIZIZ == c454980Hsm.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReplyMsgData(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", origin=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C454980Hsm(C869590Y9l c869590Y9l, C0I3C c0i3c) {
        this.LIZ = c869590Y9l;
        this.LIZIZ = c0i3c;
    }
}

package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bOp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C971930bOp implements InterfaceC951240arS<Object> {
    public final String LIZ;

    public C971930bOp(String str) {
        this.LIZ = str;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        if (!(obj instanceof C971930bOp)) {
            return false;
        }
        return Intrinsics.LJFF(((C971930bOp) obj).LIZ, this.LIZ);
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        if ((obj instanceof C971930bOp) && Intrinsics.LJFF(((C971930bOp) obj).LIZ, this.LIZ)) {
            return true;
        }
        return false;
    }
}

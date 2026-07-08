package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.160U, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C160U {
    public final EnumC1778990wOX LIZ;
    public final C207047160f LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C160U)) {
            return false;
        }
        C160U c160u = (C160U) obj;
        return this.LIZ == c160u.LIZ && Intrinsics.LJFF(this.LIZIZ, c160u.LIZIZ);
    }

    public C160U(EnumC1778990wOX enumC1778990wOX, C207047160f c207047160f) {
        this.LIZ = enumC1778990wOX;
        this.LIZIZ = c207047160f;
    }
}

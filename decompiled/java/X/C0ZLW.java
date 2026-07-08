package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZLW, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZLW {
    public final boolean LIZ;
    public final C908520ZkY LIZIZ;

    public C0ZLW() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZLW)) {
            return false;
        }
        C0ZLW c0zlw = (C0ZLW) obj;
        return this.LIZ == c0zlw.LIZ && Intrinsics.LJFF(this.LIZIZ, c0zlw.LIZIZ);
    }

    public /* synthetic */ C0ZLW(int i) {
        this(null, false);
    }

    public C0ZLW(C908520ZkY c908520ZkY, boolean z) {
        this.LIZ = z;
        this.LIZIZ = c908520ZkY;
    }
}

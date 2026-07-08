package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JDO, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JDO {
    public final String LIZ;
    public final boolean LIZIZ;

    public C0JDO() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0JDO)) {
            return false;
        }
        C0JDO c0jdo = (C0JDO) obj;
        return Intrinsics.LJFF(this.LIZ, c0jdo.LIZ) && this.LIZIZ == c0jdo.LIZIZ;
    }

    public /* synthetic */ C0JDO(int i) {
        this("", false);
    }

    public C0JDO(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}

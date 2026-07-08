package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ggO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1175020ggO {
    public final String LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1175020ggO)) {
            return false;
        }
        C1175020ggO c1175020ggO = (C1175020ggO) obj;
        return Intrinsics.LJFF(this.LIZ, c1175020ggO.LIZ) && this.LIZIZ == c1175020ggO.LIZIZ;
    }

    public C1175020ggO(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}

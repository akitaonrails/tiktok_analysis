package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HAv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C436790HAv {
    public final List<C1786400waU> LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C436790HAv)) {
            return false;
        }
        C436790HAv c436790HAv = (C436790HAv) obj;
        return Intrinsics.LJFF(this.LIZ, c436790HAv.LIZ) && Intrinsics.LJFF(this.LIZIZ, c436790HAv.LIZIZ);
    }

    public C436790HAv(List<C1786400waU> list, String str) {
        this.LIZ = list;
        this.LIZIZ = str;
    }

    public static C436790HAv LIZ(C436790HAv c436790HAv, List list) {
        String str = c436790HAv.LIZIZ;
        c436790HAv.getClass();
        return new C436790HAv(list, str);
    }
}

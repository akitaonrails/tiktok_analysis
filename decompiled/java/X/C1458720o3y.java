package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0o3y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1458720o3y {
    public final List<String> LIZ;
    public final C11RK<String> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1458720o3y)) {
            return false;
        }
        C1458720o3y c1458720o3y = (C1458720o3y) obj;
        return Intrinsics.LJFF(this.LIZ, c1458720o3y.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1458720o3y.LIZIZ);
    }

    public C1458720o3y(List<String> list, C11RK<String> c11rk) {
        this.LIZ = list;
        this.LIZIZ = c11rk;
    }
}

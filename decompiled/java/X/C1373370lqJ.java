package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lqJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1373370lqJ {
    public final String LIZ;
    public final List<Object> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1373370lqJ)) {
            return false;
        }
        C1373370lqJ c1373370lqJ = (C1373370lqJ) obj;
        return Intrinsics.LJFF(this.LIZ, c1373370lqJ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1373370lqJ.LIZIZ);
    }

    public C1373370lqJ(String str, List<? extends Object> list) {
        this.LIZ = str;
        this.LIZIZ = list;
    }
}

package X;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0twH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1684590twH {
    public final int LIZ;
    public final float[] LIZIZ;

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(C1684590twH.class, cls)) {
            return false;
        }
        C1684590twH c1684590twH = (C1684590twH) obj;
        if (this.LIZ != c1684590twH.LIZ) {
            return false;
        }
        return Arrays.equals(this.LIZIZ, c1684590twH.LIZIZ);
    }

    public C1684590twH(int i, float[] fArr) {
        this.LIZ = i;
        this.LIZIZ = fArr;
    }
}

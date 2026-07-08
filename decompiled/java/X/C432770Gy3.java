package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gy3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C432770Gy3 {
    public final List<Float> LIZ;
    public final List<Float> LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C432770Gy3)) {
            return false;
        }
        C432770Gy3 c432770Gy3 = (C432770Gy3) obj;
        return Intrinsics.LJFF(this.LIZ, c432770Gy3.LIZ) && Intrinsics.LJFF(this.LIZIZ, c432770Gy3.LIZIZ) && this.LIZJ == c432770Gy3.LIZJ;
    }

    public C432770Gy3(List<Float> list, List<Float> list2, int i) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = i;
    }
}

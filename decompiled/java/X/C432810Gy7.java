package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gy7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C432810Gy7 {
    public final List<Float> LIZ;
    public final int LIZIZ;
    public final float LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C432810Gy7)) {
            return false;
        }
        C432810Gy7 c432810Gy7 = (C432810Gy7) obj;
        return Intrinsics.LJFF(this.LIZ, c432810Gy7.LIZ) && this.LIZIZ == c432810Gy7.LIZIZ && Float.compare(this.LIZJ, c432810Gy7.LIZJ) == 0;
    }

    public C432810Gy7(float f, int i, List list) {
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = f;
    }
}

package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0f9Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1116220f9Y {
    public final List<C1116210f9X> LIZ;
    public int LIZIZ;
    public C0VRR LIZJ;

    public C1116220f9Y() {
        throw null;
    }

    public C1116220f9Y(List list) {
        C0VRR c0vrr = C0VRR.UNKNOWN;
        this.LIZ = list;
        this.LIZIZ = 0;
        this.LIZJ = c0vrr;
    }

    public final void LIZ(C1116210f9X c1116210f9X) {
        if (!this.LIZ.isEmpty()) {
            for (int size = this.LIZ.size() - 1; -1 < size; size--) {
                if (Intrinsics.LJFF(((C1116210f9X) ListProtector.get(this.LIZ, size)).LL, c1116210f9X.LL)) {
                    if (((C1116210f9X) ListProtector.get(this.LIZ, size)).LLIZ != 2) {
                        ListProtector.set(this.LIZ, size, c1116210f9X);
                    }
                    this.LIZIZ = size;
                    this.LIZJ = C0VRR.REPLACE;
                    return;
                }
            }
        }
        this.LIZ.add(c1116210f9X);
        this.LIZIZ = this.LIZ.size() - 1;
        this.LIZJ = C0VRR.INSERT;
    }
}

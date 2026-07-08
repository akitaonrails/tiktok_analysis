package X;

import android.util.SparseBooleanArray;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.166O, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C166O {
    public static final C166S LJFF = new C166T() { // from class: X.166S
        @Override // X.C166T
        public final boolean LIZ(float[] fArr) {
            float f = fArr[2];
            if (f < 0.95f && f > 0.05f) {
                float f2 = fArr[0];
                if (f2 < 10.0f || f2 > 37.0f || fArr[1] > 0.82f) {
                    return true;
                }
            }
            return false;
        }
    };
    public final List<C166P> LIZ;
    public final List<C166F> LIZIZ;
    public final C166P LJ;
    public final SparseBooleanArray LIZLLL = new SparseBooleanArray();
    public final C830490Whz LIZJ = new C830490Whz();

    public C166O(List<C166P> list, List<C166F> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
        int size = ((ArrayList) list).size();
        int i = Integer.MIN_VALUE;
        C166P c166p = null;
        for (int i2 = 0; i2 < size; i2++) {
            C166P c166p2 = (C166P) ListProtector.get(this.LIZ, i2);
            int i3 = c166p2.LJ;
            if (i3 > i) {
                c166p = c166p2;
                i = i3;
            }
        }
        this.LJ = c166p;
    }
}

package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0DoL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350310DoL {
    public final int[] LIZ;
    public final float[] LIZIZ;

    public C350310DoL(List<Integer> list, List<Float> list2) {
        int size = ((ArrayList) list).size();
        this.LIZ = new int[size];
        this.LIZIZ = new float[size];
        for (int i = 0; i < size; i++) {
            this.LIZ[i] = ((Integer) ListProtector.get(list, i)).intValue();
            this.LIZIZ[i] = ((Float) ListProtector.get(list2, i)).floatValue();
        }
    }

    public C350310DoL(int i, int i2) {
        this.LIZ = new int[]{i, i2};
        this.LIZIZ = new float[]{0.0f, 1.0f};
    }

    public C350310DoL(int i, int i2, int i3) {
        this.LIZ = new int[]{i, i2, i3};
        this.LIZIZ = new float[]{0.0f, 0.5f, 1.0f};
    }
}

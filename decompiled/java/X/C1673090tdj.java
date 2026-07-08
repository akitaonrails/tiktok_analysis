package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0tdj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1673090tdj<T> {
    public final List<T> LIZ = new ArrayList();
    public float[] LIZIZ;

    public C1673090tdj() {
        float[] fArr = new float[5];
        int i = 0;
        do {
            fArr[i] = Float.NaN;
            i++;
        } while (i < 5);
        this.LIZIZ = fArr;
    }

    public final void LIZ(float f, Object obj) {
        ((ArrayList) this.LIZ).add(obj);
        if (this.LIZIZ.length < ((ArrayList) this.LIZ).size()) {
            this.LIZIZ = Arrays.copyOf(this.LIZIZ, ((ArrayList) this.LIZ).size() + 2);
        }
        this.LIZIZ[((ArrayList) this.LIZ).size() - 1] = f;
    }
}

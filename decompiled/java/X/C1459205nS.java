package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.05nS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1459205nS {
    public static final int[] LIZ(float[] fArr) {
        ArrayList arrayList = new ArrayList();
        for (float f : fArr) {
            arrayList.add(Integer.valueOf(C814420VxA.LIZIZ(f * 255) << 24));
        }
        return C13LP.LLII(arrayList);
    }
}

package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.0pO7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509650pO7 implements InterfaceC1509660pO8 {
    public static final C1509650pO7 LIZ = new C1509650pO7();

    @Override // X.InterfaceC1509660pO8
    public final <T> long LIZ(ArrayList<T> arrayList) {
        long j = Long.MAX_VALUE;
        if (arrayList != null) {
            for (T t : arrayList) {
                if (t instanceof Number) {
                    long jLongValue = ((Number) t).longValue();
                    if (jLongValue <= j) {
                        j = jLongValue;
                    }
                }
            }
        }
        return j;
    }
}

package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.0pO2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509600pO2 implements InterfaceC1509660pO8 {
    public static final C1509600pO2 LIZ = new C1509600pO2();

    @Override // X.InterfaceC1509660pO8
    public final <T> long LIZ(ArrayList<T> arrayList) {
        long j = 0;
        if (arrayList != null) {
            for (T t : arrayList) {
                if (t instanceof Number) {
                    long jLongValue = ((Number) t).longValue();
                    if (j < jLongValue) {
                        j = jLongValue;
                    }
                }
            }
        }
        return j;
    }
}

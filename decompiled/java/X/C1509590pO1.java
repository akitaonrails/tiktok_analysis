package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.0pO1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509590pO1 implements InterfaceC1509660pO8 {
    public static final C1509590pO1 LIZ = new C1509590pO1();

    @Override // X.InterfaceC1509660pO8
    public final <T> long LIZ(ArrayList<T> arrayList) {
        if (arrayList != null) {
            long jLongValue = 0;
            for (T t : arrayList) {
                if (t instanceof Number) {
                    jLongValue += ((Number) t).longValue();
                }
            }
            if (arrayList.size() > 0) {
                return jLongValue / ((long) arrayList.size());
            }
        }
        return 0L;
    }
}

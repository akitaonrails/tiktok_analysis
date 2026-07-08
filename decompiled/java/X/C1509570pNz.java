package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.0pNz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509570pNz implements InterfaceC1509660pO8 {
    public static final C1509570pNz LIZ = new C1509570pNz();

    @Override // X.InterfaceC1509660pO8
    public final <T> long LIZ(ArrayList<T> arrayList) {
        long jLongValue = 0;
        if (arrayList != null) {
            for (T t : arrayList) {
                if (t instanceof Number) {
                    jLongValue += ((Number) t).longValue();
                }
            }
        }
        return jLongValue;
    }
}

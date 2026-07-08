package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0pO0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509580pO0 implements InterfaceC1509660pO8 {
    public static final C1509580pO0 LIZ = new C1509580pO0();

    @Override // X.InterfaceC1509660pO8
    public final <T> long LIZ(ArrayList<T> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (T t : arrayList) {
                if (t instanceof Number) {
                    arrayList2.add(Long.valueOf(((Number) t).longValue()));
                }
            }
            C08XD.LJIL(arrayList2);
            return ((Number) ListProtector.get(arrayList2, arrayList2.size() / 2)).longValue();
        }
        return 0L;
    }
}

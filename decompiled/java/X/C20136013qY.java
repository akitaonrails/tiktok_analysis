package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: X.13qY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20136013qY<T> {
    public final C1085650eMF LIZ = new C1085650eMF(10);
    public final C830530Wi3<T, ArrayList<T>> LIZIZ = new C830530Wi3<>();
    public final ArrayList<T> LIZJ = new ArrayList<>();
    public final HashSet<T> LIZLLL = new HashSet<>();

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (!hashSet.contains(t)) {
            hashSet.add(t);
            ArrayList<T> arrayList2 = this.LIZIZ.get(t);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    LIZ(ListProtector.get(arrayList2, i), arrayList, hashSet);
                }
            }
            hashSet.remove(t);
            arrayList.add(t);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }
}

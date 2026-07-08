package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0u8d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692250u8d {
    public static final C1692220u8a LIZ = new C1692220u8a("");

    public static final boolean LIZIZ(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }

    public static final List<C1692270u8f<? extends InterfaceC1692820u9Y>> LIZ(C1692220u8a c1692220u8a, int i, int i2, Function1<? super InterfaceC1692820u9Y, Boolean> function1) {
        List<C1692270u8f<? extends InterfaceC1692820u9Y>> list;
        if (i == i2 || (list = c1692220u8a.LL) == null) {
            return null;
        }
        if (i == 0 && i2 >= c1692220u8a.LLILLJJLI.length()) {
            if (function1 != null) {
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Object obj = ListProtector.get(list, i3);
                    if (function1.invoke(((C1692270u8f) obj).LIZ).booleanValue()) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            C1692270u8f c1692270u8f = (C1692270u8f) ListProtector.get(list, i4);
            if ((function1 == null || function1.invoke(c1692270u8f.LIZ).booleanValue()) && LIZIZ(i, i2, c1692270u8f.LIZIZ, c1692270u8f.LIZJ)) {
                arrayList2.add(new C1692270u8f(c1692270u8f.LIZ, C13LZ.LJ(c1692270u8f.LIZIZ, i, i2) - i, C13LZ.LJ(c1692270u8f.LIZJ, i, i2) - i, c1692270u8f.LIZLLL));
            }
        }
        return arrayList2;
    }
}

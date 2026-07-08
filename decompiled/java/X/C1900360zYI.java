package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0zYI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1900360zYI {
    public static final Boolean LIZ(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1900970zZH) {
            return Boolean.valueOf(((C1900970zZH) interfaceC1891350zJl).LL.isPriority);
        }
        if (interfaceC1891350zJl instanceof C1900990zZJ) {
            return Boolean.valueOf(((C1900990zZJ) interfaceC1891350zJl).LLILLL);
        }
        return null;
    }

    public static final void LIZIZ(List<InterfaceC1891350zJl> list) {
        int i = 0;
        for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
            if ((interfaceC1891350zJl instanceof C1900970zZH) && ((C1900970zZH) interfaceC1891350zJl).LL.isPriority) {
                if (i != -1) {
                    ListProtector.add(list, i, new C1273804ye(true));
                    int i2 = 0;
                    for (InterfaceC1891350zJl interfaceC1891350zJl2 : list) {
                        if ((interfaceC1891350zJl2 instanceof C1900970zZH) && !((C1900970zZH) interfaceC1891350zJl2).LL.isPriority) {
                            if (i2 != -1) {
                                ListProtector.add(list, i2, new C1273804ye(false));
                                return;
                            }
                            return;
                        }
                        i2++;
                    }
                    return;
                }
                return;
            }
            i++;
        }
    }
}

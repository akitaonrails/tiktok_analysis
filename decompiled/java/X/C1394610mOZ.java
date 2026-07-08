package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0mOZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1394610mOZ {
    public static <T> void LIZ(List<T> list, InterfaceC1394580mOW<? super T> interfaceC1394580mOW, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (interfaceC1394580mOW.apply((Object) ListProtector.get(list, size))) {
                ListProtector.remove(list, size);
            }
        }
        while (true) {
            i2--;
            if (i2 >= i) {
                ListProtector.remove(list, i2);
            } else {
                return;
            }
        }
    }
}

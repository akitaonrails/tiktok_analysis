package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0qp4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1564800qp4 {
    public static final int LIZ(InterfaceC1564820qp6 interfaceC1564820qp6) {
        List<C06XG> listLJII = interfaceC1564820qp6.LJII();
        int size = listLJII.size();
        int size2 = 0;
        for (int i = 0; i < size; i++) {
            size2 += ((C06XG) ListProtector.get(listLJII, i)).getSize();
        }
        return (size2 / listLJII.size()) + interfaceC1564820qp6.LJI();
    }
}
